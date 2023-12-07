public class Autoandunboxing 
{
        public static void main(String args[])
        {  
        //Wrapperclass var_name=value
        Byte byteobj=10;  
        Short shortobj=20;  
        Integer intobj=30;  
        Long longobj=40l;  
        Float floatobj=1.0f;  
        Double doubleobj=60.0D;  
        Character charobj='a';  
        Boolean boolobj=true;  
          
        System.out.println("object values");  
        System.out.println("Byte object: "+byteobj);  
        System.out.println("Short object: "+shortobj);  
        System.out.println("Integer object: "+intobj);  
        System.out.println("Long object: "+longobj);  
        System.out.println("Float object: "+floatobj);  
        System.out.println("Double object: "+doubleobj);  
        System.out.println("Character object: "+charobj);  
        System.out.println("Boolean object: "+boolobj);  

        //Primitive data type,variablename=value
        byte bytevalue=byteobj;  
        short shortvalue=shortobj;  
        int intvalue=intobj;  
        long longvalue=longobj;  
        float floatvalue=floatobj;  
        double doublevalue=doubleobj;  
        char charvalue=charobj;  
        boolean boolvalue=boolobj;  
          
        System.out.println("primitive values");  
        System.out.println("byte value: "+bytevalue);  
        System.out.println("short value: "+shortvalue);  
        System.out.println("int value: "+intvalue);  
        System.out.println("long value: "+longvalue);  
        System.out.println("float value: "+floatvalue);  
        System.out.println("double value: "+doublevalue);  
        System.out.println("char value: "+charvalue);  
        System.out.println("boolean value: "+boolvalue);  
        }
}  

