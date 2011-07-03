package test;

import motorRedNeuronal.IFuncionCalculo;
import motorRedNeuronal.RedNeuronal;
import motorRedNeuronal.Sigmoide;

public class CargarGuardarTest
{
	public static void main(String[] args)
	{
		//He probado con varias configuraciones, incluyendo la de un perceptrón.
		int [] config = {8,1,7,1};
		IFuncionCalculo f = new Sigmoide();

		RedNeuronal rn1 = new RedNeuronal(config, 0.5f, 0.2f, -0.5f, 0.5f, f);
		RedNeuronal rn2 = new RedNeuronal(config, 0.5f, 0.2f, -0.5f, 0.5f, f);

		System.out.println("Estado de la red 1: \n"+rn1.guardarPesosString()+"\n");
		
		System.out.println("Estado de la red 2: \n"+rn2.guardarPesosString()+"\n");
		
		System.out.println("Cargando en la red 2 el estado de la red 1\n");
		rn2.cargarPesos(rn1.guardarPesosString());
		
		
		System.out.println("Estado de la red 2: \n"+rn2.guardarPesosString()+"\n");
		
		if(rn1.guardarPesosString().equals(rn2.guardarPesosString()))
			System.out.println("Las dos redes son iguales ahora.");
		else
			System.out.println("¡Error, las redes son distintas!");
	}
}
