package com.greatlearning.treesum;

public class Driver {

	public static void main(String[] args) {
		 Node root = null;
		 
		 FindSumPair findsp = new FindSumPair();
		 root = findsp.insert(root,40);
		 root = findsp.insert(root,20);
		 root = findsp.insert(root,60);
		 root = findsp.insert(root,10);
		 root = findsp.insert(root,30);
		 root = findsp.insert(root,50);
		 root = findsp.insert(root,70);
		 
          int sum = 80;
          findsp.findPairWithGivenSum(root,sum);
	}

}
