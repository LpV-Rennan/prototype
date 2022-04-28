public class Cliente implements Cloneable{
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Voo voo;

    public Cliente(String nome, String cpf, String dataNascimento, Voo voo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.voo = voo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public Cliente clone() throws CloneNotSupportedException{
        Cliente clienteClone = (Cliente) super.clone();
        clienteClone.voo = (Voo) clienteClone.voo.clone();
        return clienteClone;
    }

    @Override
    public String toString(){
        return "Cliente : {" +
                " Nome: "+nome +
                " Cpf: "+ cpf +
                " Nascimento" +dataNascimento+
                " voo " +voo+
                "}";
    }
}
