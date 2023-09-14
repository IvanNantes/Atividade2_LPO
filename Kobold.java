package Atividade2;

public class Kobold extends Inimigo {
    private int magiaInim;
    private int manaMaxInim;
    private int manaInim;
    public Kobold() {
        setNomeInim("Kobold");
        setVidaMaxInim(16);
        setAtaqueInim(6);
        setCriticoInim(10f);
        setDefesaInim(4);
        setManaMaxInim(6);
        setMagiaInim(5);

    }
    @Override
    public void iniciar() {
        setVidaInim(getVidaMaxInim());
        setManaInim(getManaMaxInim());
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

    public int getManaMaxInim() {
        return manaMaxInim;
    }

    public void setManaMaxInim(int manaMaxInim) {
        this.manaMaxInim = manaMaxInim;
    }

    public int getManaInim() {
        return manaInim;
    }

    public void setManaInim(int manaInim) {
        this.manaInim = manaInim;
    }
}
