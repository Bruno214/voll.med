package med.voll.API.paciente;

import med.voll.API.endereco.EnderecoJPA;

public record DadosDetalhamentoPaciente(long id, String nome, String email, String telefone, String cpf, EnderecoJPA endereco) {
    public DadosDetalhamentoPaciente(Paciente dados) {
        this(dados.getId(), dados.getNome(), dados.getEmail(), dados.getTelefone(), dados.getCpf(), dados.getEndereco());
    }

}
