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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the specified attribute of the specified instance. You can specify
 * only one attribute at a time. Valid attribute values are:
 * <code>instanceType</code> | <code>kernel</code> | <code>ramdisk</code> |
 * <code>userData</code> | <code>disableApiTermination</code> |
 * <code>instanceInitiatedShutdownBehavior</code> | <code>rootDeviceName</code>
 * | <code>blockDeviceMapping</code> | <code>productCodes</code> |
 * <code>sourceDestCheck</code> | <code>groupSet</code> |
 * <code>ebsOptimized</code> | <code>sriovNetSupport</code>
 * </p>
 */
public class DescribeInstanceAttributeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The instance attribute.
     * </p>
     * <p>
     * Note: The <code>enaSupport</code> attribute is not supported at this
     * time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     */
    private String attribute;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The instance attribute.
     * </p>
     * <p>
     * Note: The <code>enaSupport</code> attribute is not supported at this
     * time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @return <p>
     *         The instance attribute.
     *         </p>
     *         <p>
     *         Note: The <code>enaSupport</code> attribute is not supported at
     *         this time.
     *         </p>
     * @see InstanceAttributeName
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * <p>
     * Note: The <code>enaSupport</code> attribute is not supported at this
     * time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @param attribute <p>
     *            The instance attribute.
     *            </p>
     *            <p>
     *            Note: The <code>enaSupport</code> attribute is not supported
     *            at this time.
     *            </p>
     * @see InstanceAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * <p>
     * Note: The <code>enaSupport</code> attribute is not supported at this
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @param attribute <p>
     *            The instance attribute.
     *            </p>
     *            <p>
     *            Note: The <code>enaSupport</code> attribute is not supported
     *            at this time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */
    public DescribeInstanceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * <p>
     * Note: The <code>enaSupport</code> attribute is not supported at this
     * time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @param attribute <p>
     *            The instance attribute.
     *            </p>
     *            <p>
     *            Note: The <code>enaSupport</code> attribute is not supported
     *            at this time.
     *            </p>
     * @see InstanceAttributeName
     */
    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * <p>
     * Note: The <code>enaSupport</code> attribute is not supported at this
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData,
     * disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName,
     * blockDeviceMapping, productCodes, sourceDestCheck, groupSet,
     * ebsOptimized, sriovNetSupport, enaSupport
     *
     * @param attribute <p>
     *            The instance attribute.
     *            </p>
     *            <p>
     *            Note: The <code>enaSupport</code> attribute is not supported
     *            at this time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */
    public DescribeInstanceAttributeRequest withAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceAttributeRequest == false)
            return false;
        DescribeInstanceAttributeRequest other = (DescribeInstanceAttributeRequest) obj;

        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }
}
