public class DogPetShopFactory implements PetShopFactory {

    @Override
    public Pet createPet() {
        return new Dog();
    }

    @Override
    public Food createFood() {
        return new DogFood();
    }

}
