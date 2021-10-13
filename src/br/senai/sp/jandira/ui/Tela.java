package br.senai.sp.jandira.ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.bind.Marshaller.Listener;

public class Tela {
	
	
	public void criarTela() {
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(600, 800);
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);
		
		
		
		// Criando label
		
		JLabel lblIdade = new JLabel();
		lblIdade.setText("Qual a sua idade?");
		lblIdade.setBounds(20, 10, 110, 30);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setText("Você é menor de idade");
		lblResultado.setBounds(20, 90, 177, 30);
		
		
		
		// Criando TextField
		
		JTextField txtIdade = new JTextField();
		txtIdade.setText("");
		txtIdade.setBounds(20, 45, 110, 30);
		
		
		
		// Criando Button
		JButton btnVerificar = new JButton();
		btnVerificar.setText("Verificar idade");
		btnVerificar.setBounds(140, 45, 130, 30);
	
		// colocar Label na tela
		telaImc.getContentPane().add(lblIdade);
		telaImc.getContentPane().add(btnVerificar);
		telaImc.getContentPane().add(txtIdade);
		telaImc.getContentPane().add(lblResultado);
		
		
		telaImc.setVisible(true);
		
		// definir ouvinte de click do mouse
		//txtIdade.addMouseListener(new MouseListener());
		
		// definir ouvinte 
		txtIdade.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
