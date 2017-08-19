
public class Spielkarte {
	int typ; // 1=HERZ 2=PIK 3=KREUZ 4=KARO
	int stufe; // 1=SIEBEN 2=ACHT 3=NEUN 4=ZEHN 5=BUBE 6=DAME 7=KOENIG 8=ASS
	String name;
	int id;
	public Spielkarte(int typ, int stufe, String name, int id)
	{
		this.typ = typ;
		this.stufe = stufe;
		this.name = name;
		this.id = id;
	}
	int getTyp()
	{
		return this.typ;
	}
	int getStufe()
	{
		return this.stufe;
	}
	String getName()
	{
		return this.name;
	}
	int getId()
	{
		return this.id;
	}
}

