/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;


import java.sql.Connection;
import java.io.File;
import java.io.IOException;
import java.sql.*;

/**
 *
 * @author marqu
 */
public class DBConnection {
    private String dbName;
    public Connection dbConn;

    public DBConnection(String dbName) {
       this.dbName = dbName; 
    }

    public void conectar() throws Exception {
        File f = new File(this.dbName);
        if (!f.exists()) {
            System.out.println(this.dbName);
            throw new Exception("Arquivo de banco de não existe!");
        }
        Class.forName("org.sqlite.JDBC");
        this.dbConn = DriverManager.getConnection("jdbc:sqlite:" + this.dbName);
    }

    public void desconectar () throws IOException, SQLException {
        if (!this.dbConn.isClosed()) {
            this.dbConn.close();
        }
        
    }
}
