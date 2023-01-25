package day53_FunctionalInterface;

public class LambdaExpressions {
    public static void main(String[] args) {

/*
MyThirdFuntionalInterface<String> StringReverse=(T)->{
    String reverse="";
    for (int i = T.split("").length - 1; i >= 0; i--) {
        reverse+=T.charAt(i);
    }

    return reverse;
};

String result=StringReverse.method("Cevriye");

        System.out.println(result);

 */

        MyThirdFuntionalInterface<String> stringReverse =
                (s) -> {
                    String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;
                };

        String result = stringReverse.method("Wooden Spoon");

        System.out.println(result);

        //create a function that can return the cube of an integer





    }
}
