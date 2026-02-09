import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefaultEmailComposerBuilder implements EmailComposerBuilder{

    private final String to;
    private final String from;
    private final String body;

    private String cc;
    private String bcc;
    List<String> attachments = new ArrayList<>();

    DefaultEmailComposerBuilder(String to, String from, String body){
        this.to = to;
        this.from = from;
        this.body = body;
    }

    @Override
    public EmailComposerBuilder CC(String cc) {
        this.cc = cc;
        return this;
    }

    @Override
    public EmailComposerBuilder BCC(String bcc) {
        this.bcc = bcc;
        return this;
    }

    @Override
    public EmailComposerBuilder addAttachment(String attachment) {
        if(!this.attachments.contains(attachment)){
            this.attachments.add(attachment);
        }
        return this;
    }

    @Override
    public EmailComposer build() {
        validate();
        return new EmailComposer(this);
    }

    private void validate() {
        validateRequired(to, "To");
        validateRequired(from, "From");
        validateRequired(body, "Body");
    }

    private void validateRequired(String value, String fieldName) {
        if (value == null || value.isEmpty()) {
            throw new IllegalStateException(fieldName + " is mandatory");
        }
    }

    String getTo(){
        return to;
    }

    String getFrom(){
        return from;
    }

    String getBody(){
        return body;
    }

    String getCC(){
        return cc;
    }

    String getBCC(){
        return bcc;
    }

    List<String> getAttachments(){
        return Collections.unmodifiableList(attachments);
    }
}
