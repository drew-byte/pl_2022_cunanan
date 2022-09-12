public class DFA {
    
    public static void main(String[] args) {
        
        //Andrew Felix Cunanan
        
        String state = "q0",input = "01010101";

        for (int i = 0; i < input.length(); i++) {
            
            if(state.equals("q0") && input.charAt(i) == '0')
            {
                state = "q1";
            }
            else if(state.equals("q0") && input.charAt(i) == '1')
            {
                state = "q0";
            }
            else if(state.equals("q1") && input.charAt(i) == '1')
            {
                state = "q2";
            }
            else if(state.equals("q1") && input.charAt(i) == '0')
            {
                state = "q1";
            }
            else if(state.equals("q2") && input.charAt(i) == '1')
            {
                state = "q0";
            }
            else if(state.equals("q2") && input.charAt(i) == '0')
            {
                state = "q1";
            }
            else
            {
                System.out.println("Invalid input.. Exiting automaton");

            }
        }
        if(state.equalsIgnoreCase("q2"))
        System.out.println("String accepted");
        else
        {
            System.out.println("String not accepted");
        }
    }
}
