//Raajih Roland
//Programming Project 4
//9/25/2024

public class Plantae extends Eukarya{
    private String division;

    /**
     * Constructs a plantae object by calling eukarya's constructor first
     * @param division Name of division.
     * @param className Name of class.
     * @param order Name of order.
     * @param family Name of family.
     * @param genus Name of genus.
     * @param species Name of species.
     * @param organismName Name of the organism.
     * @param isExtinct Whether or not organism is extinct.
     */
    public Plantae (String division, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct)
    {
        super(className, order, family, genus, species, organismName, isExtinct);
        this.division = division;
    }

    /**
     * Getter for division
     * @return division
     */
    public String getDivision()
    { return division; }

    /**
     * Setter for division
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
