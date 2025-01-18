public class DefaultValues 
{
    	static byte byteVar;
    	static short shortVar;
    	static int intVar;
    	static long longVar;
    	static float floatVar;
    	static double doubleVar;
    	static char charVar;
    	static boolean booleanVar;

    	public static void main(String[] args) 
	{
        	System.out.println("Default Values and Sizes of Primitive Datatypes:");
        	System.out.println("byte: Default = " + byteVar + ", Size = " + Byte.BYTES + " bytes");
        	System.out.println("short: Default = " + shortVar + ", Size = " + Short.BYTES + " bytes");
        	System.out.println("int: Default = " + intVar + ", Size = " + Integer.BYTES + " bytes");
        	System.out.println("long: Default = " + longVar + ", Size = " + Long.BYTES + " bytes");
        	System.out.println("float: Default = " + floatVar + ", Size = " + Float.BYTES + " bytes");
        	System.out.println("double: Default = " + doubleVar + ", Size = " + Double.BYTES + " bytes");
        	System.out.println("char: Default = " + (int) charVar + " (as int), Size = " + Character.BYTES + " bytes");
        	System.out.println("boolean: Default = " + booleanVar + ", Size = JVM dependent");
    	}
}
