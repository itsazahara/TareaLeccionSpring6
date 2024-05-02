package tarea;

public class Gato implements Animal {
	
    @Override
	
	public void hacerSonido() {
		
		System.out.println("Miau Miau");
		
	}
	
	@Override 
	
	public void moverse() {
		
		System.out.println("Saltando como un gato.");
		
	}

}
