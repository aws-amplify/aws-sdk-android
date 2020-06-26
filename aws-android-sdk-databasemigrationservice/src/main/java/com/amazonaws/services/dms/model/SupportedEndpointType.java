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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about types of supported endpoints in response to a
 * request by the <code>DescribeEndpointTypes</code> operation. This information
 * includes the type of endpoint, the database engine name, and whether change
 * data capture (CDC) is supported.
 * </p>
 */
public class SupportedEndpointType implements Serializable {
    /**
     * <p>
     * The database engine name. Valid values, depending on the EndpointType,
     * include <code>"mysql"</code>, <code>"oracle"</code>,
     * <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"redshift"</code>,
     * <code>"s3"</code>, <code>"db2"</code>, <code>"azuredb"</code>,
     * <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     * <code>"kinesis"</code>, <code>"kafka"</code>,
     * <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     * <code>"sqlserver"</code>, and <code>"neptune"</code>.
     * </p>
     */
    private String engineName;

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     */
    private Boolean supportsCDC;

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and
     * <code>target</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>source, target
     */
    private String endpointType;

    /**
     * <p>
     * The earliest AWS DMS engine version that supports this endpoint engine.
     * Note that endpoint engines released with AWS DMS versions earlier than
     * 3.1.1 do not return a value for this parameter.
     * </p>
     */
    private String replicationInstanceEngineMinimumVersion;

