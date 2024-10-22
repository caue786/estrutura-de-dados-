public class Lista001 {
    // Variáveis de instância
    private String lista[];
    private int tamanho;

    // Construtor correto
    public Lista001(int tamanhoMaximo) {
        lista = new String[tamanhoMaximo];  // Cria o array com o tamanho máximo
        this.tamanho = 0;  // Inicializa o tamanho como 0
    }

    // Método para verificar se a lista está cheia
    public boolean cheia() {
        return lista.length == tamanho;  // A lista está cheia quando o tamanho for igual à capacidade
    }

    // Método para verificar se a lista está vazia
    public boolean vazia() {
        return tamanho == 0;  // A lista está vazia se o tamanho for 0
    }
    
    // Método main
    public static void main(String[] args) {
        // Exemplo de uso da classe
        Lista001 listaExemplo = new Lista001(10);  // Cria uma lista com capacidade para 10 elementos

        // Testando se a lista está vazia
        System.out.println("A lista está vazia? " + listaExemplo.vazia());

        // Testando se a lista está cheia
        System.out.println("A lista está cheia? " + listaExemplo.cheia());
    }
}
