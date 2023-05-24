package br.senai.jandira.sp;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altura, peso, imc1;
		String nome, strAltura, strPeso;

		
		JOptionPane.showMessageDialog(null, "Olá, bem vindo a calculadora de Imc! ");
		
		nome = JOptionPane.showInputDialog("Infome o seu nome: ");
		
		strAltura = JOptionPane.showInputDialog("Insira a sua altura em metros: ");
		altura = Double.parseDouble(strAltura);
		
		
		strPeso = JOptionPane.showInputDialog("Agora insira o seu peso:  ");
		peso = Double.parseDouble(strPeso);
		

		imc1 = peso / (altura * altura);
		
		if(imc1 < 18.5) {
			JOptionPane.showMessageDialog(null, "Olá, " + nome + " seu imc é " + imc1 + "e está classificado como Abaixo do peso normal.");
		} else if (imc1 >= 18.5 && imc1 <= 24.9) {
			JOptionPane.showMessageDialog(null, "Olá, " + nome + " seu imc é " + imc1 + "e está classificado como Normal.");
			
		} else if (imc1 >= 25.0 && imc1 <= 29.9) {
			JOptionPane.showMessageDialog(null,"Olá, " + nome + " seu imc é " + imc1 + "e está classificado como Sobrepeso.");
		} else if (imc1 >= 30.0 && imc1 <= 34.9) {
			JOptionPane.showMessageDialog(null, "Olá, " + nome + " seu imc é " + imc1 + "e está classificado como Obesidade I.");
			
		} else if(imc1 >= 35.0 && imc1 <= 39.9) {
			JOptionPane.showMessageDialog(null, "Olá, " + nome + " seu imc é " + imc1 + "e está classificado como Obesidade II.");
			
		} else if (imc1 >= 40.0) {
			JOptionPane.showMessageDialog(null, "Olá, " + nome + " seu imc é " + imc1 + "e está classificado como Obesidade III.");
			
		}
		
		
		
		
		
	}

}
