public class Calculate{
  public static void main(String[] args){
	  System.out.println("Calculate...");
	  float first = Float.valueOf(args[0]);
	  String oper = args[1];
	  float second = Float.valueOf(args[2]);
	  float result = 0;
	  String operName = "�� ��������� ��������";
	  if(oper.equals("+")){
	    result = first+second;
		operName = "��������";
	  }
	  else if (oper.equals("-")){
	    result = first-second;
		operName = "���������";
	  }
	  else if(oper.equals("*")){
	    result = first*second;
		operName = "���������";
	  }
	  else if(oper.equals("/")){
	    result = first/second;
		operName = "�������";
	  }
	  System.out.println("first = " + first);
	  System.out.println("oper = " + oper);
	  System.out.println("second = " + second);
	  System.out.println("operName = " + operName);
	  if(!oper.equals("�� ��������� ��������")){
	    System.out.println("��������� �������� \"" + operName + "\" ��� ����������: " + first + " � " + second);
	    System.out.println("���������: " + result);
	  }
  }
}