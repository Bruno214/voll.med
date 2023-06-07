package med.voll.API.domain.paciente;

import med.voll.API.domain.endereco.Endereco;

public record DadosAtualizaPaciente(long id, String nome, String telefone, Endereco endereco) {

}
