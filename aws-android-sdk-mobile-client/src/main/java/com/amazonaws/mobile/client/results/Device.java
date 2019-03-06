package com.amazonaws.mobile.client.results;

import java.util.Date;
import java.util.Map;

public class Device {
    private final String deviceKey;
    private final Map<String, String> attributes;
    private final Date createDate;
    private final Date lastModifiedDate;
    private final Date lastAuthenticatedDate;

    public Device(String deviceKey, Map<String, String> attributes, Date createDate, Date lastModifiedDate, Date lastAuthenticatedDate) {
        this.deviceKey = deviceKey;
        this.attributes = attributes;
        this.createDate = createDate;
        this.lastModifiedDate = lastModifiedDate;
        this.lastAuthenticatedDate = lastAuthenticatedDate;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public Date getLastAuthenticatedDate() {
        return lastAuthenticatedDate;
    }

}
