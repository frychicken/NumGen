public class Execu {
	private String counu;
	  private Writef wf; 
	  private int somenu;
	  private int maxnum = 1;
          private String filelo = System.getProperty("user.home");
	  public Execu(String usnum, String fileloc){
	  counu = usnum;
          if (!fileloc.equals("")){
          filelo = fileloc;
          }
	  somenu = Integer.valueOf(counu);
	 }
	  
	 public void maxnu(){
	 for (int i=0;i<somenu; i++){
	    maxnum*=10;
	 }

	 }  

	 
	  public void exec(){
	   wf = new Writef(); 
	   int numw = 0;

	   final long startTime = System.currentTimeMillis();
	   while(numw < maxnum)
	    {
	   
            if (numw == maxnum/2) System.out.println("50% - halfway done!");
           
	   wf.write_to(numw, somenu, filelo);
           numw++;
	  }
 	  final long endTime = System.currentTimeMillis();
          
          GetFile gf = new GetFile(filelo);
                     

          System.out.println("100%");
          System.out.println("\033[1;92mDone!" );
          System.out.println("Total time execution: " + (endTime-startTime)/1000 + " second(s), "+(endTime-startTime)/60000+ ": minutes(s), "+(endTime-startTime)/3600000 + " hour(s). " );
          System.out.println("File size: "+gf.getFileSize()/1024 + " KB, "+gf.getFileSize()/1048576 + " MB, "+ gf.getFileSize()/1073741824 + " GB. ");
	  System.out.println("You file is stored at: "+ filelo +"/wordlist.txt");
          System.out.println("");
	 }
	}

