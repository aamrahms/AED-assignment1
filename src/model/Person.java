/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;
import java.io.File;
import java.util.Date;
import java.lang.String;
import javax.swing.JOptionPane;

/**
 *
 * @author aamrah
 */
public class Person {
    
    
    String Name; //done
    double latitude;
    double longitude;
    long Telephone; //done
    long FAX;//DONE
    String email;//done
    String unique;//done
    String photo;//done
    String biometric;
    int ssn;//done
    long medical;//done
    long health;//done
    long bank;//done
    String licenseNo;//done
    String licensePlate;//done
    String device;//done
    String linkedin;//done
    String ip;//done
    short date;
    short month;
    short year;
    String bio;
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    

    public long getTelephone() {
        return Telephone;
    }

    public void setTelephone(long Telephone) {
        this.Telephone = Telephone;
    }

    public long getFAX() {
        return FAX;
    }

    public void setFAX(long FAX) {
        this.FAX = FAX;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getDate() {
        return date;
    }

    public void setDate(short date) {
        this.date = date;
    }

    public short getMonth() {
        return month;
    }

    public void setMonth(short month) {
        this.month = month;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public long getBank() {
        return bank;
    }

    public void setBank(long bank) {
        this.bank = bank;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getBiometric() {
        return biometric;
    }

    public void setBiometric(String biometric) {
        this.biometric = biometric;
    }

    public long getMedical() {
        return medical;
    }

    public void setMedical(long medical) {
        this.medical = medical;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }    

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    
    
}
    
