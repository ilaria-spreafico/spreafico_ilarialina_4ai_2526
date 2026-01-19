public class Docente extends Persona {
    private String materia;
    private float salario;

    public Docente(String codiceFiscale, String nome, String cognome,String materia, float salario) {
        super(codiceFiscale, nome, cognome);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "materia='" + materia + '\'' +
                ", salario=" + salario +
                '}';
    }
}

