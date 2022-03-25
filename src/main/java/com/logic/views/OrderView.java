package com.logic.views;

import com.logic.dao.OrderDAO;
import com.logic.main.Functions;
import com.logic.model.Order;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;

public class OrderView implements View<JTable>{

    DefaultTableModel model;

    @Override
    public void addToDB(JPanel panel) {
        //Para agregar luego
    }

    @Override
    public void showQuery(JTable table) {
        OrderDAO oDAO = new OrderDAO();
        try {
            Object[] object;
            List<Order> orders = oDAO.getAll();
            model = (DefaultTableModel) table.getModel();
            for (Order o : orders) {
                object = o.valuesForTable();
                model.addRow(object);
            }
            table.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modify(JTable table) {
        //Para agregar luego
    }

    @Override
    public void delete(JTable table) {
        //Para agregar luego
    }
}
