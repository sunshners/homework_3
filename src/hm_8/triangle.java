package hm_8;

    public class triangle extends Figure {
        private double a;
        private double b;
        private double c;

        public triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double area() {
            double s = perimeter() / 2; // полупериметр
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        @Override
        public double perimeter() {
            return a + b + c;
        }
    }

