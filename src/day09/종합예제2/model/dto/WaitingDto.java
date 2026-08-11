package day09.종합예제2.model.dto;

public class WaitingDto {
    private String phoneNumber;
    private int member;

    public WaitingDto(){}
    public WaitingDto(String phoneNumber, int member) {
        this.phoneNumber = phoneNumber;
        this.member = member;}
        
    public String getPhoneNumber() {
        return phoneNumber;
    }    
    public int getMember() {
        return member;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setMember(int member) {
        this.member = member;
    }
     @Override
    public String toString() {
        return "WaitingDto [phoneNumber=" + phoneNumber + ", member=" + member + "]";
    }
}
