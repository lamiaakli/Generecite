package exo_cours;

public class BoiteNonGenerique {
	private Object value ;
	
	public BoiteNonGenerique(Object o) {
		value = o;
		
		
	}
	public  Object getValue() {
		return value;
	}
	public void setValue(Object value ) {
		this.value = value;
		
	}

	public String toString() {
		return "BoiteNonGenerique {" + "value=" +value+ '}';
	}
	

}
