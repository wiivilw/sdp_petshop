# Pet Shop - Factory Method & Abstract Factory

## Project Description

This project is a simple Pet Shop system made in Java.

It uses two design patterns:
 
- Factory Method
- Abstract Factory

The system can create dogs and cats and their food.

## Part A - Factory Method

Factory Method is used to create different pets.

Classes:

- `Pet` - common interface
- `Dog` and `Cat` - pets
- `PetFactory` - factory interface
- `DogFactory` and `CatFactory` - create dogs and cats 

## Part B - Abstract Factory

Abstract Factory is used to create related products.

There are two product families:

- Dog + DogFood
- Cat + CatFood

Classes:

- `PetShopFactory` - factory interface
- `DogPetShopFactory` - creates Dog and DogFood
- `CatPetShopFactory` - creates Cat and CatFood
- `PetShop` - uses the factory to create products

## Output 

```text
Dog says Woof
Dog eats beef
Cat says Meow
Cat eats fish
```

## Clean Code

### 1. Meaningful Names

I use clear names for classes and methods.

```java
DogFactory
CatFactory
DogFood
createPet()
createFood()
```

The names show what the classes and methods do.

### 2. Single Responsibility

Each class has one main task.

For example, `DogFactory` creates a Dog.

```java 
public Pet createPet() {
    return new Dog();
}
```

## 3. Abstraction

The code uses interfaces such as `Pet`, `Food`, and `PetShopFactory`.

```java
Pet pet = factory.createPet();
Food food = factory.createFood();
```

This allows the code to work with different products.

### 4. Small Methods

The methods are short and do one task.

```java
public Pet createPet() {
    return new Dog();
}
```

The methods only create and returns a Dog.

### 5. Simple Code

I tried to keep the code simple and avoid unnecessary logic.

For example:

```java 
public void makeSound() {
    System.out.println("Dog says woof!");
}
```

The method only does what is needed.


