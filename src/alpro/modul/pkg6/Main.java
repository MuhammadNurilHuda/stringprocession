package alpro.modul.pkg6;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void StringBuilder() throws IOException {
        String input;
        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan String : ");
        input = bf.readLine();
        
        //pembuatan objek StringBuilder
        StringBuilder input1 = new StringBuilder();
        
        // append (menambahkan) string ke StringBuilder input1
        input1.append(input);
        
        // reverse StringBuilder input1
        input1.reverse();
        
        // print reverse String
        System.out.println(input1);
    }

    public static void String() throws IOException {
        String input;
        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan String : ");
        input = scan.nextLine();
        char[] Reverse = input.toCharArray();
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(Reverse[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. String Builder"
                + "\n2. String\n");
        int input = scan.nextInt();
        switch (input) {
            case 1:
                StringBuilder();
                break;
            case 2:
                String();
            default:
                break;
        }
    }
}
