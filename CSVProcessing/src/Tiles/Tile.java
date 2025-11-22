package Tiles;

public class Tile implements Comparable<Tile>{

    //resources
    int row;
    int col;
    String type;
    String family;
    double abundance;
    double purity;
    double extractionDifficulty;
    double environmentalImpact;
    double economicValue;
    String description;

    //POI
    //row
    //col
    String id;
    String category;
    String label;
    //String description;
    int researchValue;

    //life
    //row
    //col
    String species;
    int avgDepth;
    double density;
    int threatLevel;
    String behaviour;
    int trophicLevel;
    String preySpecies;

    //hazards
    //row
    //col
    //String type;
    int severity;
    String notes;

    //currents
    //row
    //col
    double uMps; //east-west velocity
    double vMps; //north-south velocity
    double speed; //no velocity asociated
    int stability; //low = 0, medium = 1, high = 2
    String flowDirection;

    //corals
    //row
    //col
    int coralCoverPercent; //percent of the 1km x 1km square that a coral covers
    double healthIndex; // 0-1 the higher the better
    double bleachingRisk;
    double biodiversityIndex;

    //cells
    //row
    //col
    double xKm;
    double yKm;
    double latitude;
    double longitude;
    double depth;
    double pressure; //atm
    String biome;
    double temperature;
    double lightIntensity; //fraction of surface light reaching the cell
    double terrainRoughness; //0-1

    String dataType;

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
