package cscorner;

public class Hello {
	void add() {
		int a=10;
		int b=20;
		String str="Hello,World!";
		System.out.println(str.substring(7,12));
		System.out.println(str.indexOf("W"));
		System.out.println("Addition:"+(a+b));		
		System.out.println(a);
		System.out.println('a');
	}

	void sub() {
		int a=20;
		int b=10;
		System.out.println("Sub value:"+(a-b));
	}
	void mul() {
		int a=20;
		int b=10;
		System.out.println("mul value:"+(a*b));
		System.out.println(a+b+"is the sum");
	}
	void div() {
		int a=30;
		int b=10;
		System.out.println("Qoutient value;"+(a/b));
	}
	public static void main(String[] args) {
		System.out.println("Hello krishna");
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		 Hello k=new Hello();
        k.add();
        k.sub();
        k.mul();
        k.div();
	}

}
