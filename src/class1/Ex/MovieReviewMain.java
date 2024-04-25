package class1.Ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();


        MovieReview[] movieReviews = new MovieReview[]{movieReview1,movieReview2};

        movieReview1.title = "인셉션";
        movieReview1.review = "인생의 무한루프";

        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화";

        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.toString());
        }
    }
}
