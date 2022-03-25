/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logic.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author mrmango
 */
public class Supplier {
  private int idSupplier;
  private String ruc;
  private String company;
  private String address;
  private String phone;
  private String mail;
  private String status;

  public Supplier() {}

  public void setIdSupplier(int idSupplier) {
    this.idSupplier = idSupplier;
  }

  public void setRuc(String ruc) {
    this.ruc = ruc;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCompany() {
    return company;
  }

  public void getSupplierDB(ResultSet rs) throws SQLException {
    setIdSupplier(rs.getInt("idSupplier"));
    setRuc(rs.getString("ruc"));
    setCompany(rs.getString("company"));
    setAddress(rs.getString("address"));
    setPhone(rs.getString("phone"));
    setMail(rs.getString("mail"));
    setStatus(rs.getString("status"));
  }

  public Object[] valuesForTable() {
    return new Object[] {idSupplier, company, ruc, address, phone, mail, status};
  }

  public void createSupplier(List<Object> values) {
    setRuc((String) values.get(0));
    setCompany((String) values.get(1));
    setAddress((String) values.get(2));
    setPhone((String) values.get(3));
    setMail((String) values.get(4));
  }

  public Object[] valuesForDB() {
    return new Object[] {ruc, company, address, phone, mail};
  }

  public void updateSupplier(List<Object> values) {
    setIdSupplier((Integer) values.get(0));
    setCompany((String) values.get(1));
    setRuc((String) values.get(2));
    setAddress((String) values.get(3));
    setPhone((String) values.get(4));
    setMail((String) values.get(5));
    setStatus((String) values.get(6));
  }

  public Object[] valuesForUpdateDB() {
    return new Object[] {ruc, company, address, phone, mail, status, idSupplier};
  }
}
