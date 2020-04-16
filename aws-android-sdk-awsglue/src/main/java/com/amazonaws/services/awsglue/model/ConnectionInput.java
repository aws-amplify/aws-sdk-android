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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that is used to specify a connection to create or update.
 * </p>
 */
public class ConnectionInput implements Serializable {
    /**
     * <p>
     * The name of the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the connection.
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
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java
     * Database Connectivity (JDBC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document
     * database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * SFTP is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     */
    private String connectionType;

    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     */
    private java.util.List<String> matchCriteria;

    /**
     * <p>
     * These key-value pairs define parameters for the connection.
     * </p>
     */
    private java.util.Map<String, String> connectionProperties;

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud
     * (VPC) and <code>SecurityGroup</code>, that are needed to successfully
     * make this connection.
     * </p>
     */
    private PhysicalConnectionRequirements physicalConnectionRequirements;

    /**
     * <p>
     * The name of the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the connection.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the connection.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the connection.
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
     *            The name of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The description of the connection.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            The description of the connection.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the connection.
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
     *            The description of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java
     * Database Connectivity (JDBC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document
     * database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * SFTP is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @return <p>
     *         The type of the connection. Currently, these types are supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>JDBC</code> - Designates a connection to a database through
     *         Java Database Connectivity (JDBC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MONGODB</code> - Designates a connection to a MongoDB
     *         document database.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         SFTP is not supported.
     *         </p>
     * @see ConnectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java
     * Database Connectivity (JDBC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document
     * database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * SFTP is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @param connectionType <p>
     *            The type of the connection. Currently, these types are
     *            supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>JDBC</code> - Designates a connection to a database
     *            through Java Database Connectivity (JDBC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MONGODB</code> - Designates a connection to a MongoDB
     *            document database.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            SFTP is not supported.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java
     * Database Connectivity (JDBC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document
     * database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * SFTP is not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @param connectionType <p>
     *            The type of the connection. Currently, these types are
     *            supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>JDBC</code> - Designates a connection to a database
     *            through Java Database Connectivity (JDBC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MONGODB</code> - Designates a connection to a MongoDB
     *            document database.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            SFTP is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public ConnectionInput withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java
     * Database Connectivity (JDBC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document
     * database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * SFTP is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @param connectionType <p>
     *            The type of the connection. Currently, these types are
     *            supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>JDBC</code> - Designates a connection to a database
     *            through Java Database Connectivity (JDBC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MONGODB</code> - Designates a connection to a MongoDB
     *            document database.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            SFTP is not supported.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
    }

    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java
     * Database Connectivity (JDBC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document
     * database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * SFTP is not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @param connectionType <p>
     *            The type of the connection. Currently, these types are
     *            supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>JDBC</code> - Designates a connection to a database
     *            through Java Database Connectivity (JDBC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MONGODB</code> - Designates a connection to a MongoDB
     *            document database.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            SFTP is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public ConnectionInput withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
        return this;
    }

    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     *
     * @return <p>
     *         A list of criteria that can be used in selecting this connection.
     *         </p>
     */
    public java.util.List<String> getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     *
     * @param matchCriteria <p>
     *            A list of criteria that can be used in selecting this
     *            connection.
     *            </p>
     */
    public void setMatchCriteria(java.util.Collection<String> matchCriteria) {
        if (matchCriteria == null) {
            this.matchCriteria = null;
            return;
        }

        this.matchCriteria = new java.util.ArrayList<String>(matchCriteria);
    }

    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchCriteria <p>
     *            A list of criteria that can be used in selecting this
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionInput withMatchCriteria(String... matchCriteria) {
        if (getMatchCriteria() == null) {
            this.matchCriteria = new java.util.ArrayList<String>(matchCriteria.length);
        }
        for (String value : matchCriteria) {
            this.matchCriteria.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchCriteria <p>
     *            A list of criteria that can be used in selecting this
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionInput withMatchCriteria(java.util.Collection<String> matchCriteria) {
        setMatchCriteria(matchCriteria);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection.
     * </p>
     *
     * @return <p>
     *         These key-value pairs define parameters for the connection.
     *         </p>
     */
    public java.util.Map<String, String> getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection.
     * </p>
     *
     * @param connectionProperties <p>
     *            These key-value pairs define parameters for the connection.
     *            </p>
     */
    public void setConnectionProperties(java.util.Map<String, String> connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionProperties <p>
     *            These key-value pairs define parameters for the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionInput withConnectionProperties(
            java.util.Map<String, String> connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection.
     * </p>
     * <p>
     * The method adds a new key-value pair into ConnectionProperties parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ConnectionProperties.
     * @param value The corresponding value of the entry to be added into
     *            ConnectionProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionInput addConnectionPropertiesEntry(String key, String value) {
        if (null == this.connectionProperties) {
            this.connectionProperties = new java.util.HashMap<String, String>();
        }
        if (this.connectionProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.connectionProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ConnectionProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ConnectionInput clearConnectionPropertiesEntries() {
        this.connectionProperties = null;
        return this;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud
     * (VPC) and <code>SecurityGroup</code>, that are needed to successfully
     * make this connection.
     * </p>
     *
     * @return <p>
     *         A map of physical connection requirements, such as virtual
     *         private cloud (VPC) and <code>SecurityGroup</code>, that are
     *         needed to successfully make this connection.
     *         </p>
     */
    public PhysicalConnectionRequirements getPhysicalConnectionRequirements() {
        return physicalConnectionRequirements;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud
     * (VPC) and <code>SecurityGroup</code>, that are needed to successfully
     * make this connection.
     * </p>
     *
     * @param physicalConnectionRequirements <p>
     *            A map of physical connection requirements, such as virtual
     *            private cloud (VPC) and <code>SecurityGroup</code>, that are
     *            needed to successfully make this connection.
     *            </p>
     */
    public void setPhysicalConnectionRequirements(
            PhysicalConnectionRequirements physicalConnectionRequirements) {
        this.physicalConnectionRequirements = physicalConnectionRequirements;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud
     * (VPC) and <code>SecurityGroup</code>, that are needed to successfully
     * make this connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param physicalConnectionRequirements <p>
     *            A map of physical connection requirements, such as virtual
     *            private cloud (VPC) and <code>SecurityGroup</code>, that are
     *            needed to successfully make this connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionInput withPhysicalConnectionRequirements(
            PhysicalConnectionRequirements physicalConnectionRequirements) {
        this.physicalConnectionRequirements = physicalConnectionRequirements;
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
        if (getConnectionType() != null)
            sb.append("ConnectionType: " + getConnectionType() + ",");
        if (getMatchCriteria() != null)
            sb.append("MatchCriteria: " + getMatchCriteria() + ",");
        if (getConnectionProperties() != null)
            sb.append("ConnectionProperties: " + getConnectionProperties() + ",");
        if (getPhysicalConnectionRequirements() != null)
            sb.append("PhysicalConnectionRequirements: " + getPhysicalConnectionRequirements());
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
                + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode
                + ((getMatchCriteria() == null) ? 0 : getMatchCriteria().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionProperties() == null) ? 0 : getConnectionProperties().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhysicalConnectionRequirements() == null) ? 0
                        : getPhysicalConnectionRequirements().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionInput == false)
            return false;
        ConnectionInput other = (ConnectionInput) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null
                && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getMatchCriteria() == null ^ this.getMatchCriteria() == null)
            return false;
        if (other.getMatchCriteria() != null
                && other.getMatchCriteria().equals(this.getMatchCriteria()) == false)
            return false;
        if (other.getConnectionProperties() == null ^ this.getConnectionProperties() == null)
            return false;
        if (other.getConnectionProperties() != null
                && other.getConnectionProperties().equals(this.getConnectionProperties()) == false)
            return false;
        if (other.getPhysicalConnectionRequirements() == null
                ^ this.getPhysicalConnectionRequirements() == null)
            return false;
        if (other.getPhysicalConnectionRequirements() != null
                && other.getPhysicalConnectionRequirements().equals(
                        this.getPhysicalConnectionRequirements()) == false)
            return false;
        return true;
    }
}
