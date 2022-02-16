package neoris.saludo.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import neoris.saludo.api.entity.Saludo;

public interface SaludoRepository extends JpaRepository<Saludo,Long>{
	//public List<Saludo> findByTipo_saludo(String tipo_saludo);
	@Query("FROM Saludo WHERE tipo_saludo = :tipo_saludo")
	Saludo getByTipo_saludo(@Param("tipo_saludo") String tipo_saludo);
}
