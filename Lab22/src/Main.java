class main {
    public static void main(String[] args) {
        DynamicArray<String> da = new DynamicArray<>();

        da.add("X");
        da.add("Y");
        da.add("Z");

        System.out.println(da.remove()); // Returns Z
        System.out.println(da.remove()); // Returns Y
        System.out.println(da.remove()); // Returns X
        System.out.println(da.remove()); // Returns null

        da.add("A");
        System.out.println(da.remove()); // Returns null
        System.out.println(da.remove()); // Returns null



    }
}