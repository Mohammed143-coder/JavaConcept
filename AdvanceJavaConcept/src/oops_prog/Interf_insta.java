package oops_prog;

interface photo{
	public void resize();
	public void crop();
	public void addfilter();
}
interface post{
	 void like();
	 void comment();
	 void share();
	 void add();
	 void tag();
	
}
interface videoedit{
	void trim();
	void addaudio();
	void changespeed();
}
class photoedit implements photo,post{

	@Override
	public void like() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void share() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tag() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addfilter() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Interf_insta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
