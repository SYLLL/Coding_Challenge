/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<UndirectedGraphNode, UndirectedGraphNode> mirror = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        if (node == null) {
            return null;
        }
        if (mirror.containsKey(node)) {
            return mirror.get(node);
        } 
        UndirectedGraphNode newnode = new UndirectedGraphNode(node.label);
        if (!mirror.containsKey(node)) {
            mirror.put(node, newnode);
        }
        for (UndirectedGraphNode nei: node.neighbors) {
            UndirectedGraphNode newnei = cloneGraph(nei);
            newnode.neighbors.add(newnei);
        }
        return newnode;
    }
}