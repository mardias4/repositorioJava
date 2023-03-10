package argentinaPrograma;

public class ejercicio2 
{
	public static void main(String[] args)
	{
		boolean tieneEmbarcacion= true;
		boolean tieneAeronave= false;
		boolean titularDeActivosSocietarios= true;
		ejercicio2.tieneIngresosAltos(tieneEmbarcacion,
											tieneAeronave, 
											titularDeActivosSocietarios);
	}
	
	
	
	public static boolean tieneIngresosAltos(boolean tieneEmbarcacion,
											boolean tieneAeronave,
											boolean titularDeActivosSocietarios)
	{
		boolean ret;
		if(tieneEmbarcacion || tieneAeronave || titularDeActivosSocietarios)
		{
			System.out.println("tiene ingresos altos");
			ret=true;
		}
		else
		{
			System.out.println("no tiene ingresos altos");
			ret=false;
		}
		
		return ret;
	}

}
