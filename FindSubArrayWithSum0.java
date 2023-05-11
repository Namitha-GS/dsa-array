int checkForSubArrayWithSumZero(int n, int arr[])
{
    java.util.Set<Integer> set = new java.util.HashSet<>();
    int sum = 0;
    for(int i=0; i<n; i++){
        sum += arr[i];
        
        if(sum==0 || arr[i]==0 || set.contains(sum)){
            return 1;
        }
        set.add(sum);
    }
    return 0;
}
