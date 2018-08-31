class Esti {
private int thenum;
private int timees=0; 
private int numw = 0;
private int maxnum = 100;
static int i=0;
private int filesize = 0;
public Esti(String usnum){
thenum = Integer.valueOf(usnum);
 }
public int estime(){
        
           timees = (int)(Math.pow(10,thenum-5))*2;
  
        
  return timees;
}
public int filesize(){
 if ((thenum - 3) < 0) filesize = 0;
 else
 filesize = (int)(Math.pow(12,thenum-3))*4;
  return filesize;
}


}
