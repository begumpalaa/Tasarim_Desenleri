package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Telephone telephone = Telephone.TelephoneBuilder.aTelephone().withMarka("Apple")
                .withGb(64).withRenk("Beyaz").build();

        System.out.println(telephone);
    }
}