package med.voll.API.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.API.paciente.DadosCadastroPaciente;
import med.voll.API.paciente.DadosListagemPaciente;
import med.voll.API.paciente.Paciente;
import med.voll.API.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;
    @PostMapping
    @Transactional
    public void cadastrarPaciente(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }
    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(sort = {"nome"}, size = 2) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }
}
