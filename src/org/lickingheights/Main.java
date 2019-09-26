package org.lickingheights;

public class Main {

    public static void main(String[] args) {

        //todo declare variables a,b,c,discrimaniant, axisOfSymmetry,parabolaFacing, x,y
        double a,b,c,discrimainant,axisOfSymmetry,x,y;
        String parabolaFacing;

        // todo initialize manually
         a=5;
         b=3;
         c=1;
        // todo do calculations
        axisOfSymmetry = -b/(2*a);
        discrimainant =  (b*b)-4*(a*c);
        //todo print results
        System.out.println("Axis of Symmetry: +axisOfSymmetry");
        System.out.println("discriminant: +discriminant");
        // todo not in code check results
        if(discrimainant >0) {
            System.out.println("There are two real solutions");
        }
        else if(discrimainant == 0) {
            System.out.println("There is one real solutions");
        }
         System.out.println("There are NO real solutions");

        }
        // todo initilize scanner and redo the initialize area

        // todo double check results

        // write your code here
    }

