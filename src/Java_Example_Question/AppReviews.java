package Java_Example_Question;

//implement review count analysis algorithm with category filtering

public class AppReviews {

    public void analyzeRatings(int[] rating){

        int fiveStarCount = 0;
        int poorStarCount = 0;

        for (int i = 0; i < rating.length; i++){
            if (rating[i] == 5){
                fiveStarCount++;
            }else if (rating[i] <= 3){
                poorStarCount++;
            }
        }
        System.out.println("Total count of 5-star reviews: "+ fiveStarCount);
        System.out.println("Total count of poor reviews: "+poorStarCount);
    }

    public static void main(String[] args) {
        AppReviews myRe = new AppReviews();

        int[] rating = {5, 2, 5, 4, 1, 5, 3, 4, 0};
        myRe.analyzeRatings(rating);
    }
}
