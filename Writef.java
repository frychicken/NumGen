import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Writef {
  
    public void write_to(int conte, int somenu, String filelo) {
                 

                File file = new File(filelo+"/wordlist.txt");
		BufferedWriter bw = null;
		FileWriter fw = null;
                String towrite;
                     
		try {
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
                        towrite = String.valueOf(conte);
                        StringBuilder sb = new StringBuilder(towrite);
			if (towrite.length()<somenu){
                         
                         for (int i = 0;i<somenu - towrite.length();i++)
                           sb.insert(0,0);
                           towrite = sb.toString();
                        }

                     
                        bw.write(towrite+"\n");
                       
			

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
 }
}
