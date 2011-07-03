package motorRedNeuronal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**Los elementos de entrada son neuronas ficticias que recogen los resultados de la red y la alimentan para la retroprogramación.*/
public class ElementoSalida implements INeurona
{
	/**Almacena la última salida para su consulta*/
	float ultimaSalida;
	
	/**Neuronas conectadas a la entrada de este elemento de salida*/
	private INeurona entrante;

	/**En un elemento de salida, la función calcular guarda el dato a calcular como salida
	 * y devuelve para que siga fluyendo la retropropagación por la red neuronal.*/
	@Override
	public void calcular(float in, INeurona origen)
	{
		ultimaSalida=in;
	}

	/**Le pasa el dato a la neurona entrante.
	 * Al llamar a este método desde fuera de la red, habrá que pasarle null como origen.*/
	@Override
	public void retropropagar(float deltaAnterior,INeurona origen)
	{
			entrante.retropropagar(deltaAnterior, this);
	}

	/**Añade una neurona entrante a este elemento*/
	@Override
	public void addElementoEntrante(INeurona entrante)
	{
		this.entrante=entrante;
	}

	/**En un elemento saliente, este método no hace nada.*/
	@Override
	public void addElementoSaliente(INeurona saliente)
	{ }

}
