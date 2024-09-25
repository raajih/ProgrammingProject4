//Raajih Roland
//9/25/2024

public class Ant extends Animalia {
    private String job;

    /**
     * Calls superclass constructor then initializes job
     * @param phylum
     * @param className
     * @param order
     * @param family
     * @param genus
     * @param species
     * @param organismName
     * @param isExtinct
     * @param job
     */
    public Ant(String phylum, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct, String job)
    {
        super(phylum, className, order, family, genus, species, organismName, isExtinct);
        this.job = job;
    }

    /**
     * getter for job
     * @return job
     */
    public String getJob()
    { return job; }

    /**
     * setter for job
     * @param job
     */
    public void setJob(String job)
    { this.job = job; }

    /**
     * outputs all attributes as a string
     * @return output
     */
    public String toString()
    {
        String output = super.toString();
        output += "Caste: " + job + "\n";

        return output;
    }
}
