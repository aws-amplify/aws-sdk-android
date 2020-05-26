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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeLaunchTemplateVersionsResult implements Serializable {
    /**
     * <p>
     * Information about the launch template versions.
     * </p>
     */
    private java.util.List<LaunchTemplateVersion> launchTemplateVersions;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the launch template versions.
     * </p>
     *
     * @return <p>
     *         Information about the launch template versions.
     *         </p>
     */
    public java.util.List<LaunchTemplateVersion> getLaunchTemplateVersions() {
        return launchTemplateVersions;
    }

    /**
     * <p>
     * Information about the launch template versions.
     * </p>
     *
     * @param launchTemplateVersions <p>
     *            Information about the launch template versions.
     *            </p>
     */
    public void setLaunchTemplateVersions(
            java.util.Collection<LaunchTemplateVersion> launchTemplateVersions) {
        if (launchTemplateVersions == null) {
            this.launchTemplateVersions = null;
            return;
        }

        this.launchTemplateVersions = new java.util.ArrayList<LaunchTemplateVersion>(
                launchTemplateVersions);
    }

    /**
     * <p>
     * Information about the launch template versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateVersions <p>
     *            Information about the launch template versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsResult withLaunchTemplateVersions(
            LaunchTemplateVersion... launchTemplateVersions) {
        if (getLaunchTemplateVersions() == null) {
            this.launchTemplateVersions = new java.util.ArrayList<LaunchTemplateVersion>(
                    launchTemplateVersions.length);
        }
        for (LaunchTemplateVersion value : launchTemplateVersions) {
            this.launchTemplateVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the launch template versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateVersions <p>
     *            Information about the launch template versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsResult withLaunchTemplateVersions(
            java.util.Collection<LaunchTemplateVersion> launchTemplateVersions) {
        setLaunchTemplateVersions(launchTemplateVersions);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsResult withNextToken(String nextToken) {
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
        if (getLaunchTemplateVersions() != null)
            sb.append("LaunchTemplateVersions: " + getLaunchTemplateVersions() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLaunchTemplateVersions() == null) ? 0 : getLaunchTemplateVersions()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLaunchTemplateVersionsResult == false)
            return false;
        DescribeLaunchTemplateVersionsResult other = (DescribeLaunchTemplateVersionsResult) obj;

        if (other.getLaunchTemplateVersions() == null ^ this.getLaunchTemplateVersions() == null)
            return false;
        if (other.getLaunchTemplateVersions() != null
                && other.getLaunchTemplateVersions().equals(this.getLaunchTemplateVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
