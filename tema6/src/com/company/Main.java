package com.company;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fin = new FileReader("examene.txt");
        FileWriter fout = new FileWriter("media.txt");

        Scanner inFile = new Scanner(fin);
        PrintWriter outFile = new  PrintWriter(fout);

        int n=0;
        int[] v=new int[100];
        float ma=0;
        while(inFile.hasNext())
        {
            v[n]=inFile.nextInt();
            ma=ma+v[n];
            n++;
        }
        inFile.close();
        outFile.println("Media notelor este: "+ma/n);
        fout.close();
    }
}
