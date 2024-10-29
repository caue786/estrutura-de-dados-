public class TestePilha2 {
    public static void main (String[]args){
        Pilha2 p = new Pilha2(3);

        p.push("5");
        p.push("10");
        p.push("3");
        p.pop();
        p.push("8");
        p.pop();
        p.push("7");
        p.push("12");
        p.pop();
        p.imprimir();
    }
}
