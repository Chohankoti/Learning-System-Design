public class Follower implements PostObserver {

    private final String userId;

    public Follower(String userId) {
        this.userId = userId;
    }

    @Override
    public void update(Post post) {

        System.out.println("Follower Feed for: " + userId);
        System.out.println("Creator: " + post.getCreatorId());
        System.out.println("Post: " + post.getContent());

        if (!post.getAttachments().isEmpty()) {
            System.out.println("Attachments:");
            for (String file : post.getAttachments()) {
                System.out.println(file);
            }
        }

        System.out.println();
    }

}