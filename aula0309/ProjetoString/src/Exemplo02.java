public class Exemplo02 {
    public static void main(String[] args) {
        Exemplo02 objeto = new Exemplo02();
        String texto = "Brasil não ganhou nada na copa do mundo";
        int tamanho = texto.length(); //qtd de caracteres do texto
        //Caracteres de acordo com o mapa charAt (numero na tabela ascii)
        for(int i=0; i<texto.length(); i++){
            System.out.printf("%d ",(int)texto.charAt(i));
        }
        char[] pais = new char[6];
        texto.getChars(0, 6, pais, 0);
        System.out.println();
        System.out.println(pais);
        System.out.println(88.8);
        objeto.imprimir();
        objeto.imprimir("Maria das Dores");
    }

    public void imprimir(){
        System.out.println("ola Mamae");
    }
    public void imprimir(String nome){
        System.out.println("ola " + nome);
    }
}
