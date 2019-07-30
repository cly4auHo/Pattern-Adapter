package adapter;

public class Adapter2 implements ModernGraphic {

    private OldGraphic old = new OldGraphic();

    @Override
    public void drawCircle() {
        old.circleFill();
    }

    @Override
    public void drawRectangle() {
        old.rectFill();
    }

}
