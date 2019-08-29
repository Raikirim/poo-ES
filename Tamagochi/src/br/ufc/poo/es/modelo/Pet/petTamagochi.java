package br.ufc.poo.es.modelo.Pet;

public class petTamagochi {
	
	private
		int energyMax, hungryMax, cleanMax;
		int energy, hungry, clean;
		int diamonds;
		int age;
		boolean alive;
		
		void setEnergy(int value) {
			this.energy = value;
		}
		void setHungry(int value) {
			this.hungry = value;
		}
		void setClean(int value) {
			this.clean = value;
		}
		
	public
		int getClean() {
			return clean;
		}
		public int getHungry() {
			return hungry;
		}
		public int getEnergy() {
			return energy;
		}
		void setEnergyMax() {
			this.energyMax = 20;
		}
		int getEnergyMax() {
			return energyMax;
		}
		void setCleanMax() {
			this.cleanMax = 15;
		}
		int getCleanMax() {
			return cleanMax;
		}
		void setHungryMax() {
			this.hungryMax = 10;
		}
		int getHungryMax() {
			return hungryMax;
		}
		
		public void end(){
			System.out.println("Quantidade de energia: "+energy);
			System.out.println("Quantidade de fome: "+hungry);
			System.out.println("Quantidade de limpeza: "+clean);
			System.out.println("Quantidade de diamantes: "+diamonds);
			System.out.println("Idade do pet: "+age);
		}
		
		public void inicializar() {
			this.energy = energyMax;
			this.hungry = hungryMax;
			this.clean = cleanMax;
			this.age = 0;
			this.diamonds = 0;
		}
		
		public void play() {
			this.energy = energy-2;
			this.hungry = hungry-1;
			this.clean = clean-3;
			this.diamonds = diamonds+1;
			this.age = age+1;
		}
		public void eat() {
			this.energy = energy-1;
			this.hungry = hungry+4;
			this.clean = clean-2;
			this.age = age+1;
		}
		public void clean() {
			this.energy = energy-3;
			this.hungry = hungry-1;
			this.clean = cleanMax;
			this.age = age+2;
		}
		public void sleep() {
			int cresce = 0;
			for(int qtd = 0; qtd < energyMax; qtd++) {
				if(energy == qtd) {
					cresce = qtd;
				}
			}
			this.age = age + cresce;
			this.energy = energyMax;
		}
		
		
		
		
	
}
