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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class ListLaunchPathsResult implements Serializable {
    /**
     * <p>
     * Information about the launch path.
     * </p>
     */
    private java.util.List<LaunchPathSummary> launchPathSummaries;

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about the launch path.
     * </p>
     *
     * @return <p>
     *         Information about the launch path.
     *         </p>
     */
    public java.util.List<LaunchPathSummary> getLaunchPathSummaries() {
        return launchPathSummaries;
    }

    /**
     * <p>
     * Information about the launch path.
     * </p>
     *
     * @param launchPathSummaries <p>
     *            Information about the launch path.
     *            </p>
     */
    public void setLaunchPathSummaries(java.util.Collection<LaunchPathSummary> launchPathSummaries) {
        if (launchPathSummaries == null) {
            this.launchPathSummaries = null;
            return;
        }

        this.launchPathSummaries = new java.util.ArrayList<LaunchPathSummary>(launchPathSummaries);
    }

    /**
     * <p>
     * Information about the launch path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchPathSummaries <p>
     *            Information about the launch path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLaunchPathsResult withLaunchPathSummaries(LaunchPathSummary... launchPathSummaries) {
        if (getLaunchPathSummaries() == null) {
            this.launchPathSummaries = new java.util.ArrayList<LaunchPathSummary>(
                    launchPathSummaries.length);
        }
        for (LaunchPathSummary value : launchPathSummaries) {
            this.launchPathSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the launch path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchPathSummaries <p>
     *            Information about the launch path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLaunchPathsResult withLaunchPathSummaries(
            java.util.Collection<LaunchPathSummary> launchPathSummaries) {
        setLaunchPathSummaries(launchPathSummaries);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token to use to retrieve the next set of results. If
     *         there are no additional results, this value is null.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLaunchPathsResult withNextPageToken(String nextPageToken) {
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
        if (getLaunchPathSummaries() != null)
            sb.append("LaunchPathSummaries: " + getLaunchPathSummaries() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLaunchPathSummaries() == null) ? 0 : getLaunchPathSummaries().hashCode());
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

        if (obj instanceof ListLaunchPathsResult == false)
            return false;
        ListLaunchPathsResult other = (ListLaunchPathsResult) obj;

        if (other.getLaunchPathSummaries() == null ^ this.getLaunchPathSummaries() == null)
            return false;
        if (other.getLaunchPathSummaries() != null
                && other.getLaunchPathSummaries().equals(this.getLaunchPathSummaries()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
