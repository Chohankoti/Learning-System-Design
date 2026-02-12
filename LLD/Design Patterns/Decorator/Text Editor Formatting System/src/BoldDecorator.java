public class BoldDecorator extends TextDecorator {

    public BoldDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<b>" + super.render() + "</b>";
    }
}
