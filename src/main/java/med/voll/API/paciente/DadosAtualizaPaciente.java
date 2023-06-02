package med.voll.API.paciente;

import jakarta.validation.constraints.NotBlank;
import med.voll.API.endereco.Endereco;

public record DadosAtualizaPaciente(long id, String nome, String telefone, Endereco endereco) {

}
