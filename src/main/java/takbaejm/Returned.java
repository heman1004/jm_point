
package takbaejm;

public class Returned extends AbstractEvent {

    private Long id;
    private Long memberId;
    private Long qty;
    private String reason;
    private Long requestId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }
    public String getReview() {
        return reason;
    }

    public void setReview(String reason) {
        this.reason = reason;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long qty) {
        this.requestId = requestId;
    }
}
