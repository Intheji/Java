package day1017;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamExample {
	public static void main(String[] args) throws Exception {
		
		//. dat : 데이터 파일
		String path = "src/files/data.dat";
		
		FileOutputStream fos = new FileOutputStream(path);
		
		DataOutputStream dout = new DataOutputStream(fos);
		
		dout.writeInt(1);
		dout.writeByte(2);
		dout.writeShort(3);
		dout.writeLong(4);
		dout.writeBoolean(true);
		dout.writeChar('c');
		dout.writeFloat(3.45f);
		dout.writeDouble(234.567);
		dout.writeUTF("abc");
		
		FileInputStream fis = new FileInputStream(path);
		
		DataInputStream din = new DataInputStream(fis);
		
		System.out.println("int : " + din.readInt());
		System.out.println("byte : " + din.readByte());
		System.out.println("short : " + din.readShort());
		System.out.println("long : " + din.readLong());
		System.out.println("boolean : " + din.readBoolean());
		System.out.println("char : " + din.readChar());
		System.out.println("float : " + din.readFloat());
		System.out.println("double : " + din.readDouble());
		System.out.println("String : " + din.readUTF());
		
		din.close();
		dout.close();
	}	
}
