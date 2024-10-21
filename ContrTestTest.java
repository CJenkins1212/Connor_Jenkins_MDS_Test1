package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ContrTestTest {

    @Test
    void printPeople() {
    }

    @Test
    void addManualTrue() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        String q = "AAAA";
        String w = "A+";
        int e = 42;
        float r = 42;
        float t = 42;
        float y = 42;
        light.add(q);
        light.add(w);
        light.add(e);
        light.add(r);
        light.add(t);
        light.add(y);

        C1.addManual();

        assertEquals(M1.People.get(0), light);
    }

    @Test
    void addManualFalse() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        String q = "AAAA";
        String w = "A+";
        int e = 42;
        float r = 42;
        float t = 42;
        float y = 43;
        light.add(q);
        light.add(w);
        light.add(e);
        light.add(r);
        light.add(t);
        light.add(y);

        C1.addManual();

        assertEquals(M1.People.get(0), light);
    }

    @Test
    void addFileTrue() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        String q = "Jerry Jersey";
        String w = "O+";
        int e = 22;
        float r = 44;
        float t = 77;
        float y = 222;
        light.add(q);
        light.add(w);
        light.add(e);
        light.add(r);
        light.add(t);
        light.add(y);

        C1.addFile();

        assertEquals(M1.People.get(6), light);
    }

    @Test
    void addFileFalse() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        String q = "Jerry Jersey";
        String w = "O+";
        int e = 22;
        float r = 44;
        float t = 77;
        float y = 222;
        light.add(q);
        light.add(w);
        light.add(e);
        light.add(r);
        light.add(t);
        light.add(y);

        C1.addFile();

        assertEquals(M1.People.get(7), light);
    }


    @Test
    void removePersonTrue() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        String q = "Jerry Jersey";
        String w = "O+";
        int e = 22;
        float r = 44;
        float t = 77;
        float y = 222;
        light.add(q);
        light.add(w);
        light.add(e);
        light.add(r);
        light.add(t);
        light.add(y);

        C1.addFile();

        C1.removePerson();

        assertNotEquals(M1.People.get(6), light);
    }

    @Test
    void removePersonFalse() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        String q = "Jerry Jersey";
        String w = "O+";
        int e = 22;
        float r = 44;
        float t = 77;
        float y = 222;
        light.add(q);
        light.add(w);
        light.add(e);
        light.add(r);
        light.add(t);
        light.add(y);

        C1.addFile();

        assertNotEquals(M1.People.get(6), light);
    }

    @Test
    void editPersonTrue() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        String q = "Jarry Jersy";
        String w = "AB-";
        String e = "23";
        String r = "45.0";
        String t = "78.0";
        String y = "223.0";
        light.add(q);
        light.add(w);
        light.add(e);
        light.add(r);
        light.add(t);
        light.add(y);

        C1.addFile();

        C1.editPerson();

        assertEquals(M1.People.get(15), light);
    }

    @Test
    void editPersonFalse() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        String q = "Jerry Jersey";
        String w = "O+";
        int e = 22;
        float r = 44;
        float t = 77;
        float y = 222;
        light.add(q);
        light.add(w);
        light.add(e);
        light.add(r);
        light.add(t);
        light.add(y);

        C1.addFile();

        C1.editPerson();

        assertEquals(M1.People.get(15), light);
    }

    @Test
    void getBMITrue() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();

        float total = (float) 222 / (77 * 77) *703;

        C1.addFile();

        C1.getBMI();

        assertEquals(C1.full, total);
    }

    @Test
    void getBMIFalse() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();

        float total = (float) 222 / (77 * 77) *702;

        C1.addFile();

        C1.getBMI();

        assertEquals(C1.full, total);
    }
}