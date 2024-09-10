package br.com.screenMatchfrases.repository;

import br.com.screenMatchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Repository extends JpaRepository<Frase, Long> {
    @Query(value = "SELECT * FROM frases ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Frase buscarFraseAleatoriaQuery();
}
