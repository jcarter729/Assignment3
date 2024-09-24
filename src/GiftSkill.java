public class GiftSkill extends Skill 
{
    //Method to initialize the name, type, and skill level of gift skills
    public GiftSkill(String name, String type, int skillLevel)
    {
        super(name, type, skillLevel);
    }
    
    //Override abstract method in Skill to print out the identifiers of the gift skill to the terminal
    @Override
    public void identifySkill()
    {
        System.out.println(name + " Skill of " + type + " has a skill level of " + skillLevel + ".");
    }
}
