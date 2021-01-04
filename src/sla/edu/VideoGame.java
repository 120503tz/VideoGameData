package sla.edu;

 public class VideoGame {
     // fields
    private int rank;
   private String title;
   private int releaseYear;
   private String releaseDate;
   private String developer;
   private String publisher;
   private String platform;

     public VideoGame(int rank, String title, int releaseYear, String releaseDate, String developer, String publisher, String platform) {
         this.rank = rank;
         this.title = title;
         this.releaseYear = releaseYear;
         this.releaseDate = releaseDate;
         this.developer = developer;
         this.publisher = publisher;
         this.platform = platform;
     }

     public int getRank() {
         return rank;
     }

     public void setRank(int rank) {
         this.rank = rank;
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

     public String getReleaseDate() {
         return releaseDate;
     }

     public void setReleaseDate(String releaseDate) {
         this.releaseDate = releaseDate;
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

 }



