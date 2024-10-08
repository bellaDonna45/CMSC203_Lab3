package gradebookpackage;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	@BeforeEach
	void setUp() throws Exception {
		GradeBook grade = new GradeBook(5);
		GradeBook book = new GradeBook(5);
		grade.addScore(50);
		grade.addScore(75);
		grade.addScore(96.5);
		book.addScore(25.75);
		book.addScore(100);
		book.addScore(89);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		GradeBook grade = new GradeBook(5);
		GradeBook book = new GradeBook(5);
		grade = null;
		book = null;

	}

	@Test
	void testAddScore() {
		GradeBook grade = new GradeBook(5);
		GradeBook book = new GradeBook(5);
		grade.addScore(50);
		grade.addScore(75);
		grade.addScore(96.5);
		book.addScore(25.75);
		book.addScore(100);
		book.addScore(89);
		
		
		
	}

	@Test
	void testSum() {
		
		GradeBook grade = new GradeBook(5);
		GradeBook book = new GradeBook(5);
		grade.addScore(50);
		grade.addScore(75);
		grade.addScore(96.5);
		book.addScore(25.75);
		book.addScore(100);
		book.addScore(89);
		
		assertEquals(221.5, grade.sum(), 0.0001);
		assertEquals(214.75, book.sum(), 0.0001);
		
	}

	@Test
	void testMinimum() {
		GradeBook grade = new GradeBook(5);
		GradeBook book = new GradeBook(5);
		grade.addScore(50);
		grade.addScore(75);
		grade.addScore(96.5);
		book.addScore(25.75);
		book.addScore(100);
		book.addScore(89);
		
		assertEquals(50, grade.minimum(), 0.001);
		assertEquals(25.75, book.minimum(), 0.0001);
		
	}

	@Test
	void testFinalScore() {
		
		GradeBook grade = new GradeBook(5);
		GradeBook book = new GradeBook(5);
		grade.addScore(50);
		grade.addScore(75);
		grade.addScore(96.5);
		book.addScore(25.75);
		book.addScore(100);
		book.addScore(89);
		
		assertEquals(171.5, grade.finalScore(), 0.001);
		assertEquals(189, book.finalScore(), 0.001);
	}

	@Test
	void testGetScoreSize() {
		
		GradeBook grade = new GradeBook(5);
		GradeBook book = new GradeBook(5);
		grade.addScore(50);
		grade.addScore(75);
		grade.addScore(96.5);
		book.addScore(25.75);
		book.addScore(100);
		book.addScore(89);
		
		assertEquals(3, grade.getScoreSize());
		assertEquals(3, book.getScoreSize()); 
		
	}

	@Test
	void testToString() {
		
		GradeBook grade = new GradeBook(5);
		GradeBook book = new GradeBook(5);
		grade.addScore(50);
		grade.addScore(75);
		grade.addScore(96.5);
		book.addScore(25.75);
		book.addScore(100);
		book.addScore(89);
		
		assertTrue(grade.toString().equals("50.0 75.0 96.5"));
		assertTrue(book.toString().equals("25.75 100.0 89.0"));
		
	}

}
