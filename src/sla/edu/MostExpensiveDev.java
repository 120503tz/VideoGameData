package sla.edu;

public class MostExpensiveDev extends VideoGame {
    // Fields
    private int releaseYear;
    private int devCost;
    private int marketCost;
    private int totalCostmil;

    // Constructors
    public MostExpensiveDev(String publisher, String developer, String title, int devCost, int releaseYear, String platform, int marketCost, int totalCostmil) {
        super (title, developer, publisher, platform);
        this.releaseYear = releaseYear;
        this.devCost = devCost;
        this.marketCost = marketCost;
        this.totalCostmil = totalCostmil;
    }

    // Setters and Getters
    public int getReleaseYear() { return releaseYear; }

    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

    public int getDevCost() { return devCost; }

    public void setDevCost(int devCost) { this.devCost = devCost; }

    public int getMarketCost() { return marketCost; }

    public void setMarketCost(int marketCost) { this.marketCost = marketCost; }

    public int getTotalCostmil() { return totalCostmil; }

    public void setTotalCostmil(int totalCostmil) { this.totalCostmil = totalCostmil; }

    // Methods
    public String toString(){
        String description = "\"" + this.getPublisher();
        description = description + " and " + this.getDeveloper();
        description = description + "\" developed " + this.getTitle();
        description = description + "\" costing " + this.getDevCost();
        description = description + "\" in " + this.getReleaseYear();
        description = description + "\" for platform(s) " + this.getPlatform();
        //description = description + "\"
        return description;
    }
}
