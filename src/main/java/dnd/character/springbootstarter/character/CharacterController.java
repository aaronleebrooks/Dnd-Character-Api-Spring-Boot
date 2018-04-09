package dnd.character.springbootstarter.character;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
	
	
	@Autowired
	private CharacterService characterService;
	
	@RequestMapping("/characters")
	public List<Character> getAllCharacters() {
		return characterService.getAllCharacters();
	}
	
	@RequestMapping("/characters/{id}")
	public Character getCharacter(@PathVariable Integer id) {
		return characterService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/characters")
	public void addCharacter(@RequestBody Character character) {
		characterService.addCharacter(character);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/characters/{id}")
	public void updateCharacter(@RequestBody Character character, @PathVariable Integer id) {
		characterService.updateCharacter(id, character);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/characters/{id}")
	public void deleteCharacter(@PathVariable Integer id) {
		characterService.deleteCharacter(id);
	}
}
