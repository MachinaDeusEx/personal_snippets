package FirstGradleProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Main {

	public static void main(String[] args) {
		System.out.println("ProgStart");
		
		String arg1 = "T1100 , ,T31235,  ,, T1231  , T4123";
		String[] args2 = new String[] { "  , ,T3214,T1231  , , ,   T4123  , T1100 , T31235", "  T31241,  T312312, , ,  ,T2423412,  , T23421 ", " ,, T1100 , T31235,  T5345, T4123 , , T1231 ", "T 0 4234, T4234, ,,T,4234" };
		ArrayList<String> decent = containsAll(arg1, args2);
		
		for (int i = 0; i < decent.size(); i++ ) {
			System.out.println(decent.get(i));
		}
		System.out.println(decent.size());

	}
	
	private static ArrayList<String> containsAll(String string, String[] stringVars) {
		long start = System.currentTimeMillis();
		
		String[] idS = string.split("[, ]");
		ArrayList<String> retVal = new ArrayList<String>();
		for (int i = 0; i < stringVars.length; i++) {
			boolean allOk = true;
			for (int j = 0; j < idS.length; j++) {
				if (!idS[j].equals("") && allOk)
					allOk = stringVars[i].contains(idS[j]);
			}
			if (allOk) 
				retVal.add(stringVars[i]);
		}
		
		System.out.println("Duration: "+(System.currentTimeMillis() - start));
		return retVal;		
	}
}
