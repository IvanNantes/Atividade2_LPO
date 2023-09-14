package Atividade2;

import java.sql.SQLOutput;

public class FichaPersonagem {
    public void Ficha(Personagem pers) {

        System.out.println("º*._________________________________________________________________.*º");
        System.out.println();
        System.out.println("   - Nome:   " + pers.getNomePers());
        System.out.println("   - Classe: " + pers.getClassePers());
        System.out.println();
        System.out.println("   - Nível:  " + pers.getNivelPers());
        System.out.println();
        System.out.println(" º ° + * º ° + * º ° + * º ° Status ° º * + ° º * + ° º * + ° º * + ° º  ");
        System.out.println();
        System.out.println("   - Vida:      " + pers.getVidaPers() + " / " + pers.getVidaMaxPers());
        System.out.println();
        System.out.println("   - Ataque:    " + pers.getAtaquePers());
        System.out.println();
        System.out.println("   - % Crítico: " + pers.getCriticoPers() + "%");
        System.out.println();
        System.out.println("   - Magia:     " + pers.getMagiaPers());
        System.out.println();
        System.out.println("   - Mana:      " + pers.getManaPers() + " / " + pers.getManaMaxPers());
        System.out.println();
        System.out.println("   - Defesa:    " + pers.getDefesaPers());
        System.out.println();
        System.out.println("   - % Esquiva  " + pers.getEsquivaPers() + "%");
        System.out.println();
        System.out.println(" º ° + * º ° + * º ° + * º ° + * ° º * + ° º * + ° º * + ° º * + ° º+ *");

        switch (pers.getClassePers()) {  //Habilidades das Classes
            case "Cavaleiro":
                System.out.println("=-_-=-_-=-_-=-_-=-_-=-_-=-_-Habilidades-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=");
                System.out.println();
                System.out.println("    * Golpe de espada   (1)");
                System.out.println("      0 Mana");
                System.out.println();
                System.out.println("     - Descrição - ");
                System.out.println("               Você ataca o inimigo com sua espada, causando dano igual");
                System.out.println("       seu status de ataque [" + pers.getAtaquePers() + "]");
                System.out.println();
                System.out.println();
                System.out.println("    * Defesa de escudo  (2)");
                System.out.println("      0 Mana");
                System.out.println();
                System.out.println("     - Descrição - ");
                System.out.println("               Você levanta seu escudo na direção do inimigo, deixando sua");
                System.out.println("      defesa + 4 + nivel x 2 [" + (pers.getDefesaPers() + 4 + (pers.getNivelPers()) * 2) + "]");
                System.out.println();
                System.out.println("=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=");

                break;
            case "Bruxo":
                System.out.println("=-_-=-_-=-_-=-_-=-_-=-_-=-_-Habilidades-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=");
                System.out.println();
                System.out.println("    * Golpe de Cajado   (1)");
                System.out.println("      0 Mana");
                System.out.println();
                System.out.println("     - Descrição - ");
                System.out.println("               Você ataco o inimigo com seu cajado de bruxo, causando");
                System.out.println("      dano igual seu status de ataque [" + pers.getAtaquePers() + "]");
                System.out.println();
                System.out.println();
                System.out.println("    * Bola de Fogo      (2)");
                System.out.println("      5 Mana");
                System.out.println();
                System.out.println("     - Descrição - ");
                System.out.println("               Você solta uma bola de fogo da ponta de seu cajado de");
                System.out.println("      madeira, causando dano igual seu status de magia [" + pers.getMagiaPers() + "]");
                System.out.println();
                System.out.println();
                System.out.println("    * Raio              (3)");
                System.out.println("      2 Mana");
                System.out.println();
                System.out.println("     - Descrição - ");
                System.out.println("               Você solta um raio veloz da ponta do cajado na direção");
                System.out.println("      do inimigo, causando metade do seu status de magia [" + (pers.getMagiaPers() / 2) + "]");
                System.out.println();
                System.out.println("=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=");


                break;
            case "Caçador":
                System.out.println("=-_-=-_-=-_-=-_-=-_-=-_-=-_-Habilidades-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=");
                System.out.println();
                System.out.println("    * Tiro de balestra  (1)");
                System.out.println("      0 Mana");
                System.out.println();
                System.out.println("     - Descrição - ");
                System.out.println("               Você atira com sua balestra de caça na direção do");
                System.out.println("      inimigo, causando dano igual seu ataque [" + pers.getAtaquePers() + "]");
                System.out.println();
                System.out.println();
                System.out.println("    * Medicina de campo (1)");
                System.out.println("      2 Mana");
                System.out.println();
                System.out.println("     - Descrição - ");
                System.out.println("               Você colhe plantas e cogumelos da caverna e as juntam");
                System.out.println("      em uma bolota enquanto recita palavras mágicas, curando [" + (pers.getNivelPers() + 4) + "]");
                System.out.println("      pontosde vida");
                System.out.println();
                System.out.println("=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=-_-=");

                break;
            default:
                System.out.println("ERRO"); //Isso não é pra acontecer
        }


    }

