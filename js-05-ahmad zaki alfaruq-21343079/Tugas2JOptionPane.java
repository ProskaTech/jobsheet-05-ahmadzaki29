/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
import javax.swing.JOptionPane;

public class Tugas2JOptionPane {
    public static void main(String[] args){
        String word1 = "", word2 = "";
    
        word1 = JOptionPane.showInputDialog("Enter word 1 : ");
        word2 = JOptionPane.showInputDialog("Enter word 2 : ");
    
        String msg = word1+ " "+word2 + " Hello";
    
        JOptionPane.showMessageDialog(null, msg);
    
        System.out.println(word1 +"."+ " "+word2 + " Hello");
    }
}