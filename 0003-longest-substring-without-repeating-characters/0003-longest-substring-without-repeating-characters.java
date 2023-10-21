class Solution {
   public int lengthOfLongestSubstring(String s) {
    int length = 0;
    Map<Character, Integer> map = new HashMap<>();
    int start = 0; // Use 'start' to keep track of the start of the current substring.

    for (int i = 0; i < s.length(); i++) { // Loop through the string.
        char currentChar = s.charAt(i);

        if (map.containsKey(currentChar)) {
            // If the current character is already in the map, update the start position.
            start = Math.max(start, map.get(currentChar) + 1);
        }

        // Update the character's index in the map.
        map.put(currentChar, i);

        // Calculate the length of the current substring and update 'length'.
        length = Math.max(length, i - start + 1);
    }

    return length;
}

}