package Heap;

import java.util.PriorityQueue;

public class NthNumber {   //calculating factors and adding them in priority queue then finding nth
	public static int nthNumber(int count) {
		if(count <= 6) {
			return count;
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		minHeap.add(1);
		for(int i=1; i<count; i++) {
			int current = minHeap.poll();
			while(!minHeap.isEmpty() && minHeap.peek() == current) {
				current = minHeap.poll();
			}
			minHeap.add(current*2);
			minHeap.add(current*3);
			minHeap.add(current*5);
		}
		return minHeap.poll();
	}
	
	public static void main(String[] args) {
		int n = 10;
		int ans = nthNumber(n);
		System.out.println(ans);
	}
}
