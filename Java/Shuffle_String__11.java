//QUESTION-->
//You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

//ANSWER-->
class Solution {
    public String restoreString(String s, int[] indices) {
        char Character[]=new char[indices.length];
        for(int i=0;i<indices.length;i++){
        Character[indices[i]]=s.charAt(i);
        }
 return new String(Character);       
    }
}