package ContaBancaria;

import java.util.Objects;

public class AppConta {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void statusAtual(){
        System.out.println ("----------------------------");
        System.out.println ("Conta: " + this.getnumConta());
        System.out.println ("Tipo " + this.gettipo());
        System.out.println ("Dono " + this.getdono());
        System.out.println ("Saldo " + this.getsaldo());
        System.out.println ("Status " + this.getstatus());
    }


    public AppConta(){
        saldo = 0;
        status = false;
    }

    public int getnumConta(){return this.numConta;}
    public void setnumConta(int n){this.numConta = n;}
    public String gettipo(){return this.tipo;}
    public void settipo(String t){this.tipo = t;}
    public String getdono(){return this.dono;}
    public void setdono(String d){this.dono = d;}
    public float getsaldo(){return this.saldo;}
    public float setsaldo(float s){return this.saldo = s;}
    public boolean getstatus(){return this.status;}
    public void setstatus(boolean st){this.status = st;}


    public void abrirConta (String t){
       this.settipo(t);
       this.setstatus (true);
       if (Objects.equals(t, "cc")) {
           saldo = 50;
           System.out.println ("Parabens, vc recebeu " + this.saldo + " reais de saldo inicial!");
       }
       else if (Objects.equals(t, "cp")) {
           saldo = 150;
           System.out.println ("Parabens, vc recebeu" + this.saldo + " reais de saldo inicial!");
       }
    }

    public void fecharConta(){
        if (this.getsaldo() > 0){
            System.out.println ("Saldo positivo! Vc não pode fechar sua conta agora.");
        }
        else if (this.getsaldo() < 0){
            System.out.println ("Saldo negativo! Vc não pode fechar sua conta agora.");
        }
        else if (! this.getstatus()){
            System.out.println("Sua conta será fechada!");
        }
    }

    public void depositar (float v){
        if (this.getstatus()) {
            System.out.println("Seu saldo é: " + this.setsaldo(this.getsaldo() + v));
        }
        else {
            System.out.println ("Depósito inválido");
        }
    }

    public void sacar (float v){
        if (this.getstatus() && this.getsaldo() >= v){
            System.out.println ("Saque realizado!");
            System.out.println ("Novo saldo: " + this.setsaldo(this.getsaldo() - v));
        }
        else {
            System.out.println ("Saque inválido!");
        }
    }

    public void pagarMensal (){
        int m = 0;
        if (this.getstatus() && Objects.equals(this.gettipo(), "cc")){
            m = 12;
            System.out.println ("Sua mensalidade é de: " + this.setsaldo(this.getsaldo() - m));
        }
        else if (this.getstatus() && Objects.equals(this.gettipo(), "cp")){
            m = 20;
            System.out.println ("Sua mensalidade é de: " + this.setsaldo(this.getsaldo() - m));
        }
        else{
            System.out.println ("Conta inativa.");
        }
    }
}
