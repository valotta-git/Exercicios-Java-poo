package Aula0505.br.techgeo.Ponto;

public class Ponto {

    private int cordenadaX;
    private int cordenadaY;

    public Ponto(int cordenadaX, int cordenadaY) {
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
    }

    @Override
    public String toString() {
        return "Coordenada: (" + cordenadaX + ", " + cordenadaY + ")";
    }

    public int getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(int cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public int getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(int cordenadaY) {
        this.cordenadaY = cordenadaY;
    }
}
