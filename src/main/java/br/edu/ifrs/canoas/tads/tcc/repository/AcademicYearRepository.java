package br.edu.ifrs.canoas.tads.tcc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.canoas.tads.tcc.domain.AcademicYear;

@Repository
public interface AcademicYearRepository extends JpaRepository<AcademicYear, Long> {

    List<AcademicYear> findAllByOrderByIdAsc();

    AcademicYear findFirstByOrderByIdDesc();
    Optional<AcademicYear> findFirstByIdIs(Long id);

    AcademicYear findFirstByTitle(String title);
}