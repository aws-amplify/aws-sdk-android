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
 * Defines a connection to a data source.
 * </p>
 */
public class Connection implements Serializable {
    /**
     * <p>
     * The name of the connection definition.
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
     * The type of the connection. Currently, only JDBC is supported; SFTP is
     * not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB, KAFKA
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
     * These key-value pairs define parameters for the connection:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST</code> - The host URI: either the fully qualified domain name
     * (FQDN) or the IPv4 address of the database host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT</code> - The port number, between 1024 and 65535, of the port
     * on which the database host is listening for database connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NAME</code> - The name under which to log in to the database.
     * The value string for <code>USER_NAME</code> is "<code>USERNAME</code>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD</code> - A password, if one is used, for the user name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENCRYPTED_PASSWORD</code> - When you enable connection password
     * protection by setting <code>ConnectionPasswordEncryption</code> in the
     * Data Catalog encryption settings, this field stores the encrypted
     * password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_JAR_URI</code> - The Amazon Simple Storage Service
     * (Amazon S3) path of the JAR file that contains the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver
     * to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_FILES</code> - (Reserved for future use.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_ID</code> - The instance ID to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_CONNECTION_URL</code> - The URL for connecting to a JDBC data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying
     * whether Secure Sockets Layer (SSL) with hostname matching is enforced for
     * the JDBC connection on the client. The default is false.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT</code> - An Amazon S3 location specifying the
     * customer's root certificate. AWS Glue uses this root certificate to
     * validate the customer’s certificate when connecting to the customer
     * database. AWS Glue only handles X.509 certificates. The certificate
     * provided must be DER-encoded and supplied in Base64 encoding PEM format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code> - By default, this is
     * <code>false</code>. AWS Glue validates the Signature algorithm and
     * Subject Public Key Algorithm for the customer certificate. The only
     * permitted algorithms for the Signature algorithm are SHA256withRSA,
     * SHA384withRSA or SHA512withRSA. For the Subject Public Key Algorithm, the
     * key length must be at least 2048. You can set the value of this property
     * to <code>true</code> to skip AWS Glue’s validation of the customer
     * certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT_STRING</code> - A custom JDBC certificate string
     * which is used for domain match or distinguished name match to prevent a
     * man-in-the-middle attack. In Oracle database, this is used as the
     * <code>SSL_SERVER_CERT_DN</code>; in Microsoft SQL Server, this is used as
     * the <code>hostNameInCertificate</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONNECTION_URL</code> - The URL for connecting to a general
     * (non-JDBC) data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA_BOOTSTRAP_SERVERS</code> - A comma-separated list of host and
     * port pairs that are the addresses of the Apache Kafka brokers in a Kafka
     * cluster to which a Kafka client will connect to and bootstrap itself.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> connectionProperties;

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud
     * (VPC) and <code>SecurityGroup</code>, that are needed to make this
     * connection successfully.
     * </p>
     */
    private PhysicalConnectionRequirements physicalConnectionRequirements;

