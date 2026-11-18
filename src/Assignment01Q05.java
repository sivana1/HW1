public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        // TODO: implement
        int n = m.length;
        if (i == j){
            return 0;
        }
        int[] distances = new int[n];
        for (int k = 0; k < n; k++) {
            distances[k] = -1;
        }
        int[] queue = new int[n];
        int head = 0;
        int tail = 0;
        queue[tail++] = i;
        distances[i] = 0;

        while (head < tail) {
            int current = queue[head++];
            for (int k = 0; k < n; k++) {
                if (m[current][k] == 1 && distances[k] == -1) {
                    distances[k] = distances[current] + 1;
                    queue[tail++] = k;
                    if (k == j) {
                        return distances[k];
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}