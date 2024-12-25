package com.app.main;

import java.util.Scanner;

import com.app.dao.ClasseDAO;
import com.app.dto.ClasseDTO;

public class ClasseCriar {
    
    public void inserirDados(){
        
        String NomeClasse = null;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        ClasseDTO objDTO = new ClasseDTO();
        ClasseDAO objDAO = new ClasseDAO();

        try {
            
            System.out.print("Digite o nome da classe que deseja criar: ");
            NomeClasse = in.nextLine();

            objDTO.setClasse(NomeClasse);
            objDAO.create(objDTO);

            System.out.println("Classe criada com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao tentar criar nova classe: "+e.getMessage());
        }

    }
}
