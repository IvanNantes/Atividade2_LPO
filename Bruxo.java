package Atividade2;

//Escolha número 2

public class Bruxo {
    public static void statusBruxo(Personagem pers) {
        pers.setClassePers("Bruxo");
        pers.setNivelPers(1);
        pers.setVidaPers(12);
        pers.setVidaMaxPers(12);
        pers.setAtaquePers(2);
        pers.setCriticoPers(1);
        pers.setMagiaPers(18);
        pers.setManaPers(25);
        pers.setManaMaxPers(25);
        pers.setDefesaPers(2);
        pers.setEsquivaPers(5);
    }

    public static void habilidadesBruxo() {
        System.out.println("        1 - Golpe de Cajado (0 mana)");
        System.out.println();
        System.out.println("        2 - Bola de Fogo (5 mana)");
        System.out.println();
        System.out.println("        3 - Raio (2 mana)");
        System.out.println();
        System.out.print("           -> ");
    }

    public static void subirNivelBruxo(Personagem pers) {
        System.out.println(" º ° + * º ° + * º ° + * º ° + * ° º * + ° º * + ° º * + ° º * + ° º+ *");
        System.out.println();
        System.out.println("                      * Você subiu de nível! *");
        System.out.println();
        System.out.println("                      - Vida:      " +pers.getVidaMaxPers() +" + 4");
        System.out.println();
        System.out.println("                      - Magia:     " +pers.getMagiaPers() +" + 5");
        System.out.println();
        System.out.println("                      - Mana:      " +pers.getManaMaxPers() +" + 5");
        System.out.println();
        System.out.println("                      - % Esquiva: " +pers.getEsquivaPers() +" + 4.0");
        System.out.println();
        pers.setNivelPers(pers.getNivelPers() + 1);
        pers.setVidaMaxPers(pers.getVidaMaxPers() + 4);
        pers.setMagiaPers(pers.getMagiaPers() + 5);
        pers.setEsquivaPers(pers.getEsquivaPers() + 4);
        pers.setManaMaxPers(pers.getManaMaxPers() + 5);
        pers.setVidaPers(pers.getVidaMaxPers());
        pers.setManaPers(pers.getManaMaxPers());

    }
}
