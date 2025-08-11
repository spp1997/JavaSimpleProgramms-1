In Java, there are several methods to convert a char array to a String.
Using the String constructor: This is the most straightforward and commonly recommended approach.

    char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    String str = new String(charArray);
    System.out.println(str); // Output: Hello


    Using String.valueOf(): This static method of the String class is also efficient and widely used.
        char[] charArray = {'J', 'a', 'v', 'a'};
    String str = String.valueOf(charArray);
    System.out.println(str); // Output: Java

    Using StringBuilder: This method is useful when you need to build a string from a character array iteratively, or if you are concerned about performance in scenarios involving frequent string modifications.

        char[] charArray = {'W', 'o', 'r', 'l', 'd'};
    StringBuilder sb = new StringBuilder();
    for (char c : charArray) {
        sb.append(c);
    }
    String str = sb.toString();
    System.out.println(str); // Output: World