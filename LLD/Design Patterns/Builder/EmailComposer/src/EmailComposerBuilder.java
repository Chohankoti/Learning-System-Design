import java.util.List;

public interface EmailComposerBuilder {

    EmailComposerBuilder CC(String cc);

    EmailComposerBuilder BCC(String bcc);

    EmailComposerBuilder addAttachment(String attachment);

    EmailComposer build();
}
