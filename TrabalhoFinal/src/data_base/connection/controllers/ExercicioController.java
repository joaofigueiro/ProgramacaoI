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
import java.util.ArrayList;

/**
 *
 * @author marqu
 */
public class ExercicioController extends DBConnection {
    
    public ExercicioController(String dbName) {
        super(dbName);
    }
    
    public void salvaExercicio(String exercicio, int numero) throws Exception {
        String insert = "INSERT INTO exercicios (nome_exercicio, codigo_treino) VALUES (?, ?)";
        PreparedStatement stmt;
         try {
            stmt = this.dbConn.prepareStatement(insert);
            stmt.setString(1, exercicio);            
            stmt.setInt(2, numero);
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
        String sel = "SELECT codigo_exercicio, nome_exercicio FROM exercicios WHERE codigo_treino IS NULL";
        ResultSet rset = null;
        try {
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(sel);
        } catch (SQLException e) {
            throw new Exception("Erro ao pegar dado: " + e.getMessage());
        }
        return rset;
    }
    
    public ResultSet getExerc(int codigoTreino) throws Exception {
        String sel = "SELECT nome_exercicio FROM exercicios "
                + "WHERE codigo_treino = " + codigoTreino;
        ResultSet rset = null;
        try {
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(sel);
            System.out.println(sel);
        } catch (SQLException e) {
            throw new Exception("Erro ao pegar dado: " + e.getMessage());
        }
        return rset;
    }
    
    
}
