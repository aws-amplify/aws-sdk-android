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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the devices.
 * </p>
 */
public class ListDevicesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The access tokens for the request to list devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * <p>
     * The limit of the device request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 60<br/>
     */
    private Integer limit;

    /**
     * <p>
     * The pagination token for the list request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * The access tokens for the request to list devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The access tokens for the request to list devices.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * The access tokens for the request to list devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access tokens for the request to list devices.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access tokens for the request to list devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access tokens for the request to list devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDevicesRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * <p>
     * The limit of the device request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 60<br/>
     *
     * @return <p>
     *         The limit of the device request.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The limit of the device request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 60<br/>
     *
     * @param limit <p>
     *            The limit of the device request.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The limit of the device request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 60<br/>
     *
     * @param limit <p>
     *            The limit of the device request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDevicesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * The pagination token for the list request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The pagination token for the list request.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * The pagination token for the list request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            The pagination token for the list request.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * The pagination token for the list request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            The pagination token for the list request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDevicesRequest withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
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
        if (getAccessToken() != null)
            sb.append("AccessToken: " + getAccessToken() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicesRequest == false)
            return false;
        ListDevicesRequest other = (ListDevicesRequest) obj;

        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }
}
