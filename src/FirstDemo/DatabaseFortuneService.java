package FirstDemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "autowire your butt from database boys";
    }
    
}
