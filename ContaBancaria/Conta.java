package ContaBancaria;

public class Conta {
    public static void main (String[] args){
        AppConta p1 = new AppConta();
        p1.setnumConta(1111);
        p1.settipo("cc");
        p1.setdono("Jubileu");
        p1.setsaldo(300f);
        p1.setstatus(true);
        p1.statusAtual();

        AppConta p2 = new AppConta();
        p2.setnumConta(2222);
        p2.settipo("cp");
        p2.setdono("Creuza");
        p2.setsaldo(450f);
        p2.setstatus(true);
        p2.statusAtual();

    }
}
