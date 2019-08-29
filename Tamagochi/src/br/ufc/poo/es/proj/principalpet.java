package br.ufc.poo.es.proj;
import br.ufc.poo.es.modelo.Pet.*;
import java.util.Scanner;

public class principalpet {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		petTamagochi pet = new petTamagochi();
		Scanner ler = new Scanner(System.in);
		
		pet.inicializar();
		
		int opcao;
		
		System.out.println("Bem vindo!");
		System.out.println("O que deseja realizar? (opções: jogar(1), dormir(2), comer(3), banhar(4)");
		opcao = ler.nextInt();
		
		if(opcao == 1) {
			pet.play();
		}else {
			if(opcao == 2) {
				pet.sleep();
			}else {
				if(opcao == 3) {
					pet.eat();
				}else {
					if(opcao == 4) {
						pet.clean();
					}else {
						System.out.println("Acao incorreta");
					}
				}
			}
		}
		
		if(pet.getEnergy() <= 0) {
			System.out.println("O pet faleceu :(");
			pet.end();
		}
		if(pet.getHungry() <= 0) {
			System.out.println("O pet faleceu :(");
			pet.end();
		}
		if(pet.getClean() <= 0) {
			System.out.println("O pet faleceu :(");
			pet.end();
		}
		
	}
}
