package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String k = in.nextLine();
        String[] massivS = k.split(" ");
        double x = Double.valueOf(massivS[0]);
        double y = Double.valueOf(massivS[1]);
        if ((x*x+y*y<=1) || (y>=0 && y<=1 && x<=1 && x>=0 && x*x+y*y>=1))//9
        //if ((y<=1 && x>=0 && y>=x-1) || (x>=0 && x*x+y*y<=1))//8
        //if ((x<=1 && y>1-x && y>=2*x*x) || (x>=0 && x<1 && y>=1-x))//7
        //if ((y>=-x && x*x+y*y<=1) || (y<=x && x*x+y*y<=1))//6
        //if ((y>=x && x*x+y*y<=1) || (x<=0 && y<=x && x*x+y*y<=1))//5
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        /*String k = in.nextLine();
        String[] massivS = k.split(" ");
        double x = Double.valueOf(massivS[0]);
        double y = Double.valueOf(massivS[1]);
        if (y>=x*x-2 && (y<=-x || y<=x))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }*/
        /*String k = in.nextLine();
        String[] massivS = k.split(" ");
        double x = Double.valueOf(massivS[0]);
        double y = Double.valueOf(massivS[1]);
        if ((y<=2-x*x && x>=0 && y>=0) || (y<=2-x*x && y>=x))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }*/

        /*String k = in.nextLine();
        String[] massivS = k.split(" ");
        double x = Double.valueOf(massivS[0]);
        double y = Double.valueOf(massivS[1]);
        if (y<=0.5 && x>=0 && y>=0 && y<=Math.sin(x) && x>=0 && x<=Math.PI)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }*/


        /*String k = in.nextLine();
        String[] massivS = k.split(" ");
        Float x = Float.valueOf(massivS[0]);
        Float y = Float.valueOf(massivS[1]);
        if (x<=2 && y>=0 && y<=x && x*x+y*y>=4)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }*/

    }
}
