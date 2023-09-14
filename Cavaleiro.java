package Atividade2;

//Escolha número 1

public class Cavaleiro {

    public static void statusCavaleiro(Personagem pers) {
        pers.setClassePers("Cavaleiro");
        pers.setNivelPers(1);
        pers.setVidaPers(25);
        pers.setVidaMaxPers(25);
        pers.setAtaquePers(10);
        pers.setCriticoPers(5f);
        pers.setMagiaPers(0);
        pers.setManaPers(0);
        pers.setManaMaxPers(0);
        pers.setDefesaPers(6);
        pers.setEsquivaPers(5f);
    }
    public static void habilidadesCavaleiro() {
        System.out.println("        1 - Golpe de espada (0 mana)");
        System.out.println();
        System.out.println("        2 - Defesa de escudo (0 mana)");
        System.out.println();
        System.out.print("           -> ");
    }

    public static void subirNivelCavaleiro(Personagem pers) {
        System.out.println(" º ° + * º ° + * º ° + * º ° + * ° º * + ° º * + ° º * + ° º * + ° º+ *");
        System.out.println();
        System.out.println("                      * Você subiu de nível! *");
        System.out.println();
        System.out.println("                        - Vida:   " +pers.getVidaMaxPers() +" + 10");
        System.out.println();
        System.out.println("                        - Ataque: " +pers.getAtaquePers() +" + 3");
        System.out.println();
        System.out.println("                        - Defesa: " +pers.getDefesaPers() +" + 2");
        System.out.println();
        pers.setNivelPers(pers.getNivelPers() + 1);
        pers.setVidaMaxPers(pers.getVidaMaxPers() + 10);
        pers.setAtaquePers(pers.getAtaquePers() + 3);
        pers.setDefesaPers(pers.getDefesaPers() + 2);
        pers.setVidaPers(pers.getVidaMaxPers());
    }


}
