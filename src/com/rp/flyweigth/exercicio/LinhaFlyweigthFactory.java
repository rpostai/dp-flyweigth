package com.rp.flyweigth.exercicio;

import java.util.ArrayList;
import java.util.List;

public class LinhaFlyweigthFactory {
	private List<LinhaFlyweigth> cache;

	public LinhaFlyweigthFactory() {
		cache = new ArrayList<LinhaFlyweigth>();
	}

	public LinhaFlyweigth getLinha(Cor c) {
		for (LinhaFlyweigth linha : cache) {
			if (linha.getCor().equals(c)) {
				return linha;
			}
		}
		LinhaFlyweigth line = new Linha(c);
		cache.add(line);
		return line;
	}
}
