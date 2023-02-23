/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_base.connection.controllers;


import java.util.*;
import connection.DBConnection;
import java.sql.*;

/**
 *
 * @author marqu
 */
public class TreinoController extends DBConnection {
    
    public TreinoController(String dbName) {
        super(dbName);
    }
    
    public ResultSet getTreino() {
        ResultSet r = null;
        return r;
    }
}
