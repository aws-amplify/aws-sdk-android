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
 * Describes the specified attribute of the specified AMI. You can specify only
 * one attribute at a time.
 * </p>
 */
public class DescribeImageAttributeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the
     * <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use
     * <a>DescribeImages</a> to get information about the block device mapping
     * for the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission,
     * productCodes, blockDeviceMapping, sriovNetSupport
     */
    private String attribute;

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;

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
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the
     * <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use
     * <a>DescribeImages</a> to get information about the block device mapping
     * for the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission,
     * productCodes, blockDeviceMapping, sriovNetSupport
     *
     * @return <p>
     *         The AMI attribute.
     *         </p>
     *         <p>
     *         <b>Note</b>: Depending on your account privileges, the
     *         <code>blockDeviceMapping</code> attribute may return a
     *         <code>Client.AuthFailure</code> error. If this happens, use
     *         <a>DescribeImages</a> to get information about the block device
     *         mapping for the AMI.
     *         </p>
     * @see ImageAttributeName
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the
     * <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use
     * <a>DescribeImages</a> to get information about the block device mapping
     * for the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission,
     * productCodes, blockDeviceMapping, sriovNetSupport
     *
     * @param attribute <p>
     *            The AMI attribute.
     *            </p>
     *            <p>
     *            <b>Note</b>: Depending on your account privileges, the
     *            <code>blockDeviceMapping</code> attribute may return a
     *            <code>Client.AuthFailure</code> error. If this happens, use
     *            <a>DescribeImages</a> to get information about the block
     *            device mapping for the AMI.
     *            </p>
     * @see ImageAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the
     * <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use
     * <a>DescribeImages</a> to get information about the block device mapping
     * for the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission,
     * productCodes, blockDeviceMapping, sriovNetSupport
     *
     * @param attribute <p>
     *            The AMI attribute.
     *            </p>
     *            <p>
     *            <b>Note</b>: Depending on your account privileges, the
     *            <code>blockDeviceMapping</code> attribute may return a
     *            <code>Client.AuthFailure</code> error. If this happens, use
     *            <a>DescribeImages</a> to get information about the block
     *            device mapping for the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageAttributeName
     */
    public DescribeImageAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the
     * <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use
     * <a>DescribeImages</a> to get information about the block device mapping
     * for the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission,
     * productCodes, blockDeviceMapping, sriovNetSupport
     *
     * @param attribute <p>
     *            The AMI attribute.
     *            </p>
     *            <p>
     *            <b>Note</b>: Depending on your account privileges, the
     *            <code>blockDeviceMapping</code> attribute may return a
     *            <code>Client.AuthFailure</code> error. If this happens, use
     *            <a>DescribeImages</a> to get information about the block
     *            device mapping for the AMI.
     *            </p>
     * @see ImageAttributeName
     */
    public void setAttribute(ImageAttributeName attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the
     * <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use
     * <a>DescribeImages</a> to get information about the block device mapping
     * for the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission,
     * productCodes, blockDeviceMapping, sriovNetSupport
     *
     * @param attribute <p>
     *            The AMI attribute.
     *            </p>
     *            <p>
     *            <b>Note</b>: Depending on your account privileges, the
     *            <code>blockDeviceMapping</code> attribute may return a
     *            <code>Client.AuthFailure</code> error. If this happens, use
     *            <a>DescribeImages</a> to get information about the block
     *            device mapping for the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageAttributeName
     */
    public DescribeImageAttributeRequest withAttribute(ImageAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     *
     * @return <p>
     *         The ID of the AMI.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     *
     * @param imageId <p>
     *            The ID of the AMI.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeRequest withImageId(String imageId) {
        this.imageId = imageId;
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
    public DescribeImageAttributeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImageAttributeRequest == false)
            return false;
        DescribeImageAttributeRequest other = (DescribeImageAttributeRequest) obj;

        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
