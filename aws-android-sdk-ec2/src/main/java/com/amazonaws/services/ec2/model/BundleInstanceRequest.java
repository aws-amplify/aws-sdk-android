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
 * Bundles an Amazon instance store-backed Windows instance.
 * </p>
 * <p>
 * During bundling, only the root device volume (C:\) is bundled. Data on other
 * instance store volumes is not preserved.
 * </p>
 * <note>
 * <p>
 * This action is not applicable for Linux/Unix instances or Windows instances
 * that are backed by Amazon EBS.
 * </p>
 * </note>
 */
public class BundleInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the instance to bundle.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you
     * already own or a new bucket that Amazon EC2 creates on your behalf. If
     * you specify a bucket that belongs to someone else, Amazon EC2 returns an
     * error.
     * </p>
     */
    private Storage storage;

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
     * The ID of the instance to bundle.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: Yes
     * </p>
     *
     * @return <p>
     *         The ID of the instance to bundle.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Required: Yes
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance to bundle.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: Yes
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance to bundle.
     *            </p>
     *            <p>
     *            Type: String
     *            </p>
     *            <p>
     *            Default: None
     *            </p>
     *            <p>
     *            Required: Yes
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance to bundle.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance to bundle.
     *            </p>
     *            <p>
     *            Type: String
     *            </p>
     *            <p>
     *            Default: None
     *            </p>
     *            <p>
     *            Required: Yes
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BundleInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you
     * already own or a new bucket that Amazon EC2 creates on your behalf. If
     * you specify a bucket that belongs to someone else, Amazon EC2 returns an
     * error.
     * </p>
     *
     * @return <p>
     *         The bucket in which to store the AMI. You can specify a bucket
     *         that you already own or a new bucket that Amazon EC2 creates on
     *         your behalf. If you specify a bucket that belongs to someone
     *         else, Amazon EC2 returns an error.
     *         </p>
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you
     * already own or a new bucket that Amazon EC2 creates on your behalf. If
     * you specify a bucket that belongs to someone else, Amazon EC2 returns an
     * error.
     * </p>
     *
     * @param storage <p>
     *            The bucket in which to store the AMI. You can specify a bucket
     *            that you already own or a new bucket that Amazon EC2 creates
     *            on your behalf. If you specify a bucket that belongs to
     *            someone else, Amazon EC2 returns an error.
     *            </p>
     */
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you
     * already own or a new bucket that Amazon EC2 creates on your behalf. If
     * you specify a bucket that belongs to someone else, Amazon EC2 returns an
     * error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storage <p>
     *            The bucket in which to store the AMI. You can specify a bucket
     *            that you already own or a new bucket that Amazon EC2 creates
     *            on your behalf. If you specify a bucket that belongs to
     *            someone else, Amazon EC2 returns an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BundleInstanceRequest withStorage(Storage storage) {
        this.storage = storage;
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
    public BundleInstanceRequest withDryRun(Boolean dryRun) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getStorage() != null)
            sb.append("Storage: " + getStorage() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BundleInstanceRequest == false)
            return false;
        BundleInstanceRequest other = (BundleInstanceRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
