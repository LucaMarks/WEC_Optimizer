package Main;

import Tiles.TileManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JPanel;


public class GUI extends JFrame implements ActionListener {
    // global size vars
    int width = 900;
    int height = 600;
    int nubTiles = 50;

    // global tile manager
    TileManager list;

    // global buttons labils panals etc
    JPanel map_P, inter_L,inter_R, title_p;
    JLabel title, layerLBL, thermalLBL, maxMinLBL;
    JCheckBox coralBTN,currentBTN, hazzardsBTN, lifeBTN, POIBTN,
            ResorcesBTN,CoralMin,CoralMax,ResourcesMin,ResourcesMax,HazzardsMin,
            HazzardsMax,CurrentMax,CurrentMin,BiodensityMin,BiodensityMax,
            ecoTherm, healthIndexTherm, depthTherm ,update;

    // array of panals for the tiles
    JPanel [][] tiles;

    // constructor for a new jframe class
    public GUI () {
        // basic setup
        super("GUI");
        setSize(width+14,height+37);
        //setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //adding panels
        map_P = new JPanel(new GridLayout(50, 50, 1, 1));
        map_P.setBackground(Color.black);
        map_P.setSize(height -50, height -50);
        map_P.setLocation(150,50);
        add(map_P);

        inter_L = new JPanel ();
        inter_L.setBackground(Color.lightGray);
        inter_L.setSize(150, height);
        inter_L.setLocation(0,0);
        inter_L.setLayout(null);
        add(inter_L);

        inter_R = new JPanel ();
        inter_R.setBackground(Color.lightGray);
        inter_R.setSize(200, height);
        inter_R.setLocation(width-200,0);
        inter_R.setLayout(null);
        add(inter_R);

        title_p = new JPanel();
        title_p.setBackground(Color.gray);
        title_p.setSize(width - 350, 50);
        title_p.setLocation(150,0);
        add(title_p);


        // adding things to title panal
        title = new JLabel();
        title.setText("Open Ocean Maping");
        title.setFont(new Font("Times New Roman", Font.BOLD, 38));
        title.setForeground(Color.black);
        title_p.add(title);


        //adding thinsg to left interacatable panal
        coralBTN = new JCheckBox ("Corals");
        coralBTN.setSelected(false);   // Unchecked by default
        coralBTN.addActionListener(this);
        coralBTN.setFocusable(false);
        coralBTN.setBackground(null);
        coralBTN.setBounds(25,120,100,20);

        currentBTN = new JCheckBox ("Current");
        currentBTN.setSelected(false);   // Unchecked by default
        currentBTN.addActionListener(this);
        currentBTN.setFocusable(false);
        currentBTN.setBackground(null);
        currentBTN.setBounds(25,140,100,20);

        hazzardsBTN = new JCheckBox ("Hazzards");
        hazzardsBTN.setSelected(false);   // Unchecked by default
        hazzardsBTN.addActionListener(this);
        hazzardsBTN.setFocusable(false);
        hazzardsBTN.setBackground(null);
        hazzardsBTN.setBounds(25,160,100,20);

        lifeBTN = new JCheckBox ("Life");
        lifeBTN.setSelected(false);   // Unchecked by default
        lifeBTN.addActionListener(this);
        lifeBTN.setFocusable(false);
        lifeBTN.setBackground(null);
        lifeBTN.setBounds(25,180,100,20);

        POIBTN = new JCheckBox ("POIs");
        POIBTN.setSelected(false);   // Unchecked by default
        POIBTN.addActionListener(this);
        POIBTN.setFocusable(false);
        POIBTN.setBackground(null);
        POIBTN.setBounds(25,200,100,20);

        ResorcesBTN = new JCheckBox ("Resorces");
        ResorcesBTN.setSelected(false);   // Unchecked by default
        ResorcesBTN.addActionListener(this);
        ResorcesBTN.setFocusable(false);
        ResorcesBTN.setBackground(null);
        ResorcesBTN.setBounds(25,220,100,20);

        //depthTherm

        ecoTherm = new JCheckBox ("Economic");
        ecoTherm.setSelected(false);   // Unchecked by default
        ecoTherm.addActionListener(this);
        ecoTherm.setFocusable(false);
        ecoTherm.setBackground(null);
        ecoTherm.setBounds(25,300,100,20);

        healthIndexTherm = new JCheckBox ("Health Index");
        healthIndexTherm.setSelected(false);   // Unchecked by default
        healthIndexTherm.addActionListener(this);
        healthIndexTherm.setFocusable(false);
        healthIndexTherm.setBackground(null);
        healthIndexTherm.setBounds(25,320,100,20);

        depthTherm = new JCheckBox ("Depth");
        depthTherm.setSelected(false);   // Unchecked by default
        depthTherm.addActionListener(this);
        depthTherm.setFocusable(false);
        depthTherm.setBackground(null);
        depthTherm.setBounds(25,340,100,20);

        layerLBL = new JLabel ("Map layers");
        layerLBL.setFont(new Font("Times New Roman", Font.BOLD, 18));
        layerLBL.setForeground(Color.black);
        layerLBL.setBounds(20,90,100,25);

        thermalLBL = new JLabel ("Thermal maps");
        thermalLBL.setFont(new Font("Times New Roman", Font.BOLD, 18));
        thermalLBL.setForeground(Color.black);
        thermalLBL.setBounds(10,270,150,25);

        //update
        update = new JCheckBox ("update");
        update.setSelected(false);   // Unchecked by default
        update.addActionListener(this);
        update.setFocusable(false);
        update.setBackground(null);
        update.setBounds(25,440,100,20);

        inter_L.add(update);
        inter_L.add(depthTherm);
        inter_L.add(healthIndexTherm);
        inter_L.add(ecoTherm);
        inter_L.add(thermalLBL);
        inter_L.add(layerLBL);
        inter_L.add(coralBTN);
        inter_L.add(currentBTN);
        inter_L.add(hazzardsBTN);
        inter_L.add(lifeBTN);
        inter_L.add(POIBTN);
        inter_L.add(ResorcesBTN);


        // adding parts to right panal

        CoralMax = new JCheckBox ("Max Corals");
        CoralMax.setSelected(false);   // Unchecked by default
        CoralMax.addActionListener(this);
        CoralMax.setFocusable(false);
        CoralMax.setBackground(null);
        CoralMax.setBounds(25,70,160,20);

        CoralMin = new JCheckBox ("Min Corals");
        CoralMin.setSelected(false);   // Unchecked by default
        CoralMin.addActionListener(this);
        CoralMin.setFocusable(false);
        CoralMin.setBackground(null);
        CoralMin.setBounds(25,90,160,20);

        ResourcesMin = new JCheckBox ("Min Resources");
        ResourcesMin.setSelected(false);   // Unchecked by default
        ResourcesMin.addActionListener(this);
        ResourcesMin.setFocusable(false);
        ResourcesMin.setBackground(null);
        ResourcesMin.setBounds(25,110,160,20);

        ResourcesMax = new JCheckBox ("Max Resources");
        ResourcesMax.setSelected(false);   // Unchecked by default
        ResourcesMax.addActionListener(this);
        ResourcesMax.setFocusable(false);
        ResourcesMax.setBackground(null);
        ResourcesMax.setBounds(25,130,160,20);

        HazzardsMax = new JCheckBox ("Max Hazzards");
        HazzardsMax.setSelected(false);   // Unchecked by default
        HazzardsMax.addActionListener(this);
        HazzardsMax.setFocusable(false);
        HazzardsMax.setBackground(null);
        HazzardsMax.setBounds(25,150,160,20);

        HazzardsMin = new JCheckBox ("Min Hazzards");
        HazzardsMin.setSelected(false);   // Unchecked by default
        HazzardsMin.addActionListener(this);
        HazzardsMin.setFocusable(false);
        HazzardsMin.setBackground(null);
        HazzardsMin.setBounds(25,170,160,20);

        CurrentMin = new JCheckBox ("Min Current");
        CurrentMin.setSelected(false);   // Unchecked by default
        CurrentMin.addActionListener(this);
        CurrentMin.setFocusable(false);
        CurrentMin.setBackground(null);
        CurrentMin.setBounds(25,190,160,20);

        CurrentMax = new JCheckBox ("Max Current");
        CurrentMax.setSelected(false);   // Unchecked by default
        CurrentMax.addActionListener(this);
        CurrentMax.setFocusable(false);
        CurrentMax.setBackground(null);
        CurrentMax.setBounds(25,210,160,20);

        BiodensityMax = new JCheckBox ("Max Biodensity");
        BiodensityMax.setSelected(false);   // Unchecked by default
        BiodensityMax.addActionListener(this);
        BiodensityMax.setFocusable(false);
        BiodensityMax.setBackground(null);
        BiodensityMax.setBounds(25,230,160,20);

        BiodensityMin = new JCheckBox ("Min Biodensity");
        BiodensityMin.setSelected(false);   // Unchecked by default
        BiodensityMin.addActionListener(this);
        BiodensityMin.setFocusable(false);
        BiodensityMin.setBackground(null);
        BiodensityMin.setBounds(25,250,160,20);

        //maxMinLBL
        maxMinLBL = new JLabel ("High Low");
        maxMinLBL.setFont(new Font("Times New Roman", Font.BOLD, 18));
        maxMinLBL.setForeground(Color.black);
        maxMinLBL.setBounds(25,40,100,25);

        inter_R.add(maxMinLBL);
        inter_R.add(CurrentMin);
        inter_R.add(CurrentMax);
        inter_R.add(CoralMax);
        inter_R.add(CoralMin);
        inter_R.add(ResourcesMax);
        inter_R.add(ResourcesMin);
        inter_R.add(HazzardsMax);
        inter_R.add(HazzardsMin);
        inter_R.add(BiodensityMin);
        inter_R.add(BiodensityMax);

        // add the tiles into the map
        tiles = new JPanel[nubTiles][nubTiles];
        list = new TileManager ( );

        for(int i =0; i < nubTiles; i ++){
            for(int j = 0; j < nubTiles; j++) {
                tiles[i][j] = new JPanel();
                tiles[i][j].setBackground(Color.blue);
            }
        }

        // add the cell into the tiles


        for(int i =0; i < nubTiles; i ++) {
            for(int j = 0; j < nubTiles; j++) {
                map_P.add(tiles[i][j]);
            }
        }

        // update all the panals
        GUI.super.repaint();

    }

