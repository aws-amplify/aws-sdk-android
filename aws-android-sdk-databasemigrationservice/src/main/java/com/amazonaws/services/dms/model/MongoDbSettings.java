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
 * Provides information that defines a MongoDB endpoint.
 * </p>
 */
public class MongoDbSettings implements Serializable {
    /**
     * <p>
     * The user name you use to access the MongoDB source endpoint.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The password for the user account you use to access the MongoDB source
     * endpoint.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The name of the server on the MongoDB source endpoint.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * The port value for the MongoDB source endpoint.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The database name on the MongoDB source endpoint.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * When when set to <code>"no"</code>, user name and password parameters are
     * not used and can be empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no, password
     */
    private String authType;

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source
     * endpoint.
     * </p>
     * <p>
     * For the default value, in MongoDB version 2.x, <code>"default"</code> is
     * <code>"mongodb_cr"</code>. For MongoDB version 3.x or later,
     * <code>"default"</code> is <code>"scram_sha_1"</code>. This setting isn't
     * used when <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, mongodb_cr, scram_sha_1
     */
    private String authMechanism;

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use
     * document mode. Specify <code>"one"</code> to use table mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, one
     */
    private String nestingLevel;

    /**
     * <p>
     * Specifies the document ID. Use this setting when
     * <code>NestingLevel</code> is set to <code>"none"</code>.
     * </p>
     * <p>
     * Default value is <code>"false"</code>.
     * </p>
     */
    private String extractDocId;

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document
     * organization. Use this setting when <code>NestingLevel</code> is set to
     * <code>"one"</code>.
     * </p>
     * <p>
     * Must be a positive value greater than <code>0</code>. Default value is
     * <code>1000</code>.
     * </p>
     */
    private String docsToInvestigate;

    /**
     * <p>
     * The MongoDB database name. This setting isn't used when
     * <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * The default is <code>"admin"</code>.
     * </p>
     */
    private String authSource;

