import java.util.concurrent.ThreadLocalRandom;

public class Spielkarten {
	static Spielkarte blank;
	static Spielkarte herz_sieben = new Spielkarte(1, 1, "Herz Sieben", 1);
	static Spielkarte pik_sieben = new Spielkarte(2, 1, "Pik Sieben", 2);
	static Spielkarte kreuz_sieben = new Spielkarte(3, 1, "Kreuz Sieben", 3);
	static Spielkarte karo_sieben = new Spielkarte(4, 1, "Karo Sieben", 4);

	static Spielkarte herz_acht = new Spielkarte(1, 2, "Herz Acht", 5);
	static Spielkarte pik_acht = new Spielkarte(2, 2, "Pik Acht", 6);
	static Spielkarte kreuz_acht = new Spielkarte(3, 2, "Kreuz Acht", 7);
	static Spielkarte karo_acht = new Spielkarte(4, 2, "Karo Acht", 8);

	static Spielkarte herz_neun = new Spielkarte(1, 3, "Herz Neun", 9);
	static Spielkarte pik_neun = new Spielkarte(2, 3, "Pik Neun", 10);
	static Spielkarte kreuz_neun = new Spielkarte(3, 3, "Kreuz Neun", 11);
	static Spielkarte karo_neun = new Spielkarte(4, 3, "Karo Neun", 12);

	static Spielkarte herz_zehn = new Spielkarte(1, 4, "Herz Zehn", 13);
	static Spielkarte pik_zehn = new Spielkarte(2, 4, "Pik Zehn", 14);
	static Spielkarte kreuz_zehn = new Spielkarte(3, 4, "Kreuz Zehn", 15);
	static Spielkarte karo_zehn = new Spielkarte(4, 4, "Karo Zehn", 16);

	static Spielkarte herz_bube = new Spielkarte(1, 5, "Herz Bube", 17);
	static Spielkarte pik_bube = new Spielkarte(2, 5, "Pik Bube", 18);
	static Spielkarte kreuz_bube = new Spielkarte(3, 5, "Kreuz Bube", 19);
	static Spielkarte karo_bube = new Spielkarte(4, 5, "Karo Bube", 20);

	static Spielkarte herz_dame = new Spielkarte(1, 6, "Herz Dame", 21);
	static Spielkarte pik_dame = new Spielkarte(2, 6, "Pik Dame", 22);
	static Spielkarte kreuz_dame = new Spielkarte(3, 6, "Kreuz Dame", 23);
	static Spielkarte karo_dame = new Spielkarte(4, 6, "Karo Dame", 24);

	static Spielkarte herz_koenig = new Spielkarte(1, 7, "Herz König", 25);
	static Spielkarte pik_koenig = new Spielkarte(2, 7, "Pik König", 26);
	static Spielkarte kreuz_koenig = new Spielkarte(3, 7, "Kreuz König", 27);
	static Spielkarte karo_koenig = new Spielkarte(4, 7, "Karo König", 28);

	static Spielkarte herz_ass = new Spielkarte(1, 8, "Herz Ass", 29);
	static Spielkarte pik_ass = new Spielkarte(2, 8, "Pik Ass", 30);
	static Spielkarte kreuz_ass = new Spielkarte(3, 8, "Kreuz Ass", 31);
	static Spielkarte karo_ass = new Spielkarte(4, 8, "Karo Ass", 32);
	
	static Spielkarte[] deck = {
			blank,
			herz_sieben,
			pik_sieben,
			kreuz_sieben,
			karo_sieben,

			herz_acht,
			pik_acht,
			kreuz_acht,
			karo_acht,
			
			herz_neun,
			pik_neun,
			kreuz_neun,
			karo_neun,
			
			herz_zehn,
			pik_zehn,
			kreuz_zehn,
			karo_zehn,
			
			herz_bube,
			pik_bube,
			kreuz_bube,
			karo_bube,
			
			herz_dame,
			pik_dame,
			kreuz_dame,
			karo_dame,
			
			herz_koenig,
			pik_koenig,
			kreuz_koenig,
			karo_koenig,
			
			herz_ass,
			pik_ass,
			kreuz_ass,
			karo_ass,
		};
	
	static boolean[] ausgeteilt = new boolean[32];
	
	static int[] austeilen(int karten)
	{
		int[] deckarray = new int[karten];
		int lauf = 0;
		int num = 0;
		for (int i = 0;i < karten;i++)
		{
			boolean done = false;
			while(done == false)
			{
				int randomNum = ThreadLocalRandom.current().nextInt(1, 32);
				num = randomNum;
				if(!ausgeteilt[num])
					done = true;
			}
			deckarray[i] = num;
			ausgeteilt[num] = true;
			lauf++;
		}
		return deckarray;
			
	}
}
