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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a stage for a build.
 * </p>
 */
public class BuildPhase implements Serializable {
    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded
     * to the output location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, QUEUED, PROVISIONING, DOWNLOAD_SOURCE,
     * INSTALL, PRE_BUILD, BUILD, POST_BUILD, UPLOAD_ARTIFACTS, FINALIZING,
     * COMPLETED
     */
    private String phaseType;

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     */
    private String phaseStatus;

    /**
     * <p>
     * When the build phase started, expressed in Unix time format.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * When the build phase ended, expressed in Unix time format.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the
     * build's phase.
     * </p>
     */
    private Long durationInSeconds;

    /**
     * <p>
     * Additional information about a build phase, especially to help
     * troubleshoot a failed build.
     * </p>
     */
    private java.util.List<PhaseContext> contexts;

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded
     * to the output location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, QUEUED, PROVISIONING, DOWNLOAD_SOURCE,
     * INSTALL, PRE_BUILD, BUILD, POST_BUILD, UPLOAD_ARTIFACTS, FINALIZING,
     * COMPLETED
     *
     * @return <p>
     *         The name of the build phase. Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD</code>: Core build activities typically occur in this
     *         build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code>: The build has been completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in
     *         this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FINALIZING</code>: The build process is completing in this
     *         build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTALL</code>: Installation activities typically occur in
     *         this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>POST_BUILD</code>: Post-build activities typically occur in
     *         this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PRE_BUILD</code>: Pre-build activities typically occur in
     *         this build phase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROVISIONING</code>: The build environment is being set up.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUEUED</code>: The build has been submitted and is queued
     *         behind other submitted builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUBMITTED</code>: The build has been submitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being
     *         uploaded to the output location.
     *         </p>
     *         </li>
     *         </ul>
     * @see BuildPhaseType
     */
    public String getPhaseType() {
        return phaseType;
    }

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded
     * to the output location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, QUEUED, PROVISIONING, DOWNLOAD_SOURCE,
     * INSTALL, PRE_BUILD, BUILD, POST_BUILD, UPLOAD_ARTIFACTS, FINALIZING,
     * COMPLETED
     *
     * @param phaseType <p>
     *            The name of the build phase. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD</code>: Core build activities typically occur in
     *            this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code>: The build has been completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FINALIZING</code>: The build process is completing in
     *            this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTALL</code>: Installation activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>POST_BUILD</code>: Post-build activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PRE_BUILD</code>: Pre-build activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PROVISIONING</code>: The build environment is being set
     *            up.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: The build has been submitted and is
     *            queued behind other submitted builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUBMITTED</code>: The build has been submitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are
     *            being uploaded to the output location.
     *            </p>
     *            </li>
     *            </ul>
     * @see BuildPhaseType
     */
    public void setPhaseType(String phaseType) {
        this.phaseType = phaseType;
    }

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded
     * to the output location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, QUEUED, PROVISIONING, DOWNLOAD_SOURCE,
     * INSTALL, PRE_BUILD, BUILD, POST_BUILD, UPLOAD_ARTIFACTS, FINALIZING,
     * COMPLETED
     *
     * @param phaseType <p>
     *            The name of the build phase. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD</code>: Core build activities typically occur in
     *            this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code>: The build has been completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FINALIZING</code>: The build process is completing in
     *            this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTALL</code>: Installation activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>POST_BUILD</code>: Post-build activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PRE_BUILD</code>: Pre-build activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PROVISIONING</code>: The build environment is being set
     *            up.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: The build has been submitted and is
     *            queued behind other submitted builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUBMITTED</code>: The build has been submitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are
     *            being uploaded to the output location.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BuildPhaseType
     */
    public BuildPhase withPhaseType(String phaseType) {
        this.phaseType = phaseType;
        return this;
    }

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded
     * to the output location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, QUEUED, PROVISIONING, DOWNLOAD_SOURCE,
     * INSTALL, PRE_BUILD, BUILD, POST_BUILD, UPLOAD_ARTIFACTS, FINALIZING,
     * COMPLETED
     *
     * @param phaseType <p>
     *            The name of the build phase. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD</code>: Core build activities typically occur in
     *            this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code>: The build has been completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FINALIZING</code>: The build process is completing in
     *            this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTALL</code>: Installation activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>POST_BUILD</code>: Post-build activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PRE_BUILD</code>: Pre-build activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PROVISIONING</code>: The build environment is being set
     *            up.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: The build has been submitted and is
     *            queued behind other submitted builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUBMITTED</code>: The build has been submitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are
     *            being uploaded to the output location.
     *            </p>
     *            </li>
     *            </ul>
     * @see BuildPhaseType
     */
    public void setPhaseType(BuildPhaseType phaseType) {
        this.phaseType = phaseType.toString();
    }

