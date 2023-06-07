package med.voll.API.domain.medico;


import med.voll.API.domain.endereco.Endereco;

public record DadosAtualizaMedico(Long id, String nome, String telefone, Endereco endereco) {
}
