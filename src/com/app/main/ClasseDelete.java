package com.app.main;

import com.app.dao.ClasseDAO;
import com.app.dto.ClasseDTO;

public class ClasseDelete {
    public void deletar(int id){
        ClasseDAO objDAO = new ClasseDAO();
        ClasseDTO objDTO = new ClasseDTO();
        try {
            objDTO.setId(id);
            objDAO.delete(objDTO);
            System.out.println("Sucesso ao apagar o dado.");
        } catch (Exception e) {
            System.out.println("Não foi possível deletar este dado. "+e.getMessage());
        }
    }
}
