/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class DuckSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("mau pilih yang mana :");
        System.out.println("1. Mallard Duck :)");
        System.out.println("2. Rubber Duck :)");
        System.out.println("3. Decoy Duck :)");
        System.out.println("4. Model Duck :)");
        int pilih_bebek = scanner.nextInt();

        Duck duck = null;

        if (pilih_bebek == 1) {
            duck = new MallardDuck();
        } else if (pilih_bebek == 2) {
            duck = new RubberDuck();
        } else if (pilih_bebek == 3) {
            duck = new DecoyDuck();
        } else if (pilih_bebek == 4) {
            duck = new ModelDuck();
        } else {
            System.out.println("Nomer yang anda maksud tidak ada");
            return;
        }

        System.out.println("Pilihan anda : " + duck.getClass().getSimpleName());

        duck.performQuack();
        duck.performFly();
    }
}
