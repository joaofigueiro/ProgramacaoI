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
            throw new Exception("Arquivo de banco de não existe!");
        }
        Class.forName("org.sqlite.JDBC");
        this.dbConn = DriverManager.getConnection("jdbc:sqlite:" + this.dbName);
    }

    public void desconectar () throws IOException, SQLException {
        if (!this.dbConn.isClosed()) {
            this.dbConn.close();
        }
        System.out.println("fecho");
        
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

    public ResultSet carregarAluno() throws Exception {
        String sel = "SELECT nome, cidade FROM alunos";
        ResultSet rset = null;
        try {
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(sel);
        } catch (SQLException e) {
            throw new Exception("Erro: " + e.getMessage());
        }

        return rset;
    }
    
    public static void main(String[] args) throws Exception {
        DBConnection db = new DBConnection("C:\\Users\\marqu\\OneDrive\\Área de Trabalho\\Arquivos de Programação\\programacao_i\\TrabalhoFinal\\src\\data_base\\connection\\banco_de_dados");
            db.conectar();
            db.salvarAluno();
            db.desconectar();
    }

}
