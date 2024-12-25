package com.app.main;

import com.app.dao.ClasseDAO;
import com.app.dto.ClasseDTO;

public class ClasseAtualizar {
    
    private static ClasseDAO objDAO = new ClasseDAO();
    private static ClasseDTO objDTO = new ClasseDTO();

    public void atualizarClasse(int id, String classe){
        try {
            objDTO.setId(id);
            objDTO.setClasse(classe);
            objDAO.update(objDTO);
            System.out.println("Dados atualizados");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
