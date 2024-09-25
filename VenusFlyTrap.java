//Raajih Roland
//9/25/2024

public class VenusFlyTrap extends Plantae{
    private int avgSize;

    /**
     * Constructor that calls superclass's contstructor then initializes avgSize
     * @param division name of division
     * @param className name of the class
     * @param order name of the order
     * @param family name of the family
     * @param genus name of the genus
     * @param species name of the species
     * @param organismName name of the organism
     * @param isExtinct true if extinct, false if not
     * @param avgSize average size of trap
     */
    public VenusFlyTrap (String division, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct, int avgSize)
    {
        super(division, className, order, family, genus, species, organismName, isExtinct);
        this.avgSize = avgSize;
    }

    /**
     * getter for avgSize
     * @return avgSize
     */
    public int getAvgSize()
    { return avgSize; }

    /**
     * setter for avgSize
     * @param avgSize
     */
    public void setAvgSize(int avgSize)
    { this.avgSize = avgSize; }

    public String toString()
    {
        String output = super.toString();
        output += "Average trap size: " + avgSize + "\n";

        return output;
    }
}
