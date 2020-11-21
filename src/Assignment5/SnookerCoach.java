package Assignment5;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class SnookerCoach implements Coach{
    
    //field injection
   
    private FortuneService fortuneService;
    
    //setter injection method
    @Autowired
    @Qualifier("RESTFortuneService")
    public void setDailyWorkout(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your maisse, english and swerve shots.!";
    }

    @Override
    public String getDailyFortune() {
        return getFortuneService().getFortune();
    }
    
}
