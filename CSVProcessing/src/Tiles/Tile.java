package Tiles;

public class Tile implements Comparable<Tile>{

    //resources
    public int row;
    public int col;
    public String type;
    public String family;
    public double abundance;
    public double purity;
    public double extractionDifficulty;
    public double environmentalImpact;
    public double economicValue;
    public String description;

    //POI
    //row
    //col
    public String id;
    public String category;
    public String label;
    //String description;
    public int researchValue;

    //life
    //row
    //col
    public String species;
    public int avgDepth;
    public double density;
    public int threatLevel;
    public String behaviour;
    public int trophicLevel;
    public String preySpecies;

    //hazards
    //row
    //col
    //String type;
    public int severity;
    public String notes;

    //currents
    //row
    //col
    public double uMps; //east-west velocity
    public double vMps; //north-south velocity
    public double speed; //no velocity asociated
    public int stability; //low = 0, medium = 1, high = 2
    public String flowDirection;

    //corals
    //row
    //col
    public int coralCoverPercent; //percent of the 1km x 1km square that a coral covers
    public double healthIndex; // 0-1 the higher the better
    public double bleachingRisk;
    public double biodiversityIndex;

    //cells
    //row
    //col
    public double xKm;
    public double yKm;
    public double latitude;
    public double longitude;
    public double depth;
    public double pressure; //atm
    public String biome;
    public double temperature;
    public double lightIntensity; //fraction of surface light reaching the cell
    public double terrainRoughness; //0-1

    public String dataType;

    //rescources
    public Tile(int col, int row, String type, String family, double abundance, double purity, double extractionDificulty,
                double environmentalImpact, int economicValue){

        this.row = row;this.col = col;
        this.type = type;
        this.family = family;
        this.abundance = abundance;
        this.purity = purity;
        this.extractionDifficulty = extractionDificulty;
        this.environmentalImpact = environmentalImpact;
        this.economicValue = economicValue;
        dataType = "Resources";

    }

    //poi
    public Tile(int col, int row, String id, String category, String label){
        this.row = row;this.col = col;
        this.id = id;this.category = category;
        this.label = label;
        dataType = "Poi";
    }

    //life
    public Tile(int col, int row, String species, int avgDepth, double density, int threatLevel, String behavious,
                int trophicLeve){
        this.row = row;this.col = col;
        this.species = species;
        this.avgDepth = avgDepth;
        this.density = density;
        this.threatLevel = threatLevel;
        this.behaviour = behavious;
        this.trophicLevel = trophicLeve;
        dataType = "life";
    }

    //hazards
    public Tile(int col, int row, String type, int severity, String notes){
        this.row = row;this.col = col;
        this.type = type;this.severity = severity;
        this.notes = notes;
        dataType = "Hazard";
    }

    //currents
    public Tile(int col, int row, double uMps, double vMps, double speed, int stability, String flowDirection){
        this.row = row;this.col = col;
        this.uMps = uMps;this.vMps = vMps;
        this.speed = speed;this.stability = stability;
        this.flowDirection = flowDirection;
        dataType = "Current";
    }

    //corals
    public Tile(int col, int row, int coralCoverPercent, double healthIndex, double bleachingRisk, double biodiversityIndex){
        this.row = row;this.col = col;
        this.coralCoverPercent = coralCoverPercent;this.healthIndex = healthIndex;
        this.bleachingRisk = bleachingRisk;
        this.biodiversityIndex = biodiversityIndex;
        dataType = "Corals";
    }

    //cells
    public Tile(int row, int col, double xKm, double yKm, double latitude, double longitude, double depth, double pressure,
                String biome, double temperature, double lightIntensity, double terrainRoughness){
        this.row = row;this.col = col;
        this.xKm = xKm;this.yKm = yKm;
        this.latitude = latitude;this.longitude = longitude;
        this.depth = depth;this.pressure = pressure;
        this.temperature = temperature;this.lightIntensity = lightIntensity;
        this.terrainRoughness = terrainRoughness;
        dataType = "Cell";
    }



    @Override
    public int compareTo(Tile o) {
        return 0;
    }
}
