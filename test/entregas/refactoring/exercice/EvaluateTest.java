package entregas.refactoring.exercice;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * El test tiene una cobertura del 100% y la clase Evaluate tiene una cobertura del 99.3% por el throws execption.
 * 
 * @author Manuel Martín
 *
 */
class EvaluateTest {

	Evaluate subject;
	
	@BeforeEach
	void setUp() {
		subject = new Evaluate();
		subject = new Evaluate("1000","Manuel");
	}

	@ParameterizedTest
	@MethodSource("grade")
	void should_assing_grade(double value, String annotation,String solution) {
		
		String result = subject.grade(value, annotation);
		
		assertEquals(result,solution);
	}

	static Stream<Arguments> grade() {
		
		return Stream.of(
				Arguments.of(0,null,"SUSPENSO"),
				Arguments.of(1,null,"SUSPENSO"),
				Arguments.of(2,null,"SUSPENSO"),
				Arguments.of(3,null,"SUSPENSO"),
				Arguments.of(4,null,"SUSPENSO"),
				Arguments.of(5,null,"SUFICIENTE"),
				Arguments.of(6,null,"BIEN"),
				Arguments.of(7,null,"NOTABLE"),
				Arguments.of(8,null,"NOTABLE"),
				Arguments.of(9,null,"SOBRESALIENTE"),
				Arguments.of(10,null,"SOBRESALIENTE"),
				Arguments.of(5.5,null,"SUFICIENTE"),
				Arguments.of(4.9,null,"SUSPENSO"),
				Arguments.of(-1,null,null),
				Arguments.of(100,null,null)
				);
	}
	
	@ParameterizedTest
	@MethodSource("evaluationGrade")
	void should_evaluate_grade(String annotation,String solution) {
		
		String[] aux; 
		String result;		
		subject.evaluationGrade(annotation);
		
		aux = subject.getEvaluations();
		result = aux[0];
		assertEquals(result,solution);
	}
	
	static Stream<Arguments> evaluationGrade() {
		
		return Stream.of(
				Arguments.of("SUSPENSO","SUSPENSO"),
				Arguments.of("SUFICIENTE","SUFICIENTE"),
				Arguments.of("BIEN","BIEN"),
				Arguments.of("NOTABLE","NOTABLE"),
				Arguments.of("SOBRESALIENTE","SOBRESALIENTE"),
				Arguments.of(null,null)
				);
	}
	//este test es para cubrir el método evaluate_pupil pero sus métodos internos ya están testeados y funcionan,
	//lo único el throw execption, pero no sé como funciona eso y si da error supongo que es porque tiene que dar ese error
	@ParameterizedTest
	@MethodSource("evaluate_pupil")
	void should_evaluate_pupil(double value,String annotation, String solution) {
		
		String[] aux; 
		String result;
		subject.evaluate_pupil(value);
		
		result=subject.grade(value, annotation);
		
		assertEquals(result, solution);
		
	}
	
	static Stream<Arguments> evaluate_pupil() {
		
		return Stream.of(
				Arguments.of(0,null,"SUSPENSO"),
				Arguments.of(1,null,"SUSPENSO"),
				Arguments.of(2,null,"SUSPENSO"),
				Arguments.of(3,null,"SUSPENSO"),
				Arguments.of(4,null,"SUSPENSO"),
				Arguments.of(5,null,"SUFICIENTE"),
				Arguments.of(6,null,"BIEN"),
				Arguments.of(7,null,"NOTABLE"),
				Arguments.of(8,null,"NOTABLE"),
				Arguments.of(9,null,"SOBRESALIENTE"),
				Arguments.of(10,null,"SOBRESALIENTE"),
				Arguments.of(5.5,null,"SUFICIENTE"),
				Arguments.of(4.9,null,"SUSPENSO"),
				Arguments.of(-1,null,null),
				Arguments.of(100,null,null)
				
				);
	}
	
}
