package com.xkazxx.vo;

import com.xkazxx.bean.DeviceCheck;

public class DeviceCheckVo extends DeviceCheck {

    private String deviceName;

    private String deviceCheckEmp;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceCheckEmp() {
        return deviceCheckEmp;
    }

    public void setDeviceCheckEmp(String deviceCheckEmp) {
        this.deviceCheckEmp = deviceCheckEmp;
    }
}
