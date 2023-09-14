package Atividade2;

//Escolha número 3

public class Cacador {     //ERA PRA SER CAÇADOR, MAS NÃO PODE USAR O "Ç". EU ODEIO INGLÊS!!!!!!!!!!!!!!!!!!!!!!
    public static void statusBruxo(Personagem pers) {
        pers.setClassePers("Caçador");
        pers.setNivelPers(1);
        pers.setVidaPers(18);
        pers.setVidaMaxPers(18);
        pers.setAtaquePers(14);
        pers.setCriticoPers(20);
        pers.setMagiaPers(0);
        pers.setManaPers(10);
        pers.setManaMaxPers(10);
        pers.setDefesaPers(4);
        pers.setEsquivaPers(20);
    }

    public static void habilidadesCacador() {
        System.out.println("        1 - Tiro de Balestra (0 mana)");
        System.out.println();
        System.out.println("        2 - Medicina de campo (2 mana)");
        System.out.println();
        System.out.print("           -> ");
    }

    public static void subirNivelCacador(Personagem pers) {
        System.out.println(" º ° + * º ° + * º ° + * º ° + * ° º * + ° º * + ° º * + ° º * + ° º+ *");
        System.out.println();
        System.out.println("                      * Você subiu de nível! *");
        System.out.println();
        System.out.println("                      - Vida:      " +pers.getVidaMaxPers() +" + 6");
        System.out.println();
        System.out.println("                      - Ataque:    " +pers.getAtaquePers() +" + 4");
        System.out.println();
        System.out.println("                      - % Crítico: " +pers.getCriticoPers() +" + 10.0");
        System.out.println();
        System.out.println("                      - % Esquiva: " +pers.getEsquivaPers() +" + 5.0");
        System.out.println();

        pers.setNivelPers(pers.getNivelPers() + 1);
        pers.setVidaMaxPers(pers.getVidaMaxPers() + 6);
        pers.setAtaquePers(pers.getAtaquePers() + 4);
        pers.setCriticoPers(pers.getCriticoPers() + 10);
        pers.setEsquivaPers(pers.getEsquivaPers() + 5);
        pers.setVidaPers(pers.getVidaMaxPers());
        pers.setManaPers(pers.getManaMaxPers());
    }
}
