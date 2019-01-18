/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class DescribeThingGroupResult implements Serializable {
    /**
     * <p>
     * The name of the thing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingGroupName;

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String thingGroupId;

    /**
     * <p>
     * The thing group ARN.
     * </p>
     */
    private String thingGroupArn;

    /**
     * <p>
     * The version of the thing group.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The thing group properties.
     * </p>
     */
    private ThingGroupProperties thingGroupProperties;

    /**
     * <p>
     * Thing group metadata.
     * </p>
     */
    private ThingGroupMetadata thingGroupMetadata;

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String queryString;

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     */
    private String queryVersion;

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     */
    private String status;

    /**
     * <p>
     * The name of the thing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing group.
     *         </p>
     */
    public String getThingGroupName() {
        return thingGroupName;
    }

    /**
     * <p>
     * The name of the thing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The name of the thing group.
     *            </p>
     */
    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The name of the thing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The name of the thing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingGroupResult withThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
        return this;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The thing group ID.
     *         </p>
     */
    public String getThingGroupId() {
        return thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param thingGroupId <p>
     *            The thing group ID.
     *            </p>
     */
    public void setThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param thingGroupId <p>
     *            The thing group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingGroupResult withThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
        return this;
    }

    /**
     * <p>
     * The thing group ARN.
     * </p>
     *
     * @return <p>
     *         The thing group ARN.
     *         </p>
     */
    public String getThingGroupArn() {
        return thingGroupArn;
    }

    /**
     * <p>
     * The thing group ARN.
     * </p>
     *
     * @param thingGroupArn <p>
     *            The thing group ARN.
     *            </p>
     */
    public void setThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
    }

    /**
     * <p>
     * The thing group ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupArn <p>
     *            The thing group ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingGroupResult withThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
        return this;
    }

    /**
     * <p>
     * The version of the thing group.
     * </p>
     *
     * @return <p>
     *         The version of the thing group.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the thing group.
     * </p>
     *
     * @param version <p>
     *            The version of the thing group.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the thing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the thing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingGroupResult withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The thing group properties.
     * </p>
     *
     * @return <p>
     *         The thing group properties.
     *         </p>
     */
    public ThingGroupProperties getThingGroupProperties() {
        return thingGroupProperties;
    }

    /**
     * <p>
     * The thing group properties.
     * </p>
     *
     * @param thingGroupProperties <p>
     *            The thing group properties.
     *            </p>
     */
    public void setThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
    }

    /**
     * <p>
     * The thing group properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupProperties <p>
     *            The thing group properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingGroupResult withThingGroupProperties(
            ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
        return this;
    }

    /**
     * <p>
     * Thing group metadata.
     * </p>
     *
     * @return <p>
     *         Thing group metadata.
     *         </p>
     */
    public ThingGroupMetadata getThingGroupMetadata() {
        return thingGroupMetadata;
    }

    /**
     * <p>
     * Thing group metadata.
     * </p>
     *
     * @param thingGroupMetadata <p>
     *            Thing group metadata.
     *            </p>
     */
    public void setThingGroupMetadata(ThingGroupMetadata thingGroupMetadata) {
        this.thingGroupMetadata = thingGroupMetadata;
    }

    /**
     * <p>
     * Thing group metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupMetadata <p>
     *            Thing group metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingGroupResult withThingGroupMetadata(ThingGroupMetadata thingGroupMetadata) {
        this.thingGroupMetadata = thingGroupMetadata;
        return this;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The dynamic thing group index name.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param indexName <p>
     *            The dynamic thing group index name.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param indexName <p>
     *            The dynamic thing group index name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingGroupResult withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The dynamic thing group search query string.
     *         </p>
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param queryString <p>
     *            The dynamic thing group search query string.
     *            </p>
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param queryString <p>
     *            The dynamic thing group search query string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingGroupResult withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     *
     * @return <p>
     *         The dynamic thing group query version.
     *         </p>
     */
    public String getQueryVersion() {
        return queryVersion;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     *
     * @param queryVersion <p>
     *            The dynamic thing group query version.
     *            </p>
     */
    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryVersion <p>
     *            The dynamic thing group query version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingGroupResult withQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
        return this;
    }

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @return <p>
     *         The dynamic thing group status.
     *         </p>
     * @see DynamicGroupStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @param status <p>
     *            The dynamic thing group status.
     *            </p>
     * @see DynamicGroupStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @param status <p>
     *            The dynamic thing group status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DynamicGroupStatus
     */
    public DescribeThingGroupResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @param status <p>
     *            The dynamic thing group status.
     *            </p>
     * @see DynamicGroupStatus
     */
    public void setStatus(DynamicGroupStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @param status <p>
     *            The dynamic thing group status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DynamicGroupStatus
     */
    public DescribeThingGroupResult withStatus(DynamicGroupStatus status) {
        this.status = status.toString();
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
        if (getThingGroupName() != null)
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        if (getThingGroupId() != null)
            sb.append("thingGroupId: " + getThingGroupId() + ",");
        if (getThingGroupArn() != null)
            sb.append("thingGroupArn: " + getThingGroupArn() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getThingGroupProperties() != null)
            sb.append("thingGroupProperties: " + getThingGroupProperties() + ",");
        if (getThingGroupMetadata() != null)
            sb.append("thingGroupMetadata: " + getThingGroupMetadata() + ",");
        if (getIndexName() != null)
            sb.append("indexName: " + getIndexName() + ",");
        if (getQueryString() != null)
            sb.append("queryString: " + getQueryString() + ",");
        if (getQueryVersion() != null)
            sb.append("queryVersion: " + getQueryVersion() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupId() == null) ? 0 : getThingGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupArn() == null) ? 0 : getThingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupProperties() == null) ? 0 : getThingGroupProperties().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupMetadata() == null) ? 0 : getThingGroupMetadata().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThingGroupResult == false)
            return false;
        DescribeThingGroupResult other = (DescribeThingGroupResult) obj;

        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null
                && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupId() == null ^ this.getThingGroupId() == null)
            return false;
        if (other.getThingGroupId() != null
                && other.getThingGroupId().equals(this.getThingGroupId()) == false)
            return false;
        if (other.getThingGroupArn() == null ^ this.getThingGroupArn() == null)
            return false;
        if (other.getThingGroupArn() != null
                && other.getThingGroupArn().equals(this.getThingGroupArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getThingGroupProperties() == null ^ this.getThingGroupProperties() == null)
            return false;
        if (other.getThingGroupProperties() != null
                && other.getThingGroupProperties().equals(this.getThingGroupProperties()) == false)
            return false;
        if (other.getThingGroupMetadata() == null ^ this.getThingGroupMetadata() == null)
            return false;
        if (other.getThingGroupMetadata() != null
                && other.getThingGroupMetadata().equals(this.getThingGroupMetadata()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getQueryVersion() == null ^ this.getQueryVersion() == null)
            return false;
        if (other.getQueryVersion() != null
                && other.getQueryVersion().equals(this.getQueryVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
