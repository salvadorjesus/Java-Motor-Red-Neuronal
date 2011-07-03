package test;

import motorRedNeuronal.IFuncionCalculo;
import motorRedNeuronal.RedNeuronal;
import motorRedNeuronal.Sigmoide;

public class CargarGuardarFuncionIdentidadTest
{
	public static void main(String[] args)
	{
		int [] config = {8,16,8};
		IFuncionCalculo f = new Sigmoide();
		RedNeuronal rn = new RedNeuronal(config, 0.5f, 0.2f, -0.5f, 0.5f, f);

		//System.out.println(rn);
		System.out.println("Red 1 sin entrenar");
		comprobar(rn);
		
		System.out.println();
		
		entrenar(rn,1000);
		
		System.out.println("Red 1 entrenada");
		comprobar (rn);
		System.out.println();
		
		RedNeuronal rn2 = new RedNeuronal(config, 0.5f, 0.2f, -0.5f, 0.5f, f);
		
		System.out.println("Red 2 sin entrenar");
		comprobar (rn2);
		
		System.out.println();
		System.out.println("Red 2 con la configuración de la red 1 cargada");
		rn2.cargarPesos(rn.guardarPesosString());
		comprobar (rn2);
		
		//Imprimir la red
		 //System.out.println("\n"+rn);
		
		
	}

	private static void entrenar(RedNeuronal rn, int end)
	{
		for (int j = 0; j < end; j++)
		{
			
			for(int i = 0; i<8;i++)
			{
				float[] entrada={0,0,0,0,0,0,0,0};
				entrada[i]=1;
				
				float[] objetivo={0,0,0,0,0,0,0,0};
				entrada[i]=0.9f;
				rn.entrenar(entrada,entrada);
			}
			
			
		}
	}

	private static void comprobar(RedNeuronal rn)
	{
		for(int i = 0; i<8;i++)
		{
			float[] entrada={0,0,0,0,0,0,0,0};
			entrada[i]=1;
			
			float sal [] = rn.calcular(entrada);
			
			//Imprimir resultados
			
			//Originales
			System.out.print("[");
			for (int n = 0; n< entrada.length; n++)
				System.out.print(entrada[n]+", ");

			 System.out.print("] =>");			
			
			//Pseudoresultados
			 System.out.print("[");
				for (int n = 0; n< sal.length; n++)
					{
						if(sal[n]>=0.5)
							System.out.print("1, ");
						else
							System.out.print("0, ");
					}

				 System.out.print("] ~>");
			
			//Resultados
			System.out.print("[");
			for (int n = 0; n< sal.length; n++)
				System.out.print(sal[n]+", ");

			 System.out.println("]");
		}
	}

}
