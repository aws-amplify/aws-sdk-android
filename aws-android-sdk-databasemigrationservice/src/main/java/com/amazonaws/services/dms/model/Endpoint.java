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
 * Describes an endpoint of a database instance in response to operations such
 * as the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateEndpoint</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEndpoint</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEndpointTypes</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ModifyEndpoint</code>
 * </p>
 * </li>
 * </ul>
 */
public class Endpoint implements Serializable {
    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter
     * and must contain only ASCII letters, digits, and hyphens. They can't end
     * with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String endpointIdentifier;

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
     * The expanded name for the engine name. For example, if the
     * <code>EngineName</code> parameter is "aurora," this value would be
     * "Amazon Aurora MySQL."
     * </p>
     */
    private String engineDisplayName;

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     */
    private String extraConnectionAttributes;

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     */
    private String status;

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the connection
     * parameters for the endpoint.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then AWS DMS uses your default encryption key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     */
    private String endpointArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default value is
     * <code>none</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, require, verify-ca, verify-full
     */
    private String sslMode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     */
    private String serviceAccessRoleArn;

    /**
     * <p>
     * The external table definition.
     * </p>
     */
    private String externalTableDefinition;

    /**
     * <p>
     * Value returned by a call to CreateEndpoint that can be used for
     * cross-account validation. Use it on a subsequent call to CreateEndpoint
     * to create the endpoint with a cross-account.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The settings for the target DynamoDB database. For more information, see
     * the <code>DynamoDBSettings</code> structure.
     * </p>
     */
    private DynamoDbSettings dynamoDbSettings;

    /**
     * <p>
     * The settings for the S3 target endpoint. For more information, see the
     * <code>S3Settings</code> structure.
     * </p>
     */
    private S3Settings s3Settings;

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Possible settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ServiceAccessRoleArn</code> - The IAM role that has permission to
     * access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BucketName</code> - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CompressionType</code> - An optional parameter to use GZIP to
     * compress the target files. To use GZIP, set this value to
     * <code>NONE</code> (the default). To keep the files uncompressed, don't
     * use this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these settings is as follows:
     * <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     * </p>
     * <p>
     * JSON syntax for these settings is as follows:
     * <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * </p>
     */
    private DmsTransferSettings dmsTransferSettings;

    /**
     * <p>
     * The settings for the MongoDB source endpoint. For more information, see
     * the <code>MongoDbSettings</code> structure.
     * </p>
     */
    private MongoDbSettings mongoDbSettings;

    /**
     * <p>
     * The settings for the Amazon Kinesis target endpoint. For more
     * information, see the <code>KinesisSettings</code> structure.
     * </p>
     */
    private KinesisSettings kinesisSettings;

    /**
     * <p>
     * The settings for the Apache Kafka target endpoint. For more information,
     * see the <code>KafkaSettings</code> structure.
     * </p>
     */
    private KafkaSettings kafkaSettings;

    /**
     * <p>
     * The settings for the Elasticsearch source endpoint. For more information,
     * see the <code>ElasticsearchSettings</code> structure.
     * </p>
     */
    private ElasticsearchSettings elasticsearchSettings;

    /**
     * <p>
     * The settings for the Amazon Neptune target endpoint. For more
     * information, see the <code>NeptuneSettings</code> structure.
     * </p>
     */
    private NeptuneSettings neptuneSettings;

