package com.rp.flyweigth;

public class Sistema {

	public static void main(String[] args) {
		Slide s1 = new Slide(
				TemaFlywieghtFactory.getTema(TemaFlywieghtFactory.ESCOLA),
				"Titulo 1", "Texto 1");
		
		Slide s2 = new Slide(
				TemaFlywieghtFactory.getTema(TemaFlywieghtFactory.ESCOLA),
				"Titulo 2", "Texto 2");
		
		System.out.println(s1.getTema());
		System.out.println(s2.getTema());

	}

}
