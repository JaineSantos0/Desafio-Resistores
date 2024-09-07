package application;

import services.ResistorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String valorEmOhms = sc.nextLine();

        ResistorService resistorService = new ResistorService();

        resistorService.converteValorDoResistor(valorEmOhms);
    }
}