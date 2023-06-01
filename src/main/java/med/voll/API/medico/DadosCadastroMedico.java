package med.voll.API.medico;

import med.voll.API.endereco.Endereco;

public record DadosCadastroMedico (String nome, String email,String telefone, String crm, Especialidade especialidade, Endereco endereco) {

}
