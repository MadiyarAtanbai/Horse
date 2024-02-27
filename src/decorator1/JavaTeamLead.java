package decorator1;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String SeetWeek(){
        return " Дает еженедельный отчет. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + SeetWeek();
    }
}
