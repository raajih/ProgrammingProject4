//Raajih Roland
//9/25/2024

public class Animalia extends Eukarya {
    private String phylum;

    /**
     * Calls the superclass constructor first then adds in the phylum
     * @param phylum name of phylum
     * @param className name of class
     * @param order name of order
     * @param family name of family
     * @param genus name of genus
     * @param species name of species
     * @param organismName name of organism
     * @param isExtinct whether or not it is extinct
     */
    public Animalia (String phylum, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct)
    {
        super(className, order, family, genus, species, organismName, isExtinct);
        this.phylum = phylum;
    }

    /**
     * getter for phylum
     * @return phylum
     */
    public String getPhylum()
    { return phylum; }

    /**
     * setter for phylum
     * @param phylum
     */
    public void setPhylum(String phylum)
    { this.phylum = phylum; }

    /**
     * outputs all attributes as a string
     * @return output
     */
    public String toString()
    {
        String output = "Phylum: " + phylum + "\n";
        output += super.toString();

        return output;
    }
}
