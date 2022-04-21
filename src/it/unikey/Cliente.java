package it.unikey;

import java.util.ArrayList;
import java.util.UUID;

public class Cliente {

    private final UUID codice;
    private String nome;
    private String PI;

    public Cliente(String nome, String PI) {
        this.codice= UUID.randomUUID();
        this.nome = nome;
        this.PI = PI;
    }

    public UUID getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPI() {
        return PI;
    }

    public void setPI(String PI) {
        this.PI = PI;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", PI='" + PI + '\'' +
                '}';
    }
}
