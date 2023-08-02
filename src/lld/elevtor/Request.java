package lld.elevtor;

import java.util.Objects;

public class Request implements Comparable<Request> {


    private ExternalRequest externalRequest;

    private InternalRequest internalRequest;


    public ExternalRequest getExternalRequest() {
        return externalRequest;
    }

    public void setExternalRequest(ExternalRequest externalRequest) {
        this.externalRequest = externalRequest;
    }

    public InternalRequest getInternalRequest() {
        return internalRequest;
    }

    public void setInternalRequest(InternalRequest internalRequest) {
        this.internalRequest = internalRequest;
    }


    public Request(ExternalRequest externalRequest, InternalRequest internalRequest) {
        this.externalRequest = externalRequest;
        this.internalRequest = internalRequest;
    }

    @Override
    public int compareTo(Request req) {
        if (Objects.equals(this.getInternalRequest().getFloor(), req.getInternalRequest().getFloor())) {
            return 0;
        } else if (this.getInternalRequest().getFloor() > req.getInternalRequest().getFloor()) {
            return 1;
        } else {
            return -1;
        }
    }
}
