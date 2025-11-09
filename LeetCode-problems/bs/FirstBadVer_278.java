public class FirstBadVer_278 {

    public static void main(String[] args) {

    }

    static int target(int n){
        
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            }else{
                start = mid + 1;
            }
            
        }
        return start;
    }
}


// Use start <= end when searching for an element (classic binary search).

// Use start < end when searching for a boundary (like first bad version).