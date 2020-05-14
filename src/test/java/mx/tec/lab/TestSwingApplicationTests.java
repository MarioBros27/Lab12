package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSwingApplicationTests {
	TestSwingApplication application = new TestSwingApplication();

	@Test
	void givenTwoIntegers_WhenSum_ThenCorrectResult() {
		// Given 5 and 7
		application.numberOneTextField.setText("5");
		application.numberTwoTextField.setText("7");
		String expectedResult = "12";

		// When operation is sum
		application.operationButton.doClick();

		// Then the result is 12
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void givenInvalidInput_WhenSum_ThenInputClearedAndNoResult() {
		// Given a and b
		application.numberOneTextField.setText("a");
		application.numberTwoTextField.setText("b");
		String expectedResult = "";
		
		// When operation is sum
		application.operationButton.doClick();
		
		//Then invalid input is cleared
		assertEquals(expectedResult, application.numberOneTextField.getText());
		assertEquals(expectedResult, application.numberTwoTextField.getText());
		
		//And no result is provided
		assertEquals(expectedResult, application.resultTextField.getText());

	}

}
