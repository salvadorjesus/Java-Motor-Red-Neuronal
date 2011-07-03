package motorRedNeuronal;

/**Elemento para simular la entrada umbral con valor -1. Todos los métodos de esta clase están vacíos.*/
public class ElementoUmbral implements INeurona
{

	/**Este método no hace nada en esta neurona. Según el diseño, no hay motivo para invocarlo.*/
	public void calcular(float in, INeurona origen)
	{}

	/**Este método no hace nada en esta clase, y devuelve el control a el objeto que lo invoca.*/
	public void retropropagar(float deltaAnterior, INeurona origen)
	{}

	/**Este método no hace nada en esta neurona. Según el diseño, no hay motivo para invocarlo.*/
	public void addElementoEntrante(INeurona entrante)
	{}

	/**Este método no hace nada en esta neurona. Según el diseño, no hay motivo para invocarlo.*/
	public void addElementoSaliente(INeurona saliente)
	{}

}
