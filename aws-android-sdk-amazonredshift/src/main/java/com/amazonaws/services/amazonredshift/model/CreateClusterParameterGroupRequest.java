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
 * Creates an Amazon Redshift parameter group.
 * </p>
 * <p>
 * Creating parameter groups is independent of creating clusters. You can
 * associate a cluster with a parameter group when you create the cluster. You
 * can also associate an existing cluster with a parameter group after the
 * cluster is created by using <a>ModifyCluster</a>.
 * </p>
 * <p>
 * Parameters in the parameter group define specific behavior that applies to
 * the databases you create on the cluster. For more information about
 * parameters and parameter groups, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
 * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
 * Management Guide</i>.
 * </p>
 */
public class CreateClusterParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique withing your AWS account.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lower-case string.
     * </p>
     * </note>
     */
    private String parameterGroupName;

    /**
     * <p>
     * The Amazon Redshift engine version to which the cluster parameter group
     * applies. The cluster engine version determines the set of parameters.
     * </p>
     * <p>
     * To get a list of valid parameter group family names, you can call
     * <a>DescribeClusterParameterGroups</a>. By default, Amazon Redshift
     * returns a list of all the parameter groups that are owned by your AWS
     * account, including the default parameter groups for each Amazon Redshift
     * engine version. The parameter group family names associated with the
     * default parameter groups provide you the valid values. For example, a
     * valid family name is "redshift-1.0".
     * </p>
     */
    private String parameterGroupFamily;

    /**
     * <p>
     * A description of the parameter group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique withing your AWS account.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lower-case string.
     * </p>
     * </note>
     *
     * @return <p>
     *         The name of the cluster parameter group.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be unique withing your AWS account.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         This value is stored as a lower-case string.
     *         </p>
     *         </note>
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique withing your AWS account.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lower-case string.
     * </p>
     * </note>
     *
     * @param parameterGroupName <p>
     *            The name of the cluster parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be unique withing your AWS account.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            This value is stored as a lower-case string.
     *            </p>
     *            </note>
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique withing your AWS account.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lower-case string.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterGroupName <p>
     *            The name of the cluster parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be unique withing your AWS account.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            This value is stored as a lower-case string.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift engine version to which the cluster parameter group
     * applies. The cluster engine version determines the set of parameters.
     * </p>
     * <p>
     * To get a list of valid parameter group family names, you can call
     * <a>DescribeClusterParameterGroups</a>. By default, Amazon Redshift
     * returns a list of all the parameter groups that are owned by your AWS
     * account, including the default parameter groups for each Amazon Redshift
     * engine version. The parameter group family names associated with the
     * default parameter groups provide you the valid values. For example, a
     * valid family name is "redshift-1.0".
     * </p>
     *
     * @return <p>
     *         The Amazon Redshift engine version to which the cluster parameter
     *         group applies. The cluster engine version determines the set of
     *         parameters.
     *         </p>
     *         <p>
     *         To get a list of valid parameter group family names, you can call
     *         <a>DescribeClusterParameterGroups</a>. By default, Amazon
     *         Redshift returns a list of all the parameter groups that are
     *         owned by your AWS account, including the default parameter groups
     *         for each Amazon Redshift engine version. The parameter group
     *         family names associated with the default parameter groups provide
     *         you the valid values. For example, a valid family name is
     *         "redshift-1.0".
     *         </p>
     */
    public String getParameterGroupFamily() {
        return parameterGroupFamily;
    }

    /**
     * <p>
     * The Amazon Redshift engine version to which the cluster parameter group
     * applies. The cluster engine version determines the set of parameters.
     * </p>
     * <p>
     * To get a list of valid parameter group family names, you can call
     * <a>DescribeClusterParameterGroups</a>. By default, Amazon Redshift
     * returns a list of all the parameter groups that are owned by your AWS
     * account, including the default parameter groups for each Amazon Redshift
     * engine version. The parameter group family names associated with the
     * default parameter groups provide you the valid values. For example, a
     * valid family name is "redshift-1.0".
     * </p>
     *
     * @param parameterGroupFamily <p>
     *            The Amazon Redshift engine version to which the cluster
     *            parameter group applies. The cluster engine version determines
     *            the set of parameters.
     *            </p>
     *            <p>
     *            To get a list of valid parameter group family names, you can
     *            call <a>DescribeClusterParameterGroups</a>. By default, Amazon
     *            Redshift returns a list of all the parameter groups that are
     *            owned by your AWS account, including the default parameter
     *            groups for each Amazon Redshift engine version. The parameter
     *            group family names associated with the default parameter
     *            groups provide you the valid values. For example, a valid
     *            family name is "redshift-1.0".
     *            </p>
     */
    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }

    /**
     * <p>
     * The Amazon Redshift engine version to which the cluster parameter group
     * applies. The cluster engine version determines the set of parameters.
     * </p>
     * <p>
     * To get a list of valid parameter group family names, you can call
     * <a>DescribeClusterParameterGroups</a>. By default, Amazon Redshift
     * returns a list of all the parameter groups that are owned by your AWS
     * account, including the default parameter groups for each Amazon Redshift
     * engine version. The parameter group family names associated with the
     * default parameter groups provide you the valid values. For example, a
     * valid family name is "redshift-1.0".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterGroupFamily <p>
     *            The Amazon Redshift engine version to which the cluster
     *            parameter group applies. The cluster engine version determines
     *            the set of parameters.
     *            </p>
     *            <p>
     *            To get a list of valid parameter group family names, you can
     *            call <a>DescribeClusterParameterGroups</a>. By default, Amazon
     *            Redshift returns a list of all the parameter groups that are
     *            owned by your AWS account, including the default parameter
     *            groups for each Amazon Redshift engine version. The parameter
     *            group family names associated with the default parameter
     *            groups provide you the valid values. For example, a valid
     *            family name is "redshift-1.0".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterParameterGroupRequest withParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * A description of the parameter group.
     * </p>
     *
     * @return <p>
     *         A description of the parameter group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the parameter group.
     * </p>
     *
     * @param description <p>
     *            A description of the parameter group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterParameterGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @return <p>
     *         A list of tag instances.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterParameterGroupRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
        if (getParameterGroupFamily() != null)
            sb.append("ParameterGroupFamily: " + getParameterGroupFamily() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getParameterGroupFamily() == null) ? 0 : getParameterGroupFamily().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterParameterGroupRequest == false)
            return false;
        CreateClusterParameterGroupRequest other = (CreateClusterParameterGroupRequest) obj;

        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null
                && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameterGroupFamily() == null ^ this.getParameterGroupFamily() == null)
            return false;
        if (other.getParameterGroupFamily() != null
                && other.getParameterGroupFamily().equals(this.getParameterGroupFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
