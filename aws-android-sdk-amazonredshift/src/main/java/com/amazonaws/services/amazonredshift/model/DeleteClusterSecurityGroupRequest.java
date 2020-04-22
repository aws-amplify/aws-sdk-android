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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an Amazon Redshift security group.
 * </p>
 * <note>
 * <p>
 * You cannot delete a security group that is associated with any clusters. You
 * cannot delete the default security group.
 * </p>
 * </note>
 * <p>
 * For information about managing security groups, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"
 * >Amazon Redshift Cluster Security Groups</a> in the <i>Amazon Redshift
 * Cluster Management Guide</i>.
 * </p>
 */
public class DeleteClusterSecurityGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the cluster security group to be deleted.
     * </p>
     */
    private String clusterSecurityGroupName;

    /**
     * <p>
     * The name of the cluster security group to be deleted.
     * </p>
     *
     * @return <p>
     *         The name of the cluster security group to be deleted.
     *         </p>
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group to be deleted.
     * </p>
     *
     * @param clusterSecurityGroupName <p>
     *            The name of the cluster security group to be deleted.
     *            </p>
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group to be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroupName <p>
     *            The name of the cluster security group to be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteClusterSecurityGroupRequest withClusterSecurityGroupName(
            String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
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
        if (getClusterSecurityGroupName() != null)
            sb.append("ClusterSecurityGroupName: " + getClusterSecurityGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterSecurityGroupRequest == false)
            return false;
        DeleteClusterSecurityGroupRequest other = (DeleteClusterSecurityGroupRequest) obj;

        if (other.getClusterSecurityGroupName() == null
                ^ this.getClusterSecurityGroupName() == null)
            return false;
        if (other.getClusterSecurityGroupName() != null
                && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false)
            return false;
        return true;
    }
}
