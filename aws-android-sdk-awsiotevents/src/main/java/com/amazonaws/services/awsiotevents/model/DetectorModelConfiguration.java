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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Information about how the detector model is configured.
 * </p>
 */
public class DetectorModelConfiguration implements Serializable {
    /**
     * <p>
     * The name of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     */
    private String detectorModelName;

    /**
     * <p>
     * The version of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String detectorModelVersion;

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String detectorModelDescription;

    /**
     * <p>
     * The ARN of the detector model.
     * </p>
     */
    private String detectorModelArn;

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform
     * its operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The time the detector model was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time the detector model was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The status of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     */
    private String status;

    /**
     * <p>
     * The value used to identify a detector instance. When a device or system
     * sends input, a new detector instance with a unique key value is created.
     * AWS IoT Events can continue to route input to its corresponding detector
     * instance based on this identifying information.
     * </p>
     * <p>
     * This parameter uses a JSON-path expression to select the attribute-value
     * pair in the message payload that is used for identification. To route the
     * message to the correct detector instance, the device must send a message
     * payload that contains the same attribute-value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     */
    private String key;

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     */
    private String evaluationMethod;

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @return <p>
     *         The name of the detector model.
     *         </p>
     */
    public String getDetectorModelName() {
        return detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param detectorModelName <p>
     *            The name of the detector model.
     *            </p>
     */
    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param detectorModelName <p>
     *            The name of the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelConfiguration withDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
        return this;
    }

    /**
     * <p>
     * The version of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The version of the detector model.
     *         </p>
     */
    public String getDetectorModelVersion() {
        return detectorModelVersion;
    }

    /**
     * <p>
     * The version of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param detectorModelVersion <p>
     *            The version of the detector model.
     *            </p>
     */
    public void setDetectorModelVersion(String detectorModelVersion) {
        this.detectorModelVersion = detectorModelVersion;
    }

