public class SoftSkill extends Skill
{
    //Method to initialize the name, type, and skill level of soft skills
    public SoftSkill(String name, String type, int skillLevel)
    {
        super(name, type, skillLevel);
    }
    
    //Override abstract method in Skill to print out the identifiers of the soft skill to the terminal
    @Override
    public void identifySkill()
    {
        System.out.println(name + " Skill of " + type + " has a skill level of " + skillLevel + ".");
    }
}
