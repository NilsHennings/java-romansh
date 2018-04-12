/*
 * =============================================================================
 * 
 * 
 * =============================================================================
 */
package com.romansh.text;

import java.text.DateFormatSymbols;

import com.romansh.constants.Locales;

public final class RomanshDateFormatSymbols extends DateFormatSymbols {
    
    private static final long serialVersionUID = 6772605910726027718L;

    private static final String[] ROMANSH_SHORT_WEEKDAYS = 
        {"", "gli", "ma", "me", "gie", "ve", "so", "du"};

    private static final String[] ROMANSH_WEEKDAYS = 
    	{"", "glindesdi", "mardi", "mesemna", "gievgia", "venderdi", "sonda", "dumengia"};
    
    public RomanshDateFormatSymbols() {
        super(Locales.ROMANSH);
        this.setShortWeekdays(ROMANSH_SHORT_WEEKDAYS);
        this.setWeekdays(ROMANSH_WEEKDAYS);
    }

}