package it.unikey.Enum;

public enum Ruoli {

    MANAGER("manager",1),
    PROJECTMANAGER("projectmanager",2),
    OPERATOR("operator",3);

    private String ruolo;
    private String r;
    public String getR() {
        return r;
    }

    Ruoli(String ruolo, int r) {
        this.r = ruolo;
    }
}
