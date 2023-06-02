package med.voll.API.medico;


import med.voll.API.endereco.Endereco;

public record DadosAtualizaMedico(Long id, String nome, String telefone, Endereco endereco) {
}
