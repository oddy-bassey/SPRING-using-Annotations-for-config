 
package Assignment5;


import java.util.Random;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    
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
    
    
    @Override
    public String getFortune() {
        String[] fortune = {getA(),getB(),getC(),getD()};
        Random random = new Random();
        
        return fortune[random.nextInt(fortune.length)];
    }
    
}
