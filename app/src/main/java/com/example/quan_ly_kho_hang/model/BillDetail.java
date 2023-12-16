package com.example.quan_ly_kho_hang.model;

public class BillDetail {
    // billDetail
    int id;
    int billID;
    String quantity;// so luong san pham
    String createdDate;

    public BillDetail() {
    }

    public BillDetail(int id, int billID, String quantity, String createdDate) {
        this.id = id;
        this.billID = billID;
        this.quantity = quantity;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    // create table (id int primary key autoincrement,billID integer,quantity text)
}
