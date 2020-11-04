package application;

import entities.Conta;
import entities.ContaEmpresarial;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new Conta(12345,"Alan",1200.90);
		
		ContaEmpresarial ce = new ContaEmpresarial(1233,"Júlio",2500.00,100000.00);
		
		ce.emprestimo(20000);
		System.out.println(ce.toString());

	}

}
