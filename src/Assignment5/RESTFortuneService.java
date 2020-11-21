package Assignment5;
 
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "autowire your butt from a rest API";
    }
    
}
