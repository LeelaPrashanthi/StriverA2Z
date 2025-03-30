class PrintAllDivisors{
    public static void main(String[] args){
        int n = 36;

        int res[] = new int[n];
        int a=0,count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                res[a] = i;
                a++;
                count++;
            }
        }

        for(int i=0;i<count;i++){
            System.out.print(res[i]+",");
        }
    }
}