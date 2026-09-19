public class Main {
    public static void main(String[] args) {
        DogPetShopFactory dogFactory = new DogPetShopFactory();
        PetShop dogShop = new PetShop(dogFactory);

        dogShop.showProducts();

        CatPetShopFactory catFactory = new CatPetShopFactory();
        PetShop catShop = new PetShop(catFactory);

        catShop.showProducts();
    }
}