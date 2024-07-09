package test;

import negocio.AbonadoABM;
import negocio.ManualABM;
import negocio.RodadoABM;
import negocio.TelepeajeABM;
import datos.Telepeaje;
import java.time.LocalDate;
import java.util.List;

///Clase Test:
public class Test
{
	public static void main(String[] args)
	{
		///Test 1:
		System.out.println("Test 1:");
		System.out.println("Peajes manuales:");
		System.out.println(ManualABM.getInstance().traerManual());
	
		///Test 2:
		System.out.println("\nTest 2:");
		System.out.println("Telepeajes:");
		System.out.println(TelepeajeABM.getInstance().traerTelepeaje());
		
		///Test 3:
		System.out.println("\nTest 3:");
		System.out.println("Peajes manuales del '2020-11-01':");
		System.out.println(ManualABM.getInstance().traerManual(LocalDate.of(2020, 11, 1)));

		///Test 4:
		System.out.println("\nTest 4:");
		System.out.println("Total por caja de los peajes manuales del '2020-11-01' = $" + ManualABM.getInstance().cerrarCaja(LocalDate.of(2020, 11, 1)));

		///Test 5:
		System.out.println("\nTest 5:");
		System.out.println("Rodado con dominio 'AAA111':");
		System.out.println(RodadoABM.getInstance().traerRodado("AAA111"));

		///Test 6:
		System.out.println("\nTest 6:");
		System.out.println("Telepeajes del rodado con dominio 'AAA111' y descuento en cada uno con un 10% (si corresponde):");
		List<Telepeaje> telepeajesTest6 = TelepeajeABM.getInstance().traerTelepeaje(RodadoABM.getInstance().traerRodado("AAA111"));
		for(Telepeaje telepeaje: telepeajesTest6) 
		{
			System.out.println(telepeaje.toString());
			System.out.println("Descuento del 10% = $" + telepeaje.calcularDescuento(10.0));
		}
		
		///Test 7:
		System.out.println("\nTest 7:");
		System.out.println("Abonado con DNI #11111111:");
		System.out.println(AbonadoABM.getInstance().traerAbonado(11111111));

		///Test 8: 
		System.out.println("\nTest 8:");
		System.out.println("Telepeajes del abonado con DNI #11111111 y descuento en cada uno con un 10% (si corresponde):");
		List<Telepeaje> telepeajesTest8 = TelepeajeABM.getInstance().traerTelepeaje(AbonadoABM.getInstance().traerAbonado(11111111));
		for(Telepeaje telepeaje: telepeajesTest8) 
		{
			System.out.println(telepeaje.toString());
			System.out.println("Descuento del 10% = $" + telepeaje.calcularDescuento(10.0));
		}
	}
}
