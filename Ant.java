//Raajih Roland
//Programming Project 4
//9/25/2024

public class Ant extends Animalia {
    private String job;

    /**
     * Calls superclass constructor then initializes job
     * @param phylum Name of ant phylum.
     * @param className Name of the ant class.
     * @param order Name of the ant order.
     * @param family Name of the ant family.
     * @param genus Name of the ant genus.
     * @param species Name of the ant species.
     * @param organismName Name of the ant.
     * @param isExtinct True if ant is extinct, false if not.
     * @param job The job of the ant (string)..
     */
    public Ant(String phylum, String className, String order, String family, String genus, String species, String organismName, boolean isExtinct, String job)
    {
        super(phylum, className, order, family, genus, species, organismName, isExtinct);
        this.job = job;
    }

    /**
     * Getter for job.
     * @return job of the ant.
     */
    public String getJob()
    { return job; }

    /**
     * Setter for job.
     * @param job
     */
    public void setJob(String job)
    { this.job = job; }

    /**
     * Outputs all attributes as a string.
     * @return output.
     */
    public String toString()
    {
        String output = super.toString();
        output += "Caste: " + job + "\n";

        return output;
    }
}
