package med.voll.API.controller;

import med.voll.API.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosCadastroPaciente dados) {
        System.out.println(dados);
    }
}
