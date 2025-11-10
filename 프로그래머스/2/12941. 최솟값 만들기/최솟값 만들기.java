import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        
        Arrays.sort(B);
        for (int i = 0; i < B.length / 2; i++) {
            int temp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = temp;
        }

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
}