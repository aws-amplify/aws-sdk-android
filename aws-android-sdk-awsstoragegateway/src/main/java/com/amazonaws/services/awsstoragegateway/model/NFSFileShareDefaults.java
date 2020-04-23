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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

/**
 * <p>
 * Describes Network File System (NFS) file share default values. Files and
 * folders stored as Amazon S3 objects in S3 buckets don't, by default, have
 * Unix file permissions assigned to them. Upon discovery in an S3 bucket by
 * Storage Gateway, the S3 objects that represent files and folders are assigned
 * these default Unix permissions. This operation is only supported for file
 * gateways.
 * </p>
 */
public class NFSFileShareDefaults implements Serializable {
    /**
     * <p>
     * The Unix file mode in the form "nnnn". For example, "0666" represents the
     * default file mode inside the file share. The default value is 0666.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[0-7]{4}$<br/>
     */
    private String fileMode;

    /**
     * <p>
     * The Unix directory mode in the form "nnnn". For example, "0666"
     * represents the default access mode for all directories inside the file
     * share. The default value is 0777.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[0-7]{4}$<br/>
     */
    private String directoryMode;

    /**
     * <p>
     * The default group ID for the file share (unless the files have another
     * group ID specified). The default value is nfsnobody.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967294<br/>
     */
    private Long groupId;

    /**
     * <p>
     * The default owner ID for files in the file share (unless the files have
     * another owner ID specified). The default value is nfsnobody.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967294<br/>
     */
    private Long ownerId;

    /**
     * <p>
     * The Unix file mode in the form "nnnn". For example, "0666" represents the
     * default file mode inside the file share. The default value is 0666.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[0-7]{4}$<br/>
     *
     * @return <p>
     *         The Unix file mode in the form "nnnn". For example, "0666"
     *         represents the default file mode inside the file share. The
     *         default value is 0666.
     *         </p>
     */
    public String getFileMode() {
        return fileMode;
    }

    /**
     * <p>
     * The Unix file mode in the form "nnnn". For example, "0666" represents the
     * default file mode inside the file share. The default value is 0666.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[0-7]{4}$<br/>
     *
     * @param fileMode <p>
     *            The Unix file mode in the form "nnnn". For example, "0666"
     *            represents the default file mode inside the file share. The
     *            default value is 0666.
     *            </p>
     */
    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The Unix file mode in the form "nnnn". For example, "0666" represents the
     * default file mode inside the file share. The default value is 0666.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[0-7]{4}$<br/>
     *
     * @param fileMode <p>
     *            The Unix file mode in the form "nnnn". For example, "0666"
     *            represents the default file mode inside the file share. The
     *            default value is 0666.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareDefaults withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * <p>
     * The Unix directory mode in the form "nnnn". For example, "0666"
     * represents the default access mode for all directories inside the file
     * share. The default value is 0777.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[0-7]{4}$<br/>
     *
     * @return <p>
     *         The Unix directory mode in the form "nnnn". For example, "0666"
     *         represents the default access mode for all directories inside the
     *         file share. The default value is 0777.
     *         </p>
     */
    public String getDirectoryMode() {
        return directoryMode;
    }

    /**
     * <p>
     * The Unix directory mode in the form "nnnn". For example, "0666"
     * represents the default access mode for all directories inside the file
     * share. The default value is 0777.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[0-7]{4}$<br/>
     *
     * @param directoryMode <p>
     *            The Unix directory mode in the form "nnnn". For example,
     *            "0666" represents the default access mode for all directories
     *            inside the file share. The default value is 0777.
     *            </p>
     */
    public void setDirectoryMode(String directoryMode) {
        this.directoryMode = directoryMode;
    }

    /**
     * <p>
     * The Unix directory mode in the form "nnnn". For example, "0666"
     * represents the default access mode for all directories inside the file
     * share. The default value is 0777.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[0-7]{4}$<br/>
     *
     * @param directoryMode <p>
     *            The Unix directory mode in the form "nnnn". For example,
     *            "0666" represents the default access mode for all directories
     *            inside the file share. The default value is 0777.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareDefaults withDirectoryMode(String directoryMode) {
        this.directoryMode = directoryMode;
        return this;
    }

    /**
     * <p>
     * The default group ID for the file share (unless the files have another
     * group ID specified). The default value is nfsnobody.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967294<br/>
     *
     * @return <p>
     *         The default group ID for the file share (unless the files have
     *         another group ID specified). The default value is nfsnobody.
     *         </p>
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * <p>
     * The default group ID for the file share (unless the files have another
     * group ID specified). The default value is nfsnobody.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967294<br/>
     *
     * @param groupId <p>
     *            The default group ID for the file share (unless the files have
     *            another group ID specified). The default value is nfsnobody.
     *            </p>
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The default group ID for the file share (unless the files have another
     * group ID specified). The default value is nfsnobody.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967294<br/>
     *
     * @param groupId <p>
     *            The default group ID for the file share (unless the files have
     *            another group ID specified). The default value is nfsnobody.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareDefaults withGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * The default owner ID for files in the file share (unless the files have
     * another owner ID specified). The default value is nfsnobody.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967294<br/>
     *
     * @return <p>
     *         The default owner ID for files in the file share (unless the
     *         files have another owner ID specified). The default value is
     *         nfsnobody.
     *         </p>
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The default owner ID for files in the file share (unless the files have
     * another owner ID specified). The default value is nfsnobody.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967294<br/>
     *
     * @param ownerId <p>
     *            The default owner ID for files in the file share (unless the
     *            files have another owner ID specified). The default value is
     *            nfsnobody.
     *            </p>
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The default owner ID for files in the file share (unless the files have
     * another owner ID specified). The default value is nfsnobody.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967294<br/>
     *
     * @param ownerId <p>
     *            The default owner ID for files in the file share (unless the
     *            files have another owner ID specified). The default value is
     *            nfsnobody.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareDefaults withOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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
        if (getFileMode() != null)
            sb.append("FileMode: " + getFileMode() + ",");
        if (getDirectoryMode() != null)
            sb.append("DirectoryMode: " + getDirectoryMode() + ",");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryMode() == null) ? 0 : getDirectoryMode().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NFSFileShareDefaults == false)
            return false;
        NFSFileShareDefaults other = (NFSFileShareDefaults) obj;

        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        if (other.getDirectoryMode() == null ^ this.getDirectoryMode() == null)
            return false;
        if (other.getDirectoryMode() != null
                && other.getDirectoryMode().equals(this.getDirectoryMode()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        return true;
    }
}
