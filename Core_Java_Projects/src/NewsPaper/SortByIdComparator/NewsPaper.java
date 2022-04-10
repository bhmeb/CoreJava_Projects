package NewsPaper.SortByIdComparator;

public class NewsPaper implements Comparable<NewsPaper>{
	
	private int regId;
	private String publisher;
	private float dailyRate;
	
	public NewsPaper(int regId, String publisher, float dailyRate) {
		this.regId = regId;
		this.publisher = publisher;
		this.dailyRate = dailyRate;
	}
	
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getDailyRate() {
		return dailyRate;
	}
	public void setDailyRate(float dailyRate) {
		this.dailyRate = dailyRate;
	}

	@Override
	public String toString() {
		return regId+"\n"+publisher+"\n"+dailyRate;
	}

	@Override
	public int compareTo(NewsPaper o) {
		return toString().compareTo(o.toString());
	}
}
