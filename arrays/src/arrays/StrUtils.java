package arrays;

public class StrUtils {
	
	public int countChars(String s) {          //der String s ist irgendein String, er wird in den Klammern erstellt (vielleicht undifiniert?!)
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) { //s.length(); greift aus die l�nge eines Strings zu (also z�hlt die Buchstaben [ab 0])
			
			if (Character.isLetter(s.charAt(i))) {
			count++; //immer plus 1 solange i kleiner ist als die l�nge des Strings
			}
		}
		
		return count;
	}

}
