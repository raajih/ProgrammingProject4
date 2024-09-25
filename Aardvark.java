//Raajih Roland
//9/25/2024

public class Aardvark extends Animalia implements CanEatAnt{
    private String habitat;

    /**
     * Calls superclass's constructor and initializes habitat
     * @param phylum name of phylum
     * @param className name of class
     * @param order name of order
     * @param family name of family
     * @param genus name of genus
     * @param species name of species
     * @param organismName name of organism
     * @param isExtinct true if extinct, false if not
     * @param habitat name of habitat aardvark lives in
     */
    public Aardvark(String phylum, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct, String habitat)
    {
        super(phylum, className, order, family, genus, species, organismName, isExtinct);
        this.habitat = habitat;
    }

    /**
     * getter for habitat
     * @return habitat
     */
    public String getHabitat()
    { return habitat; }

    /**
     * setter for habitat
     * @param habitat
     */
    public void setHabitat(String habitat)
    { this.habitat = habitat;}

    /**
     * outputs all attributes as a string
     * @return output
     */
    public String toString()
    {
        String output = super.toString();
        output += "Habitat: " + habitat + "\n";

        return output;
    }

    /**
     * method for aardvark to eat ant
     * @Override
     * @param ant to be eaten
     */
    public void eatAnt(Ant ant)
    {
        System.out.println(this.getOrganismName() + " is eating the ant named " + ant.getOrganismName());
        System.out.println("\nThe circle of life...\n");
    }


}
