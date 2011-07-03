package test;

import motorRedNeuronal.IFuncionCalculo;
import motorRedNeuronal.RedNeuronal;
import motorRedNeuronal.Sigmoide;

public class FuncionIdentidadTest
{
	public static void main(String[] args)
	{
		int [] config = {8,16,8};
		IFuncionCalculo f = new Sigmoide();
		RedNeuronal rn = new RedNeuronal(config, 0.5f, 0.2f, -0.5f, 0.5f, f);

		System.out.println(rn.guardarPesosString());
		
		comprobar(rn);
		
		System.out.println();
		
		entrenar(rn,1000);
		
		comprobar (rn);
		
		System.out.println(rn.guardarPesosString());

		
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
				objetivo[i]=0.9f;
				rn.entrenar(entrada,objetivo);
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
