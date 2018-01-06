/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Returns a list of import jobs for a specific segment.
 */
public class GetSegmentImportJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the applicationId property for this object.
     */
    private String applicationId;

    /**
     * The number of entries you want on each page in the response.
     */
    private String pageSize;

    /**
     * The new value for the segmentId property for this object.
     */
    private String segmentId;

    /**
     * The NextToken string returned on a previous page that you use to get the
     * next page of results in a paginated response.
     */
    private String token;

    /**
     * Returns the value of the applicationId property for this object.
     *
     * @return The value of the applicationId property for this object.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of applicationId
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the value of the applicationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentImportJobsRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * The number of entries you want on each page in the response.
     *
     * @return The number of entries you want on each page in the response.
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * The number of entries you want on each page in the response.
     *
     * @param pageSize The number of entries you want on each page in the
     *            response.
     */
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * The number of entries you want on each page in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageSize The number of entries you want on each page in the
     *            response.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentImportJobsRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Returns the value of the segmentId property for this object.
     *
     * @return The value of the segmentId property for this object.
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of segmentId
     *
     * @param segmentId The new value for the segmentId property for this
     *            object.
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * Sets the value of the segmentId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentId The new value for the segmentId property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentImportJobsRequest withSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * The NextToken string returned on a previous page that you use to get the
     * next page of results in a paginated response.
     *
     * @return The NextToken string returned on a previous page that you use to
     *         get the next page of results in a paginated response.
     */
    public String getToken() {
        return token;
    }

    /**
     * The NextToken string returned on a previous page that you use to get the
     * next page of results in a paginated response.
     *
     * @param token The NextToken string returned on a previous page that you
     *            use to get the next page of results in a paginated response.
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * The NextToken string returned on a previous page that you use to get the
     * next page of results in a paginated response.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param token The NextToken string returned on a previous page that you
     *            use to get the next page of results in a paginated response.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentImportJobsRequest withToken(String token) {
        this.token = token;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getSegmentId() != null)
            sb.append("SegmentId: " + getSegmentId() + ",");
        if (getToken() != null)
            sb.append("Token: " + getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSegmentImportJobsRequest == false)
            return false;
        GetSegmentImportJobsRequest other = (GetSegmentImportJobsRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null
                && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }
}
