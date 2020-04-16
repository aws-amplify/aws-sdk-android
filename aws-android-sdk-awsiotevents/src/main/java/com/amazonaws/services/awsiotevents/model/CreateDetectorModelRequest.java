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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a detector model.
 * </p>
 */
public class CreateDetectorModelRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Information that defines how the detectors operate.
     * </p>
     */
    private DetectorModelDefinition detectorModelDefinition;

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
     * The input attribute key used to identify a device or system to create a
     * detector (an instance of the detector model) and then to route each input
     * received to the appropriate detector (instance). This parameter uses a
     * JSON-path expression in the message payload of each input to specify the
     * attribute-value pair that is used to identify the device associated with
     * the input.
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
     * Metadata that can be used to manage the detector model.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public CreateDetectorModelRequest withDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
        return this;
    }

    /**
     * <p>
     * Information that defines how the detectors operate.
     * </p>
     *
     * @return <p>
     *         Information that defines how the detectors operate.
     *         </p>
     */
    public DetectorModelDefinition getDetectorModelDefinition() {
        return detectorModelDefinition;
    }

    /**
     * <p>
     * Information that defines how the detectors operate.
     * </p>
     *
     * @param detectorModelDefinition <p>
     *            Information that defines how the detectors operate.
     *            </p>
     */
    public void setDetectorModelDefinition(DetectorModelDefinition detectorModelDefinition) {
        this.detectorModelDefinition = detectorModelDefinition;
    }

    /**
     * <p>
     * Information that defines how the detectors operate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorModelDefinition <p>
     *            Information that defines how the detectors operate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorModelRequest withDetectorModelDefinition(
            DetectorModelDefinition detectorModelDefinition) {
        this.detectorModelDefinition = detectorModelDefinition;
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
    public CreateDetectorModelRequest withDetectorModelDescription(String detectorModelDescription) {
        this.detectorModelDescription = detectorModelDescription;
        return this;
    }

    /**
     * <p>
     * The input attribute key used to identify a device or system to create a
     * detector (an instance of the detector model) and then to route each input
     * received to the appropriate detector (instance). This parameter uses a
     * JSON-path expression in the message payload of each input to specify the
     * attribute-value pair that is used to identify the device associated with
     * the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     *
     * @return <p>
     *         The input attribute key used to identify a device or system to
     *         create a detector (an instance of the detector model) and then to
     *         route each input received to the appropriate detector (instance).
     *         This parameter uses a JSON-path expression in the message payload
     *         of each input to specify the attribute-value pair that is used to
     *         identify the device associated with the input.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The input attribute key used to identify a device or system to create a
     * detector (an instance of the detector model) and then to route each input
     * received to the appropriate detector (instance). This parameter uses a
     * JSON-path expression in the message payload of each input to specify the
     * attribute-value pair that is used to identify the device associated with
     * the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     *
     * @param key <p>
     *            The input attribute key used to identify a device or system to
     *            create a detector (an instance of the detector model) and then
     *            to route each input received to the appropriate detector
     *            (instance). This parameter uses a JSON-path expression in the
     *            message payload of each input to specify the attribute-value
     *            pair that is used to identify the device associated with the
     *            input.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The input attribute key used to identify a device or system to create a
     * detector (an instance of the detector model) and then to route each input
     * received to the appropriate detector (instance). This parameter uses a
     * JSON-path expression in the message payload of each input to specify the
     * attribute-value pair that is used to identify the device associated with
     * the input.
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
     *            The input attribute key used to identify a device or system to
     *            create a detector (an instance of the detector model) and then
     *            to route each input received to the appropriate detector
     *            (instance). This parameter uses a JSON-path expression in the
     *            message payload of each input to specify the attribute-value
     *            pair that is used to identify the device associated with the
     *            input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorModelRequest withKey(String key) {
        this.key = key;
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
    public CreateDetectorModelRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the detector model.
     * </p>
     *
     * @return <p>
     *         Metadata that can be used to manage the detector model.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the detector model.
     * </p>
     *
     * @param tags <p>
     *            Metadata that can be used to manage the detector model.
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
     * Metadata that can be used to manage the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorModelRequest withTags(Tag... tags) {
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
     * Metadata that can be used to manage the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
    public CreateDetectorModelRequest withEvaluationMethod(String evaluationMethod) {
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
    public CreateDetectorModelRequest withEvaluationMethod(EvaluationMethod evaluationMethod) {
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
        if (getDetectorModelDefinition() != null)
            sb.append("detectorModelDefinition: " + getDetectorModelDefinition() + ",");
        if (getDetectorModelDescription() != null)
            sb.append("detectorModelDescription: " + getDetectorModelDescription() + ",");
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
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
        hashCode = prime
                * hashCode
                + ((getDetectorModelDefinition() == null) ? 0 : getDetectorModelDefinition()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDetectorModelDescription() == null) ? 0 : getDetectorModelDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof CreateDetectorModelRequest == false)
            return false;
        CreateDetectorModelRequest other = (CreateDetectorModelRequest) obj;

        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null
                && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getDetectorModelDefinition() == null ^ this.getDetectorModelDefinition() == null)
            return false;
        if (other.getDetectorModelDefinition() != null
                && other.getDetectorModelDefinition().equals(this.getDetectorModelDefinition()) == false)
            return false;
        if (other.getDetectorModelDescription() == null
                ^ this.getDetectorModelDescription() == null)
            return false;
        if (other.getDetectorModelDescription() != null
                && other.getDetectorModelDescription().equals(this.getDetectorModelDescription()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEvaluationMethod() == null ^ this.getEvaluationMethod() == null)
            return false;
        if (other.getEvaluationMethod() != null
                && other.getEvaluationMethod().equals(this.getEvaluationMethod()) == false)
            return false;
        return true;
    }
}
