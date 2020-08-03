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


public class DescribeInstanceAssociationsStatusResult implements Serializable {
    /**
     * <p>Status information about the association.</p>
     */
    private java.util.List<InstanceAssociationStatusInfo> instanceAssociationStatusInfos;

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    private String nextToken;

    /**
     * <p>Status information about the association.</p>
     *
     * @return <p>Status information about the association.</p>
     */
    public java.util.List<InstanceAssociationStatusInfo> getInstanceAssociationStatusInfos() {
        return instanceAssociationStatusInfos;
    }

    /**
     * <p>Status information about the association.</p>
     *
     * @param instanceAssociationStatusInfos <p>Status information about the association.</p>
     */
    public void setInstanceAssociationStatusInfos(java.util.Collection<InstanceAssociationStatusInfo> instanceAssociationStatusInfos) {
        if (instanceAssociationStatusInfos == null) {
            this.instanceAssociationStatusInfos = null;
            return;
        }

        this.instanceAssociationStatusInfos = new java.util.ArrayList<InstanceAssociationStatusInfo>(instanceAssociationStatusInfos);
    }

    /**
     * <p>Status information about the association.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceAssociationStatusInfos <p>Status information about the association.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInstanceAssociationsStatusResult withInstanceAssociationStatusInfos(InstanceAssociationStatusInfo... instanceAssociationStatusInfos) {
        if (getInstanceAssociationStatusInfos() == null) {
            this.instanceAssociationStatusInfos = new java.util.ArrayList<InstanceAssociationStatusInfo>(instanceAssociationStatusInfos.length);
        }
        for (InstanceAssociationStatusInfo value : instanceAssociationStatusInfos) {
            this.instanceAssociationStatusInfos.add(value);
        }
        return this;
    }

    /**
     * <p>Status information about the association.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceAssociationStatusInfos <p>Status information about the association.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInstanceAssociationsStatusResult withInstanceAssociationStatusInfos(java.util.Collection<InstanceAssociationStatusInfo> instanceAssociationStatusInfos) {
        setInstanceAssociationStatusInfos(instanceAssociationStatusInfos);
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
    public DescribeInstanceAssociationsStatusResult withNextToken(String nextToken) {
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
        if (getInstanceAssociationStatusInfos() != null) sb.append("InstanceAssociationStatusInfos: " + getInstanceAssociationStatusInfos() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceAssociationStatusInfos() == null) ? 0 : getInstanceAssociationStatusInfos().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstanceAssociationsStatusResult == false) return false;
        DescribeInstanceAssociationsStatusResult other = (DescribeInstanceAssociationsStatusResult)obj;

        if (other.getInstanceAssociationStatusInfos() == null ^ this.getInstanceAssociationStatusInfos() == null) return false;
        if (other.getInstanceAssociationStatusInfos() != null && other.getInstanceAssociationStatusInfos().equals(this.getInstanceAssociationStatusInfos()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
