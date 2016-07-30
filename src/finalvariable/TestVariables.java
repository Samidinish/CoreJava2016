package finalvariable;

public class TestVariables {

	public static void main(String[] args) {
		NonStaticVariable varTest= new NonStaticVariable();
		int num= varTest.var2=19;
		int num1 = varTest.nosStaticVar;
		int num2=varTest.staticVar;
		int num3=varTest.var=15;
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
