package NewsPaper.SortByUtilityClass;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		NewsPaper obj1 = new NewsPaper(1, "times news", 50.0f);
		NewsPaper obj2 = new NewsPaper(3, "economic times", 55.0f);
		NewsPaper obj3 = new NewsPaper(2, "business times", 45.0f);
		NewsPaper obj4 = new NewsPaper(4, "times mirror", 50.0f);
		NewsPaper obj5 = new NewsPaper(5, "news ABP", 40.0f);
		NewsPaper obj6 = new NewsPaper(2, "business india", 44.5f);

		NewsPaper[] obj = { obj1, obj2, obj3, obj4, obj5, obj6 };
		NewsPaper[] copyobj = { obj1, obj2, obj3, obj4, obj5 };

		for (int i = 0; i <= 4; i++) {
			copyobj[i] = obj[i];
		}

		Boolean value = NewsPaperDemo.replaceNewsPaperByRegId(copyobj, obj6);
		System.out.println(value);
		if (value.equals(Boolean.TRUE)) {
			System.out.println("Value Replaced");
			arraySortMethodOnBasisOfId(obj);
		} else {
			System.out.println("Value is not Rep");
		}
	}

	private static void arraySortMethodOnBasisOfId(NewsPaper[] doSort) {

		int id[] = new int[6];

		System.out.println("-----before sort------");
		for (int i = 0; i < doSort.length; i++) {
			System.out.println(doSort[i] + "");
		}
		
		//Array sort by id only
		for (int i = 0; i < doSort.length; i++) {
			id[i] = doSort[i].getRegId();
		}

		System.out.println("-----After sort------");
		Arrays.sort(id);
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i] + " ");
		}
	}
}
