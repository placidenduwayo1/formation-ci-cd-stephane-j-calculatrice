package com.iut.as2021.metier;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class PrinterTest extends TestCase {
    private Printer printer;
    @Before
    public void setUp() {
        this.printer = new Printer("Canon","Printer");
    }

    @Test
    public void testGetNom() {
        assertEquals("Canon", printer.getNom());

    }

    @Test
    public void testGetType() {
        assertEquals("Printer", printer.getType());
    }
}