package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        console.close();
        System.out.println(Revers.reversString(str));
    }
}


