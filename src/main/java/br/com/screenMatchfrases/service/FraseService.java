package br.com.screenMatchfrases.service;


import br.com.screenMatchfrases.model.DTO.FraseDTO;
import br.com.screenMatchfrases.model.Frase;
import br.com.screenMatchfrases.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    public Repository repository;

    public FraseDTO buscarFraseAleatoria() {
        return converteFrase(repository.buscarFraseAleatoriaQuery());
    }

    private FraseDTO converteFrase(Frase frase) {
        return new FraseDTO(frase.getId(), frase.getFrase(), frase.getPersonagem(), frase.getTitulo(), frase.getPoster());
    }
}
