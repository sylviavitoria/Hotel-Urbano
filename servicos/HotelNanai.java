package servicos;
import java.util.Scanner;

public class HotelNanai {
    
    public static void main(String[] args) {
        try (Scanner input_do_menu = new Scanner(System.in)) {
            int repeticao = 1;
            while (repeticao < 2 ){
                System.out.println("\n-----------------------------------\nSEJA BEM VINDO(A) AO HOTEL NANAI\n-----------------------------------");
                System.out.println("\n[1] HOTEL NANAI");
                System.out.println("[2] CADASTRO   |"+"  CONSULTAS  |"+"  RESERVA  |"+ "  EXCLUIR");
                System.out.println(">" );
                int forma_de_cadastro;
                forma_de_cadastro = input_do_menu.nextInt();
                System.out.println("\n");
                System.out.println("\n");
                
                
                
                switch (forma_de_cadastro){
                    case 1:
                        HotelNanaiExemplo exemplo = new HotelNanaiExemplo();
                        exemplo.ver_Hotel_Nanai();
                        break;
                        
                    
                    case 2:
                        SubMenu clienteservicoteste= new SubMenu();
                        clienteservicoteste.ver_e_add_cliente();
                        break;
                }
            }
        }
    }
}