public String in_to_string(int input) {
	boolean isnegative = false;
	if (input < 0) {
		input = -input;
		isnegative = true;
	}
        
    if (input < 10) {
        if (isnegative) {
        	return "-" + (String) input;
        }
        return (char) input;
    }
        	
    StringBuilder sb = new StringBuilder();
    while (input > 0) {
        int digit = input % 10;
        input = input / 10;
        sb.append((char) digit);
    }
		
	if (isnegative) {
        sb.append('-');
    }
    return sb.reverse();
        
}

public int string_to_int(String input) {
	//assuming the input is legit
	if (input == null) {
		return 0;
	}

	boolean isnegative = false;
	if(input.charAt(0) == '-') {
		isnegative = true;
		input = input.substring(1);
	}

	int result = 0;
	for (int i = 0; i < input.length; i++) {
		result = result * 10 + (input.charAt(i) - '0');
	}

	if (isnegative) {
		return -result;
	}

	return result;

}