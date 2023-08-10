//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
        Stack<String>st=new Stack<>();
        String temp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.'){
                temp+=s.charAt(i);
            }
            else
            {
                st.push(temp);
                st.push(".");
                temp="";
            }
        }
        st.push(temp);
        String res="";
        while(!st.empty()){
            res+=st.peek();
            st.pop();
        }
        return res;
        
    }
}
