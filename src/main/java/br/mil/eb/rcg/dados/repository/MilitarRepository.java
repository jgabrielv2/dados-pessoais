package br.mil.eb.rcg.dados.repository;

import br.mil.eb.rcg.dados.entity.Militar;
import br.mil.eb.rcg.dados.entity.PostoGraduacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MilitarRepository extends JpaRepository<Militar, Long> {

    Optional<Militar> findByCpf(String cpf);

    Optional<Militar> findByPrecCp(String precCp);

    Optional<Militar> findByNomeDeGuerra(String nomeDeGuerra);

    List<Militar> findByPostoGraduacao(PostoGraduacao postoGraduacao);


}
