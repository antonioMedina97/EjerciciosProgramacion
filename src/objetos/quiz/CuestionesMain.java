package objetos.quiz;

public class CuestionesMain {

	public static void main(String[] args) {
		Cuestion preguntas[] = new Cuestion[4];
		
		preguntas[0]= new CuestionVoF("Mi gato es guapo", 1);
		preguntas[1]= new CuestionVoF("Mi gato es feo", 2);
		preguntas[2]= new CuestionVoF("Mi gato es un borde", 1);
		preguntas[3]= new CuestionOpciones("Mi gato se llama:", 2, new String[] {"Lucía", "Flora", "Manuela", "Francisca"});
		
		
		int contadorCorrectas = 0;
		
		for (int i = 0; i < preguntas.length; i++) {
			if (preguntas[i].esRespuestaCorrecta(preguntas[i].imprimir())) {
				System.out.println("Acertaste we");
				contadorCorrectas++;
			}
			else {
				System.out.println("Te la kreiste whe");
			}
		}
		System.out.println("Acertaste " + contadorCorrectas + " preguntas whe xdd.");
	}

}
