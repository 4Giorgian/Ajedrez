package mediator.module;

public class ModuleMessage {  
    private String source;  
    private String target;  
    private String messageType;  
    private String payload;  
  
    public ModuleMessage(String source, String target, String messageType, String payload) {  
         this.source = source;  
         this.target = target;  
         this.messageType = messageType;  
         this.payload = payload;  
     }  

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getPayload() {
        return payload;
    }
    /** GET AND SET */
 }   