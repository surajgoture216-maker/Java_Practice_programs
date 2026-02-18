public class substring {
    public static void main(String[] args) {
        String input = "abcabcacacc";
        StringBuilder obj = new StringBuilder();
        StringBuilder obj1 = new StringBuilder();

        outerloop:
        for (int i = 0; i < input.length(); i++) {
            obj.setLength(0);  // clear obj for this i
            obj.append(input.charAt(i));

            for (int j = i + 1; j < input.length(); j++) {
                // check if input.charAt(j) is already in obj
                boolean duplicate = false;
                char c = input.charAt(j);
                for (int k = 0; k < obj.length(); k++) {
                    if (obj.charAt(k) == c) {
                        duplicate = true;
                        break;
                    }
                }
                if (duplicate) {
                    // found duplicate, maybe update obj1
                    if (obj.length() > obj1.length()) {
                        obj1.setLength(0);
                        obj1.append(obj);
                    }
                    // go to next i (outer loop)
                    continue outerloop;
                } else {
                    obj.append(c);
                }
            }

            // if inner loops finish without duplicate,
            // maybe update obj1 at end
            if (obj.length() > obj1.length()) {
                obj1.setLength(0);
                obj1.append(obj);
            }
        }

        System.out.println("Longest substring (by your logic): " + obj1.toString());
    }
}


