package jaffa.presidents;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by libby on 10/22/2015.
 */
public class President {
    private int number;
    private String president;
    private int birthYear;
    private int deathYear;
    private String tookOffice;
    private String leftOffice;
    private String party;

    public String getPresident() {
        return president;
    }

    public int getNumber() {
        return number;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public String getTookOffice() {
        return tookOffice;
    }

    public String getLeftOffice() {
        return leftOffice;
    }

    public String getParty(){
        return party;
    }
}


