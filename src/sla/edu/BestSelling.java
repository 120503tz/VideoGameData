package sla.edu;

public class BestSelling extends VideoGame {
    //fields
    private String releaseDate;
    private int sales;
    private int rank;

    //constructors


    public BestSelling(String title, String releaseDate, String developer, String publisher, String platform, int sales, int rank) {
        super(title, developer, publisher, platform);
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.rank = rank;
    }
    //setters/getters

    public String getReleaseDate() { return releaseDate; }

    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    public int getSales() { return sales; }

    public void setSales(int sales) { this.sales = sales; }

    public int getRank() { return rank; }

    public void setRank(int rank) { this.rank = rank; }
}

