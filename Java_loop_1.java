// Problem link: https://www.hackerrank.com/challenges/java-loops-i/problem
/*
Problem Descripttion:

Task: Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format : single integer, .

Constraints : 2<=N<=10

Output Format : Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for(int i=1;i<11;i++){
            System.out.println(N +" x "+ i+" = "+N*i);
        }
        
        
    }
}
