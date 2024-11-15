public String toString() {
    return "Numero: " + this.numero + ", Agencia: " + this.agencia;
}
public class Teste {

    public static void main(String[] args) {

        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);

        System.out.println(cc);
        System.out.println(cp);
    }
}
Numero: 33, Agencia: 22 
Numero: 22, Agencia: 33

public String toString() {
    return "ContaPoupanca, " + super.toString();
}

public String toString() {
    return "ContaCorrente, " + super.toString();
}
ContaCorrente, Numero: 33, Agencia: 22 
ContaPoupanca, Numero: 22, Agencia: 33
