package Practice8;


import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
			for(int i = 0; i < b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch(IOException e) {
			System.out.println("c:\\Temp\\test.out 에 저장할 수 없습니다. 경로를 확인해주세요.");
			return;
		}
		System.out.println("c:\\Temp\\test.out을 저장했습니다.");
	}

}
