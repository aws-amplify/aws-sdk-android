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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists your resource data sync configurations. Includes information about the
 * last time a sync attempted to start, the last sync status, and the last time
 * a sync successfully completed.
 * </p>
 * <p>
 * The number of sync configurations might be too large to return using a single
 * call to <code>ListResourceDataSync</code>. You can limit the number of sync
 * configurations returned by using the <code>MaxResults</code> parameter. To
 * determine whether there are more sync configurations to list, check the value
 * of <code>NextToken</code> in the output. If there are more sync
 * configurations to list, you can request them by specifying the
 * <code>NextToken</code> returned in the call to the parameter of a subsequent
 * call.
 * </p>
 */
public class ListResourceDataSyncRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * View a list of resource data syncs according to the sync type. Specify
     * <code>SyncToDestination</code> to view resource data syncs that
     * synchronize data to an Amazon S3 buckets. Specify
     * <code>SyncFromSource</code> to view resource data syncs from AWS
     * Organizations or from multiple AWS Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncType;

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * View a list of resource data syncs according to the sync type. Specify
     * <code>SyncToDestination</code> to view resource data syncs that
     * synchronize data to an Amazon S3 buckets. Specify
     * <code>SyncFromSource</code> to view resource data syncs from AWS
     * Organizations or from multiple AWS Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         View a list of resource data syncs according to the sync type.
     *         Specify <code>SyncToDestination</code> to view resource data
     *         syncs that synchronize data to an Amazon S3 buckets. Specify
     *         <code>SyncFromSource</code> to view resource data syncs from AWS
     *         Organizations or from multiple AWS Regions.
     *         </p>
     */
    public String getSyncType() {
        return syncType;
    }

    /**
     * <p>
     * View a list of resource data syncs according to the sync type. Specify
     * <code>SyncToDestination</code> to view resource data syncs that
     * synchronize data to an Amazon S3 buckets. Specify
     * <code>SyncFromSource</code> to view resource data syncs from AWS
     * Organizations or from multiple AWS Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>
     *            View a list of resource data syncs according to the sync type.
     *            Specify <code>SyncToDestination</code> to view resource data
     *            syncs that synchronize data to an Amazon S3 buckets. Specify
     *            <code>SyncFromSource</code> to view resource data syncs from
     *            AWS Organizations or from multiple AWS Regions.
     *            </p>
     */
    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * View a list of resource data syncs according to the sync type. Specify
     * <code>SyncToDestination</code> to view resource data syncs that
     * synchronize data to an Amazon S3 buckets. Specify
     * <code>SyncFromSource</code> to view resource data syncs from AWS
     * Organizations or from multiple AWS Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>
     *            View a list of resource data syncs according to the sync type.
     *            Specify <code>SyncToDestination</code> to view resource data
     *            syncs that synchronize data to an Amazon S3 buckets. Specify
     *            <code>SyncFromSource</code> to view resource data syncs from
     *            AWS Organizations or from multiple AWS Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceDataSyncRequest withSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     *
     * @return <p>
     *         A token to start the list. Use this token to get the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token to start the list. Use this token to get the next set
     *            of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to start the list. Use this token to get the next set
     *            of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceDataSyncRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceDataSyncRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getSyncType() != null)
            sb.append("SyncType: " + getSyncType() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceDataSyncRequest == false)
            return false;
        ListResourceDataSyncRequest other = (ListResourceDataSyncRequest) obj;

        if (other.getSyncType() == null ^ this.getSyncType() == null)
            return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
