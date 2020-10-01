package String;

import java.util.Scanner;

public class ConvertToRoman {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t >0){
            int N = sc.nextInt();
            ToRoman toRoman = new ToRoman();
            System.out.println(toRoman.convertToRoman(N));

        }
    }
}

class ToRoman{

    private Numeral[] numerals = {
            new Numeral("M", 1000),
            new Numeral("CM", 900),
            new Numeral("D", 500),
            new Numeral("CD", 400),
            new Numeral("C", 100),
            new Numeral("XC", 90),
            new Numeral("L", 50),
            new Numeral("XL", 40),
            new Numeral("X", 10),
            new Numeral("IX", 9),
            new Numeral("V", 5),
            new Numeral("IV", 4),
            new Numeral("I", 1)
    };

    public String convertToRoman(int num){
        String result = "";

        for (Numeral numeral : numerals){
            int numberOfSymbol  = num/numeral.value;
            if (numberOfSymbol != 0) result += numeral.symbol.repeat(numberOfSymbol);
            num %= numeral.value;
        }
        return result;
    }

    public class Numeral{
        public String symbol;
        public int value;

        public Numeral(String symbol, int value){
            this.symbol = symbol;
            this.value = value;
        }
    }
}
