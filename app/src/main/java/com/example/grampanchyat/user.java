package com.example.grampanchyat;

/**
 * Created by NARAYAN on 11-02-2018.
 */

public class user {


    String fname1;
    String mname1;
    String lanme1;
    String  email1;
    String mobile1;
    String Password;
    String  hno1;
    String dob;
    public user()
    {

    }

    public user(String fname1, String mname1, String lanme1, String email1, String mobile1, String Password, String hno1, String dob) {

        this.fname1 = fname1;
        this.mname1 = mname1;
        this.lanme1 = lanme1;
        this.email1 = email1;
        this.mobile1 = mobile1;
        this.Password = Password;
        this.hno1 = hno1;
        this.dob = dob;
    }


    public String getFname1() {
        return fname1;
    }

    public String getMname1() {
        return mname1;
    }

    public String getLanme1() {
        return lanme1;
    }

    public String getEmail1() {
        return email1;
    }

    public String getMobile1() {
        return mobile1;
    }

    public String getPassword() {
        return Password;
    }

    public String getHno1() {
        return hno1;
    }

    public String getDob() {
        return dob;
    }



    public void setMname1(String mname1) {
        this.mname1 = mname1;
    }

    public void setLanme1(String lanme1) {
        this.lanme1 = lanme1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public void setPassword(String Password) {
        Password = Password;
    }

    public void setHno1(String hno1) {
        this.hno1 = hno1;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
