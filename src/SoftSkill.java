public class SoftSkill extends Skill
{
    //Method to initialize the name, type, and skill level of soft skills
    public SoftSkill(String name, String type, int skillLevel)
    {
        super(name, type, skillLevel);
    }
    
    @Override
    public void identifySkill()
    {
        System.out.println(name + " Skill of " + type + " has a skill level of " + skillLevel + ".");
    }
}
