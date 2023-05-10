int checkForDisjointArrays(int size1, int arr1[], int size2, int arr2[])
{
    java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
    for(int i=0; i<size1; i++){
        if(map.containsKey(arr1[i])){
            map.put(arr1[i], map.get(arr1[i])+1);
        } else {
            map.put(arr1[i], 1);
        }
    }
    for(int i=0; i<size2; i++){
        if(map.containsKey(arr2[i])){
            return 0;
        }
    }
    return 1;
}
