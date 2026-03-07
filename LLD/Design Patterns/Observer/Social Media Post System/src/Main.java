import java.util.List;

public class Main {

    public static void main(String[] args) {

        PostObserver follower1 = new Follower("@123");
        PostObserver follower2 = new Follower("@456");

        Creator creator = new Creator("@creator1");

        creator.follow(follower1);
        creator.follow(follower2);

        creator.createPost(
                "Hello followers, how are you?",
                List.of("love.png")
        );
    }
}