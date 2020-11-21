package Assignment5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args){
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("assignment5Context.xml");
        
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
        
        System.out.println(theCoach.getDailyWorkout());
        
        System.out.println(theCoach.getDailyFortune());
        
        System.out.println("Email: "+theCoach.getEmail());
        
        System.out.println("Team: "+theCoach.getTeam());
        
        context.close();
    }
}
