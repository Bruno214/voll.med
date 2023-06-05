package med.voll.API.medico;

import med.voll.API.endereco.EnderecoJPA;

public record DadosDetalhamentoMedico(long id, String nome, String email, String telefone, String crm, Especialidade especialidade, EnderecoJPA endereco, boolean ativo) {
    public DadosDetalhamentoMedico(Medico dados) {
        this(dados.getId(), dados.getNome(), dados.getEmail(), dados.getTelefone(), dados.getCrm(), dados.getEspecialidade(), dados.getEndereco(), dados.getAtivo());
    }

}
