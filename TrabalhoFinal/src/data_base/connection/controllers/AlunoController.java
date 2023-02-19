/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_base.connection.controllers;

import connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marqu
 */
public class AlunoController extends DBConnection {

    public AlunoController(String dbName) {
        super(dbName);
    }
    
    
    public void salvarAluno() throws Exception {
        String insert = "INSERT INTO alunos (nome, email, cidade, altura, peso, data_nascimento) VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        try {
            stmt = this.dbConn.prepareStatement(insert);
            stmt.setString(1, "insert");
            stmt.setString(2, "insert");
            stmt.setString(3, "insert");
            stmt.setFloat(4, 56);
            stmt.setFloat(5, 70);
            stmt.setString(6, "insert");
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir dado: " + e.getMessage());
        }
    }
}
