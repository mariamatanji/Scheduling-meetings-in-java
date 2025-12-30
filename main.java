import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        
        // Define the meeting time in UTC 
        
        //ZonedDateTime meetingTimeUTC = ZonedDateTime.parse(ZoneId.of("2025-12-30T15:00:00Z"));
        ZonedDateTime meetingTimeUTC = ZonedDateTime.parse("2025-12-30T15:00:00Z");
        // Define participant time zones
        String[] participantTimeZone = { "America/Los_Angeles", "Europe/London","Asia/Kolkata","Australia/Sydney"};
        
        // format for displaying the date and time 
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        // print the meeting time in each participant's local time zones
        
        System.out.println("Meeting Time in UTC: " + meetingTimeUTC.format(formatter));
        
        for(String timeZone : participantTimeZone){
            ZonedDateTime localTime = meetingTimeUTC.withZoneSameInstant(ZoneId.of(timeZone));
            System.out.println("Meeting Time in  " + timeZone + ": " + localTime.format(formatter));
        }
  
    
    }
}
