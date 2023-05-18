import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner LeitorNumero = new Scanner (System.in);
  int Numero, Fat = 1;
  System.out.println("Digite o numero a ser fatoriado:");
  Numero = LeitorNumero.nextInt();
  for (int i = 1; i <= Numero; i++) {
	  Fat = Fat * i;
	  

	  
  }
  System.out.println (Numero + " ! = " + Fat);
	}

}
