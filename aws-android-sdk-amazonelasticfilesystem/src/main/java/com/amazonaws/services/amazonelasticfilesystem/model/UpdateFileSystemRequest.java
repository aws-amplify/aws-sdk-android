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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the throughput mode or the amount of provisioned throughput of an
 * existing file system.
 * </p>
 */
public class UpdateFileSystemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If
     * you're not updating your throughput mode, you don't need to provide this
     * value in your request. If you are changing the
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     */
    private String throughputMode;

    /**
     * <p>
     * (Optional) The amount of throughput, in MiB/s, that you want to provision
     * for your file system. Valid values are 1-1024. Required if
     * <code>ThroughputMode</code> is changed to <code>provisioned</code> on
     * update. If you're not updating the amount of provisioned throughput for
     * your file system, you don't need to provide this value in your request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Double provisionedThroughputInMibps;

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     *
     * @return <p>
     *         The ID of the file system that you want to update.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the file system that you want to update.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the file system that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If
     * you're not updating your throughput mode, you don't need to provide this
     * value in your request. If you are changing the
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @return <p>
     *         (Optional) The throughput mode that you want your file system to
     *         use. If you're not updating your throughput mode, you don't need
     *         to provide this value in your request. If you are changing the
     *         <code>ThroughputMode</code> to <code>provisioned</code>, you must
     *         also set a value for <code>ProvisionedThroughputInMibps</code>.
     *         </p>
     * @see ThroughputMode
     */
    public String getThroughputMode() {
        return throughputMode;
    }

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If
     * you're not updating your throughput mode, you don't need to provide this
     * value in your request. If you are changing the
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            (Optional) The throughput mode that you want your file system
     *            to use. If you're not updating your throughput mode, you don't
     *            need to provide this value in your request. If you are
     *            changing the <code>ThroughputMode</code> to
     *            <code>provisioned</code>, you must also set a value for
     *            <code>ProvisionedThroughputInMibps</code>.
     *            </p>
     * @see ThroughputMode
     */
    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If
     * you're not updating your throughput mode, you don't need to provide this
     * value in your request. If you are changing the
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            (Optional) The throughput mode that you want your file system
     *            to use. If you're not updating your throughput mode, you don't
     *            need to provide this value in your request. If you are
     *            changing the <code>ThroughputMode</code> to
     *            <code>provisioned</code>, you must also set a value for
     *            <code>ProvisionedThroughputInMibps</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThroughputMode
     */
    public UpdateFileSystemRequest withThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
        return this;
    }

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If
     * you're not updating your throughput mode, you don't need to provide this
     * value in your request. If you are changing the
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            (Optional) The throughput mode that you want your file system
     *            to use. If you're not updating your throughput mode, you don't
     *            need to provide this value in your request. If you are
     *            changing the <code>ThroughputMode</code> to
     *            <code>provisioned</code>, you must also set a value for
     *            <code>ProvisionedThroughputInMibps</code>.
     *            </p>
     * @see ThroughputMode
     */
    public void setThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
    }

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If
     * you're not updating your throughput mode, you don't need to provide this
     * value in your request. If you are changing the
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughputInMibps</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            (Optional) The throughput mode that you want your file system
     *            to use. If you're not updating your throughput mode, you don't
     *            need to provide this value in your request. If you are
     *            changing the <code>ThroughputMode</code> to
     *            <code>provisioned</code>, you must also set a value for
     *            <code>ProvisionedThroughputInMibps</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThroughputMode
     */
    public UpdateFileSystemRequest withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) The amount of throughput, in MiB/s, that you want to provision
     * for your file system. Valid values are 1-1024. Required if
     * <code>ThroughputMode</code> is changed to <code>provisioned</code> on
     * update. If you're not updating the amount of provisioned throughput for
     * your file system, you don't need to provide this value in your request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         (Optional) The amount of throughput, in MiB/s, that you want to
     *         provision for your file system. Valid values are 1-1024. Required
     *         if <code>ThroughputMode</code> is changed to
     *         <code>provisioned</code> on update. If you're not updating the
     *         amount of provisioned throughput for your file system, you don't
     *         need to provide this value in your request.
     *         </p>
     */
    public Double getProvisionedThroughputInMibps() {
        return provisionedThroughputInMibps;
    }

    /**
     * <p>
     * (Optional) The amount of throughput, in MiB/s, that you want to provision
     * for your file system. Valid values are 1-1024. Required if
     * <code>ThroughputMode</code> is changed to <code>provisioned</code> on
     * update. If you're not updating the amount of provisioned throughput for
     * your file system, you don't need to provide this value in your request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedThroughputInMibps <p>
     *            (Optional) The amount of throughput, in MiB/s, that you want
     *            to provision for your file system. Valid values are 1-1024.
     *            Required if <code>ThroughputMode</code> is changed to
     *            <code>provisioned</code> on update. If you're not updating the
     *            amount of provisioned throughput for your file system, you
     *            don't need to provide this value in your request.
     *            </p>
     */
    public void setProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
    }

    /**
     * <p>
     * (Optional) The amount of throughput, in MiB/s, that you want to provision
     * for your file system. Valid values are 1-1024. Required if
     * <code>ThroughputMode</code> is changed to <code>provisioned</code> on
     * update. If you're not updating the amount of provisioned throughput for
     * your file system, you don't need to provide this value in your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedThroughputInMibps <p>
     *            (Optional) The amount of throughput, in MiB/s, that you want
     *            to provision for your file system. Valid values are 1-1024.
     *            Required if <code>ThroughputMode</code> is changed to
     *            <code>provisioned</code> on update. If you're not updating the
     *            amount of provisioned throughput for your file system, you
     *            don't need to provide this value in your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemRequest withProvisionedThroughputInMibps(
            Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getThroughputMode() != null)
            sb.append("ThroughputMode: " + getThroughputMode() + ",");
        if (getProvisionedThroughputInMibps() != null)
            sb.append("ProvisionedThroughputInMibps: " + getProvisionedThroughputInMibps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode
                + ((getThroughputMode() == null) ? 0 : getThroughputMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughputInMibps() == null) ? 0
                        : getProvisionedThroughputInMibps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemRequest == false)
            return false;
        UpdateFileSystemRequest other = (UpdateFileSystemRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getThroughputMode() == null ^ this.getThroughputMode() == null)
            return false;
        if (other.getThroughputMode() != null
                && other.getThroughputMode().equals(this.getThroughputMode()) == false)
            return false;
        if (other.getProvisionedThroughputInMibps() == null
                ^ this.getProvisionedThroughputInMibps() == null)
            return false;
        if (other.getProvisionedThroughputInMibps() != null
                && other.getProvisionedThroughputInMibps().equals(
                        this.getProvisionedThroughputInMibps()) == false)
            return false;
        return true;
    }
}
