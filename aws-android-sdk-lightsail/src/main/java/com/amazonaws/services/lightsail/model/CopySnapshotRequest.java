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
 * Copies a manual snapshot of an instance or disk as another manual snapshot,
 * or copies an automatic snapshot of an instance or disk as a manual snapshot.
 * This operation can also be used to copy a manual or automatic snapshot of an
 * instance or a disk from one AWS Region to another in Amazon Lightsail.
 * </p>
 * <p>
 * When copying a <i>manual snapshot</i>, be sure to define the
 * <code>source region</code>, <code>source snapshot name</code>, and
 * <code>target snapshot name</code> parameters.
 * </p>
 * <p>
 * When copying an <i>automatic snapshot</i>, be sure to define the
 * <code>source region</code>, <code>source resource name</code>,
 * <code>target snapshot name</code>, and either the <code>restore date</code>
 * or the <code>use latest restorable auto snapshot</code> parameters.
 * </p>
 */
public class CopySnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the source manual snapshot to copy.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying a manual snapshot as another
     * manual snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String sourceSnapshotName;

    /**
     * <p>
     * The name of the source instance or disk from which the source automatic
     * snapshot was created.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceResourceName;

    /**
     * <p>
     * The date of the source automatic snapshot to copy. Use the
     * <code>get auto snapshots</code> operation to identify the dates of the
     * available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>use latest restorable auto snapshot</code> parameter. The
     * <code>restore date</code> and
     * <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String restoreDate;

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot of the specified source instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean useLatestRestorableAutoSnapshot;

    /**
     * <p>
     * The name of the new manual snapshot to be created as a copy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String targetSnapshotName;

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     */
    private String sourceRegion;

    /**
     * <p>
     * The name of the source manual snapshot to copy.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying a manual snapshot as another
     * manual snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the source manual snapshot to copy.
     *         </p>
     *         <p>
     *         Constraint:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Define this parameter only when copying a manual snapshot as
     *         another manual snapshot.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceSnapshotName() {
        return sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the source manual snapshot to copy.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying a manual snapshot as another
     * manual snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param sourceSnapshotName <p>
     *            The name of the source manual snapshot to copy.
     *            </p>
     *            <p>
     *            Constraint:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Define this parameter only when copying a manual snapshot as
     *            another manual snapshot.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the source manual snapshot to copy.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying a manual snapshot as another
     * manual snapshot.
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
     * @param sourceSnapshotName <p>
     *            The name of the source manual snapshot to copy.
     *            </p>
     *            <p>
     *            Constraint:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Define this parameter only when copying a manual snapshot as
     *            another manual snapshot.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
        return this;
    }

    /**
     * <p>
     * The name of the source instance or disk from which the source automatic
     * snapshot was created.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the source instance or disk from which the source
     *         automatic snapshot was created.
     *         </p>
     *         <p>
     *         Constraint:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Define this parameter only when copying an automatic snapshot as
     *         a manual snapshot. For more information, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceResourceName() {
        return sourceResourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk from which the source automatic
     * snapshot was created.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param sourceResourceName <p>
     *            The name of the source instance or disk from which the source
     *            automatic snapshot was created.
     *            </p>
     *            <p>
     *            Constraint:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Define this parameter only when copying an automatic snapshot
     *            as a manual snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceResourceName(String sourceResourceName) {
        this.sourceResourceName = sourceResourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk from which the source automatic
     * snapshot was created.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceResourceName <p>
     *            The name of the source instance or disk from which the source
     *            automatic snapshot was created.
     *            </p>
     *            <p>
     *            Constraint:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Define this parameter only when copying an automatic snapshot
     *            as a manual snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withSourceResourceName(String sourceResourceName) {
        this.sourceResourceName = sourceResourceName;
        return this;
    }

    /**
     * <p>
     * The date of the source automatic snapshot to copy. Use the
     * <code>get auto snapshots</code> operation to identify the dates of the
     * available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>use latest restorable auto snapshot</code> parameter. The
     * <code>restore date</code> and
     * <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The date of the source automatic snapshot to copy. Use the
     *         <code>get auto snapshots</code> operation to identify the dates
     *         of the available automatic snapshots.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be specified in <code>YYYY-MM-DD</code> format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>use latest restorable auto snapshot</code> parameter. The
     *         <code>restore date</code> and
     *         <code>use latest restorable auto snapshot</code> parameters are
     *         mutually exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when copying an automatic snapshot as
     *         a manual snapshot. For more information, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRestoreDate() {
        return restoreDate;
    }

    /**
     * <p>
     * The date of the source automatic snapshot to copy. Use the
     * <code>get auto snapshots</code> operation to identify the dates of the
     * available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>use latest restorable auto snapshot</code> parameter. The
     * <code>restore date</code> and
     * <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param restoreDate <p>
     *            The date of the source automatic snapshot to copy. Use the
     *            <code>get auto snapshots</code> operation to identify the
     *            dates of the available automatic snapshots.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be specified in <code>YYYY-MM-DD</code> format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>use latest restorable auto snapshot</code> parameter.
     *            The <code>restore date</code> and
     *            <code>use latest restorable auto snapshot</code> parameters
     *            are mutually exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when copying an automatic snapshot
     *            as a manual snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRestoreDate(String restoreDate) {
        this.restoreDate = restoreDate;
    }

    /**
     * <p>
     * The date of the source automatic snapshot to copy. Use the
     * <code>get auto snapshots</code> operation to identify the dates of the
     * available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>use latest restorable auto snapshot</code> parameter. The
     * <code>restore date</code> and
     * <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreDate <p>
     *            The date of the source automatic snapshot to copy. Use the
     *            <code>get auto snapshots</code> operation to identify the
     *            dates of the available automatic snapshots.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be specified in <code>YYYY-MM-DD</code> format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>use latest restorable auto snapshot</code> parameter.
     *            The <code>restore date</code> and
     *            <code>use latest restorable auto snapshot</code> parameters
     *            are mutually exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when copying an automatic snapshot
     *            as a manual snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withRestoreDate(String restoreDate) {
        this.restoreDate = restoreDate;
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot of the specified source instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A Boolean value to indicate whether to use the latest available
     *         automatic snapshot of the specified source instance or disk.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>restore date</code> parameter. The
     *         <code>use latest restorable auto snapshot</code> and
     *         <code>restore date</code> parameters are mutually exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when copying an automatic snapshot as
     *         a manual snapshot. For more information, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isUseLatestRestorableAutoSnapshot() {
        return useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot of the specified source instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A Boolean value to indicate whether to use the latest available
     *         automatic snapshot of the specified source instance or disk.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>restore date</code> parameter. The
     *         <code>use latest restorable auto snapshot</code> and
     *         <code>restore date</code> parameters are mutually exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when copying an automatic snapshot as
     *         a manual snapshot. For more information, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getUseLatestRestorableAutoSnapshot() {
        return useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot of the specified source instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param useLatestRestorableAutoSnapshot <p>
     *            A Boolean value to indicate whether to use the latest
     *            available automatic snapshot of the specified source instance
     *            or disk.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>restore date</code> parameter. The
     *            <code>use latest restorable auto snapshot</code> and
     *            <code>restore date</code> parameters are mutually exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when copying an automatic snapshot
     *            as a manual snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUseLatestRestorableAutoSnapshot(Boolean useLatestRestorableAutoSnapshot) {
        this.useLatestRestorableAutoSnapshot = useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot of the specified source instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLatestRestorableAutoSnapshot <p>
     *            A Boolean value to indicate whether to use the latest
     *            available automatic snapshot of the specified source instance
     *            or disk.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>restore date</code> parameter. The
     *            <code>use latest restorable auto snapshot</code> and
     *            <code>restore date</code> parameters are mutually exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when copying an automatic snapshot
     *            as a manual snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withUseLatestRestorableAutoSnapshot(
            Boolean useLatestRestorableAutoSnapshot) {
        this.useLatestRestorableAutoSnapshot = useLatestRestorableAutoSnapshot;
        return this;
    }

    /**
     * <p>
     * The name of the new manual snapshot to be created as a copy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the new manual snapshot to be created as a copy.
     *         </p>
     */
    public String getTargetSnapshotName() {
        return targetSnapshotName;
    }

    /**
     * <p>
     * The name of the new manual snapshot to be created as a copy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param targetSnapshotName <p>
     *            The name of the new manual snapshot to be created as a copy.
     *            </p>
     */
    public void setTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
    }

    /**
     * <p>
     * The name of the new manual snapshot to be created as a copy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param targetSnapshotName <p>
     *            The name of the new manual snapshot to be created as a copy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
        return this;
    }

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @return <p>
     *         The AWS Region where the source manual or automatic snapshot is
     *         located.
     *         </p>
     * @see RegionName
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param sourceRegion <p>
     *            The AWS Region where the source manual or automatic snapshot
     *            is located.
     *            </p>
     * @see RegionName
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param sourceRegion <p>
     *            The AWS Region where the source manual or automatic snapshot
     *            is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegionName
     */
    public CopySnapshotRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param sourceRegion <p>
     *            The AWS Region where the source manual or automatic snapshot
     *            is located.
     *            </p>
     * @see RegionName
     */
    public void setSourceRegion(RegionName sourceRegion) {
        this.sourceRegion = sourceRegion.toString();
    }

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param sourceRegion <p>
     *            The AWS Region where the source manual or automatic snapshot
     *            is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegionName
     */
    public CopySnapshotRequest withSourceRegion(RegionName sourceRegion) {
        this.sourceRegion = sourceRegion.toString();
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
        if (getSourceSnapshotName() != null)
            sb.append("sourceSnapshotName: " + getSourceSnapshotName() + ",");
        if (getSourceResourceName() != null)
            sb.append("sourceResourceName: " + getSourceResourceName() + ",");
        if (getRestoreDate() != null)
            sb.append("restoreDate: " + getRestoreDate() + ",");
        if (getUseLatestRestorableAutoSnapshot() != null)
            sb.append("useLatestRestorableAutoSnapshot: " + getUseLatestRestorableAutoSnapshot()
                    + ",");
        if (getTargetSnapshotName() != null)
            sb.append("targetSnapshotName: " + getTargetSnapshotName() + ",");
        if (getSourceRegion() != null)
            sb.append("sourceRegion: " + getSourceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceSnapshotName() == null) ? 0 : getSourceSnapshotName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceResourceName() == null) ? 0 : getSourceResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreDate() == null) ? 0 : getRestoreDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseLatestRestorableAutoSnapshot() == null) ? 0
                        : getUseLatestRestorableAutoSnapshot().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSnapshotName() == null) ? 0 : getTargetSnapshotName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopySnapshotRequest == false)
            return false;
        CopySnapshotRequest other = (CopySnapshotRequest) obj;

        if (other.getSourceSnapshotName() == null ^ this.getSourceSnapshotName() == null)
            return false;
        if (other.getSourceSnapshotName() != null
                && other.getSourceSnapshotName().equals(this.getSourceSnapshotName()) == false)
            return false;
        if (other.getSourceResourceName() == null ^ this.getSourceResourceName() == null)
            return false;
        if (other.getSourceResourceName() != null
                && other.getSourceResourceName().equals(this.getSourceResourceName()) == false)
            return false;
        if (other.getRestoreDate() == null ^ this.getRestoreDate() == null)
            return false;
        if (other.getRestoreDate() != null
                && other.getRestoreDate().equals(this.getRestoreDate()) == false)
            return false;
        if (other.getUseLatestRestorableAutoSnapshot() == null
                ^ this.getUseLatestRestorableAutoSnapshot() == null)
            return false;
        if (other.getUseLatestRestorableAutoSnapshot() != null
                && other.getUseLatestRestorableAutoSnapshot().equals(
                        this.getUseLatestRestorableAutoSnapshot()) == false)
            return false;
        if (other.getTargetSnapshotName() == null ^ this.getTargetSnapshotName() == null)
            return false;
        if (other.getTargetSnapshotName() != null
                && other.getTargetSnapshotName().equals(this.getTargetSnapshotName()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null
                && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        return true;
    }
}
