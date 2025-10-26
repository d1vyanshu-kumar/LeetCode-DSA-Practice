public class FindMountainArr1095 {

    public static void main(String[] args) {
        // this question is all about finding the minimum index of target and it is
        // given that arr is in mountain like structure of element.

        int[] arr = { 0,1,2,4,2,1 };
        int target = 3;

        System.out.println(findFirstIndex(arr, target, true));
    }

    // now i guess i don't have to write the thing we know the bs, in a way such
    // that we apply bs in two area respectively the first one is the before the
    // peak element and after the peak element.
    // so we need to find the peak element first.

    // from here we are going to get the peak element and we are going to use this.
    static int findPeakElement(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) { // not use <= for "obi"
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        int peak = start;

        return peak;

    }

    // now we need check the right and left side of the arr with respect to the
    // target element.

    static int findFirstIndex(int[] arr, int target, boolean inLeft) {

        int finalAns = -1;

        int peak = findPeakElement(arr);

        if (inLeft) {
            int start = 0;
            int leftEnd = peak;

            while (start <= leftEnd) {
                int leftMid = start + (leftEnd - start) / 2;
                if (arr[leftMid] > target) {
                    leftEnd = leftMid - 1;
                } else if (arr[leftMid] < target) {
                    start = leftMid + 1;
                } else {
                    // finalAns = leftMid;
                    // leftEnd = leftMid - 1;

                    return leftMid;
                }
            }
            return finalAns;
        } else if (finalAns == -1) {
            int rightStart = peak + 1;
            int rightEnd = arr.length - 1;

            while (rightStart <= rightEnd) {

                int rightMid = rightStart + (rightEnd - rightStart) / 2;

                if (arr[rightMid] > target) {
                    rightStart = rightMid + 1;
                } else if (arr[rightMid] < target) {
                    rightEnd = rightMid - 1;
                } else {
                   return rightMid;
                }
            }
        }

        return finalAns;

    }
}


/*
 * 
---

### 🔎 What happens in *normal* binary search
- You check `mid`.
- If `arr[mid] == target`, you can **return immediately**.  
- No boundary updates are needed, because you’re done.

That’s why in the “classic” binary search template, the equality branch is just `return mid;`.

---

### 🔎 What happened in your code
In your version, you didn’t `return` when you found the target. Instead you did:
```java
else {
    finalAns = leftMid;
}
```
and then let the loop continue.  
- Since you didn’t move `start` or `end`, the loop condition never changes.  
- That’s why you got stuck in an infinite loop.  

So the problem isn’t that you *must* update boundaries — it’s that you either:
1. **Return immediately** when you find the target (like normal BS), or  
2. **Update boundaries** if you want to keep looping to find the *first* or *last* occurrence.  

---

### 🔑 Why I suggested updating boundaries
Because your method is called `findFirstIndex`, I assumed you wanted the **minimum index** of the target. In that case, you can’t just return on the first match — you need to keep searching left, which requires updating `end = mid - 1`.  

If instead you only care about “does the target exist, and where?”, then you can absolutely just `return mid;` in the equality branch and skip the boundary update.

---

✅ So the answer to your “why” is:  
- **If you want any occurrence** → return immediately, no boundary updates.  
- **If you want the first occurrence** → don’t return immediately, but then you must update boundaries to avoid infinite loop.  

---

Do you want me to show you both versions side by side — one that returns immediately (like “normal” BS) and one that finds the *first index* — so you can clearly see the difference?
 */