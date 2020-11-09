class Sum{
	public static int sum(int a[]){
	int s=0;
	for(int i=0;i<10;i++){
	s=s+a[i];
	}
	return s;
	}
	public static void main(String args[]){
	int a[]={2,7,89,6,56,45,43,24,68,89};
	System.out.println("sum is"+sum(a));
}	
}	