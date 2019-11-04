package co.conversorapp.domain.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ConversionModel {
	private String id;
	private Date fechaHora;
	private Integer arabigo;
	private String romano;	
	private String operationStatus;

}
