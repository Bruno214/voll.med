package med.voll.API.controller;


import jakarta.validation.Valid;
import med.voll.API.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

//    @GetMapping
//    public List<DadosListagemMedico> listar() {
//        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
//    }
    // listagem dos medicos com paginação
    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size=10, sort = {"nome"}, direction = Sort.Direction.DESC) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizaMedico dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizaInformacoes(dados);
    }

    // exclusao no banco de dados apagando o registro
//    @DeleteMapping("/{id}")
//    @Transactional
//    public void deletar(@PathVariable long id) {
//        repository.deleteById(id);
//    }

    // exclusao logica, mantenho o medico mais deixo ele como inativo
    @DeleteMapping("/{id}")
    @Transactional
    public void exclui(@PathVariable long id) {
        var medico = repository.getReferenceById(id);
        medico.exclui();
    }




}