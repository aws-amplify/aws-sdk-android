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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Returns information about your apps.
 */
public class GetAppsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The number of entries you want on each page in the response.
     */
    private String pageSize;

    /**
     * The NextToken string returned on a previous page that you use to get the
     * next page of results in a paginated response.
     */
    private String token;

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
    public GetAppsRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
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
    public GetAppsRequest withToken(String token) {
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
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getToken() != null)
            sb.append("Token: " + getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppsRequest == false)
            return false;
        GetAppsRequest other = (GetAppsRequest) obj;

        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }
}
