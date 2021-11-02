/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aamrah
 */
public class Person {
    private String personName;
    private int personId;
    private int age;
    private String address;
    private City city;
    private String phone;
    private String pincode;
    private Community community; 
    private House residence;
    private int patientId;
    private static int count=0;
    

    public Person(String personName, int age, String address, City city, String phone, String pincode, Community community) {
        this.personName = personName;
        this.age = age;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.pincode = pincode;
        this.community = community;
        this.residence=null;
        this.personId=count++;
    }
    public Person(){
        this.personId=count++;
    }
    
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

   
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    public void setCommunity(String community) {
        this.community = new Community(community,this.city);
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    
}
