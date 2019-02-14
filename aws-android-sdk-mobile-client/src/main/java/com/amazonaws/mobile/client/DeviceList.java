package com.amazonaws.mobile.client;

import java.util.List;

public class DeviceList {
    private List<Device> devices;
    private String paginationToken;

    public DeviceList(List<Device> devices, String paginationToken) {
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
