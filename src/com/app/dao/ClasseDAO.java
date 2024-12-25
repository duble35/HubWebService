package com.app.dao;


import com.app.dto.ClasseDTO;
import com.app.models.CRUD;
import com.app.services.ConnectionDB;

import java.sql.*;

public class ClasseDAO implements CRUD<ClasseDTO> {

    private Connection conn = new ConnectionDB().GetDB();

    private PreparedStatement pstmt;
    private ResultSet rs = null;

    @Override
    public void create(ClasseDTO objDTO) {
        try {
            String sql = "insert into classe(descricao_classe) values(?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, objDTO.getClasse());
            pstmt.execute();
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println("Erro ao tentar salvar!");
        }
    }

    @Override
    public ResultSet reader() {
        try {
            String sql = "SELECT * FROM classe WHERE ativo_classe = 1";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return rs;
    }

    @Override
    public ResultSet reader(ClasseDTO objDTO) {
        
        try {
            String sql = "SELECT * FROM classe WHERE id_classe = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, objDTO.getId());
            rs = pstmt.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return rs;
    }

    @Override
    public void update(ClasseDTO objDTO) {
        try {
            String sql = "UPDATE classe SET descricao_classe = ? WHERE id_classe = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, objDTO.getClasse());
            pstmt.setInt(2, objDTO.getId());
            pstmt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(ClasseDTO objDTO) {
        try {
            String sql = "UPDATE classe SET ativo_classe = 0 WHERE id_classe = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, objDTO.getId());
            pstmt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
