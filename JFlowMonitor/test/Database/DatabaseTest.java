/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database;

import Network.PacketStub;
import Network.IPacket;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kuziki
 */
public class DatabaseTest {

    public DatabaseTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of savePacket method, of class Database.
     */
    @Test
    public void testSavePacket() {
        PacketStub[] p = new PacketStub[10];
        for(int i=0;i<10;i++)
        {
            p[i] = new PacketStub();
        }
        //Database instance = new Database();
        //instance.savePacket(p);
    }

    /**
     * Test of getConn method, of class Database.
     */
    @Test
    public void testGetConn() throws Exception {
    }

    /**
     * Test of Closedb method, of class Database.
     */
    @Test
    public void testClosedb() throws Exception {
    }

    /**
     * Test of checkDatetoDate method, of class Database.
     */
    @Test
    public void testCheckDatetoDate() throws Exception {
        Date from = new Date(211,4,5);
        Date to = new Date(211,4,7);
        Database instance = new Database();
        List result = instance.checkDatetoDate(from, to);
        assertNotNull(result);
        instance.Closedb();
    }

    /**
     * Test of CheckDate method, of class Database.
     */
    @Test
    public void testCheckDate() throws Exception {
        Date cdata = new Date(211,4,6);;
        Database instance = new Database();
        List result = instance.CheckDate(cdata);
        assertNotNull(result);
        instance.Closedb();
    }

}