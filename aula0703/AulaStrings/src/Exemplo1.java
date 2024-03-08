public class Exemplo1 {
    public static void main(String[] args) {
        String mensagem = "Olá sala do 5. período";
        System.out.println("Total de Letras: ");
        System.out.println(mensagem.length());
        System.out.println(mensagem.charAt(2));
        for(char letra : mensagem.toCharArray()){
            System.out.println(letra);
        }

    }
}
