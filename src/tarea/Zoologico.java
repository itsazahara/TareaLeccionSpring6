package tarea;
import java.util.List;

public class Zoologico {
	
	private List<Animal> animales;
	
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
		
	}
	
	public void mostrarAnimales() {
		for (Animal animal : animales) {
			System.out.println("Animal");
			animal.hacerSonido();
			animal.moverse();
			System.out.println();
		}
	}

}
