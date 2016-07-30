package finalvariable;

public class TestDriveWay {

	public static void main(String[] args) {
		
		DriveWay dave= new DriveWay();
		int sizePervious=dave.driveWaySize;
		System.out.println(sizePervious);
		
		DriveWay susan= new DriveWay();
		System.out.println(susan.driveWaySize);
		int sizeCurrent=susan.driveWaySize;
		System.out.println(sizeCurrent);
		System.out.println(dave.driveWaySize);

	}

}
