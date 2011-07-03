package motorRedNeuronal;

/**Clase que implementa la función sigmoide como función de cálculo para el perceptron.*/
public class Sigmoide implements IFuncionCalculo {

	/**Función sigmoide.*/
	@Override
	public float calcula(float in)
	{
		return (float) (1/(1+Math.exp(-in)));
	}

}
