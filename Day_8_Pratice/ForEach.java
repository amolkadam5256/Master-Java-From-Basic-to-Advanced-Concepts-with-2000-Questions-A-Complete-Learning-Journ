class ForEach {
    public static void main(String[] args) {
        System.out.println("Hello");

        String[] arr = new String[]{
            "amol", "rahul", "sneha" 
        };


        int[] nums = new int[]{
            2,3,4,5,5,3,232,323
        };

        for (String name : arr) {
            System.out.println(name);
        }

        for(int num :nums){
            System.out.println("num " + num);
        }
    }
}
