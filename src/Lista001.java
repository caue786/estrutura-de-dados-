public class Lista001 {
    public static void main(String[] args) {

        private String lista[];
        private int tamanho;

        Listas(int tamanho) {
            lista = new String[tamanho];
            tamanho = 0;
        }

        boolean cheia() {
         return lista.length == tamanho;
        }

        Boolean vazia() {
            if (tamanho == 0) {
                return true;
            } else {
                return false;
            }

        }
    }
}
