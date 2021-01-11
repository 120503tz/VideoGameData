package sla.edu;

public class MostExpensiveDev extends VideoGame {
    // Fields
    private int devCost;
    private int releaseYear;

    // Constructors
    public MostExpensiveDev(String publisher, String developer, String title, int devCost, int releaseYear, String platform) {
        super (title, developer, publisher, platform);
        this.devCost = devCost;
        this.releaseYear = releaseYear;
    }

    // Setters and Getters
    public int getReleaseYear() { return releaseYear; }

    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

    public int getDevCost() { return devCost; }

    public void setDevCost(int devCost) { this.devCost = devCost; }

    // Methods
    public String toString(){
        String description = "\"" + this.getPublisher();
        description = description + " and " + this.getDeveloper();
        description = description + "\" developed " + this.getTitle();
        description = description + "\" costing " + this.getDevCost();
        description = description + "\" in " + this.getReleaseYear();
        description = description + "\" for platform(s) " + this.getPlatform();
        return description;
    }
}
