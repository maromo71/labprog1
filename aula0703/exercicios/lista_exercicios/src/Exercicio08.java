public class Exercicio08 {
    public static void main(String[] args) {
        String input = "Esse é um exemplo de frase com palavrão.";
        String censored = censorProfanity(input, "palavrão");
        System.out.println(censored);
    }

    public static String censorProfanity(String text, String profanity) {
        int index = text.indexOf(profanity);
        if (index != -1) {
            StringBuffer buffer = new StringBuffer(text);
            for (int i = 0; i < profanity.length(); i++) {
                buffer.setCharAt(index + i, '*');
            }
            return buffer.toString();
        }
        return text;
    }
}

