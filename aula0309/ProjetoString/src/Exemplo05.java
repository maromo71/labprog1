public class Exemplo05 {
    public static void main(String[] args) {
        String nomes[] = {"Maria Antonia", "Pedro Paulo", "Maria Silva"};
        for(String nome : nomes){
            if(nome.startsWith("Maria")){
                System.out.println(nome);
            }
        }
    }
}
