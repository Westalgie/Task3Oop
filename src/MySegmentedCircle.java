public class MySegmentedCircle {
    float smallR;
    float bigR;
    float squareS;
    float bigCircleS;
    float smallCircleS;
    float cornerPieceS;
    float circleSegmentS;
    float circleSectorS;

    public MySegmentedCircle(float smallR, float bigR) {
        this.smallR = smallR;
        this.bigR = bigR;
        this.squareS = getSquareArea();
        this.bigCircleS = getCircleArea(this.bigR);
        this.smallCircleS = getCircleArea(this.smallR);
        this.cornerPieceS = getCornerPieceArea();
        this.circleSegmentS = getCircleSegmentArea();
        this.circleSectorS = getCircleSectorArea();
    }

    private float getSquareArea() {
        return bigR * bigR;
    }

    private float getCircleArea(float r) {
        return (float)Math.PI * r * r / 4;
    }

    private float getCornerPieceArea() {
        return (squareS - bigCircleS) / 8;
    }

    private float getCircleSegmentArea() {
        return smallCircleS / 8;
    }

    private float getCircleSectorArea() {
        return (bigCircleS - smallCircleS) / 8;
    }

    public float getFigure1Area() {
        return cornerPieceS * 4 + circleSegmentS * 3;
    }

    public float getFigure2Area() {
        return cornerPieceS + circleSectorS + circleSectorS * 6;
    }

    public float getFigure3Area() {
        return cornerPieceS * 2 + circleSectorS * 6 + circleSectorS * 2;
    }
}
