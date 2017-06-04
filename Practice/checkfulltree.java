public boolean checkperfect(TreeNode root) {
	if (root == null) {
		return true;
	}

	Queue<TreeNode> q = new Queue<TreeNode>();

	q.offer(root);

	//check elements level by level
	int counter = 1;
	while (!q.isEmpty()) {
		counter *= 2;
		int size = q.size();
		while (size > 0) {
			TreeNode tempnode = q.poll();
			if (tempnode.left == null) {
				return false;
			}
			q.offer(tempnode.left);
			if (tempnode.right == null) {
				return false;
			}
			q.offer(tempnode.right);
			size--;
		}
		if (q.size() != counter) {
			return false;
		}
	}
	return true;
}

public boolean checkfull(TreeNode root) {
	if (root == null) {
		return true;
	}

	if (root.left == null && root.right == null) {
		return true;
	}

	if (root.legt == null || root.right == null) {
		return false;
	}

	return (checkfull(root.left) && checkfull(root.right));
}