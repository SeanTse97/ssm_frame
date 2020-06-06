package edu.dgut.domain;

public class Account {
    private Integer aid;
    private String aname;
    private Float balance;

    public Account() {
        super();
    }

    public Account(Integer aid, String aname, Float balance) {
        this.aid = aid;
        this.aname = aname;
        this.balance = balance;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", balance=" + balance +
                '}';
    }
}
