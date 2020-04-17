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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an application-level backup of a server. While the server is in the
 * <code>BACKING_UP</code> state, the server cannot be changed, and no
 * additional backup can be created.
 * </p>
 * <p>
 * Backups can be created for servers in <code>RUNNING</code>,
 * <code>HEALTHY</code>, and <code>UNHEALTHY</code> states. By default, you can
 * create a maximum of 50 manual backups.
 * </p>
 * <p>
 * This operation is asynchronous.
 * </p>
 * <p>
 * A <code>LimitExceededException</code> is thrown when the maximum number of
 * manual backups is reached. An <code>InvalidStateException</code> is thrown
 * when the server is not in any of the following states: RUNNING, HEALTHY, or
 * UNHEALTHY. A <code>ResourceNotFoundException</code> is thrown when the server
 * is not found. A <code>ValidationException</code> is thrown when parameters of
 * the request are not valid.
 * </p>
 */
public class CreateBackupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the server that you want to back up.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>
     * A user-defined description of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String description;

    /**
     * <p>
     * A map that contains tag keys and tag values to attach to an AWS
     * OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS
     * OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the server that you want to back up.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>
     *         The name of the server that you want to back up.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server that you want to back up.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server that you want to back up.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server that you want to back up.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server that you want to back up.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * A user-defined description of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         A user-defined description of the backup.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A user-defined description of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param description <p>
     *            A user-defined description of the backup.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-defined description of the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param description <p>
     *            A user-defined description of the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values to attach to an AWS
     * OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS
     * OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A map that contains tag keys and tag values to attach to an AWS
     *         OpsWorks-CM server backup.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key cannot be empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The key can be a maximum of 127 characters, and can contain only
     *         Unicode letters, numbers, or separators, or the following special
     *         characters: <code>+ - = . _ : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value can be a maximum 255 characters, and contain only
     *         Unicode letters, numbers, or separators, or the following special
     *         characters: <code>+ - = . _ : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Leading and trailing white spaces are trimmed from both the key
     *         and value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A maximum of 50 user-applied tags is allowed for tag-supported
     *         AWS OpsWorks-CM resources.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values to attach to an AWS
     * OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS
     * OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            A map that contains tag keys and tag values to attach to an
     *            AWS OpsWorks-CM server backup.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The key cannot be empty.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The key can be a maximum of 127 characters, and can contain
     *            only Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value can be a maximum 255 characters, and contain only
     *            Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Leading and trailing white spaces are trimmed from both the
     *            key and value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A maximum of 50 user-applied tags is allowed for tag-supported
     *            AWS OpsWorks-CM resources.
     *            </p>
     *            </li>
     *            </ul>
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
     * A map that contains tag keys and tag values to attach to an AWS
     * OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS
     * OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map that contains tag keys and tag values to attach to an
     *            AWS OpsWorks-CM server backup.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The key cannot be empty.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The key can be a maximum of 127 characters, and can contain
     *            only Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value can be a maximum 255 characters, and contain only
     *            Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Leading and trailing white spaces are trimmed from both the
     *            key and value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A maximum of 50 user-applied tags is allowed for tag-supported
     *            AWS OpsWorks-CM resources.
     *            </p>
     *            </li>
     *            </ul>
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
     * A map that contains tag keys and tag values to attach to an AWS
     * OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS
     * OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map that contains tag keys and tag values to attach to an
     *            AWS OpsWorks-CM server backup.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The key cannot be empty.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The key can be a maximum of 127 characters, and can contain
     *            only Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value can be a maximum 255 characters, and contain only
     *            Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Leading and trailing white spaces are trimmed from both the
     *            key and value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A maximum of 50 user-applied tags is allowed for tag-supported
     *            AWS OpsWorks-CM resources.
     *            </p>
     *            </li>
     *            </ul>
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
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
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

        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
