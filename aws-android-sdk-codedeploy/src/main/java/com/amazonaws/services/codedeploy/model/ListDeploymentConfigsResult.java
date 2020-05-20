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
 * Represents the output of a <code>ListDeploymentConfigs</code> operation.
 * </p>
 */
public class ListDeploymentConfigsResult implements Serializable {
    /**
     * <p>
     * A list of deployment configurations, including built-in configurations
     * such as <code>CodeDeployDefault.OneAtATime</code>.
     * </p>
     */
    private java.util.List<String> deploymentConfigsList;

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list deployment configurations
     * call to return the next set of deployment configurations in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of deployment configurations, including built-in configurations
     * such as <code>CodeDeployDefault.OneAtATime</code>.
     * </p>
     *
     * @return <p>
     *         A list of deployment configurations, including built-in
     *         configurations such as <code>CodeDeployDefault.OneAtATime</code>.
     *         </p>
     */
    public java.util.List<String> getDeploymentConfigsList() {
        return deploymentConfigsList;
    }

    /**
     * <p>
     * A list of deployment configurations, including built-in configurations
     * such as <code>CodeDeployDefault.OneAtATime</code>.
     * </p>
     *
     * @param deploymentConfigsList <p>
     *            A list of deployment configurations, including built-in
     *            configurations such as
     *            <code>CodeDeployDefault.OneAtATime</code>.
     *            </p>
     */
    public void setDeploymentConfigsList(java.util.Collection<String> deploymentConfigsList) {
        if (deploymentConfigsList == null) {
            this.deploymentConfigsList = null;
            return;
        }

        this.deploymentConfigsList = new java.util.ArrayList<String>(deploymentConfigsList);
    }

    /**
     * <p>
     * A list of deployment configurations, including built-in configurations
     * such as <code>CodeDeployDefault.OneAtATime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentConfigsList <p>
     *            A list of deployment configurations, including built-in
     *            configurations such as
     *            <code>CodeDeployDefault.OneAtATime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentConfigsResult withDeploymentConfigsList(String... deploymentConfigsList) {
        if (getDeploymentConfigsList() == null) {
            this.deploymentConfigsList = new java.util.ArrayList<String>(
                    deploymentConfigsList.length);
        }
        for (String value : deploymentConfigsList) {
            this.deploymentConfigsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of deployment configurations, including built-in configurations
     * such as <code>CodeDeployDefault.OneAtATime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentConfigsList <p>
     *            A list of deployment configurations, including built-in
     *            configurations such as
     *            <code>CodeDeployDefault.OneAtATime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentConfigsResult withDeploymentConfigsList(
            java.util.Collection<String> deploymentConfigsList) {
        setDeploymentConfigsList(deploymentConfigsList);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list deployment configurations
     * call to return the next set of deployment configurations in the list.
     * </p>
     *
     * @return <p>
     *         If a large amount of information is returned, an identifier is
     *         also returned. It can be used in a subsequent list deployment
     *         configurations call to return the next set of deployment
     *         configurations in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list deployment configurations
     * call to return the next set of deployment configurations in the list.
     * </p>
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent list deployment
     *            configurations call to return the next set of deployment
     *            configurations in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list deployment configurations
     * call to return the next set of deployment configurations in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent list deployment
     *            configurations call to return the next set of deployment
     *            configurations in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentConfigsResult withNextToken(String nextToken) {
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
        if (getDeploymentConfigsList() != null)
            sb.append("deploymentConfigsList: " + getDeploymentConfigsList() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDeploymentConfigsList() == null) ? 0 : getDeploymentConfigsList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentConfigsResult == false)
            return false;
        ListDeploymentConfigsResult other = (ListDeploymentConfigsResult) obj;

        if (other.getDeploymentConfigsList() == null ^ this.getDeploymentConfigsList() == null)
            return false;
        if (other.getDeploymentConfigsList() != null
                && other.getDeploymentConfigsList().equals(this.getDeploymentConfigsList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
