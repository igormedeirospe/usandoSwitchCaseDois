import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    int mes;
    mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de 1 a 12"));

    switch (mes){

    case 1: case 2: case 3: case 4: case 5:
    System.out.println("O mes esta entre 1 e 5");
    break;
    case 6: case 7: case 8: case 9: case 10:
        System.out.println("O mes esta entre 6 e 10");
        break;
        case 11: case 12:
            System.out.println("O mes esta entre 11 e 12");
            break;
        default: System.out.println("O mes esta invalido");
    }




        }
    }
