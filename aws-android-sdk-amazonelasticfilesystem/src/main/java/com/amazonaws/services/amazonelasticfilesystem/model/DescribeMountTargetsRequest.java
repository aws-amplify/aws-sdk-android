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
 * Returns the descriptions of all the current mount targets, or a specific
 * mount target, for a file system. When requesting all of the current mount
 * targets, the order of mount targets returned in the response is unspecified.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DescribeMountTargets</code> action, on either the
 * file system ID that you specify in <code>FileSystemId</code>, or on the file
 * system of the mount target that you specify in <code>MountTargetId</code>.
 * </p>
 */
public class DescribeMountTargetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * (Optional) Maximum number of mount targets to return in the response.
     * Currently, this number is automatically set to 10, and other values are
     * ignored. The response is paginated at 100 per page if you have more than
     * 100 mount targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxItems;

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous
     * <code>DescribeMountTargets</code> operation (String). If present, it
     * specifies to continue the list from where the previous returning call
     * left off.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * (Optional) ID of the file system whose mount targets you want to list
     * (String). It must be included in your request if an
     * <code>AccessPointId</code> or <code>MountTargetId</code> is not included.
     * Accepts either a file system ID or ARN as input.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * (Optional) ID of the mount target that you want to have described
     * (String). It must be included in your request if
     * <code>FileSystemId</code> is not included. Accepts either a mount target
     * ID or ARN as input.
     * </p>
     */
    private String mountTargetId;

    /**
     * <p>
     * (Optional) The ID of the access point whose mount targets that you want
     * to list. It must be included in your request if a
     * <code>FileSystemId</code> or <code>MountTargetId</code> is not included
     * in your request. Accepts either an access point ID or ARN as input.
     * </p>
     */
    private String accessPointId;

    /**
     * <p>
     * (Optional) Maximum number of mount targets to return in the response.
     * Currently, this number is automatically set to 10, and other values are
     * ignored. The response is paginated at 100 per page if you have more than
     * 100 mount targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         (Optional) Maximum number of mount targets to return in the
     *         response. Currently, this number is automatically set to 10, and
     *         other values are ignored. The response is paginated at 100 per
     *         page if you have more than 100 mount targets.
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * (Optional) Maximum number of mount targets to return in the response.
     * Currently, this number is automatically set to 10, and other values are
     * ignored. The response is paginated at 100 per page if you have more than
     * 100 mount targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxItems <p>
     *            (Optional) Maximum number of mount targets to return in the
     *            response. Currently, this number is automatically set to 10,
     *            and other values are ignored. The response is paginated at 100
     *            per page if you have more than 100 mount targets.
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) Maximum number of mount targets to return in the response.
     * Currently, this number is automatically set to 10, and other values are
     * ignored. The response is paginated at 100 per page if you have more than
     * 100 mount targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxItems <p>
     *            (Optional) Maximum number of mount targets to return in the
     *            response. Currently, this number is automatically set to 10,
     *            and other values are ignored. The response is paginated at 100
     *            per page if you have more than 100 mount targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMountTargetsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous
     * <code>DescribeMountTargets</code> operation (String). If present, it
     * specifies to continue the list from where the previous returning call
     * left off.
     * </p>
     *
     * @return <p>
     *         (Optional) Opaque pagination token returned from a previous
     *         <code>DescribeMountTargets</code> operation (String). If present,
     *         it specifies to continue the list from where the previous
     *         returning call left off.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous
     * <code>DescribeMountTargets</code> operation (String). If present, it
     * specifies to continue the list from where the previous returning call
     * left off.
     * </p>
     *
     * @param marker <p>
     *            (Optional) Opaque pagination token returned from a previous
     *            <code>DescribeMountTargets</code> operation (String). If
     *            present, it specifies to continue the list from where the
     *            previous returning call left off.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous
     * <code>DescribeMountTargets</code> operation (String). If present, it
     * specifies to continue the list from where the previous returning call
     * left off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            (Optional) Opaque pagination token returned from a previous
     *            <code>DescribeMountTargets</code> operation (String). If
     *            present, it specifies to continue the list from where the
     *            previous returning call left off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMountTargetsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose mount targets you want to list
     * (String). It must be included in your request if an
     * <code>AccessPointId</code> or <code>MountTargetId</code> is not included.
     * Accepts either a file system ID or ARN as input.
     * </p>
     *
     * @return <p>
     *         (Optional) ID of the file system whose mount targets you want to
     *         list (String). It must be included in your request if an
     *         <code>AccessPointId</code> or <code>MountTargetId</code> is not
     *         included. Accepts either a file system ID or ARN as input.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose mount targets you want to list
     * (String). It must be included in your request if an
     * <code>AccessPointId</code> or <code>MountTargetId</code> is not included.
     * Accepts either a file system ID or ARN as input.
     * </p>
     *
     * @param fileSystemId <p>
     *            (Optional) ID of the file system whose mount targets you want
     *            to list (String). It must be included in your request if an
     *            <code>AccessPointId</code> or <code>MountTargetId</code> is
     *            not included. Accepts either a file system ID or ARN as input.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose mount targets you want to list
     * (String). It must be included in your request if an
     * <code>AccessPointId</code> or <code>MountTargetId</code> is not included.
     * Accepts either a file system ID or ARN as input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            (Optional) ID of the file system whose mount targets you want
     *            to list (String). It must be included in your request if an
     *            <code>AccessPointId</code> or <code>MountTargetId</code> is
     *            not included. Accepts either a file system ID or ARN as input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMountTargetsRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * (Optional) ID of the mount target that you want to have described
     * (String). It must be included in your request if
     * <code>FileSystemId</code> is not included. Accepts either a mount target
     * ID or ARN as input.
     * </p>
     *
     * @return <p>
     *         (Optional) ID of the mount target that you want to have described
     *         (String). It must be included in your request if
     *         <code>FileSystemId</code> is not included. Accepts either a mount
     *         target ID or ARN as input.
     *         </p>
     */
    public String getMountTargetId() {
        return mountTargetId;
    }

    /**
     * <p>
     * (Optional) ID of the mount target that you want to have described
     * (String). It must be included in your request if
     * <code>FileSystemId</code> is not included. Accepts either a mount target
     * ID or ARN as input.
     * </p>
     *
     * @param mountTargetId <p>
     *            (Optional) ID of the mount target that you want to have
     *            described (String). It must be included in your request if
     *            <code>FileSystemId</code> is not included. Accepts either a
     *            mount target ID or ARN as input.
     *            </p>
     */
    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * (Optional) ID of the mount target that you want to have described
     * (String). It must be included in your request if
     * <code>FileSystemId</code> is not included. Accepts either a mount target
     * ID or ARN as input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountTargetId <p>
     *            (Optional) ID of the mount target that you want to have
     *            described (String). It must be included in your request if
     *            <code>FileSystemId</code> is not included. Accepts either a
     *            mount target ID or ARN as input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMountTargetsRequest withMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    /**
     * <p>
     * (Optional) The ID of the access point whose mount targets that you want
     * to list. It must be included in your request if a
     * <code>FileSystemId</code> or <code>MountTargetId</code> is not included
     * in your request. Accepts either an access point ID or ARN as input.
     * </p>
     *
     * @return <p>
     *         (Optional) The ID of the access point whose mount targets that
     *         you want to list. It must be included in your request if a
     *         <code>FileSystemId</code> or <code>MountTargetId</code> is not
     *         included in your request. Accepts either an access point ID or
     *         ARN as input.
     *         </p>
     */
    public String getAccessPointId() {
        return accessPointId;
    }

    /**
     * <p>
     * (Optional) The ID of the access point whose mount targets that you want
     * to list. It must be included in your request if a
     * <code>FileSystemId</code> or <code>MountTargetId</code> is not included
     * in your request. Accepts either an access point ID or ARN as input.
     * </p>
     *
     * @param accessPointId <p>
     *            (Optional) The ID of the access point whose mount targets that
     *            you want to list. It must be included in your request if a
     *            <code>FileSystemId</code> or <code>MountTargetId</code> is not
     *            included in your request. Accepts either an access point ID or
     *            ARN as input.
     *            </p>
     */
    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * <p>
     * (Optional) The ID of the access point whose mount targets that you want
     * to list. It must be included in your request if a
     * <code>FileSystemId</code> or <code>MountTargetId</code> is not included
     * in your request. Accepts either an access point ID or ARN as input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPointId <p>
     *            (Optional) The ID of the access point whose mount targets that
     *            you want to list. It must be included in your request if a
     *            <code>FileSystemId</code> or <code>MountTargetId</code> is not
     *            included in your request. Accepts either an access point ID or
     *            ARN as input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMountTargetsRequest withAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
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
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getMountTargetId() != null)
            sb.append("MountTargetId: " + getMountTargetId() + ",");
        if (getAccessPointId() != null)
            sb.append("AccessPointId: " + getAccessPointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode
                + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPointId() == null) ? 0 : getAccessPointId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMountTargetsRequest == false)
            return false;
        DescribeMountTargetsRequest other = (DescribeMountTargetsRequest) obj;

        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null
                && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        if (other.getAccessPointId() == null ^ this.getAccessPointId() == null)
            return false;
        if (other.getAccessPointId() != null
                && other.getAccessPointId().equals(this.getAccessPointId()) == false)
            return false;
        return true;
    }
}
