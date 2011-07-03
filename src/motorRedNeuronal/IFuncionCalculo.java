package motorRedNeuronal;

/**Esta interfaz la implementarán las clases que codifiquen una función que calcule la salida de un perceptron.*/
 
public interface IFuncionCalculo
{
	/**Función de cálculo de la clase.
	 * Recive un float (las entradas ya sumadas) y devuelve otro float con el resultado.*/
	public float calcula(float in);

}
