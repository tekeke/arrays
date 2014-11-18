package arrays;

public class Application {

	public static void main(String[] args) {
		/** Cat cat1 = new Cat();
		
		cat1.Name = "Charles";
		cat1.Age = 2;
		cat1.Breed = "ne schwarze Katze";
		cat1.Color = "schwarz";
		
		Cat cat2 = new Cat();
		
		cat2.Name = "Puss";
		cat2.Age = 13;
		cat2.Breed = "ne graue Katze";
		cat2.Color = "grau";
		
		
		
		Cat[] cats = {cat1, cat2}; //zwei Elemente daher die Länge 2, man fängt immer von Null an zu Zählen! z.B. 0, 1
		
		for(int i = 0; i < cats.length; i++){
		   System.out.println(cats[i].Name);
		
		
		} **/
		
		StrUtils su = new StrUtils();
		
		Plant plant1 = new Plant();
		Plant plant2 = new Plant();
		Plant plant3 = new Plant();
		Plant plant4 = new Plant();
		Plant plant5 = new Plant();
		
		plant1.botanicalName = "Mentha piperita";
		plant1.germanName = "Pfefferminze";
		
		plant2.botanicalName = "Petroselinum crispum";
		plant2.germanName = "Petersilie";
		
		plant3.botanicalName = "Pimpinella anisum";
		plant3.germanName = "Anis";
		
		plant4.botanicalName = "Piper nigrum";
		plant4.germanName = "Pfeffer";
		
		plant5.botanicalName = "Pisum sativum";
		plant5.germanName = "Erbse";
		
		Plant[] plants = {plant1, plant2, plant3, plant4, plant5};
		
		for (int i = 0; i < plants.length; i++) {
			
			String s = plants[i].botanicalName;
			int count = su.countChars(s);                    // Tutorium: Warum muss man das noch hinzufügen?!
			System.out.println(count);
		}
		

	}

}
