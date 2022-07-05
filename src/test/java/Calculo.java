import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Operacoes o = new Operacoes();
    
      o.soma(1, 2);
      
     
      o.dividir(10, 2);
      
     
      o.mutiplicar(20, 230);
    		 
    
      o.subitrair(8000, 2120);
     
    
      o.z(443, 330, 230, 350, 4330);
    
      
      
     Scanner scanner = new Scanner(System.in);
     System.out.println("Digite o primeiro valor para somar:");
     int v1 = scanner.nextInt();
     System.out.println("Digite o segundo valor:");
     int v2 = scanner.nextInt();
    
    
    o.soma(v1, v2);
    
    Scanner scanner1 =  new Scanner(System.in);
    System.out.println("Digite o primeiro valor para dividir:");
    int v3 = scanner1.nextInt();
    System.out.println("Seugndo valor:");
    int v4 =scanner1.nextInt();
    
    o.dividir(v3, v4);
    
    Scanner scanner2 =  new Scanner(System.in);
    System.out.println("Digite o primeiro valor para mutiplicar:");
    int v5 = scanner2.nextInt();
    System.out.println("Segundo valor:");
    int v6 =scanner2.nextInt();
    
    o.mutiplicar(v5, v6);
    
    Scanner scanner3 =  new Scanner(System.in);
    System.out.println("Digite o primeiro valor para subtrair:");
    int v8 = scanner3.nextInt();
    System.out.println("Segundo valor:");
    int v7 =scanner3.nextInt();
    
    o.subitrair(v8, v7);
	}

}
