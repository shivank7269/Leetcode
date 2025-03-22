class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
    
        Set<Integer> visitedNodes = new HashSet<>();

        Map<Integer, List<Integer>> adjList = new HashMap<>();

        for(int[] edge: edges) {
            int node_1 = edge[0], node_2 = edge[1];
            List<Integer> list_1 = adjList.getOrDefault(node_1, new ArrayList<Integer>());
            List<Integer> list_2 = adjList.getOrDefault(node_2, new ArrayList<Integer>());
            list_1.add(node_2);
            list_2.add(node_1);
            adjList.put(node_1, list_1);
            adjList.put(node_2, list_2);
        }

        int count = 0;
        
        for(int i = 0;i < n;i++) {
            
            if(!visitedNodes.contains(i)) {
                
                Set<Integer> currentComponent = new HashSet<>();
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);

                // Breadth first search
                while(!queue.isEmpty()) {
                    int size = queue.size();
                    for(int j = 0;j < size;j++) {
                        int poppedNode = queue.poll();
                        currentComponent.add(poppedNode);
                        List<Integer> neighbours = adjList.getOrDefault(poppedNode, new ArrayList<Integer>());
                        for(Integer neighbour: neighbours) {
                            
                            // Push the neighbours in the queue, if it is not visited yet.
                            if(!visitedNodes.contains(neighbour)) {
                                visitedNodes.add(neighbour);
                                queue.offer(neighbour);
                            }
                        }
                    }
                }

                // Check all the nodes has enough incoming frequencies
                int requiredNeighbours = currentComponent.size() - 1;

                boolean isCompleteComponent = true;
                for(Integer vertex: currentComponent) {
                    List<Integer> adjNodes = adjList.getOrDefault(vertex, new ArrayList<Integer>());
                    if(adjNodes.size() < requiredNeighbours) {
                        isCompleteComponent = false;
                        break;
                    }
                }
                if(isCompleteComponent) {
                    count++;
                }
            }
        }

        return count;
    }
}