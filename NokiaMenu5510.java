import java.util.scanner;
public class NokiaMenu5510 {
public static void main(string[] args) {
int testing;
do{
  Scanner inputCollector = new Scanner(System.in);
  String mainmenu = """
welcome to Nokia 5510 menu
  
  Select 1 for phone book
  Select 2 for messages
  Select 3 for chat
  Select 4 for call register
  Select 5 for ring tones
  Select 6 for settings
  Select 7 for games
  Select 8 for calculator
  Select 9 for call divert
  Select 10 for clock
  Select 11 for music
  Select 12 for reminders
  Select 13 for profiles
  Select 14 for sim services
  Select 15 for services
  
  Enter preferred option """;
  
System.out.println(mainMenu);
int mainMenuChoice = inputCollecter.nextInt();
        
    Switch(mainMenuChoice){
        
        case 1
        Sytem.out.println()
        
        String phone book = """

  Select 1 for Search
  Select 2 for service nos 
  Select 3 for Add name
  Select 4 for Erase
  Select 5 for Edit
  Select 6 for Assign tone
  Select 7 for Copy
  Select 8 for Send b'card
  Select 9 for options
  Select 10 for Speed dials
  Select 11 for Voice tags
  
  """;
        }
        
System.out.println(phoneBookMenu)
            int  phoneBook = intputCollector.nextInt();
            switch(phoneBook) {
            
  case 1:
System.out.println("Search");
            break;
  case 2:
System.out.println("Service nos");
            break;
  case 3:
System.out.println("Add name");
            break;
  case 4:
System.out.println("Erase");
            break;
  case 5:
System.out.println("Edit");
            break;
  case 6:
System.out.println("Assign tone");
            break;
  case 7:
System.out.println("Copy");
            break;
  case 8:
System.out.println("Send b'card");
            break;
  case 9:
System.outprintln("Options");
String option = """;
      1. Memory in use
      2. Type of view
      3. Memory status
      """;
System.out.println(option);
int options = inputCollector.nextInt();
            break;
case 10:
System.out.println("Speed dials");
            break;
case 11:
System.out.println("voice tags");
            break;
            
      defauilt: System.out.println("No menu selected");
         }
            break;
        
        case 2:
System.out.print("Message Menu");
        
        Sting MessageMenu = """
        
        Select 1 for Write messages
        Select 2 for Inbox
        Select 3 for Outbox
        Select 4 for picture messages
        Select 5 for Templates
        Select 6 for Smileys
        Select 7 for Message settings
        Select 8 for Info service
        Select 9 for Voice mailbox number
        Select 10 for Service command editor
        """;
System.out.print(messageMenu);


      int message = inputCollector.nextInt():
      
      switch(messages) {
  
case 1:
System.out.println("Write message");
            break;
case 2:
System.out.println("Inbox");
            break;
case 3:
System.out.println("Outbox");
            break;
case 4:
System.out.println("Picture message");
            break;
case 5:
System.out.println("Templates");
            break;
case 6:
System.out.println("Smileys");
            break;
case 7:
System.out.println("Message settings");
    String Messagesetting = """
    Press 1 Set1
    Press 2 Common
    """;
System.out.println(Messagesettng);
      int messageSets = input Collector.nextInt();
            switch(messageSets) {
case 1: System.out.println("set1");
      String setMenu = """
      
              1. Message center number
              2. Message sent as
              3. Message validity
              """;
System.out.println(setMenu);
case 2: System.out.println("Common");
String Common= """
            
              1. Delivery reports
              2. Reply via same center
              3. Character support
              """
System.out.println(Common);
  default: 
System.out.println("No value");
            break;
case 8:
System.out.println("Info service");
            break;
case 9:
System.out.println("Voice mailbox number");
            break;
case 10:
System.out.println("Service command editor")
            break;
  default:
System.out.println("No menu selected");

      }
      break:
case 3:
System.out.println("Chat");
    String chatMenu = "Select 1 to chat";
System.out.println(chatMenu)
      int chats = inputCollector.nextInt();
      switch(chats){
case 1:
System.out.println("Chat");
            break;
            defaulf: Sytem.out.println("No menu selected");
            
      }
        break;
        
case 4:

System.out.println("Call register");
      String callRegister = """
          select 1 Missed calls
          select 2 Received calls
          select 3 Dialed numbers
          select 4 Erase recent call lists
          select 5 Show call duration
          select 6 Show call costs
          select 7 Call cost settings
          select 8 Prepaid credit
          """;
          
System.out.println(callRegisters);

      int callRegiste = inputCollector.nextInt();
      
             switch(callRegisters) { 
case 1:
System.out.println("Missed calls");
            break;
case 2:
System.out.println("Receives calls");
            break;
case 3:
system.out.println("Dialed numbers");
            break;
case 4:
System.out.println("Erase recent call lists");
            break;
case 5:
System.out.println("Show call duration");
  String Showcallduration = """
        1 last call duration
        2 All calls duration
        3 Received calls duration
        4 Dialed calls  duration
        5 Clear timers
        """;
System.out.println(show call duration);
    int showCallDuration = inputCollector.nextInt();
  }
            break;
            
case 6:
System.out.println("Show call costs");

String Showcallcosts = """
        1 last call cost
        2 All call cost
        3 Clear counters
        """;
System.out.printl(show call costs);
    int showCallCosts = inputCollector.nexeInt();
            break;  
case 7: 
System.out.print("Call cost settings");
String callCostSetting = """
        1 call cost limit
        2 show cost in
        """;
System.out,println(call cost setting);
      int callCostSetting = inputCollector.nextInt();
            break;
case 8:
System.out.print("Prepaid credit");
            break;
    default: 
    System.out.println("No menu selected")
    }
            break;
            
case 5:
system.out.println("Tones");
      String Tones = """
      
      Select 1 for Ringing tone
      Select 2 for Ringing volume
      Select 3 for Incoming call alert
      Select 4 for Message alert tone
      Select 5 for keypad tones
      Select 6 fore Warning tones
      Select 7 for Vibrating alert
      Select 8 for Screen saver
      """;
System.out.print(Tones);
 int tones = inputCollector.nextInt();
          switch(tones) {
  
  
case 1:
System.out.printin("Ring tone");
            break;
case 2:
System.out.print("Ring volume");
            break;
case 3:
System.out.prntln("Incoming call alert");
            break;
case 4:
System.out.println("Message alert tone");
            break;
case 5:
System.out.println("Keypad tones");
            break;
case 6:
System.out.println("Warning tone");
            break;
case 7:
System.out.println("Vibrating alert");
            break;
System.out.println("Screen saver");
    default:
System.out.println("No menu selected");
            break;
            }
            break;
            
case 6:
System.out.println("Settings");
    String setting = """
      Select 1 for Call settings
      Select 2 for Phone settings
      Select 3 for Security settings
      Select 4 for Restore factory settings
      """;
System.out.println(setting);
    int setting = inputCollector.nextInt();
          switch(setting) {
case 1:
System.out.println("call settings");
  String callSettings = """
      1 Automatic redial
      2 Speed dialing
      3 Call waiting options
      4 Own number sending
      5 Phone line in use
      6 Automatic answer
      """;
System.out.println(call settings);
    int callsetting = inputCollector.nextInt();
    break;
case 2:
System.out.println("Phone settings");
  String phoneSetting = """
      1 Language
      2 Cell info display
      3 Welcome note
      4 Network selection
      5 Confirm SIM service actions
      
      """;
System.out.print(phoneSettings);
    int phoneSetting = inputCollector.nextInt();
    break;
    
case 3:
System.out.print("Security settings");
  String securitySetting = """
        1 PIN code request
        2 Call barring service
        3 Fixed dialing
        4 Closed user group
        5 Security level
        6 Change access codes
        """;
System.out.println(securitySettings);
    int securitySettings = inputCollector.nextInt();
    break;
    
case 4:
System.out.println("Restore factory setting");
        break;
        
        default:
System.out.println("No menu selected");
        break;
        
case 7:
System.out.println("call divert");
String CallDivert = "SelectCallDivert";
int callDivert = inputCollector.nextInt();
        switch(callDivert){
case 1
System.out.println("call divert");
            break;
            default:
System.out.println("No menu selected");
          break;
          }
          break;
          
case 8:
System.out.println("Music");
String Music = """
    Select 1 for Music player
    Select 2 for Radio
    Select 3 for Recorder
    Select 4 for Track list
    """;
System.out.println(Music);
  int music = inputCollector.nextInt();
      switch(music){
case 1:
System.out.println("Music player");
            break;
case 2:
System.out.prinln("Radio");
            break;
case 3:
System.out.print("Recorder");
            break;
case 4:
System.out.println("Track list");
            break;
            default:
System.out.prinln("No menu selected");
            break;
            }
            break;
          
case 9:
System.out.print("Games");
String Games = "Select games";
System.out.print(Games);
    int games = inputCollector.nextInt();
    switch(game){
case 1:
System.out.print("Games");
            break;
            default:
System.out.println("No menu selected");
            break;
            }
            break;
            
case 10:
System.out.prinln("calculator")
String calculator = "Select calculator";
System.out.print(Calculator);
    int calculator = inputCollector.nextInt();
    switch(calculator){
            break;
            default:
System.out.println("No menu selected");
            break;
            }
            break;
case 11:
System.out.println("Reminders");
String reminders =  "Selected reminder";
System.out.println(Reminders);
  int reminders = inputCollector.nextInt();
  switch(reminder){
          break;
          default:
System.out.println("No menu selected");
          break;
          }
          break;
          
          default:
case 12:
System.out.println("Clock");
String clock = """
    Select 1 for Alarm clock
    Select 2 for Clock setting
    Select 3 for Date setting
    Select 4 for Stopwatch
    Select 5 for countdown timer
    Select 6 for Auto update of date and time
    """
System.out.println(Clock);
    int clock = inputCollector.nextInt();
    switch(clock){
case 1:
System.out.println("Alarm clock");
            break;
case 2:
System.out.println("Clock setting");
            break;
case 3:
System.out.println("Date setting");
            break;
case 4:
System.out.println("Stopwatch");
            break;
case 5:
System.out.println("Countdown timer");
            break;
case 6:
System.out.print("Auto update of date and time");
            break;
            default:
System.out.println("No menu selected");
            break;
            }
            break;
            
case 13:
System.out.println("Profiles");
String profiles = "Selected profiles";
System.out.println(profiles);
  int profiles = inputCollector.nextInt();
  switch(profiles) {
case 1:
System.out.println("Profiles");
            break;
            default:
System.out.println("No menu selected");
            break;
            }
            break;
case 14:
System.out.println("Services");
String services = "Selected service";
System.out.print(services);
    int services = inputCollector.nextInt();
    switch(services){
case 1:
System.out.println("Service");
            break;
            default:
System.out.println("No menu selected");
            break;
            }
            break;
            
case 15:
System.out.println("SIM services")"
String SIM services = "Selected SIM service
System.out.println(SIM service);
    int SIM servces = imputCollector.nextInt();
    switch(SIM services){
case 1:
System.out.println("SIM services");
            break;
            default:
System.out.println("No menu selected");
            break;
            }
            break;
} while(!=0);
 
      }
    
    }
  }

            
    
        
    
    

    
  
      
    
    
    
    
    
    
    
    
    
    
    
      
      
      
      
      
      
      
      
            
            
            
            


























            
            
            
            
            
            
            
            
            
            
            
            
            
            ]
      
            
            
            
            
            
            
            
            
            
            
            
            
            
  
      
      
      
      
      
      
      
      
      
  
      }
        
        
        
        
        










# nokia5510-java
