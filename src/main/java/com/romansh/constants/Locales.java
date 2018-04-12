package com.romansh.constants;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public abstract class Locales {

	public static final Locale ROMANSH = new Locale("rm");
	public static final Locale[] AVAILABLE_ARRAY = {ROMANSH};
	public static final List<Locale> AVAILABLE_LIST = (List<Locale>) Arrays.asList(AVAILABLE_ARRAY);
	
	private Locales() {
		// util class only
	}


}
