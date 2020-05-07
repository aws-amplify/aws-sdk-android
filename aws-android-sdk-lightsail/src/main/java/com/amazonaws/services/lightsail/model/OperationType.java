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

package com.amazonaws.services.lightsail.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Operation Type
 */
public enum OperationType {

    DeleteKnownHostKeys("DeleteKnownHostKeys"),
    DeleteInstance("DeleteInstance"),
    CreateInstance("CreateInstance"),
    StopInstance("StopInstance"),
    StartInstance("StartInstance"),
    RebootInstance("RebootInstance"),
    OpenInstancePublicPorts("OpenInstancePublicPorts"),
    PutInstancePublicPorts("PutInstancePublicPorts"),
    CloseInstancePublicPorts("CloseInstancePublicPorts"),
    AllocateStaticIp("AllocateStaticIp"),
    ReleaseStaticIp("ReleaseStaticIp"),
    AttachStaticIp("AttachStaticIp"),
    DetachStaticIp("DetachStaticIp"),
    UpdateDomainEntry("UpdateDomainEntry"),
    DeleteDomainEntry("DeleteDomainEntry"),
    CreateDomain("CreateDomain"),
    DeleteDomain("DeleteDomain"),
    CreateInstanceSnapshot("CreateInstanceSnapshot"),
    DeleteInstanceSnapshot("DeleteInstanceSnapshot"),
    CreateInstancesFromSnapshot("CreateInstancesFromSnapshot"),
    CreateLoadBalancer("CreateLoadBalancer"),
    DeleteLoadBalancer("DeleteLoadBalancer"),
    AttachInstancesToLoadBalancer("AttachInstancesToLoadBalancer"),
    DetachInstancesFromLoadBalancer("DetachInstancesFromLoadBalancer"),
    UpdateLoadBalancerAttribute("UpdateLoadBalancerAttribute"),
    CreateLoadBalancerTlsCertificate("CreateLoadBalancerTlsCertificate"),
    DeleteLoadBalancerTlsCertificate("DeleteLoadBalancerTlsCertificate"),
    AttachLoadBalancerTlsCertificate("AttachLoadBalancerTlsCertificate"),
    CreateDisk("CreateDisk"),
    DeleteDisk("DeleteDisk"),
    AttachDisk("AttachDisk"),
    DetachDisk("DetachDisk"),
    CreateDiskSnapshot("CreateDiskSnapshot"),
    DeleteDiskSnapshot("DeleteDiskSnapshot"),
    CreateDiskFromSnapshot("CreateDiskFromSnapshot"),
    CreateRelationalDatabase("CreateRelationalDatabase"),
    UpdateRelationalDatabase("UpdateRelationalDatabase"),
    DeleteRelationalDatabase("DeleteRelationalDatabase"),
    CreateRelationalDatabaseFromSnapshot("CreateRelationalDatabaseFromSnapshot"),
    CreateRelationalDatabaseSnapshot("CreateRelationalDatabaseSnapshot"),
    DeleteRelationalDatabaseSnapshot("DeleteRelationalDatabaseSnapshot"),
    UpdateRelationalDatabaseParameters("UpdateRelationalDatabaseParameters"),
    StartRelationalDatabase("StartRelationalDatabase"),
    RebootRelationalDatabase("RebootRelationalDatabase"),
    StopRelationalDatabase("StopRelationalDatabase"),
    EnableAddOn("EnableAddOn"),
    DisableAddOn("DisableAddOn"),
    PutAlarm("PutAlarm"),
    GetAlarms("GetAlarms"),
    DeleteAlarm("DeleteAlarm"),
    TestAlarm("TestAlarm"),
    CreateContactMethod("CreateContactMethod"),
    GetContactMethods("GetContactMethods"),
    SendContactMethodVerification("SendContactMethodVerification"),
    DeleteContactMethod("DeleteContactMethod");

    private String value;

