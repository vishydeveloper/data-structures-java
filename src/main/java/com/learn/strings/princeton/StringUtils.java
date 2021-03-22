package com.learn.strings.princeton;

public class StringUtils {

    public static String reverse(String s) {
        int length = s.length();
        if (length <= 1)
            return s;

        String a = s.substring(0, length / 2);
        String b = s.substring(length / 2, length);

        return reverse(b) + reverse(a);
    }

    public static String random(int N) {
        if (N == 0)
            return "";
        if (N == 1)
            return "A" + StdRandom.uniform(26);
        return random(N/2) + random(N - N/2);
    }

    public static int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    public static String mystery(String s, String t) {
        int N = s.length();
        if (N <= 1) return s + t;
        String a = mystery(s.substring(0, N/2), t.substring(0, N/2));
        String b = mystery(s.substring(N/2, N), t.substring(N/2, N));
        return a + b;
    }

    public static void main(String[] args) {
//        System.out.println(reverse("Vishwanath Is Great"));
//        System.out.println(random(10));
//        System.out.println(hex2decimal("Test String"));
        System.out.println(mystery("Ravi", "Raja"));
    }
}
