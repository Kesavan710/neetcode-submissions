class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int end=people.length-1;
        int start=0;
        int total=0;
        Arrays.sort(people);
        while(start<=end)
        {            
            if(people[end]+people[start]>limit)
            {
                end-=1;
                total++;
            }
            else
            {
                total++;
                end-=1;
                start+=1;
            }
                

            
        }
        return total;
    }
}