/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

/**
 * <p>
 * Describes a block device mapping for a Scheduled Instance.
 * </p>
 */
public class ScheduledInstancesBlockDeviceMapping implements Serializable {

    /**
     * The device name exposed to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     */
    private String deviceName;

    /**
     * Suppresses the specified device included in the block device mapping
     * of the AMI.
     */
    private String noDevice;

    /**
     * The virtual device name (<code>ephemeral</code>N). Instance store
     * volumes are numbered starting from 0. An instance type with two
     * available instance store volumes can specify mappings for
     * <code>ephemeral0</code> and <code>ephemeral1</code>.The number of
     * available instance store volumes depends on the instance type. After
     * you connect to the instance, you must mount the volume.
     * <p>Constraints: For M3 instances, you must specify instance store
     * volumes in the block device mapping for the instance. When you launch
     * an M3 instance, we ignore any instance store volumes specified in the
     * block device mapping for the AMI.
     */
    private String virtualName;

    /**
     * Parameters used to set up EBS volumes automatically when the instance
     * is launched.
     */
    private ScheduledInstancesEbs ebs;

    /**
     * The device name exposed to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     *
     * @return The device name exposed to the instance (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * The device name exposed to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     *
     * @param deviceName The device name exposed to the instance (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * The device name exposed to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceName The device name exposed to the instance (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesBlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Suppresses the specified device included in the block device mapping
     * of the AMI.
     *
     * @return Suppresses the specified device included in the block device mapping
     *         of the AMI.
     */
    public String getNoDevice() {
        return noDevice;
    }
    
    /**
     * Suppresses the specified device included in the block device mapping
     * of the AMI.
     *
     * @param noDevice Suppresses the specified device included in the block device mapping
     *         of the AMI.
     */
    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }
    
    /**
     * Suppresses the specified device included in the block device mapping
     * of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noDevice Suppresses the specified device included in the block device mapping
     *         of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesBlockDeviceMapping withNoDevice(String noDevice) {
        this.noDevice = noDevice;
        return this;
    }

    /**
     * The virtual device name (<code>ephemeral</code>N). Instance store
     * volumes are numbered starting from 0. An instance type with two
     * available instance store volumes can specify mappings for
     * <code>ephemeral0</code> and <code>ephemeral1</code>.The number of
     * available instance store volumes depends on the instance type. After
     * you connect to the instance, you must mount the volume.
     * <p>Constraints: For M3 instances, you must specify instance store
     * volumes in the block device mapping for the instance. When you launch
     * an M3 instance, we ignore any instance store volumes specified in the
     * block device mapping for the AMI.
     *
     * @return The virtual device name (<code>ephemeral</code>N). Instance store
     *         volumes are numbered starting from 0. An instance type with two
     *         available instance store volumes can specify mappings for
     *         <code>ephemeral0</code> and <code>ephemeral1</code>.The number of
     *         available instance store volumes depends on the instance type. After
     *         you connect to the instance, you must mount the volume.
     *         <p>Constraints: For M3 instances, you must specify instance store
     *         volumes in the block device mapping for the instance. When you launch
     *         an M3 instance, we ignore any instance store volumes specified in the
     *         block device mapping for the AMI.
     */
    public String getVirtualName() {
        return virtualName;
    }
    
    /**
     * The virtual device name (<code>ephemeral</code>N). Instance store
     * volumes are numbered starting from 0. An instance type with two
     * available instance store volumes can specify mappings for
     * <code>ephemeral0</code> and <code>ephemeral1</code>.The number of
     * available instance store volumes depends on the instance type. After
     * you connect to the instance, you must mount the volume.
     * <p>Constraints: For M3 instances, you must specify instance store
     * volumes in the block device mapping for the instance. When you launch
     * an M3 instance, we ignore any instance store volumes specified in the
     * block device mapping for the AMI.
     *
     * @param virtualName The virtual device name (<code>ephemeral</code>N). Instance store
     *         volumes are numbered starting from 0. An instance type with two
     *         available instance store volumes can specify mappings for
     *         <code>ephemeral0</code> and <code>ephemeral1</code>.The number of
     *         available instance store volumes depends on the instance type. After
     *         you connect to the instance, you must mount the volume.
     *         <p>Constraints: For M3 instances, you must specify instance store
     *         volumes in the block device mapping for the instance. When you launch
     *         an M3 instance, we ignore any instance store volumes specified in the
     *         block device mapping for the AMI.
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }
    
    /**
     * The virtual device name (<code>ephemeral</code>N). Instance store
     * volumes are numbered starting from 0. An instance type with two
     * available instance store volumes can specify mappings for
     * <code>ephemeral0</code> and <code>ephemeral1</code>.The number of
     * available instance store volumes depends on the instance type. After
     * you connect to the instance, you must mount the volume.
     * <p>Constraints: For M3 instances, you must specify instance store
     * volumes in the block device mapping for the instance. When you launch
     * an M3 instance, we ignore any instance store volumes specified in the
     * block device mapping for the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualName The virtual device name (<code>ephemeral</code>N). Instance store
     *         volumes are numbered starting from 0. An instance type with two
     *         available instance store volumes can specify mappings for
     *         <code>ephemeral0</code> and <code>ephemeral1</code>.The number of
     *         available instance store volumes depends on the instance type. After
     *         you connect to the instance, you must mount the volume.
     *         <p>Constraints: For M3 instances, you must specify instance store
     *         volumes in the block device mapping for the instance. When you launch
     *         an M3 instance, we ignore any instance store volumes specified in the
     *         block device mapping for the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesBlockDeviceMapping withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }

    /**
     * Parameters used to set up EBS volumes automatically when the instance
     * is launched.
     *
     * @return Parameters used to set up EBS volumes automatically when the instance
     *         is launched.
     */
    public ScheduledInstancesEbs getEbs() {
        return ebs;
    }
    
    /**
     * Parameters used to set up EBS volumes automatically when the instance
     * is launched.
     *
     * @param ebs Parameters used to set up EBS volumes automatically when the instance
     *         is launched.
     */
    public void setEbs(ScheduledInstancesEbs ebs) {
        this.ebs = ebs;
    }
    
    /**
     * Parameters used to set up EBS volumes automatically when the instance
     * is launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebs Parameters used to set up EBS volumes automatically when the instance
     *         is launched.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesBlockDeviceMapping withEbs(ScheduledInstancesEbs ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeviceName() != null) sb.append("DeviceName: " + getDeviceName() + ",");
        if (getNoDevice() != null) sb.append("NoDevice: " + getNoDevice() + ",");
        if (getVirtualName() != null) sb.append("VirtualName: " + getVirtualName() + ",");
        if (getEbs() != null) sb.append("Ebs: " + getEbs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode()); 
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledInstancesBlockDeviceMapping == false) return false;
        ScheduledInstancesBlockDeviceMapping other = (ScheduledInstancesBlockDeviceMapping)obj;
        
        if (other.getDeviceName() == null ^ this.getDeviceName() == null) return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false) return false; 
        if (other.getNoDevice() == null ^ this.getNoDevice() == null) return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false) return false; 
        if (other.getVirtualName() == null ^ this.getVirtualName() == null) return false;
        if (other.getVirtualName() != null && other.getVirtualName().equals(this.getVirtualName()) == false) return false; 
        if (other.getEbs() == null ^ this.getEbs() == null) return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false) return false; 
        return true;
    }
    
}
    