    /**
     * <p>
     * The time that this connection definition was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The last time that this connection definition was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The user, group, or role that last updated this connection definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String lastUpdatedBy;

    /**
     * <p>
     * The name of the connection definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the connection definition.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the connection definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the connection definition.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the connection definition.
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
     *            The name of the connection definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withName(String name) {
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
    public Connection withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The type of the connection. Currently, only JDBC is supported; SFTP is
     * not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB, KAFKA
     *
     * @return <p>
     *         The type of the connection. Currently, only JDBC is supported;
     *         SFTP is not supported.
     *         </p>
     * @see ConnectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * <p>
     * The type of the connection. Currently, only JDBC is supported; SFTP is
     * not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB, KAFKA
     *
     * @param connectionType <p>
     *            The type of the connection. Currently, only JDBC is supported;
     *            SFTP is not supported.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of the connection. Currently, only JDBC is supported; SFTP is
     * not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB, KAFKA
     *
     * @param connectionType <p>
     *            The type of the connection. Currently, only JDBC is supported;
     *            SFTP is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public Connection withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * <p>
     * The type of the connection. Currently, only JDBC is supported; SFTP is
     * not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB, KAFKA
     *
     * @param connectionType <p>
     *            The type of the connection. Currently, only JDBC is supported;
     *            SFTP is not supported.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
    }

    /**
     * <p>
     * The type of the connection. Currently, only JDBC is supported; SFTP is
     * not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB, KAFKA
     *
     * @param connectionType <p>
     *            The type of the connection. Currently, only JDBC is supported;
     *            SFTP is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public Connection withConnectionType(ConnectionType connectionType) {
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
    public Connection withMatchCriteria(String... matchCriteria) {
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
    public Connection withMatchCriteria(java.util.Collection<String> matchCriteria) {
        setMatchCriteria(matchCriteria);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST</code> - The host URI: either the fully qualified domain name
     * (FQDN) or the IPv4 address of the database host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT</code> - The port number, between 1024 and 65535, of the port
     * on which the database host is listening for database connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NAME</code> - The name under which to log in to the database.
     * The value string for <code>USER_NAME</code> is "<code>USERNAME</code>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD</code> - A password, if one is used, for the user name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENCRYPTED_PASSWORD</code> - When you enable connection password
     * protection by setting <code>ConnectionPasswordEncryption</code> in the
     * Data Catalog encryption settings, this field stores the encrypted
     * password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_JAR_URI</code> - The Amazon Simple Storage Service
     * (Amazon S3) path of the JAR file that contains the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver
     * to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_FILES</code> - (Reserved for future use.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_ID</code> - The instance ID to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_CONNECTION_URL</code> - The URL for connecting to a JDBC data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying
     * whether Secure Sockets Layer (SSL) with hostname matching is enforced for
     * the JDBC connection on the client. The default is false.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT</code> - An Amazon S3 location specifying the
     * customer's root certificate. AWS Glue uses this root certificate to
     * validate the customer’s certificate when connecting to the customer
     * database. AWS Glue only handles X.509 certificates. The certificate
     * provided must be DER-encoded and supplied in Base64 encoding PEM format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code> - By default, this is
     * <code>false</code>. AWS Glue validates the Signature algorithm and
     * Subject Public Key Algorithm for the customer certificate. The only
     * permitted algorithms for the Signature algorithm are SHA256withRSA,
     * SHA384withRSA or SHA512withRSA. For the Subject Public Key Algorithm, the
     * key length must be at least 2048. You can set the value of this property
     * to <code>true</code> to skip AWS Glue’s validation of the customer
     * certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT_STRING</code> - A custom JDBC certificate string
     * which is used for domain match or distinguished name match to prevent a
     * man-in-the-middle attack. In Oracle database, this is used as the
     * <code>SSL_SERVER_CERT_DN</code>; in Microsoft SQL Server, this is used as
     * the <code>hostNameInCertificate</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONNECTION_URL</code> - The URL for connecting to a general
     * (non-JDBC) data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA_BOOTSTRAP_SERVERS</code> - A comma-separated list of host and
     * port pairs that are the addresses of the Apache Kafka brokers in a Kafka
     * cluster to which a Kafka client will connect to and bootstrap itself.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         These key-value pairs define parameters for the connection:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HOST</code> - The host URI: either the fully qualified
     *         domain name (FQDN) or the IPv4 address of the database host.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PORT</code> - The port number, between 1024 and 65535, of
     *         the port on which the database host is listening for database
     *         connections.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>USER_NAME</code> - The name under which to log in to the
     *         database. The value string for <code>USER_NAME</code> is "
     *         <code>USERNAME</code>".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PASSWORD</code> - A password, if one is used, for the user
     *         name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENCRYPTED_PASSWORD</code> - When you enable connection
     *         password protection by setting
     *         <code>ConnectionPasswordEncryption</code> in the Data Catalog
     *         encryption settings, this field stores the encrypted password.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_DRIVER_JAR_URI</code> - The Amazon Simple Storage
     *         Service (Amazon S3) path of the JAR file that contains the JDBC
     *         driver to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC
     *         driver to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine
     *         to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONFIG_FILES</code> - (Reserved for future use.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTANCE_ID</code> - The instance ID to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_CONNECTION_URL</code> - The URL for connecting to a
     *         JDBC data source.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false)
     *         specifying whether Secure Sockets Layer (SSL) with hostname
     *         matching is enforced for the JDBC connection on the client. The
     *         default is false.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOM_JDBC_CERT</code> - An Amazon S3 location specifying
     *         the customer's root certificate. AWS Glue uses this root
     *         certificate to validate the customer’s certificate when
     *         connecting to the customer database. AWS Glue only handles X.509
     *         certificates. The certificate provided must be DER-encoded and
     *         supplied in Base64 encoding PEM format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code> - By default, this
     *         is <code>false</code>. AWS Glue validates the Signature algorithm
     *         and Subject Public Key Algorithm for the customer certificate.
     *         The only permitted algorithms for the Signature algorithm are
     *         SHA256withRSA, SHA384withRSA or SHA512withRSA. For the Subject
     *         Public Key Algorithm, the key length must be at least 2048. You
     *         can set the value of this property to <code>true</code> to skip
     *         AWS Glue’s validation of the customer certificate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOM_JDBC_CERT_STRING</code> - A custom JDBC certificate
     *         string which is used for domain match or distinguished name match
     *         to prevent a man-in-the-middle attack. In Oracle database, this
     *         is used as the <code>SSL_SERVER_CERT_DN</code>; in Microsoft SQL
     *         Server, this is used as the <code>hostNameInCertificate</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONNECTION_URL</code> - The URL for connecting to a general
     *         (non-JDBC) data source.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KAFKA_BOOTSTRAP_SERVERS</code> - A comma-separated list of
     *         host and port pairs that are the addresses of the Apache Kafka
     *         brokers in a Kafka cluster to which a Kafka client will connect
     *         to and bootstrap itself.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST</code> - The host URI: either the fully qualified domain name
     * (FQDN) or the IPv4 address of the database host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT</code> - The port number, between 1024 and 65535, of the port
     * on which the database host is listening for database connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NAME</code> - The name under which to log in to the database.
     * The value string for <code>USER_NAME</code> is "<code>USERNAME</code>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD</code> - A password, if one is used, for the user name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENCRYPTED_PASSWORD</code> - When you enable connection password
     * protection by setting <code>ConnectionPasswordEncryption</code> in the
     * Data Catalog encryption settings, this field stores the encrypted
     * password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_JAR_URI</code> - The Amazon Simple Storage Service
     * (Amazon S3) path of the JAR file that contains the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver
     * to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_FILES</code> - (Reserved for future use.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_ID</code> - The instance ID to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_CONNECTION_URL</code> - The URL for connecting to a JDBC data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying
     * whether Secure Sockets Layer (SSL) with hostname matching is enforced for
     * the JDBC connection on the client. The default is false.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT</code> - An Amazon S3 location specifying the
     * customer's root certificate. AWS Glue uses this root certificate to
     * validate the customer’s certificate when connecting to the customer
     * database. AWS Glue only handles X.509 certificates. The certificate
     * provided must be DER-encoded and supplied in Base64 encoding PEM format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code> - By default, this is
     * <code>false</code>. AWS Glue validates the Signature algorithm and
     * Subject Public Key Algorithm for the customer certificate. The only
     * permitted algorithms for the Signature algorithm are SHA256withRSA,
     * SHA384withRSA or SHA512withRSA. For the Subject Public Key Algorithm, the
     * key length must be at least 2048. You can set the value of this property
     * to <code>true</code> to skip AWS Glue’s validation of the customer
     * certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT_STRING</code> - A custom JDBC certificate string
     * which is used for domain match or distinguished name match to prevent a
     * man-in-the-middle attack. In Oracle database, this is used as the
     * <code>SSL_SERVER_CERT_DN</code>; in Microsoft SQL Server, this is used as
     * the <code>hostNameInCertificate</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONNECTION_URL</code> - The URL for connecting to a general
     * (non-JDBC) data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA_BOOTSTRAP_SERVERS</code> - A comma-separated list of host and
     * port pairs that are the addresses of the Apache Kafka brokers in a Kafka
     * cluster to which a Kafka client will connect to and bootstrap itself.
     * </p>
     * </li>
     * </ul>
     *
     * @param connectionProperties <p>
     *            These key-value pairs define parameters for the connection:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HOST</code> - The host URI: either the fully qualified
     *            domain name (FQDN) or the IPv4 address of the database host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PORT</code> - The port number, between 1024 and 65535,
     *            of the port on which the database host is listening for
     *            database connections.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>USER_NAME</code> - The name under which to log in to the
     *            database. The value string for <code>USER_NAME</code> is "
     *            <code>USERNAME</code>".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PASSWORD</code> - A password, if one is used, for the
     *            user name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENCRYPTED_PASSWORD</code> - When you enable connection
     *            password protection by setting
     *            <code>ConnectionPasswordEncryption</code> in the Data Catalog
     *            encryption settings, this field stores the encrypted password.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_DRIVER_JAR_URI</code> - The Amazon Simple Storage
     *            Service (Amazon S3) path of the JAR file that contains the
     *            JDBC driver to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the
     *            JDBC driver to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC
     *            engine to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONFIG_FILES</code> - (Reserved for future use.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTANCE_ID</code> - The instance ID to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_CONNECTION_URL</code> - The URL for connecting to a
     *            JDBC data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false)
     *            specifying whether Secure Sockets Layer (SSL) with hostname
     *            matching is enforced for the JDBC connection on the client.
     *            The default is false.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CUSTOM_JDBC_CERT</code> - An Amazon S3 location
     *            specifying the customer's root certificate. AWS Glue uses this
     *            root certificate to validate the customer’s certificate when
     *            connecting to the customer database. AWS Glue only handles
     *            X.509 certificates. The certificate provided must be
     *            DER-encoded and supplied in Base64 encoding PEM format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code> - By default,
     *            this is <code>false</code>. AWS Glue validates the Signature
     *            algorithm and Subject Public Key Algorithm for the customer
     *            certificate. The only permitted algorithms for the Signature
     *            algorithm are SHA256withRSA, SHA384withRSA or SHA512withRSA.
     *            For the Subject Public Key Algorithm, the key length must be
     *            at least 2048. You can set the value of this property to
     *            <code>true</code> to skip AWS Glue’s validation of the
     *            customer certificate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CUSTOM_JDBC_CERT_STRING</code> - A custom JDBC
     *            certificate string which is used for domain match or
     *            distinguished name match to prevent a man-in-the-middle
     *            attack. In Oracle database, this is used as the
     *            <code>SSL_SERVER_CERT_DN</code>; in Microsoft SQL Server, this
     *            is used as the <code>hostNameInCertificate</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONNECTION_URL</code> - The URL for connecting to a
     *            general (non-JDBC) data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KAFKA_BOOTSTRAP_SERVERS</code> - A comma-separated list
     *            of host and port pairs that are the addresses of the Apache
     *            Kafka brokers in a Kafka cluster to which a Kafka client will
     *            connect to and bootstrap itself.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setConnectionProperties(java.util.Map<String, String> connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST</code> - The host URI: either the fully qualified domain name
     * (FQDN) or the IPv4 address of the database host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT</code> - The port number, between 1024 and 65535, of the port
     * on which the database host is listening for database connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NAME</code> - The name under which to log in to the database.
     * The value string for <code>USER_NAME</code> is "<code>USERNAME</code>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD</code> - A password, if one is used, for the user name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENCRYPTED_PASSWORD</code> - When you enable connection password
     * protection by setting <code>ConnectionPasswordEncryption</code> in the
     * Data Catalog encryption settings, this field stores the encrypted
     * password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_JAR_URI</code> - The Amazon Simple Storage Service
     * (Amazon S3) path of the JAR file that contains the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver
     * to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_FILES</code> - (Reserved for future use.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_ID</code> - The instance ID to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_CONNECTION_URL</code> - The URL for connecting to a JDBC data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying
     * whether Secure Sockets Layer (SSL) with hostname matching is enforced for
     * the JDBC connection on the client. The default is false.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT</code> - An Amazon S3 location specifying the
     * customer's root certificate. AWS Glue uses this root certificate to
     * validate the customer’s certificate when connecting to the customer
     * database. AWS Glue only handles X.509 certificates. The certificate
     * provided must be DER-encoded and supplied in Base64 encoding PEM format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code> - By default, this is
     * <code>false</code>. AWS Glue validates the Signature algorithm and
     * Subject Public Key Algorithm for the customer certificate. The only
     * permitted algorithms for the Signature algorithm are SHA256withRSA,
     * SHA384withRSA or SHA512withRSA. For the Subject Public Key Algorithm, the
     * key length must be at least 2048. You can set the value of this property
     * to <code>true</code> to skip AWS Glue’s validation of the customer
     * certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT_STRING</code> - A custom JDBC certificate string
     * which is used for domain match or distinguished name match to prevent a
     * man-in-the-middle attack. In Oracle database, this is used as the
     * <code>SSL_SERVER_CERT_DN</code>; in Microsoft SQL Server, this is used as
     * the <code>hostNameInCertificate</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONNECTION_URL</code> - The URL for connecting to a general
     * (non-JDBC) data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA_BOOTSTRAP_SERVERS</code> - A comma-separated list of host and
     * port pairs that are the addresses of the Apache Kafka brokers in a Kafka
     * cluster to which a Kafka client will connect to and bootstrap itself.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionProperties <p>
     *            These key-value pairs define parameters for the connection:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HOST</code> - The host URI: either the fully qualified
     *            domain name (FQDN) or the IPv4 address of the database host.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PORT</code> - The port number, between 1024 and 65535,
     *            of the port on which the database host is listening for
     *            database connections.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>USER_NAME</code> - The name under which to log in to the
     *            database. The value string for <code>USER_NAME</code> is "
     *            <code>USERNAME</code>".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PASSWORD</code> - A password, if one is used, for the
     *            user name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ENCRYPTED_PASSWORD</code> - When you enable connection
     *            password protection by setting
     *            <code>ConnectionPasswordEncryption</code> in the Data Catalog
     *            encryption settings, this field stores the encrypted password.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_DRIVER_JAR_URI</code> - The Amazon Simple Storage
     *            Service (Amazon S3) path of the JAR file that contains the
     *            JDBC driver to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the
     *            JDBC driver to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC
     *            engine to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONFIG_FILES</code> - (Reserved for future use.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTANCE_ID</code> - The instance ID to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_CONNECTION_URL</code> - The URL for connecting to a
     *            JDBC data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false)
     *            specifying whether Secure Sockets Layer (SSL) with hostname
     *            matching is enforced for the JDBC connection on the client.
     *            The default is false.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CUSTOM_JDBC_CERT</code> - An Amazon S3 location
     *            specifying the customer's root certificate. AWS Glue uses this
     *            root certificate to validate the customer’s certificate when
     *            connecting to the customer database. AWS Glue only handles
     *            X.509 certificates. The certificate provided must be
     *            DER-encoded and supplied in Base64 encoding PEM format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code> - By default,
     *            this is <code>false</code>. AWS Glue validates the Signature
     *            algorithm and Subject Public Key Algorithm for the customer
     *            certificate. The only permitted algorithms for the Signature
     *            algorithm are SHA256withRSA, SHA384withRSA or SHA512withRSA.
     *            For the Subject Public Key Algorithm, the key length must be
     *            at least 2048. You can set the value of this property to
     *            <code>true</code> to skip AWS Glue’s validation of the
     *            customer certificate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CUSTOM_JDBC_CERT_STRING</code> - A custom JDBC
     *            certificate string which is used for domain match or
     *            distinguished name match to prevent a man-in-the-middle
     *            attack. In Oracle database, this is used as the
     *            <code>SSL_SERVER_CERT_DN</code>; in Microsoft SQL Server, this
     *            is used as the <code>hostNameInCertificate</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONNECTION_URL</code> - The URL for connecting to a
     *            general (non-JDBC) data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KAFKA_BOOTSTRAP_SERVERS</code> - A comma-separated list
     *            of host and port pairs that are the addresses of the Apache
     *            Kafka brokers in a Kafka cluster to which a Kafka client will
     *            connect to and bootstrap itself.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withConnectionProperties(java.util.Map<String, String> connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST</code> - The host URI: either the fully qualified domain name
     * (FQDN) or the IPv4 address of the database host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT</code> - The port number, between 1024 and 65535, of the port
     * on which the database host is listening for database connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NAME</code> - The name under which to log in to the database.
     * The value string for <code>USER_NAME</code> is "<code>USERNAME</code>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD</code> - A password, if one is used, for the user name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENCRYPTED_PASSWORD</code> - When you enable connection password
     * protection by setting <code>ConnectionPasswordEncryption</code> in the
     * Data Catalog encryption settings, this field stores the encrypted
     * password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_JAR_URI</code> - The Amazon Simple Storage Service
     * (Amazon S3) path of the JAR file that contains the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver
     * to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_FILES</code> - (Reserved for future use.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_ID</code> - The instance ID to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_CONNECTION_URL</code> - The URL for connecting to a JDBC data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying
     * whether Secure Sockets Layer (SSL) with hostname matching is enforced for
     * the JDBC connection on the client. The default is false.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT</code> - An Amazon S3 location specifying the
     * customer's root certificate. AWS Glue uses this root certificate to
     * validate the customer’s certificate when connecting to the customer
     * database. AWS Glue only handles X.509 certificates. The certificate
     * provided must be DER-encoded and supplied in Base64 encoding PEM format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code> - By default, this is
     * <code>false</code>. AWS Glue validates the Signature algorithm and
     * Subject Public Key Algorithm for the customer certificate. The only
     * permitted algorithms for the Signature algorithm are SHA256withRSA,
     * SHA384withRSA or SHA512withRSA. For the Subject Public Key Algorithm, the
     * key length must be at least 2048. You can set the value of this property
     * to <code>true</code> to skip AWS Glue’s validation of the customer
     * certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_JDBC_CERT_STRING</code> - A custom JDBC certificate string
     * which is used for domain match or distinguished name match to prevent a
     * man-in-the-middle attack. In Oracle database, this is used as the
     * <code>SSL_SERVER_CERT_DN</code>; in Microsoft SQL Server, this is used as
     * the <code>hostNameInCertificate</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONNECTION_URL</code> - The URL for connecting to a general
     * (non-JDBC) data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA_BOOTSTRAP_SERVERS</code> - A comma-separated list of host and
     * port pairs that are the addresses of the Apache Kafka brokers in a Kafka
     * cluster to which a Kafka client will connect to and bootstrap itself.
     * </p>
     * </li>
     * </ul>
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
    public Connection addConnectionPropertiesEntry(String key, String value) {
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
    public Connection clearConnectionPropertiesEntries() {
        this.connectionProperties = null;
        return this;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud
     * (VPC) and <code>SecurityGroup</code>, that are needed to make this
     * connection successfully.
     * </p>
     *
     * @return <p>
     *         A map of physical connection requirements, such as virtual
     *         private cloud (VPC) and <code>SecurityGroup</code>, that are
     *         needed to make this connection successfully.
     *         </p>
     */
    public PhysicalConnectionRequirements getPhysicalConnectionRequirements() {
        return physicalConnectionRequirements;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud
     * (VPC) and <code>SecurityGroup</code>, that are needed to make this
     * connection successfully.
     * </p>
     *
     * @param physicalConnectionRequirements <p>
     *            A map of physical connection requirements, such as virtual
     *            private cloud (VPC) and <code>SecurityGroup</code>, that are
     *            needed to make this connection successfully.
     *            </p>
     */
    public void setPhysicalConnectionRequirements(
            PhysicalConnectionRequirements physicalConnectionRequirements) {
        this.physicalConnectionRequirements = physicalConnectionRequirements;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud
     * (VPC) and <code>SecurityGroup</code>, that are needed to make this
     * connection successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param physicalConnectionRequirements <p>
     *            A map of physical connection requirements, such as virtual
     *            private cloud (VPC) and <code>SecurityGroup</code>, that are
     *            needed to make this connection successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withPhysicalConnectionRequirements(
            PhysicalConnectionRequirements physicalConnectionRequirements) {
        this.physicalConnectionRequirements = physicalConnectionRequirements;
        return this;
    }

    /**
     * <p>
     * The time that this connection definition was created.
     * </p>
     *
     * @return <p>
     *         The time that this connection definition was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time that this connection definition was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time that this connection definition was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that this connection definition was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time that this connection definition was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The last time that this connection definition was updated.
     * </p>
     *
     * @return <p>
     *         The last time that this connection definition was updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this connection definition was updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The last time that this connection definition was updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this connection definition was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The last time that this connection definition was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The user, group, or role that last updated this connection definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The user, group, or role that last updated this connection
     *         definition.
     *         </p>
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * <p>
     * The user, group, or role that last updated this connection definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param lastUpdatedBy <p>
     *            The user, group, or role that last updated this connection
     *            definition.
     *            </p>
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * The user, group, or role that last updated this connection definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param lastUpdatedBy <p>
     *            The user, group, or role that last updated this connection
     *            definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
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
            sb.append("PhysicalConnectionRequirements: " + getPhysicalConnectionRequirements()
                    + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: " + getLastUpdatedBy());
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
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Connection == false)
            return false;
        Connection other = (Connection) obj;

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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null
                && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
            return false;
        return true;
    }
}
