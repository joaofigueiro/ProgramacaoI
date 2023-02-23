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
    
    public ResultSet getTreino() throws Exception {
        String sel = "SELECT codigo_treino, codigo_aluno, codigo_exercicio, treino_nome, treino_series, treino_repeticao FROM exercicios WHERE codigo_treino IS NULL";
        ResultSet rset = null;
        
        try { 
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(sel);
        } catch (SQLException e) {
            throw new Exception("Erro ao pegar dado: " + e.getMessage());
        }
        
        return rset;
    }
    
       public ResultSet getTreinoAlunos() throws Exception {
        String sel = "SELECT a.nome, t.treino_nome, e.nome_exercicio, t.treino_series, t.treino_repeticao FROM treinos t JOIN alunos a ON t.codigo_aluno = a.codigo_aluno JOIN exercicios e ON t.codigo_treino = e.codigo_treino;";
        ResultSet rset = null;
        
        try { 
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(sel);
        } catch (SQLException e) {
            throw new Exception("Erro ao pegar dado: " + e.getMessage());
        }
        
        return rset;
    }
}
