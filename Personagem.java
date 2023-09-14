package Atividade2;

public class Personagem {

    //Atributos

    //Informações do personagem
    private String nomePers;   //Nome
    private String classePers; //Classe
    private int nivelPers;     //Nível

    //Status do personagem
    private int vidaPers;      //Vida
    private int vidaMaxPers;    //Vida máxima
    private int ataquePers;    //Ataque
    private float criticoPers; //Crítico
    private int magiaPers;     //Magia
    private int manaPers;      //Mana
    private int manaMaxPers;   //Mana máxima
    private int defesaPers;    //Defesa
    private float esquivaPers; //Esquiva

    public Personagem() {

    }

    public String getNomePers() {
        return nomePers;
    }

    public void setNomePers(String nomePers) {
        this.nomePers = nomePers;
    }

    public String getClassePers() {
        return classePers;
    }

    public void setClassePers(String classePers) {
        this.classePers = classePers;
    }

    public int getNivelPers() {
        return nivelPers;
    }

    public void setNivelPers(int nivelPers) {
        this.nivelPers = nivelPers;
    }

    public int getVidaPers() {
        return vidaPers;
    }

    public void setVidaPers(int vidaPers) {
        this.vidaPers = vidaPers;
    }

    public int getAtaquePers() {
        return ataquePers;
    }

    public void setAtaquePers(int ataquePers) {
        this.ataquePers = ataquePers;
    }

    public float getCriticoPers() {
        return criticoPers;
    }

    public void setCriticoPers(float criticoPers) {
        this.criticoPers = criticoPers;
    }

    public int getMagiaPers() {
        return magiaPers;
    }

    public void setMagiaPers(int magiaPers) {
        this.magiaPers = magiaPers;
    }

    public int getManaPers() {
        return manaPers;
    }

    public void setManaPers(int manaPers) {
        this.manaPers = manaPers;
    }

    public int getDefesaPers() {
        return defesaPers;
    }

    public void setDefesaPers(int defesaPers) {
        this.defesaPers = defesaPers;
    }

    public float getEsquivaPers() {
        return esquivaPers;
    }

    public void setEsquivaPers(float esquivaPers) {
        this.esquivaPers = esquivaPers;
    }

    public int getVidaMaxPers() { return vidaMaxPers; }

    public void setVidaMaxPers(int vidaMaxPers) { this.vidaMaxPers = vidaMaxPers; }

    public int getManaMaxPers() { return manaMaxPers; }
    public void setManaMaxPers(int manaMaxPers) { this.manaMaxPers = manaMaxPers; }
}
