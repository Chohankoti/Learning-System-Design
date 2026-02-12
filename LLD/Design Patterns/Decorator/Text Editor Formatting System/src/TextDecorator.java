public abstract class TextDecorator implements Text {

    protected final Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text.render();
    }
}
