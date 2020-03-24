	import java.io.*;

	import java.util.*;


public class KiranStarQuestion {

    int numoflines;

    int numofspaces;

    int numofstars;

    int numofchars;

    int numofmaxchars;

              public static void main (String[] args) {

                  KiranStarQuestion prob = new KiranStarQuestion();

                  Scanner sc = new Scanner(System.in);

                  System.out.println("How many lines you want bruv?");

                  prob.numoflines=sc.nextInt();

                  prob.logic();

              }

              public void logic(){

        numofmaxchars=1+2*(numoflines-1);

                  for(int i=1;i<=numoflines;i++)

                  {

                      linelogic(i);

                  }

              }

              public void linelogic(int linenum){

                  numofstars = 1+2*(linenum-1);

                  numofchars = numofmaxchars - (numoflines-linenum);

                  numofspaces = numofchars-numofstars;

        lineprinting();

              }


      public void lineprinting(){

      System.out.println();

     for(int m=0;m<numofspaces;m++){

            System.out.print(" ");

        }

      for(int i=0;i<numofstars;i++){

          System.out.print("*");
      }

    }

}
