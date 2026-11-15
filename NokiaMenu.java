import java.util.Scanner;

public class NokiaMenu{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("""         
		                          Welcome to the menu options 
		                      List of menu options are
		                      1.Phone book
		                      2.Messages
		                      3.Chat
		                      4.Call register
		                      5.tones
		                      6.settings
		                      7.Call divert
		                      8.Music
		                      9.Games
		                      10.Calculator
		                      11.Reminders
		                      12.Clock
		                      13.Profiles
		                      14.Services
		                      15.Sim services
		                      
		                Enter the corresponding number  access that menu options:             """);
		    
    int choice = input.nextInt();
    switch (choice) {
      
case 1 -> { System.out.println("""
                                          Welcome to phone book
                                      1. Search
                                      2. Service Nos. 1
                                      3. Add name
                                      4. Erase
                                      5. Edit
                                      6. Copy
                                      7. Assign tone
                                      8. Send b’card
                                      9. Options
                                      10. Speed dials
                                      11. Voice tags
                                  
                            Enter the corresponding number to access that menu options:
                            """);
                                
                            int choice11 = input.nextInt();
                        
                              switch (choice11) {
                          
                                  case 1 -> System.out.println("""
                                                                Welcome to search
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 2 -> System.out.println("""
                                                                Welcome to service Nos1
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 3 -> System.out.println("""
                                                                Welcome to Add name
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                                  case 4 -> System.out.println("""
                                                                Welcome to Erase
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                               case 5 -> System.out.println("""
                                                                Welcome to Edit
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                               case 6 -> System.out.println("""
                                                                Welcome to Copy
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                               case 7 -> System.out.println("""
                                                                Welcome to Assign tone
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                              case 8 -> System.out.println("""
                                                                Welcome to Send b'card
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                              case 9 -> { System.out.println("""
                                                                Welcome to Options
                                                        1. Memory in use
                                                        2. Type of view
                                                        3. Memory status
                                              
                                            Enter the corresponding number to access
                                              that menu options:
                                              """);
                                              
                                             int choice12 = input.nextInt();
                                          
                                                  switch (choice12) {
                                                  
                                                          case 1 ->
                                                          System.out.println("""
                                                                Welcome to Memory in use
                                                        There's nothing to do here sorry
                                                        """);
                                                          
                                                          case 2 -> 
                                                          System.out.println("""
                                                                Welcome to Type of view
                                                        There's nothing to do here sorry
                                                        """);
                                                          
                                                          case 3 ->
                                                          System.out.println("""
                                                                Welcome to memory status
                                                        There's nothing to do here sorry
                                                        """);
                                                  
                                                        }
                                                        }
                              case 10 -> System.out.println("""
                                                                Welcome to Speed dials
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                              case 11 -> System.out.println("""
                                                                Welcome to voice tags
                                                        There's nothing to do here sorry
                                                        """);                          
                        }
                        }     
                           
case 2 -> { System.out.println("""
                                          Welcome to Messages
                                      1. Write messages
                                      2. Inbox
                                      3. Outbox
                                      4. Picture messages
                                      5. Templates
                                      6. Smileys
                                      7. Message settings
                                      8. Info service
                                      9. Voice mailbox number 4
                                      10. Service command editor
                                  
                            Enter the corresponding number to access that message option:
                            """);
                                
                            int choice2 = input.nextInt();
                        
                              switch (choice2) {
                          
                                  case 1 -> System.out.println("""
                                                                Welcome to Write messages
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                  case 2 -> System.out.println("""
                                                                Welcome to Inbox
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 3 -> System.out.println("""
                                                                Welcome to Outbox
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 4 -> System.out.println("""
                                                              Welcome to Picture messages
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                                  case 5 -> System.out.println("""
                                                                Welcome to Templates
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                               case 6 -> System.out.println("""
                                                                Welcome to Smileys
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                               case 7 -> { System.out.println("""
                                                              Welcome to Message settings
                                                            1. Set 12
                                                            2. Common 3
                            Enter the corresponding number to access that message option:
                            """);
                         
                             int choice21 = input.nextInt();
                             
                                    switch (choice21) {
                                    
                                          case 1 -> { System.out.println("""
                                                              Welcome to Set 12
                                                          1. Message centre number
                                                          2. Messages sent as
                                                          3. Message validity
                            Enter the corresponding number to access that Set12 option:
                            """);
                                  
                                int choice22 = input.nextInt();
                                
                                      switch (choice22) {
                                      
                                      case 1 -> System.out.println("""
                                                                Welcome to centre number
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                      case 2 -> System.out.println("""
                                                              Welcome to Messages sent as
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                      case 3 -> System.out.println("""
                                                              Welcome to Message validity
                                                        There's nothing to do here sorry
                                                        """);
                        }
                        }
                             case 2 -> { System.out.println("""
                                                              Welcome to Common 3
                                                       1. Delivery reports
                                                       2. Reply via same centre
                                                       3. Character support
                            Enter the corresponding number to access that Common 3 option:
                            """);
                                  
                                int choice23 = input.nextInt();
                                
                                      switch (choice23) {
                                      
                                      case 1 -> System.out.println("""
                                                              Welcome to Delivery reports
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                      case 2 -> System.out.println("""
                                                          Welcome to Reply via same centre
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                      case 3 -> System.out.println("""
                                                              Welcome to Character support
                                                        There's nothing to do here sorry
                                                        """);
                        
                                         }
                                         }
                                         }
                                         }
                                         
                                                              
                                   case 8 -> System.out.println("""
                                                              Welcome to info service
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                                  case 9 -> System.out.println("""
                                                        Welcome to Voice mailbox number 4
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                               case 10 -> System.out.println("""
                                                        Welcome to Service command editor
                                                        There's nothing to do here sorry
                                                        """);   
                                         
                                         
                                         }
                                         }
                                         
case 3 -> System.out.println("""
                                                              Welcome to Chat
                                                        There's nothing to do here sorry
                                                        """);
                                                        
case 4 -> { System.out.println("""
                                                              Welcome to Call register
                                                        1. Missed calls
                                                        2. Received calls
                                                        3. Dialled numbers
                                                        4. Erase recent call lists
                                                        5. Show call duration
                                                        6. Show call costs
                                                        7. Call cost settings
                                                        8. Prepaid credit
                    Enter the corresponding number to access that Call register option:
                                                        """);
                                                        
                            int choice24 = input.nextInt();
                                                        
                            switch (choice24) {
                          
                                  case 1 -> System.out.println("""
                                                                Welcome to Missed calls
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                  case 2 -> System.out.println("""
                                                                Welcome to Received calls
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 3 -> System.out.println("""
                                                                Welcome to Dialled numbers
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 4 -> System.out.println("""
                                                       Welcome to Erase recent call lists
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                                  case 5 -> { System.out.println("""
                                                            Welcome to Show call duration
                                                        1. Last call duration
                                                        2. All calls’ duration
                                                        3. Received calls’ duration
                                                        4. Dialled calls’ duration
                                                        5. Clear timers
                                                        """);
                            int choice25 = input.nextInt();
                                                        
                            switch (choice25) {
                          
                                  case 1 -> System.out.println("""
                                                          Welcome to Last call duration
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                  case 2 -> System.out.println("""
                                                          Welcome to All calls’ duration
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 3 -> System.out.println("""
                                                      Welcome to Received calls’ duration
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 4 -> System.out.println("""
                                                       Welcome to Dialled calls’ duration
                                                        There's nothing to do here sorry
                                                        """);
                                  case 5 -> System.out.println("""
                                                       Welcome to Dialled calls’ duration
                                                        There's nothing to do here sorry
                                                        """);  
                                                        }
                                                        }
                               case 6 -> { System.out.println("""
                                                               Welcome to Show call costs
                                                      1. Last call cost
                                                      2. All calls’ cost
                                                      3. Clear counters
                                                        """);
                            int choice26 = input.nextInt();
                                                        
                            switch (choice26) {
                          
                                  case 1 -> System.out.println("""
                                                          Welcome to Last call cost
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                  case 2 -> System.out.println("""
                                                          Welcome to All calls’ cost
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 3 -> System.out.println("""
                                                      Welcome to Clear counters
                                                        There's nothing to do here sorry
                                                        """); 
                                                        }
                                                        }
                                                        
                               case 7 -> { System.out.println("""
                                                            Welcome to Call cost settings
                                                    1. Call cost limit
                                                    2. Show costs in
                                                        """);
                            int choice27 = input.nextInt();
                                                        
                            switch (choice27) {
                          
                                  case 1 -> System.out.println("""
                                                          Welcome to Call cost limit
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                  case 2 -> System.out.println("""
                                                          Welcome to Show costs in
                                                        There's nothing to do here sorry
                                                        """);
                                                        }
                                                        }

                                    case 8 ->  System.out.println("""
                                                            Welcome to Prepaid credit
                                                   There's nothing to do here sorry
                                                        """);
                            }                            
                            }   
                            
case 5 -> { System.out.println("""
                                          Welcome to Tones
                                  1. Ringing tone
                                  2. Ringing volume
                                  3. Incoming call alert
                                  4. Message alert tone
                                  5. Keypad tones
                                  6. Warning tones
                                  7. Vibrating alert
                                  8. Screen saver
                                  
                            Enter the corresponding number to access that Tones options:
                            """);
                                
                            int choice5 = input.nextInt();
                        
                              switch (choice5) {
                          
                                  case 1 -> System.out.println("""
                                                                Welcome to Ringing tone
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 2 -> System.out.println("""
                                                                Welcome to Ringing volume
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 3 -> System.out.println("""
                                                            Welcome to Incoming call alert
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                                  case 4 -> System.out.println("""
                                                          Welcome to Message alert tone
                                                          There's nothing to do here sorry
                                                        """);
                                                        
                               case 5 -> System.out.println("""
                                                                Welcome to Keypad tones
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                               case 6 -> System.out.println("""
                                                                Welcome to Warning tones
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                               case 7 -> System.out.println("""
                                                                Welcome to Vibrating alert
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                              case 8 -> System.out.println("""
                                                                Welcome to Screen saver
                                                        There's nothing to do here sorry
                                                        """);
                                                        
              }
              }
              
case 6 -> { System.out.println("""
                                          Welcome to Settings
                                  1. Call settings
                                  2. Phone settings
                                  3. Security settings
                                  4. Restore factory settings
                                  
                          Enter the corresponding number to access that Settings options:
                            """);
                                
                            int choice6 = input.nextInt();
                        
                              switch (choice6) {
                                        case 1 -> { System.out.println("""
                                                            Welcome to Call settings
                                                      1. Automatic redial
                                                      2. Speed dialling
                                                      3. Call waiting options
                                                      4. Own number sending
                                                      5. Phone line in use
                                                      6. Automatic answer 
                      Enter the corresponding number to access that Call settings options:
                                                   """);
                            int choice61 = input.nextInt();
                                                        
                            switch (choice61) {
                          
                                  case 1 -> System.out.println("""
                                                          Welcome to Automatic redial
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                  case 2 -> System.out.println("""
                                                          Welcome to Speed dialling
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 3 -> System.out.println("""
                                                      Welcome to Call waiting options
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 4 -> System.out.println("""
                                                       Welcome to Own number sending
                                                        There's nothing to do here sorry
                                                        """);
                                  case 5 -> System.out.println("""
                                                       Welcome to Phone line in use
                                                        There's nothing to do here sorry
                                                        """);  
                                 case 6 -> System.out.println("""
                                                       Welcome to Automatic answer 
                                                        There's nothing to do here sorry
                                                        """);
                                                        }
                                                        }
                               case 2 -> { System.out.println("""
                                                            Welcome to Phone settings
                                                      1. Language
                                                      2. Cell info display
                                                      3. Welcome note
                                                      4. Network selection
                                                      5. Confirm SIM service actions
                    Enter the corresponding number to access that Phone settings options:
                                                   """);
                            int choice62 = input.nextInt();
                                                        
                            switch (choice62) {
                          
                                  case 1 -> System.out.println("""
                                                          Welcome to Language
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                  case 2 -> System.out.println("""
                                                          Welcome to Cell info display
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 3 -> System.out.println("""
                                                      Welcome to Welcome note
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 4 -> System.out.println("""
                                                       Welcome to Network selection
                                                        There's nothing to do here sorry
                                                        """);
                                  case 5 -> System.out.println("""
                                                  Welcome to Confirm SIM service actions
                                                        There's nothing to do here sorry
                                                        """);   
                                                        }
                                                        }
                                                                                                                      case 3 -> { System.out.println("""
                                                            Welcome to Security settings
                                                      1. PIN code request
                                                      2. Call barring service
                                                      3. Fixed dialling
                                                      4. Closed user group
                                                      5. Security level
                                                      6. Change access codes
                   Enter the corresponding number to access that Security settings option:
                                                   """);
                            int choice63 = input.nextInt();
                                                        
                            switch (choice63) {
                          
                                  case 1 -> System.out.println("""
                                                          Welcome to PIN code request
                                                        There's nothing to do here sorry
                                                        """);
                                        
                                  case 2 -> System.out.println("""
                                                          Welcome to Call barring service
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 3 -> System.out.println("""
                                                      Welcome to Fixed dialling
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 4 -> System.out.println("""
                                                       Welcome to Closed user group
                                                        There's nothing to do here sorry
                                                        """);
                                  case 5 -> System.out.println("""
                                                  Welcome to Security level
                                                        There's nothing to do here sorry
                                                        """);  
                                   case 6 -> System.out.println("""
                                                  Welcome to Change access codes
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                                                        }
                                                        }
                                  case 4 -> System.out.println("""
                                                       Welcome to Closed user group
                                                        There's nothing to do here sorry
                                                        """);
                                                        }
                                                        }
                                                        
  case 7 -> System.out.println("""
                                                  Welcome to Call divert
                                                There's nothing to do here sorry
                                                        """);
                                                      
case 8 -> { System.out.println("""
                                          Welcome to Music
                                  1. Music player
                                  2. Radio
                                  3. Recorder
                                  4. Track list
                                  
                            Enter the corresponding number to access that Music options:
                            """);
                                
                            int choice8 = input.nextInt();
                        
                              switch (choice8) {
                          
                                  case 1 -> System.out.println("""
                                                                Welcome to Music player
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 2 -> System.out.println("""
                                                                Welcome to Radio
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 3 -> System.out.println("""
                                                            Welcome to Incoming Recorder
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                                  case 4 -> System.out.println("""
                                                          Welcome to Track list
                                                          There's nothing to do here sorry
                                                        """);              
                                              }
                                              }

 case 9 -> System.out.println("""
                                                                Welcome to Games
                                                        There's nothing to do here sorry
                                                        """);
                                      
case 10 -> System.out.println("""
                                                                Welcome to Calculator
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
case 11 -> System.out.println("""
                                                            Welcome to Reminders
                                                        There's nothing to do here sorry
                                                        """);


case 12 -> { System.out.println("""
                                          Welcome to Clock
                                  1. Alarm clock
                                  2. Clock settings
                                  3. Date setting
                                  4. Stopwatch
                                  5. Countdown timer
                                  6. Auto update of date and time
                                  
                            Enter the corresponding number to access that Clock options:
                            """);
                                
                            int choice122 = input.nextInt();
                        
                              switch (choice122) {
                          
                                  case 1 -> System.out.println("""
                                                                Welcome to Alarm clock
                                                        There's nothing to do here sorry
                                                        """);
                                      
                                  case 2 -> System.out.println("""
                                                                Welcome to Clock settings
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
                                   case 3 -> System.out.println("""
                                                            Welcome to Date setting
                                                        There's nothing to do here sorry
                                                        """);
                                                        
                                  case 4 -> System.out.println("""
                                                          Welcome to Stopwatch
                                                          There's nothing to do here sorry
                                                        """);   
                              case 5 -> System.out.println("""
                                                          Welcome to Countdown timer
                                                          There's nothing to do here sorry
                                                        """);
                                
                              case 6 -> System.out.println("""
                                                   Welcome to Auto update of date and time
                                                          There's nothing to do here sorry
                                                        """);
                                              }
                                              }
case 13 -> System.out.println("""
                                                                Welcome to Profiles
                                                        There's nothing to do here sorry
                                                        """);
                                      
case 14 -> System.out.println("""
                                                                Welcome to Services
                                                        There's nothing to do here sorry
                                                        """); 
                                                        
case 15 -> System.out.println("""
                                                            Welcome to SIM services2
                                                        There's nothing to do here sorry
                                                        """);      
                                              
                                              

                                                        
               
    }
	}
}
