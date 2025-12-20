class StaticInitialization {
    public static void main(String[] args) {

        // Static Declaration & Initialization (without new keyword)
        int[] numbers1 = {2, 5, 7, 8};
        String[] names1 = {"anu", "sushmi", "pinky"};

        // Traversal
        System.out.println("Static Initialization:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

        for (int i = 0; i < names1.length; i++) {
            System.out.println(names1[i]);
        }
        // Using new keyword (Static initialization)
        int[] numbers2 = new int[]{2, 5, 7, 8};
        String[] names2 = new String[]{"anu", "sushmi", "pinky"};

        System.out.println("\nUsing new keyword:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }
        // Dynamic allocation
        int[] darr = new int[10]; // memory allocation

        System.out.println(names2.length);
        darr[0] = 1;  // assigning values
        darr[9] = 8;
         System.out.println(names2.length);

        System.out.println("\nDynamic Allocation:");
        for (int i = 0; i < darr.length; i++) {
            System.out.println(darr[i]);
        }
    }
}
