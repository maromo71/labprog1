import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> livros = new Stack<>();
        livros.add("A Historia sem Fim");
        livros.add("Bigiganga");
        livros.add("Meu pe de laranja lima");
        System.out.println("Qtd: " + livros.size());
        System.out.println(livros);
        //Quem é o ultimo livro que inseri?
        System.out.println(livros.peek());
        System.out.println("Removendo: " + livros.pop());
        System.out.println("Removendo: " + livros.pop());
        System.out.println("Removendo: " + livros.pop());
        System.out.println(livros);
    }
}
