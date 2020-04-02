/*
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar um
 * saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer 
 * ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de 
 * saque da conta. Implemente a conta bancária
 * */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import model.entidades.Conta;
import model.excecao.ContaExcecao;

public class Programa {

	public static void main(String[] args)
	{
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os Dados da Conta#");
		
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Titular: ");
		String titular = sc.nextLine();
		
		System.out.print("Saldo Inicial: ");
		double  saldoInial = sc.nextDouble();
		
		System.out.print("Limite de Saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta cont = new Conta(numero, titular, saldoInial, limiteSaque);
		try {
		System.out.print("Incira o valor do saque: ");
		double valor = sc.nextDouble();
		
		cont.saque(valor);
		System.out.println("Saldo: " + String.format("%.2f", cont.getSaldo()));
		}catch(ContaExcecao erro){
			System.out.println("Erro:"+ erro.getMessage());
		}
		sc.close();
	}
}
