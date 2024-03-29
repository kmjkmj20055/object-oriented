public class Bag {  //관림객 가방  //가방상태 : 현금&초대장ㅇㅇ or 현금&초대장ㄴㄴ
    private Long amount;  //현금
    private Invitation invitation;  //초대장
    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {  //초대장 보유여부
        return invitation != null;
    }  //초대장 보유여부 판단

    public void hasTicket(Ticket ticket) {
        this.ticket = ticket;
    }  //티켓 보유여부 판단

    public void setTicket(Ticket ticket) {  //티켓 보유여부
        this.ticket = ticket;
    }  //초대창 -> 티켓 교환

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
