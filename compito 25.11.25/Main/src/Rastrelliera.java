import java.util.Stack;

public class Rastrelliera {
    private Stack<Disco> dischi;
    private String nome;

    public Rastrelliera(String nome) {
        this.nome = nome;
        this.dischi = new Stack<>();
    }

    public void aggiungiDisco(Disco disco) {
        if (!dischi.isEmpty() && dischi.peek().getDimensione() <= disco.getDimensione()) {
            throw new IllegalArgumentException("Non puoi mettere un disco più grande sopra uno più piccolo!");
        }
        dischi.push(disco);
    }

    public Disco rimuoviDisco() {
        if (dischi.isEmpty()) {
            throw new IllegalStateException("Rastrelliera vuota!");
        }
        return dischi.pop();
    }

    public Stack<Disco> getDischi() {
        return dischi;
    }

    public String getNome() {
        return nome;
    }

    public void stampaDischi() {
        System.out.print(nome + ": ");
        if (dischi.isEmpty()) {
            System.out.println("[]");
        } else {
            for (Disco d : dischi) {
                System.out.print(d.getDimensione() + " ");
            }
            System.out.println();
        }
    }
}
