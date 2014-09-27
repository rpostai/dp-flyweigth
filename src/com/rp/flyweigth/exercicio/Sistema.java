package com.rp.flyweigth.exercicio;

public class Sistema {
	public static void main(String[] args) {
		LinhaFlyweigthFactory factory = new LinhaFlyweigthFactory();
		LinhaFlyweigth l1 = factory.getLinha(Cor.VERMELHO);
		LinhaFlyweigth l2 = factory.getLinha(Cor.VERMELHO);
	}
}
