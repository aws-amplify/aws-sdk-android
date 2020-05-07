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

public class GetActiveNamesResult implements Serializable {
    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     */
    private java.util.List<String> activeNames;

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
     * <code>GetActiveNames</code> request and specify the next page token using
     * the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     *
     * @return <p>
     *         The list of active names returned by the get active names
     *         request.
     *         </p>
     */
    public java.util.List<String> getActiveNames() {
        return activeNames;
    }

    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     *
     * @param activeNames <p>
     *            The list of active names returned by the get active names
     *            request.
     *            </p>
     */
    public void setActiveNames(java.util.Collection<String> activeNames) {
        if (activeNames == null) {
            this.activeNames = null;
            return;
        }

        this.activeNames = new java.util.ArrayList<String>(activeNames);
    }

    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeNames <p>
     *            The list of active names returned by the get active names
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetActiveNamesResult withActiveNames(String... activeNames) {
        if (getActiveNames() == null) {
            this.activeNames = new java.util.ArrayList<String>(activeNames.length);
        }
        for (String value : activeNames) {
            this.activeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of active names returned by the get active names request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeNames <p>
     *            The list of active names returned by the get active names
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetActiveNamesResult withActiveNames(java.util.Collection<String> activeNames) {
        setActiveNames(activeNames);
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
     * <code>GetActiveNames</code> request and specify the next page token using
     * the <code>pageToken</code> parameter.
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
     *         <code>GetActiveNames</code> request and specify the next page
     *         token using the <code>pageToken</code> parameter.
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
     * <code>GetActiveNames</code> request and specify the next page token using
     * the <code>pageToken</code> parameter.
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
     *            <code>GetActiveNames</code> request and specify the next page
     *            token using the <code>pageToken</code> parameter.
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
     * <code>GetActiveNames</code> request and specify the next page token using
     * the <code>pageToken</code> parameter.
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
     *            <code>GetActiveNames</code> request and specify the next page
     *            token using the <code>pageToken</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetActiveNamesResult withNextPageToken(String nextPageToken) {
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
        if (getActiveNames() != null)
            sb.append("activeNames: " + getActiveNames() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActiveNames() == null) ? 0 : getActiveNames().hashCode());
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

        if (obj instanceof GetActiveNamesResult == false)
            return false;
        GetActiveNamesResult other = (GetActiveNamesResult) obj;

        if (other.getActiveNames() == null ^ this.getActiveNames() == null)
            return false;
        if (other.getActiveNames() != null
                && other.getActiveNames().equals(this.getActiveNames()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
