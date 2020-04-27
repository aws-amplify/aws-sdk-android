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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class ListAppsResult implements Serializable {
    /**
     * <p>
     * The list of apps.
     * </p>
     */
    private java.util.List<AppDetails> apps;

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of apps.
     * </p>
     *
     * @return <p>
     *         The list of apps.
     *         </p>
     */
    public java.util.List<AppDetails> getApps() {
        return apps;
    }

    /**
     * <p>
     * The list of apps.
     * </p>
     *
     * @param apps <p>
     *            The list of apps.
     *            </p>
     */
    public void setApps(java.util.Collection<AppDetails> apps) {
        if (apps == null) {
            this.apps = null;
            return;
        }

        this.apps = new java.util.ArrayList<AppDetails>(apps);
    }

    /**
     * <p>
     * The list of apps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apps <p>
     *            The list of apps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppsResult withApps(AppDetails... apps) {
        if (getApps() == null) {
            this.apps = new java.util.ArrayList<AppDetails>(apps.length);
        }
        for (AppDetails value : apps) {
            this.apps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of apps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apps <p>
     *            The list of apps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppsResult withApps(java.util.Collection<AppDetails> apps) {
        setApps(apps);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the previous response was truncated, you will receive this
     *         token. Use it in your next request to receive the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppsResult withNextToken(String nextToken) {
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
        if (getApps() != null)
            sb.append("Apps: " + getApps() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApps() == null) ? 0 : getApps().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppsResult == false)
            return false;
        ListAppsResult other = (ListAppsResult) obj;

        if (other.getApps() == null ^ this.getApps() == null)
            return false;
        if (other.getApps() != null && other.getApps().equals(this.getApps()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
