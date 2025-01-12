class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int src = 0;
        int[] visit = new int[rooms.size()];
        
        DFS(rooms,src,visit);

        for(int i=0;i<rooms.size();i++){
            if (visit[i]==0){
                return false;
            }
        }
        return true;
    }

    void DFS(List<List<Integer>> rooms, int src, int[] visit){
        Stack<Integer> st = new Stack<>();
        st.push(src);

        while(!st.isEmpty()){
            int curr = st.pop();
            if(visit[curr]==0){
                visit[curr]= 1;
                for(int num : rooms.get(curr)){
                    if(visit[num]==0){
                        st.push(num);
                    }
                }
            }
        }
    }
}