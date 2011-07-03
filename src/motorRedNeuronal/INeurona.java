package motorRedNeuronal;

/**Esta interfaz la implementan todas las clases que pueden formar parte de la red neuronal,
 * y define métodos comunes para toda la red.*/
public interface INeurona
{
	/**Este método calcula, si tiene datos suficientes, una salida a partir de la entrada.
	 * Antes de acabar, invoca este mismo método en todas las INeurona conectadas a este objeto.
	 * No todos los elementos de la red proporcionan una implementación de este método,
	 * que en algunos casos está vacío.*/
	public void calcular (float in, INeurona origen);
	
	/**Este método efectua el aprendizaje por retropropagación, si el objeto tiene datos suficientes.
	 * Antes de acabar, invoca este mismo método en todas las INeurona conectadas a este objeto.
	 * No todos los elementos de la red proporcionan una implementación de este método,
	 * que en algunos casos está vacío.*/
	public void retropropagar(float deltaAnterior, INeurona origen);
	
	/**Añade una INeurona como elemento entrante.
	 * No todos los elementos de la red proporcionan una implementación de este método,
	 * que en algunos casos está vacío.
	 */	
	public void addElementoEntrante(INeurona entrante);
	
	/**Añade una INeurona como elemento saliente.
	 * No todos los elementos de la red proporcionan una implementación de este método,
	 * que en algunos casos está vacío.
	 */	
	public void addElementoSaliente(INeurona saliente);

}
