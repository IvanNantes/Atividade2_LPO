package Atividade2;

import java.util.Random;
import java.util.Scanner;

public class Luta {

    public static void ataqueZumbi (Zumbi zumbi, Personagem pers, Random random, float danoInim, float chanceCritico, float chanceEsquiva) {
        if (zumbi.getVidaInim() <= 0) {
            System.out.println("  * O zumbi morreu");
        } else {
            chanceCritico = random.nextFloat(100);
            if (chanceCritico <= zumbi.getCriticoInim()) {
                danoInim = (zumbi.getAtaqueInim() * 1.5f);
                System.out.println(" .*°+ Ataque Crítico +°*.");
            } else {
                danoInim = zumbi.getAtaqueInim();
            }
            if ((danoInim - (pers.getDefesaPers() / 2f)) <= 0) {
                System.out.println("  * O zumbi te morde, porém você se defende");
            } else {
                chanceEsquiva = random.nextFloat(100);
                if (chanceEsquiva <= pers.getEsquivaPers()) {
                    System.out.println("  * Você se desvia da mordida do zumbi");
                } else {
                    System.out.println("  * O zumbi te morde, causando [" + (danoInim - (pers.getDefesaPers() / 2)) + "] pontos de dano");
                    pers.setVidaPers(pers.getVidaPers() - (int) (danoInim - (pers.getDefesaPers() / 2)));
                }
            }
        }

    }

    public static void ataqueKobold (Kobold kobold, Personagem pers, Random random, float danoInim, float chanceCritico, float chanceEsquiva) {
        if (kobold.getVidaInim() <= 0) {
            System.out.println("  * O kobold morreu");
        } else {
            chanceCritico = random.nextFloat(100);
            if (chanceCritico <= kobold.getCriticoInim()) {
                danoInim = (kobold.getAtaqueInim() * 1.5f);
                System.out.println(" .*°+ Ataque Crítico +°*.");
            } else {
                danoInim = kobold.getAtaqueInim();
            }
            if ((danoInim - (pers.getDefesaPers() / 2f)) <= 0) {
                System.out.println("  * O kobold ataca com sua lança, porém você se defende");
            } else {
                chanceEsquiva = random.nextFloat(100);
                if (chanceEsquiva <= pers.getEsquivaPers()) {
                    System.out.println("  * Você se desvia da lançada do kobold");
                } else {
                    System.out.println("  * O kobold te ataca com a lança, causando [" + (danoInim - (pers.getDefesaPers() / 2)) + "] pontos de dano");
                    pers.setVidaPers(pers.getVidaPers() - (int) (danoInim - (pers.getDefesaPers() / 2)));
                }
            }
        }
    }

    public static void magiaKobold (Kobold kobold, Personagem pers, Random random, float danoInim, float chanceEsquiva) {
        if (kobold.getVidaInim() <= 0) {
            System.out.println("  * O kobold morreu");
        } else {
            danoInim = kobold.getMagiaInim();
            kobold.setManaInim(kobold.getManaInim() - 2);
            chanceEsquiva = random.nextFloat(100);
            if (chanceEsquiva <= pers.getEsquivaPers()) {
                System.out.println("  * Você se desvia do fogo do kobold");
            } else {
                System.out.println("  * O kobold solta fogo da boca na sua direção, causando [" + (danoInim) + "] pontos de dano");
                pers.setVidaPers(pers.getVidaPers() - (int) (danoInim));
            }
        }
    }
    public static void ataqueDragao (Dragao dragao, Personagem pers, Random random, float danoInim, float chanceCritico, float chanceEsquiva) {
        if (dragao.getVidaInim() <= 0) {
            System.out.println("  * O Dragão morreu");
        } else {
            chanceCritico = random.nextFloat(100);
            if (chanceCritico <= dragao.getCriticoInim()) {
                danoInim = (dragao.getAtaqueInim() * 1.5f);
                System.out.println(" .*°+ Ataque Crítico +°*.");
            } else {
                danoInim = dragao.getAtaqueInim();
            }
            if ((danoInim - (pers.getDefesaPers() / 2f)) <= 0) {
                System.out.println("  * O Dragão te arranha, porém você se defende");
            } else {
                chanceEsquiva = random.nextFloat(100);
                if (chanceEsquiva <= pers.getEsquivaPers()) {
                    System.out.println("  * Você se desvia das garras do Dragão");
                } else {
                    System.out.println("  * O Dragão crava as garras em você, causando [" + (danoInim - (pers.getDefesaPers() / 2)) + "] pontos de dano");
                    pers.setVidaPers(pers.getVidaPers() - (int) (danoInim - (pers.getDefesaPers() / 2)));
                }
            }
        }

    }
    public static void fogoDragao (Dragao dragao, Personagem pers, Random random, float danoInim, float chanceEsquiva) {
        if (dragao.getVidaInim() <= 0) {
            System.out.println("  * O Dragão morreu");
        } else {
            danoInim = dragao.getMagiaInim();
            chanceEsquiva = random.nextFloat(100);
            if (chanceEsquiva <= (pers.getEsquivaPers() * 1.5)) {
                System.out.println("  * Você se desvia do fogo do Dragão");
            } else {
                System.out.println("  * O Dragão solta fogo pra todo lado, causando [" + (danoInim) + "] pontos de dano");
                pers.setVidaPers(pers.getVidaPers() - (int)(danoInim));
            }
        }
    }



