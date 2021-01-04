package sla.edu;

public class MostExpensiveDev {
    // Fields
    private String title;
    private int releaseYear;
    private String developer;
    private String publisher;
    private String platform;
    private int devCost;
    private int marketCost;
    private int totalCostmil;

    public MostExpensiveDev(String title, int releaseYear, String developer, String publisher, String platform, int devCost, int marketCost, int totalCostmil) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.developer = developer;
        this.publisher = publisher;
        this.platform = platform;
        this.devCost = devCost;
        this.marketCost = marketCost;
        this.totalCostmil = totalCostmil;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getDevCost() {
        return devCost;
    }

    public void setDevCost(int devCost) {
        this.devCost = devCost;
    }

    public int getMarketCost() {
        return marketCost;
    }

    public void setMarketCost(int marketCost) {
        this.marketCost = marketCost;
    }

    public int getTotalCostmil() {
        return totalCostmil;
    }

    public void setTotalCostmil(int totalCostmil) {
        this.totalCostmil = totalCostmil;
    }
}
