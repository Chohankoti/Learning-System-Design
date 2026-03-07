import java.util.ArrayList;
import java.util.List;

public class Creator {

    private final String creatorId;
    private final List<PostObserver> followers;

    public Creator(String creatorId) {
        this.creatorId = creatorId;
        this.followers = new ArrayList<>();
    }

    public void follow(PostObserver observer) {
        followers.add(observer);
    }

    public void unfollow(PostObserver observer) {
        followers.remove(observer);
    }

    private void notifyFollowers(Post post) {
        for (PostObserver observer : followers) {
            observer.update(post);
        }
    }

    public void createPost(String content, List<String> attachments) {

        Post post = new Post(creatorId, content, attachments);

        System.out.println("Post created by " + creatorId);

        notifyFollowers(post);
    }

}