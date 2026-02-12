public class UnderlineDecorator extends TextDecorator {

    public UnderlineDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<u>" + super.render() + "</u>";
    }
}
