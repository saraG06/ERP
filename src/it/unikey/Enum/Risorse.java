package it.unikey.Enum;

public enum Risorse {

    MACCHINA("macchina",1),
    PC("pc",2),
    TELEFONO("telefono",3);

    private String risorsa;
    private String i;
    public String getD() {
        return i;
    }

    Risorse(String risorsa, int i) {
        this.i = risorsa;
    }
}
