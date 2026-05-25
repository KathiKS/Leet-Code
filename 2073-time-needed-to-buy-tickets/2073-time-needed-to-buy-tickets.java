class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q1=new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
        {
            q.add(tickets[i]);
            q1.add(i);
        }
        int cnt=0;
        while(!q.isEmpty())
        {
            int a=q.poll();
            int b=q1.poll();
            a--;
            cnt++;
            if(k==b && a==0) return cnt;
             if(a>0)
            {
                q.offer(a);
                q1.offer(b);
            }
        }
        return cnt;
        
    }
}