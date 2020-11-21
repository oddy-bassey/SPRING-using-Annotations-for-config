package FirstDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class SnookerCoach implements Coach{
    
    //field injection
   
    private FortuneService fortuneService;
    
    //setter injection method
    @Autowired
    public void SnookerCoach(@Qualifier("happyFortuneService")FortuneService fortuneService) {
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
