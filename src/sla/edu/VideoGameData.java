package sla.edu;

public class VideoGameData {

    public static void main(String[] args) {
        String mostExpensiveData = args[0];
        MostExpensiveDev.read(mostExpensiveData);

        String BestSellingData = args[0];
        BestSelling.read(BestSellingData);

        VideoGame.describeAll();
    }
}
