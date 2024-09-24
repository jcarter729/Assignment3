abstract class Skill
{
    protected String name;
    protected String type;
    protected int skillLevel;

    //Method to set name, type, and skill level
    public Skill(String n, String t, int sL)
    {
        name = n;
        type = t;
        skillLevel = sL;
    }

    //Getter Methods
    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public int getSkillLevel()
    {
        return skillLevel;
    }

    //Abstract Method that is both overriden by the extended classes, and can identify name, type, and skill level
    public abstract void identifySkill();
}