package co.conversorapp.infrastructure.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Conversion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Date fechaHora;
	private Integer arabigo;
	private String romano;
	private String operationStatus;

}
