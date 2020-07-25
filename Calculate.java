public class Calculate{
  public static void main(String[] args){
	  System.out.println("Calculate...");
	  float first = Float.valueOf(args[0]);
	  String oper = args[1];
	  float second = Float.valueOf(args[2]);
	  float result = 0;
	  String operName = "Не известная операция";
	  if(oper.equals("+")){
	    result = first+second;
		operName = "Сложение";
	  }
	  else if (oper.equals("-")){
	    result = first-second;
		operName = "Вычитание";
	  }
	  else if(oper.equals("*")){
	    result = first*second;
		operName = "Умножение";
	  }
	  else if(oper.equals("/")){
	    result = first/second;
		operName = "Деление";
	  }
	  System.out.println("first = " + first);
	  System.out.println("oper = " + oper);
	  System.out.println("second = " + second);
	  System.out.println("operName = " + operName);
	  if(!oper.equals("Не известная операция")){
	    System.out.println("Выполнить операцию \"" + operName + "\" над операндами: " + first + " и " + second);
	    System.out.println("Результат: " + result);
	  }
  }
}