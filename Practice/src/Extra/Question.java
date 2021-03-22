package Extra;

public class Question {

	//instance variables
	private String question;
	private String possibleAnswer1;
	private String possibleAnswer2;
	private String possibleAnswer3;
	private String possibleAnswer4;
	private int correct;

	// Constructor to set question, four possible answers and the correct answer of type integer
	public Question(String question, String possibleAnswer1, String possibleAnswer2, String possibleAnswer3, String possibleAnswer4,int correct){
		this.question=question;
		this.possibleAnswer1=possibleAnswer1;
		this.possibleAnswer2=possibleAnswer2;
		this.possibleAnswer3=possibleAnswer3;
		this.possibleAnswer4=possibleAnswer4;
		this.correct=correct;
	}

	//Method returns the question
	public void setQuestion(String question){
		this.question=question;
	}


	//Set first possible answer
	public void setPossibleAnswer1(String possibleAnswer1){
		this.possibleAnswer1=possibleAnswer1;
	}

	//Set Second possible answer
	public void setPossibleAnswer2(String possibleAnswer2){
		this.possibleAnswer2=possibleAnswer2;
	}

	//Set third possible answer
	public void setPossibleAnswer3(String possibleAnswer3) {
		this.possibleAnswer3 = possibleAnswer3;
	}

	//Set four possible answer
	public void setPossibleAnswer4(String possibleAnswer4) {
		this.possibleAnswer4 = possibleAnswer4;
	}

	//Set the correct answer as integer type
	public void setAnswer(int correct) {
		this.correct = correct;
	}

	//Method returns the question
	public String getQuestion(){
		return question;
	}

	//Return first possible answer
	public String getPossibleAnswer1() {
		return possibleAnswer1;
	}

	//Return second possible answer
	public String getPossibleAnswer2() {
		return possibleAnswer2;
	}

	//Return third possible answer
	public String getPossibleAnswer3() {
		return possibleAnswer3;
	}

	//Return four possible answer
	public String getPossibleAnswer4() {
		return possibleAnswer4;
	}

	//Return correct answer
	public int getAnswer() {
		return correct;
	}
}//end of the Question