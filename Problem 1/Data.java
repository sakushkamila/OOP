package Problem1;

public class Data{
	private double sum;
	private double max;
	private int cnt;


public Data() {
	sum=0;
	max=0;
	cnt=0;
}

public void add(int value) {
	sum+=value;
	cnt++;
	if(cnt==1) {
		max=Integer.MIN_VALUE;
		max=Math.max(value, max);
	}
	
	else max=Math.max(value, max);
}

public double average() {
	if(sum==0) {
		return 0;
	}
	
	else return sum/cnt;
}

public double maximum() {
	return max;
}

}