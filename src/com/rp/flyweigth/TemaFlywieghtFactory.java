package com.rp.flyweigth;

import java.util.HashMap;
import java.util.Map;

public class TemaFlywieghtFactory {

	private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = new HashMap<Class<? extends TemaFlyweight>, TemaFlyweight>();

	public static final Class<TemaEscola> ESCOLA = TemaEscola.class;
	public static final Class<TemaUniversidade> UNIVERSIDADE = TemaUniversidade.class;

	public static TemaFlyweight getTema(Class<? extends TemaFlyweight> clazz) {
		if (!temas.containsKey(clazz)) {
			try {
				temas.put(clazz, clazz.newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return temas.get(clazz);
	}

}
