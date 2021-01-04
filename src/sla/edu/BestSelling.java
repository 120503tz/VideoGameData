package sla.edu;

public class BestSelling extends VideoGame {
    //fields
    private int sales;

    //constructors


    public BestSelling(int rank, String title, int releaseYear, String releaseDate, String developer, String publisher, String platform, int sales) {
        super(rank, title, releaseYear, releaseDate, developer, publisher, platform);
        this.sales = sales;
    }
    //setters/getters

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}

