// converting 2d array to graph
    private List<List<Integer>> buildGraph(int n, int[][] arr) {
        List<List<Integer> >graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] a : arr) {
            graph.get(a[1]).add(a[0]);
        }

        return graph;
    }