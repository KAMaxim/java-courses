/** 
  класс реализует калькулятор
*/
public class Calculator{
	/** результат вычисление
	*/
	private int result;
	
	/** сумма аргументов
	@param params Аргументы суммирование
	*/
    public void Add(int ... params){
	  for(int param : params){
		  this.result += param;
	  }
	}
	
	/** разность аргументов
	@param params Аргументы вычитание
	*/
    public void Sub(int ... params){
	  for(int param : params){
		  if(this.result == 0) {
			  this.result = param;
		  }
		  else {
			  this.result -= param;
		  }
	  }
	}

	/** произведение аргументов
	@param params Аргументы произведение
	*/
    public void Mul(int ... params){
	  for(int param : params){
		  if(this.result == 0) {
			  this.result = param;
		  }
		  else {
			  this.result *= param;
		  }
	  }
	}
	
	/** частное аргументов
	@param params Аргументы деление
	*/
    public void Div(int ... params){
	  for(int param : params){
		  if(this.result == 0) {
			  this.result = param;
		  }
		  else {
			  this.result /= param;
		  }
	  }
	}
	
	/** получить результат
	@return результат вычисление
	*/
	public int GetResult(){
	  return result;
	}
	
	/** очистить результат
	*/
	public void CleanResult(){
	  result = 0;
	}
}