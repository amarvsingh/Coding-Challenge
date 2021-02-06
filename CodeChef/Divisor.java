import java.io.*;
import java.lang.*;
import java.util.*;

class Divisor {

    public static int highestDivisor(int n) {
        int i;
        for (i = 10; i > 0; i--) {
            if (n % i == 0) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int solution = highestDivisor(n);
        System.out.println(solution);
    }
}