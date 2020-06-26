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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the specified endpoint.
 * </p>
 */
public class ModifyEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     */
    private String endpointArn;

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
     * The type of engine for the endpoint. Valid values, depending on the
     * EndpointType, include <code>"mysql"</code>, <code>"oracle"</code>,
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
     * The user name to be used to login to the endpoint database.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * Additional attributes associated with the connection. To reset this
     * parameter, pass the empty string ("") as an argument.
     * </p>
     */
    private String extraConnectionAttributes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL
     * connection.
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
     * The Amazon Resource Name (ARN) for the service access role you want to
     * use to modify the endpoint.
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
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For
     * information about other available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"
     * >Using Object Mapping to Migrate Data to DynamoDB</a> in the <i>AWS
     * Database Migration Service User Guide.</i>
     * </p>
     */
    private DynamoDbSettings dynamoDbSettings;

    /**
     * <p>
     * Settings in JSON format for the target Amazon S3 endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     * >Extra Connection Attributes When Using Amazon S3 as a Target for AWS
     * DMS</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     */
    private S3Settings s3Settings;

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * serviceAccessRoleArn - The AWS Identity and Access Management (IAM) role
     * that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * BucketName - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * compressionType - An optional parameter to use GZIP to compress the
     * target files. Either set this parameter to NONE (the default) or don't
     * use it to leave the files uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these settings is as follows:
     * <code>ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string</code>
     * </p>
     * <p>
     * JSON syntax for these settings is as follows:
     * <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * </p>
     */
    private DmsTransferSettings dmsTransferSettings;

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more
     * information about the available settings, see the configuration
     * properties section in <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"
     * > Using MongoDB as a Target for AWS Database Migration Service</a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     */
    private MongoDbSettings mongoDbSettings;

    /**
     * <p>
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data
     * Streams. For more information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html"
     * >Using Amazon Kinesis Data Streams as a Target for AWS Database Migration
     * Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     */
    private KinesisSettings kinesisSettings;

    /**
     * <p>
     * Settings in JSON format for the target Apache Kafka endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html"
     * >Using Apache Kafka as a Target for AWS Database Migration Service</a> in
     * the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     */
    private KafkaSettings kafkaSettings;

    /**
     * <p>
     * Settings in JSON format for the target Elasticsearch endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     * >Extra Connection Attributes When Using Elasticsearch as a Target for AWS
     * DMS</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     */
    private ElasticsearchSettings elasticsearchSettings;

    /**
     * <p>
     * Settings in JSON format for the target Amazon Neptune endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings"
     * >Specifying Endpoint Settings for Amazon Neptune as a Target</a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     */
    private NeptuneSettings neptuneSettings;

    /**
     * <p>
     * Provides information that defines an Amazon Redshift endpoint.
     * </p>
     */
    private RedshiftSettings redshiftSettings;

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
    public ModifyEndpointRequest withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

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
    public ModifyEndpointRequest withEndpointIdentifier(String endpointIdentifier) {
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
    public ModifyEndpointRequest withEndpointType(String endpointType) {
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
    public ModifyEndpointRequest withEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the
     * EndpointType, include <code>"mysql"</code>, <code>"oracle"</code>,
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
     *         The type of engine for the endpoint. Valid values, depending on
     *         the EndpointType, include <code>"mysql"</code>,
     *         <code>"oracle"</code>, <code>"postgres"</code>,
     *         <code>"mariadb"</code>, <code>"aurora"</code>,
     *         <code>"aurora-postgresql"</code>, <code>"redshift"</code>,
     *         <code>"s3"</code>, <code>"db2"</code>, <code>"azuredb"</code>,
     *         <code>"sybase"</code>, <code>"dynamodb"</code>,
     *         <code>"mongodb"</code>, <code>"kinesis"</code>,
     *         <code>"kafka"</code>, <code>"elasticsearch"</code>,
     *         <code>"documentdb"</code>, <code>"sqlserver"</code>, and
     *         <code>"neptune"</code>.
     *         </p>
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the
     * EndpointType, include <code>"mysql"</code>, <code>"oracle"</code>,
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
     *            The type of engine for the endpoint. Valid values, depending
     *            on the EndpointType, include <code>"mysql"</code>,
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
     * The type of engine for the endpoint. Valid values, depending on the
     * EndpointType, include <code>"mysql"</code>, <code>"oracle"</code>,
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
     *            The type of engine for the endpoint. Valid values, depending
     *            on the EndpointType, include <code>"mysql"</code>,
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
    public ModifyEndpointRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     *
     * @return <p>
     *         The user name to be used to login to the endpoint database.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     *
     * @param username <p>
     *            The user name to be used to login to the endpoint database.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            The user name to be used to login to the endpoint database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     *
     * @return <p>
     *         The password to be used to login to the endpoint database.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     *
     * @param password <p>
     *            The password to be used to login to the endpoint database.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param password <p>
     *            The password to be used to login to the endpoint database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     *
     * @return <p>
     *         The name of the server where the endpoint database resides.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     *
     * @param serverName <p>
     *            The name of the server where the endpoint database resides.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverName <p>
     *            The name of the server where the endpoint database resides.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     *
     * @return <p>
     *         The port used by the endpoint database.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     *
     * @param port <p>
     *            The port used by the endpoint database.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port used by the endpoint database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     *
     * @return <p>
     *         The name of the endpoint database.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     *
     * @param databaseName <p>
     *            The name of the endpoint database.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The name of the endpoint database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * Additional attributes associated with the connection. To reset this
     * parameter, pass the empty string ("") as an argument.
     * </p>
     *
     * @return <p>
     *         Additional attributes associated with the connection. To reset
     *         this parameter, pass the empty string ("") as an argument.
     *         </p>
     */
    public String getExtraConnectionAttributes() {
        return extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection. To reset this
     * parameter, pass the empty string ("") as an argument.
     * </p>
     *
     * @param extraConnectionAttributes <p>
     *            Additional attributes associated with the connection. To reset
     *            this parameter, pass the empty string ("") as an argument.
     *            </p>
     */
    public void setExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection. To reset this
     * parameter, pass the empty string ("") as an argument.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraConnectionAttributes <p>
     *            Additional attributes associated with the connection. To reset
     *            this parameter, pass the empty string ("") as an argument.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL
     * connection.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the certificate used for SSL
     *         connection.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL
     * connection.
     * </p>
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) of the certificate used for SSL
     *            connection.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL
     * connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) of the certificate used for SSL
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withCertificateArn(String certificateArn) {
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
    public ModifyEndpointRequest withSslMode(String sslMode) {
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
    public ModifyEndpointRequest withSslMode(DmsSslModeValue sslMode) {
        this.sslMode = sslMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the service access role you want to
     * use to modify the endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the service access role you
     *         want to use to modify the endpoint.
     *         </p>
     */
    public String getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the service access role you want to
     * use to modify the endpoint.
     * </p>
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) for the service access role you
     *            want to use to modify the endpoint.
     *            </p>
     */
    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the service access role you want to
     * use to modify the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) for the service access role you
     *            want to use to modify the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withServiceAccessRoleArn(String serviceAccessRoleArn) {
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
    public ModifyEndpointRequest withExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For
     * information about other available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"
     * >Using Object Mapping to Migrate Data to DynamoDB</a> in the <i>AWS
     * Database Migration Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Settings in JSON format for the target Amazon DynamoDB endpoint.
     *         For information about other available settings, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"
     *         >Using Object Mapping to Migrate Data to DynamoDB</a> in the
     *         <i>AWS Database Migration Service User Guide.</i>
     *         </p>
     */
    public DynamoDbSettings getDynamoDbSettings() {
        return dynamoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For
     * information about other available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"
     * >Using Object Mapping to Migrate Data to DynamoDB</a> in the <i>AWS
     * Database Migration Service User Guide.</i>
     * </p>
     *
     * @param dynamoDbSettings <p>
     *            Settings in JSON format for the target Amazon DynamoDB
     *            endpoint. For information about other available settings, see
     *            <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"
     *            >Using Object Mapping to Migrate Data to DynamoDB</a> in the
     *            <i>AWS Database Migration Service User Guide.</i>
     *            </p>
     */
    public void setDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        this.dynamoDbSettings = dynamoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For
     * information about other available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"
     * >Using Object Mapping to Migrate Data to DynamoDB</a> in the <i>AWS
     * Database Migration Service User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDbSettings <p>
     *            Settings in JSON format for the target Amazon DynamoDB
     *            endpoint. For information about other available settings, see
     *            <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"
     *            >Using Object Mapping to Migrate Data to DynamoDB</a> in the
     *            <i>AWS Database Migration Service User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        this.dynamoDbSettings = dynamoDbSettings;
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon S3 endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     * >Extra Connection Attributes When Using Amazon S3 as a Target for AWS
     * DMS</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Settings in JSON format for the target Amazon S3 endpoint. For
     *         more information about the available settings, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     *         >Extra Connection Attributes When Using Amazon S3 as a Target for
     *         AWS DMS</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>
     *         </p>
     */
    public S3Settings getS3Settings() {
        return s3Settings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon S3 endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     * >Extra Connection Attributes When Using Amazon S3 as a Target for AWS
     * DMS</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @param s3Settings <p>
     *            Settings in JSON format for the target Amazon S3 endpoint. For
     *            more information about the available settings, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     *            >Extra Connection Attributes When Using Amazon S3 as a Target
     *            for AWS DMS</a> in the <i>AWS Database Migration Service User
     *            Guide.</i>
     *            </p>
     */
    public void setS3Settings(S3Settings s3Settings) {
        this.s3Settings = s3Settings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon S3 endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     * >Extra Connection Attributes When Using Amazon S3 as a Target for AWS
     * DMS</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Settings <p>
     *            Settings in JSON format for the target Amazon S3 endpoint. For
     *            more information about the available settings, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring"
     *            >Extra Connection Attributes When Using Amazon S3 as a Target
     *            for AWS DMS</a> in the <i>AWS Database Migration Service User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withS3Settings(S3Settings s3Settings) {
        this.s3Settings = s3Settings;
        return this;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * serviceAccessRoleArn - The AWS Identity and Access Management (IAM) role
     * that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * BucketName - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * compressionType - An optional parameter to use GZIP to compress the
     * target files. Either set this parameter to NONE (the default) or don't
     * use it to leave the files uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these settings is as follows:
     * <code>ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string</code>
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
     *         Attributes include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         serviceAccessRoleArn - The AWS Identity and Access Management
     *         (IAM) role that has permission to access the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BucketName - The name of the S3 bucket to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         compressionType - An optional parameter to use GZIP to compress
     *         the target files. Either set this parameter to NONE (the default)
     *         or don't use it to leave the files uncompressed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Shorthand syntax for these settings is as follows:
     *         <code>ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string</code>
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
     * Attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * serviceAccessRoleArn - The AWS Identity and Access Management (IAM) role
     * that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * BucketName - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * compressionType - An optional parameter to use GZIP to compress the
     * target files. Either set this parameter to NONE (the default) or don't
     * use it to leave the files uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these settings is as follows:
     * <code>ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string</code>
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
     *            Attributes include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            serviceAccessRoleArn - The AWS Identity and Access Management
     *            (IAM) role that has permission to access the Amazon S3 bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            BucketName - The name of the S3 bucket to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            compressionType - An optional parameter to use GZIP to
     *            compress the target files. Either set this parameter to NONE
     *            (the default) or don't use it to leave the files uncompressed.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Shorthand syntax for these settings is as follows:
     *            <code>ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string</code>
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
     * Attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * serviceAccessRoleArn - The AWS Identity and Access Management (IAM) role
     * that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * BucketName - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * compressionType - An optional parameter to use GZIP to compress the
     * target files. Either set this parameter to NONE (the default) or don't
     * use it to leave the files uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these settings is as follows:
     * <code>ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string</code>
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
     *            Attributes include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            serviceAccessRoleArn - The AWS Identity and Access Management
     *            (IAM) role that has permission to access the Amazon S3 bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            BucketName - The name of the S3 bucket to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            compressionType - An optional parameter to use GZIP to
     *            compress the target files. Either set this parameter to NONE
     *            (the default) or don't use it to leave the files uncompressed.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Shorthand syntax for these settings is as follows:
     *            <code>ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string</code>
     *            </p>
     *            <p>
     *            JSON syntax for these settings is as follows:
     *            <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withDmsTransferSettings(DmsTransferSettings dmsTransferSettings) {
        this.dmsTransferSettings = dmsTransferSettings;
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more
     * information about the available settings, see the configuration
     * properties section in <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"
     * > Using MongoDB as a Target for AWS Database Migration Service</a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Settings in JSON format for the source MongoDB endpoint. For more
     *         information about the available settings, see the configuration
     *         properties section in <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"
     *         > Using MongoDB as a Target for AWS Database Migration
     *         Service</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>
     *         </p>
     */
    public MongoDbSettings getMongoDbSettings() {
        return mongoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more
     * information about the available settings, see the configuration
     * properties section in <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"
     * > Using MongoDB as a Target for AWS Database Migration Service</a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @param mongoDbSettings <p>
     *            Settings in JSON format for the source MongoDB endpoint. For
     *            more information about the available settings, see the
     *            configuration properties section in <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"
     *            > Using MongoDB as a Target for AWS Database Migration
     *            Service</a> in the <i>AWS Database Migration Service User
     *            Guide.</i>
     *            </p>
     */
    public void setMongoDbSettings(MongoDbSettings mongoDbSettings) {
        this.mongoDbSettings = mongoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more
     * information about the available settings, see the configuration
     * properties section in <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"
     * > Using MongoDB as a Target for AWS Database Migration Service</a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mongoDbSettings <p>
     *            Settings in JSON format for the source MongoDB endpoint. For
     *            more information about the available settings, see the
     *            configuration properties section in <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"
     *            > Using MongoDB as a Target for AWS Database Migration
     *            Service</a> in the <i>AWS Database Migration Service User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withMongoDbSettings(MongoDbSettings mongoDbSettings) {
        this.mongoDbSettings = mongoDbSettings;
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data
     * Streams. For more information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html"
     * >Using Amazon Kinesis Data Streams as a Target for AWS Database Migration
     * Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Settings in JSON format for the target endpoint for Amazon
     *         Kinesis Data Streams. For more information about the available
     *         settings, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html"
     *         >Using Amazon Kinesis Data Streams as a Target for AWS Database
     *         Migration Service</a> in the <i>AWS Database Migration Service
     *         User Guide.</i>
     *         </p>
     */
    public KinesisSettings getKinesisSettings() {
        return kinesisSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data
     * Streams. For more information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html"
     * >Using Amazon Kinesis Data Streams as a Target for AWS Database Migration
     * Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @param kinesisSettings <p>
     *            Settings in JSON format for the target endpoint for Amazon
     *            Kinesis Data Streams. For more information about the available
     *            settings, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html"
     *            >Using Amazon Kinesis Data Streams as a Target for AWS
     *            Database Migration Service</a> in the <i>AWS Database
     *            Migration Service User Guide.</i>
     *            </p>
     */
    public void setKinesisSettings(KinesisSettings kinesisSettings) {
        this.kinesisSettings = kinesisSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data
     * Streams. For more information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html"
     * >Using Amazon Kinesis Data Streams as a Target for AWS Database Migration
     * Service</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisSettings <p>
     *            Settings in JSON format for the target endpoint for Amazon
     *            Kinesis Data Streams. For more information about the available
     *            settings, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html"
     *            >Using Amazon Kinesis Data Streams as a Target for AWS
     *            Database Migration Service</a> in the <i>AWS Database
     *            Migration Service User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withKinesisSettings(KinesisSettings kinesisSettings) {
        this.kinesisSettings = kinesisSettings;
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Apache Kafka endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html"
     * >Using Apache Kafka as a Target for AWS Database Migration Service</a> in
     * the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Settings in JSON format for the target Apache Kafka endpoint. For
     *         more information about the available settings, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html"
     *         >Using Apache Kafka as a Target for AWS Database Migration
     *         Service</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>
     *         </p>
     */
    public KafkaSettings getKafkaSettings() {
        return kafkaSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Apache Kafka endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html"
     * >Using Apache Kafka as a Target for AWS Database Migration Service</a> in
     * the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @param kafkaSettings <p>
     *            Settings in JSON format for the target Apache Kafka endpoint.
     *            For more information about the available settings, see <a
     *            href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html"
     *            >Using Apache Kafka as a Target for AWS Database Migration
     *            Service</a> in the <i>AWS Database Migration Service User
     *            Guide.</i>
     *            </p>
     */
    public void setKafkaSettings(KafkaSettings kafkaSettings) {
        this.kafkaSettings = kafkaSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Apache Kafka endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html"
     * >Using Apache Kafka as a Target for AWS Database Migration Service</a> in
     * the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafkaSettings <p>
     *            Settings in JSON format for the target Apache Kafka endpoint.
     *            For more information about the available settings, see <a
     *            href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html"
     *            >Using Apache Kafka as a Target for AWS Database Migration
     *            Service</a> in the <i>AWS Database Migration Service User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withKafkaSettings(KafkaSettings kafkaSettings) {
        this.kafkaSettings = kafkaSettings;
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Elasticsearch endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     * >Extra Connection Attributes When Using Elasticsearch as a Target for AWS
     * DMS</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Settings in JSON format for the target Elasticsearch endpoint.
     *         For more information about the available settings, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     *         >Extra Connection Attributes When Using Elasticsearch as a Target
     *         for AWS DMS</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>
     *         </p>
     */
    public ElasticsearchSettings getElasticsearchSettings() {
        return elasticsearchSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Elasticsearch endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     * >Extra Connection Attributes When Using Elasticsearch as a Target for AWS
     * DMS</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @param elasticsearchSettings <p>
     *            Settings in JSON format for the target Elasticsearch endpoint.
     *            For more information about the available settings, see <a
     *            href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     *            >Extra Connection Attributes When Using Elasticsearch as a
     *            Target for AWS DMS</a> in the <i>AWS Database Migration
     *            Service User Guide.</i>
     *            </p>
     */
    public void setElasticsearchSettings(ElasticsearchSettings elasticsearchSettings) {
        this.elasticsearchSettings = elasticsearchSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Elasticsearch endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     * >Extra Connection Attributes When Using Elasticsearch as a Target for AWS
     * DMS</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchSettings <p>
     *            Settings in JSON format for the target Elasticsearch endpoint.
     *            For more information about the available settings, see <a
     *            href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration"
     *            >Extra Connection Attributes When Using Elasticsearch as a
     *            Target for AWS DMS</a> in the <i>AWS Database Migration
     *            Service User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withElasticsearchSettings(
            ElasticsearchSettings elasticsearchSettings) {
        this.elasticsearchSettings = elasticsearchSettings;
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon Neptune endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings"
     * >Specifying Endpoint Settings for Amazon Neptune as a Target</a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Settings in JSON format for the target Amazon Neptune endpoint.
     *         For more information about the available settings, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings"
     *         >Specifying Endpoint Settings for Amazon Neptune as a Target</a>
     *         in the <i>AWS Database Migration Service User Guide.</i>
     *         </p>
     */
    public NeptuneSettings getNeptuneSettings() {
        return neptuneSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon Neptune endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings"
     * >Specifying Endpoint Settings for Amazon Neptune as a Target</a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     *
     * @param neptuneSettings <p>
     *            Settings in JSON format for the target Amazon Neptune
     *            endpoint. For more information about the available settings,
     *            see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings"
     *            >Specifying Endpoint Settings for Amazon Neptune as a
     *            Target</a> in the <i>AWS Database Migration Service User
     *            Guide.</i>
     *            </p>
     */
    public void setNeptuneSettings(NeptuneSettings neptuneSettings) {
        this.neptuneSettings = neptuneSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon Neptune endpoint. For more
     * information about the available settings, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings"
     * >Specifying Endpoint Settings for Amazon Neptune as a Target</a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neptuneSettings <p>
     *            Settings in JSON format for the target Amazon Neptune
     *            endpoint. For more information about the available settings,
     *            see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings"
     *            >Specifying Endpoint Settings for Amazon Neptune as a
     *            Target</a> in the <i>AWS Database Migration Service User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withNeptuneSettings(NeptuneSettings neptuneSettings) {
        this.neptuneSettings = neptuneSettings;
        return this;
    }

    /**
     * <p>
     * Provides information that defines an Amazon Redshift endpoint.
     * </p>
     *
     * @return <p>
     *         Provides information that defines an Amazon Redshift endpoint.
     *         </p>
     */
    public RedshiftSettings getRedshiftSettings() {
        return redshiftSettings;
    }

    /**
     * <p>
     * Provides information that defines an Amazon Redshift endpoint.
     * </p>
     *
     * @param redshiftSettings <p>
     *            Provides information that defines an Amazon Redshift endpoint.
     *            </p>
     */
    public void setRedshiftSettings(RedshiftSettings redshiftSettings) {
        this.redshiftSettings = redshiftSettings;
    }

    /**
     * <p>
     * Provides information that defines an Amazon Redshift endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redshiftSettings <p>
     *            Provides information that defines an Amazon Redshift endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointRequest withRedshiftSettings(RedshiftSettings redshiftSettings) {
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: " + getEndpointIdentifier() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getExtraConnectionAttributes() != null)
            sb.append("ExtraConnectionAttributes: " + getExtraConnectionAttributes() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getSslMode() != null)
            sb.append("SslMode: " + getSslMode() + ",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: " + getServiceAccessRoleArn() + ",");
        if (getExternalTableDefinition() != null)
            sb.append("ExternalTableDefinition: " + getExternalTableDefinition() + ",");
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
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime
                * hashCode
                + ((getExtraConnectionAttributes() == null) ? 0 : getExtraConnectionAttributes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        hashCode = prime * hashCode
                + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getExternalTableDefinition() == null) ? 0 : getExternalTableDefinition()
                        .hashCode());
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

        if (obj instanceof ModifyEndpointRequest == false)
            return false;
        ModifyEndpointRequest other = (ModifyEndpointRequest) obj;

        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
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
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
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
