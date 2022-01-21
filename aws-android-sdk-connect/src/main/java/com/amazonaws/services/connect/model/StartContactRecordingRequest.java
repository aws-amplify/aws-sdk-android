/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts recording the contact when the agent joins the call.
 * StartContactRecording is a one-time action. For example, if you use
 * StopContactRecording to stop recording an ongoing call, you can't use
 * StartContactRecording to restart it. For scenarios where the recording has
 * started and you want to suspend and resume it, such as when collecting
 * sensitive information (for example, a credit card number), use
 * SuspendContactRecording and ResumeContactRecording.
 * </p>
 * <p>
 * You can use this API to override the recording behavior configured in the <a
 * href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html"
 * >Set recording behavior</a> block.
 * </p>
 * <p>
 * Only voice recordings are supported at this time.
 * </p>
 */
public class StartContactRecordingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with the contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String initialContactId;

    /**
     * <p>
     * The person being recorded.
     * </p>
     */
    private VoiceRecordingConfiguration voiceRecordingConfiguration;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartContactRecordingRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartContactRecordingRequest withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with the contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact. This is the identifier of the
     *         contact associated with the first interaction with the contact
     *         center.
     *         </p>
     */
    public String getInitialContactId() {
        return initialContactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with the contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            The identifier of the contact. This is the identifier of the
     *            contact associated with the first interaction with the contact
     *            center.
     *            </p>
     */
    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with the contact center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            The identifier of the contact. This is the identifier of the
     *            contact associated with the first interaction with the contact
     *            center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartContactRecordingRequest withInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
        return this;
    }

    /**
     * <p>
     * The person being recorded.
     * </p>
     *
     * @return <p>
     *         The person being recorded.
     *         </p>
     */
    public VoiceRecordingConfiguration getVoiceRecordingConfiguration() {
        return voiceRecordingConfiguration;
    }

    /**
     * <p>
     * The person being recorded.
     * </p>
     *
     * @param voiceRecordingConfiguration <p>
     *            The person being recorded.
     *            </p>
     */
    public void setVoiceRecordingConfiguration(
            VoiceRecordingConfiguration voiceRecordingConfiguration) {
        this.voiceRecordingConfiguration = voiceRecordingConfiguration;
    }

    /**
     * <p>
     * The person being recorded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceRecordingConfiguration <p>
     *            The person being recorded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartContactRecordingRequest withVoiceRecordingConfiguration(
            VoiceRecordingConfiguration voiceRecordingConfiguration) {
        this.voiceRecordingConfiguration = voiceRecordingConfiguration;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getInitialContactId() != null)
            sb.append("InitialContactId: " + getInitialContactId() + ",");
        if (getVoiceRecordingConfiguration() != null)
            sb.append("VoiceRecordingConfiguration: " + getVoiceRecordingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode
                + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime
                * hashCode
                + ((getVoiceRecordingConfiguration() == null) ? 0
                        : getVoiceRecordingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartContactRecordingRequest == false)
            return false;
        StartContactRecordingRequest other = (StartContactRecordingRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null
                && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getVoiceRecordingConfiguration() == null
                ^ this.getVoiceRecordingConfiguration() == null)
            return false;
        if (other.getVoiceRecordingConfiguration() != null
                && other.getVoiceRecordingConfiguration().equals(
                        this.getVoiceRecordingConfiguration()) == false)
            return false;
        return true;
    }
}
