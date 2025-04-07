package hm_8;

public class main {
        public static void main(String[] args) {
            Figure[] figures = new Figure[5];
            figures[0] = new rectangle(4, 5);
            figures[1] = new triangle(3, 4, 5);
            figures[2] = new circle(3);
            figures[3] = new rectangle(6, 7);
            figures[4] = new triangle(5, 12, 13);

            double totalPerimeter = 0;

            for (Figure figure : figures) {
                totalPerimeter += figure.perimeter();
            }

            System.out.println("Сумма периметров всех фигур в массиве: " + totalPerimeter);
        }
    }
