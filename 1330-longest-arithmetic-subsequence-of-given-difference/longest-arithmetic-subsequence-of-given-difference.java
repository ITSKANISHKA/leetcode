class Solution
{
public
    int longestSubsequence(int[] arr, int difference)
    {
        int length = arr.length, max_length = 1;
        HashMap<Integer, Integer> Terms_till_now = new HashMap<>();
        for (int i = 0; i < length; i++)
        {
            int terms = ((Terms_till_now.get(arr[i] - difference) == null) ? 0 : Terms_till_now.get(arr[i] - difference));
            Terms_till_now.put(arr[i], 1 + terms);
            max_length = Math.max(max_length, 1 + terms);
        }
        return max_length;
    }
}