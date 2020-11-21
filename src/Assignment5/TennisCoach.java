package Assignment5;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//user defined explicit bean id(@Component("TMan")) can be used to call the bean.
//or default bean id(@Component) can be used to call the bean. This bean id is the name of the class(tennisCoach) 
//but with the first character as a lower case

//@Component("TMan")
@Component
public class TennisCoach implements Coach{
    private FortuneService fortuneService;
    
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;
    
    //constructor injection
    public TennisCoach(){
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
    
    //setter injection method
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "practice your tennis shots.!";
    }

    @Override
    public String getDailyFortune() {
        return getFortuneService().getFortune();
    }

}
