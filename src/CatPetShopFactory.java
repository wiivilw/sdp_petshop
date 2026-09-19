public class CatPetShopFactory implements PetShopFactory {

    @Override
    public Pet createPet() {
        return new Cat();
    }

    @Override
    public Food createFood() {
        return new CatFood();
    }
}
