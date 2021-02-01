package sla.edu;

public class VideoGameData {

    public static void main(String[] args) {
        //new BestSelling();
        MostExpensiveDev.read(args[0]);
        BestSelling.read(args[0]);
        //best selling
         VideoGame.describeAll();
    }
}
