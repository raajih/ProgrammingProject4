//Raajih Roland
//Programming Project 4
//9/25/2024

public class Aardvark extends Animalia implements CanEatAnt{
    private String habitat;

    /**
     * Calls superclass's constructor and initializes habitat.
     * @param phylum Name of aardvark phylum
     * @param className Name of aardvark class.
     * @param order Name of aardvark order.
     * @param family Name of aardvark family.
     * @param genus Name of aardvark genus.
     * @param species Name of aardvark species.
     * @param organismName Name of aardvark organism.
     * @param isExtinct True if  aardvark is extinct, false if not.
     * @param habitat Name of habitat aardvark lives in.
     */
    public Aardvark(String phylum, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct, String habitat)
    {
        super(phylum, className, order, family, genus, species, organismName, isExtinct);
        this.habitat = habitat;
    }

    /**
     * Getter for habitat.
     * @return Habitat for aardvark.
     */
    public String getHabitat()
    { return habitat; }

    /**
     * Setter for habitat.
     * @param habitat
     */
    public void setHabitat(String habitat)
    { this.habitat = habitat;}

    /**
     * Outputs all attributes as a string.
     * @return output, a string of all aardvark attributes.
     */
    public String toString()
    {
        String output = super.toString();
        output += "Habitat: " + habitat + "\n";

        return output;
    }

    /**
     * Method for aardvark to eat ant.
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
