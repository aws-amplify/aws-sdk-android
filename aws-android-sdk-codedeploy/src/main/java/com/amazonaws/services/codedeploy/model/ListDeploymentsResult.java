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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>ListDeployments</code> operation.
 * </p>
 */
public class ListDeploymentsResult implements Serializable {
    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     */
    private java.util.List<String> deployments;

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list deployments call to return
     * the next set of deployments in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     *
     * @return <p>
     *         A list of deployment IDs.
     *         </p>
     */
    public java.util.List<String> getDeployments() {
        return deployments;
    }

    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     *
     * @param deployments <p>
     *            A list of deployment IDs.
     *            </p>
     */
    public void setDeployments(java.util.Collection<String> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }

        this.deployments = new java.util.ArrayList<String>(deployments);
    }

    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deployments <p>
     *            A list of deployment IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsResult withDeployments(String... deployments) {
        if (getDeployments() == null) {
            this.deployments = new java.util.ArrayList<String>(deployments.length);
        }
        for (String value : deployments) {
            this.deployments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deployments <p>
     *            A list of deployment IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsResult withDeployments(java.util.Collection<String> deployments) {
        setDeployments(deployments);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list deployments call to return
     * the next set of deployments in the list.
     * </p>
     *
     * @return <p>
     *         If a large amount of information is returned, an identifier is
     *         also returned. It can be used in a subsequent list deployments
     *         call to return the next set of deployments in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list deployments call to return
     * the next set of deployments in the list.
     * </p>
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent list deployments
     *            call to return the next set of deployments in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list deployments call to return
     * the next set of deployments in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent list deployments
     *            call to return the next set of deployments in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsResult withNextToken(String nextToken) {
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
        if (getDeployments() != null)
            sb.append("deployments: " + getDeployments() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeployments() == null) ? 0 : getDeployments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentsResult == false)
            return false;
        ListDeploymentsResult other = (ListDeploymentsResult) obj;

        if (other.getDeployments() == null ^ this.getDeployments() == null)
            return false;
        if (other.getDeployments() != null
                && other.getDeployments().equals(this.getDeployments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
