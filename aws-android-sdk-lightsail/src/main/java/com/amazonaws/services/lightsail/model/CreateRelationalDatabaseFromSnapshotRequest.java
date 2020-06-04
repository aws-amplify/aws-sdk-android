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
 * Creates a new database from an existing database snapshot in Amazon
 * Lightsail.
 * </p>
 * <p>
 * You can create a new database from a snapshot in if something goes wrong with
 * your original database, or to change it to a different plan, such as a high
 * availability or standard plan.
 * </p>
 * <p>
 * The <code>create relational database from snapshot</code> operation supports
 * tag-based access control via request tags and resource tags applied to the
 * resource identified by relationalDatabaseSnapshotName. For more information,
 * see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateRelationalDatabaseFromSnapshotRequest extends AmazonWebServiceRequest implements
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
     * The name of the database snapshot from which to create your new database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String relationalDatabaseSnapshotName;

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
     * When creating a new database from a snapshot, you cannot choose a bundle
     * that is smaller than the bundle of the source database.
     * </p>
     */
    private String relationalDatabaseBundleId;

    /**
     * <p>
     * The name of the source database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String sourceRelationalDatabaseName;

    /**
     * <p>
     * The date and time to restore your database from.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if the <code>use latest restorable time</code>
     * parameter is <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a restore time of October 1, 2018, at 8
     * PM UTC, then you input <code>1538424000</code> as the restore time.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date restoreTime;

    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time.
     * A value of <code>true</code> restores from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code>
     * parameter is provided.
     * </p>
     */
    private Boolean useLatestRestorableTime;

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
    public CreateRelationalDatabaseFromSnapshotRequest withRelationalDatabaseName(
            String relationalDatabaseName) {
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
    public CreateRelationalDatabaseFromSnapshotRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
    public CreateRelationalDatabaseFromSnapshotRequest withPubliclyAccessible(
            Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * The name of the database snapshot from which to create your new database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the database snapshot from which to create your new
     *         database.
     *         </p>
     */
    public String getRelationalDatabaseSnapshotName() {
        return relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot from which to create your new database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseSnapshotName <p>
     *            The name of the database snapshot from which to create your
     *            new database.
     *            </p>
     */
    public void setRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
        this.relationalDatabaseSnapshotName = relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot from which to create your new database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseSnapshotName <p>
     *            The name of the database snapshot from which to create your
     *            new database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseFromSnapshotRequest withRelationalDatabaseSnapshotName(
            String relationalDatabaseSnapshotName) {
        this.relationalDatabaseSnapshotName = relationalDatabaseSnapshotName;
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
     * <p>
     * When creating a new database from a snapshot, you cannot choose a bundle
     * that is smaller than the bundle of the source database.
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
     *         <p>
     *         When creating a new database from a snapshot, you cannot choose a
     *         bundle that is smaller than the bundle of the source database.
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
     * <p>
     * When creating a new database from a snapshot, you cannot choose a bundle
     * that is smaller than the bundle of the source database.
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
     *            <p>
     *            When creating a new database from a snapshot, you cannot
     *            choose a bundle that is smaller than the bundle of the source
     *            database.
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
     * When creating a new database from a snapshot, you cannot choose a bundle
     * that is smaller than the bundle of the source database.
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
     *            <p>
     *            When creating a new database from a snapshot, you cannot
     *            choose a bundle that is smaller than the bundle of the source
     *            database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseFromSnapshotRequest withRelationalDatabaseBundleId(
            String relationalDatabaseBundleId) {
        this.relationalDatabaseBundleId = relationalDatabaseBundleId;
        return this;
    }

    /**
     * <p>
     * The name of the source database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the source database.
     *         </p>
     */
    public String getSourceRelationalDatabaseName() {
        return sourceRelationalDatabaseName;
    }

    /**
     * <p>
     * The name of the source database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param sourceRelationalDatabaseName <p>
     *            The name of the source database.
     *            </p>
     */
    public void setSourceRelationalDatabaseName(String sourceRelationalDatabaseName) {
        this.sourceRelationalDatabaseName = sourceRelationalDatabaseName;
    }

    /**
     * <p>
     * The name of the source database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param sourceRelationalDatabaseName <p>
     *            The name of the source database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseFromSnapshotRequest withSourceRelationalDatabaseName(
            String sourceRelationalDatabaseName) {
        this.sourceRelationalDatabaseName = sourceRelationalDatabaseName;
        return this;
    }

    /**
     * <p>
     * The date and time to restore your database from.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if the <code>use latest restorable time</code>
     * parameter is <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a restore time of October 1, 2018, at 8
     * PM UTC, then you input <code>1538424000</code> as the restore time.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The date and time to restore your database from.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be before the latest restorable time for the database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be specified if the
     *         <code>use latest restorable time</code> parameter is
     *         <code>true</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use a restore time of October 1,
     *         2018, at 8 PM UTC, then you input <code>1538424000</code> as the
     *         restore time.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Date getRestoreTime() {
        return restoreTime;
    }

    /**
     * <p>
     * The date and time to restore your database from.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if the <code>use latest restorable time</code>
     * parameter is <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a restore time of October 1, 2018, at 8
     * PM UTC, then you input <code>1538424000</code> as the restore time.
     * </p>
     * </li>
     * </ul>
     *
     * @param restoreTime <p>
     *            The date and time to restore your database from.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be before the latest restorable time for the database.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be specified if the
     *            <code>use latest restorable time</code> parameter is
     *            <code>true</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in the Unix time format.
     *            </p>
     *            <p>
     *            For example, if you wish to use a restore time of October 1,
     *            2018, at 8 PM UTC, then you input <code>1538424000</code> as
     *            the restore time.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
    }

    /**
     * <p>
     * The date and time to restore your database from.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if the <code>use latest restorable time</code>
     * parameter is <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a restore time of October 1, 2018, at 8
     * PM UTC, then you input <code>1538424000</code> as the restore time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreTime <p>
     *            The date and time to restore your database from.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be before the latest restorable time for the database.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be specified if the
     *            <code>use latest restorable time</code> parameter is
     *            <code>true</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in the Unix time format.
     *            </p>
     *            <p>
     *            For example, if you wish to use a restore time of October 1,
     *            2018, at 8 PM UTC, then you input <code>1538424000</code> as
     *            the restore time.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseFromSnapshotRequest withRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time.
     * A value of <code>true</code> restores from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code>
     * parameter is provided.
     * </p>
     *
     * @return <p>
     *         Specifies whether your database is restored from the latest
     *         backup time. A value of <code>true</code> restores from the
     *         latest backup time.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Constraints: Cannot be specified if the <code>restore time</code>
     *         parameter is provided.
     *         </p>
     */
    public Boolean isUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time.
     * A value of <code>true</code> restores from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code>
     * parameter is provided.
     * </p>
     *
     * @return <p>
     *         Specifies whether your database is restored from the latest
     *         backup time. A value of <code>true</code> restores from the
     *         latest backup time.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Constraints: Cannot be specified if the <code>restore time</code>
     *         parameter is provided.
     *         </p>
     */
    public Boolean getUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time.
     * A value of <code>true</code> restores from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code>
     * parameter is provided.
     * </p>
     *
     * @param useLatestRestorableTime <p>
     *            Specifies whether your database is restored from the latest
     *            backup time. A value of <code>true</code> restores from the
     *            latest backup time.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     *            <p>
     *            Constraints: Cannot be specified if the
     *            <code>restore time</code> parameter is provided.
     *            </p>
     */
    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time.
     * A value of <code>true</code> restores from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code>
     * parameter is provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLatestRestorableTime <p>
     *            Specifies whether your database is restored from the latest
     *            backup time. A value of <code>true</code> restores from the
     *            latest backup time.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     *            <p>
     *            Constraints: Cannot be specified if the
     *            <code>restore time</code> parameter is provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRelationalDatabaseFromSnapshotRequest withUseLatestRestorableTime(
            Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
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
    public CreateRelationalDatabaseFromSnapshotRequest withTags(Tag... tags) {
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
    public CreateRelationalDatabaseFromSnapshotRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPubliclyAccessible() != null)
            sb.append("publiclyAccessible: " + getPubliclyAccessible() + ",");
        if (getRelationalDatabaseSnapshotName() != null)
            sb.append("relationalDatabaseSnapshotName: " + getRelationalDatabaseSnapshotName()
                    + ",");
        if (getRelationalDatabaseBundleId() != null)
            sb.append("relationalDatabaseBundleId: " + getRelationalDatabaseBundleId() + ",");
        if (getSourceRelationalDatabaseName() != null)
            sb.append("sourceRelationalDatabaseName: " + getSourceRelationalDatabaseName() + ",");
        if (getRestoreTime() != null)
            sb.append("restoreTime: " + getRestoreTime() + ",");
        if (getUseLatestRestorableTime() != null)
            sb.append("useLatestRestorableTime: " + getUseLatestRestorableTime() + ",");
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
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseSnapshotName() == null) ? 0
                        : getRelationalDatabaseSnapshotName().hashCode());
        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseBundleId() == null) ? 0 : getRelationalDatabaseBundleId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceRelationalDatabaseName() == null) ? 0
                        : getSourceRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreTime() == null) ? 0 : getRestoreTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRelationalDatabaseFromSnapshotRequest == false)
            return false;
        CreateRelationalDatabaseFromSnapshotRequest other = (CreateRelationalDatabaseFromSnapshotRequest) obj;

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
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getRelationalDatabaseSnapshotName() == null
                ^ this.getRelationalDatabaseSnapshotName() == null)
            return false;
        if (other.getRelationalDatabaseSnapshotName() != null
                && other.getRelationalDatabaseSnapshotName().equals(
                        this.getRelationalDatabaseSnapshotName()) == false)
            return false;
        if (other.getRelationalDatabaseBundleId() == null
                ^ this.getRelationalDatabaseBundleId() == null)
            return false;
        if (other.getRelationalDatabaseBundleId() != null
                && other.getRelationalDatabaseBundleId().equals(
                        this.getRelationalDatabaseBundleId()) == false)
            return false;
        if (other.getSourceRelationalDatabaseName() == null
                ^ this.getSourceRelationalDatabaseName() == null)
            return false;
        if (other.getSourceRelationalDatabaseName() != null
                && other.getSourceRelationalDatabaseName().equals(
                        this.getSourceRelationalDatabaseName()) == false)
            return false;
        if (other.getRestoreTime() == null ^ this.getRestoreTime() == null)
            return false;
        if (other.getRestoreTime() != null
                && other.getRestoreTime().equals(this.getRestoreTime()) == false)
            return false;
        if (other.getUseLatestRestorableTime() == null ^ this.getUseLatestRestorableTime() == null)
            return false;
        if (other.getUseLatestRestorableTime() != null
                && other.getUseLatestRestorableTime().equals(this.getUseLatestRestorableTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
