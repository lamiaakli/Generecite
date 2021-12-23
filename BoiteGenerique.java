package exo_cours;

public class BoiteGenerique <E> {
	
	private E value;
	
	public BoiteGenerique (E value) {
		this.value = value;
	}
	
	public E getValue() {
		return value;
	}
	public void SetValue(E value) {
		this.value = value;
	}
	public String toString() {
		return "BoiteGenerique {" + "value =" +value+ "}";
		
				}

}
