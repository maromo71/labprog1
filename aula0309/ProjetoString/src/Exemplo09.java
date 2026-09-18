public class Exemplo09 {
    public static void main(String[] args) {
        String familias[] = {
            "Ana Melo",
            "Pedro Barbosa",
            "Paula Melo",
            "Carlos Conceicao",
            "Rodolfo Melo",
            "Maria Melo Silva"
        };
        int totalMelo = 0;
        for(String nome : familias){
            if(nome.contains("Melo")) totalMelo++;
        }
        System.out.println("Total de membros da familia Melo: " + totalMelo);
    }
}
