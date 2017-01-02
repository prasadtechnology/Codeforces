import java.util.*;

public class Dragons{

		static class StrengthBonus{
			int dragonStrength;
			int bonus;
			StrengthBonus(int dragonStrength,int bonus){
				this.dragonStrength = dragonStrength;
				this.bonus = bonus;
			}
		}

		public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int strength = in.nextInt();
		int dragons = in.nextInt();
		List<StrengthBonus> list = new ArrayList<StrengthBonus>();



		for(int i = 0; i < dragons; i++){
			StrengthBonus sb = new StrengthBonus(in.nextInt(),in.nextInt());
			list.add(sb);
		}

		Comparator<StrengthBonus> strengthComaparator = new Comparator<StrengthBonus>(){
			public int compare(StrengthBonus sb1,StrengthBonus sb2){
				return sb1.dragonStrength - sb2.dragonStrength;
			}
		};

		Collections.sort(list,strengthComaparator);

		for(int j = 0; j < dragons; j++){
			StrengthBonus sb = list.get(j);
			if(strength <= sb.dragonStrength){
				System.out.println("NO");
				return;				
			}else{
				strength += sb.bonus;
			}
		}

		System.out.println("YES");
	}
}

