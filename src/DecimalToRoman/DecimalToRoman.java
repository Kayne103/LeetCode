package DecimalToRoman;

public class DecimalToRoman {

    // convert decimal to roman
    public String convert(int num) {
        StringBuilder sb = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                sb.append(strs[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        DecimalToRoman dtr = new DecimalToRoman();
        System.out.println(dtr.convert(2000000));
    }
}
