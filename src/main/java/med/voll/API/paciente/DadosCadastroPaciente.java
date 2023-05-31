package med.voll.API.paciente;

import med.voll.API.endereco.Endereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String CPF, Endereco endereco ) {
}
