package emprestimo;

public class cliente extends biblioteca{
    
    private cliente(String nome, int x, int idade, double remuneracaoMensal, double limiteEmprestimo, String aceite) {
        this.nome = nome;
        this.x = x;
        this.idade = idade;
        this.remuneracaoMensal = remuneracaoMensal;
        this.limiteEmprestimo = limiteEmprestimo;
        this.aceite = aceite;
        
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }
    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getRemuneracaoMensal() {
        return remuneracaoMensal;
    }
    
    public void setRemuneracaoMensal(double remuneracaoMensal) {
        this.remuneracaoMensal = remuneracaoMensal;
    }

    public String getAceite() {
        return aceite;
    }
    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

}
