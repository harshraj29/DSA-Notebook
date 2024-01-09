import java.util.*;

public class subset {
    public static void findSubset(String str,String ans,int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        //recursion
        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        //No choice
        findSubset(str, ans, i+1);

    }
    public static void main(String[] args) {
        String abc = "Harsh";
        findSubset(abc, "", 0);
    }
}


// FindPermutation
public class FindPermutation {
    public static void findper(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);

            String Newstr = str.substring(0, i)+str.substring(i+1);
            findper(Newstr, ans+curr);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        findper(str, "");

    }
}




// NQueen

public class NQueenProblem {
	final int N = 4;

	void printSolution(int board[][])
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == 1)
					System.out.print("Q ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}

	boolean isSafe(int board[][], int row, int col)
	{
		int i, j;

		for (i = 0; i < col; i++)
			if (board[row][i] == 1)
				return false;

		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (board[i][j] == 1)
				return false;

		for (i = row, j = col; j >= 0 && i < N; i++, j--)
			if (board[i][j] == 1)
				return false;

		return true;
	}

	boolean solveNQUtil(int board[][], int col)
	{

		if (col >= N)
			return true;

		for (int i = 0; i < N; i++) {
			

			if (isSafe(board, i, col)) {
				board[i][col] = 1;
				if (solveNQUtil(board, col + 1) == true)
					return true;
				board[i][col] = 0;
			}
		}
		return false;
	}
	boolean solveNQ()
	{
		int board[][] = { { 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 } };

		if (solveNQUtil(board, 0) == false) {
			System.out.print("Solution does not exist");
			return false;
		}

		printSolution(board);
		return true;
	}
	public static void main(String args[])
	{
		NQueenProblem Queen = new NQueenProblem();
		Queen.solveNQ();
	}
}


//Rat in a maze

public class RatMaze {
	static int N;

	void printSolution(int sol[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + sol[i][j] + " ");
			System.out.println();
		}
	}

	boolean isSafe(int maze[][], int x, int y) {
		return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
	}

	boolean solveMaze(int maze[][]) {
		int sol[][] = new int[N][N];

		if (solveMazeUtil(maze, 0, 0, sol) == false) {
			System.out.print("Solution doesn't exist");
			return false;
		}

		printSolution(sol);
		return true;
	}

	boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
		if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
			sol[x][y] = 1;
			return true;
		}

		if (isSafe(maze, x, y) == true) {
			if (sol[x][y] == 1)
				return false;

			sol[x][y] = 1;

			if (solveMazeUtil(maze, x + 1, y, sol))
				return true;

			if (solveMazeUtil(maze, x, y + 1, sol))
				return true;

			sol[x][y] = 0;
			return false;
		}

		return false;
	}

	public static void main(String args[]) {
		RatMaze rat = new RatMaze();
		int maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 1, 1, 1}};

		N = maze.length;
		rat.solveMaze(maze);
	}
}

//Climbing Stairs
class GFG {
    static int countWays(int n, int dp[]) {
        if (n <= 1)
            return dp[n] = 1;

        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = countWays(n - 1, dp) + countWays(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }
        System.out.println(countWays(n, dp));
    }
}


// Snake & Ladder

import java.util.LinkedList;
import java.util.Queue;

public class SnakesLadder {
	static class qentry {
		int v;
		int dist;
	}

	static int getMinDiceThrows(int move[], int n) {
		int visited[] = new int[n];
		Queue<qentry> q = new LinkedList<>();
		qentry qe = new qentry();
		qe.v = 0;
		qe.dist = 0;
		visited[0] = 1;
		q.add(qe);

		while (!q.isEmpty()) {
			qe = q.remove();
			int v = qe.v;

			if (v == n - 1)
				break;

			for (int j = v + 1; j <= (v + 6) && j < n; ++j) {
				if (visited[j] == 0) {
					qentry a = new qentry();
					a.dist = (qe.dist + 1);
					visited[j] = 1;
					if (move[j] != -1)
						a.v = move[j];
					else
						a.v = j;
					q.add(a);
				}
			}
		}

		return qe.dist;
	}

	public static void main(String[] args) {
		int N = 30;
		int moves[] = new int[N];
		for (int i = 0; i < N; i++)
			moves[i] = -1;

		moves[2] = 21;
		moves[4] = 7;
		moves[10] = 25;
		moves[19] = 28;

		moves[26] = 0;
		moves[20] = 8;
		moves[16] = 3;
		moves[18] = 6;

		System.out.println("Min Dice throws required is " + getMinDiceThrows(moves, N));
	}
}



// Histogram
import java.util.Arrays;

class Main {
    static void printHistogram(int[] arr, int n) {
        int maxEle = Arrays.stream(arr).max().getAsInt();
        for (int i = maxEle; i >= 0; i--) {
            System.out.format("%2d | ");
            
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n + 3; i++) {
            System.out.print("---");
        }

        System.out.println();
        System.out.print("	 ");

        for (int i = 0; i < n; i++) {
            System.out.format("%2d ", arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 9, 12, 4, 5, 2, 8, 5, 3, 1 };
        int n = arr.length;
        printHistogram(arr, n);
    }
}
