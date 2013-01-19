package net.pikanji.springencoder;

import java.util.Scanner;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class SpringEncoder {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter a string to encode:");

        Scanner scan = new Scanner(System.in);

        String org = scan.next();
        System.out.println("Original String: "+ org);

        StandardPasswordEncoder encoder = new StandardPasswordEncoder();
        String enc = encoder.encode(org);
        System.out.println("Encoded String: "+ enc);
    }

}
