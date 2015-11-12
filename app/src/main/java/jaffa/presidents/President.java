package jaffa.presidents;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.util.Scanner;

/**
 * Created by libby on 10/22/2015.
 */
public class President implements Serializable{
    private int number;
    private String president;
    private int birthYear;
    private Integer deathYear;
    private String tookOffice;
    private String leftOffice;
    private String party;

    public String getPresident() {
        return president;
    }

    public int getNumber() {
        return number;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public Integer getDeathYear() {
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


