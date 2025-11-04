import java.util.Scanner;

public class Pokemon {

    public static String estadopok1(int vida, String nombre, int defensa, int MP){
        String estado = "\nLa vida de " + nombre + " es: " + vida + " El MP es: " + MP + " La defensa es: " + defensa;
        return estado;
    }

    public static int queataque(String nombre){
        System.out.println("\nEs el turno de " + nombre);
        System.out.println("\nEscoge el ataque: ");
        System.out.println(" 1) Ataque normal ");
        System.out.println(" 2) Ataque especial ");
        Scanner sc = new Scanner(System.in);
        int vida = 150;
        int vida2 = 135;
        int ataque;
        ataque = sc.nextInt();
        while(ataque != 1 && ataque != 2){
                System.out.println("\nEso no es correcto, porfavor, introduce el ataque 1 o 2");
                ataque = sc.nextInt();
                System.out.println("\nHas escogido el ataque: " + ataque);
        }return ataque;
        }

    public static int dmgatq(int dmg, int defenemy, int vidaenemy){
        int vidafin;
        vidafin = vidaenemy - (dmg - defenemy) ;
        return vidafin;
    }

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

        System.out.println(estadopok1(vida1, pokemon1, defensa1, MP1));
        System.out.println(estadopok1(vida2, pokemon2, defensa2, MP2));

        boolean turnoRaichu = true;
        boolean turnoBulbassaur = false;
        Scanner sc = new Scanner(System.in);


        while (vida1 > 0 && vida2 > 0) {
            if (turnoRaichu == true){
                int opcion = queataque(pokemon1);
                if (opcion == 1) {
                    vida2 = dmgatq(dmg1 , defensa2, vida2);
                    System.out.println(pokemon1 + " Utiliza rayo contra " + pokemon2);
                } else if (opcion == 2) {
                    if(MP1 >= consumoatqespc) {
                        vida2 = dmgatq(dmgatqespc , defensa2, vida2);
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
                    int opcion2 = queataque(pokemon2);
                    if (opcion2 == 1) {
                        vida1 = dmgatq(dmg2, defensa1, vida1 );
                        System.out.println(pokemon2 + " Utiliza Látigo contra Raichu ");
                    } else if (opcion2 == 2) {
                        if(MP2 >= consumoatqespc) {
                            vida1 = dmgatq(dmgatqespc, defensa1, vida1);
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
























































