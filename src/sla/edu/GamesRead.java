package sla.edu;

public class GamesRead {

    public static void main(String[] args){
        String bestSellingData = args[0];
        BestSelling.read(bestSellingData);

        String mostExpensiveData = args[1];
        MostExpensiveDev.read(mostExpensiveData);

        VideoGame.describeAll();
    }
}
