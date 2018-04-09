package dnd.character.springbootstarter.character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CharacterService {

	private List<Character> characters = new ArrayList<>(Arrays.asList(
			new Character(0001, "J'son", "Half-Orc", "Bard", 1, 10, 13, 12, 14, 8, 15),
			new Character(0002, "Gormli", "Human", "Wizard", 1, 8, 10, 12, 14, 15, 13),
			new Character(0003, "Barron", "Dwarf", "Ranger", 1, 12, 13, 15, 14, 8, 10),
			new Character(0004, "Gallabrus", "High Elf", "Barbarian", 1, 15, 14, 13, 12, 8, 10),
			new Character(0005, "Lork", "Halfling", "Cleric", 1, 8, 12, 10, 14, 15, 13)
			));
	
	public List<Character> getAllCharacters() {
		return characters;
	}
	
	public Character getTopic(Integer id) {
		return characters.stream().filter(c -> c.getId().equals(id)).findFirst().get();
	}

	public void addCharacter(Character character) {
		characters.add(character);
	}

	public void updateCharacter(Integer id, Character character) {
		for (int i = 0; i < characters.size(); i++) {
			Character c = characters.get(i);
			if(c.getId().equals(id)) {
				characters.set(i, character);
				return;
			}
		}
		
	}

	public void deleteCharacter(Integer id) {
		characters.removeIf(c -> c.getId().equals(id));
		
	}
}
