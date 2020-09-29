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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class DescribeActivationsResult implements Serializable {
    /**
     * <p>A list of activations for your AWS account.</p>
     */
    private java.util.List<Activation> activationList;

    /**
     * <p>The token for the next set of items to return. Use this token to get the next set of results. </p>
     */
    private String nextToken;

    /**
     * <p>A list of activations for your AWS account.</p>
     *
     * @return <p>A list of activations for your AWS account.</p>
     */
    public java.util.List<Activation> getActivationList() {
        return activationList;
    }

    /**
     * <p>A list of activations for your AWS account.</p>
     *
     * @param activationList <p>A list of activations for your AWS account.</p>
     */
    public void setActivationList(java.util.Collection<Activation> activationList) {
        if (activationList == null) {
            this.activationList = null;
            return;
        }

        this.activationList = new java.util.ArrayList<Activation>(activationList);
    }

    /**
     * <p>A list of activations for your AWS account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activationList <p>A list of activations for your AWS account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeActivationsResult withActivationList(Activation... activationList) {
        if (getActivationList() == null) {
            this.activationList = new java.util.ArrayList<Activation>(activationList.length);
        }
        for (Activation value : activationList) {
            this.activationList.add(value);
        }
        return this;
    }

    /**
     * <p>A list of activations for your AWS account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activationList <p>A list of activations for your AWS account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeActivationsResult withActivationList(java.util.Collection<Activation> activationList) {
        setActivationList(activationList);
        return this;
    }

    /**
     * <p>The token for the next set of items to return. Use this token to get the next set of results. </p>
     *
     * @return <p>The token for the next set of items to return. Use this token to get the next set of results. </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. Use this token to get the next set of results. </p>
     *
     * @param nextToken <p>The token for the next set of items to return. Use this token to get the next set of results. </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. Use this token to get the next set of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. Use this token to get the next set of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeActivationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getActivationList() != null) sb.append("ActivationList: " + getActivationList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationList() == null) ? 0 : getActivationList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeActivationsResult == false) return false;
        DescribeActivationsResult other = (DescribeActivationsResult)obj;

        if (other.getActivationList() == null ^ this.getActivationList() == null) return false;
        if (other.getActivationList() != null && other.getActivationList().equals(this.getActivationList()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
