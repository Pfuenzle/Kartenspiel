
public class Spielkarte {
	int typ; // 1=HERZ 2=PIK 3=KREUZ 4=KARO
	int stufe;
	public Spielkarte(int typ, int stufe)
	{
		this.typ = typ;
		this.stufe = stufe;
	}
	int getTyp()
	{
		return this.typ;
	}
	int getStufe()
	{
		return this.stufe;
	}
}

