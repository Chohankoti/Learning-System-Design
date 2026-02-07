import java.util.List;

public class EmailComposer {

    private final String to;
    private final String from;
    private final String body;

    private final String cc;
    private final String bcc;
    private final List<String> attachments;

    EmailComposer(DefaultEmailComposerBuilder defaultEmailComposer){
        this.to = defaultEmailComposer.getTo();
        this.from = defaultEmailComposer.getFrom();
        this.body = defaultEmailComposer.getBody();

        this.cc = defaultEmailComposer.getCC();
        this.bcc = defaultEmailComposer.getBCC();
        this.attachments = defaultEmailComposer.getAttachments();
    }

    void processMail(){
        StringBuilder process = new StringBuilder();

        process.append("To: ")
                .append(to)
                .append("\n")
                .append("From: ")
                .append(from)
                .append("\n");

        if (cc != null && !cc.isBlank()) {
            process.append("CC:")
                    .append(cc)
                    .append("\n");
        }

        if(bcc != null && !bcc.isEmpty()){
            process.append("BCC:")
                    .append(bcc)
                    .append("\n");
        }

        process.append("Body: ")
                .append(body)
                .append("\n");

        process.append("Attachments: ")
                .append(attachments.toString());


        System.out.println(process.toString());
    }
}
