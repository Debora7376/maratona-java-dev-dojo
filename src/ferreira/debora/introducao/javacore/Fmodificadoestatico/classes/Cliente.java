package ferreira.debora.introducao.javacore.Fmodificadoestatico.classes;

public class Cliente {
    // 1 - Bloco de inicializacao estatico é executado quando a JVM carregar a classe (é executado apenas 1 vez)
    // 2 - Alocado espaco na memoria para o objeto que sera criado
    // 3 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 4 - Bloco de inicializacao é executado
    // 5 - O construtor é executado

    private static int[] parcelas;

    static {
        parcelas = new int [100];
        System.out.println("Dentro do bloco de inicializacao");
        for ( int i=1; i <= 100; i++) {
           parcelas[i-1] = i;
        }
    }

    public Cliente(){

    }

    public static int[] getParcelas() {
        return parcelas;
    }
}
