public class Main {

    public static void main(String[] args) {

        Text text = new PlainText("Hello World");

        text = new BoldDecorator(text);
        text = new ItalicDecorator(text);
        text = new ColorDecorator(text, "red");
        text = new FontSizeDecorator(text, 20);

        System.out.println(text.render());
    }
}
