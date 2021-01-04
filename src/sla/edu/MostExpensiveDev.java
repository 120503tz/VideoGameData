package sla.edu;

public class MostExpensiveDev {
    // Fields
    private int devCost;
    private int marketCost;
    private int totalCostmil;

    public MostExpensiveDev(String title, int releaseYear, String developer, String publisher, String platform, int devCost, int marketCost, int totalCostmil) {
        this.devCost = devCost;
        this.marketCost = marketCost;
        this.totalCostmil = totalCostmil;
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
