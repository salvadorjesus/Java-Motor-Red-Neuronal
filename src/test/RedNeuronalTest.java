package test;

import motorRedNeuronal.IFuncionCalculo;
import motorRedNeuronal.RedNeuronal;
import motorRedNeuronal.Sigmoide;

public class RedNeuronalTest
{

	public static void main(String[] args)
	{
	
		int [] config = {3,3,8};
		IFuncionCalculo f = new Sigmoide();
		RedNeuronal rn = new RedNeuronal(config, 0.2f, 0.2f, -0.5f, 0.5f, f);
		
		
		
		float[] entrada = {1f,0f,0f};
		float [] salida = rn.calcular(entrada);
		
		System.out.println(rn.toString());
		
		System.out.print("Salida funcional: [");
		for (int i = 0; i< salida.length; i++)
			System.out.print(salida[i]+", ");
		System.out.println(" ]");
		
//		rn.calculcar(entrada);
//		
//		System.out.println(rn.toString());
	}

}
