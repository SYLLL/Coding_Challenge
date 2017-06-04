public boolean checkbalanced(TreeNode root) {
	if (root == null) {
		return true;
	}
	return checkhelper(root).balanced;
}

public Pair checkhelper(TreeNode root) {
	if (root == null) {
		return new Pair(-1, true);
	}

	Pair leftresult = checkhelper(root.left);
	Pair rightresult = checkhelper(root.right);
	if (leftresult.balanced == false || rightresult.balanced == false) {
		return new Pair(0, false);
	}

	if (leftresult.height - rightresult.height > 1 || rightresult.height - leftresult.height > 1) {
		return new Pair(0, false);
	}

	return new Pair(Math.max(leftresult.height, lrightresult.height) + 1, true);
}

public int r_lbyl(TreeNode root, List<List> ll) {

	if (root == null) {
		return 0;
	}

	int leftresult = r_lbyl(root.left, ll);
	int rightresult = r_lbyl(root.right, ll);
	int curlevel = Math.max(leftresult, rightresult) + 1;
	if (ll.size < curlevel) {
		List<TreeNode> l = new LinkedList<TreeNode>();
		ll.addFirst(0, l);
	}

	ll.get(0).add(root);
	return curlevel;

}