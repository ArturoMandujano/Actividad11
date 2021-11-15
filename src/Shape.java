import java.util.Scanner;

public interface Shape {

    class Square {
        int lado;

        int getArea() {
            return lado * lado;
        }

        int getPerimeter() {
            return lado * 4;
        }
    }

    class Circle {
        double r;

        double getArea() {
            return Math.PI * Math.pow(r, 2);
        }

        double getPerimeter() {
            return 2 * Math.PI * r;
        }
    }

    class Triangle {
        int lado;

        int getArea() {
            return (lado * lado)/2;
        }

        int getPerimeter() {
            return lado * 3;
        }
    }

    public class Main {

        public static void main(String args[]) {

            int o;
            Scanner leer=new Scanner(System.in);
            System.out.println("Select opcion");

            System.out.println("1: Square Area, 2: Square Perimeter 3: Circle Area 4: Circle Perimeter 5: Triangle Area 6: Triangle Perimeter");
                    o=leer.nextInt();

            switch (o){
                case 1:

            Square mybox1 = new Square();
            int area;
            int l;

                    System.out.println("Dame el valor del lado: ");
                    l=leer.nextInt();

                    mybox1.lado = l;

            area = mybox1.getArea();
            System.out.println("El área del cuadrado es de: " + area);
            break;

            case 2:

                Square mybox2 = new Square();
                int Perimeter;

                System.out.println("Dame el valor del lado: ");
                l=leer.nextInt();
                mybox2.lado = l;

                Perimeter = mybox2.getPerimeter();
                System.out.println("El perimetro del cuadrado es de: " + Perimeter);
                break;

                case 3:

                    Circle mybox3 = new Circle();
                    int ra;

                    System.out.println("Dame el valor del radio: ");
                    ra=leer.nextInt();
                    mybox3.r = ra;

                    area = (int) mybox3.getArea();
                    System.out.println("El área del círculo es de: " + area);
                    break;

                case 4:

                    Circle mybox4 = new Circle();

                    System.out.println("Dame el valor del lado: ");
                    ra=leer.nextInt();
                    mybox4.r = ra;

                    Perimeter = (int) mybox4.getPerimeter();
                    System.out.println("El perimetro del círculo es de: " + Perimeter);
                    break;

                case 5:

                    Triangle mybox5 = new Triangle();
                    System.out.println("Dame el valor del lado: ");
                    l=leer.nextInt();

                    mybox5.lado = l;

                    area = mybox5.getArea();
                    System.out.println("El área del triangulo es de: " + area);
                    break;

                case 6:

                    Triangle mybox6 = new Triangle();
                    System.out.println("Dame el valor del lado: ");
                    l=leer.nextInt();

                    mybox6.lado = l;

                    Perimeter = mybox6.getPerimeter();
                    System.out.println("El perimetro del triangulo es de: " + Perimeter);
                    break;

            }


        }
    }
}

