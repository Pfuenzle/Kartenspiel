
public class Main {
	public static void main(String[] args)
	{
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
		
			
	}
}
