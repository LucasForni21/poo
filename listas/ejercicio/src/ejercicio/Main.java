package ejercicio;

class Main {

	public static void main(String[] args) {
		
		Libros libro = new Libros(1,"12 reglas para vivir");
		Libros libro2 = new Libros(2,"Clean code");
		
		LinkedList<Libros> libreria = new LinkedList<Libros>();
		imprimir(libreria);
		
		libreria.add(libro);
		libreria.add(0,libro2);
		
		LinkedList<String> autores = new LinkedList<String>();


		
		public static void CambiarElemento(LinkedList<Libros> lista,Libros Libro,int indice) {
			
			if(lista.isEmpty()) {
				System.out.println("La lista se encuentra vacía");
			}else {
				lista.set(indice, Libro);
		        }
			}
	}

}
