public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Круг", 12);
        Triangle triangle = new Triangle("Треугольник", 2,4,5);
        Square square = new Square("Квадрат", 45);
        Rectangle rectangle = new Rectangle("Прямоугольник", 8,6);

        Dog dog = new Dog("Рекс");
        Cat cat = new Cat("Маруся");

     Drawable[] drawables = {circle, triangle, square, rectangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure) {
                System.out.println(((Figure) drawables[i]).getName() + "Периметр -> " +
                        ((Figure) drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }
            drawables[i].draw();
        }
        }
    }
