import java.io.File;

class GetFile{
 private String fileloc;
 public GetFile(String filelo){
 fileloc = filelo;
 } 
 
 public double getFileSize(){
 File file =new File(fileloc+"/wordlist.txt");
     double filebytes = file.length();
     return filebytes;
 

 }

}
