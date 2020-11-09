class OddNumbers{
	public static int[] odd(int a[]){
	int oddNumber[]=new int[a.length];
	int j=0;
	for(int i=0;i<10;i++){
	if(a[i]%2==1){
	oddNumber[j]=a[i];
	j++;
	}
	}
	return oddNumber;
	}
	public static void main(String args[]){
	int a[]={2,7,89,6,56,45,43,24,68,89};
	int b[]=odd(a);
	for(int i=0;i<b.length;i++){
	if(b[i]==0)
	break;
	System.out.println("number is"+b[i]);
}	
}
}	