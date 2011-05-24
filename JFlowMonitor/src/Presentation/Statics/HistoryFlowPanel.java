/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HistoryFlowPanel.java
 *
 * Created on 2011-5-24, 16:15:15
 */

package Presentation.Statics;
import Logic.History.FlowHistoryInfo;
import Logic.History.HistoryInfo;
import Logic.History.ProcessCompleteListener;
import Logic.History.ProcessThread;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Kuziki
 */
public class HistoryFlowPanel extends javax.swing.JPanel {
    private FlowHistoryInfo fhis;
    private TableModel tableModel;
    /** Creates new form HistoryFlowPanel */
    public HistoryFlowPanel() {
        String[] colName = {"Date","InnerFlow","OuterFlow"};
        tableModel = new DefaultTableModel(colName, 0);
        initComponents();
//        TableModel tableModel =HistoryTable.getModel();
//        HistoryTable.setModel(tableModel);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FromYearLbl = new javax.swing.JTextField();
        FromMonthLbl = new javax.swing.JTextField();
        FromDayLbl = new javax.swing.JTextField();
        ToYearLbl = new javax.swing.JTextField();
        ToMonthLbl = new javax.swing.JTextField();
        ToDayLbl = new javax.swing.JTextField();
        CheckBtn = new javax.swing.JButton();
        ErrorLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HistoryTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("FromDate:");

        jLabel2.setText("ToDate:");

        FromYearLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromYearLblActionPerformed(evt);
            }
        });

        FromMonthLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromMonthLblActionPerformed(evt);
            }
        });

        FromDayLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromDayLblActionPerformed(evt);
            }
        });

        ToYearLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToYearLblActionPerformed(evt);
            }
        });

        ToMonthLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToMonthLblActionPerformed(evt);
            }
        });

        ToDayLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToDayLblActionPerformed(evt);
            }
        });

        CheckBtn.setText("Check");
        CheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBtnActionPerformed(evt);
            }
        });

        HistoryTable.setModel(this.tableModel);
        jScrollPane2.setViewportView(HistoryTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FromYearLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FromMonthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ToYearLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ToMonthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ToDayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FromDayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ErrorLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CheckBtn)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FromYearLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromMonthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromDayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ToYearLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToMonthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToDayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FromYearLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromYearLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromYearLblActionPerformed

    private void FromMonthLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromMonthLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromMonthLblActionPerformed

    private void FromDayLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromDayLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromDayLblActionPerformed

    private void ToYearLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToYearLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToYearLblActionPerformed

    private void ToMonthLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToMonthLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToMonthLblActionPerformed

    private void ToDayLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToDayLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToDayLblActionPerformed

    private void CheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBtnActionPerformed
        String fyear,fmonth,fday,tyear,tmonth,tday;
        fyear = FromYearLbl.getText();
        fmonth = FromMonthLbl.getText();
        fday = FromDayLbl.getText();
        tyear = ToYearLbl.getText();
        tmonth = ToMonthLbl.getText();
        tday = ToDayLbl.getText();
        if(fyear.isEmpty() || fmonth.isEmpty() || fday.isEmpty() || tyear.isEmpty() || tmonth.isEmpty() || tday.isEmpty())
        {
            ErrorLbl.setText("Error FromDate or ToDate");
            return;
        }
        ErrorLbl.setText("");
        int fy,fm,fd,ty,tm,td;
        fy = Integer.parseInt(fyear);
        fy -= 1900;
        fm = Integer.parseInt(fmonth);
        fm--;
        fd = Integer.parseInt(fday);
        ty = Integer.parseInt(tyear);
        ty -= 1900;
        tm = Integer.parseInt(tmonth);
        tm--;
        td = Integer.parseInt(tday);
        Date fdate = new Date(fy,fm,fd);
        Date tdate = new Date(ty,tm,td);
        fhis = new FlowHistoryInfo(fdate,tdate);
        ProcessThread pt = new ProcessThread(new ProcessCompleteListener() {
            public void onProcessComplete(HistoryInfo info) {
                tableshow();
            }
        }, fhis);
        pt.start();
    }//GEN-LAST:event_CheckBtnActionPerformed
    private void tableshow()
    {

        int rowNum = this.fhis.Data.size();
        TableModel model =HistoryTable.getModel();
        model = new DefaultTableModel(rowNum+1,3);
        model.setValueAt("5-10", 0, 0);
        HistoryTable.setModel(tableModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckBtn;
    private javax.swing.JLabel ErrorLbl;
    private javax.swing.JTextField FromDayLbl;
    private javax.swing.JTextField FromMonthLbl;
    private javax.swing.JTextField FromYearLbl;
    private javax.swing.JTable HistoryTable;
    private javax.swing.JTextField ToDayLbl;
    private javax.swing.JTextField ToMonthLbl;
    private javax.swing.JTextField ToYearLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}