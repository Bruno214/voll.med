package med.voll.API.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.API.domain.endereco.Endereco;
import org.hibernate.validator.constraints.br.CPF;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String telefone,
        @NotBlank
        @CPF
        String cpf,
        @NotNull
        @Valid
        Endereco endereco ) {
}
