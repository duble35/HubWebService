package com.app.main;

import java.sql.ResultSet;

import com.app.dao.ClasseDAO;
import com.app.dto.ClasseDTO;

public class ClasseListar {

    private static ResultSet rs;
    private static ClasseDAO objDAO = new ClasseDAO();
    private static ClasseDTO objDTO = new ClasseDTO();

    public ResultSet listarClasse(){
    
        try {
            
            rs = objDAO.reader();
            while (rs.next()) {
                System.out.println(rs.getInt("id_classe")+" - "+rs.getString("descricao_classe"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao tentar listar as classes cadastradas no banco de dados: "+e.getMessage());
        }

        return null;
    }

    public ResultSet listarClasse(int id){
    
        try {
            objDTO.setId(id);
            rs = objDAO.reader(objDTO);       
            while (rs.next()) {
                System.out.println(rs.getInt("id_classe")+" - "+rs.getString("descricao_classe"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao tentar listar as classes cadastradas no banco de dados: "+e.getMessage());
        }

        return null;
    }
}