    /**
     * <p>
     * The version of the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param detectorModelVersion <p>
     *            The version of the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelConfiguration withDetectorModelVersion(String detectorModelVersion) {
        this.detectorModelVersion = detectorModelVersion;
        return this;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         A brief description of the detector model.
     *         </p>
     */
    public String getDetectorModelDescription() {
        return detectorModelDescription;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param detectorModelDescription <p>
     *            A brief description of the detector model.
     *            </p>
     */
    public void setDetectorModelDescription(String detectorModelDescription) {
        this.detectorModelDescription = detectorModelDescription;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param detectorModelDescription <p>
     *            A brief description of the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelConfiguration withDetectorModelDescription(String detectorModelDescription) {
        this.detectorModelDescription = detectorModelDescription;
        return this;
    }

    /**
     * <p>
     * The ARN of the detector model.
     * </p>
     *
     * @return <p>
     *         The ARN of the detector model.
     *         </p>
     */
    public String getDetectorModelArn() {
        return detectorModelArn;
    }

    /**
     * <p>
     * The ARN of the detector model.
     * </p>
     *
     * @param detectorModelArn <p>
     *            The ARN of the detector model.
     *            </p>
     */
    public void setDetectorModelArn(String detectorModelArn) {
        this.detectorModelArn = detectorModelArn;
    }

    /**
     * <p>
     * The ARN of the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorModelArn <p>
     *            The ARN of the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelConfiguration withDetectorModelArn(String detectorModelArn) {
        this.detectorModelArn = detectorModelArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform
     * its operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the role that grants permission to AWS IoT Events to
     *         perform its operations.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform
     * its operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to AWS IoT Events
     *            to perform its operations.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform
     * its operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to AWS IoT Events
     *            to perform its operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelConfiguration withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The time the detector model was created.
     * </p>
     *
     * @return <p>
     *         The time the detector model was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time the detector model was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time the detector model was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the detector model was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time the detector model was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelConfiguration withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time the detector model was last updated.
     * </p>
     *
     * @return <p>
     *         The time the detector model was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * <p>
     * The time the detector model was last updated.
     * </p>
     *
     * @param lastUpdateTime <p>
     *            The time the detector model was last updated.
     *            </p>
     */
    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time the detector model was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateTime <p>
     *            The time the detector model was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelConfiguration withLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * <p>
     * The status of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @return <p>
     *         The status of the detector model.
     *         </p>
     * @see DetectorModelVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @param status <p>
     *            The status of the detector model.
     *            </p>
     * @see DetectorModelVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @param status <p>
     *            The status of the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorModelVersionStatus
     */
    public DetectorModelConfiguration withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @param status <p>
     *            The status of the detector model.
     *            </p>
     * @see DetectorModelVersionStatus
     */
    public void setStatus(DetectorModelVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @param status <p>
     *            The status of the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorModelVersionStatus
     */
    public DetectorModelConfiguration withStatus(DetectorModelVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The value used to identify a detector instance. When a device or system
     * sends input, a new detector instance with a unique key value is created.
     * AWS IoT Events can continue to route input to its corresponding detector
     * instance based on this identifying information.
     * </p>
     * <p>
     * This parameter uses a JSON-path expression to select the attribute-value
     * pair in the message payload that is used for identification. To route the
     * message to the correct detector instance, the device must send a message
     * payload that contains the same attribute-value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     *
     * @return <p>
     *         The value used to identify a detector instance. When a device or
     *         system sends input, a new detector instance with a unique key
     *         value is created. AWS IoT Events can continue to route input to
     *         its corresponding detector instance based on this identifying
     *         information.
     *         </p>
     *         <p>
     *         This parameter uses a JSON-path expression to select the
     *         attribute-value pair in the message payload that is used for
     *         identification. To route the message to the correct detector
     *         instance, the device must send a message payload that contains
     *         the same attribute-value.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The value used to identify a detector instance. When a device or system
     * sends input, a new detector instance with a unique key value is created.
     * AWS IoT Events can continue to route input to its corresponding detector
     * instance based on this identifying information.
     * </p>
     * <p>
     * This parameter uses a JSON-path expression to select the attribute-value
     * pair in the message payload that is used for identification. To route the
     * message to the correct detector instance, the device must send a message
     * payload that contains the same attribute-value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     *
     * @param key <p>
     *            The value used to identify a detector instance. When a device
     *            or system sends input, a new detector instance with a unique
     *            key value is created. AWS IoT Events can continue to route
     *            input to its corresponding detector instance based on this
     *            identifying information.
     *            </p>
     *            <p>
     *            This parameter uses a JSON-path expression to select the
     *            attribute-value pair in the message payload that is used for
     *            identification. To route the message to the correct detector
     *            instance, the device must send a message payload that contains
     *            the same attribute-value.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The value used to identify a detector instance. When a device or system
     * sends input, a new detector instance with a unique key value is created.
     * AWS IoT Events can continue to route input to its corresponding detector
     * instance based on this identifying information.
     * </p>
     * <p>
     * This parameter uses a JSON-path expression to select the attribute-value
     * pair in the message payload that is used for identification. To route the
     * message to the correct detector instance, the device must send a message
     * payload that contains the same attribute-value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     *
     * @param key <p>
     *            The value used to identify a detector instance. When a device
     *            or system sends input, a new detector instance with a unique
     *            key value is created. AWS IoT Events can continue to route
     *            input to its corresponding detector instance based on this
     *            identifying information.
     *            </p>
     *            <p>
     *            This parameter uses a JSON-path expression to select the
     *            attribute-value pair in the message payload that is used for
     *            identification. To route the message to the correct detector
     *            instance, the device must send a message payload that contains
     *            the same attribute-value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelConfiguration withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @return <p>
     *         Information about the order in which events are evaluated and how
     *         actions are executed.
     *         </p>
     * @see EvaluationMethod
     */
    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @param evaluationMethod <p>
     *            Information about the order in which events are evaluated and
     *            how actions are executed.
     *            </p>
     * @see EvaluationMethod
     */
    public void setEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @param evaluationMethod <p>
     *            Information about the order in which events are evaluated and
     *            how actions are executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationMethod
     */
    public DetectorModelConfiguration withEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
        return this;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @param evaluationMethod <p>
     *            Information about the order in which events are evaluated and
     *            how actions are executed.
     *            </p>
     * @see EvaluationMethod
     */
    public void setEvaluationMethod(EvaluationMethod evaluationMethod) {
        this.evaluationMethod = evaluationMethod.toString();
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @param evaluationMethod <p>
     *            Information about the order in which events are evaluated and
     *            how actions are executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationMethod
     */
    public DetectorModelConfiguration withEvaluationMethod(EvaluationMethod evaluationMethod) {
        this.evaluationMethod = evaluationMethod.toString();
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
        if (getDetectorModelName() != null)
            sb.append("detectorModelName: " + getDetectorModelName() + ",");
        if (getDetectorModelVersion() != null)
            sb.append("detectorModelVersion: " + getDetectorModelVersion() + ",");
        if (getDetectorModelDescription() != null)
            sb.append("detectorModelDescription: " + getDetectorModelDescription() + ",");
        if (getDetectorModelArn() != null)
            sb.append("detectorModelArn: " + getDetectorModelArn() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime() + ",");
        if (getLastUpdateTime() != null)
            sb.append("lastUpdateTime: " + getLastUpdateTime() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getEvaluationMethod() != null)
            sb.append("evaluationMethod: " + getEvaluationMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        hashCode = prime * hashCode
                + ((getDetectorModelVersion() == null) ? 0 : getDetectorModelVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getDetectorModelDescription() == null) ? 0 : getDetectorModelDescription()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDetectorModelArn() == null) ? 0 : getDetectorModelArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationMethod() == null) ? 0 : getEvaluationMethod().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorModelConfiguration == false)
            return false;
        DetectorModelConfiguration other = (DetectorModelConfiguration) obj;

        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null
                && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getDetectorModelVersion() == null ^ this.getDetectorModelVersion() == null)
            return false;
        if (other.getDetectorModelVersion() != null
                && other.getDetectorModelVersion().equals(this.getDetectorModelVersion()) == false)
            return false;
        if (other.getDetectorModelDescription() == null
                ^ this.getDetectorModelDescription() == null)
            return false;
        if (other.getDetectorModelDescription() != null
                && other.getDetectorModelDescription().equals(this.getDetectorModelDescription()) == false)
            return false;
        if (other.getDetectorModelArn() == null ^ this.getDetectorModelArn() == null)
            return false;
        if (other.getDetectorModelArn() != null
                && other.getDetectorModelArn().equals(this.getDetectorModelArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null
                && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getEvaluationMethod() == null ^ this.getEvaluationMethod() == null)
            return false;
        if (other.getEvaluationMethod() != null
                && other.getEvaluationMethod().equals(this.getEvaluationMethod()) == false)
            return false;
        return true;
    }
}
