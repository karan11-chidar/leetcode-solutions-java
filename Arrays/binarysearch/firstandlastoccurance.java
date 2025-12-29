public class firstandlastoccurance {
    void main() {
        firstandlastoccurance obj = new firstandlastoccurance();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = obj.searchRange(nums, target);
        System.out.println("First and Last Occurrence: [" + result[0] + ", " + result[1] + "]");
    }
}
