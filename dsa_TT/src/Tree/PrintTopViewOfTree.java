package Tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class PrintTopViewOfTree {
	public static void topView(BinaryTreeNode<Integer> root, int distance, TreeMap<Integer,ArrayList<Integer>> map ){
        // Termination Case
        if(root == null){
            return ;
        }
        if(map.get(distance)==null){ // No Distance Exist
            // Create Fresh ArrayList
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(distance,list);
        }
     
        topView(root.left, distance -1 , map);
        topView(root.right, distance +1 , map);
    }
	
	static void printTopView(BinaryTreeNode<Integer> root) {
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		topView(root, 0, map);
		for(Map.Entry<K, V>)
	}
	
	public static void main(String[] args) {
		
	}
}
