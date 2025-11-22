package CellProcessing;

import Main.Panel;
import Tiles.Tile;

import java.util.ArrayList;
import java.util.Scanner;

public class CellReturning{

    Panel panel;

    public CellReturning(Panel panel){
        this.panel = panel;
    }

    ArrayList<Tile> cells;

    public void run(){
        cells = panel.tileManager.resources;

        // === USER MENU LOOP ===
        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.println("\n=== Ocean Travel Menu ===");
            System.out.println("1. Filter by Depth");
            System.out.println("2. Filter by Pressure");
            System.out.println("3. Filter by Temperature");
            System.out.println("4. Filter by Light Intensity");
            System.out.println("5. Filter by Roughness");
            System.out.println("0. Exit Menu");
            System.out.print("Select an option: ");

            int choice = keyboard.nextInt();
            if (choice == 0) break;   // exit loop

            System.out.println("1. Lowest value");
            System.out.println("2. Highest value");
            System.out.println("3. Range (min to max)");
            int type = keyboard.nextInt();

            double min = 0, max = 0;

            // If user asked for a range, collect min and max
            if(type == 3){
                System.out.print("Enter the first value: ");
                min = keyboard.nextDouble();
                System.out.print("Enter the second value: ");
                max = keyboard.nextDouble();
            }

            // List to store matching results
            ArrayList<Tile> result = new ArrayList<>();
            // Because data is sorted, lowest = first element, highest = last
            if (type == 1){
                result.add(cells.get(0));
            } else if (type == 2){
                result.add(cells.get(cells.size()-1));
            } else {
                // Check every cell and see if its value falls in the range
                for (Tile c : cells){
                    double val = getValue(choice, c);
                    if(val >=  min && val <= max){
                        result.add(c);
                    }
                }
            }

            // Print results
            if(result.size() == 0){
                System.out.println("No matching results. \n");

            } else {
                System.out.println("\n=== Matching Coordinates ===");
                for (Tile c : result){
                    System.out.println(c.toString());
                }
            }
        }
    }

    // Helper method that returns the correct variable based on user selection
    private static double getValue(int choice, Tile c){
        switch(choice){
            case 1: return c.depth;
            case 2: return c.pressure;
            case 3: return c.temperature;
            case 4: return c.lightIntensity;
            case 5: return c.terrainRoughness;
        }
        return 0.0;
    }

}
