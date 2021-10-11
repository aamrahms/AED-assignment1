/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.Fleet;
import model.availableCars;

/**
 *
 * @author aamrah
 */
public class AdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminJPanel
     */
    
    public Fleet fleet;
    public ArrayList<Car> populate;
    public Car car,Updatecar, deletecar;
    public int unique,save,selectedRow;
    DefaultTableModel md;
    int rowCount;
    public AdminJPanel(Fleet a, int unique) {
        initComponents();
        this.fleet = a;
        this.unique=unique;
        populateTable(a);
    }
    
    public void populateTable(Fleet fleet){
        
        md=(DefaultTableModel) jTable1.getModel();
        md.setRowCount(0);
        populate=fleet.getAllCars();
        //int rowCount=populate.size();
        Object row[]= new Object[9];
        for(Car c : populate)
        {
            
            row[0]=c.getCompany();
            row[1]=c.getName();
            row[2]=c.getYear();
            row[3]=c.getSerialNumber();
            row[4]=c.getModelNumber();
            row[5]=c.getCity();
            row[6]=c.getCertificate();
            row[7]=c.getSeats();
            row[8]=c.getUniqueID();
            md.addRow(row);
                   
        }
    }
    public void populateTable(Car c){
       
        
        Object row[]= new Object[9];   
            row[0]=c.getCompany();
            row[1]=c.getName();
            row[2]=c.getYear();
            row[3]=c.getSerialNumber();
            row[4]=c.getModelNumber();
            row[5]=c.getCity();
            row[6]=c.getCertificate();
            row[7]=c.getSeats();
            row[8]=c.getUniqueID();
            md.addRow(row);      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tCompany = new javax.swing.JTextField();
        tYear = new javax.swing.JTextField();
        tSerial = new javax.swing.JTextField();
        tSeats = new javax.swing.JTextField();
        lblCompany = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblSerial = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCertificate = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblUber = new javax.swing.JLabel();
        jTableAdmin = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        tName = new javax.swing.JTextField();
        btnAddcar = new javax.swing.JButton();
        btnViewcar = new javax.swing.JButton();
        btnUpdatecar = new javax.swing.JButton();
        btnDeletecar = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        chckYes = new javax.swing.JCheckBox();
        lblAvailability = new javax.swing.JLabel();
        chckNo = new javax.swing.JCheckBox();
        lblModel = new javax.swing.JLabel();
        tModel = new javax.swing.JTextField();
        tCity = new javax.swing.JTextField();
        tCertificate = new javax.swing.JTextField();

        tCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCompanyActionPerformed(evt);
            }
        });

        tYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tYearActionPerformed(evt);
            }
        });

        tSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSerialActionPerformed(evt);
            }
        });

        lblCompany.setForeground(new java.awt.Color(255, 255, 255));
        lblCompany.setText("Company");

        lblYear.setForeground(new java.awt.Color(255, 255, 255));
        lblYear.setText("Year of Make");

        lblSerial.setForeground(new java.awt.Color(255, 255, 255));
        lblSerial.setText("Serial Number");

        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("City");

        lblCertificate.setForeground(new java.awt.Color(255, 255, 255));
        lblCertificate.setText("Certificate Issue Date(dd-mm-yyyy)");

        lblSeats.setForeground(new java.awt.Color(255, 255, 255));
        lblSeats.setText("Seats");

        lblUber.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        lblUber.setForeground(new java.awt.Color(255, 255, 255));
        lblUber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUber.setText("UBER");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company", "Name", "Year of Make", "Serial Number", "Model Number", "City", "Certificate Date", "Seats", "UniqueID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAdmin.setViewportView(jTable1);

        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");

        btnAddcar.setText("Add a Car");
        btnAddcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddcarActionPerformed(evt);
            }
        });

        btnViewcar.setText("View Car");
        btnViewcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewcarActionPerformed(evt);
            }
        });

        btnUpdatecar.setText("Update Car");
        btnUpdatecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatecarActionPerformed(evt);
            }
        });

        btnDeletecar.setText("Delete a Car");
        btnDeletecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletecarActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        chckYes.setForeground(new java.awt.Color(255, 255, 255));
        chckYes.setText("Yes");
        chckYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckYesActionPerformed(evt);
            }
        });

        lblAvailability.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailability.setText("Is the Car Available?");

        chckNo.setForeground(new java.awt.Color(255, 255, 255));
        chckNo.setText("No");
        chckNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckNoActionPerformed(evt);
            }
        });

        lblModel.setForeground(new java.awt.Color(255, 255, 255));
        lblModel.setText("Model Number");

        tCertificate.setText("01-01-2021");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblSerial, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                                                .addGap(199, 199, 199))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(205, 205, 205)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tCompany, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tSerial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAddcar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnViewcar)
                                        .addGap(19, 19, 19)
                                        .addComponent(btnUpdatecar)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnDeletecar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSeats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCertificate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(199, 199, 199)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                .addComponent(tCity)
                                                .addComponent(tSeats)
                                                .addComponent(tModel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(chckYes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(chckNo))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)))
                        .addGap(62, 62, 62))
                    .addComponent(jTableAdmin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(lblUber, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblUber, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTableAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddcar)
                    .addComponent(btnViewcar)
                    .addComponent(btnUpdatecar)
                    .addComponent(btnDeletecar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompany))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(tYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerial)
                    .addComponent(tSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailability)
                    .addComponent(chckYes)
                    .addComponent(chckNo))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCompanyActionPerformed

    private void tYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tYearActionPerformed

    private void tSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSerialActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tSerialActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        checkNotNull();
        if (save==1)
        {
            car = new Car(unique++);
            AddCar(car);
            fleet.addCar(car);
            populateTable(car);
            this.clearTextfields();
        }
        else
        {
            if(save==2)
            {
                UpdateCar(Updatecar);
                int uniqueID=Updatecar.getUniqueID();
                fleet.updateCar(Updatecar, uniqueID);
                populateTable(fleet);
                this.clearTextfields();
            }
        }
        
        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddcarActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        this.clearTextfields();
        save=1;
    }//GEN-LAST:event_btnAddcarActionPerformed
    private void clearTextfields() {
        tCity.setText(null);
        tName.setText(null);
        tCompany.setText(null);
        tSeats.setText(null);
        tSerial.setText(null);
        tYear.setText(null);
        tModel.setText(null);
        chckYes.setSelected(false);
        chckNo.setSelected(false);
        
    }
    private void chckYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckYesActionPerformed
        // TODO add your handling code here:
        if(chckYes.isSelected())
        {
            chckNo.setEnabled(false);
        }
        else
        {
            chckNo.setEnabled(true);

        }
    }//GEN-LAST:event_chckYesActionPerformed

    private void chckNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckNoActionPerformed
        // TODO add your handling code here:
        if(chckNo.isSelected())
        {
            chckYes.setEnabled(false);
        }
        else
        {
            chckYes.setEnabled(true);

        }
    }//GEN-LAST:event_chckNoActionPerformed

    private void btnViewcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewcarActionPerformed
        // TODO add your handling code here:
        selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row you want to view!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            car=populate.get(selectedRow);
            populateView(car);
            
        }
        
        
    }//GEN-LAST:event_btnViewcarActionPerformed

    private void btnUpdatecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatecarActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        save=2;
        selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row you want to view!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Updatecar=populate.get(selectedRow);
            populateView(Updatecar);
            populateTable(fleet);
              
        }
        
    }//GEN-LAST:event_btnUpdatecarActionPerformed

    private void btnDeletecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletecarActionPerformed
        // TODO add your handling code here:
        selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row you want to view!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            deletecar=populate.get(selectedRow);
            int uniqueID=deletecar.getUniqueID();
            fleet.removeCar(uniqueID);
            populateTable(fleet);
        }
    }//GEN-LAST:event_btnDeletecarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddcar;
    private javax.swing.JButton btnDeletecar;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdatecar;
    private javax.swing.JButton btnViewcar;
    private javax.swing.JCheckBox chckNo;
    private javax.swing.JCheckBox chckYes;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane jTableAdmin;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCertificate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerial;
    private javax.swing.JLabel lblUber;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField tCertificate;
    private javax.swing.JTextField tCity;
    private javax.swing.JTextField tCompany;
    private javax.swing.JTextField tModel;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tSeats;
    private javax.swing.JTextField tSerial;
    private javax.swing.JTextField tYear;
    // End of variables declaration//GEN-END:variables

    private void populateView(Car car) {
       tCertificate.setText(car.getCertificate());
       tName.setText(car.getName());
       tYear.setText(String.valueOf(car.getYear()));
       tSeats.setText(String.valueOf(car.getSeats()));
       tModel.setText(car.getModelNumber());
       tSerial.setText(String.valueOf(car.getSerialNumber()));
       tCompany.setText(car.getCompany());
       tCity.setText(car.getCity());
       if(car.getIsAvailable()==true)
       {
           chckYes.setSelected(true);
       }
       else
       {
           chckNo.setSelected(true);
       }
       /*
      
       car.setCity(tCity.getText());
       */
    }

    private void UpdateCar(Car Updatecar) {
        this.Updatecar=Updatecar;
        Updatecar.setCertificate(tCertificate.getText());
        Updatecar.setName(tName.getText());
        Updatecar.setYear(Integer.parseInt(tYear.getText()));
        Updatecar.setSeats(Integer.parseInt(tSeats.getText()));
        Updatecar.setModelNumber(tModel.getText());
        Updatecar.setSerialNumber(Double.parseDouble(tSerial.getText()));
        Updatecar.setCompany(tCompany.getText());
        Updatecar.setCity(tCity.getText());
            if(chckYes.isSelected())
            {
               Updatecar.setIsAvailable(true);
            }
            else 
            {
                if (chckNo.isSelected()) 
               {
                   Updatecar.setIsAvailable(false);
               }
               else
               {
                   JOptionPane.showMessageDialog(this, "Select if Car is available or not!");
               }
            }
    }
    public void AddCar(Car car){
        
            car.setCertificate(tCertificate.getText());
            car.setName(tName.getText());
            car.setYear(Integer.parseInt(tYear.getText()));
            car.setSeats(Integer.parseInt(tSeats.getText()));
            car.setModelNumber(tModel.getText());
            car.setSerialNumber(Double.parseDouble(tSerial.getText()));
            car.setCompany(tCompany.getText());
            car.setCity(tCity.getText());
            if(chckYes.isSelected())
            {
               car.setIsAvailable(true);
            }
            else 
            {
                if (chckNo.isSelected()) 
               {
                   car.setIsAvailable(false);
               }
               else
               {
                   JOptionPane.showMessageDialog(this, "Select if Car is available or not!");
               }
            }
    }

    private void checkNotNull() {
       
        if(tCertificate.getText().isBlank() || tName.getText().isBlank() || tYear.getText().isBlank() ||tSeats.getText().isBlank() || tModel.getText().isBlank() || tSerial.getText().isBlank() ||tCompany.getText().isBlank() || tCity.getText().isBlank()  )
        {
            JOptionPane.showMessageDialog(null, "Please enter every field!!", "Warning", JOptionPane.WARNING_MESSAGE);
        
        }
        else
        {
            return;
        }
        
         
        
        
        
        
    }
    
}
