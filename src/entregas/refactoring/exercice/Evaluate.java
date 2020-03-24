package entregas.refactoring.exercice;

/**
 * 
 * Dada la siguiente clase:
 * 
 * 	1.- Lee el código y crea los tests de junit necesarios
 * 		1.1.- Sigue las indicaciones de la asignatura buscando la máxima cobertura posible
 * 
 * 	2.- Realiza las correcciones que veas necesarias para mejorar la calidad del código.
 *  	2.1.- Añade un comentario en el código explicando el cambio que has realizado
 *  
 * @author Raul.Camarero
 *
 */

public class Evaluate {

	//Los atributos de la clase los he puesto privados
	
	private String id; 
	
	private String name;
	
	private String evaluations [] = new String[3];
	
	//He añadido un constructor por defecto
	
	public Evaluate() {
		
	}
	
	//public Evaluate(String id, String name, String[] evaluations) { 
	//	this.id = id;
	//	this.name = name;
	//	this.evaluations = evaluations;
	//}
	
	public Evaluate(String id, String name) {
		this.id = id;
		this.name = name;	
	}
	
	// He cambiado los enteros por double para poder meter notas más exactas
	public void evaluate_pupil(double value) {  
		
		String annotation = null;
		
		if(value > 10) {
			throw new RuntimeException("La nota no es válida. Nadie saca más de 10!!!");
		}
		
		//He creado un método para asignar la nota de la asignatura
		annotation = grade(value, annotation); 
	
		//He creado otro método para asignar la nota a la la evaluación
		evaluationGrade(annotation);
		
	}

		//Este if lo he simplificado con varios else if para que sea más fácil leerlo 
		//y he cambiado algunas palabras para no mezclar el inglés y el español
		
		public String grade(double value, String annotation) {
			
			if( value <= 10 && value >=9 ) {
				
				annotation = "SOBRESALIENTE";
				
			}
			if (value <= 8 && value >=7 ) {
				
				annotation = "NOTABLE";
			
			}
			if (value < 7 && value >=6) {
				
				annotation = "BIEN";
				
			}
			
			if(value < 6 && value >=5) {
				
				annotation = "SUFICIENTE"; 
				
			}
			if (value < 5 && value >=0 ) {
				annotation = "SUSPENSO";
				
			} 
			
		
			return annotation;
		}
		
	public void evaluationGrade(String annotation) {
		
	
		
		for (int i = 0; i < evaluations.length; i++) {
			
			if (annotation == null) {
				
				break;
			}
			
			if(evaluations[i] == null) {
				
				evaluations[i]= annotation;
				
				System.out.println("Añadir al alumno "+name+"("+id+") la nota "+evaluations[i].toString());
				
				break;
			}
		}
	}

	//Los Getters y Setters por si hacen falta con el constructor por defecto

	public String[] getEvaluations() {
		return evaluations;
	}
	
	//Dejo comentado este setter por si es necesario en un futuro
//	public void setEvaluations(String[] evaluations) {
//		this.evaluations = evaluations;
//	}
	
}

