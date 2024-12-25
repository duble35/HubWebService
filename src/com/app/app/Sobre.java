package com.app.app;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

public class Sobre {
    
    private static JFrame frm = new JFrame();
    
    public Sobre() {
        frm.setTitle("HubWebService - SOBRE");
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.setSize(330, 250);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
        
        JPanel rootPainel = new JPanel(new BorderLayout());
        rootPainel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Padding

        JTextArea txtSobre = new JTextArea();
        txtSobre.setEditable(false);
        txtSobre.setFocusable(false);
        txtSobre.setText("Informações sobre o Sistema de Comanda\n\n"
                + "Fabricante: Carlos Dambleerley Silva de Sousa\n"
                + "Ano do Projeto: 25 de dezembro de 2024\n"
                + "Última Atualização: 25 de dezembro de 2024\n"
                + "Versão do Software: Beta\n"
                + "Todos os direitos reservados ©2024\n"
                + "E-mail de Contato: hubwebservice22@gmail.com\n"
                + "Telefone: (91) 9 8465-6735");

        JScrollPane scrollPane = new JScrollPane(txtSobre);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        rootPainel.add(scrollPane, BorderLayout.CENTER);
        
        
        frm.add(rootPainel);
        
        frm.setVisible(true);
    }
}
