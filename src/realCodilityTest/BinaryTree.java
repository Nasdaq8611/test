package realCodilityTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Tree 
{
    public int x;
    public Tree l, r;
  
}
  
class BinaryTree 
{
	Tree root;
	List<Integer> distinctValues = new ArrayList<>();
      
    int countMaxDistincValue(Tree T) 
    {
        int path[] = new int[1000];
        calcPathsRecur(T, path, 0);
        int maxDistinctValue = 0;
        for (int i = 0; i < distinctValues.size(); i++) {
			
        	int j = distinctValues.get(i);
        	if(j>maxDistinctValue){
        		maxDistinctValue=j;
        	}
			
		}
        return maxDistinctValue;
    }
  
    void calcPathsRecur(Tree node, int path[], int pathLen) 
    {
        if (node == null)
            return;
  

        path[pathLen] = node.x;
        pathLen++;
  

        if (node.l == null && node.r == null)
            distinctValues(path, pathLen);
        else
        {
            
            calcPathsRecur(node.l, path, pathLen);
            calcPathsRecur(node.r, path, pathLen);
        }
    }
  

    void distinctValues(int ints[], int len) 
    {
        int i;
        Set<Integer> uniqueNumbers = new HashSet<Integer>();
        for (i = 0; i < len; i++) 
        {
            uniqueNumbers.add(ints[i]);
        }
        distinctValues.add(uniqueNumbers.size());
    }
    
  

    public static void main(String args[]) 
    {
        BinaryTree tree = new BinaryTree();
        
        tree.root = new Tree();
        tree.root.x = 10;
        
        
        tree.root.l = new Tree();
        tree.root.l.x = 8; 
        
        tree.root.r = new Tree();
        tree.root.r.x =2;
        
        tree.root.l.l = new Tree();
        tree.root.l.l.x = 3;
        
        tree.root.l.r = new Tree();
        tree.root.l.r.x = 5;
        
        tree.root.r.l = new Tree();
        tree.root.r.l.x = 2;
         
        
        tree.countMaxDistincValue(tree.root);
    }
    

    
}
