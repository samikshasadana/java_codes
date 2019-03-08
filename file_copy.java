import java.io.*; 
class T1 extends Thread
{
    public void run()
    {
        try
        {
            FileInputStream fis = new FileInputStream("E:\\desktop\\dubai_pishi\\MOVIE.mp4");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\supri\\Desktop\\java\\movie.mp4");

            int i = 0;
            while ((i = fis.read()) != -1)
            {
                fos.write(i);
            }
        }
        catch(Exception e){}
    }
}
class T2 extends Thread
{
    public void run()
    {
        try
        {
            FileInputStream fis = new FileInputStream("E:\\desktop\\dubai_pishi\\MOVIE.mp4");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\supri\\Desktop\\java\\movie.mp4");

            int i = 0;
            while ((i = fis.read()) != -1)
            {
                fos.write(i);
            }
        }
        catch(Exception e){}
    }
}

class file_copy
{
    public static void main(String arg[]) throws Exception 
    {
        T1 thd1=new T1();
        T2 thd2=new T2();
        thd1.start(); 
        thd2.start();
        FileInputStream fis = new FileInputStream("E:\\songs\\Bruno Mars - Doo-Wops & Hooligans (Deluxe Version)\\01. Grenade.mp3");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\supri\\Desktop\\java\\song1.mp3");

        int i = 0;
        while ((i = fis.read()) != -1)
        {
            fos.write(i);
        }
  } 
}