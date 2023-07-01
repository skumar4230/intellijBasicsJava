package fileHandling;


import java.io.*;

public class Tester {
    public static void main(String[] args) throws IOException {
        //        @SuppressWarnings("unused")---- we use suppress warinings to get rid of warnings if the resorce is not closed but it's a good practice to close the rsources
        //        int a;

        //        @SuppressWarnings("resource")
        //        FileOutputStream fout = new FileOutputStream("Candidate.txt");//we can also use writer and reader which also serve the same purpose
        FileWriter fout = new FileWriter("Candidate.txt");
        BufferedWriter bout = new BufferedWriter(fout);//we use buffer reader and writer to reduce use of disk usage by using a virtual disk
        String s = "We are attending Java Beyond Basics session";
        char[] c = s.toCharArray();
        //        byte[] b = s.getBytes();
        //        fout.write(b);
        bout.write(c);
        bout.close();
        fout.close();

        //        FileInputStream fin = new FileInputStream("Candidate.txt");
        FileReader fin = new FileReader("Candidate.txt");
        BufferedReader bin = new BufferedReader(fin);

        //        int i = fin.read();
        int i = bin.read();
        while (i != -1) {
            System.out.println((char) i);
            System.out.println(" " + i);
            //            i=fin.read();
            i = bin.read();
        }
        bin.close();

    }

}
