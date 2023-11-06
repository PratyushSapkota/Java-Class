package November6;

public class StringFunctions {
    public static void main(String[] args) {
        String string = "Pratyush";

        System.out.println("Equals");
        System.out.println(string.equals("hello"));

        System.out.println("To Lower Case");
        System.out.println(string.toLowerCase());

        System.out.println("To upper case");
        System.out.println(string.toUpperCase());

        System.out.println("Length");
        System.out.println(string.length());

        System.out.println("Index of 't'");
        System.out.println(string.indexOf('t'));

        System.out.println("Char at 'y'");
        System.out.println(string.charAt(5));

        System.out.println("concat");
        System.out.println(string.concat("Cool"));

        System.out.println("Replace h with a");
        System.out.println(string.replace('h', 'a'));

        System.out.println("Sub String");
        System.out.println(string.substring(4));


    }
}
