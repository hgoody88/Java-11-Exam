public class PrimitiveTypes {

  public static void main(String[] args){
    // Worth remembering
    byte maxByte = 127;
    byte minByte = -128;

    // short = 2 byte
    // int = 4 byte
    // float = 4 byte
    // long = 8 byte
    // double = 8 byte

    System.out.println(maxByte);
    System.out.println(minByte);

// Widening  
    byte b = 100;
    short s = b;
    int i = s;
    long l = i;

    float f = 1.2f;
    double d = f;

    System.out.println(l);
    System.out.println(d);

    f = i;
    d = l;
    System.out.println(l);
    System.out.println(d);

    // Narrowing
    // long -> int IF it is within size
    int x = (int)l;

    // Overflow
    // if number is NOT within size then loss of data
    long l2 = 100000000000L;
    int i2 = (int) l2;

    System.out.println("long: " + l2 + " != int: " + i2);

    float f2 = 2147483647;
    System.out.println("Rounding error: 2.147483647E9 != " + f2);

    // Readability
    // _ ignored at compile time
    // can't use at beginning or end
    // can't use next to minus sign or decimal point or f/L
    long underscoreLong = 7_000_000_000L;

    // char = 2 byte
    // must be SINGLE quotes

    char aLetter = 'A';
    char aSameLetter = '\u0041';
    char aNumber = 65;

    char newLine = '\n';

    char minChar = 0; // default value
    char maxChar = 65535;
    // maxCharPlusOne = 65536 => compile error as trying to convert from int to char

    // Overflow
    // Char size == short size
    // !!BUT!! DIFFERENT RANGE


    System.out.println(aLetter);
    System.out.println(aSameLetter);
    System.out.println(newLine);
    System.out.println(aLetter == aNumber); // This is interesting
    System.out.println(maxChar);

    // Alternative number system

    int arabic = 100; // base 10
    int octal = 0144; // base 8
    int hexa = 0x0064; // base 16
    int bin = 0b1100100; // base 2

    double speedOfLight = 5.88e12;

  }
}