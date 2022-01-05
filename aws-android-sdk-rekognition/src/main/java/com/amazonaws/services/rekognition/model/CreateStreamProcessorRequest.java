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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an Amazon Rekognition stream processor that you can use to detect and
 * recognize faces in a streaming video.
 * </p>
 * <p>
 * Amazon Rekognition Video is a consumer of live video from Amazon Kinesis
 * Video Streams. Amazon Rekognition Video sends analysis results to Amazon
 * Kinesis Data Streams.
 * </p>
 * <p>
 * You provide as input a Kinesis video stream (<code>Input</code>) and a
 * Kinesis data stream (<code>Output</code>) stream. You also specify the face
 * recognition criteria in <code>Settings</code>. For example, the collection
 * containing faces that you want to recognize. Use <code>Name</code> to assign
 * an identifier for the stream processor. You use <code>Name</code> to manage
 * the stream processor. For example, you can start processing the source video
 * by calling <a>StartStreamProcessor</a> with the <code>Name</code> field.
 * </p>
 * <p>
 * After you have finished analyzing a streaming video, use
 * <a>StopStreamProcessor</a> to stop processing. You can delete the stream
 * processor by calling <a>DeleteStreamProcessor</a>.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:CreateStreamProcessor</code> action. If you want to tag
 * your stream processor, you also require permission to perform the
 * <code>rekognition:TagResource</code> operation.
 * </p>
 */
public class CreateStreamProcessorRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If
     * you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorInput</code>.
     * </p>
     */
    private StreamProcessorInput input;

    /**
     * <p>
     * Kinesis data stream stream to which Amazon Rekognition Video puts the
     * analysis results. If you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorOutput</code>.
     * </p>
     */
    private StreamProcessorOutput output;

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use
     * <code>Name</code> to manage the stream processor. For example, you can
     * get the current status of the stream processor by calling
     * <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String name;

    /**
     * <p>
     * Face recognition input parameters to be used by the stream processor.
     * Includes the collection to use for face recognition and the face
     * attributes to detect.
     * </p>
     */
    private StreamProcessorSettings settings;

    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     */
    private String roleArn;

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the stream
     * processor.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If
     * you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorInput</code>.
     * </p>
     *
     * @return <p>
     *         Kinesis video stream stream that provides the source streaming
     *         video. If you are using the AWS CLI, the parameter name is
     *         <code>StreamProcessorInput</code>.
     *         </p>
     */
    public StreamProcessorInput getInput() {
        return input;
    }

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If
     * you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorInput</code>.
     * </p>
     *
     * @param input <p>
     *            Kinesis video stream stream that provides the source streaming
     *            video. If you are using the AWS CLI, the parameter name is
     *            <code>StreamProcessorInput</code>.
     *            </p>
     */
    public void setInput(StreamProcessorInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If
     * you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorInput</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param input <p>
     *            Kinesis video stream stream that provides the source streaming
     *            video. If you are using the AWS CLI, the parameter name is
     *            <code>StreamProcessorInput</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withInput(StreamProcessorInput input) {
        this.input = input;
        return this;
    }

    /**
     * <p>
     * Kinesis data stream stream to which Amazon Rekognition Video puts the
     * analysis results. If you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorOutput</code>.
     * </p>
     *
     * @return <p>
     *         Kinesis data stream stream to which Amazon Rekognition Video puts
     *         the analysis results. If you are using the AWS CLI, the parameter
     *         name is <code>StreamProcessorOutput</code>.
     *         </p>
     */
    public StreamProcessorOutput getOutput() {
        return output;
    }

    /**
     * <p>
     * Kinesis data stream stream to which Amazon Rekognition Video puts the
     * analysis results. If you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorOutput</code>.
     * </p>
     *
     * @param output <p>
     *            Kinesis data stream stream to which Amazon Rekognition Video
     *            puts the analysis results. If you are using the AWS CLI, the
     *            parameter name is <code>StreamProcessorOutput</code>.
     *            </p>
     */
    public void setOutput(StreamProcessorOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * Kinesis data stream stream to which Amazon Rekognition Video puts the
     * analysis results. If you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorOutput</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param output <p>
     *            Kinesis data stream stream to which Amazon Rekognition Video
     *            puts the analysis results. If you are using the AWS CLI, the
     *            parameter name is <code>StreamProcessorOutput</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withOutput(StreamProcessorOutput output) {
        this.output = output;
        return this;
    }

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use
     * <code>Name</code> to manage the stream processor. For example, you can
     * get the current status of the stream processor by calling
     * <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         An identifier you assign to the stream processor. You can use
     *         <code>Name</code> to manage the stream processor. For example,
     *         you can get the current status of the stream processor by calling
     *         <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use
     * <code>Name</code> to manage the stream processor. For example, you can
     * get the current status of the stream processor by calling
     * <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param name <p>
     *            An identifier you assign to the stream processor. You can use
     *            <code>Name</code> to manage the stream processor. For example,
     *            you can get the current status of the stream processor by
     *            calling <a>DescribeStreamProcessor</a>. <code>Name</code> is
     *            idempotent.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use
     * <code>Name</code> to manage the stream processor. For example, you can
     * get the current status of the stream processor by calling
     * <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent.
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
     *            An identifier you assign to the stream processor. You can use
     *            <code>Name</code> to manage the stream processor. For example,
     *            you can get the current status of the stream processor by
     *            calling <a>DescribeStreamProcessor</a>. <code>Name</code> is
     *            idempotent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Face recognition input parameters to be used by the stream processor.
     * Includes the collection to use for face recognition and the face
     * attributes to detect.
     * </p>
     *
     * @return <p>
     *         Face recognition input parameters to be used by the stream
     *         processor. Includes the collection to use for face recognition
     *         and the face attributes to detect.
     *         </p>
     */
    public StreamProcessorSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Face recognition input parameters to be used by the stream processor.
     * Includes the collection to use for face recognition and the face
     * attributes to detect.
     * </p>
     *
     * @param settings <p>
     *            Face recognition input parameters to be used by the stream
     *            processor. Includes the collection to use for face recognition
     *            and the face attributes to detect.
     *            </p>
     */
    public void setSettings(StreamProcessorSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Face recognition input parameters to be used by the stream processor.
     * Includes the collection to use for face recognition and the face
     * attributes to detect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Face recognition input parameters to be used by the stream
     *            processor. Includes the collection to use for face recognition
     *            and the face attributes to detect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withSettings(StreamProcessorSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
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
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
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
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param roleArn <p>
     *            ARN of the IAM role that allows access to the stream
     *            processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the stream
     * processor.
     * </p>
     *
     * @return <p>
     *         A set of tags (key-value pairs) that you want to attach to the
     *         stream processor.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the stream
     * processor.
     * </p>
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to attach to the
     *            stream processor.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the stream
     * processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to attach to the
     *            stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the stream
     * processor.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateStreamProcessorRequest clearTagsEntries() {
        this.tags = null;
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
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getOutput() != null)
            sb.append("Output: " + getOutput() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamProcessorRequest == false)
            return false;
        CreateStreamProcessorRequest other = (CreateStreamProcessorRequest) obj;

        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