    private OperationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, OperationType> enumMap;
    static {
        enumMap = new HashMap<String, OperationType>();
        enumMap.put("DeleteKnownHostKeys", DeleteKnownHostKeys);
        enumMap.put("DeleteInstance", DeleteInstance);
        enumMap.put("CreateInstance", CreateInstance);
        enumMap.put("StopInstance", StopInstance);
        enumMap.put("StartInstance", StartInstance);
        enumMap.put("RebootInstance", RebootInstance);
        enumMap.put("OpenInstancePublicPorts", OpenInstancePublicPorts);
        enumMap.put("PutInstancePublicPorts", PutInstancePublicPorts);
        enumMap.put("CloseInstancePublicPorts", CloseInstancePublicPorts);
        enumMap.put("AllocateStaticIp", AllocateStaticIp);
        enumMap.put("ReleaseStaticIp", ReleaseStaticIp);
        enumMap.put("AttachStaticIp", AttachStaticIp);
        enumMap.put("DetachStaticIp", DetachStaticIp);
        enumMap.put("UpdateDomainEntry", UpdateDomainEntry);
        enumMap.put("DeleteDomainEntry", DeleteDomainEntry);
        enumMap.put("CreateDomain", CreateDomain);
        enumMap.put("DeleteDomain", DeleteDomain);
        enumMap.put("CreateInstanceSnapshot", CreateInstanceSnapshot);
        enumMap.put("DeleteInstanceSnapshot", DeleteInstanceSnapshot);
        enumMap.put("CreateInstancesFromSnapshot", CreateInstancesFromSnapshot);
        enumMap.put("CreateLoadBalancer", CreateLoadBalancer);
        enumMap.put("DeleteLoadBalancer", DeleteLoadBalancer);
        enumMap.put("AttachInstancesToLoadBalancer", AttachInstancesToLoadBalancer);
        enumMap.put("DetachInstancesFromLoadBalancer", DetachInstancesFromLoadBalancer);
        enumMap.put("UpdateLoadBalancerAttribute", UpdateLoadBalancerAttribute);
        enumMap.put("CreateLoadBalancerTlsCertificate", CreateLoadBalancerTlsCertificate);
        enumMap.put("DeleteLoadBalancerTlsCertificate", DeleteLoadBalancerTlsCertificate);
        enumMap.put("AttachLoadBalancerTlsCertificate", AttachLoadBalancerTlsCertificate);
        enumMap.put("CreateDisk", CreateDisk);
        enumMap.put("DeleteDisk", DeleteDisk);
        enumMap.put("AttachDisk", AttachDisk);
        enumMap.put("DetachDisk", DetachDisk);
        enumMap.put("CreateDiskSnapshot", CreateDiskSnapshot);
        enumMap.put("DeleteDiskSnapshot", DeleteDiskSnapshot);
        enumMap.put("CreateDiskFromSnapshot", CreateDiskFromSnapshot);
        enumMap.put("CreateRelationalDatabase", CreateRelationalDatabase);
        enumMap.put("UpdateRelationalDatabase", UpdateRelationalDatabase);
        enumMap.put("DeleteRelationalDatabase", DeleteRelationalDatabase);
        enumMap.put("CreateRelationalDatabaseFromSnapshot", CreateRelationalDatabaseFromSnapshot);
        enumMap.put("CreateRelationalDatabaseSnapshot", CreateRelationalDatabaseSnapshot);
        enumMap.put("DeleteRelationalDatabaseSnapshot", DeleteRelationalDatabaseSnapshot);
        enumMap.put("UpdateRelationalDatabaseParameters", UpdateRelationalDatabaseParameters);
        enumMap.put("StartRelationalDatabase", StartRelationalDatabase);
        enumMap.put("RebootRelationalDatabase", RebootRelationalDatabase);
        enumMap.put("StopRelationalDatabase", StopRelationalDatabase);
        enumMap.put("EnableAddOn", EnableAddOn);
        enumMap.put("DisableAddOn", DisableAddOn);
        enumMap.put("PutAlarm", PutAlarm);
        enumMap.put("GetAlarms", GetAlarms);
        enumMap.put("DeleteAlarm", DeleteAlarm);
        enumMap.put("TestAlarm", TestAlarm);
        enumMap.put("CreateContactMethod", CreateContactMethod);
        enumMap.put("GetContactMethods", GetContactMethods);
        enumMap.put("SendContactMethodVerification", SendContactMethodVerification);
        enumMap.put("DeleteContactMethod", DeleteContactMethod);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return OperationType corresponding to the value
     */
    public static OperationType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
