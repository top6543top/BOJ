class Heap {
    int[] heap;
    int size;
    Heap(int l) {
        heap = new int[l + 1];
    }
    void offer(int e) {
        heap[++size] = e;
        int i = size << 1;
        while ((i >>= 1) > 1)
            if (!swap(i)) break;
    }
    int poll() {
        if (size == 0) return 0;
        int e = heap[1];
        heap[1] = heap[size--];
        int i = 1;
        while ((i <<= 1) <= size) {
            if (i < size && heap[i] > heap[i + 1]) i++;
            if (!swap(i)) break;
        }
        return e;
    }
    boolean swap(int i) {
        int j = i >> 1;
        int p = heap[j];
        int c = heap[i];
        if (p < c) return false;
        heap[j] = c;
        heap[i] = p;
        return true;
    }
}