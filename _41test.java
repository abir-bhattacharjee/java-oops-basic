class InvalidAgeException extends Exception{
    InvalidAgeException(String msg) {
        System.out.println(msg);
    }
}

public class _41test {
    
    public static void vote(int age) {
        try {
            if(age < 18) {
                throw new InvalidAgeException("Not eligible for vote");
            }
            else {
                System.out.println("you can vote");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
            vote(20);
            
        
    }
}
