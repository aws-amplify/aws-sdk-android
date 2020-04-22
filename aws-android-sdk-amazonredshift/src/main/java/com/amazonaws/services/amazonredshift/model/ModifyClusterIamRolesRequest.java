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
 * Modifies the list of AWS Identity and Access Management (IAM) roles that can
 * be used by the cluster to access other AWS services.
 * </p>
 * <p>
 * A cluster can have up to 10 IAM roles associated at any time.
 * </p>
 */
public class ModifyClusterIamRolesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the cluster for which you want to associate or
     * disassociate IAM roles.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be
     * in their Amazon Resource Name (ARN) format. You can associate up to 10
     * IAM roles with a single cluster in a single request.
     * </p>
     */
    private java.util.List<String> addIamRoles;

    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster.
     * You can disassociate up to 10 IAM roles from a single cluster in a single
     * request.
     * </p>
     */
    private java.util.List<String> removeIamRoles;

    /**
     * <p>
     * The unique identifier of the cluster for which you want to associate or
     * disassociate IAM roles.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the cluster for which you want to
     *         associate or disassociate IAM roles.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which you want to associate or
     * disassociate IAM roles.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster for which you want to
     *            associate or disassociate IAM roles.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which you want to associate or
     * disassociate IAM roles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster for which you want to
     *            associate or disassociate IAM roles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterIamRolesRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be
     * in their Amazon Resource Name (ARN) format. You can associate up to 10
     * IAM roles with a single cluster in a single request.
     * </p>
     *
     * @return <p>
     *         Zero or more IAM roles to associate with the cluster. The roles
     *         must be in their Amazon Resource Name (ARN) format. You can
     *         associate up to 10 IAM roles with a single cluster in a single
     *         request.
     *         </p>
     */
    public java.util.List<String> getAddIamRoles() {
        return addIamRoles;
    }

    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be
     * in their Amazon Resource Name (ARN) format. You can associate up to 10
     * IAM roles with a single cluster in a single request.
     * </p>
     *
     * @param addIamRoles <p>
     *            Zero or more IAM roles to associate with the cluster. The
     *            roles must be in their Amazon Resource Name (ARN) format. You
     *            can associate up to 10 IAM roles with a single cluster in a
     *            single request.
     *            </p>
     */
    public void setAddIamRoles(java.util.Collection<String> addIamRoles) {
        if (addIamRoles == null) {
            this.addIamRoles = null;
            return;
        }

        this.addIamRoles = new java.util.ArrayList<String>(addIamRoles);
    }

    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be
     * in their Amazon Resource Name (ARN) format. You can associate up to 10
     * IAM roles with a single cluster in a single request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addIamRoles <p>
     *            Zero or more IAM roles to associate with the cluster. The
     *            roles must be in their Amazon Resource Name (ARN) format. You
     *            can associate up to 10 IAM roles with a single cluster in a
     *            single request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterIamRolesRequest withAddIamRoles(String... addIamRoles) {
        if (getAddIamRoles() == null) {
            this.addIamRoles = new java.util.ArrayList<String>(addIamRoles.length);
        }
        for (String value : addIamRoles) {
            this.addIamRoles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be
     * in their Amazon Resource Name (ARN) format. You can associate up to 10
     * IAM roles with a single cluster in a single request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addIamRoles <p>
     *            Zero or more IAM roles to associate with the cluster. The
     *            roles must be in their Amazon Resource Name (ARN) format. You
     *            can associate up to 10 IAM roles with a single cluster in a
     *            single request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterIamRolesRequest withAddIamRoles(java.util.Collection<String> addIamRoles) {
        setAddIamRoles(addIamRoles);
        return this;
    }

    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster.
     * You can disassociate up to 10 IAM roles from a single cluster in a single
     * request.
     * </p>
     *
     * @return <p>
     *         Zero or more IAM roles in ARN format to disassociate from the
     *         cluster. You can disassociate up to 10 IAM roles from a single
     *         cluster in a single request.
     *         </p>
     */
    public java.util.List<String> getRemoveIamRoles() {
        return removeIamRoles;
    }

    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster.
     * You can disassociate up to 10 IAM roles from a single cluster in a single
     * request.
     * </p>
     *
     * @param removeIamRoles <p>
     *            Zero or more IAM roles in ARN format to disassociate from the
     *            cluster. You can disassociate up to 10 IAM roles from a single
     *            cluster in a single request.
     *            </p>
     */
    public void setRemoveIamRoles(java.util.Collection<String> removeIamRoles) {
        if (removeIamRoles == null) {
            this.removeIamRoles = null;
            return;
        }

        this.removeIamRoles = new java.util.ArrayList<String>(removeIamRoles);
    }

    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster.
     * You can disassociate up to 10 IAM roles from a single cluster in a single
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeIamRoles <p>
     *            Zero or more IAM roles in ARN format to disassociate from the
     *            cluster. You can disassociate up to 10 IAM roles from a single
     *            cluster in a single request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterIamRolesRequest withRemoveIamRoles(String... removeIamRoles) {
        if (getRemoveIamRoles() == null) {
            this.removeIamRoles = new java.util.ArrayList<String>(removeIamRoles.length);
        }
        for (String value : removeIamRoles) {
            this.removeIamRoles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster.
     * You can disassociate up to 10 IAM roles from a single cluster in a single
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeIamRoles <p>
     *            Zero or more IAM roles in ARN format to disassociate from the
     *            cluster. You can disassociate up to 10 IAM roles from a single
     *            cluster in a single request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterIamRolesRequest withRemoveIamRoles(
            java.util.Collection<String> removeIamRoles) {
        setRemoveIamRoles(removeIamRoles);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getAddIamRoles() != null)
            sb.append("AddIamRoles: " + getAddIamRoles() + ",");
        if (getRemoveIamRoles() != null)
            sb.append("RemoveIamRoles: " + getRemoveIamRoles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getAddIamRoles() == null) ? 0 : getAddIamRoles().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveIamRoles() == null) ? 0 : getRemoveIamRoles().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterIamRolesRequest == false)
            return false;
        ModifyClusterIamRolesRequest other = (ModifyClusterIamRolesRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getAddIamRoles() == null ^ this.getAddIamRoles() == null)
            return false;
        if (other.getAddIamRoles() != null
                && other.getAddIamRoles().equals(this.getAddIamRoles()) == false)
            return false;
        if (other.getRemoveIamRoles() == null ^ this.getRemoveIamRoles() == null)
            return false;
        if (other.getRemoveIamRoles() != null
                && other.getRemoveIamRoles().equals(this.getRemoveIamRoles()) == false)
            return false;
        return true;
    }
}
