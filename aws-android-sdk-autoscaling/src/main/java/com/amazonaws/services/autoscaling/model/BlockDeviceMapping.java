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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a block device mapping.
 * </p>
 */
public class BlockDeviceMapping implements Serializable {
    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but
     * not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String virtualName;

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>). For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html"
     * >Device Naming on Linux Instances</a> in the <i>Amazon EC2 User Guide for
     * Linux Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String deviceName;

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when an instance is
     * launched.
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but
     * not both.
     * </p>
     */
    private Ebs ebs;

    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device
     * included in the block device mapping of the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device,
     * instances might fail the EC2 health check. In that case, Amazon EC2 Auto
     * Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>
     * .
     * </p>
     */
    private Boolean noDevice;

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but
     * not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the virtual device (for example,
     *         <code>ephemeral0</code>).
     *         </p>
     *         <p>
     *         You can specify either <code>VirtualName</code> or
     *         <code>Ebs</code>, but not both.
     *         </p>
     */
    public String getVirtualName() {
        return virtualName;
    }

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but
     * not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param virtualName <p>
     *            The name of the virtual device (for example,
     *            <code>ephemeral0</code>).
     *            </p>
     *            <p>
     *            You can specify either <code>VirtualName</code> or
     *            <code>Ebs</code>, but not both.
     *            </p>
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but
     * not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param virtualName <p>
     *            The name of the virtual device (for example,
     *            <code>ephemeral0</code>).
     *            </p>
     *            <p>
     *            You can specify either <code>VirtualName</code> or
     *            <code>Ebs</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockDeviceMapping withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>). For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html"
     * >Device Naming on Linux Instances</a> in the <i>Amazon EC2 User Guide for
     * Linux Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The device name exposed to the EC2 instance (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>). For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html"
     *         >Device Naming on Linux Instances</a> in the <i>Amazon EC2 User
     *         Guide for Linux Instances</i>.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>). For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html"
     * >Device Naming on Linux Instances</a> in the <i>Amazon EC2 User Guide for
     * Linux Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param deviceName <p>
     *            The device name exposed to the EC2 instance (for example,
     *            <code>/dev/sdh</code> or <code>xvdh</code>). For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html"
     *            >Device Naming on Linux Instances</a> in the <i>Amazon EC2
     *            User Guide for Linux Instances</i>.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>). For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html"
     * >Device Naming on Linux Instances</a> in the <i>Amazon EC2 User Guide for
     * Linux Instances</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param deviceName <p>
     *            The device name exposed to the EC2 instance (for example,
     *            <code>/dev/sdh</code> or <code>xvdh</code>). For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html"
     *            >Device Naming on Linux Instances</a> in the <i>Amazon EC2
     *            User Guide for Linux Instances</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when an instance is
     * launched.
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but
     * not both.
     * </p>
     *
     * @return <p>
     *         Parameters used to automatically set up EBS volumes when an
     *         instance is launched.
     *         </p>
     *         <p>
     *         You can specify either <code>VirtualName</code> or
     *         <code>Ebs</code>, but not both.
     *         </p>
     */
    public Ebs getEbs() {
        return ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when an instance is
     * launched.
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but
     * not both.
     * </p>
     *
     * @param ebs <p>
     *            Parameters used to automatically set up EBS volumes when an
     *            instance is launched.
     *            </p>
     *            <p>
     *            You can specify either <code>VirtualName</code> or
     *            <code>Ebs</code>, but not both.
     *            </p>
     */
    public void setEbs(Ebs ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when an instance is
     * launched.
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but
     * not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebs <p>
     *            Parameters used to automatically set up EBS volumes when an
     *            instance is launched.
     *            </p>
     *            <p>
     *            You can specify either <code>VirtualName</code> or
     *            <code>Ebs</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockDeviceMapping withEbs(Ebs ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device
     * included in the block device mapping of the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device,
     * instances might fail the EC2 health check. In that case, Amazon EC2 Auto
     * Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>
     * .
     * </p>
     *
     * @return <p>
     *         Setting this value to <code>true</code> suppresses the specified
     *         device included in the block device mapping of the AMI.
     *         </p>
     *         <p>
     *         If <code>NoDevice</code> is <code>true</code> for the root
     *         device, instances might fail the EC2 health check. In that case,
     *         Amazon EC2 Auto Scaling launches replacement instances.
     *         </p>
     *         <p>
     *         If you specify <code>NoDevice</code>, you cannot specify
     *         <code>Ebs</code>.
     *         </p>
     */
    public Boolean isNoDevice() {
        return noDevice;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device
     * included in the block device mapping of the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device,
     * instances might fail the EC2 health check. In that case, Amazon EC2 Auto
     * Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>
     * .
     * </p>
     *
     * @return <p>
     *         Setting this value to <code>true</code> suppresses the specified
     *         device included in the block device mapping of the AMI.
     *         </p>
     *         <p>
     *         If <code>NoDevice</code> is <code>true</code> for the root
     *         device, instances might fail the EC2 health check. In that case,
     *         Amazon EC2 Auto Scaling launches replacement instances.
     *         </p>
     *         <p>
     *         If you specify <code>NoDevice</code>, you cannot specify
     *         <code>Ebs</code>.
     *         </p>
     */
    public Boolean getNoDevice() {
        return noDevice;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device
     * included in the block device mapping of the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device,
     * instances might fail the EC2 health check. In that case, Amazon EC2 Auto
     * Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>
     * .
     * </p>
     *
     * @param noDevice <p>
     *            Setting this value to <code>true</code> suppresses the
     *            specified device included in the block device mapping of the
     *            AMI.
     *            </p>
     *            <p>
     *            If <code>NoDevice</code> is <code>true</code> for the root
     *            device, instances might fail the EC2 health check. In that
     *            case, Amazon EC2 Auto Scaling launches replacement instances.
     *            </p>
     *            <p>
     *            If you specify <code>NoDevice</code>, you cannot specify
     *            <code>Ebs</code>.
     *            </p>
     */
    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device
     * included in the block device mapping of the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device,
     * instances might fail the EC2 health check. In that case, Amazon EC2 Auto
     * Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noDevice <p>
     *            Setting this value to <code>true</code> suppresses the
     *            specified device included in the block device mapping of the
     *            AMI.
     *            </p>
     *            <p>
     *            If <code>NoDevice</code> is <code>true</code> for the root
     *            device, instances might fail the EC2 health check. In that
     *            case, Amazon EC2 Auto Scaling launches replacement instances.
     *            </p>
     *            <p>
     *            If you specify <code>NoDevice</code>, you cannot specify
     *            <code>Ebs</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockDeviceMapping withNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVirtualName() != null)
            sb.append("VirtualName: " + getVirtualName() + ",");
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getEbs() != null)
            sb.append("Ebs: " + getEbs() + ",");
        if (getNoDevice() != null)
            sb.append("NoDevice: " + getNoDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode());
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockDeviceMapping == false)
            return false;
        BlockDeviceMapping other = (BlockDeviceMapping) obj;

        if (other.getVirtualName() == null ^ this.getVirtualName() == null)
            return false;
        if (other.getVirtualName() != null
                && other.getVirtualName().equals(this.getVirtualName()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getEbs() == null ^ this.getEbs() == null)
            return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false)
            return false;
        if (other.getNoDevice() == null ^ this.getNoDevice() == null)
            return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false)
            return false;
        return true;
    }
}
