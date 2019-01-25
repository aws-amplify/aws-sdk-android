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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

/**
 * <p>
 * Response for ListPlatformApplications action.
 * </p>
 */
public class ListPlatformApplicationsResult implements Serializable {
    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     */
    private java.util.List<PlatformApplication> platformApplications = new java.util.ArrayList<PlatformApplication>();

    /**
     * <p>
     * NextToken string is returned when calling ListPlatformApplications action
     * if additional records are available after the first page results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     *
     * @return <p>
     *         Platform applications returned when calling
     *         ListPlatformApplications action.
     *         </p>
     */
    public java.util.List<PlatformApplication> getPlatformApplications() {
        return platformApplications;
    }

    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     *
     * @param platformApplications <p>
     *            Platform applications returned when calling
     *            ListPlatformApplications action.
     *            </p>
     */
    public void setPlatformApplications(
            java.util.Collection<PlatformApplication> platformApplications) {
        if (platformApplications == null) {
            this.platformApplications = null;
            return;
        }

        this.platformApplications = new java.util.ArrayList<PlatformApplication>(
                platformApplications);
    }

    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformApplications <p>
     *            Platform applications returned when calling
     *            ListPlatformApplications action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformApplicationsResult withPlatformApplications(
            PlatformApplication... platformApplications) {
        if (getPlatformApplications() == null) {
            this.platformApplications = new java.util.ArrayList<PlatformApplication>(
                    platformApplications.length);
        }
        for (PlatformApplication value : platformApplications) {
            this.platformApplications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformApplications <p>
     *            Platform applications returned when calling
     *            ListPlatformApplications action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformApplicationsResult withPlatformApplications(
            java.util.Collection<PlatformApplication> platformApplications) {
        setPlatformApplications(platformApplications);
        return this;
    }

    /**
     * <p>
     * NextToken string is returned when calling ListPlatformApplications action
     * if additional records are available after the first page results.
     * </p>
     *
     * @return <p>
     *         NextToken string is returned when calling
     *         ListPlatformApplications action if additional records are
     *         available after the first page results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * NextToken string is returned when calling ListPlatformApplications action
     * if additional records are available after the first page results.
     * </p>
     *
     * @param nextToken <p>
     *            NextToken string is returned when calling
     *            ListPlatformApplications action if additional records are
     *            available after the first page results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken string is returned when calling ListPlatformApplications action
     * if additional records are available after the first page results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            NextToken string is returned when calling
     *            ListPlatformApplications action if additional records are
     *            available after the first page results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformApplicationsResult withNextToken(String nextToken) {
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
        if (getPlatformApplications() != null)
            sb.append("PlatformApplications: " + getPlatformApplications() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlatformApplications() == null) ? 0 : getPlatformApplications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlatformApplicationsResult == false)
            return false;
        ListPlatformApplicationsResult other = (ListPlatformApplicationsResult) obj;

        if (other.getPlatformApplications() == null ^ this.getPlatformApplications() == null)
            return false;
        if (other.getPlatformApplications() != null
                && other.getPlatformApplications().equals(this.getPlatformApplications()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
