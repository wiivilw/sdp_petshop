public class CatFactory implements PetFactory {

    @Override
    public Pet createPet() {
        return new Cat();

    }
}
