package Assigment_6;

public class Driver {

        public static void main(String[] args) {
            // Create an array of Figure objects
            Figure[] figures = {
                    new UpwardHat(),
                    new UpwardHat(),
                    new DownwardHat(),
                    new FaceMaker(),
                    new Vertical()
            };


            System.out.print("Output: ");
            for (Figure figure : figures) {
                figure.getFigure();
            }
            System.out.println();

            System.out.println("Output with class names:");
            for (Figure figure : figures) {
                System.out.println(figure.getClass().getSimpleName() + " : ");
                figure.getFigure();
                System.out.println();
            }
        }
    }


