public Node reverse(Node head, int start, int end) {
	//reversing portions of the list inclusive

	if (head == null) {
		return null;
	}

	if (start >= end || start < 1) {
		return null;
	}

	Node dummyhead = new Node<>();
	dummyhead.next = head;

	Node temp1 = dummyhead;
	Node temp2 = dummyhead;

	for (int i = 0; i < start; i++) {
		if (temp1 == null) {
			return null;
		}
		temp1 = temp1.next;
	}

	for (int j = 0; i <= end; j++) {
		if (temp2 == null) {
			return null;
		}
		//prev pointer
		temp2 = temp2.next;
	}

	Node after_end = temp2;

	//start reversing
	while (temp1 != after_end) {
		Node thenext = temp1.next;
		temp1.next = temp2;
		temp1 = thenext;
	}

	for (int i = 0; i < start-1; i++) {
		temp3 = temp3.next;
	}

	temp3.next = temp2;
}