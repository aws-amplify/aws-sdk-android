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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about DB snapshots. This API action supports pagination.
 * </p>
 */
public class DescribeDBSnapshotsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the DB instance to retrieve the list of DB snapshots for. This
     * parameter can't be used in conjunction with
     * <code>DBSnapshotIdentifier</code>. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * A specific DB snapshot identifier to describe. This parameter can't be
     * used in conjunction with <code>DBInstanceIdentifier</code>. This value is
     * stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBSnapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     */
    private String dBSnapshotIdentifier;

    /**
     * <p>
     * The type of snapshots to be returned. You can specify one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB snapshots that have been
     * automatically taken by Amazon RDS for my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB snapshots that have been taken by my
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB snapshots that have been
     * shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB snapshots that have been marked as
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsbackup</code> - Return the DB snapshots managed by the AWS
     * Backup service.
     * </p>
     * <p>
     * For information about AWS Backup, see the <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html"
     * > <i>AWS Backup Developer Guide.</i> </a>
     * </p>
     * <p>
     * The <code>awsbackup</code> type does not apply to Aurora.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both
     * automated and manual snapshots are returned. Shared and public DB
     * snapshots are not included in the returned results by default. You can
     * include shared snapshots with these results by enabling the
     * <code>IncludeShared</code> parameter. You can include public snapshots
     * with these results by enabling the <code>IncludePublic</code> parameter.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     * don't apply for <code>SnapshotType</code> values of <code>manual</code>
     * or <code>automated</code>. The <code>IncludePublic</code> parameter
     * doesn't apply when <code>SnapshotType</code> is set to
     * <code>shared</code>. The <code>IncludeShared</code> parameter doesn't
     * apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     */
    private String snapshotType;

    /**
     * <p>
     * A filter that specifies one or more DB snapshots to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts identifiers of source DB
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts names of database engines.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBSnapshots</code> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A value that indicates whether to include shared manual DB cluster
     * snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore. By default, these snapshots are not
     * included.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot
     * from another AWS account by using the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     */
    private Boolean includeShared;

    /**
     * <p>
     * A value that indicates whether to include manual DB cluster snapshots
     * that are public and can be copied or restored by any AWS account. By
     * default, the public snapshots are not included.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the
     * <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     */
    private Boolean includePublic;

    /**
     * <p>
     * A specific DB resource ID to describe.
     * </p>
     */
    private String dbiResourceId;

    /**
     * <p>
     * The ID of the DB instance to retrieve the list of DB snapshots for. This
     * parameter can't be used in conjunction with
     * <code>DBSnapshotIdentifier</code>. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The ID of the DB instance to retrieve the list of DB snapshots
     *         for. This parameter can't be used in conjunction with
     *         <code>DBSnapshotIdentifier</code>. This parameter isn't
     *         case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the identifier of an existing DBInstance.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID of the DB instance to retrieve the list of DB snapshots for. This
     * parameter can't be used in conjunction with
     * <code>DBSnapshotIdentifier</code>. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBInstanceIdentifier <p>
     *            The ID of the DB instance to retrieve the list of DB snapshots
     *            for. This parameter can't be used in conjunction with
     *            <code>DBSnapshotIdentifier</code>. This parameter isn't
     *            case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the identifier of an existing
     *            DBInstance.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The ID of the DB instance to retrieve the list of DB snapshots for. This
     * parameter can't be used in conjunction with
     * <code>DBSnapshotIdentifier</code>. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The ID of the DB instance to retrieve the list of DB snapshots
     *            for. This parameter can't be used in conjunction with
     *            <code>DBSnapshotIdentifier</code>. This parameter isn't
     *            case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the identifier of an existing
     *            DBInstance.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * A specific DB snapshot identifier to describe. This parameter can't be
     * used in conjunction with <code>DBInstanceIdentifier</code>. This value is
     * stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBSnapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A specific DB snapshot identifier to describe. This parameter
     *         can't be used in conjunction with
     *         <code>DBInstanceIdentifier</code>. This value is stored as a
     *         lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the identifier of an existing DBSnapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If this identifier is for an automated snapshot, the
     *         <code>SnapshotType</code> parameter must also be specified.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * <p>
     * A specific DB snapshot identifier to describe. This parameter can't be
     * used in conjunction with <code>DBInstanceIdentifier</code>. This value is
     * stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBSnapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBSnapshotIdentifier <p>
     *            A specific DB snapshot identifier to describe. This parameter
     *            can't be used in conjunction with
     *            <code>DBInstanceIdentifier</code>. This value is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the identifier of an existing
     *            DBSnapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If this identifier is for an automated snapshot, the
     *            <code>SnapshotType</code> parameter must also be specified.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * A specific DB snapshot identifier to describe. This parameter can't be
     * used in conjunction with <code>DBInstanceIdentifier</code>. This value is
     * stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the identifier of an existing DBSnapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If this identifier is for an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotIdentifier <p>
     *            A specific DB snapshot identifier to describe. This parameter
     *            can't be used in conjunction with
     *            <code>DBInstanceIdentifier</code>. This value is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the identifier of an existing
     *            DBSnapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If this identifier is for an automated snapshot, the
     *            <code>SnapshotType</code> parameter must also be specified.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The type of snapshots to be returned. You can specify one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB snapshots that have been
     * automatically taken by Amazon RDS for my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB snapshots that have been taken by my
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB snapshots that have been
     * shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB snapshots that have been marked as
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsbackup</code> - Return the DB snapshots managed by the AWS
     * Backup service.
     * </p>
     * <p>
     * For information about AWS Backup, see the <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html"
     * > <i>AWS Backup Developer Guide.</i> </a>
     * </p>
     * <p>
     * The <code>awsbackup</code> type does not apply to Aurora.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both
     * automated and manual snapshots are returned. Shared and public DB
     * snapshots are not included in the returned results by default. You can
     * include shared snapshots with these results by enabling the
     * <code>IncludeShared</code> parameter. You can include public snapshots
     * with these results by enabling the <code>IncludePublic</code> parameter.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     * don't apply for <code>SnapshotType</code> values of <code>manual</code>
     * or <code>automated</code>. The <code>IncludePublic</code> parameter
     * doesn't apply when <code>SnapshotType</code> is set to
     * <code>shared</code>. The <code>IncludeShared</code> parameter doesn't
     * apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     *
     * @return <p>
     *         The type of snapshots to be returned. You can specify one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>automated</code> - Return all DB snapshots that have been
     *         automatically taken by Amazon RDS for my AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>manual</code> - Return all DB snapshots that have been
     *         taken by my AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>shared</code> - Return all manual DB snapshots that have
     *         been shared to my AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>public</code> - Return all DB snapshots that have been
     *         marked as public.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>awsbackup</code> - Return the DB snapshots managed by the
     *         AWS Backup service.
     *         </p>
     *         <p>
     *         For information about AWS Backup, see the <a href=
     *         "https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html"
     *         > <i>AWS Backup Developer Guide.</i> </a>
     *         </p>
     *         <p>
     *         The <code>awsbackup</code> type does not apply to Aurora.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a <code>SnapshotType</code> value, then both
     *         automated and manual snapshots are returned. Shared and public DB
     *         snapshots are not included in the returned results by default.
     *         You can include shared snapshots with these results by enabling
     *         the <code>IncludeShared</code> parameter. You can include public
     *         snapshots with these results by enabling the
     *         <code>IncludePublic</code> parameter.
     *         </p>
     *         <p>
     *         The <code>IncludeShared</code> and <code>IncludePublic</code>
     *         parameters don't apply for <code>SnapshotType</code> values of
     *         <code>manual</code> or <code>automated</code>. The
     *         <code>IncludePublic</code> parameter doesn't apply when
     *         <code>SnapshotType</code> is set to <code>shared</code>. The
     *         <code>IncludeShared</code> parameter doesn't apply when
     *         <code>SnapshotType</code> is set to <code>public</code>.
     *         </p>
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    /**
     * <p>
     * The type of snapshots to be returned. You can specify one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB snapshots that have been
     * automatically taken by Amazon RDS for my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB snapshots that have been taken by my
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB snapshots that have been
     * shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB snapshots that have been marked as
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsbackup</code> - Return the DB snapshots managed by the AWS
     * Backup service.
     * </p>
     * <p>
     * For information about AWS Backup, see the <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html"
     * > <i>AWS Backup Developer Guide.</i> </a>
     * </p>
     * <p>
     * The <code>awsbackup</code> type does not apply to Aurora.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both
     * automated and manual snapshots are returned. Shared and public DB
     * snapshots are not included in the returned results by default. You can
     * include shared snapshots with these results by enabling the
     * <code>IncludeShared</code> parameter. You can include public snapshots
     * with these results by enabling the <code>IncludePublic</code> parameter.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     * don't apply for <code>SnapshotType</code> values of <code>manual</code>
     * or <code>automated</code>. The <code>IncludePublic</code> parameter
     * doesn't apply when <code>SnapshotType</code> is set to
     * <code>shared</code>. The <code>IncludeShared</code> parameter doesn't
     * apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     *
     * @param snapshotType <p>
     *            The type of snapshots to be returned. You can specify one of
     *            the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>automated</code> - Return all DB snapshots that have
     *            been automatically taken by Amazon RDS for my AWS account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>manual</code> - Return all DB snapshots that have been
     *            taken by my AWS account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>shared</code> - Return all manual DB snapshots that have
     *            been shared to my AWS account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>public</code> - Return all DB snapshots that have been
     *            marked as public.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>awsbackup</code> - Return the DB snapshots managed by
     *            the AWS Backup service.
     *            </p>
     *            <p>
     *            For information about AWS Backup, see the <a href=
     *            "https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html"
     *            > <i>AWS Backup Developer Guide.</i> </a>
     *            </p>
     *            <p>
     *            The <code>awsbackup</code> type does not apply to Aurora.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a <code>SnapshotType</code> value, then
     *            both automated and manual snapshots are returned. Shared and
     *            public DB snapshots are not included in the returned results
     *            by default. You can include shared snapshots with these
     *            results by enabling the <code>IncludeShared</code> parameter.
     *            You can include public snapshots with these results by
     *            enabling the <code>IncludePublic</code> parameter.
     *            </p>
     *            <p>
     *            The <code>IncludeShared</code> and <code>IncludePublic</code>
     *            parameters don't apply for <code>SnapshotType</code> values of
     *            <code>manual</code> or <code>automated</code>. The
     *            <code>IncludePublic</code> parameter doesn't apply when
     *            <code>SnapshotType</code> is set to <code>shared</code>. The
     *            <code>IncludeShared</code> parameter doesn't apply when
     *            <code>SnapshotType</code> is set to <code>public</code>.
     *            </p>
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of snapshots to be returned. You can specify one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all DB snapshots that have been
     * automatically taken by Amazon RDS for my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all DB snapshots that have been taken by my
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shared</code> - Return all manual DB snapshots that have been
     * shared to my AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public</code> - Return all DB snapshots that have been marked as
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>awsbackup</code> - Return the DB snapshots managed by the AWS
     * Backup service.
     * </p>
     * <p>
     * For information about AWS Backup, see the <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html"
     * > <i>AWS Backup Developer Guide.</i> </a>
     * </p>
     * <p>
     * The <code>awsbackup</code> type does not apply to Aurora.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>SnapshotType</code> value, then both
     * automated and manual snapshots are returned. Shared and public DB
     * snapshots are not included in the returned results by default. You can
     * include shared snapshots with these results by enabling the
     * <code>IncludeShared</code> parameter. You can include public snapshots
     * with these results by enabling the <code>IncludePublic</code> parameter.
     * </p>
     * <p>
     * The <code>IncludeShared</code> and <code>IncludePublic</code> parameters
     * don't apply for <code>SnapshotType</code> values of <code>manual</code>
     * or <code>automated</code>. The <code>IncludePublic</code> parameter
     * doesn't apply when <code>SnapshotType</code> is set to
     * <code>shared</code>. The <code>IncludeShared</code> parameter doesn't
     * apply when <code>SnapshotType</code> is set to <code>public</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotType <p>
     *            The type of snapshots to be returned. You can specify one of
     *            the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>automated</code> - Return all DB snapshots that have
     *            been automatically taken by Amazon RDS for my AWS account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>manual</code> - Return all DB snapshots that have been
     *            taken by my AWS account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>shared</code> - Return all manual DB snapshots that have
     *            been shared to my AWS account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>public</code> - Return all DB snapshots that have been
     *            marked as public.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>awsbackup</code> - Return the DB snapshots managed by
     *            the AWS Backup service.
     *            </p>
     *            <p>
     *            For information about AWS Backup, see the <a href=
     *            "https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html"
     *            > <i>AWS Backup Developer Guide.</i> </a>
     *            </p>
     *            <p>
     *            The <code>awsbackup</code> type does not apply to Aurora.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a <code>SnapshotType</code> value, then
     *            both automated and manual snapshots are returned. Shared and
     *            public DB snapshots are not included in the returned results
     *            by default. You can include shared snapshots with these
     *            results by enabling the <code>IncludeShared</code> parameter.
     *            You can include public snapshots with these results by
     *            enabling the <code>IncludePublic</code> parameter.
     *            </p>
     *            <p>
     *            The <code>IncludeShared</code> and <code>IncludePublic</code>
     *            parameters don't apply for <code>SnapshotType</code> values of
     *            <code>manual</code> or <code>automated</code>. The
     *            <code>IncludePublic</code> parameter doesn't apply when
     *            <code>SnapshotType</code> is set to <code>shared</code>. The
     *            <code>IncludeShared</code> parameter doesn't apply when
     *            <code>SnapshotType</code> is set to <code>public</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more DB snapshots to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts identifiers of source DB
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts names of database engines.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A filter that specifies one or more DB snapshots to describe.
     *         </p>
     *         <p>
     *         Supported filters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db-instance-id</code> - Accepts DB instance identifiers and
     *         DB instance Amazon Resource Names (ARNs).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dbi-resource-id</code> - Accepts identifiers of source DB
     *         instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>snapshot-type</code> - Accepts types of DB snapshots.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>engine</code> - Accepts names of database engines.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more DB snapshots to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts identifiers of source DB
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts names of database engines.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            A filter that specifies one or more DB snapshots to describe.
     *            </p>
     *            <p>
     *            Supported filters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-instance-id</code> - Accepts DB instance identifiers
     *            and DB instance Amazon Resource Names (ARNs).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dbi-resource-id</code> - Accepts identifiers of source
     *            DB instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>snapshot-type</code> - Accepts types of DB snapshots.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>engine</code> - Accepts names of database engines.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * A filter that specifies one or more DB snapshots to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts identifiers of source DB
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts names of database engines.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies one or more DB snapshots to describe.
     *            </p>
     *            <p>
     *            Supported filters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-instance-id</code> - Accepts DB instance identifiers
     *            and DB instance Amazon Resource Names (ARNs).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dbi-resource-id</code> - Accepts identifiers of source
     *            DB instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>snapshot-type</code> - Accepts types of DB snapshots.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>engine</code> - Accepts names of database engines.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more DB snapshots to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts identifiers of source DB
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-type</code> - Accepts types of DB snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts names of database engines.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A filter that specifies one or more DB snapshots to describe.
     *            </p>
     *            <p>
     *            Supported filters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>db-instance-id</code> - Accepts DB instance identifiers
     *            and DB instance Amazon Resource Names (ARNs).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>db-snapshot-id</code> - Accepts DB snapshot identifiers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dbi-resource-id</code> - Accepts identifiers of source
     *            DB instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>snapshot-type</code> - Accepts types of DB snapshots.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>engine</code> - Accepts names of database engines.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so
     *         that you can retrieve the remaining results.
     *         </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more records exist than the specified <code>MaxRecords</code>
     *            value, a pagination token called a marker is included in the
     *            response so that you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBSnapshots</code> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <code>DescribeDBSnapshots</code> request. If this parameter is
     *         specified, the response includes only records beyond the marker,
     *         up to the value specified by <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBSnapshots</code> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeDBSnapshots</code> request. If this parameter is
     *            specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeDBSnapshots</code> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeDBSnapshots</code> request. If this parameter is
     *            specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to include shared manual DB cluster
     * snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore. By default, these snapshots are not
     * included.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot
     * from another AWS account by using the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to include shared manual DB
     *         cluster snapshots from other AWS accounts that this AWS account
     *         has been given permission to copy or restore. By default, these
     *         snapshots are not included.
     *         </p>
     *         <p>
     *         You can give an AWS account permission to restore a manual DB
     *         snapshot from another AWS account by using the
     *         <code>ModifyDBSnapshotAttribute</code> API action.
     *         </p>
     */
    public Boolean isIncludeShared() {
        return includeShared;
    }

    /**
     * <p>
     * A value that indicates whether to include shared manual DB cluster
     * snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore. By default, these snapshots are not
     * included.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot
     * from another AWS account by using the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to include shared manual DB
     *         cluster snapshots from other AWS accounts that this AWS account
     *         has been given permission to copy or restore. By default, these
     *         snapshots are not included.
     *         </p>
     *         <p>
     *         You can give an AWS account permission to restore a manual DB
     *         snapshot from another AWS account by using the
     *         <code>ModifyDBSnapshotAttribute</code> API action.
     *         </p>
     */
    public Boolean getIncludeShared() {
        return includeShared;
    }

    /**
     * <p>
     * A value that indicates whether to include shared manual DB cluster
     * snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore. By default, these snapshots are not
     * included.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot
     * from another AWS account by using the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     *
     * @param includeShared <p>
     *            A value that indicates whether to include shared manual DB
     *            cluster snapshots from other AWS accounts that this AWS
     *            account has been given permission to copy or restore. By
     *            default, these snapshots are not included.
     *            </p>
     *            <p>
     *            You can give an AWS account permission to restore a manual DB
     *            snapshot from another AWS account by using the
     *            <code>ModifyDBSnapshotAttribute</code> API action.
     *            </p>
     */
    public void setIncludeShared(Boolean includeShared) {
        this.includeShared = includeShared;
    }

    /**
     * <p>
     * A value that indicates whether to include shared manual DB cluster
     * snapshots from other AWS accounts that this AWS account has been given
     * permission to copy or restore. By default, these snapshots are not
     * included.
     * </p>
     * <p>
     * You can give an AWS account permission to restore a manual DB snapshot
     * from another AWS account by using the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeShared <p>
     *            A value that indicates whether to include shared manual DB
     *            cluster snapshots from other AWS accounts that this AWS
     *            account has been given permission to copy or restore. By
     *            default, these snapshots are not included.
     *            </p>
     *            <p>
     *            You can give an AWS account permission to restore a manual DB
     *            snapshot from another AWS account by using the
     *            <code>ModifyDBSnapshotAttribute</code> API action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withIncludeShared(Boolean includeShared) {
        this.includeShared = includeShared;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to include manual DB cluster snapshots
     * that are public and can be copied or restored by any AWS account. By
     * default, the public snapshots are not included.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the
     * <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to include manual DB cluster
     *         snapshots that are public and can be copied or restored by any
     *         AWS account. By default, the public snapshots are not included.
     *         </p>
     *         <p>
     *         You can share a manual DB snapshot as public by using the
     *         <a>ModifyDBSnapshotAttribute</a> API.
     *         </p>
     */
    public Boolean isIncludePublic() {
        return includePublic;
    }

    /**
     * <p>
     * A value that indicates whether to include manual DB cluster snapshots
     * that are public and can be copied or restored by any AWS account. By
     * default, the public snapshots are not included.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the
     * <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to include manual DB cluster
     *         snapshots that are public and can be copied or restored by any
     *         AWS account. By default, the public snapshots are not included.
     *         </p>
     *         <p>
     *         You can share a manual DB snapshot as public by using the
     *         <a>ModifyDBSnapshotAttribute</a> API.
     *         </p>
     */
    public Boolean getIncludePublic() {
        return includePublic;
    }

    /**
     * <p>
     * A value that indicates whether to include manual DB cluster snapshots
     * that are public and can be copied or restored by any AWS account. By
     * default, the public snapshots are not included.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the
     * <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     *
     * @param includePublic <p>
     *            A value that indicates whether to include manual DB cluster
     *            snapshots that are public and can be copied or restored by any
     *            AWS account. By default, the public snapshots are not
     *            included.
     *            </p>
     *            <p>
     *            You can share a manual DB snapshot as public by using the
     *            <a>ModifyDBSnapshotAttribute</a> API.
     *            </p>
     */
    public void setIncludePublic(Boolean includePublic) {
        this.includePublic = includePublic;
    }

    /**
     * <p>
     * A value that indicates whether to include manual DB cluster snapshots
     * that are public and can be copied or restored by any AWS account. By
     * default, the public snapshots are not included.
     * </p>
     * <p>
     * You can share a manual DB snapshot as public by using the
     * <a>ModifyDBSnapshotAttribute</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includePublic <p>
     *            A value that indicates whether to include manual DB cluster
     *            snapshots that are public and can be copied or restored by any
     *            AWS account. By default, the public snapshots are not
     *            included.
     *            </p>
     *            <p>
     *            You can share a manual DB snapshot as public by using the
     *            <a>ModifyDBSnapshotAttribute</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withIncludePublic(Boolean includePublic) {
        this.includePublic = includePublic;
        return this;
    }

    /**
     * <p>
     * A specific DB resource ID to describe.
     * </p>
     *
     * @return <p>
     *         A specific DB resource ID to describe.
     *         </p>
     */
    public String getDbiResourceId() {
        return dbiResourceId;
    }

    /**
     * <p>
     * A specific DB resource ID to describe.
     * </p>
     *
     * @param dbiResourceId <p>
     *            A specific DB resource ID to describe.
     *            </p>
     */
    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * A specific DB resource ID to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbiResourceId <p>
     *            A specific DB resource ID to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSnapshotsRequest withDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getIncludeShared() != null)
            sb.append("IncludeShared: " + getIncludeShared() + ",");
        if (getIncludePublic() != null)
            sb.append("IncludePublic: " + getIncludePublic() + ",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: " + getDbiResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeShared() == null) ? 0 : getIncludeShared().hashCode());
        hashCode = prime * hashCode
                + ((getIncludePublic() == null) ? 0 : getIncludePublic().hashCode());
        hashCode = prime * hashCode
                + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBSnapshotsRequest == false)
            return false;
        DescribeDBSnapshotsRequest other = (DescribeDBSnapshotsRequest) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null
                && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null
                && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getIncludeShared() == null ^ this.getIncludeShared() == null)
            return false;
        if (other.getIncludeShared() != null
                && other.getIncludeShared().equals(this.getIncludeShared()) == false)
            return false;
        if (other.getIncludePublic() == null ^ this.getIncludePublic() == null)
            return false;
        if (other.getIncludePublic() != null
                && other.getIncludePublic().equals(this.getIncludePublic()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null
                && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        return true;
    }
}
