package org.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //todo declare variables a,b,c,discrimaniant, axisOfSymmetry,parabolaFacing, x,y
        double a,b,c,discrimainant,axisOfSymmetry,x,y;
        String parabolaFacing;
        Scanner radar;
        // todo initialize manually
        radar = new Scanner(System.in);
        System.out.println("Give ma an a");
        a = radar.nextDouble();
        System.out.println("Give ma an b");
        b = radar.nextDouble();
        System.out.println("Give ma an c");
        c = radar.nextDouble();
//        a=5;
//         b=3;
//         c=1;
        // todo do calculations
        axisOfSymmetry = -b/(2*a);
        discrimainant =  (b*b)-4*(a*c);
        //todo print results
        System.out.println("Axis of Symmetry: "+axisOfSymmetry);
        System.out.println("discriminant: "+discrimainant);
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

