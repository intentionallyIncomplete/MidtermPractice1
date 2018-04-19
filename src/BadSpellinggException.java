
public class BadSpellinggException extends Exception{
	
	public static final long serialVersionUID = 42L;
	
	private String word1 = "test";
	
	public BadSpellinggException(String word2){
		
		if(this.word1.equals(word2)){
			System.out.println("The word: "+word2+" is spelled correctly");
		}else{
			System.out.println("The word " + word2 + " is not spelled correctly");
		}
	}
	
	public String getWord1(){
		return word1;
	}
}
