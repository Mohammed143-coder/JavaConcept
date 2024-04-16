package interfaceapplication;

class Photoedit implements photo,post{
	
	double size=5;
	int reso=800*600;
	String type="Birthdash";
	
	@Override
	public void resize() {
		System.out.println("Ur photo resize sucessfully");
		
	}
	@Override
	public void crop() {
		System.out.println("Photo cropped");
		
	}
	@Override
	public void addfilter() {
		System.out.println("Filter added sucesfully");
	}
	public void collage() {
		System.out.println("collage of photo done sucessfully:"+size+"MB"+reso+type);
	}
	@Override
	public void like() {
		System.out.println("Someone like your post");
		
	}
	@Override
	public void comment() {
		System.out.println("MY frnds can comment");
		
	}
	@Override
	public void share() {
		System.out.println("If u like to share it with global");
		
	}
	@Override
	public void addlike(){
		int k=102;
		for(int i=1;i<=k;i++) {
		System.out.println(k);
//		k++; 
		}
	}
	@Override
	public void tag() {
		System.out.println("Someone tag u in his photo");
		
	}
		
}
