/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Capacity Reservation Instance Platform
 */
public enum CapacityReservationInstancePlatform {

    LinuxUNIX("Linux/UNIX"),
    RedHatEnterpriseLinux("Red Hat Enterprise Linux"),
    SUSELinux("SUSE Linux"),
    Windows("Windows"),
    WindowsWithSQLServer("Windows with SQL Server"),
    WindowsWithSQLServerEnterprise("Windows with SQL Server Enterprise"),
    WindowsWithSQLServerStandard("Windows with SQL Server Standard"),
    WindowsWithSQLServerWeb("Windows with SQL Server Web"),
    LinuxWithSQLServerStandard("Linux with SQL Server Standard"),
    LinuxWithSQLServerWeb("Linux with SQL Server Web"),
    LinuxWithSQLServerEnterprise("Linux with SQL Server Enterprise");

    private String value;

    private CapacityReservationInstancePlatform(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, CapacityReservationInstancePlatform> enumMap;
    static {
        enumMap = new HashMap<String, CapacityReservationInstancePlatform>();
        enumMap.put("Linux/UNIX", LinuxUNIX);
        enumMap.put("Red Hat Enterprise Linux", RedHatEnterpriseLinux);
        enumMap.put("SUSE Linux", SUSELinux);
        enumMap.put("Windows", Windows);
        enumMap.put("Windows with SQL Server", WindowsWithSQLServer);
        enumMap.put("Windows with SQL Server Enterprise", WindowsWithSQLServerEnterprise);
        enumMap.put("Windows with SQL Server Standard", WindowsWithSQLServerStandard);
        enumMap.put("Windows with SQL Server Web", WindowsWithSQLServerWeb);
        enumMap.put("Linux with SQL Server Standard", LinuxWithSQLServerStandard);
        enumMap.put("Linux with SQL Server Web", LinuxWithSQLServerWeb);
        enumMap.put("Linux with SQL Server Enterprise", LinuxWithSQLServerEnterprise);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return CapacityReservationInstancePlatform corresponding to the value
     */
    public static CapacityReservationInstancePlatform fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
