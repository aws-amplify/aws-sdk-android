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


public class DescribeEffectiveInstanceAssociationsResult implements Serializable {
    /**
     * <p>The associations for the requested instance.</p>
     */
    private java.util.List<InstanceAssociation> associations;

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    private String nextToken;

    /**
     * <p>The associations for the requested instance.</p>
     *
     * @return <p>The associations for the requested instance.</p>
     */
    public java.util.List<InstanceAssociation> getAssociations() {
        return associations;
    }

    /**
     * <p>The associations for the requested instance.</p>
     *
     * @param associations <p>The associations for the requested instance.</p>
     */
    public void setAssociations(java.util.Collection<InstanceAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new java.util.ArrayList<InstanceAssociation>(associations);
    }

    /**
     * <p>The associations for the requested instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations <p>The associations for the requested instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeEffectiveInstanceAssociationsResult withAssociations(InstanceAssociation... associations) {
        if (getAssociations() == null) {
            this.associations = new java.util.ArrayList<InstanceAssociation>(associations.length);
        }
        for (InstanceAssociation value : associations) {
            this.associations.add(value);
        }
        return this;
    }

    /**
     * <p>The associations for the requested instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations <p>The associations for the requested instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeEffectiveInstanceAssociationsResult withAssociations(java.util.Collection<InstanceAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeEffectiveInstanceAssociationsResult withNextToken(String nextToken) {
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
        if (getAssociations() != null) sb.append("Associations: " + getAssociations() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEffectiveInstanceAssociationsResult == false) return false;
        DescribeEffectiveInstanceAssociationsResult other = (DescribeEffectiveInstanceAssociationsResult)obj;

        if (other.getAssociations() == null ^ this.getAssociations() == null) return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
