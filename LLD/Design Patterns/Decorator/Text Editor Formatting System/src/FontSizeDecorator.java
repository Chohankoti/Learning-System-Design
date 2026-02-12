public class FontSizeDecorator extends TextDecorator {

    private final int size;

    public FontSizeDecorator(Text text, int size) {
        super(text);
        this.size = size;
    }

    @Override
    public String render() {
        return "<span style='font-size:" + size + "px'>"
                + super.render()
                + "</span>";
    }
}
