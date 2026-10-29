package demoeclipse;

import java.util.Scanner;

public class NaukriChatPoc {

	public static void main(String[] args) {
		
		System.out.println("Hello Welocome to the NAUKRI Chat!~");
		Scanner Sc=new Scanner (System.in);
		
	
		System.out.println("Please Enter Your Details Before you Start the Process !!!");
		
		System.out.println("Enter Your Name :");
		String name=Sc.nextLine();
		
		System.out.println("Enter Your Number :");
		int Number=Sc.nextInt();
		
		System.out.println("Enter Your Age :");
		int age=Sc.nextInt();
		
		System.out.println("Hey I Got You!");
		
		System.out.println("How many Years of Experience do you have " +name);
		int expdetails =Sc.nextInt();
		
		if(expdetails >= 5 && expdetails <=7) {
			System.out.println("Thats greate!!");
			
			System.out.println("Whats your education backgroud");
			String edBackground= Sc.next();
			
			if(edBackground.equals("Btech")) {
				System.out.println("Okay Thats Fine");
				
				System.out.println("What are your major skills");
				
				
				String [] str= new String[4];
				
				for(int i=0;i<str.length;i++) {
				    System.out.println("Enter Skill " + (i + 1) + ":");
					str[i]=Sc.next();
					System.out.println("Skill added: " + str[i]);
				}
				
				
				boolean java= false;
				boolean springboot=false;
				boolean microservice=false;
				boolean Aws=false;
				
				
				for(int i=0;i<str.length;i++) {
					if(str[i].equalsIgnoreCase("java")) {
						java=true;
					}
					else if (str[i].equalsIgnoreCase("Springboot")) {
						springboot=true;
					}
					else if (str[i].equalsIgnoreCase("microservices")) {
						microservice=true;
					}
					else if (str[i].equalsIgnoreCase("Aws")) {
						Aws=true;
					}
				}
				
				
				if(java && springboot && microservice && Aws) {
					System.out.println("Thats Grate !!");
					
					Sc.nextLine();
					
					System.out.println("What project you have worked on");
					String project=Sc.nextLine();
					
					if (project.equalsIgnoreCase("JavaDeveloper")) {
						System.out.println("Thats Greate we are looking for The Gen ai Passinatoed Candiadte.");
						System.out.println("Okay currently we are offering 22 ctc. Are you okay with that?");
						
						boolean accept=Sc.nextBoolean();
						
						if(accept) {
							System.out.println("Okay thankyou we will schedule an Hr interview.");
							System.out.println("Okay get ready for the Screening!!! all right Have a nice Day.");
							
						}else {
							System.out.println("Right now we are offering only this pacakage...");
						}
						
					}else {
						System.out.println("Sorry we are looking for Geni ai skilled based Candidate to work on our company LLMs");					}
				}
				else {
					System.out.println("Your Skill set doesnt matches our expenction. we Regrt to info we are not moving with you");
				}
				
				
			}else {
				System.out.println("Sorry we are looking for a Btech Bg Candidate As per Company rules");
			}
			
		}else {
			System.out.println("Sorry we can proceed with you ");
		}
		
	

		
		
	
	}
}
