package BeanScope;

import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    String[] fortune = new String[4];
    
    @Value("${foo.fortune1}")
    private String a;
    
    @Value("${foo.fortune2}")
    private String b;
    
    @Value("${foo.fortune3}")
    private String c;
    
    @Value("${foo.fortune4}")
    private String d;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }
    
    @PostConstruct
    public void loadFortune(){
        System.out.println("Loading system fortune");
        fortune[0] = getA();
        fortune[1] = getB();
        fortune[2] = getC();
        fortune[3] = getD();
    }
    
    @Override
    public String getFortune() {
        
        Random random = new Random();
        
        return fortune[random.nextInt(fortune.length)];
    }
    
}
