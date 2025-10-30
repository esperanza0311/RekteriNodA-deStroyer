public class main {
    public static void main(String[] args) {
        studentList list=new studentList();
        list.addstudent(230444005,"ilker tarık","arı ");
        list.addstudent(240444007,"fatma bengisu","oğuz ");
        list.addstudent(230444042,"ilaydanur","benli ");
        list.addstudent(230444051,"burçin betül","motur ");
        list.addstudent(230444082,"tuğba","amansız ");
        list.addstudent(230444007,"ali ihsan","çelik ");
        list.addstudent(230444061,"begm buse","çakır ");
        list.addstudent(240444083,"çağla nehir","genç ");
        list.showlist();
        list.currstudent();
        list.removestudent(230444082);
        list.removestudent(240444083);
        list.nextstudent();
        list.prevstudent();
        list.showlist();


    }
}
