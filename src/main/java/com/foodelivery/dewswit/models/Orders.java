package com.foodelivery.dewswit.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long Id;

    private String  Payment, Sum, Client, Status, Address, Comment;
    private  int Number, Date;

    public Orders(Long id, String payment, String sum, String client, String status, String address, String comment, int number, int date) {
        Id = id;
        Payment = payment;
        Sum = sum;
        Client = client;
        Status = status;
        Address = address;
        Comment = comment;
        Number = number;
        Date = date;
    }

    public Orders() {

    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPayment() {
        return Payment;
    }

    public void setPayment(String payment) {
        Payment = payment;
    }

    public String getSum() {
        return Sum;
    }

    public void setSum(String sum) {
        Sum = sum;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }


}

