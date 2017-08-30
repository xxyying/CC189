package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class L077Combination {
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k < 1) {
            return result;
        }
        ArrayList<Integer> path = new ArrayList<>();
//        HashSet<ArrayList<Integer>> set = new HashSet<>();
        dfs(1, n, k, path, result);
        return result;
    }
    
    private void dfs(int start, int n, int k, ArrayList<Integer> path, List<List<Integer>> result) {
        if(path.size() == k) {
        		result.add(new ArrayList<Integer>(path));
        		return;
        }
        
        for(int i = start; i <= n; i++) {
            path.add(i);
            dfs(i + 1, n, k, path, result);
            path.remove(path.size() - 1);        		
        }
    }
	public static void main(String[] args) {
		L077Combination test = new L077Combination();
		int n = 4;
		int k = 2;
		List<List<Integer>> result = test.combine(n, k);
		for(List<Integer> l : result) {
			System.out.println(l);
		}
	}

}
