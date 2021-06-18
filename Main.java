package Inheritance;

import org.mycompany.matrixlib.*;

public class Main {
    public static void main(String[] args) {

        Matrix one = new Matrix(2, 2);
        one.setElement(0,0,1);
        one.setElement(0,1,2);
        one.setElement(1,0,3);
        one.setElement(1,1,1);
        //one.setElement(1,2,-1);
        System.out.println("Matrix one:" + one);

        Matrix two = new Matrix(3, 1);
        two.setElement(0,0,1);
        two.setElement(1,0,2);
        two.setElement(2,0,3);
        System.out.println("Matrix two:" + two);


        SquareMatrix a = new SquareMatrix(2);
        //System.out.println("Matrix A:" + a);
        a.setElement(0,0,2);
        a.setElement(0,1,1);
        a.setElement(1,1,3);
        System.out.println("Matrix A:" + a);

        SquareMatrix b = new SquareMatrix(2);
        b.setElement(0,0,2);
        b.setElement(0,1,1);
        b.setElement(1,0,4);
        b.setElement(1,1,3);
        System.out.println("Matrix B:" + b);

        try {
            System.out.println(" A x B = " + a.product(b));
            System.out.println(" A + B = " + a.sum(b));
            System.out.println("one + A = " + one.sum(a));
            System.out.println("one x A = " + one.product(a));

           // System.out.println(" one x two = " + one.product(two));
            //System.out.println(" one + two = " + one.sum(two));
        }
        catch (MatrixException e){
            System.out.println (e);
        }

        try {
            SquareMatrix x = new SquareMatrix(2);
            SquareMatrix y = new SquareMatrix(3);
            System.out.println(x.sum(y));
        }
        catch (MatrixException e){
            System.out.println (e);
        }

        System.out.println(a.equals(b));
        /*try {
            OneColumnMatrix a = new OneColumnMatrix(2, 3);
            //System.out.println(a);
            a.setElement(0, 0, 5);
            a.setElement(1, 1, 4);
            System.out.println("A " + a);
            OneColumnMatrix b = new OneColumnMatrix(3, 3);
            OneColumnMatrix c = new OneColumnMatrix(2, 3);
            c.setElement(1,1, -3);
            System.out.println("C " + c);
            b.setElement(0, 0, 1);
           // b.getElement(2,3);
            b.setElement(1, 2, 9);
            b.setElement(2, 2, 2);
            System.out.println("B " + b);
            System.out.println("Sum result A + C: \n" + a.sum(c));
            System.out.println("Prod result A * B: \n" + a.product(b));
           /* OneColumnMatrix a = new OneColumnMatrix(3,3);
            a.setElement(0,0,1);
            a.setElement(1,0, 1);
            System.out.println(a);
            OneColumnMatrix b= new OneColumnMatrix(3,3);
            b.setElement(0,0,1);
            b.setElement(1,0, 1);
            System.out.println(b);
            System.out.println("Result " + a.sum(b));


        }
        catch (NonSuitableMatrixException e){
            System.out.println (e);
        }
        catch (BadRangeMatrixException e){
            System.out.println (e);
        }*/


        //System.out.println("Result: " + a.getElement(1,2));

    }
}
