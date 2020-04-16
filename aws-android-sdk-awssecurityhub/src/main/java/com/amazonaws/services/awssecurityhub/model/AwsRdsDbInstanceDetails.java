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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the details of an Amazon RDS DB instance.
 * </p>
 */
public class AwsRdsDbInstanceDetails implements Serializable {
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     */
    private java.util.List<AwsRdsDbInstanceAssociatedRole> associatedRoles;

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String cACertificateIdentifier;

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the
     * DB cluster that the DB instance is a member of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the
     * unique key that identifies a DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String dBInstanceClass;

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is
     * part of a DB cluster, this can be a different port than the DB cluster
     * port.
     * </p>
     */
    private Integer dbInstancePort;

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB instance is accessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String dbiResourceId;

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB instance was
     * created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown
     * when the returned parameters do not apply to an Oracle DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String dBName;

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     */
    private AwsRdsDbInstanceEndpoint endpoint;

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String engine;

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String engineVersion;

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String instanceCreateTime;

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly
     * resolvable DNS name, which resolves to a public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that
     * resolves to a private IP address.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE
     * encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String tdeCredentialArn;

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     */
    private java.util.List<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups;

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     *
     * @return <p>
     *         The AWS Identity and Access Management (IAM) roles associated
     *         with the DB instance.
     *         </p>
     */
    public java.util.List<AwsRdsDbInstanceAssociatedRole> getAssociatedRoles() {
        return associatedRoles;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     *
     * @param associatedRoles <p>
     *            The AWS Identity and Access Management (IAM) roles associated
     *            with the DB instance.
     *            </p>
     */
    public void setAssociatedRoles(
            java.util.Collection<AwsRdsDbInstanceAssociatedRole> associatedRoles) {
        if (associatedRoles == null) {
            this.associatedRoles = null;
            return;
        }

        this.associatedRoles = new java.util.ArrayList<AwsRdsDbInstanceAssociatedRole>(
                associatedRoles);
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedRoles <p>
     *            The AWS Identity and Access Management (IAM) roles associated
     *            with the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withAssociatedRoles(
            AwsRdsDbInstanceAssociatedRole... associatedRoles) {
        if (getAssociatedRoles() == null) {
            this.associatedRoles = new java.util.ArrayList<AwsRdsDbInstanceAssociatedRole>(
                    associatedRoles.length);
        }
        for (AwsRdsDbInstanceAssociatedRole value : associatedRoles) {
            this.associatedRoles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedRoles <p>
     *            The AWS Identity and Access Management (IAM) roles associated
     *            with the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withAssociatedRoles(
            java.util.Collection<AwsRdsDbInstanceAssociatedRole> associatedRoles) {
        setAssociatedRoles(associatedRoles);
        return this;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier of the CA certificate for this DB instance.
     *         </p>
     */
    public String getCACertificateIdentifier() {
        return cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param cACertificateIdentifier <p>
     *            The identifier of the CA certificate for this DB instance.
     *            </p>
     */
    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param cACertificateIdentifier <p>
     *            The identifier of the CA certificate for this DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
        return this;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the
     * DB cluster that the DB instance is a member of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If the DB instance is a member of a DB cluster, contains the name
     *         of the DB cluster that the DB instance is a member of.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the
     * DB cluster that the DB instance is a member of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dBClusterIdentifier <p>
     *            If the DB instance is a member of a DB cluster, contains the
     *            name of the DB cluster that the DB instance is a member of.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the
     * DB cluster that the DB instance is a member of.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dBClusterIdentifier <p>
     *            If the DB instance is a member of a DB cluster, contains the
     *            name of the DB cluster that the DB instance is a member of.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the
     * unique key that identifies a DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Contains a user-supplied database identifier. This identifier is
     *         the unique key that identifies a DB instance.
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the
     * unique key that identifies a DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dBInstanceIdentifier <p>
     *            Contains a user-supplied database identifier. This identifier
     *            is the unique key that identifies a DB instance.
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the
     * unique key that identifies a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dBInstanceIdentifier <p>
     *            Contains a user-supplied database identifier. This identifier
     *            is the unique key that identifies a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Contains the name of the compute and memory capacity class of the
     *         DB instance.
     *         </p>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dBInstanceClass <p>
     *            Contains the name of the compute and memory capacity class of
     *            the DB instance.
     *            </p>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dBInstanceClass <p>
     *            Contains the name of the compute and memory capacity class of
     *            the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is
     * part of a DB cluster, this can be a different port than the DB cluster
     * port.
     * </p>
     *
     * @return <p>
     *         Specifies the port that the DB instance listens on. If the DB
     *         instance is part of a DB cluster, this can be a different port
     *         than the DB cluster port.
     *         </p>
     */
    public Integer getDbInstancePort() {
        return dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is
     * part of a DB cluster, this can be a different port than the DB cluster
     * port.
     * </p>
     *
     * @param dbInstancePort <p>
     *            Specifies the port that the DB instance listens on. If the DB
     *            instance is part of a DB cluster, this can be a different port
     *            than the DB cluster port.
     *            </p>
     */
    public void setDbInstancePort(Integer dbInstancePort) {
        this.dbInstancePort = dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is
     * part of a DB cluster, this can be a different port than the DB cluster
     * port.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbInstancePort <p>
     *            Specifies the port that the DB instance listens on. If the DB
     *            instance is part of a DB cluster, this can be a different port
     *            than the DB cluster port.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withDbInstancePort(Integer dbInstancePort) {
        this.dbInstancePort = dbInstancePort;
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB instance is accessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The AWS Region-unique, immutable identifier for the DB instance.
     *         This identifier is found in AWS CloudTrail log entries whenever
     *         the AWS KMS key for the DB instance is accessed.
     *         </p>
     */
    public String getDbiResourceId() {
        return dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB instance is accessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dbiResourceId <p>
     *            The AWS Region-unique, immutable identifier for the DB
     *            instance. This identifier is found in AWS CloudTrail log
     *            entries whenever the AWS KMS key for the DB instance is
     *            accessed.
     *            </p>
     */
    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB instance is accessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dbiResourceId <p>
     *            The AWS Region-unique, immutable identifier for the DB
     *            instance. This identifier is found in AWS CloudTrail log
     *            entries whenever the AWS KMS key for the DB instance is
     *            accessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
        return this;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB instance was
     * created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown
     * when the returned parameters do not apply to an Oracle DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The meaning of this parameter differs according to the database
     *         engine you use.
     *         </p>
     *         <p>
     *         <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *         </p>
     *         <p>
     *         Contains the name of the initial database of this instance that
     *         was provided at create time, if one was specified when the DB
     *         instance was created. This same name is returned for the life of
     *         the DB instance.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Contains the Oracle System ID (SID) of the created DB instance.
     *         Not shown when the returned parameters do not apply to an Oracle
     *         DB instance.
     *         </p>
     */
    public String getDBName() {
        return dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB instance was
     * created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown
     * when the returned parameters do not apply to an Oracle DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dBName <p>
     *            The meaning of this parameter differs according to the
     *            database engine you use.
     *            </p>
     *            <p>
     *            <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *            </p>
     *            <p>
     *            Contains the name of the initial database of this instance
     *            that was provided at create time, if one was specified when
     *            the DB instance was created. This same name is returned for
     *            the life of the DB instance.
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Contains the Oracle System ID (SID) of the created DB
     *            instance. Not shown when the returned parameters do not apply
     *            to an Oracle DB instance.
     *            </p>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB instance was
     * created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown
     * when the returned parameters do not apply to an Oracle DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dBName <p>
     *            The meaning of this parameter differs according to the
     *            database engine you use.
     *            </p>
     *            <p>
     *            <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *            </p>
     *            <p>
     *            Contains the name of the initial database of this instance
     *            that was provided at create time, if one was specified when
     *            the DB instance was created. This same name is returned for
     *            the life of the DB instance.
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Contains the Oracle System ID (SID) of the created DB
     *            instance. Not shown when the returned parameters do not apply
     *            to an Oracle DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the DB instance has deletion protection
     *         enabled.
     *         </p>
     *         <p>
     *         When deletion protection is enabled, the database cannot be
     *         deleted.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the DB instance has deletion protection
     *         enabled.
     *         </p>
     *         <p>
     *         When deletion protection is enabled, the database cannot be
     *         deleted.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     *
     * @param deletionProtection <p>
     *            Indicates whether the DB instance has deletion protection
     *            enabled.
     *            </p>
     *            <p>
     *            When deletion protection is enabled, the database cannot be
     *            deleted.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            Indicates whether the DB instance has deletion protection
     *            enabled.
     *            </p>
     *            <p>
     *            When deletion protection is enabled, the database cannot be
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     *
     * @return <p>
     *         Specifies the connection endpoint.
     *         </p>
     */
    public AwsRdsDbInstanceEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     *
     * @param endpoint <p>
     *            Specifies the connection endpoint.
     *            </p>
     */
    public void setEndpoint(AwsRdsDbInstanceEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            Specifies the connection endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withEndpoint(AwsRdsDbInstanceEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Provides the name of the database engine to use for this DB
     *         instance.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engine <p>
     *            Provides the name of the database engine to use for this DB
     *            instance.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engine <p>
     *            Provides the name of the database engine to use for this DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Indicates the database engine version.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engineVersion <p>
     *            Indicates the database engine version.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param engineVersion <p>
     *            Indicates the database engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         True if mapping of AWS Identity and Access Management (IAM)
     *         accounts to database accounts is enabled, and otherwise false.
     *         </p>
     *         <p>
     *         IAM database authentication can be enabled for the following
     *         database engines.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora 5.6 or higher
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         True if mapping of AWS Identity and Access Management (IAM)
     *         accounts to database accounts is enabled, and otherwise false.
     *         </p>
     *         <p>
     *         IAM database authentication can be enabled for the following
     *         database engines.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora 5.6 or higher
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     *
     * @param iAMDatabaseAuthenticationEnabled <p>
     *            True if mapping of AWS Identity and Access Management (IAM)
     *            accounts to database accounts is enabled, and otherwise false.
     *            </p>
     *            <p>
     *            IAM database authentication can be enabled for the following
     *            database engines.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For MySQL 5.6, minor version 5.6.34 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For MySQL 5.7, minor version 5.7.16 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora 5.6 or higher
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iAMDatabaseAuthenticationEnabled <p>
     *            True if mapping of AWS Identity and Access Management (IAM)
     *            accounts to database accounts is enabled, and otherwise false.
     *            </p>
     *            <p>
     *            IAM database authentication can be enabled for the following
     *            database engines.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For MySQL 5.6, minor version 5.6.34 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For MySQL 5.7, minor version 5.7.16 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora 5.6 or higher
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withIAMDatabaseAuthenticationEnabled(
            Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
        return this;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Provides the date and time the DB instance was created.
     *         </p>
     */
    public String getInstanceCreateTime() {
        return instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param instanceCreateTime <p>
     *            Provides the date and time the DB instance was created.
     *            </p>
     */
    public void setInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param instanceCreateTime <p>
     *            Provides the date and time the DB instance was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If <code>StorageEncrypted</code> is true, the AWS KMS key
     *         identifier for the encrypted DB instance.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kmsKeyId <p>
     *            If <code>StorageEncrypted</code> is true, the AWS KMS key
     *            identifier for the encrypted DB instance.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kmsKeyId <p>
     *            If <code>StorageEncrypted</code> is true, the AWS KMS key
     *            identifier for the encrypted DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly
     * resolvable DNS name, which resolves to a public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that
     * resolves to a private IP address.
     * </p>
     *
     * @return <p>
     *         Specifies the accessibility options for the DB instance.
     *         </p>
     *         <p>
     *         A value of true specifies an Internet-facing instance with a
     *         publicly resolvable DNS name, which resolves to a public IP
     *         address.
     *         </p>
     *         <p>
     *         A value of false specifies an internal instance with a DNS name
     *         that resolves to a private IP address.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly
     * resolvable DNS name, which resolves to a public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that
     * resolves to a private IP address.
     * </p>
     *
     * @return <p>
     *         Specifies the accessibility options for the DB instance.
     *         </p>
     *         <p>
     *         A value of true specifies an Internet-facing instance with a
     *         publicly resolvable DNS name, which resolves to a public IP
     *         address.
     *         </p>
     *         <p>
     *         A value of false specifies an internal instance with a DNS name
     *         that resolves to a private IP address.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly
     * resolvable DNS name, which resolves to a public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that
     * resolves to a private IP address.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            Specifies the accessibility options for the DB instance.
     *            </p>
     *            <p>
     *            A value of true specifies an Internet-facing instance with a
     *            publicly resolvable DNS name, which resolves to a public IP
     *            address.
     *            </p>
     *            <p>
     *            A value of false specifies an internal instance with a DNS
     *            name that resolves to a private IP address.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly
     * resolvable DNS name, which resolves to a public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that
     * resolves to a private IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            Specifies the accessibility options for the DB instance.
     *            </p>
     *            <p>
     *            A value of true specifies an Internet-facing instance with a
     *            publicly resolvable DNS name, which resolves to a public IP
     *            address.
     *            </p>
     *            <p>
     *            A value of false specifies an internal instance with a DNS
     *            name that resolves to a private IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB instance is encrypted.
     *         </p>
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB instance is encrypted.
     *         </p>
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     *
     * @param storageEncrypted <p>
     *            Specifies whether the DB instance is encrypted.
     *            </p>
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageEncrypted <p>
     *            Specifies whether the DB instance is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE
     * encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN from the key store with which the instance is associated
     *         for TDE encryption.
     *         </p>
     */
    public String getTdeCredentialArn() {
        return tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE
     * encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which the instance is
     *            associated for TDE encryption.
     *            </p>
     */
    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which the instance is
     *            associated for TDE encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     *
     * @return <p>
     *         A list of VPC security groups that the DB instance belongs to.
     *         </p>
     */
    public java.util.List<AwsRdsDbInstanceVpcSecurityGroup> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     *
     * @param vpcSecurityGroups <p>
     *            A list of VPC security groups that the DB instance belongs to.
     *            </p>
     */
    public void setVpcSecurityGroups(
            java.util.Collection<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<AwsRdsDbInstanceVpcSecurityGroup>(
                vpcSecurityGroups);
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            A list of VPC security groups that the DB instance belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withVpcSecurityGroups(
            AwsRdsDbInstanceVpcSecurityGroup... vpcSecurityGroups) {
        if (getVpcSecurityGroups() == null) {
            this.vpcSecurityGroups = new java.util.ArrayList<AwsRdsDbInstanceVpcSecurityGroup>(
                    vpcSecurityGroups.length);
        }
        for (AwsRdsDbInstanceVpcSecurityGroup value : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            A list of VPC security groups that the DB instance belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceDetails withVpcSecurityGroups(
            java.util.Collection<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
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
        if (getAssociatedRoles() != null)
            sb.append("AssociatedRoles: " + getAssociatedRoles() + ",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: " + getCACertificateIdentifier() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getDbInstancePort() != null)
            sb.append("DbInstancePort: " + getDbInstancePort() + ",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: " + getDbiResourceId() + ",");
        if (getDBName() != null)
            sb.append("DBName: " + getDBName() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: " + getIAMDatabaseAuthenticationEnabled()
                    + ",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: " + getInstanceCreateTime() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: " + getVpcSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociatedRoles() == null) ? 0 : getAssociatedRoles().hashCode());
        hashCode = prime
                * hashCode
                + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode
                + ((getDbInstancePort() == null) ? 0 : getDbInstancePort().hashCode());
        hashCode = prime * hashCode
                + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0
                        : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode
                + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbInstanceDetails == false)
            return false;
        AwsRdsDbInstanceDetails other = (AwsRdsDbInstanceDetails) obj;

        if (other.getAssociatedRoles() == null ^ this.getAssociatedRoles() == null)
            return false;
        if (other.getAssociatedRoles() != null
                && other.getAssociatedRoles().equals(this.getAssociatedRoles()) == false)
            return false;
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null
                && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null
                && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getDbInstancePort() == null ^ this.getDbInstancePort() == null)
            return false;
        if (other.getDbInstancePort() != null
                && other.getDbInstancePort().equals(this.getDbInstancePort()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null
                && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null
                ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(
                        this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null
                && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null
                && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null
                && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null
                && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        return true;
    }
}
