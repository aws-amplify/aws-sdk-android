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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Result message wrapping a list of application version descriptions.
 * </p>
 */
public class DescribeApplicationVersionsResult implements Serializable {
    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in
     * order of creation.
     * </p>
     */
    private java.util.List<ApplicationVersionDescription> applicationVersions;

    /**
     * <p>
     * In a paginated request, the token that you can pass in a subsequent
     * request to get the next response page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in
     * order of creation.
     * </p>
     *
     * @return <p>
     *         List of <code>ApplicationVersionDescription</code> objects sorted
     *         in order of creation.
     *         </p>
     */
    public java.util.List<ApplicationVersionDescription> getApplicationVersions() {
        return applicationVersions;
    }

    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in
     * order of creation.
     * </p>
     *
     * @param applicationVersions <p>
     *            List of <code>ApplicationVersionDescription</code> objects
     *            sorted in order of creation.
     *            </p>
     */
    public void setApplicationVersions(
            java.util.Collection<ApplicationVersionDescription> applicationVersions) {
        if (applicationVersions == null) {
            this.applicationVersions = null;
            return;
        }

        this.applicationVersions = new java.util.ArrayList<ApplicationVersionDescription>(
                applicationVersions);
    }

    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in
     * order of creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationVersions <p>
     *            List of <code>ApplicationVersionDescription</code> objects
     *            sorted in order of creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationVersionsResult withApplicationVersions(
            ApplicationVersionDescription... applicationVersions) {
        if (getApplicationVersions() == null) {
            this.applicationVersions = new java.util.ArrayList<ApplicationVersionDescription>(
                    applicationVersions.length);
        }
        for (ApplicationVersionDescription value : applicationVersions) {
            this.applicationVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in
     * order of creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationVersions <p>
     *            List of <code>ApplicationVersionDescription</code> objects
     *            sorted in order of creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationVersionsResult withApplicationVersions(
            java.util.Collection<ApplicationVersionDescription> applicationVersions) {
        setApplicationVersions(applicationVersions);
        return this;
    }

    /**
     * <p>
     * In a paginated request, the token that you can pass in a subsequent
     * request to get the next response page.
     * </p>
     *
     * @return <p>
     *         In a paginated request, the token that you can pass in a
     *         subsequent request to get the next response page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * In a paginated request, the token that you can pass in a subsequent
     * request to get the next response page.
     * </p>
     *
     * @param nextToken <p>
     *            In a paginated request, the token that you can pass in a
     *            subsequent request to get the next response page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * In a paginated request, the token that you can pass in a subsequent
     * request to get the next response page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            In a paginated request, the token that you can pass in a
     *            subsequent request to get the next response page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationVersionsResult withNextToken(String nextToken) {
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
        if (getApplicationVersions() != null)
            sb.append("ApplicationVersions: " + getApplicationVersions() + ",");
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
                + ((getApplicationVersions() == null) ? 0 : getApplicationVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationVersionsResult == false)
            return false;
        DescribeApplicationVersionsResult other = (DescribeApplicationVersionsResult) obj;

        if (other.getApplicationVersions() == null ^ this.getApplicationVersions() == null)
            return false;
        if (other.getApplicationVersions() != null
                && other.getApplicationVersions().equals(this.getApplicationVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
