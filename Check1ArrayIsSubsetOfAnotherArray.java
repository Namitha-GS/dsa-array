class Compute {
    public String isSubset( long a1[], long a2[], long size1, long size2) {
        if(size2 > size1)
            return "No";
        
        Map<Long, Integer> map = new HashMap<>();
        for(int i=0; i<size1; i++){
            if(map.containsKey(a1[i])){
                map.put(a1[i], map.get(a1[i])+1);
            } else {
                map.put(a1[i], 1);
            }
        }
        for(int i=0; i<size2; i++){
            if(map.containsKey(a2[i]) && map.get(a2[i]) > 0){
                map.put(a2[i], map.get(a2[i])-1);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
