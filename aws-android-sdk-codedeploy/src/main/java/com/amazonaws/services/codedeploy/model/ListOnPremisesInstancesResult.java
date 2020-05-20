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
 * Represents the output of the list on-premises instances operation.
 * </p>
 */
public class ListOnPremisesInstancesResult implements Serializable {
    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     */
    private java.util.List<String> instanceNames;

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list on-premises instances call
     * to return the next set of on-premises instances in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     *
     * @return <p>
     *         The list of matching on-premises instance names.
     *         </p>
     */
    public java.util.List<String> getInstanceNames() {
        return instanceNames;
    }

    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     *
     * @param instanceNames <p>
     *            The list of matching on-premises instance names.
     *            </p>
     */
    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }

        this.instanceNames = new java.util.ArrayList<String>(instanceNames);
    }

    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            The list of matching on-premises instance names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOnPremisesInstancesResult withInstanceNames(String... instanceNames) {
        if (getInstanceNames() == null) {
            this.instanceNames = new java.util.ArrayList<String>(instanceNames.length);
        }
        for (String value : instanceNames) {
            this.instanceNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            The list of matching on-premises instance names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOnPremisesInstancesResult withInstanceNames(
            java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list on-premises instances call
     * to return the next set of on-premises instances in the list.
     * </p>
     *
     * @return <p>
     *         If a large amount of information is returned, an identifier is
     *         also returned. It can be used in a subsequent list on-premises
     *         instances call to return the next set of on-premises instances in
     *         the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list on-premises instances call
     * to return the next set of on-premises instances in the list.
     * </p>
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent list on-premises
     *            instances call to return the next set of on-premises instances
     *            in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent list on-premises instances call
     * to return the next set of on-premises instances in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent list on-premises
     *            instances call to return the next set of on-premises instances
     *            in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOnPremisesInstancesResult withNextToken(String nextToken) {
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
        if (getInstanceNames() != null)
            sb.append("instanceNames: " + getInstanceNames() + ",");
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
                + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOnPremisesInstancesResult == false)
            return false;
        ListOnPremisesInstancesResult other = (ListOnPremisesInstancesResult) obj;

        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null
                && other.getInstanceNames().equals(this.getInstanceNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
