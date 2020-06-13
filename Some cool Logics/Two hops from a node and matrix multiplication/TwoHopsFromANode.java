/* the basic idea is to demonstrate :-
   given an adjascent matrix of graph , 
   find all the nodes from a node after hopping twice from it.
   
   
   given such problem, we can think of solving it by applying graph algorithms but it can be done using matrix multiplication.
   
   Yes, the product obtained my squaring the  given adjascent matrix is the required result.
   
*/
   
	public List<Integer> getDistance2(int v) {
		
		List<Integer> twoHop = new ArrayList<Integer>();
		
		// v is the row index we're checking
		// int i = column indices
		for (int i = 0; i < getNumVertices(); i++) {
			for (int j = 0; j < adjMatrix[v][i]; j++) {
				// Instead of adding i directly, add neighbors of i.
				twoHop.addAll(getNeighbors(i));
			}
		}
		return twoHop;
		
		
	}   
	
	is same as
	
	//in matrix multiplication method we get two-hop-neighbour of each vertices at a time. 
	
	static void multiply(int mat1[][],int mat2[][], int res[][]) 
    	{ 
		int i, j, k; 
		for (i = 0; i < N; i++) 
		{ 
		    for (j = 0; j < N; j++) 
		    { 
		        res[i][j] = 0; 
		        for (k = 0; k < N; k++) 
		            res[i][j] += mat1[i][k]  
		                        * mat2[k][j]; 
		    } 
		} 
        } 
