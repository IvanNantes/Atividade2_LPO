package Atividade2;

public class Inimigo {

    private String nomeInim;  //Nome
    private int vidaInim;     //Vida
    private int vidaMaxInim;  //Vida máxima
    private int ataqueInim;   //Ataque
    private float criticoInim;  //Crítico
    private int defesaInim;   //Defesa


    public void iniciar() {
        setVidaInim(getVidaMaxInim());
    }
    public int Ataque1(){
        return (getAtaqueInim());
    }
    public String getNomeInim() {
        return nomeInim;
    }

    public void setNomeInim(String nomeInim) {
        this.nomeInim = nomeInim;
    }

    public int getVidaInim() {
        return vidaInim;
    }

    public void setVidaInim(int vidaInim) {
        this.vidaInim = vidaInim;
    }

    public int getVidaMaxInim() {
        return vidaMaxInim;
    }

    public void setVidaMaxInim(int vidaMaxInim) {
        this.vidaMaxInim = vidaMaxInim;
    }

    public int getAtaqueInim() {
        return ataqueInim;
    }

    public void setAtaqueInim(int ataqueInim) {
        this.ataqueInim = ataqueInim;
    }

    public float getCriticoInim() {
        return criticoInim;
    }

    public void setCriticoInim(float criticoInim) {
        this.criticoInim = criticoInim;
    }

    public int getDefesaInim() {
        return defesaInim;
    }

    public void setDefesaInim(int defesaInim) {
        this.defesaInim = defesaInim;
    }


}