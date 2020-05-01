// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        long start = 0, end = n;
        int firstbad = -1;
        int mid;
        while(firstbad == -1) {
            mid = (start+end)/2;
            if(isBadVersion(mid)) {
                if(isBadVersion(mid-1)){
                    end=mid-1;
                }
                else{
                    firstbad=mid;
                }
            }
            else{
                start=mid+1;
            }
        }
        return firstbad;
    }
};