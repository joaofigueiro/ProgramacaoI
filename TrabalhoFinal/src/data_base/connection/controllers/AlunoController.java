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
public class AlunoController extends DBConnection {

    public AlunoController(String dbName) {
        super(dbName);
    }
    
    public String formataDataIso(Calendar calendar) {
        String dataFinal; 
        int mes = calendar.get(Calendar.MONTH) + 1;
        dataFinal = calendar.get(Calendar.YEAR) + "-" 
                + mes + "-"
                + calendar.get(Calendar.DAY_OF_MONTH);
        return dataFinal;
    }
    
    /**
     * Faz o insert e update da tabela alunos
     * inserindo um novo cadastro
     * @param nome - sTring nome
     * @param email - string email
     * @param cidade - string cidade 
     * @param altura - float altura
     * @param peso - float peso
     * @param data - String com a data de nascimento
     * @throws Exception
     */
    public void salvarAluno(String nome, String email, String cidade, float altura, float peso, Calendar calendar ) throws Exception {
        String insert = "INSERT INTO alunos (nome, email, cidade, altura, peso, data_nascimento) VALUES(?, ?, ?, ?, ?, ?)";
        String dataFormatada = this.formataDataIso(calendar);
//        String dataFormatada = data.getYear();
        PreparedStatement stmt;
        try {
            stmt = this.dbConn.prepareStatement(insert);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, cidade);
            stmt.setFloat(4, altura);
            stmt.setFloat(5, peso);
            stmt.setString(6, dataFormatada);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir dado: " + e.getMessage());
        }
    }
    
    /**
     * Faz select em todos os alunos cadastrados no banco
     * @throws java.lang.Exception
     * @param - void
     * @return 
     */
    public ResultSet getAlunos()throws Exception {
        String sel = "SELECT codigo_aluno, nome, email, cidade, altura, peso, data_nascimento FROM alunos ORDER BY codigo_aluno";
        ResultSet rset = null;
        try {
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(sel);
        } catch (SQLException e) {
            throw new Exception("Erro ao pegar dado: " + e.getMessage());
        }
        return rset;
    }
    
     /**
     * Faz select em todos os alunos cadastrados no banco
     * @throws java.lang.Exception
     * @param int - alunoSelecionado no input
     * @return 
     */
    public ResultSet getTreinoAluno(int alunoSelecionado)throws Exception {
        String sel = "SELECT " +
            "t.codigo_treino," +
            "a.codigo_aluno," +
            "treino_nome " +
            "FROM treinos t " +
                "LEFT JOIN alunos a ON " +
                    "t.codigo_aluno = a.codigo_aluno " +
                    "WHERE a.codigo_aluno = " + alunoSelecionado +
                    " ORDER BY t.codigo_treino";
        ResultSet rset = null;
        try {
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(sel) != null ? stmt.executeQuery(sel) : null ;
        } catch (SQLException e) {
            throw new Exception("Erro ao pegar dado: " + e.getMessage());
        }
        return rset;
    }
}
