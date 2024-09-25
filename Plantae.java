//Raajih Roland
//9/25/2024

public class Plantae extends Eukarya{
    private String division;

    /**
     * Constructs a plantae object by calling eukarya's constructor first
     * @param division name of division
     * @param className name of class
     * @param order name of order
     * @param family name of family
     * @param genus name of genus
     * @param species name of species
     * @param organismName name of the organism
     * @param isExtinct whether or not organism is extinct
     */
    public Plantae (String division, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct)
    {
        super(className, order, family, genus, species, organismName, isExtinct);
        this.division = division;
    }

    /**
     * getter for division
     * @return division
     */
    public String getDivision()
    { return division; }

    /**
     * setter for division
     * @param division
     */
    public void setDivision(String division)
    { this.division = division; }

    /**
     * Division is added before the superclass's toString method is then called
     * @return output is the attributes of the plantae in a string
     */
    public String toString()
    {
        String output = "Division: " + division + "\n";
        output += super.toString();

        return output;
    }
}
