package argentinaPrograma;

public class ejercicio1 
{

	public static void main(String[] args) 
	{
		int numeroInicio=5;
		int numeroFin=14;
		ejercicio1.puntoA(numeroInicio, numeroFin);
		ejercicio1.puntoB(numeroInicio, numeroFin);
		ejercicio1.puntoC(numeroInicio, numeroFin, 'i');
		ejercicio1.puntoD(numeroInicio, numeroFin);
		
	}
	
	
	public static void puntoA (int inicio, int fin)
	{
		while(inicio<=fin)
		{
			System.out.println(inicio);
			inicio++;
		}
	System.out.println("fin punto A");
	}
	
	
	public static void puntoB (int inicio, int fin)
	{
		while(inicio<=fin)
		{
			if(inicio % 2 == 0)
			{
				System.out.println(inicio);
			}
			inicio++;
		}
		System.out.println("fin punto B");
	}
	
	
	public static void puntoC (int inicio, int fin, char parOImpar)
	{
		if(parOImpar=='p' || parOImpar=='P')
		{
			while(inicio<=fin)
			{
				if(inicio % 2 == 0)
				{
					System.out.println(inicio);
				}
				inicio++;
			}
		}
		
		if(parOImpar=='i' || parOImpar=='I')
		{
			while(inicio<=fin)
			{
				if(inicio % 2 != 0)
				{
					System.out.println(inicio);
				}
				inicio++;
			}
		}
		System.out.println("fin punto C");
	}

	
	public static void puntoD (int inicio, int fin)
	{
		for(;fin>=inicio;fin--)
		{
			if(fin % 2 == 0)
			{
				System.out.println(fin);
			}
		}
		System.out.println("fin punto D");
	}
}
