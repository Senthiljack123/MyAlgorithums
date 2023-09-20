package practice;

public class Throw {    //user define exception

	public static void main(String[] args) {
        Throw p=new Throw();
		String s="senthil";
		try {
			p.checkPassword(s);
		}
		catch (Password e) {
			// TODO Auto-generated catch block
		    System.out.println("pls  add more velues");
		}
	}
	
	void checkPassword(String s) throws Password  {
		int l=s.length();
		if(l<8) { 
			Password ps=new Password();
			throw ps;
			
		}
		System.out.println("Strong password");
	}

}



class Password extends Throwable{
	
}

class SizePassword extends Password{
	
}

class MinSizePassword extends SizePassword{
	
}

