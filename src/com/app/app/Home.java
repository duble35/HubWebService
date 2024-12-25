package com.app.app;

import javax.swing.JFrame;

public class Home {
	
	private static JFrame frm = new JFrame();
	
	static void init() {
		frm.setTitle("HubWebService - COMANDA");
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setSize(780,560);
		frm.setLocationRelativeTo(null);
		frm.setResizable(true);
		frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		init();
	}
	
}
