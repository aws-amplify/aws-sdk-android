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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new DB parameter group.
 * </p>
 * <p>
 * A DB parameter group is initially created with the default parameters for the
 * database engine used by the DB instance. To provide custom values for any of
 * the parameters, you must modify the group after creating it using
 * <i>ModifyDBParameterGroup</i>. Once you've created a DB parameter group, you
 * need to associate it with your DB instance using <i>ModifyDBInstance</i>.
 * When you associate a new DB parameter group with a running DB instance, you
 * need to reboot the DB instance without failover for the new DB parameter
 * group and associated settings to take effect.
 * </p>
 * <important>
 * <p>
 * After you create a DB parameter group, you should wait at least 5 minutes
 * before creating your first DB instance that uses that DB parameter group as
 * the default parameter group. This allows Amazon RDS to fully complete the
 * create action before the parameter group is used as the default for a new DB
 * instance. This is especially important for parameters that are critical when
 * creating the default database for a DB instance, such as the character set
 * for the default database defined by the <code>character_set_database</code>
 * parameter. You can use the <i>Parameter Groups</i> option of the <a
 * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
 * <i>DescribeDBParameters</i> command to verify that your DB parameter group
 * has been created or modified.
 * </p>
 * </important>
 */
public class CreateDBParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     */
    private String dBParameterGroupName;

    /**
     * <p>
     * The DB parameter group family name. A DB parameter group can be
     * associated with one and only one DB parameter group family, and can be
     * applied only to a DB instance running a database engine and engine
     * version compatible with that DB parameter group family.
     * </p>
     * <p>
     * To list all of the available parameter group families, use the following
     * command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     * </p>
     * <note>
     * <p>
     * The output contains duplicates.
     * </p>
     * </note>
     */
    private String dBParameterGroupFamily;

    /**
     * <p>
     * The description for the DB parameter group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Tags to assign to the DB parameter group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     *
     * @return <p>
     *         The name of the DB parameter group.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         This value is stored as a lowercase string.
     *         </p>
     *         </note>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            This value is stored as a lowercase string.
     *            </p>
     *            </note>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            This value is stored as a lowercase string.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The DB parameter group family name. A DB parameter group can be
     * associated with one and only one DB parameter group family, and can be
     * applied only to a DB instance running a database engine and engine
     * version compatible with that DB parameter group family.
     * </p>
     * <p>
     * To list all of the available parameter group families, use the following
     * command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     * </p>
     * <note>
     * <p>
     * The output contains duplicates.
     * </p>
     * </note>
     *
     * @return <p>
     *         The DB parameter group family name. A DB parameter group can be
     *         associated with one and only one DB parameter group family, and
     *         can be applied only to a DB instance running a database engine
     *         and engine version compatible with that DB parameter group
     *         family.
     *         </p>
     *         <p>
     *         To list all of the available parameter group families, use the
     *         following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     *         </p>
     *         <note>
     *         <p>
     *         The output contains duplicates.
     *         </p>
     *         </note>
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }

    /**
     * <p>
     * The DB parameter group family name. A DB parameter group can be
     * associated with one and only one DB parameter group family, and can be
     * applied only to a DB instance running a database engine and engine
     * version compatible with that DB parameter group family.
     * </p>
     * <p>
     * To list all of the available parameter group families, use the following
     * command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     * </p>
     * <note>
     * <p>
     * The output contains duplicates.
     * </p>
     * </note>
     *
     * @param dBParameterGroupFamily <p>
     *            The DB parameter group family name. A DB parameter group can
     *            be associated with one and only one DB parameter group family,
     *            and can be applied only to a DB instance running a database
     *            engine and engine version compatible with that DB parameter
     *            group family.
     *            </p>
     *            <p>
     *            To list all of the available parameter group families, use the
     *            following command:
     *            </p>
     *            <p>
     *            <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     *            </p>
     *            <note>
     *            <p>
     *            The output contains duplicates.
     *            </p>
     *            </note>
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The DB parameter group family name. A DB parameter group can be
     * associated with one and only one DB parameter group family, and can be
     * applied only to a DB instance running a database engine and engine
     * version compatible with that DB parameter group family.
     * </p>
     * <p>
     * To list all of the available parameter group families, use the following
     * command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     * </p>
     * <note>
     * <p>
     * The output contains duplicates.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupFamily <p>
     *            The DB parameter group family name. A DB parameter group can
     *            be associated with one and only one DB parameter group family,
     *            and can be applied only to a DB instance running a database
     *            engine and engine version compatible with that DB parameter
     *            group family.
     *            </p>
     *            <p>
     *            To list all of the available parameter group families, use the
     *            following command:
     *            </p>
     *            <p>
     *            <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     *            </p>
     *            <note>
     *            <p>
     *            The output contains duplicates.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBParameterGroupRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * The description for the DB parameter group.
     * </p>
     *
     * @return <p>
     *         The description for the DB parameter group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the DB parameter group.
     * </p>
     *
     * @param description <p>
     *            The description for the DB parameter group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the DB parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for the DB parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBParameterGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Tags to assign to the DB parameter group.
     * </p>
     *
     * @return <p>
     *         Tags to assign to the DB parameter group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the DB parameter group.
     * </p>
     *
     * @param tags <p>
     *            Tags to assign to the DB parameter group.
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
     * Tags to assign to the DB parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBParameterGroupRequest withTags(Tag... tags) {
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
     * Tags to assign to the DB parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: " + getDBParameterGroupFamily() + ",");
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
                + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily()
                        .hashCode());
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

        if (obj instanceof CreateDBParameterGroupRequest == false)
            return false;
        CreateDBParameterGroupRequest other = (CreateDBParameterGroupRequest) obj;

        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null
                && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null
                && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
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
