package tarea;

public class Pez implements Animal {
	
    @Override
	
	public void hacerSonido() {
		
		System.out.println("Glu Glu");
		
	}
	
	@Override 
	
	public void moverse() {
		
		System.out.println("Nadando como un pez.");
		
	}

}
