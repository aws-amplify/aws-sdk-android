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
 * Detaches a stopped block storage disk from a Lightsail instance. Make sure to
 * unmount any file systems on the device within your operating system before
 * stopping the instance and detaching the disk.
 * </p>
 * <p>
 * The <code>detach disk</code> operation supports tag-based access control via
 * resource tags applied to the resource identified by <code>disk name</code>.
 * For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class DetachDiskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique name of the disk you want to detach from your instance (e.g.,
     * <code>my-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String diskName;

    /**
     * <p>
     * The unique name of the disk you want to detach from your instance (e.g.,
     * <code>my-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The unique name of the disk you want to detach from your instance
     *         (e.g., <code>my-disk</code>).
     *         </p>
     */
    public String getDiskName() {
        return diskName;
    }

    /**
     * <p>
     * The unique name of the disk you want to detach from your instance (e.g.,
     * <code>my-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskName <p>
     *            The unique name of the disk you want to detach from your
     *            instance (e.g., <code>my-disk</code>).
     *            </p>
     */
    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * <p>
     * The unique name of the disk you want to detach from your instance (e.g.,
     * <code>my-disk</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskName <p>
     *            The unique name of the disk you want to detach from your
     *            instance (e.g., <code>my-disk</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachDiskRequest withDiskName(String diskName) {
        this.diskName = diskName;
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
            sb.append("diskName: " + getDiskName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskName() == null) ? 0 : getDiskName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachDiskRequest == false)
            return false;
        DetachDiskRequest other = (DetachDiskRequest) obj;

        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        return true;
    }
}
