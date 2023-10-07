package br.mil.eb.rcg.dados.service;

import br.mil.eb.rcg.dados.dto.formulario.FormularioMilitar;
import br.mil.eb.rcg.dados.dto.formulario.atualizacao.FormularioAtualizacaoMilitar;
import br.mil.eb.rcg.dados.dto.listagem.DadosListagemMilitar;
import br.mil.eb.rcg.dados.entity.Militar;
import br.mil.eb.rcg.dados.repository.MilitarRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilitarService {

    private final MilitarRepository militarRepository;

    public MilitarService(MilitarRepository militarRepository) {
        this.militarRepository = militarRepository;
    }

    @Transactional
    public DadosListagemMilitar cadastrarMilitar(FormularioMilitar formularioMilitar) {
        var militar = new Militar(formularioMilitar);
        militarRepository.save(militar);
        return new DadosListagemMilitar(militar);
    }

    public DadosListagemMilitar buscarMilitarPorId(Long id) {
        var militar = militarRepository.getReferenceById(id);
        return new DadosListagemMilitar(militar);
    }

    public List<DadosListagemMilitar> buscarTodosMilitares() {
        var militares = militarRepository.findByAtivoTrue();
        return militares.stream().map(DadosListagemMilitar::new).toList();
    }

    public DadosListagemMilitar buscarPorCpf(String cpf) {
        var militar = militarRepository.findByDadosPessoais_Cpf(cpf).orElseThrow();
        return new DadosListagemMilitar(militar);
    }

    public DadosListagemMilitar atualizarMilitar(FormularioAtualizacaoMilitar formularioAtualizacaoMilitar) {
        var militar = militarRepository.getReferenceById(formularioAtualizacaoMilitar.id());
        militar.atualizar(formularioAtualizacaoMilitar);
        return new DadosListagemMilitar(militar);
    }

    public void excluirMilitar(Long id) {
        var militar = militarRepository.findById(id).orElseThrow();
        militar.setAtivo(false);
    }


}
