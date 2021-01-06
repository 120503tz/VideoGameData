package sla.edu;

public class BestSelling extends VideoGame {
    //fields
    private int sales;
    private int rank;

    //constructors


    public BestSelling(String title, int releaseYear, String releaseDate, String developer, String publisher, String platform, int sales, int rank) {
        super(title, releaseYear, releaseDate, developer, publisher, platform);
        this.sales = sales;
        this.rank = rank;
    }
    //setters/getters

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}

