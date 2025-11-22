package Tiles;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TileManager {

    ArrayList<Tile> resources;
    ArrayList<Tile> pois;
    ArrayList<Tile> life;
    ArrayList<Tile> hazards;
    ArrayList<Tile> currents;
    ArrayList<Tile> corals;
    ArrayList<Tile> cells;

    public TileManager(){

        //load all of the data from csv's into array's
        loadResources();
        //dosen't work rn
        //loadPois();
//        loadLife();
        loadCells();
        loadCorals();

    }

    public void loadResources(){
        resources = new ArrayList<>();
        try {
            //Scanner sc = Main.sc;
            Scanner sc = new Scanner(new File("./resources.csv"));
            sc.next();

            //size of csv file
            for(int i = 0; i < 227; i++){
                String[] line = sc.next().split(",");
                System.out.println(Arrays.toString(line));
                //9-
                Tile newTile = new Tile(Integer.parseInt(line[0]), Integer.parseInt(line[1]),
                        line[2], line[3], Double.parseDouble(line[4]), Double.parseDouble(line[5]),
                        Double.parseDouble(line[6]),
                        Double.parseDouble(line[7]), Integer.parseInt(line[8]));
                resources.add(newTile);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
//    public void loadPois(){
//        pois = new ArrayList<>();
//        System.out.println("Loading Poi's");
//        try{
//            Scanner sc = new Scanner(new File("./poi.csv"));
//            sc.next();
//            for(int i = 0; i < 52; i++){
//                String[] line = sc.next().split(",");
//                System.out.println(Arrays.toString(line));
//                //5
//                Tile newTile = new Tile(Integer.parseInt(line[1]), Integer.parseInt(line[2]), line[0],
//                        line[3], line[4]);
//
//                pois.add(newTile);
//            }
//        }catch(Exception e){e.printStackTrace();}
//    }
//    public void loadLife(){
//        life = new ArrayList<>();
//
//        try{
//            Scanner sc = new Scanner(new File("life.csv"));
//            sc.next();
//
//            for(int i = 0; i < 335; i++){
//                String[] line0 = sc.next().split("\"");
//                System.out.println("    " + line0[0]);
//                String[] line = line0[0].split(",");
//                System.out.println(Arrays.toString(line));
//                Tile newTile = new Tile(Integer.parseInt(line[0]), Integer.parseInt(line[1]), line[2],
//                        Integer.parseInt(line[3]), Double.parseDouble(line[4]), Integer.parseInt(line[5]),
//                        line[6], Integer.parseInt(line[7]));
//            }
//        }catch(Exception e){e.printStackTrace();}
//    }

    public void loadCells(){
        System.out.println("Load Cells");
        cells = new ArrayList<>();

        try{
            Scanner sc = new Scanner(new File("./cells.csv"));
            sc.next();
            for(int i = 0; i < 2500; i++){
                String[] line = sc.next().split(",");
                System.out.println(Arrays.toString(line));

                Tile newTile = new Tile(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Double.parseDouble(line[2]),
                        Double.parseDouble(line[3]), Double.parseDouble(line[4]), Double.parseDouble(line[5]),
                        Double.parseDouble(line[6]), Double.parseDouble(line[7]), line[8],
                        Double.parseDouble(line[9]), Double.parseDouble(line[10]), Double.parseDouble(line[11]));

                cells.add(newTile);
            }

        }catch(Exception e){e.printStackTrace();}
    }

    public void loadCorals(){
        corals = new ArrayList<>();

        try{
            Scanner sc = new Scanner(new File("./corals.csv"));
            sc.next();

            for(int i = 0; i < 71; i++){
                String[] line = sc.next().split(",");
                System.out.println(Arrays.toString(line));

                Tile newTile = new Tile(Integer.parseInt(line[0]), Integer.parseInt(line[1]),
                        Integer.parseInt(line[2]), Double.parseDouble(line[3]), Double.parseDouble(line[4]),
                        Double.parseDouble(line[5]));

                corals.add(newTile);
            }

        }catch(Exception e){e.printStackTrace();}
    }
}
