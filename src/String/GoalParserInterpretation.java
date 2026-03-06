package String;

//1678. Goal Parser Interpretation

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";

        System.out.println(interpret(command));

    }
    static String interpret(String command) {
       String name = command.replace("()" ,"o").replace("(al)","al");
       return name;
    }
}
