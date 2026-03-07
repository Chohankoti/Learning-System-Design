import java.util.List;

public class Post {

    private final String creatorId;
    private final String content;
    private final List<String> attachments;

    public Post(String creatorId, String content, List<String> attachments) {
        this.creatorId = creatorId;
        this.content = content;
        this.attachments = attachments;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public String getContent() {
        return content;
    }

    public List<String> getAttachments() {
        return attachments;
    }
}