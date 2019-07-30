package adapter;

public class Adapter extends OldGraphic implements ModernGraphic {

    @Override
    public void drawCircle() {
        circleFill();
    }

    @Override
    public void drawRectangle() {
        rectFill();
    }

}
