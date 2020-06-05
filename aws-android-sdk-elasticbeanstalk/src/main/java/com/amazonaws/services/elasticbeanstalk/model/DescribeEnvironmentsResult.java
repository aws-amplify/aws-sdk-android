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
 * Result message containing a list of environment descriptions.
 * </p>
 */
public class DescribeEnvironmentsResult implements Serializable {
    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     */
    private java.util.List<EnvironmentDescription> environments;

    /**
     * <p>
     * In a paginated request, the token that you can pass in a subsequent
     * request to get the next response page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     *
     * @return <p>
     *         Returns an <a>EnvironmentDescription</a> list.
     *         </p>
     */
    public java.util.List<EnvironmentDescription> getEnvironments() {
        return environments;
    }

    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     *
     * @param environments <p>
     *            Returns an <a>EnvironmentDescription</a> list.
     *            </p>
     */
    public void setEnvironments(java.util.Collection<EnvironmentDescription> environments) {
        if (environments == null) {
            this.environments = null;
            return;
        }

        this.environments = new java.util.ArrayList<EnvironmentDescription>(environments);
    }

    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environments <p>
     *            Returns an <a>EnvironmentDescription</a> list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsResult withEnvironments(EnvironmentDescription... environments) {
        if (getEnvironments() == null) {
            this.environments = new java.util.ArrayList<EnvironmentDescription>(environments.length);
        }
        for (EnvironmentDescription value : environments) {
            this.environments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environments <p>
     *            Returns an <a>EnvironmentDescription</a> list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentsResult withEnvironments(
            java.util.Collection<EnvironmentDescription> environments) {
        setEnvironments(environments);
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
    public DescribeEnvironmentsResult withNextToken(String nextToken) {
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
        if (getEnvironments() != null)
            sb.append("Environments: " + getEnvironments() + ",");
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
                + ((getEnvironments() == null) ? 0 : getEnvironments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentsResult == false)
            return false;
        DescribeEnvironmentsResult other = (DescribeEnvironmentsResult) obj;

        if (other.getEnvironments() == null ^ this.getEnvironments() == null)
            return false;
        if (other.getEnvironments() != null
                && other.getEnvironments().equals(this.getEnvironments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
