//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            DefaultEmailComposerBuilder builder = new DefaultEmailComposerBuilder(
                    "Manager@xyz.com",
                    "Employee@xyz.com",
                    "Your hard work will pay off someday. Keep grinding!"
            );

            EmailComposer emailComposer = builder
                    .CC("TeamLead@xyz.com")
                    .BCC("Employee2@xyz.com")
                    .addAttachment("Project Doc1")
                    .addAttachment("Project Doc2")
                    .build();

            emailComposer.processMail();
    }
}