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

public class GetRelationalDatabaseBundlesResult implements Serializable {
    /**
     * <p>
     * An object describing the result of your get relational database bundles
     * request.
     * </p>
     */
    private java.util.List<RelationalDatabaseBundle> bundles;

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetRelationalDatabaseBundles</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An object describing the result of your get relational database bundles
     * request.
     * </p>
     *
     * @return <p>
     *         An object describing the result of your get relational database
     *         bundles request.
     *         </p>
     */
    public java.util.List<RelationalDatabaseBundle> getBundles() {
        return bundles;
    }

    /**
     * <p>
     * An object describing the result of your get relational database bundles
     * request.
     * </p>
     *
     * @param bundles <p>
     *            An object describing the result of your get relational
     *            database bundles request.
     *            </p>
     */
    public void setBundles(java.util.Collection<RelationalDatabaseBundle> bundles) {
        if (bundles == null) {
            this.bundles = null;
            return;
        }

        this.bundles = new java.util.ArrayList<RelationalDatabaseBundle>(bundles);
    }

    /**
     * <p>
     * An object describing the result of your get relational database bundles
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundles <p>
     *            An object describing the result of your get relational
     *            database bundles request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseBundlesResult withBundles(RelationalDatabaseBundle... bundles) {
        if (getBundles() == null) {
            this.bundles = new java.util.ArrayList<RelationalDatabaseBundle>(bundles.length);
        }
        for (RelationalDatabaseBundle value : bundles) {
            this.bundles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database bundles
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundles <p>
     *            An object describing the result of your get relational
     *            database bundles request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseBundlesResult withBundles(
            java.util.Collection<RelationalDatabaseBundle> bundles) {
        setBundles(bundles);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetRelationalDatabaseBundles</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of resutls from your
     *         request.
     *         </p>
     *         <p>
     *         A next page token is not returned if there are no more results to
     *         display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another
     *         <code>GetRelationalDatabaseBundles</code> request and specify the
     *         next page token using the <code>pageToken</code> parameter.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetRelationalDatabaseBundles</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetRelationalDatabaseBundles</code> request and specify
     *            the next page token using the <code>pageToken</code>
     *            parameter.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetRelationalDatabaseBundles</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetRelationalDatabaseBundles</code> request and specify
     *            the next page token using the <code>pageToken</code>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseBundlesResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getBundles() != null)
            sb.append("bundles: " + getBundles() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundles() == null) ? 0 : getBundles().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseBundlesResult == false)
            return false;
        GetRelationalDatabaseBundlesResult other = (GetRelationalDatabaseBundlesResult) obj;

        if (other.getBundles() == null ^ this.getBundles() == null)
            return false;
        if (other.getBundles() != null && other.getBundles().equals(this.getBundles()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
