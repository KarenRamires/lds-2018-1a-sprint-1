package br.edu.ifrs.canoas.tads.tcc.service;

import br.edu.ifrs.canoas.tads.tcc.domain.Document;
import br.edu.ifrs.canoas.tads.tcc.domain.TermPaper;
import br.edu.ifrs.canoas.tads.tcc.domain.User;
import br.edu.ifrs.canoas.tads.tcc.repository.TermPaperRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class CatalogService {

    private final TermPaperRepository termPaperRepository;

    public Iterable<TermPaper> search(String criteria) {
        return criteria!=null?
                termPaperRepository.findByThemeContainingIgnoreCase(criteria):
                new ArrayList();
    }


}
