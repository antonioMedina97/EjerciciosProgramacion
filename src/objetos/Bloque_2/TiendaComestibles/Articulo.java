package objetos.Bloque_2.TiendaComestibles;

public class Articulo {

		private int codigo;
		private String nombre;
		private float precio;
		/**
		 * @param codigo
		 * @param nombre
		 * @param precio
		 */
		public Articulo(int codigo, String nombre, float precio) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.precio = precio;
		}
		/**
		 * @return the codigo
		 */
		public int getCodigo() {
			return codigo;
		}
		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the precio
		 */
		public float getPrecio() {
			return precio;
		}
		/**
		 * @param precio the precio to set
		 */
		public void setPrecio(float precio) {
			this.precio = precio;
		}
		
		
}
