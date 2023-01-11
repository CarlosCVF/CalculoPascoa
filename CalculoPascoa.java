import java.util.Scanner;
public class CalculoPascoa {
public static void main(String[] args)
    {
    Scanner ler = new Scanner(System.in);
     int anoUsuario, divisao;
        System.out.print("Digite um ano aleatório: ");
            anoUsuario = ler.nextInt();
                divisao = ((anoUsuario%19)+1);

        System.out.print("A data corresponde é o próximo domingo após essa data: ");
        switch(divisao)
        {
            case 1: System.out.print("14 de abril");
            break;
            case 2: System.out.print("03 de abril");
            break;
            case 3: System.out.print("23 de março");
            break;
            case 4: System.out.print("11 de abril");
            break;
            case 5: System.out.print("31 de março");
            break;
            case 6: System.out.print("18 de abril");
            break;
            case 7: System.out.print("08 de abril");
            break;
            case 8: System.out.print("28 de março");
            break;
            case 9: System.out.print("16 de abril");
            break;
            case 10: System.out.print("05 de abril");
            break;
            case 11: System.out.print("25 de março");
            break;
            case 12: System.out.print("13 de abril");
            break;
            case 13: System.out.print("02 de abril");
            break;
            case 14: System.out.print("22 de março");
            break;
            case 15: System.out.print("10 de abril");
            break;
            case 16: System.out.print("30 de março");
            break;
            case 17: System.out.print("17 de abril");
            break;
            case 18: System.out.print("07 de abril");
            break;
            case 19: System.out.print("27 de março");
            break;
        }
    }
}