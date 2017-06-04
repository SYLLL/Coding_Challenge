public Node merge(Node first, Node second) {
	if(first == null) {
		return second;
	}

	if(second == null) {
		return first;
	}

	Node prev = null;
	Node head = null;
	while (!(first == null && second == null)) {
		if (second == null || first < second) {
			if(prev == null) {
				head = first;
				prev = first;
				continue;
			}
			//which is smaller, prev points to which
			prev.next = first;
			prev = first;
			first = first.next;
		} else if (first == null || second < first){
			if(prev == null) {
				head = second;
				prev = second;
				continue;
			}
			prev.next = second;
			prev = second;
			second = second.next;
		}
	}
	return head;
}