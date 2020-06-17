/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoHead;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author J.RILEY
 */
public class cCustomer {
    
    // Data Members
    
    private String CustomerID;
    private String Firstname;
    private String Surname;
    private String Address;
    private String ProveOfIdentification;
    private String Deposit; 
    private String PhoneNo; 
    private String StateofResidence; 
    private String DownPayment;
   
    // Accessory Function
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getProveodID() {
        return ProveOfIdentification;
    }

    public void setProveodID(String ProveodID) {
        this.ProveOfIdentification = ProveodID;
    }

    public String getDeposit() {
        return Deposit;
    }

    public void setDeposit(String Deposit) {
        this.Deposit = Deposit;
    }
     
    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNoe) {
        this.PhoneNo = PhoneNo;
    }

    public String getStateofResidence() {
        return StateofResidence;
    }

    public void setStateofResidence(String StateofResidence) {
        this.StateofResidence = StateofResidence;
    }

    public String getDownPayment() {
        return DownPayment;
    }

    public void setDownPayment(String DownPayment) {
        this.DownPayment = DownPayment;
    }
    
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if  (JOptionPane.showConfirmDialog(frame,"Do you want to Exit. NOW!"," DON ROSS AUTOHEAD",
              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
}
