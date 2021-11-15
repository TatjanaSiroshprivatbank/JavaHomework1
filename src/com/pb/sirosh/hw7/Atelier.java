package com.pb.sirosh.hw7;

public class Atelier {

    public static class Main {
        public static void main(String[] args) {
            Tshirt tshirt = new Tshirt();
            Pants pants = new Pants();
            Skirt skirt = new Skirt();
            Tie tie = new Tie();

            Clothes[] clothes = new Clothes[]{tshirt, pants, skirt, tie};
            dressMan(clothes);
            dressWomen(clothes);
        }


        public static void dressMan(Clothes[] clothes) {
            for (Clothes clothe : clothes) {
                if (clothe instanceof ManClothes) {
                    System.out.println(clothe + " this is a clother for man");
                  }
            }
        }
        public static void dressWomen(Clothes[] clothes) {
            for (Clothes clothe : clothes) {
                if (clothe instanceof WomenClothes) {
                     System.out.println(clothe + " this is a clother for woman");
                }
            }
        }
    }
}
