//Raajih Roland
//Programming Project 4
//9/25/2024

public class VenusFlyTrap extends Plantae implements CanEatAnt{
    private double avgSize;

    /**
     * Constructor that calls superclass's contstructor then initializes avgSize
     * @param division Name of division.
     * @param className Name of the class.
     * @param order Name of the order.
     * @param family Name of the family.
     * @param genus Name of the genus.
     * @param species Name of the species.
     * @param organismName Name of the organism.
     * @param isExtinct True if extinct, false if not.
     * @param avgSize Average size of trap in inches.
     */
    public VenusFlyTrap (String division, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct, double avgSize)
    {
        super(division, className, order, family, genus, species, organismName, isExtinct);
        this.avgSize = avgSize;
    }

    /**
     * Getter for avgSize.
     * @return avgSize.
     */
    public double getAvgSize()
    { return avgSize; }

    /**
     * Setter for avgSize.
     * @param avgSize.
     */
    public void setAvgSize(double avgSize)
    { this.avgSize = avgSize; }

    public String toString()
    {
        String output = super.toString();
        output += "Average trap size: " + avgSize + " inches\n";

        return output;
    }

    /**
     * Method for venus fly trap to eat an ant.
     * @Override
     * @param ant to be eaten.
     */
    public String eatAnt(Ant ant)
    {
        String output = this.getOrganismName() + " is eating the ant named " + ant.getOrganismName();
        output += ".\nThe circle of life...\n";
        return output;
    }
}
