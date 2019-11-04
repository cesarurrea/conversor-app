package co.conversorapp.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.conversorapp.infrastructure.entity.Conversion;

public interface IConversionDao extends JpaRepository<Conversion, String> {

}
