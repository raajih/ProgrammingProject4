//Raajih Roland
//9/25/2024

public abstract class Eukarya{
    private String className;
    private String order;
    private String family;
    private String genus;
    private String species;
    private String organismName;
    private boolean isExtinct;

   /**
    * Describes an organism in eukarya domain
    @param className name of the class
    @param order name of the order
    @param family name of the family
    @param genus name of the genus
    @param species name of the species
    @param organismName name of the specific organism
    @param isExtinct whether or not the animal is extinct
    */
    public Eukarya (String className, String order, String family, String genus, String species, String organismName, boolean isExtinct)
    {
        this.className = className;
        this.order = order;
        this.family = family;
        this.genus = genus;
        this.species = species;
        this.organismName = organismName;
        this.isExtinct = isExtinct;
    }

    /**
     * Getter for className
     * @return ClassName
     */
    public String getClassName()
    { return className;}

    /**
     * setter for className
     * @param className sets the className to this value
     */
    public void setClassName(String className)
    { this.className = className; }

    /**
     * getter for order
     * @return order
     */
    public String getOrder()
    { return order; }

    /**
     * setter for order
     * @param order the order name to set
     */
    public void setOrder(String order)
    { this.order = order; }

    /**
     * getter for family
     * @return family
     */
    public String getFamily()
    { return family; }

    /**
     * setter for family
     * @param family the family name to be set
     */
    public void setFamily(String family)
    { this.family = family; }

    /**
     * getter for genus
     * @return genus
     */
    public String getGenus()
    { return genus; }

    /**
     * setter for genus
     * @param genus
     */
    public void setGenus(String genus)
    { this.genus = genus; }

    /**
     * getter for species
     * @return species
     */
    public String getSpecies()
    { return species; }

    /**
     * setter for species
     * @param species name to be set
     */
    public void setSpecies(String species)
    { this.species = species; }

    /**
     * getter for organismName
     * @return organismName
     */
    public String getOrganismName()
    { return organismName; }

    /**
     * setter for organismName
     * @param organismName
     */
    public void setOrganismName(String organismName)
    { this.organismName = organismName; }

    /**
     * getter for isExtinct
     * @return isExtinct
     */
    public boolean getIsExtinct()
    { return isExtinct; }

    /**
     * setter for isExtinct
     * @param isExtinct
     */
    public void setIsExtinct(boolean isExtinct)
    { this.isExtinct = isExtinct; }

    /**
     * @return output is all of the attributes put into a string
     */
    public String toString()
    {
        String output;
        output = "Class: " + className + "\n";
        output += "Order: " + order + "\n";
        output += "Family: " + family + "\n";
        output += "Genus: " + genus + "\n";
        output += "Species: " + species + "\n";
        output += "Organism Name: " + organismName + "\n";
        output += "Extinct?: " + isExtinct + "\n";

        return output;
    }

}