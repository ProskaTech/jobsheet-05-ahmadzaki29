/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
import java.util.Scanner;

public class Tugas1Scanner {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = in.nextLine();

        System.out.print("Enter word2: ");
        String word2 = in.nextLine();

        System.out.print("Enter word3: ");
        String word3 = in.nextLine();

        System.out.println(word1+" "+word2+" "+word3);
}
}