    /**
     * <p>
     * The AWS KMS key identifier that is used to encrypt the content on the
     * replication instance. If you don't specify a value for the
     * <code>KmsKeyId</code> parameter, then AWS DMS uses your default
     * encryption key. AWS KMS creates the default encryption key for your AWS
     * account. Your AWS account has a different default encryption key for each
     * AWS Region.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The user name you use to access the MongoDB source endpoint.
     * </p>
     *
     * @return <p>
     *         The user name you use to access the MongoDB source endpoint.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name you use to access the MongoDB source endpoint.
     * </p>
     *
     * @param username <p>
     *            The user name you use to access the MongoDB source endpoint.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            The user name you use to access the MongoDB source endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MongoDbSettings withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The password for the user account you use to access the MongoDB source
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The password for the user account you use to access the MongoDB
     *         source endpoint.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The password for the user account you use to access the MongoDB source
     * endpoint.
     * </p>
     *
     * @param password <p>
     *            The password for the user account you use to access the
     *            MongoDB source endpoint.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user account you use to access the MongoDB source
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param password <p>
     *            The password for the user account you use to access the
     *            MongoDB source endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MongoDbSettings withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * The name of the server on the MongoDB source endpoint.
     * </p>
     *
     * @return <p>
     *         The name of the server on the MongoDB source endpoint.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server on the MongoDB source endpoint.
     * </p>
     *
     * @param serverName <p>
     *            The name of the server on the MongoDB source endpoint.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server on the MongoDB source endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverName <p>
     *            The name of the server on the MongoDB source endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MongoDbSettings withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * The port value for the MongoDB source endpoint.
     * </p>
     *
     * @return <p>
     *         The port value for the MongoDB source endpoint.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port value for the MongoDB source endpoint.
     * </p>
     *
     * @param port <p>
     *            The port value for the MongoDB source endpoint.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value for the MongoDB source endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port value for the MongoDB source endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MongoDbSettings withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The database name on the MongoDB source endpoint.
     * </p>
     *
     * @return <p>
     *         The database name on the MongoDB source endpoint.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The database name on the MongoDB source endpoint.
     * </p>
     *
     * @param databaseName <p>
     *            The database name on the MongoDB source endpoint.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name on the MongoDB source endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The database name on the MongoDB source endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MongoDbSettings withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * When when set to <code>"no"</code>, user name and password parameters are
     * not used and can be empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no, password
     *
     * @return <p>
     *         The authentication type you use to access the MongoDB source
     *         endpoint.
     *         </p>
     *         <p>
     *         When when set to <code>"no"</code>, user name and password
     *         parameters are not used and can be empty.
     *         </p>
     * @see AuthTypeValue
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * When when set to <code>"no"</code>, user name and password parameters are
     * not used and can be empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no, password
     *
     * @param authType <p>
     *            The authentication type you use to access the MongoDB source
     *            endpoint.
     *            </p>
     *            <p>
     *            When when set to <code>"no"</code>, user name and password
     *            parameters are not used and can be empty.
     *            </p>
     * @see AuthTypeValue
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * When when set to <code>"no"</code>, user name and password parameters are
     * not used and can be empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no, password
     *
     * @param authType <p>
     *            The authentication type you use to access the MongoDB source
     *            endpoint.
     *            </p>
     *            <p>
     *            When when set to <code>"no"</code>, user name and password
     *            parameters are not used and can be empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthTypeValue
     */
    public MongoDbSettings withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * When when set to <code>"no"</code>, user name and password parameters are
     * not used and can be empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no, password
     *
     * @param authType <p>
     *            The authentication type you use to access the MongoDB source
     *            endpoint.
     *            </p>
     *            <p>
     *            When when set to <code>"no"</code>, user name and password
     *            parameters are not used and can be empty.
     *            </p>
     * @see AuthTypeValue
     */
    public void setAuthType(AuthTypeValue authType) {
        this.authType = authType.toString();
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * When when set to <code>"no"</code>, user name and password parameters are
     * not used and can be empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no, password
     *
     * @param authType <p>
     *            The authentication type you use to access the MongoDB source
     *            endpoint.
     *            </p>
     *            <p>
     *            When when set to <code>"no"</code>, user name and password
     *            parameters are not used and can be empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthTypeValue
     */
    public MongoDbSettings withAuthType(AuthTypeValue authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source
     * endpoint.
     * </p>
     * <p>
     * For the default value, in MongoDB version 2.x, <code>"default"</code> is
     * <code>"mongodb_cr"</code>. For MongoDB version 3.x or later,
     * <code>"default"</code> is <code>"scram_sha_1"</code>. This setting isn't
     * used when <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, mongodb_cr, scram_sha_1
     *
     * @return <p>
     *         The authentication mechanism you use to access the MongoDB source
     *         endpoint.
     *         </p>
     *         <p>
     *         For the default value, in MongoDB version 2.x,
     *         <code>"default"</code> is <code>"mongodb_cr"</code>. For MongoDB
     *         version 3.x or later, <code>"default"</code> is
     *         <code>"scram_sha_1"</code>. This setting isn't used when
     *         <code>AuthType</code> is set to <code>"no"</code>.
     *         </p>
     * @see AuthMechanismValue
     */
    public String getAuthMechanism() {
        return authMechanism;
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source
     * endpoint.
     * </p>
     * <p>
     * For the default value, in MongoDB version 2.x, <code>"default"</code> is
     * <code>"mongodb_cr"</code>. For MongoDB version 3.x or later,
     * <code>"default"</code> is <code>"scram_sha_1"</code>. This setting isn't
     * used when <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, mongodb_cr, scram_sha_1
     *
     * @param authMechanism <p>
     *            The authentication mechanism you use to access the MongoDB
     *            source endpoint.
     *            </p>
     *            <p>
     *            For the default value, in MongoDB version 2.x,
     *            <code>"default"</code> is <code>"mongodb_cr"</code>. For
     *            MongoDB version 3.x or later, <code>"default"</code> is
     *            <code>"scram_sha_1"</code>. This setting isn't used when
     *            <code>AuthType</code> is set to <code>"no"</code>.
     *            </p>
     * @see AuthMechanismValue
     */
    public void setAuthMechanism(String authMechanism) {
        this.authMechanism = authMechanism;
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source
     * endpoint.
     * </p>
     * <p>
     * For the default value, in MongoDB version 2.x, <code>"default"</code> is
     * <code>"mongodb_cr"</code>. For MongoDB version 3.x or later,
     * <code>"default"</code> is <code>"scram_sha_1"</code>. This setting isn't
     * used when <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, mongodb_cr, scram_sha_1
     *
     * @param authMechanism <p>
     *            The authentication mechanism you use to access the MongoDB
     *            source endpoint.
     *            </p>
     *            <p>
     *            For the default value, in MongoDB version 2.x,
     *            <code>"default"</code> is <code>"mongodb_cr"</code>. For
     *            MongoDB version 3.x or later, <code>"default"</code> is
     *            <code>"scram_sha_1"</code>. This setting isn't used when
     *            <code>AuthType</code> is set to <code>"no"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthMechanismValue
     */
    public MongoDbSettings withAuthMechanism(String authMechanism) {
        this.authMechanism = authMechanism;
        return this;
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source
     * endpoint.
     * </p>
     * <p>
     * For the default value, in MongoDB version 2.x, <code>"default"</code> is
     * <code>"mongodb_cr"</code>. For MongoDB version 3.x or later,
     * <code>"default"</code> is <code>"scram_sha_1"</code>. This setting isn't
     * used when <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, mongodb_cr, scram_sha_1
     *
     * @param authMechanism <p>
     *            The authentication mechanism you use to access the MongoDB
     *            source endpoint.
     *            </p>
     *            <p>
     *            For the default value, in MongoDB version 2.x,
     *            <code>"default"</code> is <code>"mongodb_cr"</code>. For
     *            MongoDB version 3.x or later, <code>"default"</code> is
     *            <code>"scram_sha_1"</code>. This setting isn't used when
     *            <code>AuthType</code> is set to <code>"no"</code>.
     *            </p>
     * @see AuthMechanismValue
     */
    public void setAuthMechanism(AuthMechanismValue authMechanism) {
        this.authMechanism = authMechanism.toString();
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source
     * endpoint.
     * </p>
     * <p>
     * For the default value, in MongoDB version 2.x, <code>"default"</code> is
     * <code>"mongodb_cr"</code>. For MongoDB version 3.x or later,
     * <code>"default"</code> is <code>"scram_sha_1"</code>. This setting isn't
     * used when <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, mongodb_cr, scram_sha_1
     *
     * @param authMechanism <p>
     *            The authentication mechanism you use to access the MongoDB
     *            source endpoint.
     *            </p>
     *            <p>
     *            For the default value, in MongoDB version 2.x,
     *            <code>"default"</code> is <code>"mongodb_cr"</code>. For
     *            MongoDB version 3.x or later, <code>"default"</code> is
     *            <code>"scram_sha_1"</code>. This setting isn't used when
     *            <code>AuthType</code> is set to <code>"no"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthMechanismValue
     */
    public MongoDbSettings withAuthMechanism(AuthMechanismValue authMechanism) {
        this.authMechanism = authMechanism.toString();
        return this;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use
     * document mode. Specify <code>"one"</code> to use table mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, one
     *
     * @return <p>
     *         Specifies either document or table mode.
     *         </p>
     *         <p>
     *         Default value is <code>"none"</code>. Specify <code>"none"</code>
     *         to use document mode. Specify <code>"one"</code> to use table
     *         mode.
     *         </p>
     * @see NestingLevelValue
     */
    public String getNestingLevel() {
        return nestingLevel;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use
     * document mode. Specify <code>"one"</code> to use table mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, one
     *
     * @param nestingLevel <p>
     *            Specifies either document or table mode.
     *            </p>
     *            <p>
     *            Default value is <code>"none"</code>. Specify
     *            <code>"none"</code> to use document mode. Specify
     *            <code>"one"</code> to use table mode.
     *            </p>
     * @see NestingLevelValue
     */
    public void setNestingLevel(String nestingLevel) {
        this.nestingLevel = nestingLevel;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use
     * document mode. Specify <code>"one"</code> to use table mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, one
     *
     * @param nestingLevel <p>
     *            Specifies either document or table mode.
     *            </p>
     *            <p>
     *            Default value is <code>"none"</code>. Specify
     *            <code>"none"</code> to use document mode. Specify
     *            <code>"one"</code> to use table mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NestingLevelValue
     */
    public MongoDbSettings withNestingLevel(String nestingLevel) {
        this.nestingLevel = nestingLevel;
        return this;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use
     * document mode. Specify <code>"one"</code> to use table mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, one
     *
     * @param nestingLevel <p>
     *            Specifies either document or table mode.
     *            </p>
     *            <p>
     *            Default value is <code>"none"</code>. Specify
     *            <code>"none"</code> to use document mode. Specify
     *            <code>"one"</code> to use table mode.
     *            </p>
     * @see NestingLevelValue
     */
    public void setNestingLevel(NestingLevelValue nestingLevel) {
        this.nestingLevel = nestingLevel.toString();
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use
     * document mode. Specify <code>"one"</code> to use table mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, one
     *
     * @param nestingLevel <p>
     *            Specifies either document or table mode.
     *            </p>
     *            <p>
     *            Default value is <code>"none"</code>. Specify
     *            <code>"none"</code> to use document mode. Specify
     *            <code>"one"</code> to use table mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NestingLevelValue
     */
    public MongoDbSettings withNestingLevel(NestingLevelValue nestingLevel) {
        this.nestingLevel = nestingLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the document ID. Use this setting when
     * <code>NestingLevel</code> is set to <code>"none"</code>.
     * </p>
     * <p>
     * Default value is <code>"false"</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the document ID. Use this setting when
     *         <code>NestingLevel</code> is set to <code>"none"</code>.
     *         </p>
     *         <p>
     *         Default value is <code>"false"</code>.
     *         </p>
     */
    public String getExtractDocId() {
        return extractDocId;
    }

    /**
     * <p>
     * Specifies the document ID. Use this setting when
     * <code>NestingLevel</code> is set to <code>"none"</code>.
     * </p>
     * <p>
     * Default value is <code>"false"</code>.
     * </p>
     *
     * @param extractDocId <p>
     *            Specifies the document ID. Use this setting when
     *            <code>NestingLevel</code> is set to <code>"none"</code>.
     *            </p>
     *            <p>
     *            Default value is <code>"false"</code>.
     *            </p>
     */
    public void setExtractDocId(String extractDocId) {
        this.extractDocId = extractDocId;
    }

    /**
     * <p>
     * Specifies the document ID. Use this setting when
     * <code>NestingLevel</code> is set to <code>"none"</code>.
     * </p>
     * <p>
     * Default value is <code>"false"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extractDocId <p>
     *            Specifies the document ID. Use this setting when
     *            <code>NestingLevel</code> is set to <code>"none"</code>.
     *            </p>
     *            <p>
     *            Default value is <code>"false"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MongoDbSettings withExtractDocId(String extractDocId) {
        this.extractDocId = extractDocId;
        return this;
    }

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document
     * organization. Use this setting when <code>NestingLevel</code> is set to
     * <code>"one"</code>.
     * </p>
     * <p>
     * Must be a positive value greater than <code>0</code>. Default value is
     * <code>1000</code>.
     * </p>
     *
     * @return <p>
     *         Indicates the number of documents to preview to determine the
     *         document organization. Use this setting when
     *         <code>NestingLevel</code> is set to <code>"one"</code>.
     *         </p>
     *         <p>
     *         Must be a positive value greater than <code>0</code>. Default
     *         value is <code>1000</code>.
     *         </p>
     */
    public String getDocsToInvestigate() {
        return docsToInvestigate;
    }

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document
     * organization. Use this setting when <code>NestingLevel</code> is set to
     * <code>"one"</code>.
     * </p>
     * <p>
     * Must be a positive value greater than <code>0</code>. Default value is
     * <code>1000</code>.
     * </p>
     *
     * @param docsToInvestigate <p>
     *            Indicates the number of documents to preview to determine the
     *            document organization. Use this setting when
     *            <code>NestingLevel</code> is set to <code>"one"</code>.
     *            </p>
     *            <p>
     *            Must be a positive value greater than <code>0</code>. Default
     *            value is <code>1000</code>.
     *            </p>
     */
    public void setDocsToInvestigate(String docsToInvestigate) {
        this.docsToInvestigate = docsToInvestigate;
    }

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document
     * organization. Use this setting when <code>NestingLevel</code> is set to
     * <code>"one"</code>.
     * </p>
     * <p>
     * Must be a positive value greater than <code>0</code>. Default value is
     * <code>1000</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param docsToInvestigate <p>
     *            Indicates the number of documents to preview to determine the
     *            document organization. Use this setting when
     *            <code>NestingLevel</code> is set to <code>"one"</code>.
     *            </p>
     *            <p>
     *            Must be a positive value greater than <code>0</code>. Default
     *            value is <code>1000</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MongoDbSettings withDocsToInvestigate(String docsToInvestigate) {
        this.docsToInvestigate = docsToInvestigate;
        return this;
    }

    /**
     * <p>
     * The MongoDB database name. This setting isn't used when
     * <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * The default is <code>"admin"</code>.
     * </p>
     *
     * @return <p>
     *         The MongoDB database name. This setting isn't used when
     *         <code>AuthType</code> is set to <code>"no"</code>.
     *         </p>
     *         <p>
     *         The default is <code>"admin"</code>.
     *         </p>
     */
    public String getAuthSource() {
        return authSource;
    }

    /**
     * <p>
     * The MongoDB database name. This setting isn't used when
     * <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * The default is <code>"admin"</code>.
     * </p>
     *
     * @param authSource <p>
     *            The MongoDB database name. This setting isn't used when
     *            <code>AuthType</code> is set to <code>"no"</code>.
     *            </p>
     *            <p>
     *            The default is <code>"admin"</code>.
     *            </p>
     */
    public void setAuthSource(String authSource) {
        this.authSource = authSource;
    }

    /**
     * <p>
     * The MongoDB database name. This setting isn't used when
     * <code>AuthType</code> is set to <code>"no"</code>.
     * </p>
     * <p>
     * The default is <code>"admin"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authSource <p>
     *            The MongoDB database name. This setting isn't used when
     *            <code>AuthType</code> is set to <code>"no"</code>.
     *            </p>
     *            <p>
     *            The default is <code>"admin"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MongoDbSettings withAuthSource(String authSource) {
        this.authSource = authSource;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier that is used to encrypt the content on the
     * replication instance. If you don't specify a value for the
     * <code>KmsKeyId</code> parameter, then AWS DMS uses your default
     * encryption key. AWS KMS creates the default encryption key for your AWS
     * account. Your AWS account has a different default encryption key for each
     * AWS Region.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key identifier that is used to encrypt the content on
     *         the replication instance. If you don't specify a value for the
     *         <code>KmsKeyId</code> parameter, then AWS DMS uses your default
     *         encryption key. AWS KMS creates the default encryption key for
     *         your AWS account. Your AWS account has a different default
     *         encryption key for each AWS Region.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier that is used to encrypt the content on the
     * replication instance. If you don't specify a value for the
     * <code>KmsKeyId</code> parameter, then AWS DMS uses your default
     * encryption key. AWS KMS creates the default encryption key for your AWS
     * account. Your AWS account has a different default encryption key for each
     * AWS Region.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier that is used to encrypt the content
     *            on the replication instance. If you don't specify a value for
     *            the <code>KmsKeyId</code> parameter, then AWS DMS uses your
     *            default encryption key. AWS KMS creates the default encryption
     *            key for your AWS account. Your AWS account has a different
     *            default encryption key for each AWS Region.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier that is used to encrypt the content on the
     * replication instance. If you don't specify a value for the
     * <code>KmsKeyId</code> parameter, then AWS DMS uses your default
     * encryption key. AWS KMS creates the default encryption key for your AWS
     * account. Your AWS account has a different default encryption key for each
     * AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier that is used to encrypt the content
     *            on the replication instance. If you don't specify a value for
     *            the <code>KmsKeyId</code> parameter, then AWS DMS uses your
     *            default encryption key. AWS KMS creates the default encryption
     *            key for your AWS account. Your AWS account has a different
     *            default encryption key for each AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MongoDbSettings withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getAuthType() != null)
            sb.append("AuthType: " + getAuthType() + ",");
        if (getAuthMechanism() != null)
            sb.append("AuthMechanism: " + getAuthMechanism() + ",");
        if (getNestingLevel() != null)
            sb.append("NestingLevel: " + getNestingLevel() + ",");
        if (getExtractDocId() != null)
            sb.append("ExtractDocId: " + getExtractDocId() + ",");
        if (getDocsToInvestigate() != null)
            sb.append("DocsToInvestigate: " + getDocsToInvestigate() + ",");
        if (getAuthSource() != null)
            sb.append("AuthSource: " + getAuthSource() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode
                + ((getAuthMechanism() == null) ? 0 : getAuthMechanism().hashCode());
        hashCode = prime * hashCode
                + ((getNestingLevel() == null) ? 0 : getNestingLevel().hashCode());
        hashCode = prime * hashCode
                + ((getExtractDocId() == null) ? 0 : getExtractDocId().hashCode());
        hashCode = prime * hashCode
                + ((getDocsToInvestigate() == null) ? 0 : getDocsToInvestigate().hashCode());
        hashCode = prime * hashCode + ((getAuthSource() == null) ? 0 : getAuthSource().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MongoDbSettings == false)
            return false;
        MongoDbSettings other = (MongoDbSettings) obj;

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
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getAuthMechanism() == null ^ this.getAuthMechanism() == null)
            return false;
        if (other.getAuthMechanism() != null
                && other.getAuthMechanism().equals(this.getAuthMechanism()) == false)
            return false;
        if (other.getNestingLevel() == null ^ this.getNestingLevel() == null)
            return false;
        if (other.getNestingLevel() != null
                && other.getNestingLevel().equals(this.getNestingLevel()) == false)
            return false;
        if (other.getExtractDocId() == null ^ this.getExtractDocId() == null)
            return false;
        if (other.getExtractDocId() != null
                && other.getExtractDocId().equals(this.getExtractDocId()) == false)
            return false;
        if (other.getDocsToInvestigate() == null ^ this.getDocsToInvestigate() == null)
            return false;
        if (other.getDocsToInvestigate() != null
                && other.getDocsToInvestigate().equals(this.getDocsToInvestigate()) == false)
            return false;
        if (other.getAuthSource() == null ^ this.getAuthSource() == null)
            return false;
        if (other.getAuthSource() != null
                && other.getAuthSource().equals(this.getAuthSource()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
