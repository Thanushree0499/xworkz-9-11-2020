class Temperature{
	public static double degree(double f){
	double c=(f-32)*5/9;
	return c;
	}
	public static void main(String args[]){
	double f=102.0;
	double temp=Temperature.degree(f);
	System.out.println("temperature is"+temp);
}
}
	