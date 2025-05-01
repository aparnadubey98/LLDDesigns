package swiggy.model;

import lombok.*;
import swiggy.enums.PartnerStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPartner {
    private String partnerId;
    private String name;
    private String phoneNumber;
    private Location location;
    private PartnerStatus status;

    public PartnerStatus getStatus() {
        return status;
    }

    public void setStatus(PartnerStatus status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
}
