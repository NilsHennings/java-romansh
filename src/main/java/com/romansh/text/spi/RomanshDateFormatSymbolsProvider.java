/*
 * =============================================================================
 * 
 * 
 * =============================================================================
 */
package com.romansh.text.spi;

import java.text.DateFormatSymbols;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Arrays;
import java.util.Locale;

import com.romansh.constants.Locales;
import com.romansh.text.RomanshDateFormatSymbols;


public final class RomanshDateFormatSymbolsProvider extends DateFormatSymbolsProvider {
    
    public RomanshDateFormatSymbolsProvider() {
        super();
    }
    
    

    @Override
    public DateFormatSymbols getInstance(final Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.AVAILABLE_LIST.contains(locale)){
            return new RomanshDateFormatSymbols();
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
        		"is not one of the supported locales (" +  Arrays.asList(Locales.AVAILABLE_ARRAY) + ")");
    }

    @Override
    public Locale[] getAvailableLocales() {
        return Locales.AVAILABLE_ARRAY;
    }

}