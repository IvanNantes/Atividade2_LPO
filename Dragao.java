package Atividade2;

public class Dragao extends Inimigo{
    private int magiaInim;

    public Dragao() {
        setNomeInim("Dragão");
        setVidaMaxInim(72);
        setAtaqueInim(12);
        setCriticoInim(10f);
        setDefesaInim(8);
        setMagiaInim(14);

    }
    public int Ataque2(){
        return (getMagiaInim());
    }

    public int getMagiaInim() {
        return magiaInim;
    }

    public void setMagiaInim(int magiaInim) {
        this.magiaInim = magiaInim;
    }
}
