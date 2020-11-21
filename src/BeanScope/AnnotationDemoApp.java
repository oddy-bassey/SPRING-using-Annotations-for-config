package BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args){
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeContext.xml");
        
        SnookerCoach theCoach = context.getBean("snookerCoach", SnookerCoach.class);
        SnookerCoach theCoach2 = context.getBean("snookerCoach", SnookerCoach.class);
        
        boolean value = (theCoach==theCoach2);
        
        System.out.println("is object the same: "+value);
        
        System.out.println(theCoach.getDailyWorkout());
        
        System.out.println(theCoach.getDailyFortune());
        
        //System.out.println("Email: "+theCoach.getEmail());
        
        //System.out.println("Team: "+theCoach.getTeam());
        
        context.close();
    }
}
