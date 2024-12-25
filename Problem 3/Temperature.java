package Problem3;

public class Temperature {

	public double value;
	public char temp;
	
    //default constructor
    public Temperature() {
		value=0;
		temp='C';}
     
    //constructors for each fields
	public Temperature(double value){
		this.value=value;
		temp='C';
		}
	public Temperature(char temp) {
		this.temp=temp;
		value=0;
	}
	
	//constructor with both parameters
	public Temperature(double value,char temp) {
		this.temp=temp;
		this.value=value;
	}
	

    //method to return the degrees in Celsius
	public double getCelcius(double value,char temp) {
		if(temp=='F') {
			return 5*(value-32)/9;
		}
		
		else return value;
	}
	//method to return the degrees in Farenheit
	public double getFarenheit(double value,char temp) {
		if(temp=='C') {
		     return 9*(value/5)+32;
		}
		
		else return value;
	}
	//methods with set
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setScale(char temp) {
		this.temp=temp;
	}

	public void setValueScale(int value,char temp) {
		this.value=value;
		this.temp=temp;
	}
	//method to return scale
	public char getScale() {
		return temp;
	}
	
	public String toString() {
		return ("Temperature:"+this.value+" "+this.getScale());
	}
	
}
