package study.cls.cls05.pack1;

import study.cls.cls05.pack2.Cup; 

public class CupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cup c1 = new Cup();
		c1.method();
		
		study.cls.cls05.pack2.Cup c2 = new study.cls.cls05.pack2.Cup();
		c2.method();
		
		study.cls.cls05.pack1.Cup c3 = new study.cls.cls05.pack1.Cup();
		c3.method();
//		c3.type= "유리컵"; //같은 패키지라서 사용가능 (default) private 으로 변경하면 사용불가 
		
		Cup cc=new Cup();
		cc.type = "머그컵"; //같은 패키지가 아니라서 사용불가 (default) pack2 public으로 변경해서 사용가능
		cc.method();
	}

}
