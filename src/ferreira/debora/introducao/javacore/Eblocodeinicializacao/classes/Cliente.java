package ferreira.debora.introducao.javacore.Eblocodeinicializacao.classes;

public class Cliente {
    private static int[] parcelas;
    // 1 - Alocado espaco na memoria para o objeto que sera criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicializacao é executado
    // 4 - O construtor é executado

    static
    {
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
