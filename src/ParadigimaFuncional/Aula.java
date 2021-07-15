package ParadigimaFuncional;

public class Aula {
    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
            System.out.println(valor);
            return valor;
        };
        funcao1.gerar( "Joao");
        }
}

interface Funcao1 {
    String gerar(String valor);
}