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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns all of the runtime parameters offered by the underlying database
 * software, or engine, for a specific database in Amazon Lightsail.
 * </p>
 * <p>
 * In addition to the parameter names and values, this operation returns other
 * information about each parameter. This information includes whether changes
 * require a reboot, whether the parameter is modifiable, the allowed values,
 * and the data types.
 * </p>
 */
public class GetRelationalDatabaseParametersRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of your database for which to get parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String relationalDatabaseName;

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial
     * <code>GetRelationalDatabaseParameters</code> request. If your results are
     * paginated, the response will return a next page token that you can
     * specify as the page token in a subsequent request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The name of your database for which to get parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of your database for which to get parameters.
     *         </p>
     */
    public String getRelationalDatabaseName() {
        return relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to get parameters.
     *            </p>
     */
    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to get parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseParametersRequest withRelationalDatabaseName(
            String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial
     * <code>GetRelationalDatabaseParameters</code> request. If your results are
     * paginated, the response will return a next page token that you can
     * specify as the page token in a subsequent request.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of results from your
     *         request.
     *         </p>
     *         <p>
     *         To get a page token, perform an initial
     *         <code>GetRelationalDatabaseParameters</code> request. If your
     *         results are paginated, the response will return a next page token
     *         that you can specify as the page token in a subsequent request.
     *         </p>
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial
     * <code>GetRelationalDatabaseParameters</code> request. If your results are
     * paginated, the response will return a next page token that you can
     * specify as the page token in a subsequent request.
     * </p>
     *
     * @param pageToken <p>
     *            The token to advance to the next page of results from your
     *            request.
     *            </p>
     *            <p>
     *            To get a page token, perform an initial
     *            <code>GetRelationalDatabaseParameters</code> request. If your
     *            results are paginated, the response will return a next page
     *            token that you can specify as the page token in a subsequent
     *            request.
     *            </p>
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial
     * <code>GetRelationalDatabaseParameters</code> request. If your results are
     * paginated, the response will return a next page token that you can
     * specify as the page token in a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageToken <p>
     *            The token to advance to the next page of results from your
     *            request.
     *            </p>
     *            <p>
     *            To get a page token, perform an initial
     *            <code>GetRelationalDatabaseParameters</code> request. If your
     *            results are paginated, the response will return a next page
     *            token that you can specify as the page token in a subsequent
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseParametersRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
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
        if (getRelationalDatabaseName() != null)
            sb.append("relationalDatabaseName: " + getRelationalDatabaseName() + ",");
        if (getPageToken() != null)
            sb.append("pageToken: " + getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName()
                        .hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseParametersRequest == false)
            return false;
        GetRelationalDatabaseParametersRequest other = (GetRelationalDatabaseParametersRequest) obj;

        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null
                && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null
                && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }
}
