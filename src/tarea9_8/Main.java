package tarea9_8;

public class Main {

    public static void main (String[] args) {
        Dot dot1 = new Dot(-10, 10);
        Dot dot2 = new Dot(10, 10);
        Dot dot3 = new Dot(-10, -10);
        Dot dot4 = new Dot(10, -10);

        Poligon square = new Poligon();

        square.getDotArrayList().add(dot1);
        square.getDotArrayList().add(dot2);
        square.getDotArrayList().add(dot3);
        square.getDotArrayList().add(dot4);


        Dot dot11 = new Dot(10, 0);
        Dot dot12 = new Dot(-3, -7);
        Dot dot13 = new Dot(-10, 6);

        Poligon triangle = new Poligon();

        triangle.getDotArrayList().add(dot11);
        triangle.getDotArrayList().add(dot12);
        triangle.getDotArrayList().add(dot13);

    }

}
