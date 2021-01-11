package sla.edu;

public class BestSelling extends VideoGame {
    //fields
    private int sales;
    private int rank;
    private int releaseYear;
    private int releaseDate;

    //constructors


    public BestSelling(String title, String developer, String publisher, String platform, int sales, int rank, int releaseYear, int releaseDate) {
        super(title, developer, publisher, platform);
        this.sales = sales;
        this.rank = rank;
        this.releaseYear = releaseYear;
        this.releaseDate = releaseDate;
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public BestSelling(String title, String developer, String publisher, String platform) {
        super(title, developer, publisher, platform);
    }

    //Methods

    public String toString(){
        String description = "\"" + this.getPublisher();
        description = description + "\" developed " + this.getTitle();
        description = description + "\" released on " + this.getReleaseDate();
        description = description + "\" in " + this.getReleaseYear();
        description = description + "\" for platform(s) " + this.getPlatform();
        description = description + "\" selling this many copies:" + this.getSales();

        return description;
    }

}



