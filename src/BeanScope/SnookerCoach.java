package BeanScope;
 
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class SnookerCoach implements Coach{
    
    //field injection
   
    private FortuneService fortuneService;
    
    //setter injection method
    @Autowired
    @Qualifier("happyFortuneService")
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
    
    //@PostConstruct
    public void doInitWork(){
        System.out.println("Starting the program");
    }
    
    @PreDestroy
    public void doCleanupWork(){
        System.out.println("Stoping the program");
    }
}
