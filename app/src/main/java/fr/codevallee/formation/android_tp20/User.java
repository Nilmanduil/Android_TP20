package fr.codevallee.formation.android_tp20;

import com.google.gson.Gson;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tgoudouneix on 18/10/2017.
 */

public class User {
    private String _id;
    private Integer index;
    private String name;
    private String about;
    private String picture;
    private Integer age;
    private String registered = null;
    private Date registeredDate = null;
    private String email;
    private String eyeColor;
    private String phone;
    private String address;
    private Double longitude = null;
    private Double latitude = null;
    private String balance;
    private String guid;
    private String company;
    private Boolean isActive;

    public User(String _id, Integer index, String name, String about, String picture, Integer age, String registered, String email, String eyeColor, String phone, String address, Double longitude, Double latitude, String balance, String guid, String company, Boolean isActive) throws ParseException {
        this._id = _id;
        this.index = index;
        this.name = name;
        this.about = about;
        this.picture = picture;
        this.age = age;
        this.registered = registered;
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        this.registeredDate = dateFormat.parse(registered);
        this.email = email;
        this.eyeColor = eyeColor;
        this.phone = phone;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.balance = balance;
        this.guid = guid;
        this.company = company;
        this.isActive = isActive;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id='" + _id + '\'' +
                ", index=" + index +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", picture='" + picture + '\'' +
                ", age=" + age +
                ", registered='" + registered + '\'' +
                ", registeredDate=" + registeredDate +
                ", email='" + email + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", balance='" + balance + '\'' +
                ", guid='" + guid + '\'' +
                ", company='" + company + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
