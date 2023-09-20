package Stack;

public class StackExamples {
    
	char stack[];
	int size;
	int cap;
	int top;
	int len=0;
	
	StackExamples(int size){
		this.size=size;
		stack=new char[size];
		cap=size;
		top=0;
	}
	
	void pushElemet(char data) {
		   
		if(top==cap) {
			System.out.println("stack is full");
		}
		stack[top++]=data;
		len++;
	}
	
	boolean checkparanthis() {
		 int res=top/2;
		 int flag=0;
		 char in='a';
		 char ser;
		 char c;
		 if(top%2==1)  return false;
	 
		for (int i = top-1; i >= 0; i--) {
			    ser=stack[i];
			   if(ser!='a') {
				   if(ser=='(' || ser==')') {
					   c=(ser==')')?'(':')';
				   }
				   else if(ser=='{' || ser=='}') {
					   c=c=(ser=='}')?'{':'}';
				   }
				   else 
					   c=(ser==']')?'[':']';
			    for (int j = i-1; j >=0; j--) {
					if(ser!=stack[j] && stack[j]==c) {
						 stack[j]=in;
						 flag++;
						 break;
					}
					 
				  }
			   }  
		}
		if(res==flag)  return true;
	
		return false;
		
	}
	
	void display() {
		for (int i = 0; i <top; i++) {
	    System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		StackExamples ob=new StackExamples(20);
		ob.pushElemet('(');
		ob.pushElemet('[');
		ob.pushElemet('{');
		ob.pushElemet(']');
		ob.pushElemet('}');
		ob.pushElemet(')');
		ob.display();

		System.out.println("check paratheisis=="+ob.checkparanthis());
		 
	}

}
