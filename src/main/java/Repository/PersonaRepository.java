package Repository;

import Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {

        List<Persona> findAllByNome(String nome);

        @Query(value = "SELECT p from Persona p where p.nome=:nome")
        List<Persona> vogliocercare3nomi(@Param("nome") String nome);

}
