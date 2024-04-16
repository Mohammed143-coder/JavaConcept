package interfaceapplication;

class Video implements post,videoedit {

		double size;
		int duration;
		String quality;
		@Override
		public void trim() {
			System.out.println("trim done sucessfully");
			
		}
		@Override
		public void addaudio() {
			System.out.println("Audio added sucessfully");			
		}
		@Override
		public void changespeed() {
			System.out.println("Video spees is at 2.0 x");
			
		}
		public void minute() {
			System.out.println();
		}
		@Override
		public void like() {
			System.out.println("Most peoples likes your video ");
			
		}
		@Override
		public void comment() {
			System.out.println("Someone commented on your post");
			
		}
		@Override
		public void share() {
			System.out.println("Some one share your video");
			
		}
		@Override
		public void addlike() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void tag() {
			System.out.println("You tagged the celebraties ");
			
		}
}
