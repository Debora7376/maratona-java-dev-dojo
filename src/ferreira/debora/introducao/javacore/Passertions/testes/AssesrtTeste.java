package ferreira.debora.introducao.javacore.Passertions.testes;

public class AssesrtTeste {
    public static void main(String[] args) {
        diasDaSemana(6);
    }

    private static void diasDaSemana(int dia){
      switch (dia) {
          case 1:break;
          case 2:break;
          case 3:break;
          case 4:break;
          case 5:break;
          case 6:break;
          case 7:break;
          default:assert false;
      }
    }
}
