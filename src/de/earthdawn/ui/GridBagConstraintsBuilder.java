package de.earthdawn.ui;

import java.awt.GridBagConstraints;

/**
 * Hilfsklasse zur Erzeugung eines Rasters mittels GridBagConstraints. Erm�glicht den zeilenweisen
 * Aufbau eines GridBagLayout mittels GridBagConstraints. Dabei ist nicht vorgesehen, dass es
 * �berlappende Zeilen gibt. 
 */
public class GridBagConstraintsBuilder {
    
    /** Aktuelle Position in X-Richtung */
    private int cellPosX = 0;
    
    /** Aktuelle Position in Y-Richtung */
    private int cellPosY = 0;
    
    /** Aktuelle Zeilenh�he. */
    private int currentLineHeigth = 1;

    /** Default-Gewichtung in X-Richtung */
    private double defaultWeightX = 1;
    
    /** Default-Gewichtung in Y-Richtung */
    private double defaultWeightY = 1; 
    
    /** Aktueller F�llmodus. */
    private int defaultFill = GridBagConstraints.HORIZONTAL;
    
    /**
     * Erzeugt GrigBagConstraints in der aktuellen Zeilen mit der Default-Breite und der 
     * Default-Gewichtung.
     */
    public GridBagConstraints nextCell() {
        return nextCell( 1 );
    }
    
    /**
     * Erzeugt GrigBagConstraints in der aktuellen Zeilen mit der �bergebenen Breite und der 
     * Default-Gewichtung.
     */
   public GridBagConstraints nextCell( int width ) {
        return nextCell( width, defaultWeightX );
    }
    
   /**
    * Erzeugt GrigBagConstraints in der aktuellen Zeilen mit der �bergebenen Breite und der 
    * �bergebenen Gewichtung.
    */
    public GridBagConstraints nextCell( int width, double weigth ) {
        GridBagConstraints result = getGridBagConstraints( cellPosX, cellPosY, width, 
            currentLineHeigth, weigth, defaultWeightY );
        cellPosX += width;

        return result;
    }

    /**
     * N�chste Zeile einstellen und zur�cksetzen des Zellenposition in X-Richtung. 
     */
    public void nextLine() {
        cellPosX = 0;
        cellPosY += currentLineHeigth;
        currentLineHeigth = 1;
    }
    
    /**
     * N�chste Zeile einstellen (Zeilenh�he = <code>lines</code>) und zur�cksetzen des Zellenposition in 
     * X-Richtung. 
     */
    public void nextLines( int lines ) {
        cellPosX = 0;
        cellPosY += lines;
        currentLineHeigth = 1;
    }

    /**
     * Erzeugt Grid-Bag-Constraits zu den �bergebenen Parametern.
     */
    private GridBagConstraints getGridBagConstraints( int gridX, int gridY, int gridwidth, int gridheigth, 
        double weightX, double weightY )
    {
        GridBagConstraints result = new GridBagConstraints();
        result.gridx = gridX;
        result.gridy = gridY;
        result.weightx = weightX;
        result.weighty = weightY;
        result.gridheight = gridheigth;
        result.gridwidth = gridwidth;
        result.fill = defaultFill;

        return result;
    }
}
