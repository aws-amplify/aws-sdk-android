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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>Database</code> object represents a logical grouping of tables that
 * might reside in a Hive metastore or an RDBMS.
 * </p>
 */
public class Database implements Serializable {
    /**
     * <p>
     * The name of the database. For Hive compatibility, this is folded to
     * lowercase when it is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String description;

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String locationUri;

    /**
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The time at which the metadata database was created in the catalog.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     */
    private java.util.List<PrincipalPermissions> createTableDefaultPermissions;

    /**
     * <p>
     * The name of the database. For Hive compatibility, this is folded to
     * lowercase when it is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the database. For Hive compatibility, this is folded
     *         to lowercase when it is stored.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the database. For Hive compatibility, this is folded to
     * lowercase when it is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the database. For Hive compatibility, this is
     *            folded to lowercase when it is stored.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the database. For Hive compatibility, this is folded to
     * lowercase when it is stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the database. For Hive compatibility, this is
     *            folded to lowercase when it is stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Database withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A description of the database.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the database.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Database withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The location of the database (for example, an HDFS path).
     *         </p>
     */
    public String getLocationUri() {
        return locationUri;
    }

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param locationUri <p>
     *            The location of the database (for example, an HDFS path).
     *            </p>
     */
    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The location of the database (for example, an HDFS path).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param locationUri <p>
     *            The location of the database (for example, an HDFS path).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Database withLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     *
     * @return <p>
     *         These key-value pairs define parameters and properties of the
     *         database.
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     *
     * @param parameters <p>
     *            These key-value pairs define parameters and properties of the
     *            database.
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            These key-value pairs define parameters and properties of the
     *            database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Database withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define parameters and properties of the database.
     * </p>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into
     *            Parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Database addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Database clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The time at which the metadata database was created in the catalog.
     * </p>
     *
     * @return <p>
     *         The time at which the metadata database was created in the
     *         catalog.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The time at which the metadata database was created in the catalog.
     * </p>
     *
     * @param createTime <p>
     *            The time at which the metadata database was created in the
     *            catalog.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the metadata database was created in the catalog.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The time at which the metadata database was created in the
     *            catalog.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Database withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     *
     * @return <p>
     *         Creates a set of default permissions on the table for principals.
     *         </p>
     */
    public java.util.List<PrincipalPermissions> getCreateTableDefaultPermissions() {
        return createTableDefaultPermissions;
    }

    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     *
     * @param createTableDefaultPermissions <p>
     *            Creates a set of default permissions on the table for
     *            principals.
     *            </p>
     */
    public void setCreateTableDefaultPermissions(
            java.util.Collection<PrincipalPermissions> createTableDefaultPermissions) {
        if (createTableDefaultPermissions == null) {
            this.createTableDefaultPermissions = null;
            return;
        }

        this.createTableDefaultPermissions = new java.util.ArrayList<PrincipalPermissions>(
                createTableDefaultPermissions);
    }

    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTableDefaultPermissions <p>
     *            Creates a set of default permissions on the table for
     *            principals.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Database withCreateTableDefaultPermissions(
            PrincipalPermissions... createTableDefaultPermissions) {
        if (getCreateTableDefaultPermissions() == null) {
            this.createTableDefaultPermissions = new java.util.ArrayList<PrincipalPermissions>(
                    createTableDefaultPermissions.length);
        }
        for (PrincipalPermissions value : createTableDefaultPermissions) {
            this.createTableDefaultPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Creates a set of default permissions on the table for principals.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTableDefaultPermissions <p>
     *            Creates a set of default permissions on the table for
     *            principals.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Database withCreateTableDefaultPermissions(
            java.util.Collection<PrincipalPermissions> createTableDefaultPermissions) {
        setCreateTableDefaultPermissions(createTableDefaultPermissions);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getLocationUri() != null)
            sb.append("LocationUri: " + getLocationUri() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getCreateTableDefaultPermissions() != null)
            sb.append("CreateTableDefaultPermissions: " + getCreateTableDefaultPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreateTableDefaultPermissions() == null) ? 0
                        : getCreateTableDefaultPermissions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Database == false)
            return false;
        Database other = (Database) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null
                && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getCreateTableDefaultPermissions() == null
                ^ this.getCreateTableDefaultPermissions() == null)
            return false;
        if (other.getCreateTableDefaultPermissions() != null
                && other.getCreateTableDefaultPermissions().equals(
                        this.getCreateTableDefaultPermissions()) == false)
            return false;
        return true;
    }
}
