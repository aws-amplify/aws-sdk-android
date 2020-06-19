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
package com.amazonaws.services.opsworks-cm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p> Describes backups. The results are ordered by time, with newest backups first. If you do not specify a BackupId or ServerName, the command returns all backups. </p> <p> This operation is synchronous. </p> <p> A <code>ResourceNotFoundException</code> is thrown when the backup does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid. </p>
 */
public class DescribeBackupsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>Describes a single backup. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     */
    private String backupId;

    /**
     * <p>Returns backups for the server with the specified ServerName. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String nextToken;

    /**
     * <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>Describes a single backup. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     *
     * @return <p>Describes a single backup. </p>
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * <p>Describes a single backup. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     *
     * @param backupId <p>Describes a single backup. </p>
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>Describes a single backup. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     *
     * @param backupId <p>Describes a single backup. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeBackupsRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * <p>Returns backups for the server with the specified ServerName. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>Returns backups for the server with the specified ServerName. </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>Returns backups for the server with the specified ServerName. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>Returns backups for the server with the specified ServerName. </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>Returns backups for the server with the specified ServerName. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>Returns backups for the server with the specified ServerName. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeBackupsRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nextToken <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nextToken <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeBackupsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>This is not currently implemented for <code>DescribeBackups</code> requests.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeBackupsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBackupId() != null) sb.append("BackupId: " + getBackupId() + ",");
        if (getServerName() != null) sb.append("ServerName: " + getServerName() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeBackupsRequest == false) return false;
        DescribeBackupsRequest other = (DescribeBackupsRequest)obj;

        if (other.getBackupId() == null ^ this.getBackupId() == null) return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false) return false;
        if (other.getServerName() == null ^ this.getServerName() == null) return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        return true;
    }
}