    /**
     * <p>
     * The expanded name for the engine name. For example, if the
     * <code>EngineName</code> parameter is "aurora," this value would be
     * "Amazon Aurora MySQL."
     * </p>
     */
    private String engineDisplayName;

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndpointType,
     * include <code>"mysql"</code>, <code>"oracle"</code>,
     * <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"redshift"</code>,
     * <code>"s3"</code>, <code>"db2"</code>, <code>"azuredb"</code>,
     * <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     * <code>"kinesis"</code>, <code>"kafka"</code>,
     * <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     * <code>"sqlserver"</code>, and <code>"neptune"</code>.
     * </p>
     *
     * @return <p>
     *         The database engine name. Valid values, depending on the
     *         EndpointType, include <code>"mysql"</code>, <code>"oracle"</code>, <code>"postgres"</code>, <code>"mariadb"</code>,
     *         <code>"aurora"</code>, <code>"aurora-postgresql"</code>,
     *         <code>"redshift"</code>, <code>"s3"</code>, <code>"db2"</code>,
     *         <code>"azuredb"</code>, <code>"sybase"</code>,
     *         <code>"dynamodb"</code>, <code>"mongodb"</code>,
     *         <code>"kinesis"</code>, <code>"kafka"</code>,
     *         <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     *         <code>"sqlserver"</code>, and <code>"neptune"</code>.
     *         </p>
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndpointType,
     * include <code>"mysql"</code>, <code>"oracle"</code>,
     * <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"redshift"</code>,
     * <code>"s3"</code>, <code>"db2"</code>, <code>"azuredb"</code>,
     * <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     * <code>"kinesis"</code>, <code>"kafka"</code>,
     * <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     * <code>"sqlserver"</code>, and <code>"neptune"</code>.
     * </p>
     *
     * @param engineName <p>
     *            The database engine name. Valid values, depending on the
     *            EndpointType, include <code>"mysql"</code>,
     *            <code>"oracle"</code>, <code>"postgres"</code>,
     *            <code>"mariadb"</code>, <code>"aurora"</code>,
     *            <code>"aurora-postgresql"</code>, <code>"redshift"</code>,
     *            <code>"s3"</code>, <code>"db2"</code>, <code>"azuredb"</code>,
     *            <code>"sybase"</code>, <code>"dynamodb"</code>,
     *            <code>"mongodb"</code>, <code>"kinesis"</code>,
     *            <code>"kafka"</code>, <code>"elasticsearch"</code>,
     *            <code>"documentdb"</code>, <code>"sqlserver"</code>, and
     *            <code>"neptune"</code>.
     *            </p>
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndpointType,
     * include <code>"mysql"</code>, <code>"oracle"</code>,
     * <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"redshift"</code>,
     * <code>"s3"</code>, <code>"db2"</code>, <code>"azuredb"</code>,
     * <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     * <code>"kinesis"</code>, <code>"kafka"</code>,
     * <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     * <code>"sqlserver"</code>, and <code>"neptune"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineName <p>
     *            The database engine name. Valid values, depending on the
     *            EndpointType, include <code>"mysql"</code>,
     *            <code>"oracle"</code>, <code>"postgres"</code>,
     *            <code>"mariadb"</code>, <code>"aurora"</code>,
     *            <code>"aurora-postgresql"</code>, <code>"redshift"</code>,
     *            <code>"s3"</code>, <code>"db2"</code>, <code>"azuredb"</code>,
     *            <code>"sybase"</code>, <code>"dynamodb"</code>,
     *            <code>"mongodb"</code>, <code>"kinesis"</code>,
     *            <code>"kafka"</code>, <code>"elasticsearch"</code>,
     *            <code>"documentdb"</code>, <code>"sqlserver"</code>, and
     *            <code>"neptune"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SupportedEndpointType withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     *
     * @return <p>
     *         Indicates if Change Data Capture (CDC) is supported.
     *         </p>
     */
    public Boolean isSupportsCDC() {
        return supportsCDC;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     *
     * @return <p>
     *         Indicates if Change Data Capture (CDC) is supported.
     *         </p>
     */
    public Boolean getSupportsCDC() {
        return supportsCDC;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     *
     * @param supportsCDC <p>
     *            Indicates if Change Data Capture (CDC) is supported.
     *            </p>
     */
    public void setSupportsCDC(Boolean supportsCDC) {
        this.supportsCDC = supportsCDC;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsCDC <p>
     *            Indicates if Change Data Capture (CDC) is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SupportedEndpointType withSupportsCDC(Boolean supportsCDC) {
        this.supportsCDC = supportsCDC;
        return this;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and
     * <code>target</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>source, target
     *
     * @return <p>
     *         The type of endpoint. Valid values are <code>source</code> and
     *         <code>target</code>.
     *         </p>
     * @see ReplicationEndpointTypeValue
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and
     * <code>target</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>source, target
     *
     * @param endpointType <p>
     *            The type of endpoint. Valid values are <code>source</code> and
     *            <code>target</code>.
     *            </p>
     * @see ReplicationEndpointTypeValue
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and
     * <code>target</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>source, target
     *
     * @param endpointType <p>
     *            The type of endpoint. Valid values are <code>source</code> and
     *            <code>target</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicationEndpointTypeValue
     */
    public SupportedEndpointType withEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and
     * <code>target</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>source, target
     *
     * @param endpointType <p>
     *            The type of endpoint. Valid values are <code>source</code> and
     *            <code>target</code>.
     *            </p>
     * @see ReplicationEndpointTypeValue
     */
    public void setEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and
     * <code>target</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>source, target
     *
     * @param endpointType <p>
     *            The type of endpoint. Valid values are <code>source</code> and
     *            <code>target</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicationEndpointTypeValue
     */
    public SupportedEndpointType withEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The earliest AWS DMS engine version that supports this endpoint engine.
     * Note that endpoint engines released with AWS DMS versions earlier than
     * 3.1.1 do not return a value for this parameter.
     * </p>
     *
     * @return <p>
     *         The earliest AWS DMS engine version that supports this endpoint
     *         engine. Note that endpoint engines released with AWS DMS versions
     *         earlier than 3.1.1 do not return a value for this parameter.
     *         </p>
     */
    public String getReplicationInstanceEngineMinimumVersion() {
        return replicationInstanceEngineMinimumVersion;
    }

    /**
     * <p>
     * The earliest AWS DMS engine version that supports this endpoint engine.
     * Note that endpoint engines released with AWS DMS versions earlier than
     * 3.1.1 do not return a value for this parameter.
     * </p>
     *
     * @param replicationInstanceEngineMinimumVersion <p>
     *            The earliest AWS DMS engine version that supports this
     *            endpoint engine. Note that endpoint engines released with AWS
     *            DMS versions earlier than 3.1.1 do not return a value for this
     *            parameter.
     *            </p>
     */
    public void setReplicationInstanceEngineMinimumVersion(
            String replicationInstanceEngineMinimumVersion) {
        this.replicationInstanceEngineMinimumVersion = replicationInstanceEngineMinimumVersion;
    }

    /**
     * <p>
     * The earliest AWS DMS engine version that supports this endpoint engine.
     * Note that endpoint engines released with AWS DMS versions earlier than
     * 3.1.1 do not return a value for this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceEngineMinimumVersion <p>
     *            The earliest AWS DMS engine version that supports this
     *            endpoint engine. Note that endpoint engines released with AWS
     *            DMS versions earlier than 3.1.1 do not return a value for this
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SupportedEndpointType withReplicationInstanceEngineMinimumVersion(
            String replicationInstanceEngineMinimumVersion) {
        this.replicationInstanceEngineMinimumVersion = replicationInstanceEngineMinimumVersion;
        return this;
    }

    /**
     * <p>
     * The expanded name for the engine name. For example, if the
     * <code>EngineName</code> parameter is "aurora," this value would be
     * "Amazon Aurora MySQL."
     * </p>
     *
     * @return <p>
     *         The expanded name for the engine name. For example, if the
     *         <code>EngineName</code> parameter is "aurora," this value would
     *         be "Amazon Aurora MySQL."
     *         </p>
     */
    public String getEngineDisplayName() {
        return engineDisplayName;
    }

    /**
     * <p>
     * The expanded name for the engine name. For example, if the
     * <code>EngineName</code> parameter is "aurora," this value would be
     * "Amazon Aurora MySQL."
     * </p>
     *
     * @param engineDisplayName <p>
     *            The expanded name for the engine name. For example, if the
     *            <code>EngineName</code> parameter is "aurora," this value
     *            would be "Amazon Aurora MySQL."
     *            </p>
     */
    public void setEngineDisplayName(String engineDisplayName) {
        this.engineDisplayName = engineDisplayName;
    }

    /**
     * <p>
     * The expanded name for the engine name. For example, if the
     * <code>EngineName</code> parameter is "aurora," this value would be
     * "Amazon Aurora MySQL."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineDisplayName <p>
     *            The expanded name for the engine name. For example, if the
     *            <code>EngineName</code> parameter is "aurora," this value
     *            would be "Amazon Aurora MySQL."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SupportedEndpointType withEngineDisplayName(String engineDisplayName) {
        this.engineDisplayName = engineDisplayName;
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
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getSupportsCDC() != null)
            sb.append("SupportsCDC: " + getSupportsCDC() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getReplicationInstanceEngineMinimumVersion() != null)
            sb.append("ReplicationInstanceEngineMinimumVersion: "
                    + getReplicationInstanceEngineMinimumVersion() + ",");
        if (getEngineDisplayName() != null)
            sb.append("EngineDisplayName: " + getEngineDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode
                + ((getSupportsCDC() == null) ? 0 : getSupportsCDC().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceEngineMinimumVersion() == null) ? 0
                        : getReplicationInstanceEngineMinimumVersion().hashCode());
        hashCode = prime * hashCode
                + ((getEngineDisplayName() == null) ? 0 : getEngineDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedEndpointType == false)
            return false;
        SupportedEndpointType other = (SupportedEndpointType) obj;

        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null
                && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getSupportsCDC() == null ^ this.getSupportsCDC() == null)
            return false;
        if (other.getSupportsCDC() != null
                && other.getSupportsCDC().equals(this.getSupportsCDC()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null
                && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getReplicationInstanceEngineMinimumVersion() == null
                ^ this.getReplicationInstanceEngineMinimumVersion() == null)
            return false;
        if (other.getReplicationInstanceEngineMinimumVersion() != null
                && other.getReplicationInstanceEngineMinimumVersion().equals(
                        this.getReplicationInstanceEngineMinimumVersion()) == false)
            return false;
        if (other.getEngineDisplayName() == null ^ this.getEngineDisplayName() == null)
            return false;
        if (other.getEngineDisplayName() != null
                && other.getEngineDisplayName().equals(this.getEngineDisplayName()) == false)
            return false;
        return true;
    }
}
