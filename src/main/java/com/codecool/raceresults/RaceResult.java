package com.codecool.raceresults;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.parseInt;

class RaceResult {

    static String calculateRacerResults(String fileName){
        String[] racer = new String[]{"Schumacher", "Coultard", "Hakkinen"};

        File file = new File(fileName);
        String imported = null;

        HashMap<Integer, Integer> schumacher = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> coultard = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hakkinen = new HashMap<Integer, Integer>();

        if(file.canRead()){
            Scanner scanner = null;
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while(scanner.hasNextLine()){
                imported = scanner.nextLine();
                String[] temp = imported.split(",");

                schumacher.putIfAbsent(Integer.parseInt(temp[0]),Integer.parseInt(temp[3]));
                coultard.putIfAbsent(Integer.parseInt(temp[1]),Integer.parseInt(temp[3]));
                hakkinen.putIfAbsent(Integer.parseInt(temp[2]),Integer.parseInt(temp[3]));
            }

            scanner.close();

            String returnString = racer[0] + " => " + schumacher.get(Collections.min(schumacher.keySet())) + ", " + schumacher.get(Collections.max(schumacher.keySet())).toString() + " " +
                                 racer[1] + " => " + coultard.get(Collections.min(coultard.keySet())).toString() + ", " + coultard.get(Collections.max(coultard.keySet())).toString() + " " +
                                 racer[2] + " => " + hakkinen.get(Collections.min(hakkinen.keySet())).toString() + ", " + hakkinen.get(Collections.max(hakkinen.keySet())).toString();

            return returnString;
        }else{
            System.out.println("File not found!");
            return null;
        }
    }
}