    public static void lutar(Personagem pers, int inimigo, int lvlup) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        Zumbi zumbi = new Zumbi(); //Inimigo Zumbi
        Kobold kobold = new Kobold(); //Inimigo Kobold
        Dragao dragao = new Dragao(); //Chefe final Dragão

        float danoPers = 0;             //Dano causado pelo personagem
        float danoInim = 0;                //Dano causado pelo inimigo
        int ataqueEscolha = 0;                     //escolha do ataque
        float chanceCritico = 0; //vai mostrar se o ataque foi critico
        float chanceEsquiva = 0; //vai mostrar se o personagem desviou
        int ataqueInimigoEscolha;  //vai escolher o ataque dos inimigo


        System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");

        int escInimigo;  //Vai randomizar entre 0 e 1, sendo 0 o inimigo Zumbi e 1 o Kobold
        if (inimigo <= 6) {
            escInimigo = random.nextInt(2);
            switch(escInimigo) {
                case 0:
                    zumbi.iniciar();
                    System.out.println();
                    System.out.println("  * Você encontrou um Zumbi!");

                    while (zumbi.getVidaInim() > 0 && pers.getVidaPers() > 0) {   //Isso vai continuar até o inimigo morrer

                        System.out.println();
                        System.out.println("                               - Zumbi -");
                        System.out.println("                          ¨ Vida: " + zumbi.getVidaInim() + " / " + zumbi.getVidaMaxInim());
                        System.out.println();
                        System.out.println("                               - " + pers.getNomePers() + " -");
                        System.out.println("                          ¨ Vida: " + pers.getVidaPers() + " / " + pers.getVidaMaxPers());
                        System.out.println("                          ¨ Mana: " + pers.getManaPers() + " / " + pers.getManaMaxPers());
                        System.out.println();
                        System.out.println("  * O que você vai fazer " + pers.getNomePers() + "?");
                        System.out.println();
                        switch (pers.getClassePers()) {
                            case "Cavaleiro":
                                Cavaleiro.habilidadesCavaleiro();
                                break;
                            case "Bruxo":
                                Bruxo.habilidadesBruxo();
                                break;
                            case "Caçador":
                                Cacador.habilidadesCacador();
                                break;
                        }
                        ataqueEscolha = ler.nextInt();

                        System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                        System.out.println();
                        switch (pers.getClassePers()) {

                            /////////////////////////////////////////////////////////////////////////////////////////
                            case "Cavaleiro":

                                int defesa; //vou armazenar a defesa atual do Cavaleiro
                                defesa = pers.getDefesaPers();

                                switch (ataqueEscolha){

                                    case 1:
                                        chanceCritico = random.nextFloat(100);
                                        if (chanceCritico <= pers.getCriticoPers()) {
                                            danoPers = (pers.getAtaquePers() * 1.5f);
                                            System.out.println(" .*°+ Ataque Crítico +°*.");
                                        }else {
                                            danoPers = pers.getAtaquePers();
                                        }
                                        if (danoPers - (zumbi.getDefesaInim() / 2f) <= 0) {
                                            System.out.println("  * Você ataca com a espada, porém ele se defende");
                                        }
                                        System.out.println("  * Você ataca com a espada, causado [" +(danoPers - (zumbi.getDefesaInim() / 2)) + "] pontos de dano");
                                        zumbi.setVidaInim(zumbi.getVidaInim() - (int)(danoPers - (zumbi.getDefesaInim() / 2)));
                                        break;

                                    case 2:
                                        pers.setDefesaPers(pers.getDefesaPers() + 4 + (pers.getNivelPers() * 2));
                                        System.out.println("  * Você levanta o escudo e se defende");
                                        danoPers = 0;
                                        break;

                                    default:
                                        System.out.println("  * Você não faz nada");
                                        danoPers = 0;
                                        break;
                                }
                                System.out.println();

                                ataqueZumbi(zumbi, pers, random, danoInim, chanceCritico, chanceEsquiva);

                                pers.setDefesaPers(defesa);

                                System.out.println();
                                System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                                break;
                                /////////////////////////////////////////////////////////////////////////////////////////
                            case "Bruxo":
                                switch (ataqueEscolha){

                                    case 1:
                                        chanceCritico = random.nextFloat(100);
                                        if (chanceCritico <= pers.getCriticoPers()) {
                                            danoPers = (pers.getAtaquePers() * 1.5f);
                                            System.out.println(" .*°+ Ataque Crítico +°*.");
                                        }else {
                                            danoPers = pers.getAtaquePers();
                                        }
                                        if (danoPers - (zumbi.getDefesaInim() / 2f) <= 0) {
                                            System.out.println("  * Você ataca com seu cajado, porém ele se defende");
                                        } else {
                                            System.out.println("  * Você ataca com seu cajado, causado [" + (danoPers - (zumbi.getDefesaInim() / 2)) + "] pontos de dano");
                                            zumbi.setVidaInim(zumbi.getVidaInim() - (int)(danoPers - (zumbi.getDefesaInim() / 2)));
                                        }
                                        break;

                                    case 2:
                                        if (pers.getManaPers() < 5) {
                                            System.out.println("  * Você tenta soltar a bola de fogo, mas nada acontece");
                                        } else {
                                            pers.setManaPers(pers.getManaPers() - 5);
                                            danoPers = pers.getMagiaPers();
                                            System.out.println("  * Você joga uma bola de fogo no zumbi, causando [" + danoPers + "] pontos de dano");
                                            zumbi.setVidaInim(zumbi.getVidaInim() - (int) danoPers);
                                        }
                                        break;

                                    case 3:
                                        if (pers.getManaPers() < 2) {
                                            System.out.println("  * Você tenta soltar o raio, mas nada acontece");
                                        } else {
                                            pers.setManaPers(pers.getManaPers() - 2);
                                            danoPers = (pers.getMagiaPers() / 2f);
                                            System.out.println("  * Você solta um raio na direção do zumbi, causando [" + danoPers + "] pontos de dano");
                                            zumbi.setVidaInim(zumbi.getVidaInim() - (int)danoPers);
                                        }
                                        break;

                                    default:
                                        System.out.println("  * Você não faz nada");
                                        danoPers = 0;
                                        break;
                                }
                                System.out.println();

                                ataqueZumbi(zumbi, pers, random, danoInim, chanceCritico, chanceEsquiva);

                                System.out.println();
                                System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                                break;

                                /////////////////////////////////////////////////////////////////////////////////////////
                            case "Caçador":
                                switch (ataqueEscolha){

                                    case 1:
                                        chanceCritico = random.nextFloat(100);
                                        if (chanceCritico <= pers.getCriticoPers()) {
                                            danoPers = (pers.getAtaquePers() * 1.5f);
                                            System.out.println(" .*°+ Ataque Crítico +°*.");
                                        }else {
                                            danoPers = pers.getAtaquePers();
                                        }
                                        if (danoPers - (zumbi.getDefesaInim() / 2f) <= 0) {
                                            System.out.println("  * Você atira com sua balestra, porém ele se defende");
                                        }
                                        System.out.println("  * Você atira com sua balestra, causado [" +(danoPers - (zumbi.getDefesaInim() / 2)) + "] pontos de dano");
                                        zumbi.setVidaInim(zumbi.getVidaInim() - (int)(danoPers - (zumbi.getDefesaInim() / 2)));
                                        break;

                                    case 2:
                                        if (pers.getManaPers() < 2) {
                                            System.out.println("  * Você come o musgo mágico, porém não sente nada");
                                        } else {
                                            pers.setManaPers(pers.getManaPers() - 2);
                                            System.out.println("  * Você mastiga o musgo mágico, curando [" + (pers.getNivelPers() + 4) + "] pontos de vida");
                                            pers.setVidaPers(pers.getVidaPers() + (pers.getNivelPers() + 4));
                                            if (pers.getVidaPers() > pers.getVidaMaxPers()) {
                                                pers.setVidaPers(pers.getVidaMaxPers());
                                            }
                                        }
                                        danoPers = 0;
                                        break;

                                    default:
                                        System.out.println("  * Você não faz nada");
                                        danoPers = 0;
                                        break;
                                }
                                System.out.println();

                                ataqueZumbi(zumbi, pers, random, danoInim, chanceCritico, chanceEsquiva);

                                System.out.println();
                                System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                                break;
                        }

                    }
                    break;
                case 1:
                    kobold.iniciar();
                    System.out.println();
                    System.out.println("  * Você encontrou um Kobold!");

                    while (kobold.getVidaInim() > 0 && pers.getVidaPers() > 0) {   //Isso vai continuar até o inimigo morrer

                        System.out.println();
                        System.out.println("                               - Kobold -");
                        System.out.println("                          ¨ Vida: " + kobold.getVidaInim() + " / " + kobold.getVidaMaxInim());
                        System.out.println();
                        System.out.println("                               - " + pers.getNomePers() + " -");
                        System.out.println("                          ¨ Vida: " + pers.getVidaPers() + " / " + pers.getVidaMaxPers());
                        System.out.println("                          ¨ Mana: " + pers.getManaPers() + " / " + pers.getManaMaxPers());
                        System.out.println();
                        System.out.println("  * O que você vai fazer " + pers.getNomePers() + "?");
                        System.out.println();
                        switch (pers.getClassePers()) {
                            case "Cavaleiro":
                                Cavaleiro.habilidadesCavaleiro();
                                break;
                            case "Bruxo":
                                Bruxo.habilidadesBruxo();
                                break;
                            case "Caçador":
                                Cacador.habilidadesCacador();
                                break;
                        }
                        ataqueEscolha = ler.nextInt();

                        System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                        System.out.println();
                        switch (pers.getClassePers()) {

                            /////////////////////////////////////////////////////////////////////////////////////////
                            case "Cavaleiro":

                                int defesa; //vou armazenar a defesa atual do Cavaleiro
                                defesa = pers.getDefesaPers();

                                switch (ataqueEscolha){

                                    case 1:
                                        chanceCritico = random.nextFloat(100);
                                        if (chanceCritico <= pers.getCriticoPers()) {
                                            danoPers = (pers.getAtaquePers() * 1.5f);
                                            System.out.println(" .*°+ Ataque Crítico +°*.");
                                        }else {
                                            danoPers = pers.getAtaquePers();
                                        }
                                        if (danoPers - (kobold.getDefesaInim() / 2f) <= 0) {
                                            System.out.println("  * Você ataca com a espada, porém ele se defende");
                                        }
                                        System.out.println("  * Você ataca com a espada, causado [" +(danoPers - (kobold.getDefesaInim() / 2)) + "] pontos de dano");
                                        kobold.setVidaInim(kobold.getVidaInim() - (int)(danoPers - (kobold.getDefesaInim() / 2)));
                                        break;

                                    case 2:
                                        pers.setDefesaPers(pers.getDefesaPers() + 4 + (pers.getNivelPers() * 2));
                                        System.out.println("  * Você levanta o escudo e se defende");
                                        danoPers = 0;
                                        break;

                                    default:
                                        System.out.println("  * Você não faz nada");
                                        danoPers = 0;
                                        break;
                                }
                                System.out.println();

                                if (kobold.getManaInim() >= 2) {
                                    ataqueInimigoEscolha = random.nextInt(2);
                                    switch (ataqueInimigoEscolha) {
                                        case 0:
                                            ataqueKobold(kobold, pers, random, danoInim, chanceCritico, chanceEsquiva);
                                            break;
                                        case 1:
                                            magiaKobold(kobold, pers, random, danoInim, chanceEsquiva);
                                            break;
                                    }
                                } else {
                                    ataqueKobold(kobold, pers, random, danoInim, chanceCritico, chanceEsquiva);
                                }
                                pers.setDefesaPers(defesa);

                                System.out.println();
                                System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                                break;
                            /////////////////////////////////////////////////////////////////////////////////////////
                            case "Bruxo":
                                switch (ataqueEscolha){

                                    case 1:
                                        chanceCritico = random.nextFloat(100);
                                        if (chanceCritico <= pers.getCriticoPers()) {
                                            danoPers = (pers.getAtaquePers() * 1.5f);
                                            System.out.println(" .*°+ Ataque Crítico +°*.");
                                        }else {
                                            danoPers = pers.getAtaquePers();
                                        }
                                        if (danoPers - (kobold.getDefesaInim() / 2f) <= 0) {
                                            System.out.println("  * Você ataca com seu cajado, porém ele se defende");
                                        } else {
                                            System.out.println("  * Você ataca com seu cajado, causado [" + (danoPers - (kobold.getDefesaInim() / 2)) + "] pontos de dano");
                                            kobold.setVidaInim(kobold.getVidaInim() - (int) (danoPers - (kobold.getDefesaInim() / 2)));
                                        }
                                        break;

                                    case 2:
                                        if (pers.getManaPers() < 5) {
                                            System.out.println("  * Você tenta soltar a bola de fogo, mas nada acontece");
                                        } else {
                                            pers.setManaPers(pers.getManaPers() - 5);
                                            danoPers = pers.getMagiaPers();
                                            System.out.println("  * Você joga uma bola de fogo no Kobold, causando [" + danoPers + "] pontos de dano");
                                            kobold.setVidaInim(kobold.getVidaInim() - (int) danoPers);
                                        }
                                        break;

                                    case 3:
                                        if (pers.getManaPers() < 2) {
                                            System.out.println("  * Você tenta soltar o raio, mas nada acontece");
                                        } else {
                                            pers.setManaPers(pers.getManaPers() - 2);
                                            danoPers = (pers.getMagiaPers() / 2f);
                                            System.out.println("  * Você solta um raio na direção do Kobold, causando [" + danoPers + "] pontos de dano");
                                            kobold.setVidaInim(kobold.getVidaInim() - (int) danoPers);
                                        }
                                        break;

                                    default:
                                        System.out.println("  * Você não faz nada");
                                        danoPers = 0;
                                        break;
                                }
                                System.out.println();

                                if (kobold.getManaInim() >= 2) {
                                    ataqueInimigoEscolha = random.nextInt(2);
                                    switch (ataqueInimigoEscolha) {
                                        case 0:
                                            ataqueKobold(kobold, pers, random, danoInim, chanceCritico, chanceEsquiva);
                                            break;
                                        case 1:
                                            magiaKobold(kobold, pers, random, danoInim, chanceEsquiva);
                                            break;
                                    }
                                } else {
                                    ataqueKobold(kobold, pers, random, danoInim, chanceCritico, chanceEsquiva);
                                }

                                System.out.println();
                                System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                                break;

                            /////////////////////////////////////////////////////////////////////////////////////////
                            case "Caçador":
                                switch (ataqueEscolha){

                                    case 1:
                                        chanceCritico = random.nextFloat(100);
                                        if (chanceCritico <= pers.getCriticoPers()) {
                                            danoPers = (pers.getAtaquePers() * 1.5f);
                                            System.out.println(" .*°+ Ataque Crítico +°*.");
                                        }else {
                                            danoPers = pers.getAtaquePers();
                                        }
                                        if (danoPers - (kobold.getDefesaInim() / 2f) <= 0) {
                                            System.out.println("  * Você atira com sua balestra, porém ele se defende");
                                        }
                                        System.out.println("  * Você atira com sua balestra, causado [" +(danoPers - (kobold.getDefesaInim() / 2)) + "] pontos de dano");
                                        kobold.setVidaInim(kobold.getVidaInim() - (int)(danoPers - (kobold.getDefesaInim() / 2)));
                                        break;

                                    case 2:
                                        if (pers.getManaPers() < 2) {
                                            System.out.println("  * Você come o musgo mágico, porém não sente nada");
                                        } else {
                                            pers.setManaPers(pers.getManaPers() - 2);
                                            System.out.println("  * Você mastiga o musgo mágico, curando [" + (pers.getNivelPers() + 4) + "] pontos de vida");
                                            pers.setVidaPers(pers.getVidaPers() + (pers.getNivelPers() + 4));
                                            if (pers.getVidaPers() > pers.getVidaMaxPers()) {
                                                pers.setVidaPers(pers.getVidaMaxPers());
                                            }
                                        }
                                        danoPers = 0;
                                        break;

                                    default:
                                        System.out.println("  * Você não faz nada");
                                        danoPers = 0;
                                        break;
                                }
                                System.out.println();

                                if (kobold.getManaInim() >= 2) {
                                    ataqueInimigoEscolha = random.nextInt(2);
                                    switch (ataqueInimigoEscolha) {
                                        case 0:
                                            ataqueKobold(kobold, pers, random, danoInim, chanceCritico, chanceEsquiva);
                                            break;
                                        case 1:
                                            magiaKobold(kobold, pers, random, danoInim, chanceEsquiva);
                                            break;
                                    }
                                } else {
                                    ataqueKobold(kobold, pers, random, danoInim, chanceCritico, chanceEsquiva);
                                }

                                System.out.println();
                                System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                                break;
                        }

                    }
                    break;
            }

        } else {
            dragao.iniciar();
            FichaPersonagem.telaDragao();
            System.out.println();
            System.out.println("  * Você chegou no covil do Dragão");

            while (dragao.getVidaInim() > 0 && pers.getVidaPers() > 0) {   //Isso vai continuar até o inimigo morrer

                System.out.println();
                System.out.println("                               - Dragão -");
                System.out.println("                          ¨ Vida: " + dragao.getVidaInim() + " / " + dragao.getVidaMaxInim());
                System.out.println();
                System.out.println("                               - " + pers.getNomePers() + " -");
                System.out.println("                          ¨ Vida: " + pers.getVidaPers() + " / " + pers.getVidaMaxPers());
                System.out.println("                          ¨ Mana: " + pers.getManaPers() + " / " + pers.getManaMaxPers());
                System.out.println();
                System.out.println("  * O que você vai fazer " + pers.getNomePers() + "?");
                System.out.println();
                switch (pers.getClassePers()) {
                    case "Cavaleiro":
                        Cavaleiro.habilidadesCavaleiro();
                        break;
                    case "Bruxo":
                        Bruxo.habilidadesBruxo();
                        break;
                    case "Caçador":
                        Cacador.habilidadesCacador();
                        break;
                }
                ataqueEscolha = ler.nextInt();

                System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                System.out.println();
                switch (pers.getClassePers()) {

                    /////////////////////////////////////////////////////////////////////////////////////////
                    case "Cavaleiro":

                        int defesa; //vou armazenar a defesa atual do Cavaleiro
                        defesa = pers.getDefesaPers();

                        switch (ataqueEscolha){

                            case 1:
                                chanceCritico = random.nextFloat(100);
                                if (chanceCritico <= pers.getCriticoPers()) {
                                    danoPers = (pers.getAtaquePers() * 1.5f);
                                    System.out.println(" .*°+ Ataque Crítico +°*.");
                                }else {
                                    danoPers = pers.getAtaquePers();
                                }
                                if (danoPers - (dragao.getDefesaInim() / 2f) <= 0) {
                                    System.out.println("  * Você ataca com a espada, porém suas escamas são muito fortes");
                                }
                                System.out.println("  * Você ataca com a espada, causado [" +(danoPers - (dragao.getDefesaInim() / 2)) + "] pontos de dano");
                                dragao.setVidaInim(dragao.getVidaInim() - (int)(danoPers - (dragao.getDefesaInim() / 2)));
                                break;

                            case 2:
                                pers.setDefesaPers(pers.getDefesaPers() + 4 + (pers.getNivelPers() * 2));
                                System.out.println("  * Você levanta o escudo e se defende");
                                danoPers = 0;
                                break;

                            default:
                                System.out.println("  * Você não faz nada");
                                danoPers = 0;
                                break;
                        }
                        System.out.println();

                        if (dragao.getVidaInim() <= (dragao.getVidaMaxInim() / 2)) {
                            ataqueInimigoEscolha = random.nextInt(2);
                            switch (ataqueInimigoEscolha) {
                                case 0:
                                    ataqueDragao(dragao, pers, random, danoInim, chanceCritico, chanceEsquiva);
                                    break;
                                case 1:
                                    fogoDragao(dragao, pers, random, danoInim, chanceEsquiva);
                                    break;
                            }
                        } else {
                            ataqueDragao(dragao, pers, random, danoInim, chanceCritico, chanceEsquiva);
                        }
                        pers.setDefesaPers(defesa);

                        System.out.println();
                        System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                        break;
                    /////////////////////////////////////////////////////////////////////////////////////////
                    case "Bruxo":
                        switch (ataqueEscolha){

                            case 1:
                                chanceCritico = random.nextFloat(100);
                                if (chanceCritico <= pers.getCriticoPers()) {
                                    danoPers = (pers.getAtaquePers() * 1.5f);
                                    System.out.println(" .*°+ Ataque Crítico +°*.");
                                }else {
                                    danoPers = pers.getAtaquePers();
                                }
                                if (danoPers - (dragao.getDefesaInim() / 2f) <= 0) {
                                    System.out.println("  * Seu cajado não faz nada, como ja era de se esperar");
                                } else {
                                    System.out.println("  * Você ataca com seu cajado, causado [" + (danoPers - (dragao.getDefesaInim() / 2)) + "] pontos de dano");
                                    dragao.setVidaInim(dragao.getVidaInim() - (int) (danoPers - (dragao.getDefesaInim() / 2)));
                                }
                                break;

                            case 2:
                                if (pers.getManaPers() < 5) {
                                    System.out.println("  * Você tenta soltar a bola de fogo, mas nada acontece");
                                } else {
                                    pers.setManaPers(pers.getManaPers() - 5);
                                    danoPers = pers.getMagiaPers();
                                    System.out.println("  * Você joga uma bola de fogo no Dragão, causando [" + danoPers + "] pontos de dano");
                                    dragao.setVidaInim(dragao.getVidaInim() - (int) danoPers);
                                }
                                break;

                            case 3:
                                if (pers.getManaPers() < 2) {
                                    System.out.println("  * Você tenta soltar o raio, mas nada acontece");
                                } else {
                                    pers.setManaPers(pers.getManaPers() - 2);
                                    danoPers = (pers.getMagiaPers() / 2f);
                                    System.out.println("  * Você solta um raio na direção do Dragão, causando [" + danoPers + "] pontos de dano");
                                    dragao.setVidaInim(dragao.getVidaInim() - (int) danoPers);
                                }
                                break;

                            default:
                                System.out.println("  * Você não faz nada");
                                danoPers = 0;
                                break;
                        }
                        System.out.println();

                        if (dragao.getVidaInim() <= (dragao.getVidaMaxInim() / 2)) {
                            ataqueInimigoEscolha = random.nextInt(2);
                            switch (ataqueInimigoEscolha) {
                                case 0:
                                    ataqueDragao(dragao, pers, random, danoInim, chanceCritico, chanceEsquiva);
                                    break;
                                case 1:
                                    fogoDragao(dragao, pers, random, danoInim, chanceEsquiva);
                                    break;
                            }
                        } else {
                            ataqueDragao(dragao, pers, random, danoInim, chanceCritico, chanceEsquiva);
                        }

                        System.out.println();
                        System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                        break;

                    /////////////////////////////////////////////////////////////////////////////////////////
                    case "Caçador":
                        switch (ataqueEscolha){

                            case 1:
                                chanceCritico = random.nextFloat(100);
                                if (chanceCritico <= pers.getCriticoPers()) {
                                    danoPers = (pers.getAtaquePers() * 1.5f);
                                    System.out.println(" .*°+ Ataque Crítico +°*.");
                                }else {
                                    danoPers = pers.getAtaquePers();
                                }
                                if (danoPers - (dragao.getDefesaInim() / 2f) <= 0) {
                                    System.out.println("  * Você atira com sua balestra, porém as escamas repelem a seta");
                                }
                                System.out.println("  * Você atira com sua balestra, causado [" +(danoPers - (dragao.getDefesaInim() / 2)) + "] pontos de dano");
                                dragao.setVidaInim(dragao.getVidaInim() - (int)(danoPers - (dragao.getDefesaInim() / 2)));
                                break;

                            case 2:
                                if (pers.getManaPers() < 2) {
                                    System.out.println("  * Você come o musgo mágico, porém não sente nada");
                                } else {
                                    pers.setManaPers(pers.getManaPers() - 2);
                                    System.out.println("  * Você mastiga o musgo mágico, curando [" + (pers.getNivelPers() + 4) + "] pontos de vida");
                                    pers.setVidaPers(pers.getVidaPers() + (pers.getNivelPers() + 4));
                                    if (pers.getVidaPers() > pers.getVidaMaxPers()) {
                                        pers.setVidaPers(pers.getVidaMaxPers());
                                    }
                                }
                                danoPers = 0;
                                break;

                            default:
                                System.out.println("  * Você não faz nada");
                                danoPers = 0;
                                break;
                        }
                        System.out.println();

                        if (dragao.getVidaInim() <= (dragao.getVidaMaxInim() / 2)) {
                            ataqueInimigoEscolha = random.nextInt(2);
                            switch (ataqueInimigoEscolha) {
                                case 0:
                                    ataqueDragao(dragao, pers, random, danoInim, chanceCritico, chanceEsquiva);
                                    break;
                                case 1:
                                    fogoDragao(dragao, pers, random, danoInim, chanceEsquiva);
                                    break;
                            }
                        } else {
                            ataqueDragao(dragao, pers, random, danoInim, chanceCritico, chanceEsquiva);
                        }

                        System.out.println();
                        System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
                        break;
                }

            }
            if (dragao.getVidaInim() <= 0) {
                System.out.println();
                System.out.println("  * Você conseguiu " +pers.getNomePers()+ "!");
                System.out.println();
                System.out.println("  * Você derrotou o Dragão!");
                System.out.println();
                System.out.println("  * É isso");
                System.out.println();
                System.out.println("  * O jogo acabou");
                System.out.println();
                System.out.println("          (Me da nota 100 por favor, deu trabalho fazer isso)");
                System.out.println();
                System.out.println("                                  : ]");


            }
        }

        System.out.println();
        if (pers.getVidaPers() < 1) {
            FichaPersonagem.telaMorte(); //As "imagens" estão todas armazenadas dentro da FichaPersonagem
        } else {
             if (inimigo == 2 || inimigo == 4 || inimigo == 6 ) {
                 switch (pers.getClassePers()) {
                     case "Cavaleiro":
                         Cavaleiro.subirNivelCavaleiro(pers);
                         break;
                     case "Bruxo":
                         Bruxo.subirNivelBruxo(pers);
                         break;
                     case "Caçador":
                         Cacador.subirNivelCacador(pers);
                         break;

                 }


             }
        }


    }



}
