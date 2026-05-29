class Solution {
    public boolean canFinish(int Courses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < Courses; i++) adj.add(new ArrayList<>());

        for (int[] pre : prerequisites)
            adj.get(pre[1]).add(pre[0]);

        boolean[] vis = new boolean[Courses];
        boolean[] path = new boolean[Courses];

        for (int i = 0; i < Courses; i++)
            if (!vis[i] && dfs(i, adj, vis, path)) return false;

        return true;
    }
    private boolean dfs(int node, List<List<Integer>> adj, boolean[] vis, boolean[] path) {
        vis[node] = path[node] = true;

        for (int next : adj.get(node))
            if (!vis[next] && dfs(next, adj, vis, path)) return true;
            else if (path[next]) return true;
            
        path[node] = false;
        return false;
    }
}