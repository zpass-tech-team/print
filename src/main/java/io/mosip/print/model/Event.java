package io.mosip.print.model;

import java.util.ArrayList;

public class Event {
    private String id; //uuid
    private String transactionId; //privided by the publisher.
    private String version;
    Type type;
    private String timestamp; //ISO format
    private String dataShareUri; //URL
    //JSONObject
    ArrayList <Object> data = new ArrayList <Object> ();
   
   
    // Getter Methods 
   
    public String getId() {
     return id;
    }
   
    public String getTransactionId() {
     return transactionId;
    }
   
    public Type getType() {
     return type;
    }
   
    public String getTimestamp() {
     return timestamp;
    }
   
    public String getDataShareUri() {
     return dataShareUri;
    }
   
    // Setter Methods 
   
    public void setId(String id) {
     this.id = id;
    }
   
    public void setTransactionId(String transactionId) {
     this.transactionId = transactionId;
    }
   
    public void setType(Type typeObject) {
     this.type = typeObject;
    }
   
    public void setTimestamp(String timestamp) {
     this.timestamp = timestamp;
    }
   
    public void setDataShareUri(String dataShareUri) {
     this.dataShareUri = dataShareUri;
    }   
}