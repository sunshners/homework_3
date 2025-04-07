package hm_8;

    public class rectangle extends Figure {
        private double width;
        private double height;

        public rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double area() {
            return width * height;
        }

        @Override
        double perimeter() {
            return 2 * (width + height);
        }
    }

