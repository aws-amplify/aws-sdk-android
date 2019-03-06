package com.amazonaws.mobile.client.results;

import java.util.List;

public class ListDevicesResult {
    private List<Device> devices;
    private String paginationToken;

    public ListDevicesResult(List<Device> devices, String paginationToken) {
        this.devices = devices;
        this.paginationToken = paginationToken;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public String getPaginationToken() {
        return paginationToken;
    }
}
