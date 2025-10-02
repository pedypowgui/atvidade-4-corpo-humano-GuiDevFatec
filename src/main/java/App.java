//package main.java; -> Tirei essa linha porque estava dando erro no meu computador, não estava conseguindo acessar a classe "CorpoHumano"
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in); 

        double massa, volume, densidade, altura, imc;

    //Entrada dos dados do usuário
        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        System.out.printf("Digite a massa inicial(kg): ");
        massa = ler.nextDouble();
        
        System.out.printf("Digite o volume inicial(m³): ");
        volume = ler.nextDouble();
        
        System.out.printf("Digite a densidade inicial(kg/m³): ");
        densidade = ler.nextDouble();
        
        System.out.printf("Digite a altura inicial(m): ");
        altura = ler.nextDouble();

    //Iniciando valores de entrada em um novo objeto
        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);
        c1.massa = "2"; 

    //Calculando imc
        imc = c1.calcularIMC();

    //Saída de dados    
        System.out.println("\n=== VALORES INICIAIS ===");
        System.out.println("Massa: " + c1.getMassa() + "kg");
        System.out.println("Volume: " + c1.getVolume() + "m³");
        System.out.println("Densidade: " + c1.getDensidade() + "kg/m³");
        System.out.println("Altura: " + c1.getAltura() + "m");
        System.out.println("IMC: " + imc + "\n");
    
    //Segunda entrada de dados
        System.out.printf("Digite uma nova massa(kg): ");
        massa = ler.nextDouble();
        
        System.out.printf("Digite uma nova altura(m): ");
        altura = ler.nextDouble();
    
    //Usando os setter para atribuir valor aos atributos do objeto c1
        c1.setMassa(massa);
        c1.setAltura(altura);

    //Calculando imc novamente
        imc = c1.calcularIMC();

    //Segunda saída de dados
        System.out.println("\n=== NOVOS VALORES ===");
        System.out.println("Massa: " + c1.getMassa());
        System.out.println("Altura: " + c1.getAltura());
        System.out.println("IMC: " + imc + "\n");
    }
}
