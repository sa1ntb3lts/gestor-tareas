package mx.unison;

import java.util.Scanner;

public class Gestor {
	public static ArrayList<Tarea> listaTareas = new ArrayList<>();
	
	public static void main(String[] args) {    
		Scanner input = new Scanner(System.in);
	
		int opcion = -1;
	
		do {
			System.out.println("MENU GESTOR TAREAS");
			System.out.println("------------------");
			System.out.println("1. Registrar tarea");
			System.out.println("2. Listar tarea");
			System.out.println("3. Marcar tarea");
			System.out.println("0. Salir");
			System.out.println("\nEliga una opcion: ");
		
			opcion = input.nextInt();
		
			switch (opcion) {
				case 1:
					registrarTarea();
					break;
				case 2:
					listarTarea();
					break;
				case 3:
					marcarTarea();
					break;
				case 0:
					System.out.println("Adios");
					break;
				default:
					System.out.println("ERROR. Opcion no valida.\n");
					break;
			}		
		} while (opcion != 0);
	
		input.close();
	}

	public static void registrarTarea() {
		// TODO: Implementar metodo registrarTarea - Uriel
	}

	public static void listarTarea() {
		// TODO: Implementar metodo listarTarea - Santos
	}

	public static void marcarTarea() {
		System.out.println("Total de tareas: " + listaTareas.size());
    
		System.out.print("Numero de tarea a completar: ");
		Scanner input = new Scanner(System.in);
		int indice = input.nextInt() - 1;
    
		if (indice >= 0 && index < listaTareas.size()) {
			listaTareas.get(index).setCompletada(true);
			System.out.println("Completada");
		} else {
			System.out.println("Invalido.");
		}
	}
}
