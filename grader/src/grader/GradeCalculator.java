package grader;

import java.util.ArrayList;
import java.util.List;

public class GradeCalculator {
	private List<Float> tests = new ArrayList<>();
	private List<Float> assignments = new ArrayList<>();
	private List<Float> hw = new ArrayList<>();
	private List<Float> quizes = new ArrayList<>();
	
	private float calcFullAvg(float percTest, float percAssign, float percHW, float percQuiz) { 
		float test = testAvg(tests) * percTest;
		float quiz = quizAvg(quizes) * percQuiz;
		float hws = hwAvg(hw) * percHW;
		float assign = assignAvg(assignments) * percAssign; 
		float avg = test + quiz + hws + assign;
		return avg;

	}
	private float testAvg(List<Float> testGrades) {
		float temp = 0; 
		for(int i = 0; i < testGrades.size();i++ ) {
			temp += testGrades.get(i);
		}
		float avg = temp / testGrades.size();
		return avg;
	}
	private float quizAvg(List<Float> quizGrades) {
		float temp = 0; 
		for(int i = 0; i < quizGrades.size();i++ ) {
			temp += quizGrades.get(i);
		}
		float avg = temp / quizGrades.size();
		return avg;
	}
	private float hwAvg(List<Float> hwGrades) {
		float temp = 0; 
		for(int i = 0; i < hwGrades.size();i++ ) {
			temp += hwGrades.get(i);
		}
		float avg = temp / hwGrades.size();
		return avg;
	}
	private float assignAvg(List<Float> assignGrades) {
		float temp = 0; 
		for(int i = 0; i < assignGrades.size();i++ ) {
			temp += assignGrades.get(i);
		}
		float avg = temp / assignGrades.size();
		return avg;
	}
}
