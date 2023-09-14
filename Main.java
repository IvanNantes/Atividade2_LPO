package Atividade2;

import java.util.Scanner;



public class Main {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                           PARTE 1                                         //
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Personagem pers = new Personagem();  //Objeto Personagem = pers
        System.out.println("º*._________________________________________________________________.*º");
        System.out.println("                * Qual o seu nome?");
        System.out.print("              -> ");
        pers.setNomePers(ler.next());
        System.out.println();

        boolean loop = false; //Vai ser utilizado no while
        while (!loop) {
            System.out.println("º*._________________________________________________________________.*º");
            System.out.println("                * Quem é você " + pers.getNomePers() + "?");
            System.out.println();
            System.out.println("           1 - Um Cavaleiro");
            System.out.println("           2 - Um Bruxo                       (Digite o número)");
            System.out.println("           3 - Um Caçador");
            System.out.println();
            System.out.print("              -> ");

            int escClasse;     //Escolha da Classe
            escClasse = ler.nextInt();
            switch (escClasse) {
                case 1:
                    loop = true;
                    Cavaleiro.statusCavaleiro(pers);
                    break;
                case 2:
                    loop = true;
                    Bruxo.statusBruxo(pers);
                    break;
                case 3:
                    loop = true;
                    Cacador.statusBruxo(pers);
                    break;
                default:
                    System.out.println("                            ESCOLHA INVÁLIDA");
            }
        }
        System.out.println("º*._________________________________________________________________.*º");
        System.out.println();
        System.out.println("  * Olá " +pers.getNomePers()+ ", o " +pers.getClassePers());
        System.out.println();
        System.out.println("  * Aventure-se na caverna sombria e acabe com o dragão");
        System.out.println();
        System.out.println("  * Boa sorte "+pers.getNomePers());
        System.out.println();
        System.out.println();
        System.out.println("                   (Pressione ENTER para iniciar)");
        Scanner enter = new Scanner(System.in);   //Vai esperar a pessoa pressionar ENTER
        enter.nextLine();                         //para continuar o código

        FichaPersonagem.telaCaverna(); //As "imagens" estão todas armazenadas dentro da FichaPersonagem

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //                                           PARTE 2                                         //
///////////////////////////////////////////////////////////////////////////////////////////////////////////////


        int escMenu;    //Escolha do Menu
        int inimigo = 0;  //Vai ser usado para escolher o inimigo
        int lvlup = 0;        //pra ver se o personagem subiu de nível
        while (loop) {

            FichaPersonagem ficha = new FichaPersonagem();
            System.out.println("º*._________________________________________________________________.*º");
            System.out.println();
            System.out.println("                     * O que você vai fazer?");
            System.out.println();
            System.out.println("        1 - Ficha do personagem");
            System.out.println("        2 - Se aventurar na caverna       (Digite o número)");
            System.out.println("        3 - Sair do jogo");
            System.out.println();
            System.out.print("          -> ");
            escMenu = ler.nextInt();
            switch (escMenu) {
                case 1:
                    ficha.Ficha(pers);
                    break;
                case 2:
                    inimigo++;
                    Luta.lutar(pers, inimigo, lvlup);

                    break;
                case 3:
                    System.out.println("º*._________________________________________________________________.*º");
                    System.out.println();
                    System.out.println("                       * Você tem certeza?");
                    System.out.println();
                    System.out.println("         1 - Sim                                    2 - Não");
                    System.out.println();
                    System.out.print("                             -> ");
                    int sair;
                    sair = ler.nextInt();
                    if (sair == 1) {
                        loop = false;
                    }
                    break;
                default:

            }
            if (pers.getVidaPers() < 1) { loop = false; }  //Você morreu :)
            if (inimigo == 7 ) { loop = false; }  //Você ganhou :)
        }



    }

}



