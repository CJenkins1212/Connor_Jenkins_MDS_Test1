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
        M1.Tnam = "AAAA";
        M1.Ttyp = "A+";
        M1.Tage = 42;
        M1.Tpre = 42;
        M1.Thei = 42;
        M1.Twei = 42;
        light.add(M1.Tnam);
        light.add(M1.Ttyp);
        light.add(M1.Tage);
        light.add(M1.Tpre);
        light.add(M1.Thei);
        light.add(M1.Twei);

        C1.addManual();

        assertEquals(M1.People.get(0), light);
    }

    @Test
    void addManualFalse() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        M1.Tnam = "AAAA";
        M1.Ttyp = "A+";
        M1.Tage = 42;
        M1.Tpre = 42;
        M1.Thei = 42;
        M1.Twei = 42;
        light.add(M1.Tnam);
        light.add(M1.Ttyp);
        light.add(43);
        light.add(M1.Tpre);
        light.add(M1.Thei);
        light.add(M1.Twei);

        C1.addManual();

        assertEquals(M1.People.get(0), light);
    }

    @Test
    void addFileTrue() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();
        List<Object> light = new ArrayList<>();
        M1.Tfile = "Patients.txt";
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
        M1.Tfile = "Patients.txt";
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
        M1.Tfile = "Patients.txt";
        M1.Tnam = "Jerry Jersey";
        M1.Ttyp = "O+";
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
        M1.Tfile = "Patients.txt";
        M1.Tnam = "Jerry Jersey";
        M1.Ttyp = "O+";
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
        M1.Tfile = "Patients.txt";
        M1.TTnam = "Jerry Jersey";
        M1.TTtyp = "O+";
        M1.Tnams = "Jarry Jersy";
        M1.Ttyps = "AB-";
        M1.Tages = "23";
        M1.Tpres = "45.0";
        M1.Theis = "78.0";
        M1.Tweis = "223.0";
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
        M1.Tfile = "Patients.txt";
        M1.TTnam = "Jerry Jersey";
        M1.TTtyp = "O+";
        M1.Tnams = "Jarry Jersy";
        M1.Ttyps = "AB-";
        M1.Tages = "23";
        M1.Tpres = "45.0";
        M1.Theis = "78.0";
        M1.Tweis = "223.0";
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

        M1.Tfile = "Patients.txt";

        M1.Tnam = "Jerry Jersey";
        M1.Ttyp = "O+";

        float total = (float) 222 / (77 * 77) *703;

        C1.addFile();

        C1.getBMI();

        assertEquals(C1.BMI, total);
    }

    @Test
    void getBMIFalse() {
        var C1 = new ContrTest();
        var M1 = new ModelTest();

        M1.Tfile = "Patients.txt";

        M1.Tnam = "Jerry Jersey";
        M1.Ttyp = "O+";

        float total = (float) 222 / (77 * 77) *702;

        C1.addFile();

        C1.getBMI();

        assertEquals(C1.BMI, total);
    }
}
