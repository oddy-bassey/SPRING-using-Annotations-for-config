package FirstDemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

    private String[] fortune = {
        "Beware of then wolf in sheep's cloting",
        "Diligence is the mother of all luck",
        "The journey is the reward"
    };
    private Random random = new Random();
    @Override
    public String getFortune() {
        int index = random.nextInt(fortune.length);
        
        return fortune[index];
    }
    
}
