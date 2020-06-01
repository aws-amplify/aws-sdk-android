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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a backup of an existing Amazon FSx for Windows File Server file
 * system. Creating regular backups for your file system is a best practice that
 * complements the replication that Amazon FSx for Windows File Server performs
 * for your file system. It also enables you to restore from user modification
 * of data.
 * </p>
 * <p>
 * If a backup with the specified client request token exists, and the
 * parameters match, this operation returns the description of the existing
 * backup. If a backup specified client request token exists, and the parameters
 * don't match, this operation returns <code>IncompatibleParameterError</code>.
 * If a backup with the specified client request token doesn't exist,
 * <code>CreateBackup</code> does the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle
 * state of <code>CREATING</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Returns the description of the backup.
 * </p>
 * </li>
 * </ul>
 * <p>
 * By using the idempotent operation, you can retry a <code>CreateBackup</code>
 * operation without the risk of creating an extra backup. This approach can be
 * useful when an initial call fails in a way that makes it unclear whether a
 * backup was created. If you use the same client request token and the initial
 * call created a backup, the operation returns a successful result because all
 * the parameters are the same.
 * </p>
 * <p>
 * The <code>CreateFileSystem</code> operation returns while the backup's
 * lifecycle state is still <code>CREATING</code>. You can check the file system
 * creation status by calling the <a>DescribeBackups</a> operation, which
 * returns the backup state along with other information.
 * </p>
 * <note>
 * <p/>
 * </note>
 */
public class CreateBackupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the file system to back up.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     */
    private String fileSystemId;

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to
     * ensure idempotent creation. This string is automatically filled on your
     * behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS
     * SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The tags to apply to the backup at backup creation. The key value of the
     * <code>Name</code> tag appears in the console as the backup name.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the file system to back up.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of the file system to back up.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system to back up.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The ID of the file system to back up.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system to back up.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The ID of the file system to back up.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to
     * ensure idempotent creation. This string is automatically filled on your
     * behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS
     * SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @return <p>
     *         (Optional) A string of up to 64 ASCII characters that Amazon FSx
     *         uses to ensure idempotent creation. This string is automatically
     *         filled on your behalf when you use the AWS Command Line Interface
     *         (AWS CLI) or an AWS SDK.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to
     * ensure idempotent creation. This string is automatically filled on your
     * behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS
     * SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            (Optional) A string of up to 64 ASCII characters that Amazon
     *            FSx uses to ensure idempotent creation. This string is
     *            automatically filled on your behalf when you use the AWS
     *            Command Line Interface (AWS CLI) or an AWS SDK.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to
     * ensure idempotent creation. This string is automatically filled on your
     * behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS
     * SDK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            (Optional) A string of up to 64 ASCII characters that Amazon
     *            FSx uses to ensure idempotent creation. This string is
     *            automatically filled on your behalf when you use the AWS
     *            Command Line Interface (AWS CLI) or an AWS SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the backup at backup creation. The key value of the
     * <code>Name</code> tag appears in the console as the backup name.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the backup at backup creation. The key value
     *         of the <code>Name</code> tag appears in the console as the backup
     *         name.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the backup at backup creation. The key value of the
     * <code>Name</code> tag appears in the console as the backup name.
     * </p>
     *
     * @param tags <p>
     *            The tags to apply to the backup at backup creation. The key
     *            value of the <code>Name</code> tag appears in the console as
     *            the backup name.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to apply to the backup at backup creation. The key value of the
     * <code>Name</code> tag appears in the console as the backup name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to apply to the backup at backup creation. The key
     *            value of the <code>Name</code> tag appears in the console as
     *            the backup name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the backup at backup creation. The key value of the
     * <code>Name</code> tag appears in the console as the backup name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to apply to the backup at backup creation. The key
     *            value of the <code>Name</code> tag appears in the console as
     *            the backup name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackupRequest == false)
            return false;
        CreateBackupRequest other = (CreateBackupRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
