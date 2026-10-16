package mx.unison;

import java.util.Scanner;

public class Gestor {
  public static void main(String[] args) {    
    Scanner input = new Scanner(System.in);
	
	int opcion = 1;
	
	do {
		System.out.println("MENU GESTOR TAREAS");
		System.out.println("------------------");
		System.out.println("1. Registrar tarea");
		System.out.println("2. Listar tarea");
		System.out.println("3. Marcar tarea");
		System.out.println("0. Salir");
		System.out.println("\n Eliga una opcion: ");
		
		opcion = input.nextInt();
		
		if (opcion == 1){
			registrarTarea();
		} else if (opcion == 2) {
			listarTarea();
		} else if (opcion == 3) {
			marcarTarea();
		} else if (opcion == 0) {
			System.out.println("Adios");
		} else {
			System.out.println("ERROR. Input no valido.");
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
    // TODO: Implementar metodo marcarTarea - Santiago
  }
}
