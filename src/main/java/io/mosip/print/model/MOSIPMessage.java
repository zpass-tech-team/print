package io.mosip.print.model;

public class MOSIPMessage {
    private String publisher;
    private String topic;
    private String publishedOn;
    Event event;


 // Getter Methods 

 public String getPublisher() {
  return publisher;
 }

 public String getTopic() {
  return topic;
 }

 public String getPublishedOn() {
  return publishedOn;
 }

 public Event getEvent() {
  return event;
 }

 // Setter Methods 

 public void setPublisher(String publisher) {
  this.publisher = publisher;
 }

 public void setTopic(String topic) {
  this.topic = topic;
 }

 public void setPublishedOn(String publishedOn) {
  this.publishedOn = publishedOn;
 }

 public void setEvent(Event eventObject) {
  this.event = eventObject;
 }



}