import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {

        String pokemon1 = "Raichu";
        int vida1 = 150;
        int defensa1 = 10;
        int MP1 = 70;
        int dmg1 = 35;
        int dmgatqespc = 85;
        int consumoatqespc = 65;
        String atqespecial = "Castigo Eléctrico";

        String pokemon2 = "Bulbassaur";
        int vida2 = 135;
        int defensa2 = 10;
        int dmg2 = 29;
        int MP2 = 65;
        int dmgatqespc2 = 75;
        int consumoatqespc2 = 40;
        String atqespecial2 = "Madre Naturaleza";

        System.out.println(pokemon1 + " vida: " + vida1 + " MP: " + MP1 + " dmg: " + dmg1);
        System.out.println(pokemon2 + " vida: " + vida2 + " MP: " + MP2 + " dmg: " + dmg2);
        System.out.println("\n");
        System.out.println("¡Comienza la batalla entre: " + pokemon1 + " y " + pokemon2 + "!");

        boolean turnoRaichu = true;
        boolean turnoBulbassaur = false;
        Scanner sc = new Scanner(System.in);


        while (vida1 > 0 && vida2 > 0) {
            if (turnoRaichu == true){
                System.out.println("\nEs el turno de Raichu! ");
                System.out.println("\nEscoge qué ataque quieres hacer: ");
                System.out.println(" 1) Ataque normal ");
                System.out.println(" 2) Ataque especial ");
                int opcion = sc.nextInt();

                if (opcion == 1) {
                    int danhototal = dmg1 - defensa2;
                    vida2 -= danhototal;
                    System.out.println(pokemon1 + " Utiliza rayo contra " + pokemon2);
                } else if (opcion == 2) {
                    if(MP1 >= consumoatqespc) {
                        int danhototal = dmgatqespc - defensa2;
                        vida2 -= danhototal;
                        MP1 -= consumoatqespc;
                        System.out.println(pokemon1 + " Utiliza " + atqespecial);
                    }else if (MP1 <= consumoatqespc) {
                        System.out.println("No tienes suficientes Magic Points! ");
                    }
                }
            }
            turnoRaichu = !turnoRaichu;
            {
                if (turnoBulbassaur == true) {
                    System.out.println(" Es el turno de Bulbassaur! ");
                    System.out.println("\nEscoge el ataque: ");
                    System.out.println(" 1) Ataque normal ");
                    System.out.println(" 2) Ataque especial ");
                    Scanner sc1 = new Scanner(System.in);
                    int opcion2 = sc.nextInt();

                    if (opcion2 == 1) {
                        int danhototal = dmg2 - defensa1;
                        vida1 -= danhototal;
                        System.out.println(pokemon2 + " Utiliza Látigo contra Raichu ");
                    } else if (opcion2 == 2) {
                        if(MP2 >= consumoatqespc) {
                            int danhototal = dmgatqespc2 - defensa1;
                            vida1 -= danhototal;
                            MP2 -= consumoatqespc2;
                            System.out.println(pokemon2 + " Utiliza Madre Naturaleza contra Raichu ");
                        }else if (MP2 <= consumoatqespc2) {
                            System.out.println(" No tienes suficientes Magic Points!");

                        }
                    }
                }
            }turnoBulbassaur = !turnoBulbassaur;

        }
        System.out.println("\nBatalla terminada");
        if(vida1 <= 0){
            System.out.println(pokemon2 + " ha ganado la batalla ");
        } else if (vida2 <= 0) {
            System.out.println(pokemon1 + " ha ganado la batalla ");
        }


    }
}
























































