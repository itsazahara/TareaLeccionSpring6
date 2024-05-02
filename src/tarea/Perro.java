package tarea;
	
public class Perro implements Animal{

	@Override
	
	public void hacerSonido() {
		
		System.out.println("Guau Guau");
		
	}
	
	@Override 
	
	public void moverse() {
		
		System.out.println("Corriendo como un perro.");
		
	}
}
