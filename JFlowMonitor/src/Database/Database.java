/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database;

import Network.IPacket;
import Network.Packet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.JDBC;
/**
 *
 * @author Kuziki
 */
public class Database implements IDatabaseProxy{
    public Database()
    {
        try {
            conn = getConn();
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void savePacket(List<IPacket> p)
    {
        try {
            Statement stat = conn.createStatement();
            for(int i=0 ; i<p.size() ; ++i)
            {
                Date rdate= p.get(i).getPacketRecvTime();
                int sip  = p.get(i).getSourceAddress();
                int dip  = p.get(i).getDestAddress();
                int sport = p.get(i).getSourcePort();
                int dport = p.get(i).getDestPort();
                int size = p.get(i).getPacketLength();
                int flag = p.get(i).getPacketFlag();
                boolean  UpOrDown = p.get(i).isUpload();
                String insertSql = "insert into Detail values(";
                insertSql += Long.toString(rdate.getTime());
                insertSql += ",";
                insertSql += Integer.toString(sip);
                insertSql += ",";
                insertSql += Integer.toString(dip);
                insertSql += ",";
                insertSql += Integer.toString(sport);
                insertSql += ",";
                insertSql += Integer.toString(dport);
                insertSql += ",";
                insertSql += Integer.toString(size);
                insertSql += ",";
                int t = ((UpOrDown) ? 1 : 0);
                insertSql += Integer.toString(t);
                insertSql += ",";
                insertSql += Integer.toString(flag);
                insertSql += ")";
                stat.addBatch(insertSql);
            }
            stat.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Packet> getPacket(Date from,Date to) throws SQLException
    {
        Statement stat = conn.createStatement();
        Long fd = from.getTime();
        Long td = to.getTime();
        String sqlQuery = "select * from detail where PRecvTime > ";
        sqlQuery += Long.toString(fd);
        sqlQuery += " and PRecvTime < ";
        sqlQuery += Long.toString(td);
        ResultSet rs = stat.executeQuery(sqlQuery);
        List< Packet > p = new ArrayList< Packet >();
        while(rs.next())
        {
            Packet pack = new Packet();
            Date d = new Date();
            d.setTime(rs.getLong(1));
            pack.RecvTime = d;
            pack.SIP = rs.getInt(2);
            pack.DIP = rs.getInt(3);
            pack.SPort = rs.getInt(4);
            pack.DPort = rs.getInt(5);
            pack.PackLen = rs.getInt(6);
            pack.IsUpdate = rs.getBoolean(7);
            pack.PacketFlag = rs.getInt(8);
            p.add(pack);
        }
        rs.close();
        return p;
    }
    public List<Packet> getPacket(Date cdate) throws SQLException
    {
        int year = cdate.getYear();
        int month = cdate.getMonth();
        int day = cdate.getDate();
        int tday = day+1;
        Date from  = new Date(year,month,day);
        Date to = new Date(year,month,tday);
        return getPacket(from, to);
    }
    private static String url="org.sqlite.JDBC";
    private static String dri="jdbc:sqlite:flow.sqlite";
    public static Connection getConn() throws Exception
    {
        Class.forName(url);
        Connection conn = DriverManager.getConnection(dri);
        return conn;
    }
    public void Closedb() throws SQLException
    {
        conn.close();
    }
    private static Connection conn;

    public List<Flow> getFlow(Date from, Date to) throws SQLException
    {
        List<Flow> sDate = new ArrayList<Flow>();
        Statement stat = conn.createStatement();
        int fromYear = from.getYear()+1900;
        int fromMonth = from.getMonth();
        int fromDay = from.getDate();
        String fromD = "'"+Integer.toString(fromYear) + "-"+Integer.toString(fromMonth) +"-"+Integer.toString(fromDay)+"'";
        int toYear = to.getYear()+1900;
        int toMonth = to.getMonth();
        int toDay = to.getDate();
        String toD = "'"+Integer.toString(toYear) + "-"+Integer.toString(toMonth) +"-"+Integer.toString(toDay)+"'";
        String sqlQuery = "select * from Simple where PDate >= " +fromD + " and PDate <= " + toD;
        ResultSet rs = stat.executeQuery(sqlQuery);
        while(rs.next())
        {
            Flow sp = new Flow();
            String ts = rs.getString(1);
            String[] ymd = ts.split("-");
            int yy = Integer.parseInt(ymd[0])-1900;
            int mm = Integer.parseInt(ymd[1]);
            int dd = Integer.parseInt(ymd[2]);
            sp.sDate = new Date(yy,mm,dd);
            sp.outerSize = rs.getInt(2);
            sp.innerSize = rs.getInt(3);
            sDate.add(sp);
        }
        return sDate;
    }

    public Flow getFlow(Date cdate) throws SQLException {
        return getFlow(cdate, cdate).get(0);
    }
}
