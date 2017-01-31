class Test{


	public static void main(String[] args) {

		String str = "hello";
		//h
		//he
		//hel
		//hell
		//hello
		System.out.println(str+'c');

		// int a[] = {1,2,3};
		// for(int i = 1; i < (1 << 3); i++){
		// 	for(int j = 0; j < a.length; j++){
		// 		if((i&(1 << j)) > 0){
		// 			System.out.print(a[a.length - j - 1]+" ");
		// 		}
		// 	}
		// 	System.out.println();
		// }

		//Knapsack problem psudo code
		//building matrix
		// int targetcapacity = 10;
		// int wghts[] = {5,4,6,3};
		// int values[] = {10,40,30,50};
		// int itemweight[][] = new int[wghts.length+1][targetcapacity+1];


		// // System.out.println("rows : "+(wghts.length+1)+"cols : "+(targetcapacity+1));

		// for(int item = 0; item <= wghts.length; item++){
		// 	// int currentWght = wghts[item];
		// 	for(int weight = 0; weight <= targetcapacity; weight++){
		// 		if(item == 0 || weight == 0){
		// 			itemweight[item][weight] = -1;
		// 		}
		// 		else if(item == 1){
		// 			if(wghts[item-1] <= weight){
		// 				itemweight[item][weight] = values[item-1];
		// 			}
		// 		}
		// 		else if(itemweight[item-1][weight] != 0){
		// 			int max_value = values[item-1];
		// 			for(int prevItems = item - 2; prevItems >= 0; prevItems--){
		// 				if(wghts[item-1]+wghts[prevItems] <= weight){
		// 					max_value = Math.max(max_value,values[item-1]+values[prevItems]);
		// 				}else{
		// 					max_value = Math.max(max_value,values[prevItems]);
		// 				}
		// 			}
		// 			itemweight[item][weight] = max_value;
		// 		}else{
		// 			itemweight[item][weight] = 0;
		// 		}
		// 	}
		// }

		// for(int item = 0; item <= wghts.length; item++){
		// 	// int currentWght = wghts[item];
		// 	for(int weight = 0; weight < targetcapacity+1; weight++){
		// 		System.out.print(itemweight[item][weight]+":");
		// 	}
		// 	System.out.println();
		// }
	}
}