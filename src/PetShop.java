public class PetShop {

    private PetShopFactory factory;

    public PetShop(PetShopFactory factory) {
        this.factory = factory;
    }

    public void showProducts() {
        Pet pet = factory.createPet();
        Food food = factory.createFood();

        pet.makeSound();
        food.eat();
    }
}
