class 	Powxn {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long n1 = n;
        if(n1<0) {
            n1=-1*n1;
        }
        while(n1>0) {
            if(n1%2==0){
                n1=n1/2;
                x=x*x;
            }
            else {
                n1=n1-1;
                ans =ans * x;
            }
        }
        if(n<0) {
            ans = (double)(1.0)/(double)(ans);
        }
        return ans;
    }
}
