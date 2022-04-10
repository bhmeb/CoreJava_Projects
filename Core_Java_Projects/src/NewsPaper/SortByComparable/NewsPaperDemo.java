package NewsPaper.SortByComparable;

public class NewsPaperDemo {
	
	
	public static boolean replaceNewsPaperByRegId(NewsPaper[] newsPaper1, NewsPaper newsPaper2) {
		
		boolean flag=Boolean.FALSE;
		int a=newsPaper2.getRegId();
		for(int i=0;i<=newsPaper1.length;i++) {
			int b=newsPaper1[i].getRegId();
			if(a==b) {
				flag=Boolean.TRUE;
				break;
			}
		}
		return flag;
	}
}
