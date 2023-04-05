public class Measure extends Area implements Volume {
    @Override
    public float findCubeVolume(float l) {
        return l * l * l;
    }

    @Override
    public float findCuboidVolume(float l, float b, float h) {
        return l * b * h;
    }

    @Override
    public float findCubeArea(float l) {
        return 6 * l * l;
    }

    @Override
    public float findCuboidArea(float l, float b, float h) {
        return 2 * (l * b + b * h + h * l);
    }
}
