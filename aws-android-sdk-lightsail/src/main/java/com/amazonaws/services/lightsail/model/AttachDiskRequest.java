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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attaches a block storage disk to a running or stopped Lightsail instance and
 * exposes it to the instance with the specified disk name.
 * </p>
 * <p>
 * The <code>attach disk</code> operation supports tag-based access control via
 * resource tags applied to the resource identified by <code>disk name</code>.
 * For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class AttachDiskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String diskName;

    /**
     * <p>
     * The name of the Lightsail instance where you want to utilize the storage
     * disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceName;

    /**
     * <p>
     * The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String diskPath;

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The unique Lightsail disk name (e.g., <code>my-disk</code>).
     *         </p>
     */
    public String getDiskName() {
        return diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskName <p>
     *            The unique Lightsail disk name (e.g., <code>my-disk</code>).
     *            </p>
     */
    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskName <p>
     *            The unique Lightsail disk name (e.g., <code>my-disk</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachDiskRequest withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * <p>
     * The name of the Lightsail instance where you want to utilize the storage
     * disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the Lightsail instance where you want to utilize the
     *         storage disk.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance where you want to utilize the storage
     * disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the Lightsail instance where you want to utilize
     *            the storage disk.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance where you want to utilize the storage
     * disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the Lightsail instance where you want to utilize
     *            the storage disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachDiskRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The disk path to expose to the instance (e.g.,
     *         <code>/dev/xvdf</code>).
     *         </p>
     */
    public String getDiskPath() {
        return diskPath;
    }

    /**
     * <p>
     * The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param diskPath <p>
     *            The disk path to expose to the instance (e.g.,
     *            <code>/dev/xvdf</code>).
     *            </p>
     */
    public void setDiskPath(String diskPath) {
        this.diskPath = diskPath;
    }

    /**
     * <p>
     * The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param diskPath <p>
     *            The disk path to expose to the instance (e.g.,
     *            <code>/dev/xvdf</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachDiskRequest withDiskPath(String diskPath) {
        this.diskPath = diskPath;
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
        if (getDiskName() != null)
            sb.append("diskName: " + getDiskName() + ",");
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getDiskPath() != null)
            sb.append("diskPath: " + getDiskPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskName() == null) ? 0 : getDiskName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getDiskPath() == null) ? 0 : getDiskPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachDiskRequest == false)
            return false;
        AttachDiskRequest other = (AttachDiskRequest) obj;

        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getDiskPath() == null ^ this.getDiskPath() == null)
            return false;
        if (other.getDiskPath() != null && other.getDiskPath().equals(this.getDiskPath()) == false)
            return false;
        return true;
    }
}
