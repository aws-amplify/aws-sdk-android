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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new DB cluster parameter group.
 * </p>
 * <p>
 * Parameters in a DB cluster parameter group apply to all of the instances in a
 * DB cluster.
 * </p>
 * <p>
 * A DB cluster parameter group is initially created with the default parameters
 * for the database engine used by instances in the DB cluster. To provide
 * custom values for any of the parameters, you must modify the group after
 * creating it using <code>ModifyDBClusterParameterGroup</code>. Once you've
 * created a DB cluster parameter group, you need to associate it with your DB
 * cluster using <code>ModifyDBCluster</code>. When you associate a new DB
 * cluster parameter group with a running DB cluster, you need to reboot the DB
 * instances in the DB cluster without failover for the new DB cluster parameter
 * group and associated settings to take effect.
 * </p>
 * <important>
 * <p>
 * After you create a DB cluster parameter group, you should wait at least 5
 * minutes before creating your first DB cluster that uses that DB cluster
 * parameter group as the default parameter group. This allows Amazon RDS to
 * fully complete the create action before the DB cluster parameter group is
 * used as the default for a new DB cluster. This is especially important for
 * parameters that are critical when creating the default database for a DB
 * cluster, such as the character set for the default database defined by the
 * <code>character_set_database</code> parameter. You can use the <i>Parameter
 * Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon
 * RDS console</a> or the <code>DescribeDBClusterParameters</code> action to
 * verify that your DB cluster parameter group has been created or modified.
 * </p>
 * </important>
 * <p>
 * For more information on Amazon Aurora, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class CreateDBClusterParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     */
    private String dBClusterParameterGroupName;

    /**
     * <p>
     * The DB cluster parameter group family name. A DB cluster parameter group
     * can be associated with one and only one DB cluster parameter group
     * family, and can be applied only to a DB cluster running a database engine
     * and engine version compatible with that DB cluster parameter group
     * family.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>aurora5.6</code>, <code>aurora-mysql5.7</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>aurora-postgresql9.6</code>
     * </p>
     */
    private String dBParameterGroupFamily;

    /**
     * <p>
     * The description for the DB cluster parameter group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Tags to assign to the DB cluster parameter group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB cluster parameter group.
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
     *         The name of the DB cluster parameter group.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the name of an existing DB cluster parameter group.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         This value is stored as a lowercase string.
     *         </p>
     *         </note>
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the name of an existing DB cluster parameter group.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            This value is stored as a lowercase string.
     *            </p>
     *            </note>
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB cluster parameter group.
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
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the name of an existing DB cluster parameter group.
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
    public CreateDBClusterParameterGroupRequest withDBClusterParameterGroupName(
            String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The DB cluster parameter group family name. A DB cluster parameter group
     * can be associated with one and only one DB cluster parameter group
     * family, and can be applied only to a DB cluster running a database engine
     * and engine version compatible with that DB cluster parameter group
     * family.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>aurora5.6</code>, <code>aurora-mysql5.7</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>aurora-postgresql9.6</code>
     * </p>
     *
     * @return <p>
     *         The DB cluster parameter group family name. A DB cluster
     *         parameter group can be associated with one and only one DB
     *         cluster parameter group family, and can be applied only to a DB
     *         cluster running a database engine and engine version compatible
     *         with that DB cluster parameter group family.
     *         </p>
     *         <p>
     *         <b>Aurora MySQL</b>
     *         </p>
     *         <p>
     *         Example: <code>aurora5.6</code>, <code>aurora-mysql5.7</code>
     *         </p>
     *         <p>
     *         <b>Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         Example: <code>aurora-postgresql9.6</code>
     *         </p>
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }

    /**
     * <p>
     * The DB cluster parameter group family name. A DB cluster parameter group
     * can be associated with one and only one DB cluster parameter group
     * family, and can be applied only to a DB cluster running a database engine
     * and engine version compatible with that DB cluster parameter group
     * family.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>aurora5.6</code>, <code>aurora-mysql5.7</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>aurora-postgresql9.6</code>
     * </p>
     *
     * @param dBParameterGroupFamily <p>
     *            The DB cluster parameter group family name. A DB cluster
     *            parameter group can be associated with one and only one DB
     *            cluster parameter group family, and can be applied only to a
     *            DB cluster running a database engine and engine version
     *            compatible with that DB cluster parameter group family.
     *            </p>
     *            <p>
     *            <b>Aurora MySQL</b>
     *            </p>
     *            <p>
     *            Example: <code>aurora5.6</code>, <code>aurora-mysql5.7</code>
     *            </p>
     *            <p>
     *            <b>Aurora PostgreSQL</b>
     *            </p>
     *            <p>
     *            Example: <code>aurora-postgresql9.6</code>
     *            </p>
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The DB cluster parameter group family name. A DB cluster parameter group
     * can be associated with one and only one DB cluster parameter group
     * family, and can be applied only to a DB cluster running a database engine
     * and engine version compatible with that DB cluster parameter group
     * family.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>aurora5.6</code>, <code>aurora-mysql5.7</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>aurora-postgresql9.6</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupFamily <p>
     *            The DB cluster parameter group family name. A DB cluster
     *            parameter group can be associated with one and only one DB
     *            cluster parameter group family, and can be applied only to a
     *            DB cluster running a database engine and engine version
     *            compatible with that DB cluster parameter group family.
     *            </p>
     *            <p>
     *            <b>Aurora MySQL</b>
     *            </p>
     *            <p>
     *            Example: <code>aurora5.6</code>, <code>aurora-mysql5.7</code>
     *            </p>
     *            <p>
     *            <b>Aurora PostgreSQL</b>
     *            </p>
     *            <p>
     *            Example: <code>aurora-postgresql9.6</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterParameterGroupRequest withDBParameterGroupFamily(
            String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * The description for the DB cluster parameter group.
     * </p>
     *
     * @return <p>
     *         The description for the DB cluster parameter group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the DB cluster parameter group.
     * </p>
     *
     * @param description <p>
     *            The description for the DB cluster parameter group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the DB cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for the DB cluster parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterParameterGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Tags to assign to the DB cluster parameter group.
     * </p>
     *
     * @return <p>
     *         Tags to assign to the DB cluster parameter group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the DB cluster parameter group.
     * </p>
     *
     * @param tags <p>
     *            Tags to assign to the DB cluster parameter group.
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
     * Tags to assign to the DB cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB cluster parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterParameterGroupRequest withTags(Tag... tags) {
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
     * Tags to assign to the DB cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB cluster parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() + ",");
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

        hashCode = prime
                * hashCode
                + ((getDBClusterParameterGroupName() == null) ? 0
                        : getDBClusterParameterGroupName().hashCode());
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

        if (obj instanceof CreateDBClusterParameterGroupRequest == false)
            return false;
        CreateDBClusterParameterGroupRequest other = (CreateDBClusterParameterGroupRequest) obj;

        if (other.getDBClusterParameterGroupName() == null
                ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null
                && other.getDBClusterParameterGroupName().equals(
                        this.getDBClusterParameterGroupName()) == false)
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
