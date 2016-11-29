package Pokemon;

public class Pokemon {
	private  int level,hp;
	private  String name = "Sceptile";
	private  boolean poisoned = true;


public void main(String[]args){
	Pokemon squirtle = new Pokemon("Squirtle",26);
	 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
	 squirtle.iChooseYou();
	 bulbasaur.iChooseYou();
}

public  Pokemon(String name, int level){
	hp = 100;
	this.name = name;
	this.level = level;
	this.poisoned = false;
}
public void attack(Pokemon target, Attack attack){
	if(Math.random()<.9){
		attack.attack(target);
		System.out.println("The attack hit");
	}
	else{
		System.out.println("The attack missed");
	}
}
public void iChooseYou(){
	System.out.println(name+ ", "+ name+ "!");
}

public int getHp(){
	return hp;
	
}
public String getName(){
	return name;
	
}
public void setHp(int newHp){
	hp = newHp;
}
public void setPoisoned(boolean b){
	poisoned = b;
}
public void lapse(){
	if(poisoned)hp-=15;
}



}