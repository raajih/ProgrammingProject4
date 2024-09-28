//Raajih Roland
//Programming Project 4
//9/25/2024

public class Animalia extends Eukarya {
    private String phylum;

    /**
     * Calls the superclass constructor first then adds in the phylum
     * @param phylum Name of phylum.
     * @param className Name of class.
     * @param order Name of order.
     * @param family Name of family.
     * @param genus Name of genus.
     * @param species Name of species.
     * @param organismName Name of organism.
     * @param isExtinct Whether or not organism. is extinct.
     */
    public Animalia (String phylum, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct)
    {
        super(className, order, family, genus, species, organismName, isExtinct);
        this.phylum = phylum;
    }

    /**
     * Getter for phylum.
     * @return phylum of organism.
     */
    public String getPhylum()
    { return phylum; }

    /**
     * Setter for phylum.
     * @param phylum
     */
    public void setPhylum(String phylum)
    { this.phylum = phylum; }

    /**
     * Outputs all attributes as a string.
     * @return output.
     */
    public String toString()
    {
        String output = "Phylum: " + phylum + "\n";
        output += super.toString();

        return output;
    }
}
