package net.pikanji.springencoder;

import java.util.Scanner;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class SpringEncoder {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("暗号化する文字列を入力して下さい。");

        Scanner scan = new Scanner(System.in);

        String org = scan.next();
        System.out.println("元の文字列: "+ org);

        StandardPasswordEncoder encoder = new StandardPasswordEncoder();
        String enc = encoder.encode(org);
        System.out.println("暗号化した文字列: "+ enc);
    }

}