    /**
     * run jframe
     */
    static void main(String[] args) {
        GUI h = new GUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object source = e.getSource();

        if (source == coralBTN) {
            // Code for coralBTN action
            for(int i = 0; i < list.corals.size(); i++){
                int row = list.corals.get(i).row;
                int col = list.corals.get(i).col;

                // color the tile with coral
                tiles[col][row].setBackground(new Color(list.corals.get(i).coralCoverPercent+100,192,203));
            }
        }
        else if (source == currentBTN) {
            // Code for currentBTN action
        }
        else if (source == hazzardsBTN) {
            // Code for hazardsBTN action
        }
        else if (source == lifeBTN) {
            // Code for lifeBTN action
        }
        else if (source == POIBTN) {
            // Code for POIBTN action
        }
        else if (source == ResorcesBTN) {
            // Code for ResorcesBTN action
        }
        else if (source == CoralMin) {
            // Code for CoralMin action
        }
        else if (source == CoralMax) {
            // Code for CoralMax action
        }
        else if (source == ResourcesMin) {
            // Code for ResourcesMin action
        }
        else if (source == ResourcesMax) {
            // Code for ResourcesMax action
        }
        else if (source == HazzardsMin) {
            // Code for HazzardsMin action
        }
        else if (source == HazzardsMax) {
            // Code for HazzardsMax action
        }
        else if (source == CurrentMax) {
            // Code for CurrentMax action
        }
        else if (source == CurrentMin) {
            // Code for CurrentMin action
        }
        else if (source == BiodensityMin) {
            // Code for BiodensityMin action
        }
        else if (source == BiodensityMax) {
            // Code for BiodensityMax action
        }
        else if (source == ecoTherm) {
            // Code for ecoTherm action
        }
        else if (source == healthIndexTherm) {
            // Code for healthIndexTherm action
        }
        else  {
            System.out.println("yes");
            for(int i =0; i < nubTiles; i ++){
                for(int j = 0; j < nubTiles; j++) {
                    tiles[i][j].setBackground(Color.blue);
                }
            }
        }
        System.out.println("weflj");

        // update the map
        map_P.repaint();

    }


}

