package src.classes;

public class Interpreter {
    public void parseAndExecute(String line){
        String[] instructionComponents = line.split(" ");
        switch(instructionComponents[0]) {
            case "print":
                System.out.println(instructionComponents[1]);
            case "assign":
            case "writeFile":
            case "readFile":
            case "printFromTo":
            case "semWait":
            case "semSignal":
        }


    }
}