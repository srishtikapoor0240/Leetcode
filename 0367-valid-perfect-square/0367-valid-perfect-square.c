/*bool isPerfectSquare(int num) {
    if (num==1)
        return true;
    for(long i=2;i<=num/2;i++){
        if (i*i==num)
            return true;
    }
    return false;
}*/
bool isPerfectSquare(int num){
    int l=0;int h=num;
    while(l<=h){
        long mid=l+(h-l)/2;
        if(mid*mid==num){
            return true;
        }
        else if(mid*mid>num)
            h=mid-1;
        else if(mid*mid<num)
            l=mid+1;
    }
    return false;
}