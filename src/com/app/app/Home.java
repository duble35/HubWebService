package com.app.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home {
	
	private static JFrame frm = new JFrame();
	private static JMenuBar navBar = new JMenuBar();
	
	static void init() {
		frm.setTitle("HubWebService - COMANDA");
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setSize(780,560);
		frm.setLocationRelativeTo(null);
		frm.setResizable(true);
		frm.setJMenuBar(navBar);
		frm.setVisible(true);
	}
	
	static void componentes() {
		JMenu arquivo = new JMenu("Arquivo");
		JMenuItem sobre = new JMenuItem("Sobre");
		JMenuItem sair = new JMenuItem("Sair");
		
		arquivo.add(sobre);
		arquivo.add(sair);
		
		JMenu configuracoes = new JMenu("Configurações");
		JMenuItem categoria = new JMenuItem("Categoria");
		
		configuracoes.add(categoria);
		
		//-----------------------Adicionando componentes ao menu---------------//
		
		navBar.add(arquivo);
		navBar.add(configuracoes);
		
		//-------------------------Ações do itens do menu---------------------//
		
		sobre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Sobre();
				
			}
		});
		
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sair();
			}
		});
		
	}
	
	static void sair() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		init();
		componentes();
	}
	
}
