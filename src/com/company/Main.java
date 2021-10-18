package com.company;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    //classes
        Passport ukPassport = new Passport(
                "1234","England", LocalDate.of(2025, 1, 13));

        Passport sgPassport = new Passport(
                "S8707772A", "Singapore", LocalDate.of(2024, 11, 19));

        Passport inPassport = new Passport(
                "S8912345F", "Malaysia", LocalDate.of(2024, 11, 19));

    }
    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
    }

