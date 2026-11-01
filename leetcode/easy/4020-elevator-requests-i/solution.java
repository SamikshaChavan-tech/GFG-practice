class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum=requests[0];
        for(int i=1;i<requests.length;i++){
            if(requests[i]<requests[i-1]){
                sum+=requests[i-1]-requests[i];
            }
            else if(requests[i-1]<requests[i]){
                sum+=requests[i]-requests[i-1];
            }
        }
        return sum;
    }
}