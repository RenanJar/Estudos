public class Professor extends Pessoa{

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    private String especialidade;
    private float salario;

    public void receberAumento(){
        salario+=500;
    }
}
