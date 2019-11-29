package objetos.arbol;

public class Rama extends ElementoArbol {
	private ElementoArbol elem1;
	private ElementoArbol elem2;
	private ElementoArbol elem3;
	
	
	
	public void prueba() {
	}
	
	
	public Rama() {
	
	}
	
	@Override
	public String toString() {
		return "Rama [elem1=" + elem1 + ", elem2=" + elem2 + ", elem3=" + elem3 + ", toString()="+ "]";
	}

	/**
	 * @param tronco
	 * @param ramas
	 * @param hojas
	 * @param frutos
	 * @param elem1
	 * @param elem2
	 * @param elem3
	 */
	public Rama( ElementoArbol elem1, ElementoArbol elem2, ElementoArbol elem3) {
		super();
		this.elem1 = elem1;
		this.elem2 = elem2;
		this.elem3 = elem3;
	}

	/**
	 * @return the elem1
	 */
	public ElementoArbol getElem1() {
		return elem1;
	}

	/**
	 * @param elem1 the elem1 to set
	 */
	public void setElem1(ElementoArbol elem1) {
		this.elem1 = elem1;
	}

	/**
	 * @return the elem2
	 */
	public ElementoArbol getElem2() {
		return elem2;
	}

	/**
	 * @param elem2 the elem2 to set
	 */
	public void setElem2(ElementoArbol elem2) {
		this.elem2 = elem2;
	}

	/**
	 * @return the elem3
	 */
	public ElementoArbol getElem3() {
		return elem3;
	}

	/**
	 * @param elem3 the elem3 to set
	 */
	public void setElem3(ElementoArbol elem3) {
		this.elem3 = elem3;
	}

	
	
	

	
	
	

}
