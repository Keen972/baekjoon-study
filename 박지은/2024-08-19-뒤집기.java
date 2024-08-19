import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        int zeroFlipCount = 0;
        int oneFlipCount = 0;
        char previousChar = S.charAt(0);

        if (previousChar == '0') {
            zeroFlipCount++;
        } else {
            oneFlipCount++;
        }

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != previousChar) {
                if (S.charAt(i) == '0') {
                    zeroFlipCount++;
                } else {
                    oneFlipCount++;
                }
                previousChar = S.charAt(i);
            }
        }

        System.out.println(Math.min(zeroFlipCount, oneFlipCount));
    }
}
