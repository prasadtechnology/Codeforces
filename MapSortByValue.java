import java.util.*;
public class MapSortByValue{
	public static void main(String[] args) throws Exception{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1,2);
		map.put(2,5);
		map.put(3,3);
		List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		Comparator cmp = new Comparator<Map.Entry<Integer,Integer>>(){
			public int compare(Map.Entry<Integer,Integer> e1,Map.Entry<Integer,Integer> e2){
				return e2.getValue() - e1.getValue();
			}
		};
		Collections.sort(list,cmp);
		LinkedHashMap lmap = new LinkedHashMap();
		for(Map.Entry<Integer,Integer> e : list){
			lmap.put(e.getKey(),e.getValue());
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}
}