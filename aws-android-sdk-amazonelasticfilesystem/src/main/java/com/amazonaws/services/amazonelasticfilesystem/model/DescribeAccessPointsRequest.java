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
 * Returns the description of a specific Amazon EFS access point if the
 * <code>AccessPointId</code> is provided. If you provide an EFS
 * <code>FileSystemId</code>, it returns descriptions of all access points for
 * that file system. You can provide either an <code>AccessPointId</code> or a
 * <code>FileSystemId</code> in the request, but not both.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DescribeAccessPoints</code> action.
 * </p>
 */
public class DescribeAccessPointsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * (Optional) When retrieving all access points for a file system, you can
     * optionally specify the <code>MaxItems</code> parameter to limit the
     * number of objects returned in a response. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can
     * use <code>NextMarker</code> in the subsequent request to fetch the next
     * page of access point descriptions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * (Optional) Specifies an EFS access point to describe in the response;
     * mutually exclusive with <code>FileSystemId</code>.
     * </p>
     */
    private String accessPointId;

    /**
     * <p>
     * (Optional) If you provide a <code>FileSystemId</code>, EFS returns all
     * access points for that file system; mutually exclusive with
     * <code>AccessPointId</code>.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * (Optional) When retrieving all access points for a file system, you can
     * optionally specify the <code>MaxItems</code> parameter to limit the
     * number of objects returned in a response. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         (Optional) When retrieving all access points for a file system,
     *         you can optionally specify the <code>MaxItems</code> parameter to
     *         limit the number of objects returned in a response. The default
     *         value is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * (Optional) When retrieving all access points for a file system, you can
     * optionally specify the <code>MaxItems</code> parameter to limit the
     * number of objects returned in a response. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            (Optional) When retrieving all access points for a file
     *            system, you can optionally specify the <code>MaxItems</code>
     *            parameter to limit the number of objects returned in a
     *            response. The default value is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) When retrieving all access points for a file system, you can
     * optionally specify the <code>MaxItems</code> parameter to limit the
     * number of objects returned in a response. The default value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            (Optional) When retrieving all access points for a file
     *            system, you can optionally specify the <code>MaxItems</code>
     *            parameter to limit the number of objects returned in a
     *            response. The default value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPointsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can
     * use <code>NextMarker</code> in the subsequent request to fetch the next
     * page of access point descriptions.
     * </p>
     *
     * @return <p>
     *         <code>NextToken</code> is present if the response is paginated.
     *         You can use <code>NextMarker</code> in the subsequent request to
     *         fetch the next page of access point descriptions.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can
     * use <code>NextMarker</code> in the subsequent request to fetch the next
     * page of access point descriptions.
     * </p>
     *
     * @param nextToken <p>
     *            <code>NextToken</code> is present if the response is
     *            paginated. You can use <code>NextMarker</code> in the
     *            subsequent request to fetch the next page of access point
     *            descriptions.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can
     * use <code>NextMarker</code> in the subsequent request to fetch the next
     * page of access point descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            <code>NextToken</code> is present if the response is
     *            paginated. You can use <code>NextMarker</code> in the
     *            subsequent request to fetch the next page of access point
     *            descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPointsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies an EFS access point to describe in the response;
     * mutually exclusive with <code>FileSystemId</code>.
     * </p>
     *
     * @return <p>
     *         (Optional) Specifies an EFS access point to describe in the
     *         response; mutually exclusive with <code>FileSystemId</code>.
     *         </p>
     */
    public String getAccessPointId() {
        return accessPointId;
    }

    /**
     * <p>
     * (Optional) Specifies an EFS access point to describe in the response;
     * mutually exclusive with <code>FileSystemId</code>.
     * </p>
     *
     * @param accessPointId <p>
     *            (Optional) Specifies an EFS access point to describe in the
     *            response; mutually exclusive with <code>FileSystemId</code>.
     *            </p>
     */
    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * <p>
     * (Optional) Specifies an EFS access point to describe in the response;
     * mutually exclusive with <code>FileSystemId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPointId <p>
     *            (Optional) Specifies an EFS access point to describe in the
     *            response; mutually exclusive with <code>FileSystemId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPointsRequest withAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }

    /**
     * <p>
     * (Optional) If you provide a <code>FileSystemId</code>, EFS returns all
     * access points for that file system; mutually exclusive with
     * <code>AccessPointId</code>.
     * </p>
     *
     * @return <p>
     *         (Optional) If you provide a <code>FileSystemId</code>, EFS
     *         returns all access points for that file system; mutually
     *         exclusive with <code>AccessPointId</code>.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * (Optional) If you provide a <code>FileSystemId</code>, EFS returns all
     * access points for that file system; mutually exclusive with
     * <code>AccessPointId</code>.
     * </p>
     *
     * @param fileSystemId <p>
     *            (Optional) If you provide a <code>FileSystemId</code>, EFS
     *            returns all access points for that file system; mutually
     *            exclusive with <code>AccessPointId</code>.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * (Optional) If you provide a <code>FileSystemId</code>, EFS returns all
     * access points for that file system; mutually exclusive with
     * <code>AccessPointId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            (Optional) If you provide a <code>FileSystemId</code>, EFS
     *            returns all access points for that file system; mutually
     *            exclusive with <code>AccessPointId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPointsRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getAccessPointId() != null)
            sb.append("AccessPointId: " + getAccessPointId() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPointId() == null) ? 0 : getAccessPointId().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccessPointsRequest == false)
            return false;
        DescribeAccessPointsRequest other = (DescribeAccessPointsRequest) obj;

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
        if (other.getAccessPointId() == null ^ this.getAccessPointId() == null)
            return false;
        if (other.getAccessPointId() != null
                && other.getAccessPointId().equals(this.getAccessPointId()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        return true;
    }
}
