package vistas;
import java.util.Scanner;

public abstract class MenuTemplate {

	protected Scanner sc = new Scanner(System.in);
	
	public void iniciarMenu() {
		while(true) {
			System.out.println("Bienvenido al colegio Latinoamericano");
			System.out.println("Ingrese una de estas opciones");
			System.out.println("1. Crear Alumno");
			System.out.println("2. Listar Alumnos");
			System.out.println("3. Agregar Materias");
			System.out.println("4. Agregar Notas");
			System.out.println("5. Exportar datos");
			System.out.println("6. Salir");
			System.out.println("Seleccione una opción: ");
			int opcion = sc.nextInt();
			sc.nextLine();
			switch(opcion) {
				case 1 : crearAlumno();
				case 2 : listarAlumnos();
				case 3 : agregarMateria();
				case 4: agregarNotaPasoUno();
				case 5: exportarDatos();
				case 6: {
					terminarPrograma();
					return;
				}
				
			
			}
			
		}
	}
	
	 	protected abstract void exportarDatos();
	    protected abstract void crearAlumno();
	    protected abstract void agregarMateria();
	    protected abstract void agregarNotaPasoUno();
	    protected abstract void listarAlumnos();
	    protected abstract void terminarPrograma();
}
