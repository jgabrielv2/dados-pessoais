package br.mil.eb.rcg.dados.service;

import br.mil.eb.rcg.dados.dto.formulario.DadosCadastro;
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
    public DadosListagemMilitar cadastrarMilitar(DadosCadastro dadosCadastro) {
        var militar = new Militar(dadosCadastro);
        militarRepository.save(militar);
        return new DadosListagemMilitar(militar);
    }

    public DadosListagemMilitar buscarMilitarPorId(Long id) {
        var militar = militarRepository.findById(id).orElseThrow();
        return new DadosListagemMilitar(militar);
    }

    public List<DadosListagemMilitar> buscarTodosMilitares() {
        var militares = militarRepository.findAll();
        return militares.stream().map(DadosListagemMilitar::new).toList();
    }




}
