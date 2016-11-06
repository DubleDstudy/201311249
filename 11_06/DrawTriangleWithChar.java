
 class DrawTriangleWithChar {
	 void drawTriangleWithChar(int height, String symbol){
		 	String s;
		 	s=symbol;
			String white=" ";
			StringBuffer sbuf = new StringBuffer();
		
			for(int i=0; i<height; i++){
				
				for(int j=0; j<height-i; j++){
					sbuf.append(white);
				
				}
				System.out.print(sbuf);
				sbuf.delete(0, sbuf.length());
				
			for(int j=0; j<(i*2)+1; j++){
				sbuf.append(s);
				
				}
				System.out.print(sbuf);
				sbuf.delete(0, sbuf.length());
				System.out.println();
				
			}
				
		}

	public static void main(String[] args) {

		DrawTriangleWithChar Dw = new DrawTriangleWithChar();
		Dw.drawTriangleWithChar(15, "#");
	}

}
