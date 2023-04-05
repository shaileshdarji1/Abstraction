public class Main {

    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.setLength(10);
        System.out.println("Cube Area:" + cube.findCubeArea(cube.getLength()));
        System.out.println("Cube Volume:" + cube.findCubeVolume(cube.getLength()));

        Cuboid cuboid = new Cuboid();
        cuboid.setLength(10);
        cuboid.setBreadth(20);
        cuboid.setHeight(30);
        System.out.println("Cuboid Area:" + cuboid.findCuboidArea(cuboid.getLength(), cuboid.getBreadth(), cuboid.getHeight()));
        System.out.println("Cuboid Volume:" + cuboid.findCuboidVolume(cuboid.getLength(), cuboid.getBreadth(), cuboid.getHeight()));

    }
}
