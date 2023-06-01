package med.voll.API.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.API.paciente.DadosCadastroPaciente;
import med.voll.API.paciente.Paciente;
import med.voll.API.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
