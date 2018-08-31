public class NumGen {
	   public static void main(String[] args) {
		   String usnum = args[0];
                   for (int i =0; i<usnum.length();i++){ 
                   char c = usnum.charAt(i);
                   if (c == '-'){
                      
                       String f = usnum.substring(usnum.indexOf("-")+1);
                   
                       if (f.equals("help")){
                       System.out.println("\033[1;31mUsage: java NumGen [number] [file location]");
                       System.out.println("\033[1;96mExp: java NumGen 4 /home/bobdinh/Desktop/");
                       System.out.println("\033[1;33mjava NumGen -help for more information");
                       System.out.println("\033[1;94mby @bobdinh139");
                       System.out.println("\033[1;97mDescription: all possible combinations number generator ");
                       System.exit(0);
                   }}
                   else if ((c < '0' || c > '9')){
                   System.out.println("\033[1;31mUsage: java NumGen [number] [file location]");
  		   System.out.println("\033[1;96mExp: java NumGen 4 /home/bobdinh/Desktop/");
                   System.out.println("\033[1;33mjava NumGen -help for more information");
                   System.exit(2);
                   }}
                   String filelo="";
               
                   try {
                   filelo = args[1];
                   } catch (ArrayIndexOutOfBoundsException e){System.out.println("\033[1;31mUsage: java NumGen [number] [file location]");
                                System.out.println("\033[1;96mExp: java NumGen 4 /home/bobdinh/Desktop/");
                    System.out.println("\033[1;33mjava NumGen -help for more information");
                  }
                   System.out.println("Estimating time, filesize...");
                   Esti est = new Esti(usnum);
                   System.out.println("Estimated time execution: " +est.estime() + " second(s), " +est.estime()/60 + " minute(s), " + est.estime()/3600 + " hour(s). " );
                    System.out.println("Estimated filesize: " +est.filesize() + " KB, " +est.filesize()/1024+ " MB, " + est.filesize()/1048576 + " GB. ");                   

		   Execu exe = new Execu(usnum, filelo);
		   exe.maxnu();
		   exe.exec();
                   
                    
		 }
}

