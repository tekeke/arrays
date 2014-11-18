package arrays;

public class StrUtils {
	
	public int countChars(String s) {          //der String s ist irgendein String, er wird in den Klammern erstellt (vielleicht undifiniert?!)
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) { //s.length(); greift aus die länge eines Strings zu (also zählt die Buchstaben [ab 0])
			
			if (Character.isLetter(s.charAt(i))) {
			count++; //immer plus 1 solange i kleiner ist als die länge des Strings
			}
		}
		
		return count;
	}

}
