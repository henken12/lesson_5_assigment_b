package Assigment_6;


    // Interface Figure
    interface Figure {
        void getFigure();
    }

    // Class UpwardHat implementing Figure
    class UpwardHat implements Figure {
        @Override
        public void getFigure() {
            System.out.print("/\\ ");
        }
    }

    // Class DownwardHat implementing Figure
    class DownwardHat implements Figure {
        @Override
        public void getFigure() {
            System.out.print("\\/ ");
        }
    }

    // Class FaceMaker implementing Figure
    class FaceMaker implements Figure {
        @Override
        public void getFigure() {
            System.out.print(":) ");
        }
    }

    // Class Vertical implementing Figure
    class Vertical implements Figure {
        @Override
        public void getFigure() {
            System.out.print("|| ");
        }
    }


