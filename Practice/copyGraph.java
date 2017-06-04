//HashMap
public calss copyGraph(Node root) {
	if (root == null) {
		return null;
	}

	HashMap<Node, Node> hmap = new HashMap<Node, Node>();
}

public Node copy(Node root) {

	if (hmap.containsKey(root)) {
		return hmap.get(root);
	}

	Node newnode = new Node(root.value);
	for (Node n : root.neighbours) {
		Node newneighbour = copy(n);
		newnode.neighbours.add(newneighbour);
	}
	hmap.put(root, newnode);

	return newnode;

}