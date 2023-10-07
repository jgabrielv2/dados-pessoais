package br.mil.eb.rcg.dados.controller;

import br.mil.eb.rcg.dados.dto.formulario.FormularioMilitar;
import br.mil.eb.rcg.dados.dto.formulario.atualizacao.FormularioAtualizacaoMilitar;
import br.mil.eb.rcg.dados.dto.listagem.DadosListagemMilitar;
import br.mil.eb.rcg.dados.service.MilitarService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("militar")
public class MilitarController {

    private final MilitarService militarService;

    public MilitarController(MilitarService militarService) {
        this.militarService = militarService;
    }

    @PostMapping
    public ResponseEntity<DadosListagemMilitar> criar(@RequestBody @Valid FormularioMilitar formularioMilitar, UriComponentsBuilder uriComponentsBuilder) {
        var militar = militarService.cadastrarMilitar(formularioMilitar);
        var uri = uriComponentsBuilder.path("/militar/{id}").buildAndExpand(militar.id()).toUri();
        return ResponseEntity.created(uri).body(militar);
    }

    @GetMapping
    public ResponseEntity<List<DadosListagemMilitar>> buscarTodos() {
        var militares = militarService.buscarTodosMilitares();
        return ResponseEntity.ok(militares);
    }

    @PostMapping("busca/id")
    public ResponseEntity<DadosListagemMilitar> buscarPorId(@RequestBody Map<String, Long> requestBody) {
        Long id = requestBody.get("id");
        var militar = militarService.buscarMilitarPorId(id);
        return ResponseEntity.ok(militar);
    }
    @PostMapping("busca/cpf")
    public ResponseEntity<DadosListagemMilitar> buscarPorCpf(@RequestBody Map<String, String> requestBody) {
        String cpf = requestBody.get("cpf");
        var militar = militarService.buscarPorCpf(cpf);
        return ResponseEntity.ok(militar);
    }
    @PutMapping
    public ResponseEntity<DadosListagemMilitar> atualizar(@RequestBody FormularioAtualizacaoMilitar dadosAtualizacaoMilirar) {
        var militar = militarService.atualizarMilitar(dadosAtualizacaoMilirar);
        return ResponseEntity.ok(militar);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        militarService.excluirMilitar(id);
        return ResponseEntity.noContent().build();
    }


}
