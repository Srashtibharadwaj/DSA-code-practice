class bubble_sort {
    public int[] bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums; 
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubble_sort bs = new bubble_sort();
        bs.bubbleSort(arr);
        System.out.println("Sorted Array:"); 
        for (int num : arr) {
            System.out.print(num + " ");
        }
    

    }
}