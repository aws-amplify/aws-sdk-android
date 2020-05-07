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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new database in Amazon Lightsail.
 * </p>
 * <p>
 * The <code>create relational database</code> operation supports tag-based
 * access control via request tags. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateRelationalDatabaseRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name to use for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String relationalDatabaseName;

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the
     * <code>us-east-2a</code> case-sensitive format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the
     * <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to
     * your request.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The blueprint ID for your new database. A blueprint describes the major
     * engine version of a database.
     * </p>
     * <p>
     * You can get a list of database blueprints IDs by using the
     * <code>get relational database blueprints</code> operation.
     * </p>
     */
    private String relationalDatabaseBlueprintId;

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance
     * specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the
     * <code>get relational database bundles</code> operation.
     * </p>
     */
    private String relationalDatabaseBundleId;

    /**
     * <p>
     * The name of the master database created when the Lightsail database
     * resource is created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     */
    private String masterDatabaseName;

    /**
     * <p>
     * The master user name for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Master user name is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the database engine you choose.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the
     * Keywords and Reserved Words articles for <a
     * href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL
     * 5.6</a> or <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL
     * 5.7</a> respectively.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUsername;

    /**
     * <p>
     * The password for the master user of your new database. The password can
     * include any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain 8 to 41 characters.
     * </p>
     */
    private String masterUserPassword;

    /**
     * <p>
     * The daily time range during which automated backups are created for your
     * new database if automated backups are enabled.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. For more information about the preferred
     * backup window time blocks for each region, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Working With Backups</a> guide in the Amazon Relational Database Service
     * (Amazon RDS) documentation.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>hh24:mi-hh24:mi</code> format.
     * </p>
     * <p>
     * Example: <code>16:00-16:30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on your
     * new database.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>Tue:17:00-Tue:17:30</code>
     * </p>
     * </li>
     * </ul>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of
     * <code>true</code> specifies a database that is available to resources
     * outside of your Lightsail account. A value of <code>false</code>
     * specifies a database that is available only to your Lightsail resources
     * in the same region as your database.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name to use for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name to use for your new database.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first and last character must be a letter or number.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRelationalDatabaseName() {
        return relationalDatabaseName;
    }

    /**
     * <p>
     * The name to use for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name to use for your new database.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 2 to 255 alphanumeric characters, or
     *            hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first and last character must be a letter or number.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name to use for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name to use for your new database.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 2 to 255 alphanumeric characters, or
     *            hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first and last character must be a letter or number.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the
     * <code>us-east-2a</code> case-sensitive format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the
     * <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to
     * your request.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which to create your new database. Use
     *         the <code>us-east-2a</code> case-sensitive format.
     *         </p>
     *         <p>
     *         You can get a list of Availability Zones by using the
     *         <code>get regions</code> operation. Be sure to add the
     *         <code>include relational database Availability Zones</code>
     *         parameter to your request.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the
     * <code>us-east-2a</code> case-sensitive format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the
     * <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to
     * your request.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to create your new database.
     *            Use the <code>us-east-2a</code> case-sensitive format.
     *            </p>
     *            <p>
     *            You can get a list of Availability Zones by using the
     *            <code>get regions</code> operation. Be sure to add the
     *            <code>include relational database Availability Zones</code>
     *            parameter to your request.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the
     * <code>us-east-2a</code> case-sensitive format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the
     * <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to
     * your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to create your new database.
     *            Use the <code>us-east-2a</code> case-sensitive format.
     *            </p>
     *            <p>
     *            You can get a list of Availability Zones by using the
     *            <code>get regions</code> operation. Be sure to add the
     *            <code>include relational database Availability Zones</code>
     *            parameter to your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The blueprint ID for your new database. A blueprint describes the major
     * engine version of a database.
     * </p>
     * <p>
     * You can get a list of database blueprints IDs by using the
     * <code>get relational database blueprints</code> operation.
     * </p>
     *
     * @return <p>
     *         The blueprint ID for your new database. A blueprint describes the
     *         major engine version of a database.
     *         </p>
     *         <p>
     *         You can get a list of database blueprints IDs by using the
     *         <code>get relational database blueprints</code> operation.
     *         </p>
     */
    public String getRelationalDatabaseBlueprintId() {
        return relationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID for your new database. A blueprint describes the major
     * engine version of a database.
     * </p>
     * <p>
     * You can get a list of database blueprints IDs by using the
     * <code>get relational database blueprints</code> operation.
     * </p>
     *
     * @param relationalDatabaseBlueprintId <p>
     *            The blueprint ID for your new database. A blueprint describes
     *            the major engine version of a database.
     *            </p>
     *            <p>
     *            You can get a list of database blueprints IDs by using the
     *            <code>get relational database blueprints</code> operation.
     *            </p>
     */
    public void setRelationalDatabaseBlueprintId(String relationalDatabaseBlueprintId) {
        this.relationalDatabaseBlueprintId = relationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID for your new database. A blueprint describes the major
     * engine version of a database.
     * </p>
     * <p>
     * You can get a list of database blueprints IDs by using the
     * <code>get relational database blueprints</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationalDatabaseBlueprintId <p>
     *            The blueprint ID for your new database. A blueprint describes
     *            the major engine version of a database.
     *            </p>
     *            <p>
     *            You can get a list of database blueprints IDs by using the
     *            <code>get relational database blueprints</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withRelationalDatabaseBlueprintId(
            String relationalDatabaseBlueprintId) {
        this.relationalDatabaseBlueprintId = relationalDatabaseBlueprintId;
        return this;
    }

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance
     * specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the
     * <code>get relational database bundles</code> operation.
     * </p>
     *
     * @return <p>
     *         The bundle ID for your new database. A bundle describes the
     *         performance specifications for your database.
     *         </p>
     *         <p>
     *         You can get a list of database bundle IDs by using the
     *         <code>get relational database bundles</code> operation.
     *         </p>
     */
    public String getRelationalDatabaseBundleId() {
        return relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance
     * specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the
     * <code>get relational database bundles</code> operation.
     * </p>
     *
     * @param relationalDatabaseBundleId <p>
     *            The bundle ID for your new database. A bundle describes the
     *            performance specifications for your database.
     *            </p>
     *            <p>
     *            You can get a list of database bundle IDs by using the
     *            <code>get relational database bundles</code> operation.
     *            </p>
     */
    public void setRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
        this.relationalDatabaseBundleId = relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance
     * specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the
     * <code>get relational database bundles</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationalDatabaseBundleId <p>
     *            The bundle ID for your new database. A bundle describes the
     *            performance specifications for your database.
     *            </p>
     *            <p>
     *            You can get a list of database bundle IDs by using the
     *            <code>get relational database bundles</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withRelationalDatabaseBundleId(
            String relationalDatabaseBundleId) {
        this.relationalDatabaseBundleId = relationalDatabaseBundleId;
        return this;
    }

    /**
     * <p>
     * The name of the master database created when the Lightsail database
     * resource is created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the master database created when the Lightsail
     *         database resource is created.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 64 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMasterDatabaseName() {
        return masterDatabaseName;
    }

    /**
     * <p>
     * The name of the master database created when the Lightsail database
     * resource is created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     *
     * @param masterDatabaseName <p>
     *            The name of the master database created when the Lightsail
     *            database resource is created.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 64 alphanumeric characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMasterDatabaseName(String masterDatabaseName) {
        this.masterDatabaseName = masterDatabaseName;
    }

    /**
     * <p>
     * The name of the master database created when the Lightsail database
     * resource is created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterDatabaseName <p>
     *            The name of the master database created when the Lightsail
     *            database resource is created.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 64 alphanumeric characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withMasterDatabaseName(String masterDatabaseName) {
        this.masterDatabaseName = masterDatabaseName;
        return this;
    }

    /**
     * <p>
     * The master user name for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Master user name is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the database engine you choose.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the
     * Keywords and Reserved Words articles for <a
     * href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL
     * 5.6</a> or <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL
     * 5.7</a> respectively.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The master user name for your new database.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Master user name is required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 16 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word for the database engine you choose.
     *         </p>
     *         <p>
     *         For more information about reserved words in MySQL 5.6 or 5.7,
     *         see the Keywords and Reserved Words articles for <a
     *         href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html"
     *         >MySQL 5.6</a> or <a
     *         href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html"
     *         >MySQL 5.7</a> respectively.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * The master user name for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Master user name is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the database engine you choose.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the
     * Keywords and Reserved Words articles for <a
     * href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL
     * 5.6</a> or <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL
     * 5.7</a> respectively.
     * </p>
     * </li>
     * </ul>
     *
     * @param masterUsername <p>
     *            The master user name for your new database.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Master user name is required.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain from 1 to 16 alphanumeric characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a reserved word for the database engine you choose.
     *            </p>
     *            <p>
     *            For more information about reserved words in MySQL 5.6 or 5.7,
     *            see the Keywords and Reserved Words articles for <a
     *            href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html"
     *            >MySQL 5.6</a> or <a
     *            href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html"
     *            >MySQL 5.7</a> respectively.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Master user name is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the database engine you choose.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the
     * Keywords and Reserved Words articles for <a
     * href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL
     * 5.6</a> or <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL
     * 5.7</a> respectively.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUsername <p>
     *            The master user name for your new database.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Master user name is required.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain from 1 to 16 alphanumeric characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a reserved word for the database engine you choose.
     *            </p>
     *            <p>
     *            For more information about reserved words in MySQL 5.6 or 5.7,
     *            see the Keywords and Reserved Words articles for <a
     *            href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html"
     *            >MySQL 5.6</a> or <a
     *            href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html"
     *            >MySQL 5.7</a> respectively.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * The password for the master user of your new database. The password can
     * include any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain 8 to 41 characters.
     * </p>
     *
     * @return <p>
     *         The password for the master user of your new database. The
     *         password can include any printable ASCII character except "/",
     *         """, or "@".
     *         </p>
     *         <p>
     *         Constraints: Must contain 8 to 41 characters.
     *         </p>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user of your new database. The password can
     * include any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain 8 to 41 characters.
     * </p>
     *
     * @param masterUserPassword <p>
     *            The password for the master user of your new database. The
     *            password can include any printable ASCII character except "/",
     *            """, or "@".
     *            </p>
     *            <p>
     *            Constraints: Must contain 8 to 41 characters.
     *            </p>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user of your new database. The password can
     * include any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain 8 to 41 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUserPassword <p>
     *            The password for the master user of your new database. The
     *            password can include any printable ASCII character except "/",
     *            """, or "@".
     *            </p>
     *            <p>
     *            Constraints: Must contain 8 to 41 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for your
     * new database if automated backups are enabled.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. For more information about the preferred
     * backup window time blocks for each region, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Working With Backups</a> guide in the Amazon Relational Database Service
     * (Amazon RDS) documentation.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>hh24:mi-hh24:mi</code> format.
     * </p>
     * <p>
     * Example: <code>16:00-16:30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The daily time range during which automated backups are created
     *         for your new database if automated backups are enabled.
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an
     *         8-hour block of time for each AWS Region. For more information
     *         about the preferred backup window time blocks for each region,
     *         see the <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *         >Working With Backups</a> guide in the Amazon Relational Database
     *         Service (Amazon RDS) documentation.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the <code>hh24:mi-hh24:mi</code> format.
     *         </p>
     *         <p>
     *         Example: <code>16:00-16:30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for your
     * new database if automated backups are enabled.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. For more information about the preferred
     * backup window time blocks for each region, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Working With Backups</a> guide in the Amazon Relational Database Service
     * (Amazon RDS) documentation.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>hh24:mi-hh24:mi</code> format.
     * </p>
     * <p>
     * Example: <code>16:00-16:30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     *
     * @param preferredBackupWindow <p>
     *            The daily time range during which automated backups are
     *            created for your new database if automated backups are
     *            enabled.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region. For more information
     *            about the preferred backup window time blocks for each region,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *            >Working With Backups</a> guide in the Amazon Relational
     *            Database Service (Amazon RDS) documentation.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the <code>hh24:mi-hh24:mi</code> format.
     *            </p>
     *            <p>
     *            Example: <code>16:00-16:30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not conflict with the preferred maintenance window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for your
     * new database if automated backups are enabled.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. For more information about the preferred
     * backup window time blocks for each region, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Working With Backups</a> guide in the Amazon Relational Database Service
     * (Amazon RDS) documentation.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>hh24:mi-hh24:mi</code> format.
     * </p>
     * <p>
     * Example: <code>16:00-16:30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredBackupWindow <p>
     *            The daily time range during which automated backups are
     *            created for your new database if automated backups are
     *            enabled.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region. For more information
     *            about the preferred backup window time blocks for each region,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *            >Working With Backups</a> guide in the Amazon Relational
     *            Database Service (Amazon RDS) documentation.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the <code>hh24:mi-hh24:mi</code> format.
     *            </p>
     *            <p>
     *            Example: <code>16:00-16:30</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not conflict with the preferred maintenance window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on your
     * new database.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>Tue:17:00-Tue:17:30</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The weekly time range during which system maintenance can occur
     *         on your new database.
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an
     *         8-hour block of time for each AWS Region, occurring on a random
     *         day of the week.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>Tue:17:00-Tue:17:30</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on your
     * new database.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>Tue:17:00-Tue:17:30</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range during which system maintenance can
     *            occur on your new database.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region, occurring on a
     *            random day of the week.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Example: <code>Tue:17:00-Tue:17:30</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on your
     * new database.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>Tue:17:00-Tue:17:30</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range during which system maintenance can
     *            occur on your new database.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region, occurring on a
     *            random day of the week.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Example: <code>Tue:17:00-Tue:17:30</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of
     * <code>true</code> specifies a database that is available to resources
     * outside of your Lightsail account. A value of <code>false</code>
     * specifies a database that is available only to your Lightsail resources
     * in the same region as your database.
     * </p>
     *
     * @return <p>
     *         Specifies the accessibility options for your new database. A
     *         value of <code>true</code> specifies a database that is available
     *         to resources outside of your Lightsail account. A value of
     *         <code>false</code> specifies a database that is available only to
     *         your Lightsail resources in the same region as your database.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of
     * <code>true</code> specifies a database that is available to resources
     * outside of your Lightsail account. A value of <code>false</code>
     * specifies a database that is available only to your Lightsail resources
     * in the same region as your database.
     * </p>
     *
     * @return <p>
     *         Specifies the accessibility options for your new database. A
     *         value of <code>true</code> specifies a database that is available
     *         to resources outside of your Lightsail account. A value of
     *         <code>false</code> specifies a database that is available only to
     *         your Lightsail resources in the same region as your database.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of
     * <code>true</code> specifies a database that is available to resources
     * outside of your Lightsail account. A value of <code>false</code>
     * specifies a database that is available only to your Lightsail resources
     * in the same region as your database.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            Specifies the accessibility options for your new database. A
     *            value of <code>true</code> specifies a database that is
     *            available to resources outside of your Lightsail account. A
     *            value of <code>false</code> specifies a database that is
     *            available only to your Lightsail resources in the same region
     *            as your database.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of
     * <code>true</code> specifies a database that is available to resources
     * outside of your Lightsail account. A value of <code>false</code>
     * specifies a database that is available only to your Lightsail resources
     * in the same region as your database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            Specifies the accessibility options for your new database. A
     *            value of <code>true</code> specifies a database that is
     *            available to resources outside of your Lightsail account. A
     *            value of <code>false</code> specifies a database that is
     *            available only to your Lightsail resources in the same region
     *            as your database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @return <p>
     *         The tag keys and optional values to add to the resource during
     *         create.
     *         </p>
     *         <p>
     *         To tag a resource after it has been created, see the
     *         <code>tag resource</code> operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withTags(Tag... tags) {
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getRelationalDatabaseName() != null)
            sb.append("relationalDatabaseName: " + getRelationalDatabaseName() + ",");
        if (getAvailabilityZone() != null)
            sb.append("availabilityZone: " + getAvailabilityZone() + ",");
        if (getRelationalDatabaseBlueprintId() != null)
            sb.append("relationalDatabaseBlueprintId: " + getRelationalDatabaseBlueprintId() + ",");
        if (getRelationalDatabaseBundleId() != null)
            sb.append("relationalDatabaseBundleId: " + getRelationalDatabaseBundleId() + ",");
        if (getMasterDatabaseName() != null)
            sb.append("masterDatabaseName: " + getMasterDatabaseName() + ",");
        if (getMasterUsername() != null)
            sb.append("masterUsername: " + getMasterUsername() + ",");
        if (getMasterUserPassword() != null)
            sb.append("masterUserPassword: " + getMasterUserPassword() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("preferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("preferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("publiclyAccessible: " + getPubliclyAccessible() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseBlueprintId() == null) ? 0
                        : getRelationalDatabaseBlueprintId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseBundleId() == null) ? 0 : getRelationalDatabaseBundleId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMasterDatabaseName() == null) ? 0 : getMasterDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRelationalDatabaseRequest == false)
            return false;
        CreateRelationalDatabaseRequest other = (CreateRelationalDatabaseRequest) obj;

        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null
                && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getRelationalDatabaseBlueprintId() == null
                ^ this.getRelationalDatabaseBlueprintId() == null)
            return false;
        if (other.getRelationalDatabaseBlueprintId() != null
                && other.getRelationalDatabaseBlueprintId().equals(
                        this.getRelationalDatabaseBlueprintId()) == false)
            return false;
        if (other.getRelationalDatabaseBundleId() == null
                ^ this.getRelationalDatabaseBundleId() == null)
            return false;
        if (other.getRelationalDatabaseBundleId() != null
                && other.getRelationalDatabaseBundleId().equals(
                        this.getRelationalDatabaseBundleId()) == false)
            return false;
        if (other.getMasterDatabaseName() == null ^ this.getMasterDatabaseName() == null)
            return false;
        if (other.getMasterDatabaseName() != null
                && other.getMasterDatabaseName().equals(this.getMasterDatabaseName()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null
                && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null
                && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
