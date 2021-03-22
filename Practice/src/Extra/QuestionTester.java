package Extra;

import java.util.Scanner;

public class QuestionTester {

	public static void main(String[] args) {

		//Crate an Instance of Scanner class to read input
		Scanner keyboard = new Scanner(System.in);

		//set fixed size of array
		final int NUMBER_OF_QUESTION = 11;
		int player1Score=0;
		int player2Score=0;

		// Create an instance of the class Question with answer of the question class object
		Question[] triviaQues = new Question[NUMBER_OF_QUESTION];

		//Instantiate 10 question with question 4 possible answer and correct answer of type integer
		triviaQues[1]=new Question("What is the Capital City of Alberta?","Calgary","Edmonton","Banff","Lethbridge",2);
		triviaQues[2]=new Question("What is the Capital City of British Columbia?","Vitoria","Vancouver","Whistler","Penticton",1);
		triviaQues[3]=new Question("What is the Capital City of Manitoba?","Brandon","Thompson","Steinbach","Winnipeg",4);
		triviaQues[4]=new Question("What is the Capital City of New Brunswick?","Saint John","Fredericton","Moncton","Dieppe",2);
		triviaQues[5]=new Question("What is the Capital City of Newfoundland and Labrador?","Conception Bay South","Mount Pearl","St. John's","Corner Brook",3);
		triviaQues[6]=new Question("What is the Capital City of Nova Scotia?","Cape Breton","New Glasgow","West Hants","Halifax",4);
		triviaQues[7]=new Question("What is the Capital City of Ontario?","Toronto","Ottawa","Mississauga","Hamilton",1);
		triviaQues[8]=new Question("What is the Capital City of Quebec?","Montreal","Sherbrooke","Quebec City","Gatineau",3);
		triviaQues[9]=new Question("What is the Capital City of Saskatchewan?","Saskatoon","Regina","Weyburn","Estevan",2);
		triviaQues[10]=new Question("What is the Capital City of Yukon?","Whitehorse","Haines Junction","Unorganized Yukon","Destruction Bay",1);

		System.out.println("Player - 1");
		for (int index = 1;index<triviaQues.length;index++){
			//Print Trivia Object Question
			System.out.println("(" + index+ ") " + triviaQues[index].getQuestion());
			System.out.println("1." + triviaQues[index].getPossibleAnswer1());
			System.out.println("2." + triviaQues[index].getPossibleAnswer2());
			System.out.println("3." + triviaQues[index].getPossibleAnswer3());
			System.out.println("4." + triviaQues[index].getPossibleAnswer4());
			System.out.print("Enter Answer: ");

			//Prompt user for answer
			int userAnswer = keyboard.nextInt();
			if (triviaQues[index].getAnswer()==userAnswer){
				System.out.println("Correct");
				player1Score++;
			} else {
				System.out.println("Sorry, that is incorrect. The correct answer is " + triviaQues[index].getAnswer());
			}
		}

		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();

		System.out.println("Player - 2");
		for (int index = 1;index<triviaQues.length;index++){
			//Print Trivia Object Question
			System.out.println("(" + index+ ") " + triviaQues[index].getQuestion());
			System.out.println("1." + triviaQues[index].getPossibleAnswer1());
			System.out.println("2." + triviaQues[index].getPossibleAnswer2());
			System.out.println("3." + triviaQues[index].getPossibleAnswer3());
			System.out.println("4." + triviaQues[index].getPossibleAnswer4());
			System.out.print("Enter Answer: ");

			//Prompt user for answer
			int userAnswer = keyboard.nextInt();
			if (triviaQues[index].getAnswer()==userAnswer){
				System.out.println("Correct");
				player2Score++;
			} else {
				System.out.println("Sorry, that is incorrect. The correct answer is " + triviaQues[index].getAnswer());
			}
		}

		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();

		//print the both player points
		System.out.println("Player 1's Point: " + player1Score);
		System.out.println("Player 2's Point: " + player2Score);

		System.out.println();

		//Check if player1 Score and Player2 Score are equal
		if (player1Score==player2Score){
			//print game is the
			System.out.println("Game is tie.");

			//check if player1 score is greater than player2 score are equal
		} else if (player1Score>player2Score){
			//print player-1 won the game
			System.out.println("player-1 won the game.");
		} else {
			//print player-2 won the game
			System.out.println("player-2 won the game.");
		}
	}
}