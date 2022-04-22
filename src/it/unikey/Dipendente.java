package it.unikey;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Dipendente extends Operatore implements Serializable {
    private final UUID codice;
    private LocalDate assunzione;
    private enum Ruolo{
        MANAGER,
        PROJECTMANAGER,
        OPERATOR
    }
    private String ruolo;

    public Dipendente(String nome, String cognome, LocalDate nascita, LocalDate assunzione, String ruolo) {
        super(nome, cognome, nascita);
        this.codice= UUID.randomUUID();
        this.assunzione = assunzione;
        this.ruolo = String.valueOf(Ruolo.valueOf(ruolo));
    }

    public LocalDate getAssunzione() {
        return assunzione;
    }

    public String getRuolo() {
        return ruolo.toString();
    }

    public void assegnaRisorse(Risorsa r, Dipendente dipendente){
        if(this.ruolo.equals("MANAGER")) {                  //Manager può assegnare risorse a tutti
            dipendente.getRisorseAssegnate().add(r);
            System.out.println("Risorsa assegnata");
        } else if(this.ruolo.equals("PROJECTMANAGER")) {    //ProjectManager può assegnaare risorse solo ad operator
            if(dipendente.getRuolo().equals("OPERATOR")) {
                dipendente.getRisorseAssegnate().add(r);
                System.out.println("Risorsa assegnata");
            }
            else
                System.out.println("Impossibile assegnare risorsa");
        } else                                              //Operator non può assegnare risorse
            System.out.println("Questo dipendente non può assegnare risorse");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", codice=" + codice +
                ", assunzione=" + assunzione +
                ", ruolo='" + ruolo + '\'' +
                '}';
    }
}
