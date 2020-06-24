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
 * Returns the description of specific Amazon FSx backups, if a
 * <code>BackupIds</code> value is provided for that backup. Otherwise, it
 * returns all backups owned by your AWS account in the AWS Region of the
 * endpoint that you're calling.
 * </p>
 * <p>
 * When retrieving all backups, you can optionally specify the
 * <code>MaxResults</code> parameter to limit the number of backups in a
 * response. If more backups remain, Amazon FSx returns a <code>NextToken</code>
 * value in the response. In this case, send a later request with the
 * <code>NextToken</code> request parameter set to the value of
 * <code>NextToken</code> from the last response.
 * </p>
 * <p>
 * This action is used in an iterative process to retrieve a list of your
 * backups. <code>DescribeBackups</code> is called first without a
 * <code>NextToken</code>value. Then the action continues to be called with the
 * <code>NextToken</code> parameter set to the value of the last
 * <code>NextToken</code> value until a response has no <code>NextToken</code>.
 * </p>
 * <p>
 * When using this action, keep the following in mind:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The implementation might return fewer than <code>MaxResults</code> file
 * system descriptions while still including a <code>NextToken</code> value.
 * </p>
 * </li>
 * <li>
 * <p>
 * The order of backups returned in the response of one
 * <code>DescribeBackups</code> call and the order of backups returned across
 * the responses of a multi-call iteration is unspecified.
 * </p>
 * </li>
 * </ul>
 */
public class DescribeBackupsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * IDs of the backups you want to retrieve (String). This overrides any
     * filters. If any IDs are not found, BackupNotFound will be thrown.
     * </p>
     */
    private java.util.List<String> backupIds;

    /**
     * <p>
     * Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * Maximum number of backups to return in the response (integer). This
     * parameter value must be greater than 0. The number of items that Amazon
     * FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of
     * items per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Opaque pagination token returned from a previous
     * <code>DescribeBackups</code> operation (String). If a token present, the
     * action continues the list from where the returning call left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * IDs of the backups you want to retrieve (String). This overrides any
     * filters. If any IDs are not found, BackupNotFound will be thrown.
     * </p>
     *
     * @return <p>
     *         IDs of the backups you want to retrieve (String). This overrides
     *         any filters. If any IDs are not found, BackupNotFound will be
     *         thrown.
     *         </p>
     */
    public java.util.List<String> getBackupIds() {
        return backupIds;
    }

    /**
     * <p>
     * IDs of the backups you want to retrieve (String). This overrides any
     * filters. If any IDs are not found, BackupNotFound will be thrown.
     * </p>
     *
     * @param backupIds <p>
     *            IDs of the backups you want to retrieve (String). This
     *            overrides any filters. If any IDs are not found,
     *            BackupNotFound will be thrown.
     *            </p>
     */
    public void setBackupIds(java.util.Collection<String> backupIds) {
        if (backupIds == null) {
            this.backupIds = null;
            return;
        }

        this.backupIds = new java.util.ArrayList<String>(backupIds);
    }

    /**
     * <p>
     * IDs of the backups you want to retrieve (String). This overrides any
     * filters. If any IDs are not found, BackupNotFound will be thrown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupIds <p>
     *            IDs of the backups you want to retrieve (String). This
     *            overrides any filters. If any IDs are not found,
     *            BackupNotFound will be thrown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupsRequest withBackupIds(String... backupIds) {
        if (getBackupIds() == null) {
            this.backupIds = new java.util.ArrayList<String>(backupIds.length);
        }
        for (String value : backupIds) {
            this.backupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * IDs of the backups you want to retrieve (String). This overrides any
     * filters. If any IDs are not found, BackupNotFound will be thrown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupIds <p>
     *            IDs of the backups you want to retrieve (String). This
     *            overrides any filters. If any IDs are not found,
     *            BackupNotFound will be thrown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupsRequest withBackupIds(java.util.Collection<String> backupIds) {
        setBackupIds(backupIds);
        return this;
    }

    /**
     * <p>
     * Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     *
     * @return <p>
     *         Filters structure. Supported names are file-system-id and
     *         backup-type.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     *
     * @param filters <p>
     *            Filters structure. Supported names are file-system-id and
     *            backup-type.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters structure. Supported names are file-system-id and
     *            backup-type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters structure. Supported names are file-system-id and
     *            backup-type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Maximum number of backups to return in the response (integer). This
     * parameter value must be greater than 0. The number of items that Amazon
     * FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of
     * items per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return <p>
     *         Maximum number of backups to return in the response (integer).
     *         This parameter value must be greater than 0. The number of items
     *         that Amazon FSx returns is the minimum of the
     *         <code>MaxResults</code> parameter specified in the request and
     *         the service's internal maximum number of items per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Maximum number of backups to return in the response (integer). This
     * parameter value must be greater than 0. The number of items that Amazon
     * FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of
     * items per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param maxResults <p>
     *            Maximum number of backups to return in the response (integer).
     *            This parameter value must be greater than 0. The number of
     *            items that Amazon FSx returns is the minimum of the
     *            <code>MaxResults</code> parameter specified in the request and
     *            the service's internal maximum number of items per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of backups to return in the response (integer). This
     * parameter value must be greater than 0. The number of items that Amazon
     * FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of
     * items per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param maxResults <p>
     *            Maximum number of backups to return in the response (integer).
     *            This parameter value must be greater than 0. The number of
     *            items that Amazon FSx returns is the minimum of the
     *            <code>MaxResults</code> parameter specified in the request and
     *            the service's internal maximum number of items per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous
     * <code>DescribeBackups</code> operation (String). If a token present, the
     * action continues the list from where the returning call left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @return <p>
     *         Opaque pagination token returned from a previous
     *         <code>DescribeBackups</code> operation (String). If a token
     *         present, the action continues the list from where the returning
     *         call left off.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous
     * <code>DescribeBackups</code> operation (String). If a token present, the
     * action continues the list from where the returning call left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            Opaque pagination token returned from a previous
     *            <code>DescribeBackups</code> operation (String). If a token
     *            present, the action continues the list from where the
     *            returning call left off.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous
     * <code>DescribeBackups</code> operation (String). If a token present, the
     * action continues the list from where the returning call left off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            Opaque pagination token returned from a previous
     *            <code>DescribeBackups</code> operation (String). If a token
     *            present, the action continues the list from where the
     *            returning call left off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getBackupIds() != null)
            sb.append("BackupIds: " + getBackupIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupIds() == null) ? 0 : getBackupIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBackupsRequest == false)
            return false;
        DescribeBackupsRequest other = (DescribeBackupsRequest) obj;

        if (other.getBackupIds() == null ^ this.getBackupIds() == null)
            return false;
        if (other.getBackupIds() != null
                && other.getBackupIds().equals(this.getBackupIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
