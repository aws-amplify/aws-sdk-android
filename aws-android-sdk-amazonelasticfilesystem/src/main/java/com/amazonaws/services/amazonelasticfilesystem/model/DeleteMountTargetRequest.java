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
 * Deletes the specified mount target.
 * </p>
 * <p>
 * This operation forcibly breaks any mounts of the file system by using the
 * mount target that is being deleted, which might disrupt instances or
 * applications using those mounts. To avoid applications getting cut off
 * abruptly, you might consider unmounting any mounts of the mount target, if
 * feasible. The operation also deletes the associated network interface.
 * Uncommitted writes might be lost, but breaking a mount target using this
 * operation does not corrupt the file system itself. The file system you
 * created remains. You can mount an EC2 instance in your VPC by using another
 * mount target.
 * </p>
 * <p>
 * This operation requires permissions for the following action on the file
 * system:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>elasticfilesystem:DeleteMountTarget</code>
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * The <code>DeleteMountTarget</code> call returns while the mount target state
 * is still <code>deleting</code>. You can check the mount target deletion by
 * calling the <a>DescribeMountTargets</a> operation, which returns a list of
 * mount target descriptions for the given file system.
 * </p>
 * </note>
 * <p>
 * The operation also requires permissions for the following Amazon EC2 action
 * on the mount target's network interface:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ec2:DeleteNetworkInterface</code>
 * </p>
 * </li>
 * </ul>
 */
public class DeleteMountTargetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the mount target to delete (String).
     * </p>
     */
    private String mountTargetId;

    /**
     * <p>
     * The ID of the mount target to delete (String).
     * </p>
     *
     * @return <p>
     *         The ID of the mount target to delete (String).
     *         </p>
     */
    public String getMountTargetId() {
        return mountTargetId;
    }

    /**
     * <p>
     * The ID of the mount target to delete (String).
     * </p>
     *
     * @param mountTargetId <p>
     *            The ID of the mount target to delete (String).
     *            </p>
     */
    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * The ID of the mount target to delete (String).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountTargetId <p>
     *            The ID of the mount target to delete (String).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMountTargetRequest withMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
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
        if (getMountTargetId() != null)
            sb.append("MountTargetId: " + getMountTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMountTargetRequest == false)
            return false;
        DeleteMountTargetRequest other = (DeleteMountTargetRequest) obj;

        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null
                && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        return true;
    }
}
