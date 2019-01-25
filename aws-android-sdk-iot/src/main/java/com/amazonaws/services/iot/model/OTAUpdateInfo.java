/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an OTA update.
 * </p>
 */
public class OTAUpdateInfo implements Serializable {
    /**
     * <p>
     * The OTA update ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String otaUpdateId;

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     */
    private String otaUpdateArn;

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date when the OTA update was last updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * A description of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     */
    private AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig;

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or
     * will be complete after all those things specified as targets have
     * completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     * also be run on a thing when a change is detected in a target. For
     * example, an OTA update will run on a thing when the thing is added to a
     * target group, even after the OTA update was completed by all things
     * originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     */
    private String targetSelection;

    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     */
    private java.util.List<OTAUpdateFile> otaUpdateFiles;

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     */
    private String otaUpdateStatus;

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     */
    private String awsIotJobId;

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     */
    private String awsIotJobArn;

    /**
     * <p>
     * Error information associated with the OTA update.
     * </p>
     */
    private ErrorInfo errorInfo;

    /**
     * <p>
     * A collection of name/value pairs
     * </p>
     */
    private java.util.Map<String, String> additionalParameters;

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The OTA update ID.
     *         </p>
     */
    public String getOtaUpdateId() {
        return otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param otaUpdateId <p>
     *            The OTA update ID.
     *            </p>
     */
    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param otaUpdateId <p>
     *            The OTA update ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
        return this;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     *
     * @return <p>
     *         The OTA update ARN.
     *         </p>
     */
    public String getOtaUpdateArn() {
        return otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     *
     * @param otaUpdateArn <p>
     *            The OTA update ARN.
     *            </p>
     */
    public void setOtaUpdateArn(String otaUpdateArn) {
        this.otaUpdateArn = otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param otaUpdateArn <p>
     *            The OTA update ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withOtaUpdateArn(String otaUpdateArn) {
        this.otaUpdateArn = otaUpdateArn;
        return this;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     *
     * @return <p>
     *         The date when the OTA update was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date when the OTA update was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date when the OTA update was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date when the OTA update was last updated.
     * </p>
     *
     * @return <p>
     *         The date when the OTA update was last updated.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date when the OTA update was last updated.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date when the OTA update was last updated.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the OTA update was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date when the OTA update was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * A description of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         A description of the OTA update.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A description of the OTA update.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A description of the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     *
     * @return <p>
     *         The targets of the OTA update.
     *         </p>
     */
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     *
     * @param targets <p>
     *            The targets of the OTA update.
     *            </p>
     */
    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets of the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withTargets(String... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<String>(targets.length);
        }
        for (String value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The targets of the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets of the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     *
     * @return <p>
     *         Configuration for the rollout of OTA updates.
     *         </p>
     */
    public AwsJobExecutionsRolloutConfig getAwsJobExecutionsRolloutConfig() {
        return awsJobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     *
     * @param awsJobExecutionsRolloutConfig <p>
     *            Configuration for the rollout of OTA updates.
     *            </p>
     */
    public void setAwsJobExecutionsRolloutConfig(
            AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig) {
        this.awsJobExecutionsRolloutConfig = awsJobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsJobExecutionsRolloutConfig <p>
     *            Configuration for the rollout of OTA updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withAwsJobExecutionsRolloutConfig(
            AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig) {
        this.awsJobExecutionsRolloutConfig = awsJobExecutionsRolloutConfig;
        return this;
    }

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or
     * will be complete after all those things specified as targets have
     * completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     * also be run on a thing when a change is detected in a target. For
     * example, an OTA update will run on a thing when the thing is added to a
     * target group, even after the OTA update was completed by all things
     * originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @return <p>
     *         Specifies whether the OTA update will continue to run
     *         (CONTINUOUS), or will be complete after all those things
     *         specified as targets have completed the OTA update (SNAPSHOT). If
     *         continuous, the OTA update may also be run on a thing when a
     *         change is detected in a target. For example, an OTA update will
     *         run on a thing when the thing is added to a target group, even
     *         after the OTA update was completed by all things originally in
     *         the group.
     *         </p>
     * @see TargetSelection
     */
    public String getTargetSelection() {
        return targetSelection;
    }

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or
     * will be complete after all those things specified as targets have
     * completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     * also be run on a thing when a change is detected in a target. For
     * example, an OTA update will run on a thing when the thing is added to a
     * target group, even after the OTA update was completed by all things
     * originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the OTA update will continue to run
     *            (CONTINUOUS), or will be complete after all those things
     *            specified as targets have completed the OTA update (SNAPSHOT).
     *            If continuous, the OTA update may also be run on a thing when
     *            a change is detected in a target. For example, an OTA update
     *            will run on a thing when the thing is added to a target group,
     *            even after the OTA update was completed by all things
     *            originally in the group.
     *            </p>
     * @see TargetSelection
     */
    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or
     * will be complete after all those things specified as targets have
     * completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     * also be run on a thing when a change is detected in a target. For
     * example, an OTA update will run on a thing when the thing is added to a
     * target group, even after the OTA update was completed by all things
     * originally in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the OTA update will continue to run
     *            (CONTINUOUS), or will be complete after all those things
     *            specified as targets have completed the OTA update (SNAPSHOT).
     *            If continuous, the OTA update may also be run on a thing when
     *            a change is detected in a target. For example, an OTA update
     *            will run on a thing when the thing is added to a target group,
     *            even after the OTA update was completed by all things
     *            originally in the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public OTAUpdateInfo withTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or
     * will be complete after all those things specified as targets have
     * completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     * also be run on a thing when a change is detected in a target. For
     * example, an OTA update will run on a thing when the thing is added to a
     * target group, even after the OTA update was completed by all things
     * originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the OTA update will continue to run
     *            (CONTINUOUS), or will be complete after all those things
     *            specified as targets have completed the OTA update (SNAPSHOT).
     *            If continuous, the OTA update may also be run on a thing when
     *            a change is detected in a target. For example, an OTA update
     *            will run on a thing when the thing is added to a target group,
     *            even after the OTA update was completed by all things
     *            originally in the group.
     *            </p>
     * @see TargetSelection
     */
    public void setTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
    }

    /**
     * <p>
     * Specifies whether the OTA update will continue to run (CONTINUOUS), or
     * will be complete after all those things specified as targets have
     * completed the OTA update (SNAPSHOT). If continuous, the OTA update may
     * also be run on a thing when a change is detected in a target. For
     * example, an OTA update will run on a thing when the thing is added to a
     * target group, even after the OTA update was completed by all things
     * originally in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the OTA update will continue to run
     *            (CONTINUOUS), or will be complete after all those things
     *            specified as targets have completed the OTA update (SNAPSHOT).
     *            If continuous, the OTA update may also be run on a thing when
     *            a change is detected in a target. For example, an OTA update
     *            will run on a thing when the thing is added to a target group,
     *            even after the OTA update was completed by all things
     *            originally in the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public OTAUpdateInfo withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     *
     * @return <p>
     *         A list of files associated with the OTA update.
     *         </p>
     */
    public java.util.List<OTAUpdateFile> getOtaUpdateFiles() {
        return otaUpdateFiles;
    }

    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     *
     * @param otaUpdateFiles <p>
     *            A list of files associated with the OTA update.
     *            </p>
     */
    public void setOtaUpdateFiles(java.util.Collection<OTAUpdateFile> otaUpdateFiles) {
        if (otaUpdateFiles == null) {
            this.otaUpdateFiles = null;
            return;
        }

        this.otaUpdateFiles = new java.util.ArrayList<OTAUpdateFile>(otaUpdateFiles);
    }

    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param otaUpdateFiles <p>
     *            A list of files associated with the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withOtaUpdateFiles(OTAUpdateFile... otaUpdateFiles) {
        if (getOtaUpdateFiles() == null) {
            this.otaUpdateFiles = new java.util.ArrayList<OTAUpdateFile>(otaUpdateFiles.length);
        }
        for (OTAUpdateFile value : otaUpdateFiles) {
            this.otaUpdateFiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of files associated with the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param otaUpdateFiles <p>
     *            A list of files associated with the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withOtaUpdateFiles(java.util.Collection<OTAUpdateFile> otaUpdateFiles) {
        setOtaUpdateFiles(otaUpdateFiles);
        return this;
    }

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @return <p>
     *         The status of the OTA update.
     *         </p>
     * @see OTAUpdateStatus
     */
    public String getOtaUpdateStatus() {
        return otaUpdateStatus;
    }

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The status of the OTA update.
     *            </p>
     * @see OTAUpdateStatus
     */
    public void setOtaUpdateStatus(String otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus;
    }

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The status of the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OTAUpdateStatus
     */
    public OTAUpdateInfo withOtaUpdateStatus(String otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus;
        return this;
    }

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The status of the OTA update.
     *            </p>
     * @see OTAUpdateStatus
     */
    public void setOtaUpdateStatus(OTAUpdateStatus otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus.toString();
    }

    /**
     * <p>
     * The status of the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The status of the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OTAUpdateStatus
     */
    public OTAUpdateInfo withOtaUpdateStatus(OTAUpdateStatus otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     *
     * @return <p>
     *         The AWS IoT job ID associated with the OTA update.
     *         </p>
     */
    public String getAwsIotJobId() {
        return awsIotJobId;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     *
     * @param awsIotJobId <p>
     *            The AWS IoT job ID associated with the OTA update.
     *            </p>
     */
    public void setAwsIotJobId(String awsIotJobId) {
        this.awsIotJobId = awsIotJobId;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsIotJobId <p>
     *            The AWS IoT job ID associated with the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withAwsIotJobId(String awsIotJobId) {
        this.awsIotJobId = awsIotJobId;
        return this;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     *
     * @return <p>
     *         The AWS IoT job ARN associated with the OTA update.
     *         </p>
     */
    public String getAwsIotJobArn() {
        return awsIotJobArn;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     *
     * @param awsIotJobArn <p>
     *            The AWS IoT job ARN associated with the OTA update.
     *            </p>
     */
    public void setAwsIotJobArn(String awsIotJobArn) {
        this.awsIotJobArn = awsIotJobArn;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsIotJobArn <p>
     *            The AWS IoT job ARN associated with the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withAwsIotJobArn(String awsIotJobArn) {
        this.awsIotJobArn = awsIotJobArn;
        return this;
    }

    /**
     * <p>
     * Error information associated with the OTA update.
     * </p>
     *
     * @return <p>
     *         Error information associated with the OTA update.
     *         </p>
     */
    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    /**
     * <p>
     * Error information associated with the OTA update.
     * </p>
     *
     * @param errorInfo <p>
     *            Error information associated with the OTA update.
     *            </p>
     */
    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Error information associated with the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorInfo <p>
     *            Error information associated with the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    /**
     * <p>
     * A collection of name/value pairs
     * </p>
     *
     * @return <p>
     *         A collection of name/value pairs
     *         </p>
     */
    public java.util.Map<String, String> getAdditionalParameters() {
        return additionalParameters;
    }

    /**
     * <p>
     * A collection of name/value pairs
     * </p>
     *
     * @param additionalParameters <p>
     *            A collection of name/value pairs
     *            </p>
     */
    public void setAdditionalParameters(java.util.Map<String, String> additionalParameters) {
        this.additionalParameters = additionalParameters;
    }

    /**
     * <p>
     * A collection of name/value pairs
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalParameters <p>
     *            A collection of name/value pairs
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo withAdditionalParameters(java.util.Map<String, String> additionalParameters) {
        this.additionalParameters = additionalParameters;
        return this;
    }

    /**
     * <p>
     * A collection of name/value pairs
     * </p>
     * <p>
     * The method adds a new key-value pair into additionalParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into additionalParameters.
     * @param value The corresponding value of the entry to be added into
     *            additionalParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateInfo addadditionalParametersEntry(String key, String value) {
        if (null == this.additionalParameters) {
            this.additionalParameters = new java.util.HashMap<String, String>();
        }
        if (this.additionalParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.additionalParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into additionalParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public OTAUpdateInfo clearadditionalParametersEntries() {
        this.additionalParameters = null;
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
        if (getOtaUpdateId() != null)
            sb.append("otaUpdateId: " + getOtaUpdateId() + ",");
        if (getOtaUpdateArn() != null)
            sb.append("otaUpdateArn: " + getOtaUpdateArn() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getTargets() != null)
            sb.append("targets: " + getTargets() + ",");
        if (getAwsJobExecutionsRolloutConfig() != null)
            sb.append("awsJobExecutionsRolloutConfig: " + getAwsJobExecutionsRolloutConfig() + ",");
        if (getTargetSelection() != null)
            sb.append("targetSelection: " + getTargetSelection() + ",");
        if (getOtaUpdateFiles() != null)
            sb.append("otaUpdateFiles: " + getOtaUpdateFiles() + ",");
        if (getOtaUpdateStatus() != null)
            sb.append("otaUpdateStatus: " + getOtaUpdateStatus() + ",");
        if (getAwsIotJobId() != null)
            sb.append("awsIotJobId: " + getAwsIotJobId() + ",");
        if (getAwsIotJobArn() != null)
            sb.append("awsIotJobArn: " + getAwsIotJobArn() + ",");
        if (getErrorInfo() != null)
            sb.append("errorInfo: " + getErrorInfo() + ",");
        if (getAdditionalParameters() != null)
            sb.append("additionalParameters: " + getAdditionalParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOtaUpdateId() == null) ? 0 : getOtaUpdateId().hashCode());
        hashCode = prime * hashCode
                + ((getOtaUpdateArn() == null) ? 0 : getOtaUpdateArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsJobExecutionsRolloutConfig() == null) ? 0
                        : getAwsJobExecutionsRolloutConfig().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime * hashCode
                + ((getOtaUpdateFiles() == null) ? 0 : getOtaUpdateFiles().hashCode());
        hashCode = prime * hashCode
                + ((getOtaUpdateStatus() == null) ? 0 : getOtaUpdateStatus().hashCode());
        hashCode = prime * hashCode
                + ((getAwsIotJobId() == null) ? 0 : getAwsIotJobId().hashCode());
        hashCode = prime * hashCode
                + ((getAwsIotJobArn() == null) ? 0 : getAwsIotJobArn().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalParameters() == null) ? 0 : getAdditionalParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OTAUpdateInfo == false)
            return false;
        OTAUpdateInfo other = (OTAUpdateInfo) obj;

        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null
                && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getOtaUpdateArn() == null ^ this.getOtaUpdateArn() == null)
            return false;
        if (other.getOtaUpdateArn() != null
                && other.getOtaUpdateArn().equals(this.getOtaUpdateArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getAwsJobExecutionsRolloutConfig() == null
                ^ this.getAwsJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getAwsJobExecutionsRolloutConfig() != null
                && other.getAwsJobExecutionsRolloutConfig().equals(
                        this.getAwsJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null
                && other.getTargetSelection().equals(this.getTargetSelection()) == false)
            return false;
        if (other.getOtaUpdateFiles() == null ^ this.getOtaUpdateFiles() == null)
            return false;
        if (other.getOtaUpdateFiles() != null
                && other.getOtaUpdateFiles().equals(this.getOtaUpdateFiles()) == false)
            return false;
        if (other.getOtaUpdateStatus() == null ^ this.getOtaUpdateStatus() == null)
            return false;
        if (other.getOtaUpdateStatus() != null
                && other.getOtaUpdateStatus().equals(this.getOtaUpdateStatus()) == false)
            return false;
        if (other.getAwsIotJobId() == null ^ this.getAwsIotJobId() == null)
            return false;
        if (other.getAwsIotJobId() != null
                && other.getAwsIotJobId().equals(this.getAwsIotJobId()) == false)
            return false;
        if (other.getAwsIotJobArn() == null ^ this.getAwsIotJobArn() == null)
            return false;
        if (other.getAwsIotJobArn() != null
                && other.getAwsIotJobArn().equals(this.getAwsIotJobArn()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null
                && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getAdditionalParameters() == null ^ this.getAdditionalParameters() == null)
            return false;
        if (other.getAdditionalParameters() != null
                && other.getAdditionalParameters().equals(this.getAdditionalParameters()) == false)
            return false;
        return true;
    }
}
