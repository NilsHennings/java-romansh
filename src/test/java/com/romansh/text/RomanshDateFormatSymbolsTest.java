package com.romansh.text;

import java.util.Calendar;

import org.junit.Test;

import com.romansh.text.RomanshDateFormatSymbols;

import junit.framework.TestCase;

public class RomanshDateFormatSymbolsTest extends TestCase {

    private RomanshDateFormatSymbols dateFormatSymbols;

    public RomanshDateFormatSymbolsTest(final String name) {
        super(name);
    }
    
    @Override
    protected void setUp() throws Exception {
        this.dateFormatSymbols = new RomanshDateFormatSymbols();
    }
    
    @Test
    public void testWeekdays() throws Exception {
        assertEquals("glindesdi", this.dateFormatSymbols.getWeekdays()[Calendar.SUNDAY]);
        assertEquals("mardi", this.dateFormatSymbols.getWeekdays()[Calendar.MONDAY]);
        assertEquals("mesemna", this.dateFormatSymbols.getWeekdays()[Calendar.TUESDAY]);
        assertEquals("gievgia", this.dateFormatSymbols.getWeekdays()[Calendar.WEDNESDAY]);
        assertEquals("venderdi", this.dateFormatSymbols.getWeekdays()[Calendar.THURSDAY]);
        assertEquals("sonda", this.dateFormatSymbols.getWeekdays()[Calendar.FRIDAY]);
        assertEquals("dumengia", this.dateFormatSymbols.getWeekdays()[Calendar.SATURDAY]);
    }
    
    @Test
    public void testWeekdaysShort() throws Exception {
        assertEquals("gli", this.dateFormatSymbols.getShortWeekdays()[Calendar.SUNDAY]);
        assertEquals("ma", this.dateFormatSymbols.getShortWeekdays()[Calendar.MONDAY]);
        assertEquals("me", this.dateFormatSymbols.getShortWeekdays()[Calendar.TUESDAY]);
        assertEquals("gie", this.dateFormatSymbols.getShortWeekdays()[Calendar.WEDNESDAY]);
        assertEquals("ve", this.dateFormatSymbols.getShortWeekdays()[Calendar.THURSDAY]);
        assertEquals("so", this.dateFormatSymbols.getShortWeekdays()[Calendar.FRIDAY]);
        assertEquals("du", this.dateFormatSymbols.getShortWeekdays()[Calendar.SATURDAY]);
    }

}