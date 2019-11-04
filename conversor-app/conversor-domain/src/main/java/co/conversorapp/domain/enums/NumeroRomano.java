package co.conversorapp.domain.enums;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Enumeración para el manejo y control de Numeros Romanos vs Arabigos
 *
 */
public enum NumeroRomano {
	I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

	private final int valor;

	NumeroRomano(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	/**
	 * <p>
	 * Metodo definido para la generación de NumerosRomanos definidos en orden
	 * descendente.
	 *
	 * </p>
	 *
	 * @return lista
	 *
	 */
	public static List<NumeroRomano> getValoresInvertidos() {
		return Arrays.stream(values()).sorted(Comparator.comparing((NumeroRomano n) -> n.valor).reversed())
				.collect(Collectors.toList());
	}

}
