import java.io.*;

class WriteFile
{
    public static void main (String arg[]) throws Exception
    {
    FileOutputStream fobj = new FileOutputStream("Marvellous1.txt");

    String Data = "Marvellous Infosystems Pune";

    byte bData[] = Data.getBytes();

    fobj.write(bData);
    fobj.close();
    }
}