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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class DescribeStreamProcessorResult implements Serializable {
    /**
     * <p>
     * Name of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String name;

    /**
     * <p>
     * ARN of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)
     * <br/>
     */
    private String streamProcessorArn;

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     */
    private String status;

    /**
     * <p>
     * Detailed status message about the stream processor.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * Date and time the stream processor was created
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The time, in Unix format, the stream processor was last updated. For
     * example, when the stream processor moves from a running state to a failed
     * state, or when the user starts or stops the stream processor.
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;

    /**
     * <p>
     * Kinesis video stream that provides the source streaming video.
     * </p>
     */
    private StreamProcessorInput input;

    /**
     * <p>
     * Kinesis data stream to which Amazon Rekognition Video puts the analysis
     * results.
     * </p>
     */
    private StreamProcessorOutput output;

    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     */
    private String roleArn;

    /**
     * <p>
     * Face recognition input parameters that are being used by the stream
     * processor. Includes the collection to use for face recognition and the
     * face attributes to detect.
     * </p>
     */
    private StreamProcessorSettings settings;

    /**
     * <p>
     * Name of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         Name of the stream processor.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param name <p>
     *            Name of the stream processor.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param name <p>
     *            Name of the stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamProcessorResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * ARN of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)
     * <br/>
     *
     * @return <p>
     *         ARN of the stream processor.
     *         </p>
     */
    public String getStreamProcessorArn() {
        return streamProcessorArn;
    }

    /**
     * <p>
     * ARN of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)
     * <br/>
     *
     * @param streamProcessorArn <p>
     *            ARN of the stream processor.
     *            </p>
     */
    public void setStreamProcessorArn(String streamProcessorArn) {
        this.streamProcessorArn = streamProcessorArn;
    }

    /**
     * <p>
     * ARN of the stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)
     * <br/>
     *
     * @param streamProcessorArn <p>
     *            ARN of the stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamProcessorResult withStreamProcessorArn(String streamProcessorArn) {
        this.streamProcessorArn = streamProcessorArn;
        return this;
    }

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @return <p>
     *         Current status of the stream processor.
     *         </p>
     * @see StreamProcessorStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @param status <p>
     *            Current status of the stream processor.
     *            </p>
     * @see StreamProcessorStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @param status <p>
     *            Current status of the stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamProcessorStatus
     */
    public DescribeStreamProcessorResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @param status <p>
     *            Current status of the stream processor.
     *            </p>
     * @see StreamProcessorStatus
     */
    public void setStatus(StreamProcessorStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @param status <p>
     *            Current status of the stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamProcessorStatus
     */
    public DescribeStreamProcessorResult withStatus(StreamProcessorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Detailed status message about the stream processor.
     * </p>
     *
     * @return <p>
     *         Detailed status message about the stream processor.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * Detailed status message about the stream processor.
     * </p>
     *
     * @param statusMessage <p>
     *            Detailed status message about the stream processor.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Detailed status message about the stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            Detailed status message about the stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamProcessorResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Date and time the stream processor was created
     * </p>
     *
     * @return <p>
     *         Date and time the stream processor was created
     *         </p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>
     * Date and time the stream processor was created
     * </p>
     *
     * @param creationTimestamp <p>
     *            Date and time the stream processor was created
     *            </p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * Date and time the stream processor was created
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp <p>
     *            Date and time the stream processor was created
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamProcessorResult withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>
     * The time, in Unix format, the stream processor was last updated. For
     * example, when the stream processor moves from a running state to a failed
     * state, or when the user starts or stops the stream processor.
     * </p>
     *
     * @return <p>
     *         The time, in Unix format, the stream processor was last updated.
     *         For example, when the stream processor moves from a running state
     *         to a failed state, or when the user starts or stops the stream
     *         processor.
     *         </p>
     */
    public java.util.Date getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    /**
     * <p>
     * The time, in Unix format, the stream processor was last updated. For
     * example, when the stream processor moves from a running state to a failed
     * state, or when the user starts or stops the stream processor.
     * </p>
     *
     * @param lastUpdateTimestamp <p>
     *            The time, in Unix format, the stream processor was last
     *            updated. For example, when the stream processor moves from a
     *            running state to a failed state, or when the user starts or
     *            stops the stream processor.
     *            </p>
     */
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * The time, in Unix format, the stream processor was last updated. For
     * example, when the stream processor moves from a running state to a failed
     * state, or when the user starts or stops the stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateTimestamp <p>
     *            The time, in Unix format, the stream processor was last
     *            updated. For example, when the stream processor moves from a
     *            running state to a failed state, or when the user starts or
     *            stops the stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamProcessorResult withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        return this;
    }

    /**
     * <p>
     * Kinesis video stream that provides the source streaming video.
     * </p>
     *
     * @return <p>
     *         Kinesis video stream that provides the source streaming video.
     *         </p>
     */
    public StreamProcessorInput getInput() {
        return input;
    }

    /**
     * <p>
     * Kinesis video stream that provides the source streaming video.
     * </p>
     *
     * @param input <p>
     *            Kinesis video stream that provides the source streaming video.
     *            </p>
     */
    public void setInput(StreamProcessorInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Kinesis video stream that provides the source streaming video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param input <p>
     *            Kinesis video stream that provides the source streaming video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamProcessorResult withInput(StreamProcessorInput input) {
        this.input = input;
        return this;
    }

    /**
     * <p>
     * Kinesis data stream to which Amazon Rekognition Video puts the analysis
     * results.
     * </p>
     *
     * @return <p>
     *         Kinesis data stream to which Amazon Rekognition Video puts the
     *         analysis results.
     *         </p>
     */
    public StreamProcessorOutput getOutput() {
        return output;
    }

    /**
     * <p>
     * Kinesis data stream to which Amazon Rekognition Video puts the analysis
     * results.
     * </p>
     *
     * @param output <p>
     *            Kinesis data stream to which Amazon Rekognition Video puts the
     *            analysis results.
     *            </p>
     */
    public void setOutput(StreamProcessorOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * Kinesis data stream to which Amazon Rekognition Video puts the analysis
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param output <p>
     *            Kinesis data stream to which Amazon Rekognition Video puts the
     *            analysis results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamProcessorResult withOutput(StreamProcessorOutput output) {
        this.output = output;
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @return <p>
     *         ARN of the IAM role that allows access to the stream processor.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @param roleArn <p>
     *            ARN of the IAM role that allows access to the stream
     *            processor.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @param roleArn <p>
     *            ARN of the IAM role that allows access to the stream
     *            processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamProcessorResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Face recognition input parameters that are being used by the stream
     * processor. Includes the collection to use for face recognition and the
     * face attributes to detect.
     * </p>
     *
     * @return <p>
     *         Face recognition input parameters that are being used by the
     *         stream processor. Includes the collection to use for face
     *         recognition and the face attributes to detect.
     *         </p>
     */
    public StreamProcessorSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Face recognition input parameters that are being used by the stream
     * processor. Includes the collection to use for face recognition and the
     * face attributes to detect.
     * </p>
     *
     * @param settings <p>
     *            Face recognition input parameters that are being used by the
     *            stream processor. Includes the collection to use for face
     *            recognition and the face attributes to detect.
     *            </p>
     */
    public void setSettings(StreamProcessorSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Face recognition input parameters that are being used by the stream
     * processor. Includes the collection to use for face recognition and the
     * face attributes to detect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Face recognition input parameters that are being used by the
     *            stream processor. Includes the collection to use for face
     *            recognition and the face attributes to detect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamProcessorResult withSettings(StreamProcessorSettings settings) {
        this.settings = settings;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStreamProcessorArn() != null)
            sb.append("StreamProcessorArn: " + getStreamProcessorArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: " + getLastUpdateTimestamp() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getOutput() != null)
            sb.append("Output: " + getOutput() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getStreamProcessorArn() == null) ? 0 : getStreamProcessorArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStreamProcessorResult == false)
            return false;
        DescribeStreamProcessorResult other = (DescribeStreamProcessorResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStreamProcessorArn() == null ^ this.getStreamProcessorArn() == null)
            return false;
        if (other.getStreamProcessorArn() != null
                && other.getStreamProcessorArn().equals(this.getStreamProcessorArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null
                && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }
}
