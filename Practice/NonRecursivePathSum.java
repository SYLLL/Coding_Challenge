Stack<Node> stack = new Stack<Node>();
List<Integer> res = new LinkedList<Integer>();

int sum = 0;
while(temp != null) {
	stack.push(temp);
	sum += temp.value;
	temp = temp.left;
}

res.add(sum);

while (!stack.isEmpty()) {
	temp = stack.pop();
	sum -= temp.value;
	temp = temp.right;
	while (temp != null) {
		stack.push(temp);
		sum += temp.value;
		temp = temp.left;
	}
	res.add(sum);
}