package first_test;

public class Address {

    private String postCode;
    private String homeTown;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Address(String postCode, String homeTown) {
        this.postCode = postCode;
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postCode='" + postCode + '\'' +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
