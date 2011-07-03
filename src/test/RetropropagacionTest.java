package test;

import motorRedNeuronal.IFuncionCalculo;
import motorRedNeuronal.RedNeuronal;
import motorRedNeuronal.Sigmoide;

public class RetropropagacionTest {

	public static void main(String[] args)
	{

		IFuncionCalculo f = new Sigmoide();
		int[] conf = {1,1,1};
		RedNeuronal rn = new RedNeuronal(conf, 0.2f, 0, -0.5f, 0.5f, f);
		
		float [] entrada1 = {1.0f};
		float [] entrada2 = {0.0f};

		float [] salida1 = {0.0f};
		float [] salida2 = {1.0f};

		System.out.println(rn);
		
		rn.entrenar(entrada1, salida1);
		
		rn.entrenar(entrada2, salida2);
		
		System.out.println(rn);
	}

}
