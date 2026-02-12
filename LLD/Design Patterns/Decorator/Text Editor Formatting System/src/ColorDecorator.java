public class ColorDecorator extends TextDecorator {

    private final String color;

    public ColorDecorator(Text text, String color) {
        super(text);
        this.color = color;
    }

    @Override
    public String render() {
        return "<span style='color:" + color + "'>"
                + super.render()
                + "</span>";
    }
}
