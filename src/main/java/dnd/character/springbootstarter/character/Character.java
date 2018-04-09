package dnd.character.springbootstarter.character;

public class Character {
	
	private Integer id;
	private String name;
	private String race;
	private String characterClass;
	private Integer level;
	private Integer strength;
	private Integer constitution;
	private Integer dexterity;
	private Integer intelligence;
	private Integer wisdom;
	private Integer charisma;
	
	public Character() {

	}
	
	public Character(Integer id, String name, String race, String characterClass, Integer level, Integer strength, Integer constitution,
			Integer dexterity, Integer intelligence, Integer wisdom, Integer charisma) {
		super();
		this.id = id;
		this.name = name;
		this.race = race;
		this.characterClass = characterClass;
		this.level = level;
		this.strength = strength;
		this.constitution = constitution;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getCharacterClass() {
		return characterClass;
	}
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getConstitution() {
		return constitution;
	}
	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}
	public Integer getDexterity() {
		return dexterity;
	}
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	public Integer getWisdom() {
		return wisdom;
	}
	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}
	public Integer getCharisma() {
		return charisma;
	}
	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
	}
	
	
}
