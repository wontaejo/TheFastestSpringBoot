package com.example.app;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerArgumentResolver implements ArgumentResolver {
    @Override
    public Argument resolver(InputStream stream) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return new Argument(a, b);
    }
}
