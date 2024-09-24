public class HardSkill extends Skill
{
    //Method to initialize the name, type, and skill level of hard skills
    public HardSkill(String name, String type, int skillLevel)
    {
        super(name, type, skillLevel);
    }

    //Override abstract method in Skill to print out the identifiers of the hard skill to the terminal
    @Override
    public void identifySkill()
    {
        System.out.println(name + " Skill of " + type + " has a skill level of " + skillLevel + ".");
    }
}
