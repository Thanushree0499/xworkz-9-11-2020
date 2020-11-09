class EvenNumbers{
	public static int[] even(int a[]){
	int evenNumber[]=new int[a.length];
	int j=0;
	for(int i=0;i<10;i++){
	if(a[i]%2==0){
	evenNumber[j]=a[i];
	j++;
	}
	}
	return evenNumber;
	}
	public static void main(String args[]){
	int a[]={2,7,89,6,56,45,43,24,68,89};
	int b[]=even(a);
	for(int i=0;i<b.length;i++){
	if(b[i]==0)
	break;
	System.out.println("number is"+b[i]);
}	
}
}	