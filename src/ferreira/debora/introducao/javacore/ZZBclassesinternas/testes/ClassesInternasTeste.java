package ferreira.debora.introducao.javacore.ZZBclassesinternas.testes;

public class ClassesInternasTeste {
    private String nome = "Debora Jedi do DevDojo";

    class Interna {
        public void verClasseExterna() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ferreira.debora.introducao.javacore.ZZBclassesinternas.testes.ClassesInternasTeste.this);
        }
    }

    public static void main(String[] args) {
        ferreira.debora.introducao.javacore.ZZBclassesinternas.testes.ClassesInternasTeste externa = new ferreira.debora.introducao.javacore.ZZBclassesinternas.testes.ClassesInternasTeste();
        ferreira.debora.introducao.javacore.ZZBclassesinternas.testes.ClassesInternasTeste.Interna in = externa.new Interna();
        ferreira.debora.introducao.javacore.ZZBclassesinternas.testes.ClassesInternasTeste.Interna in2 = new ferreira.debora.introducao.javacore.ZZBclassesinternas.testes.ClassesInternasTeste().new Interna();
        in.verClasseExterna();
//        in2.verClasseExterna();
    }
}
