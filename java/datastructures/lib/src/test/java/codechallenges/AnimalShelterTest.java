package codechallenges;

import codechallenges.AnimalShelter.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalShelterTest {
  private AnimalShelter sut;

  @BeforeEach
  public void setUp() {
    sut = new AnimalShelter();
    Animal willow = sut.new Animal(Species.DOG, "Willow");
    Animal albert = sut.new Animal(Species.DOG, "Albert");
    Animal figgy = sut.new Animal(Species.CAT, "Figgy");
    Animal meowMeow = sut.new Animal(Species.CAT, "Meow Meow");

    sut.enqueue(meowMeow);
    sut.enqueue(figgy);
    sut.enqueue(albert);
    sut.enqueue(willow);
  }

  @Test
  public void dequeueWithPreference() {
    assertEquals("Albert", sut.dequeue(Species.DOG));
    assertEquals("Meow Meow", sut.dequeue(Species.CAT));
  }

  @Test
  public void dequeueWithoutPreference() {
    assertEquals("Meow Meow", sut.dequeue(Species.NONE));
  }

  @Test
  public void dequeueWithPreferenceWithoutAvailablility() {
    AnimalShelter sut = new AnimalShelter();
    Animal figgy = sut.new Animal(Species.CAT, "Figgy");
    Animal meowMeow = sut.new Animal(Species.CAT, "Meow Meow");
    sut.enqueue(meowMeow);
    sut.enqueue(figgy);

    assertNull(sut.dequeue(Species.DOG));
  }

  @Test
  public void dequeueOnEmptyQueueReturnsNull() {
    AnimalShelter emptySut = new AnimalShelter();
    assertNull(emptySut.dequeue(Species.DOG));
  }
}
