package ferreira.debora.introducao.javacore.ZZBclassesinternas.testes;

public class ClassesLocaisTeste {
    private String nome = " Debora";

    public void fazAlgumaCoisa() {
        String sobrenome = "Ferreira";
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }

    public static void main(String[] args) {
        ferreira.debora.introducao.javacore.ZZBclassesinternas.testes.ClassesLocaisTeste externa = new ferreira.debora.introducao.javacore.ZZBclassesinternas.testes.ClassesLocaisTeste();
        externa.fazAlgumaCoisa();
    }
}