    //Irei armazenar as telas extras aqui para não ocupar muito espaço do código

    public static void telaMorte() {
        System.out.println();
        System.out.println("                                      |||||||");
        System.out.println("                                      |||||||");
        System.out.println("                                      |||||||");
        System.out.println("                             |||||||||||||||||||||||||");
        System.out.println("                             |||||||||||||||||||||||||");
        System.out.println("       Você morreu...                 |||||||");
        System.out.println("                                      |||||||");
        System.out.println("                                      |||||||");
        System.out.println("                                      |||||||");
        System.out.println("              OO                      |||||||");
        System.out.println("              /OO                     |||||||");
        System.out.println("            </               oooooooooooooooooooooooo");
        System.out.println("             |      ooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("   ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
    }

    public static void telaCaverna() {
        System.out.println("º*._________________________________________________________________.*º");
        System.out.println("*****************++++++********+++++++++++++o+++++++*******+++++++++++");
        System.out.println("++++++++++++*****++++++++++0OOOOOOOOOOOO0++++++++++******+++++++***o**");
        System.out.println("**o**++++++++o+++++**+0OOOO|            |OOOO0****++++++++++++++**++++");
        System.out.println("++++++++++++++++++++0OO|                    |OO0*+++o+++++++********++");
        System.out.println("++++++++++++++****0O|        -  VOCÊ  -        |O0++++++++**+++++++*++");
        System.out.println("+++++++++++++++++0O|                            |O0*++++++++o++++++***");
        System.out.println("++++***+++++++++0O|        -   ENTROU   -        |O0++++++++++****+o++");
        System.out.println("++++o++++++++++0O|                                |O0**++++++++++++***");
        System.out.println("++++++++*****+0O|            -   NA   -            |O0++++++++++++**++");
        System.out.println("**o+++++++++++0O|                                  |O0*++++++++o++*+**");
        System.out.println("++++**++++o+++0O|          -   CAVERNA   -         |O0*++++***++++++++");
        System.out.println("++++++|/++++++0O|                                  |O0++++|/*+++|/**++");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
    }


    public static void telaDragao() {
        System.out.println("                          \\| |/");
        System.out.println("                         |     @___oo");
        System.out.println("            / \\   / \\   /   (___,,,,|");
        System.out.println("           )  /^\\)   ^|/  __)");
        System.out.println("           )    /^\\ /     __)");
        System.out.println("           )   _   /  /   __)");
        System.out.println("      / \\  )/ \\ |  |   |  )__)");
        System.out.println("     <   >      | ( , , ) )___)");
        System.out.println("      | |      /        \\)____)\\");
        System.out.println("      |  \\____(          )____)  )___");
        System.out.println("       \\_______(___________;;;  ___;;;");

    }
}










