package Main;

import CellProcessing.CellReturning;
import Tiles.Tile;
import Tiles.TileManager;

import java.util.ArrayList;

public class Panel{

    public TileManager tileManager = new TileManager();
    public CellReturning returning;

    ArrayList<Tile> resourcesCorals = new ArrayList<>();

    public Panel(){

        //start by loading all of the tiles
        loadTiles();
        returning = new CellReturning(this);
        returning.run();
    }

    public void loadTiles() {
//        //combine all of hte  cells we have
//        for(int i = 0; i < tileManager.resources.size(); i++){
//
//            for(int j = 0; j < tileManager.corals.size(); j++){
//                if(tileManager.resources.get(i).row == tileManager.corals.get(j).row){
//                    if(tileManager.resources.get(i).col == tileManager.corals.get(j).col){
//                    }
//                }
//        }
//    }
    }
}
