/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_base.connection.controllers;

import connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author marqu
 */
public class ExercicioController extends DBConnection {
    
    public ExercicioController(String dbName) {
        super(dbName);
    }
    
    public void salvaExercicio(String exercicio) throws Exception {
        String insert = "INSERT INTO exercicios (nome_exercicio) VALUES (?)";
        PreparedStatement stmt;
         try {
            stmt = this.dbConn.prepareStatement(insert);
            stmt.setString(1, exercicio);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir dado: " + e.getMessage());
        }
    }
    
    /**
     * Faz select em todos os exerc cadastrados no banco
     * @throws java.lang.Exception
     * @param - void
     * @return 
     */
    public ResultSet getExerc() throws Exception {
        String sel = "SELECT nome_exercicio FROM exercicios";
        ResultSet rset = null;
        try {
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(sel);
        } catch (SQLException e) {
            throw new Exception("Erro ao pegar dado: " + e.getMessage());
        }
        System.out.println(rset.getString("nome_exercicio"));
        return rset;
    }
    
}
