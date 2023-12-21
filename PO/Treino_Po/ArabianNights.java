import Arabiannights.Genie;
import Arabiannights.MagicLamp;
import Arabiannights.RecyclableDemon;

public class ArabianNights {
    public static void main(String args[]) {

		/* 01 */ MagicLamp m = new MagicLamp(4);
		/* 02 */ Genie gv[] = { m.rub(2), m.rub(3), m.rub(4), m.rub(5), m.rub(1) };
		/* 03 */ for (Genie g : gv) System.out.println(g);
		
		System.out.println("======================");
		
		/* 04 */ for (Genie g : gv) g.grantwish();
		/* 05 */ for (Genie g : gv) System.out.println(g);
		
		System.out.println("======================");
		
		/* 06 */ for (Genie g : gv) g.grantwish();
		/* 07 */ for (Genie g : gv) System.out.println(g);
		
		System.out.println("======================");
		
		// recyclable demon is the last one in the array
		/* 08 */ m.feedDemon((RecyclableDemon) gv[4]);
		/* 09 */ Genie g = m.rub(7);
		/* 10 */ System.out.println(g);
		
		System.out.println("======================");

	}
}