    /**
     * <p>
     * The name of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD</code>: Core build activities typically occur in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The build has been completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINALIZING</code>: The build process is completing in this build
     * phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTALL</code>: Installation activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_BUILD</code>: Post-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRE_BUILD</code>: Pre-build activities typically occur in this
     * build phase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: The build environment is being set up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: The build has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are being uploaded
     * to the output location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, QUEUED, PROVISIONING, DOWNLOAD_SOURCE,
     * INSTALL, PRE_BUILD, BUILD, POST_BUILD, UPLOAD_ARTIFACTS, FINALIZING,
     * COMPLETED
     *
     * @param phaseType <p>
     *            The name of the build phase. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD</code>: Core build activities typically occur in
     *            this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code>: The build has been completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DOWNLOAD_SOURCE</code>: Source code is being downloaded
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FINALIZING</code>: The build process is completing in
     *            this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSTALL</code>: Installation activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>POST_BUILD</code>: Post-build activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PRE_BUILD</code>: Pre-build activities typically occur
     *            in this build phase.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PROVISIONING</code>: The build environment is being set
     *            up.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: The build has been submitted and is
     *            queued behind other submitted builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUBMITTED</code>: The build has been submitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPLOAD_ARTIFACTS</code>: Build output artifacts are
     *            being uploaded to the output location.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BuildPhaseType
     */
    public BuildPhase withPhaseType(BuildPhaseType phaseType) {
        this.phaseType = phaseType.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @return <p>
     *         The current status of the build phase. Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The build phase failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAULT</code>: The build phase faulted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The build phase is still in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUEUED</code>: The build has been submitted and is queued
     *         behind other submitted builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code>: The build phase stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The build phase succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIMED_OUT</code>: The build phase timed out.
     *         </p>
     *         </li>
     *         </ul>
     * @see StatusType
     */
    public String getPhaseStatus() {
        return phaseStatus;
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @param phaseStatus <p>
     *            The current status of the build phase. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The build phase failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAULT</code>: The build phase faulted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The build phase is still in
     *            progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: The build has been submitted and is
     *            queued behind other submitted builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The build phase stopped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The build phase succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMED_OUT</code>: The build phase timed out.
     *            </p>
     *            </li>
     *            </ul>
     * @see StatusType
     */
    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @param phaseStatus <p>
     *            The current status of the build phase. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The build phase failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAULT</code>: The build phase faulted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The build phase is still in
     *            progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: The build has been submitted and is
     *            queued behind other submitted builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The build phase stopped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The build phase succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMED_OUT</code>: The build phase timed out.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public BuildPhase withPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @param phaseStatus <p>
     *            The current status of the build phase. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The build phase failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAULT</code>: The build phase faulted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The build phase is still in
     *            progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: The build has been submitted and is
     *            queued behind other submitted builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The build phase stopped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The build phase succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMED_OUT</code>: The build phase timed out.
     *            </p>
     *            </li>
     *            </ul>
     * @see StatusType
     */
    public void setPhaseStatus(StatusType phaseStatus) {
        this.phaseStatus = phaseStatus.toString();
    }

    /**
     * <p>
     * The current status of the build phase. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build phase failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build phase faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build phase is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: The build has been submitted and is queued behind
     * other submitted builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build phase stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build phase succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build phase timed out.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS,
     * STOPPED
     *
     * @param phaseStatus <p>
     *            The current status of the build phase. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The build phase failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAULT</code>: The build phase faulted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code>: The build phase is still in
     *            progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: The build has been submitted and is
     *            queued behind other submitted builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The build phase stopped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The build phase succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMED_OUT</code>: The build phase timed out.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public BuildPhase withPhaseStatus(StatusType phaseStatus) {
        this.phaseStatus = phaseStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the build phase started, expressed in Unix time format.
     * </p>
     *
     * @return <p>
     *         When the build phase started, expressed in Unix time format.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * When the build phase started, expressed in Unix time format.
     * </p>
     *
     * @param startTime <p>
     *            When the build phase started, expressed in Unix time format.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the build phase started, expressed in Unix time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            When the build phase started, expressed in Unix time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildPhase withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * When the build phase ended, expressed in Unix time format.
     * </p>
     *
     * @return <p>
     *         When the build phase ended, expressed in Unix time format.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * When the build phase ended, expressed in Unix time format.
     * </p>
     *
     * @param endTime <p>
     *            When the build phase ended, expressed in Unix time format.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * When the build phase ended, expressed in Unix time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            When the build phase ended, expressed in Unix time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildPhase withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the
     * build's phase.
     * </p>
     *
     * @return <p>
     *         How long, in seconds, between the starting and ending times of
     *         the build's phase.
     *         </p>
     */
    public Long getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the
     * build's phase.
     * </p>
     *
     * @param durationInSeconds <p>
     *            How long, in seconds, between the starting and ending times of
     *            the build's phase.
     *            </p>
     */
    public void setDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, between the starting and ending times of the
     * build's phase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationInSeconds <p>
     *            How long, in seconds, between the starting and ending times of
     *            the build's phase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildPhase withDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
        return this;
    }

    /**
     * <p>
     * Additional information about a build phase, especially to help
     * troubleshoot a failed build.
     * </p>
     *
     * @return <p>
     *         Additional information about a build phase, especially to help
     *         troubleshoot a failed build.
     *         </p>
     */
    public java.util.List<PhaseContext> getContexts() {
        return contexts;
    }

    /**
     * <p>
     * Additional information about a build phase, especially to help
     * troubleshoot a failed build.
     * </p>
     *
     * @param contexts <p>
     *            Additional information about a build phase, especially to help
     *            troubleshoot a failed build.
     *            </p>
     */
    public void setContexts(java.util.Collection<PhaseContext> contexts) {
        if (contexts == null) {
            this.contexts = null;
            return;
        }

        this.contexts = new java.util.ArrayList<PhaseContext>(contexts);
    }

    /**
     * <p>
     * Additional information about a build phase, especially to help
     * troubleshoot a failed build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contexts <p>
     *            Additional information about a build phase, especially to help
     *            troubleshoot a failed build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildPhase withContexts(PhaseContext... contexts) {
        if (getContexts() == null) {
            this.contexts = new java.util.ArrayList<PhaseContext>(contexts.length);
        }
        for (PhaseContext value : contexts) {
            this.contexts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Additional information about a build phase, especially to help
     * troubleshoot a failed build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contexts <p>
     *            Additional information about a build phase, especially to help
     *            troubleshoot a failed build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildPhase withContexts(java.util.Collection<PhaseContext> contexts) {
        setContexts(contexts);
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
        if (getPhaseType() != null)
            sb.append("phaseType: " + getPhaseType() + ",");
        if (getPhaseStatus() != null)
            sb.append("phaseStatus: " + getPhaseStatus() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getDurationInSeconds() != null)
            sb.append("durationInSeconds: " + getDurationInSeconds() + ",");
        if (getContexts() != null)
            sb.append("contexts: " + getContexts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhaseType() == null) ? 0 : getPhaseType().hashCode());
        hashCode = prime * hashCode
                + ((getPhaseStatus() == null) ? 0 : getPhaseStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getContexts() == null) ? 0 : getContexts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildPhase == false)
            return false;
        BuildPhase other = (BuildPhase) obj;

        if (other.getPhaseType() == null ^ this.getPhaseType() == null)
            return false;
        if (other.getPhaseType() != null
                && other.getPhaseType().equals(this.getPhaseType()) == false)
            return false;
        if (other.getPhaseStatus() == null ^ this.getPhaseStatus() == null)
            return false;
        if (other.getPhaseStatus() != null
                && other.getPhaseStatus().equals(this.getPhaseStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null
                && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getContexts() == null ^ this.getContexts() == null)
            return false;
        if (other.getContexts() != null && other.getContexts().equals(this.getContexts()) == false)
            return false;
        return true;
    }
}
