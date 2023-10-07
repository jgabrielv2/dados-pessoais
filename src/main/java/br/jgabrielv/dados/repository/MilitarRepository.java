package br.jgabrielv.dados.repository;

import br.jgabrielv.dados.entity.Militar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MilitarRepository extends JpaRepository<Militar, Long> {

    Optional<Militar> findByDadosPessoais_Cpf(String cpf);

    List<Militar> findByAtivoTrue();


}
