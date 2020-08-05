import java.util.Scanner;
/** 
  ввести параметры от пользователя
*/
public class InteractRunner {
 public static void main(String[] args){
	  Scanner reader = new 	Scanner(System.in);
	  try{
		  Calculator calc = new Calculator();
		  String exit = "no";
		  while(!exit.equals("yes")){
			  System.out.println("Enter first arg: ");
			  String first = reader.next();
			  System.out.println("Enter operation: ");
			  String operName = reader.next();
			  System.out.println("Enter second arg: ");
			  String second = reader.next();
			  ExecuteOperation(calc, operName, first, second);
			  System.out.println("Result: " + calc.GetResult());
			  calc.CleanResult();
			  System.out.println("Exit (yes/no): ");
			  exit = reader.next();
		  }
	  }
	  finally{
		  reader.close();
	  }
	  
	  }
	  private static void ExecuteOperation(Calculator calc, String operName, String first, String second){
		  int firstOper = Integer.valueOf(first);
		  int secondOper = Integer.valueOf(second);
		switch (operName) {
           case  ("+"):
               calc.Add(firstOper, secondOper);
               break;
           case ("-"):
               calc.Sub(firstOper, secondOper);
               break;
           case ("*"):
               calc.Mul(firstOper, secondOper);
               break;
           case ("/"):
               calc.Div(firstOper, secondOper);
               break;
           default:
               System.out.println("!!! Ошибка !!!  Не известная операция");
               break;
       }			
  }
}