    /**
     * <p>
     * Settings for the Amazon Redshift endpoint.
     * </p>
     */
    private RedshiftSettings redshiftSettings;

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter
     * and must contain only ASCII letters, digits, and hyphens. They can't end
     * with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @return <p>
     *         The database endpoint identifier. Identifiers must begin with a
     *         letter and must contain only ASCII letters, digits, and hyphens.
     *         They can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     */
    public String getEndpointIdentifier() {
        return endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter
     * and must contain only ASCII letters, digits, and hyphens. They can't end
     * with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @param endpointIdentifier <p>
     *            The database endpoint identifier. Identifiers must begin with
     *            a letter and must contain only ASCII letters, digits, and
     *            hyphens. They can't end with a hyphen or contain two
     *            consecutive hyphens.
     *            </p>
     */
    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter
     * and must contain only ASCII letters, digits, and hyphens. They can't end
     * with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointIdentifier <p>
     *            The database endpoint identifier. Identifiers must begin with
     *            a letter and must contain only ASCII letters, digits, and
     *            hyphens. They can't end with a hyphen or contain two
     *            consecutive hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
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
    public Endpoint withEndpointType(String endpointType) {
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
    public Endpoint withEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
        return this;
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
    public Endpoint withEngineName(String engineName) {
        this.engineName = engineName;
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
    public Endpoint withEngineDisplayName(String engineDisplayName) {
        this.engineDisplayName = engineDisplayName;
        return this;
    }

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     *
     * @return <p>
     *         The user name used to connect to the endpoint.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     *
     * @param username <p>
     *            The user name used to connect to the endpoint.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            The user name used to connect to the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     *
     * @return <p>
     *         The name of the server at the endpoint.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     *
     * @param serverName <p>
     *            The name of the server at the endpoint.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverName <p>
     *            The name of the server at the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     *
     * @return <p>
     *         The port value used to access the endpoint.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     *
     * @param port <p>
     *            The port value used to access the endpoint.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port value used to access the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     *
     * @return <p>
     *         The name of the database at the endpoint.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     *
     * @param databaseName <p>
     *            The name of the database at the endpoint.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The name of the database at the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     *
     * @return <p>
     *         Additional connection attributes used to connect to the endpoint.
     *         </p>
     */
    public String getExtraConnectionAttributes() {
        return extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     *
     * @param extraConnectionAttributes <p>
     *            Additional connection attributes used to connect to the
     *            endpoint.
     *            </p>
     */
    public void setExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraConnectionAttributes <p>
     *            Additional connection attributes used to connect to the
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     *
     * @return <p>
     *         The status of the endpoint.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     *
     * @param status <p>
     *            The status of the endpoint.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the connection
     * parameters for the endpoint.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then AWS DMS uses your default encryption key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     *
     * @return <p>
     *         An AWS KMS key identifier that is used to encrypt the connection
     *         parameters for the endpoint.
     *         </p>
     *         <p>
     *         If you don't specify a value for the <code>KmsKeyId</code>
     *         parameter, then AWS DMS uses your default encryption key.
     *         </p>
     *         <p>
     *         AWS KMS creates the default encryption key for your AWS account.
     *         Your AWS account has a different default encryption key for each
     *         AWS Region.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the connection
     * parameters for the endpoint.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then AWS DMS uses your default encryption key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     *
     * @param kmsKeyId <p>
     *            An AWS KMS key identifier that is used to encrypt the
     *            connection parameters for the endpoint.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>KmsKeyId</code>
     *            parameter, then AWS DMS uses your default encryption key.
     *            </p>
     *            <p>
     *            AWS KMS creates the default encryption key for your AWS
     *            account. Your AWS account has a different default encryption
     *            key for each AWS Region.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the connection
     * parameters for the endpoint.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then AWS DMS uses your default encryption key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            An AWS KMS key identifier that is used to encrypt the
     *            connection parameters for the endpoint.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>KmsKeyId</code>
     *            parameter, then AWS DMS uses your default encryption key.
     *            </p>
     *            <p>
     *            AWS KMS creates the default encryption key for your AWS
     *            account. Your AWS account has a different default encryption
     *            key for each AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) string that uniquely identifies
     *         the endpoint.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) used for SSL connection to the
     *         endpoint.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) used for SSL connection to the
     *            endpoint.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) used for SSL connection to the
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default value is
     * <code>none</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, require, verify-ca, verify-full
     *
     * @return <p>
     *         The SSL mode used to connect to the endpoint. The default value
     *         is <code>none</code>.
     *         </p>
     * @see DmsSslModeValue
     */
    public String getSslMode() {
        return sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default value is
     * <code>none</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, require, verify-ca, verify-full
     *
     * @param sslMode <p>
     *            The SSL mode used to connect to the endpoint. The default
     *            value is <code>none</code>.
     *            </p>
     * @see DmsSslModeValue
     */
    public void setSslMode(String sslMode) {
        this.sslMode = sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default value is
     * <code>none</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, require, verify-ca, verify-full
     *
     * @param sslMode <p>
     *            The SSL mode used to connect to the endpoint. The default
     *            value is <code>none</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DmsSslModeValue
     */
    public Endpoint withSslMode(String sslMode) {
        this.sslMode = sslMode;
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default value is
     * <code>none</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, require, verify-ca, verify-full
     *
     * @param sslMode <p>
     *            The SSL mode used to connect to the endpoint. The default
     *            value is <code>none</code>.
     *            </p>
     * @see DmsSslModeValue
     */
    public void setSslMode(DmsSslModeValue sslMode) {
        this.sslMode = sslMode.toString();
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default value is
     * <code>none</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, require, verify-ca, verify-full
     *
     * @param sslMode <p>
     *            The SSL mode used to connect to the endpoint. The default
     *            value is <code>none</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DmsSslModeValue
     */
    public Endpoint withSslMode(DmsSslModeValue sslMode) {
        this.sslMode = sslMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) used by the service access IAM
     *         role.
     *         </p>
     */
    public String getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) used by the service access IAM
     *            role.
     *            </p>
     */
    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) used by the service access IAM
     *            role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     *
     * @return <p>
     *         The external table definition.
     *         </p>
     */
    public String getExternalTableDefinition() {
        return externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     *
     * @param externalTableDefinition <p>
     *            The external table definition.
     *            </p>
     */
    public void setExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalTableDefinition <p>
     *            The external table definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
        return this;
    }

    /**
     * <p>
     * Value returned by a call to CreateEndpoint that can be used for
     * cross-account validation. Use it on a subsequent call to CreateEndpoint
     * to create the endpoint with a cross-account.
     * </p>
     *
     * @return <p>
     *         Value returned by a call to CreateEndpoint that can be used for
     *         cross-account validation. Use it on a subsequent call to
     *         CreateEndpoint to create the endpoint with a cross-account.
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * Value returned by a call to CreateEndpoint that can be used for
     * cross-account validation. Use it on a subsequent call to CreateEndpoint
     * to create the endpoint with a cross-account.
     * </p>
     *
     * @param externalId <p>
     *            Value returned by a call to CreateEndpoint that can be used
     *            for cross-account validation. Use it on a subsequent call to
     *            CreateEndpoint to create the endpoint with a cross-account.
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * Value returned by a call to CreateEndpoint that can be used for
     * cross-account validation. Use it on a subsequent call to CreateEndpoint
     * to create the endpoint with a cross-account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId <p>
     *            Value returned by a call to CreateEndpoint that can be used
     *            for cross-account validation. Use it on a subsequent call to
     *            CreateEndpoint to create the endpoint with a cross-account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * <p>
     * The settings for the target DynamoDB database. For more information, see
     * the <code>DynamoDBSettings</code> structure.
     * </p>
     *
     * @return <p>
     *         The settings for the target DynamoDB database. For more
     *         information, see the <code>DynamoDBSettings</code> structure.
     *         </p>
     */
    public DynamoDbSettings getDynamoDbSettings() {
        return dynamoDbSettings;
    }

    /**
     * <p>
     * The settings for the target DynamoDB database. For more information, see
     * the <code>DynamoDBSettings</code> structure.
     * </p>
     *
     * @param dynamoDbSettings <p>
     *            The settings for the target DynamoDB database. For more
     *            information, see the <code>DynamoDBSettings</code> structure.
     *            </p>
     */
    public void setDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        this.dynamoDbSettings = dynamoDbSettings;
    }

    /**
     * <p>
     * The settings for the target DynamoDB database. For more information, see
     * the <code>DynamoDBSettings</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDbSettings <p>
     *            The settings for the target DynamoDB database. For more
     *            information, see the <code>DynamoDBSettings</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        this.dynamoDbSettings = dynamoDbSettings;
        return this;
    }

    /**
     * <p>
     * The settings for the S3 target endpoint. For more information, see the
     * <code>S3Settings</code> structure.
     * </p>
     *
     * @return <p>
     *         The settings for the S3 target endpoint. For more information,
     *         see the <code>S3Settings</code> structure.
     *         </p>
     */
    public S3Settings getS3Settings() {
        return s3Settings;
    }

    /**
     * <p>
     * The settings for the S3 target endpoint. For more information, see the
     * <code>S3Settings</code> structure.
     * </p>
     *
     * @param s3Settings <p>
     *            The settings for the S3 target endpoint. For more information,
     *            see the <code>S3Settings</code> structure.
     *            </p>
     */
    public void setS3Settings(S3Settings s3Settings) {
        this.s3Settings = s3Settings;
    }

    /**
     * <p>
     * The settings for the S3 target endpoint. For more information, see the
     * <code>S3Settings</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Settings <p>
     *            The settings for the S3 target endpoint. For more information,
     *            see the <code>S3Settings</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withS3Settings(S3Settings s3Settings) {
        this.s3Settings = s3Settings;
        return this;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Possible settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ServiceAccessRoleArn</code> - The IAM role that has permission to
     * access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BucketName</code> - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CompressionType</code> - An optional parameter to use GZIP to
     * compress the target files. To use GZIP, set this value to
     * <code>NONE</code> (the default). To keep the files uncompressed, don't
     * use this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these settings is as follows:
     * <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     * </p>
     * <p>
     * JSON syntax for these settings is as follows:
     * <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * </p>
     *
     * @return <p>
     *         The settings in JSON format for the DMS transfer type of source
     *         endpoint.
     *         </p>
     *         <p>
     *         Possible settings include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ServiceAccessRoleArn</code> - The IAM role that has
     *         permission to access the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BucketName</code> - The name of the S3 bucket to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CompressionType</code> - An optional parameter to use GZIP
     *         to compress the target files. To use GZIP, set this value to
     *         <code>NONE</code> (the default). To keep the files uncompressed,
     *         don't use this value.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Shorthand syntax for these settings is as follows:
     *         <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     *         </p>
     *         <p>
     *         JSON syntax for these settings is as follows:
     *         <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     *         </p>
     */
    public DmsTransferSettings getDmsTransferSettings() {
        return dmsTransferSettings;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Possible settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ServiceAccessRoleArn</code> - The IAM role that has permission to
     * access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BucketName</code> - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CompressionType</code> - An optional parameter to use GZIP to
     * compress the target files. To use GZIP, set this value to
     * <code>NONE</code> (the default). To keep the files uncompressed, don't
     * use this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these settings is as follows:
     * <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     * </p>
     * <p>
     * JSON syntax for these settings is as follows:
     * <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * </p>
     *
     * @param dmsTransferSettings <p>
     *            The settings in JSON format for the DMS transfer type of
     *            source endpoint.
     *            </p>
     *            <p>
     *            Possible settings include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ServiceAccessRoleArn</code> - The IAM role that has
     *            permission to access the Amazon S3 bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BucketName</code> - The name of the S3 bucket to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CompressionType</code> - An optional parameter to use
     *            GZIP to compress the target files. To use GZIP, set this value
     *            to <code>NONE</code> (the default). To keep the files
     *            uncompressed, don't use this value.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Shorthand syntax for these settings is as follows:
     *            <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     *            </p>
     *            <p>
     *            JSON syntax for these settings is as follows:
     *            <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     *            </p>
     */
    public void setDmsTransferSettings(DmsTransferSettings dmsTransferSettings) {
        this.dmsTransferSettings = dmsTransferSettings;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Possible settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ServiceAccessRoleArn</code> - The IAM role that has permission to
     * access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BucketName</code> - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CompressionType</code> - An optional parameter to use GZIP to
     * compress the target files. To use GZIP, set this value to
     * <code>NONE</code> (the default). To keep the files uncompressed, don't
     * use this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these settings is as follows:
     * <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     * </p>
     * <p>
     * JSON syntax for these settings is as follows:
     * <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dmsTransferSettings <p>
     *            The settings in JSON format for the DMS transfer type of
     *            source endpoint.
     *            </p>
     *            <p>
     *            Possible settings include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ServiceAccessRoleArn</code> - The IAM role that has
     *            permission to access the Amazon S3 bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BucketName</code> - The name of the S3 bucket to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CompressionType</code> - An optional parameter to use
     *            GZIP to compress the target files. To use GZIP, set this value
     *            to <code>NONE</code> (the default). To keep the files
     *            uncompressed, don't use this value.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Shorthand syntax for these settings is as follows:
     *            <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     *            </p>
     *            <p>
     *            JSON syntax for these settings is as follows:
     *            <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withDmsTransferSettings(DmsTransferSettings dmsTransferSettings) {
        this.dmsTransferSettings = dmsTransferSettings;
        return this;
    }

    /**
     * <p>
     * The settings for the MongoDB source endpoint. For more information, see
     * the <code>MongoDbSettings</code> structure.
     * </p>
     *
     * @return <p>
     *         The settings for the MongoDB source endpoint. For more
     *         information, see the <code>MongoDbSettings</code> structure.
     *         </p>
     */
    public MongoDbSettings getMongoDbSettings() {
        return mongoDbSettings;
    }

    /**
     * <p>
     * The settings for the MongoDB source endpoint. For more information, see
     * the <code>MongoDbSettings</code> structure.
     * </p>
     *
     * @param mongoDbSettings <p>
     *            The settings for the MongoDB source endpoint. For more
     *            information, see the <code>MongoDbSettings</code> structure.
     *            </p>
     */
    public void setMongoDbSettings(MongoDbSettings mongoDbSettings) {
        this.mongoDbSettings = mongoDbSettings;
    }

    /**
     * <p>
     * The settings for the MongoDB source endpoint. For more information, see
     * the <code>MongoDbSettings</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mongoDbSettings <p>
     *            The settings for the MongoDB source endpoint. For more
     *            information, see the <code>MongoDbSettings</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withMongoDbSettings(MongoDbSettings mongoDbSettings) {
        this.mongoDbSettings = mongoDbSettings;
        return this;
    }

    /**
     * <p>
     * The settings for the Amazon Kinesis target endpoint. For more
     * information, see the <code>KinesisSettings</code> structure.
     * </p>
     *
     * @return <p>
     *         The settings for the Amazon Kinesis target endpoint. For more
     *         information, see the <code>KinesisSettings</code> structure.
     *         </p>
     */
    public KinesisSettings getKinesisSettings() {
        return kinesisSettings;
    }

    /**
     * <p>
     * The settings for the Amazon Kinesis target endpoint. For more
     * information, see the <code>KinesisSettings</code> structure.
     * </p>
     *
     * @param kinesisSettings <p>
     *            The settings for the Amazon Kinesis target endpoint. For more
     *            information, see the <code>KinesisSettings</code> structure.
     *            </p>
     */
    public void setKinesisSettings(KinesisSettings kinesisSettings) {
        this.kinesisSettings = kinesisSettings;
    }

    /**
     * <p>
     * The settings for the Amazon Kinesis target endpoint. For more
     * information, see the <code>KinesisSettings</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisSettings <p>
     *            The settings for the Amazon Kinesis target endpoint. For more
     *            information, see the <code>KinesisSettings</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withKinesisSettings(KinesisSettings kinesisSettings) {
        this.kinesisSettings = kinesisSettings;
        return this;
    }

    /**
     * <p>
     * The settings for the Apache Kafka target endpoint. For more information,
     * see the <code>KafkaSettings</code> structure.
     * </p>
     *
     * @return <p>
     *         The settings for the Apache Kafka target endpoint. For more
     *         information, see the <code>KafkaSettings</code> structure.
     *         </p>
     */
    public KafkaSettings getKafkaSettings() {
        return kafkaSettings;
    }

    /**
     * <p>
     * The settings for the Apache Kafka target endpoint. For more information,
     * see the <code>KafkaSettings</code> structure.
     * </p>
     *
     * @param kafkaSettings <p>
     *            The settings for the Apache Kafka target endpoint. For more
     *            information, see the <code>KafkaSettings</code> structure.
     *            </p>
     */
    public void setKafkaSettings(KafkaSettings kafkaSettings) {
        this.kafkaSettings = kafkaSettings;
    }

    /**
     * <p>
     * The settings for the Apache Kafka target endpoint. For more information,
     * see the <code>KafkaSettings</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafkaSettings <p>
     *            The settings for the Apache Kafka target endpoint. For more
     *            information, see the <code>KafkaSettings</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withKafkaSettings(KafkaSettings kafkaSettings) {
        this.kafkaSettings = kafkaSettings;
        return this;
    }

    /**
     * <p>
     * The settings for the Elasticsearch source endpoint. For more information,
     * see the <code>ElasticsearchSettings</code> structure.
     * </p>
     *
     * @return <p>
     *         The settings for the Elasticsearch source endpoint. For more
     *         information, see the <code>ElasticsearchSettings</code>
     *         structure.
     *         </p>
     */
    public ElasticsearchSettings getElasticsearchSettings() {
        return elasticsearchSettings;
    }

    /**
     * <p>
     * The settings for the Elasticsearch source endpoint. For more information,
     * see the <code>ElasticsearchSettings</code> structure.
     * </p>
     *
     * @param elasticsearchSettings <p>
     *            The settings for the Elasticsearch source endpoint. For more
     *            information, see the <code>ElasticsearchSettings</code>
     *            structure.
     *            </p>
     */
    public void setElasticsearchSettings(ElasticsearchSettings elasticsearchSettings) {
        this.elasticsearchSettings = elasticsearchSettings;
    }

    /**
     * <p>
     * The settings for the Elasticsearch source endpoint. For more information,
     * see the <code>ElasticsearchSettings</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchSettings <p>
     *            The settings for the Elasticsearch source endpoint. For more
     *            information, see the <code>ElasticsearchSettings</code>
     *            structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withElasticsearchSettings(ElasticsearchSettings elasticsearchSettings) {
        this.elasticsearchSettings = elasticsearchSettings;
        return this;
    }

    /**
     * <p>
     * The settings for the Amazon Neptune target endpoint. For more
     * information, see the <code>NeptuneSettings</code> structure.
     * </p>
     *
     * @return <p>
     *         The settings for the Amazon Neptune target endpoint. For more
     *         information, see the <code>NeptuneSettings</code> structure.
     *         </p>
     */
    public NeptuneSettings getNeptuneSettings() {
        return neptuneSettings;
    }

    /**
     * <p>
     * The settings for the Amazon Neptune target endpoint. For more
     * information, see the <code>NeptuneSettings</code> structure.
     * </p>
     *
     * @param neptuneSettings <p>
     *            The settings for the Amazon Neptune target endpoint. For more
     *            information, see the <code>NeptuneSettings</code> structure.
     *            </p>
     */
    public void setNeptuneSettings(NeptuneSettings neptuneSettings) {
        this.neptuneSettings = neptuneSettings;
    }

    /**
     * <p>
     * The settings for the Amazon Neptune target endpoint. For more
     * information, see the <code>NeptuneSettings</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neptuneSettings <p>
     *            The settings for the Amazon Neptune target endpoint. For more
     *            information, see the <code>NeptuneSettings</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withNeptuneSettings(NeptuneSettings neptuneSettings) {
        this.neptuneSettings = neptuneSettings;
        return this;
    }

    /**
     * <p>
     * Settings for the Amazon Redshift endpoint.
     * </p>
     *
     * @return <p>
     *         Settings for the Amazon Redshift endpoint.
     *         </p>
     */
    public RedshiftSettings getRedshiftSettings() {
        return redshiftSettings;
    }

    /**
     * <p>
     * Settings for the Amazon Redshift endpoint.
     * </p>
     *
     * @param redshiftSettings <p>
     *            Settings for the Amazon Redshift endpoint.
     *            </p>
     */
    public void setRedshiftSettings(RedshiftSettings redshiftSettings) {
        this.redshiftSettings = redshiftSettings;
    }

    /**
     * <p>
     * Settings for the Amazon Redshift endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redshiftSettings <p>
     *            Settings for the Amazon Redshift endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withRedshiftSettings(RedshiftSettings redshiftSettings) {
        this.redshiftSettings = redshiftSettings;
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
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: " + getEndpointIdentifier() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getEngineDisplayName() != null)
            sb.append("EngineDisplayName: " + getEngineDisplayName() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getExtraConnectionAttributes() != null)
            sb.append("ExtraConnectionAttributes: " + getExtraConnectionAttributes() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getSslMode() != null)
            sb.append("SslMode: " + getSslMode() + ",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: " + getServiceAccessRoleArn() + ",");
        if (getExternalTableDefinition() != null)
            sb.append("ExternalTableDefinition: " + getExternalTableDefinition() + ",");
        if (getExternalId() != null)
            sb.append("ExternalId: " + getExternalId() + ",");
        if (getDynamoDbSettings() != null)
            sb.append("DynamoDbSettings: " + getDynamoDbSettings() + ",");
        if (getS3Settings() != null)
            sb.append("S3Settings: " + getS3Settings() + ",");
        if (getDmsTransferSettings() != null)
            sb.append("DmsTransferSettings: " + getDmsTransferSettings() + ",");
        if (getMongoDbSettings() != null)
            sb.append("MongoDbSettings: " + getMongoDbSettings() + ",");
        if (getKinesisSettings() != null)
            sb.append("KinesisSettings: " + getKinesisSettings() + ",");
        if (getKafkaSettings() != null)
            sb.append("KafkaSettings: " + getKafkaSettings() + ",");
        if (getElasticsearchSettings() != null)
            sb.append("ElasticsearchSettings: " + getElasticsearchSettings() + ",");
        if (getNeptuneSettings() != null)
            sb.append("NeptuneSettings: " + getNeptuneSettings() + ",");
        if (getRedshiftSettings() != null)
            sb.append("RedshiftSettings: " + getRedshiftSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode
                + ((getEngineDisplayName() == null) ? 0 : getEngineDisplayName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime
                * hashCode
                + ((getExtraConnectionAttributes() == null) ? 0 : getExtraConnectionAttributes()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        hashCode = prime * hashCode
                + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getExternalTableDefinition() == null) ? 0 : getExternalTableDefinition()
                        .hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode
                + ((getDynamoDbSettings() == null) ? 0 : getDynamoDbSettings().hashCode());
        hashCode = prime * hashCode + ((getS3Settings() == null) ? 0 : getS3Settings().hashCode());
        hashCode = prime * hashCode
                + ((getDmsTransferSettings() == null) ? 0 : getDmsTransferSettings().hashCode());
        hashCode = prime * hashCode
                + ((getMongoDbSettings() == null) ? 0 : getMongoDbSettings().hashCode());
        hashCode = prime * hashCode
                + ((getKinesisSettings() == null) ? 0 : getKinesisSettings().hashCode());
        hashCode = prime * hashCode
                + ((getKafkaSettings() == null) ? 0 : getKafkaSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticsearchSettings() == null) ? 0 : getElasticsearchSettings().hashCode());
        hashCode = prime * hashCode
                + ((getNeptuneSettings() == null) ? 0 : getNeptuneSettings().hashCode());
        hashCode = prime * hashCode
                + ((getRedshiftSettings() == null) ? 0 : getRedshiftSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;

        if (other.getEndpointIdentifier() == null ^ this.getEndpointIdentifier() == null)
            return false;
        if (other.getEndpointIdentifier() != null
                && other.getEndpointIdentifier().equals(this.getEndpointIdentifier()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null
                && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null
                && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getEngineDisplayName() == null ^ this.getEngineDisplayName() == null)
            return false;
        if (other.getEngineDisplayName() != null
                && other.getEngineDisplayName().equals(this.getEngineDisplayName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getExtraConnectionAttributes() == null
                ^ this.getExtraConnectionAttributes() == null)
            return false;
        if (other.getExtraConnectionAttributes() != null
                && other.getExtraConnectionAttributes().equals(this.getExtraConnectionAttributes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getSslMode() == null ^ this.getSslMode() == null)
            return false;
        if (other.getSslMode() != null && other.getSslMode().equals(this.getSslMode()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null
                && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getExternalTableDefinition() == null ^ this.getExternalTableDefinition() == null)
            return false;
        if (other.getExternalTableDefinition() != null
                && other.getExternalTableDefinition().equals(this.getExternalTableDefinition()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getDynamoDbSettings() == null ^ this.getDynamoDbSettings() == null)
            return false;
        if (other.getDynamoDbSettings() != null
                && other.getDynamoDbSettings().equals(this.getDynamoDbSettings()) == false)
            return false;
        if (other.getS3Settings() == null ^ this.getS3Settings() == null)
            return false;
        if (other.getS3Settings() != null
                && other.getS3Settings().equals(this.getS3Settings()) == false)
            return false;
        if (other.getDmsTransferSettings() == null ^ this.getDmsTransferSettings() == null)
            return false;
        if (other.getDmsTransferSettings() != null
                && other.getDmsTransferSettings().equals(this.getDmsTransferSettings()) == false)
            return false;
        if (other.getMongoDbSettings() == null ^ this.getMongoDbSettings() == null)
            return false;
        if (other.getMongoDbSettings() != null
                && other.getMongoDbSettings().equals(this.getMongoDbSettings()) == false)
            return false;
        if (other.getKinesisSettings() == null ^ this.getKinesisSettings() == null)
            return false;
        if (other.getKinesisSettings() != null
                && other.getKinesisSettings().equals(this.getKinesisSettings()) == false)
            return false;
        if (other.getKafkaSettings() == null ^ this.getKafkaSettings() == null)
            return false;
        if (other.getKafkaSettings() != null
                && other.getKafkaSettings().equals(this.getKafkaSettings()) == false)
            return false;
        if (other.getElasticsearchSettings() == null ^ this.getElasticsearchSettings() == null)
            return false;
        if (other.getElasticsearchSettings() != null
                && other.getElasticsearchSettings().equals(this.getElasticsearchSettings()) == false)
            return false;
        if (other.getNeptuneSettings() == null ^ this.getNeptuneSettings() == null)
            return false;
        if (other.getNeptuneSettings() != null
                && other.getNeptuneSettings().equals(this.getNeptuneSettings()) == false)
            return false;
        if (other.getRedshiftSettings() == null ^ this.getRedshiftSettings() == null)
            return false;
        if (other.getRedshiftSettings() != null
                && other.getRedshiftSettings().equals(this.getRedshiftSettings()) == false)
            return false;
        return true;
    }
}
