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
        assertEquals("glindesdi", this.dateFormatSymbols.getWeekdays()[Calendar.MONDAY]);
        assertEquals("mardi", this.dateFormatSymbols.getWeekdays()[Calendar.TUESDAY]);
        assertEquals("mesemna", this.dateFormatSymbols.getWeekdays()[Calendar.WEDNESDAY]);
        assertEquals("gievgia", this.dateFormatSymbols.getWeekdays()[Calendar.THURSDAY]);
        assertEquals("venderdi", this.dateFormatSymbols.getWeekdays()[Calendar.FRIDAY]);
        assertEquals("sonda", this.dateFormatSymbols.getWeekdays()[Calendar.SATURDAY]);
        assertEquals("dumengia", this.dateFormatSymbols.getWeekdays()[Calendar.SUNDAY]);
    }
    
    @Test
    public void testWeekdaysShort() throws Exception {
        assertEquals("gli", this.dateFormatSymbols.getShortWeekdays()[Calendar.MONDAY]);
        assertEquals("ma", this.dateFormatSymbols.getShortWeekdays()[Calendar.TUESDAY]);
        assertEquals("me", this.dateFormatSymbols.getShortWeekdays()[Calendar.WEDNESDAY]);
        assertEquals("gie", this.dateFormatSymbols.getShortWeekdays()[Calendar.THURSDAY]);
        assertEquals("ve", this.dateFormatSymbols.getShortWeekdays()[Calendar.FRIDAY]);
        assertEquals("so", this.dateFormatSymbols.getShortWeekdays()[Calendar.SATURDAY]);
        assertEquals("du", this.dateFormatSymbols.getShortWeekdays()[Calendar.SUNDAY]);
    }

}