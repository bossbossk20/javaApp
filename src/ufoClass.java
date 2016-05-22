
public class ufoClass {
	private int score;
	public ufoClass(){
		plusScore(0);
	}
	public ufoClass(int aScore){
		setScore(aScore);
	}
	public void plusScore(int aScore){
		  score = getScore() + aScore; 
	}
	public void setScore(int aScore){
		score = aScore;
	}
	public int getScore(){
		return score;
	}
	

}
