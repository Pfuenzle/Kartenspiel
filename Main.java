
public class Main {
	public static void main(String[] args)
	{
		
		
		System.out.println("Legetest(Muss verbessert werden bzw. universell gemacht werden): ");
		boolean gelegt = false;
		Spielkarte karte1 = Spielkarten.herz_zehn; //aktive Karte
		Spielkarte karte2 = Spielkarten.pik_bube;
		Spielkarte karte3 = Spielkarten.herz_neun;
		if(karte2.getTyp() == karte1.getTyp())
		{
			if(karte2.getStufe() <= karte1.getStufe())
				System.out.println("Karte 2 kann nicht gelegt werden, da sie zu niedrig ist.");
			else
			{
				System.out.println("Karte 2 kann gelegt werden.");
				gelegt = true;
			}
		}
		else
			System.out.println("Karte 2 kann nicht gelegt werden, da sie zu einem anderen Typ gehört");
		
		if(gelegt)
		{
			if(karte3.getTyp() == karte2.getTyp())
			{
				if(karte3.getStufe() <= karte2.getStufe())
					System.out.println("Karte 3 kann nicht gelegt werden, da sie zu niedrig ist.");
				else
					System.out.println("Karte 3 kann gelegt werden.");
			}
			else
				System.out.println("Karte 3 kann nicht gelegt werden, da sie zu einem anderen Typ gehört");
		}

		else
		{
			if(karte3.getTyp() == karte1.getTyp())
			{
				if(karte3.getStufe() <= karte1.getStufe())
					System.out.println("Karte 3 kann nicht gelegt werden, da sie zu niedrig ist.");
				else
					System.out.println("Karte 3 kann gelegt werden.");
			}
			else
				System.out.println("Karte 3 kann nicht gelegt werden, da sie zu einem anderen Typ gehört");
		}
		
		
		
		
		
		
		System.out.println("\n\n\nKarten austeilen: ");
		
		int karten = 5;
		
		int[] deck1 = new int[karten];
		deck1 = Spielkarten.austeilen(karten);
		
		int[] deck2 = new int[karten];
		deck2 = Spielkarten.austeilen(karten);
		
		System.out.println("Deck 1: ");
		for(int i = 0; i < karten; i++)
		{
			System.out.print(deck1[i] + " ");
		}
		
		System.out.println("\nDeck 2: ");
		for(int i = 0; i < karten; i++)
		{
			System.out.print(deck2[i] + " ");
		}
		
		
		
		
		
		
		System.out.println("\n\n\nIDs in Karten umwandeln: ");	

		int max_karten = 32;
		
		System.out.println("Deck 1: ");	
		Spielkarte[] spieldeck1 = new Spielkarte[max_karten];
		for(int i = 0; i < karten; i++)
		{
			spieldeck1[i] = Spielkarten.deck[deck1[i]];
		}
		
		for(int i = 0; i < karten; i++)
		{
			System.out.print(spieldeck1[i].getName() + ", ");
		}
		
		System.out.println("\nDeck 2: ");	
		Spielkarte[] spieldeck2 = new Spielkarte[max_karten];
		for(int i = 0; i < karten; i++)
		{
			spieldeck2[i] = Spielkarten.deck[deck2[i]];
		}
		
		for(int i = 0; i < karten; i++)
		{
			System.out.print(spieldeck2[i].getName() + ", ");
		}
		
		
		
		
		
		
		System.out.println("\n\n\nIDs zum rückwärts auslesen testen: ");
		
		System.out.println("Deck 1: ");	
		for(int i = 0; i < karten; i++)
		{
			System.out.print(spieldeck1[i].getId() + " ");
		}
		
		System.out.println("\nDeck 2: ");
		
		for(int i = 0; i < karten; i++)
		{
			System.out.print(spieldeck2[i].getId() + " ");
		}
		
	}
}
