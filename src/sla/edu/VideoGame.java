package sla.edu;

 public class VideoGame {
     // fields
   private String title;
   private String developer;
   private String publisher;
   private String platform;

     public VideoGame(String title, int releaseYear, String releaseDate, String developer, String publisher, String platform) {
         this.title = title;
         this.developer = developer;
         this.publisher = publisher;
         this.platform = platform;
     }

     public String getTitle() { return title; }

     public void setTitle(String title) { this.title = title; }

     public String getDeveloper() { return developer; }

     public void setDeveloper(String developer) { this.developer = developer; }

     public String getPublisher() { return publisher; }

     public void setPublisher(String publisher) { this.publisher = publisher; }

     public String getPlatform() { return platform; }

     public void setPlatform(String platform) { this.platform = platform; }
 }



