/** 
  ����� ��������� �����������
*/
public class Calculator{
	/** ��������� ����������
	*/
	private int result;
	
	/** ����� ����������
	@param params ��������� ������������
	*/
    public void Add(int ... params){
	  for(int param : params){
		  this.result += param;
	  }
	}
	
	/** �������� ����������
	@param params ��������� ���������
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

	/** ������������ ����������
	@param params ��������� ������������
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
	
	/** ������� ����������
	@param params ��������� �������
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
	
	/** �������� ���������
	@return ��������� ����������
	*/
	public int GetResult(){
	  return result;
	}
	
	/** �������� ���������
	*/
	public void CleanResult(){
	  result = 0;
	}
}