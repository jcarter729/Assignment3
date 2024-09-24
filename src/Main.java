public class Main 
{
    public static void main(String[] args)
    {
        //Instances of each child class to the parent class Skill to set name, type, and skill level
        HardSkill hs = new HardSkill("Hard", "Programming", 4);
        SoftSkill ss = new SoftSkill("Soft", "Leadership", 6);
        GiftSkill gs = new GiftSkill("Gift", "Mercy", 5);
        TalentSkill ts = new TalentSkill("Talent", "Organization", 10);

        //Using the instances to call on the identifySkill method in the Children Skill Classes
        hs.identifySkill();
        ss.identifySkill();
        gs.identifySkill();
        ts.identifySkill();
    }
}
