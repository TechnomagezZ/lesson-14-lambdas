package exercises;

import java.util.List;


public class WordsList{
	boolean hasP = false;
	boolean overTen = false;
	
	public WordsList(boolean hasP, boolean overTen){
		super();
		this.hasP = hasP;
		this.overTen = overTen;
	}
	
	public boolean hasP() {
		List<String> messages = loadWordList();
		 for(int i = 0; i <= messages.size(); i++) {
			 String words = messages.get(i);
			 char ch = words.charAt(0);
			 char chP = 'P';
			 if(ch == chP){
			     hasP = true;
			 }
		 }
		 return hasP;
	 }

	public boolean overTen() {
		List<String> messages = loadWordList();
		for(int i = 0; i <= messages.size(); i++) {
			String words = messages.get(i);
			if(words.length() == 10) {
				overTen = true;
			}
			else {
				overTen = false;
			}
				
		}
		return overTen;
	}
	
	

	
	
}
