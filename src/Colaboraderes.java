import java.util.Date;

public class Colaboraderes {
    private String nome;
    private long cpf;
    private String telefone;
    private Date dataNascimento;
    private Date dataAgendamento;
    private String periodo;

    public Colaboraderes(String nome, long cpf, String telefone, Date dataNascimento, Date dataAgendamento, String periodo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAgendamento = dataAgendamento;
        this.periodo = periodo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return this.dataNascimento.getDate() + "/" + this.dataNascimento.getMonth() + "/" + this.dataNascimento.getYear();
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataAgendamento() {
        return this.dataAgendamento.getDate() + "/" + this.dataAgendamento.getMonth() + "/" + this.dataAgendamento.getYear();
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
