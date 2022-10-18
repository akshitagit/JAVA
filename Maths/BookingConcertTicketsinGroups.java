class BookMyShow {
    private int[] seatsLeft;
    private int m, seatStartsFrom;

    public BookMyShow(int n, int m) {
        this.m = m;
        seatStartsFrom = 0;
        seatsLeft = new int[n];
        Arrays.fill(seatsLeft, m);
    }
    
    public int[] gather(int k, int maxRow) {
        for(int row= seatStartsFrom;row<=maxRow;row++){
            if(seatsLeft[row]>=k){
                seatsLeft[row] -= k;
                return new int[]{row, m- seatsLeft[row]-k};
            }
        }
        return new int[]{};
        
    }
    
    public boolean scatter(int k, int maxRow) {
        int start = seatStartsFrom;
        while(start<=maxRow && k > seatsLeft[start])
            k = k - seatsLeft[start++];
        if(start>maxRow && k>0) return false;
        
        seatsLeft[start] -= k;
        seatStartsFrom = start;
        return true;
    }
}
