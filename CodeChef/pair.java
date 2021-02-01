// Question for the solution Below:
// https://www.codechef.com/problems/SUMPOS

import java.io.*;
import java.lang.*;
import java.util.*;

class Pair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t != 0) {
            String input = br.readLine();
            String[] inputStream = input.split(" ");
            int firstNumber = Integer.parseInt(inputStream[0]);
            int thirdNumber = Integer.parseInt(inputStream[1]);
            int secondNumber = Integer.parseInt(inputStream[2]);
            if (firstNumber + secondNumber == thirdNumber) {
                System.out.println("YES");
            } else {
                if (secondNumber + thirdNumber == firstNumber) {
                    System.out.println("YES");
                } else {
                    if (thirdNumber + firstNumber == secondNumber) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
            t--;
        }
    }
}