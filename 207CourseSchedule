public class Solution {
    
    private Set<Integer> visited = new HashSet<Integer>();
    private Map<Integer, ArrayList<Integer>> neighbors = new HashMap<Integer, ArrayList<Integer>>();
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        for (int i = 0; i < prerequisites.length; i++) {
            if (!neighbors.containsKey(prerequisites[i][0])) {
                neighbors.put(prerequisites[i][0], new ArrayList<Integer>());
            }
            neighbors.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for (int j = 0; j < numCourses; j++) {
            if (neighbors.containsKey(j)) {
                if (dfs(j) == false) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean dfs(Integer x) {
        if (visited.contains(x)) {
            return false;
        }
        boolean ret = true;
        visited.add(x);
        if (neighbors.containsKey(x)) {
            for (Integer nei : neighbors.get(x)) {
                ret = ret & dfs(nei);
            }
        }
        visited.remove(x);
        return ret;
    }
}