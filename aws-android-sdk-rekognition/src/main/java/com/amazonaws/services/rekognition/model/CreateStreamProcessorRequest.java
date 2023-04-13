/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * recognize faces or to detect labels in a streaming video.
 * </p>
 * <p>
 * Amazon Rekognition Video is a consumer of live video from Amazon Kinesis
 * Video Streams. There are two different settings for stream processors in
 * Amazon Rekognition: detecting faces and detecting labels.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you are creating a stream processor for detecting faces, you provide as
 * input a Kinesis video stream (<code>Input</code>) and a Kinesis data stream (
 * <code>Output</code>) stream for receiving the output. You must use the
 * <code>FaceSearch</code> option in <code>Settings</code>, specifying the
 * collection that contains the faces you want to recognize. After you have
 * finished analyzing a streaming video, use <a>StopStreamProcessor</a> to stop
 * processing.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you are creating a stream processor to detect labels, you provide as input
 * a Kinesis video stream (<code>Input</code>), Amazon S3 bucket information (
 * <code>Output</code>), and an Amazon SNS topic ARN (
 * <code>NotificationChannel</code>). You can also provide a KMS key ID to
 * encrypt the data sent to your Amazon S3 bucket. You specify what you want to
 * detect by using the <code>ConnectedHome</code> option in settings, and
 * selecting one of the following: <code>PERSON</code>, <code>PET</code>,
 * <code>PACKAGE</code>, <code>ALL</code> You can also specify where in the
 * frame you want Amazon Rekognition to monitor with
 * <code>RegionsOfInterest</code>. When you run the <a>StartStreamProcessor</a>
 * operation on a label detection stream processor, you input start and stop
 * information to determine the length of the processing time.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use <code>Name</code> to assign an identifier for the stream processor. You
 * use <code>Name</code> to manage the stream processor. For example, you can
 * start processing the source video by calling <a>StartStreamProcessor</a> with
 * the <code>Name</code> field.
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
     * <code>StreamProcessorInput</code>. This is required for both face search
     * and label detection stream processors.
     * </p>
     */
    private StreamProcessorInput input;

    /**
     * <p>
     * Kinesis data stream stream or Amazon S3 bucket location to which Amazon
     * Rekognition Video puts the analysis results. If you are using the AWS
     * CLI, the parameter name is <code>StreamProcessorOutput</code>. This must
     * be a <a>S3Destination</a> of an Amazon S3 bucket that you own for a label
     * detection stream processor or a Kinesis data stream ARN for a face search
     * stream processor.
     * </p>
     */
    private StreamProcessorOutput output;

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use
     * <code>Name</code> to manage the stream processor. For example, you can
     * get the current status of the stream processor by calling
     * <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent. This is
     * required for both face search and label detection stream processors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String name;

    /**
     * <p>
     * Input parameters used in a streaming video analyzed by a stream
     * processor. You can use <code>FaceSearch</code> to recognize faces in a
     * streaming video, or you can use <code>ConnectedHome</code> to detect
     * labels.
     * </p>
     */
    private StreamProcessorSettings settings;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role that allows access to
     * the stream processor. The IAM role provides Rekognition read permissions
     * for a Kinesis stream. It also provides write permissions to an Amazon S3
     * bucket and Amazon Simple Notification Service topic for a label detection
     * stream processor. This is required for both face search and label
     * detection stream processors.
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
     * The Amazon Simple Notification Service topic to which Amazon Rekognition
     * publishes the object detection results and completion status of a video
     * analysis operation.
     * </p>
     * <p>
     * Amazon Rekognition publishes a notification the first time an object of
     * interest or a person is detected in the video stream. For example, if
     * Amazon Rekognition detects a person at second 2, a pet at second 4, and a
     * person again at second 5, Amazon Rekognition sends 2 object class
     * detected notifications, one for a person at second 2 and one for a pet at
     * second 4.
     * </p>
     * <p>
     * Amazon Rekognition also publishes an an end-of-session notification with
     * a summary when the stream processing session is complete.
     * </p>
     */
    private StreamProcessorNotificationChannel notificationChannel;

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * This is an optional parameter for label detection stream processors and
     * should not be used to create a face search stream processor. You can
     * supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS
     * key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt results and data published to your Amazon S3 bucket, which
     * includes image frames and hero images. Your source images are unaffected.
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. You can specify up to 10 regions of interest, and each
     * region has either a polygon or a bounding box. This is an optional
     * parameter for label detection stream processors and should not be used to
     * create a face search stream processor.
     * </p>
     */
    private java.util.List<RegionOfInterest> regionsOfInterest;

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model
     * performance. You can choose this option at the account level or on a
     * per-stream basis. Note that if you opt out at the account level this
     * setting is ignored on individual streams.
     * </p>
     */
    private StreamProcessorDataSharingPreference dataSharingPreference;

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If
     * you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorInput</code>. This is required for both face search
     * and label detection stream processors.
     * </p>
     *
     * @return <p>
     *         Kinesis video stream stream that provides the source streaming
     *         video. If you are using the AWS CLI, the parameter name is
     *         <code>StreamProcessorInput</code>. This is required for both face
     *         search and label detection stream processors.
     *         </p>
     */
    public StreamProcessorInput getInput() {
        return input;
    }

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If
     * you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorInput</code>. This is required for both face search
     * and label detection stream processors.
     * </p>
     *
     * @param input <p>
     *            Kinesis video stream stream that provides the source streaming
     *            video. If you are using the AWS CLI, the parameter name is
     *            <code>StreamProcessorInput</code>. This is required for both
     *            face search and label detection stream processors.
     *            </p>
     */
    public void setInput(StreamProcessorInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If
     * you are using the AWS CLI, the parameter name is
     * <code>StreamProcessorInput</code>. This is required for both face search
     * and label detection stream processors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param input <p>
     *            Kinesis video stream stream that provides the source streaming
     *            video. If you are using the AWS CLI, the parameter name is
     *            <code>StreamProcessorInput</code>. This is required for both
     *            face search and label detection stream processors.
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
     * Kinesis data stream stream or Amazon S3 bucket location to which Amazon
     * Rekognition Video puts the analysis results. If you are using the AWS
     * CLI, the parameter name is <code>StreamProcessorOutput</code>. This must
     * be a <a>S3Destination</a> of an Amazon S3 bucket that you own for a label
     * detection stream processor or a Kinesis data stream ARN for a face search
     * stream processor.
     * </p>
     *
     * @return <p>
     *         Kinesis data stream stream or Amazon S3 bucket location to which
     *         Amazon Rekognition Video puts the analysis results. If you are
     *         using the AWS CLI, the parameter name is
     *         <code>StreamProcessorOutput</code>. This must be a
     *         <a>S3Destination</a> of an Amazon S3 bucket that you own for a
     *         label detection stream processor or a Kinesis data stream ARN for
     *         a face search stream processor.
     *         </p>
     */
    public StreamProcessorOutput getOutput() {
        return output;
    }

    /**
     * <p>
     * Kinesis data stream stream or Amazon S3 bucket location to which Amazon
     * Rekognition Video puts the analysis results. If you are using the AWS
     * CLI, the parameter name is <code>StreamProcessorOutput</code>. This must
     * be a <a>S3Destination</a> of an Amazon S3 bucket that you own for a label
     * detection stream processor or a Kinesis data stream ARN for a face search
     * stream processor.
     * </p>
     *
     * @param output <p>
     *            Kinesis data stream stream or Amazon S3 bucket location to
     *            which Amazon Rekognition Video puts the analysis results. If
     *            you are using the AWS CLI, the parameter name is
     *            <code>StreamProcessorOutput</code>. This must be a
     *            <a>S3Destination</a> of an Amazon S3 bucket that you own for a
     *            label detection stream processor or a Kinesis data stream ARN
     *            for a face search stream processor.
     *            </p>
     */
    public void setOutput(StreamProcessorOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * Kinesis data stream stream or Amazon S3 bucket location to which Amazon
     * Rekognition Video puts the analysis results. If you are using the AWS
     * CLI, the parameter name is <code>StreamProcessorOutput</code>. This must
     * be a <a>S3Destination</a> of an Amazon S3 bucket that you own for a label
     * detection stream processor or a Kinesis data stream ARN for a face search
     * stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param output <p>
     *            Kinesis data stream stream or Amazon S3 bucket location to
     *            which Amazon Rekognition Video puts the analysis results. If
     *            you are using the AWS CLI, the parameter name is
     *            <code>StreamProcessorOutput</code>. This must be a
     *            <a>S3Destination</a> of an Amazon S3 bucket that you own for a
     *            label detection stream processor or a Kinesis data stream ARN
     *            for a face search stream processor.
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
     * <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent. This is
     * required for both face search and label detection stream processors.
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
     *         This is required for both face search and label detection stream
     *         processors.
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
     * <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent. This is
     * required for both face search and label detection stream processors.
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
     *            idempotent. This is required for both face search and label
     *            detection stream processors.
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
     * <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent. This is
     * required for both face search and label detection stream processors.
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
     *            idempotent. This is required for both face search and label
     *            detection stream processors.
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
     * Input parameters used in a streaming video analyzed by a stream
     * processor. You can use <code>FaceSearch</code> to recognize faces in a
     * streaming video, or you can use <code>ConnectedHome</code> to detect
     * labels.
     * </p>
     *
     * @return <p>
     *         Input parameters used in a streaming video analyzed by a stream
     *         processor. You can use <code>FaceSearch</code> to recognize faces
     *         in a streaming video, or you can use <code>ConnectedHome</code>
     *         to detect labels.
     *         </p>
     */
    public StreamProcessorSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Input parameters used in a streaming video analyzed by a stream
     * processor. You can use <code>FaceSearch</code> to recognize faces in a
     * streaming video, or you can use <code>ConnectedHome</code> to detect
     * labels.
     * </p>
     *
     * @param settings <p>
     *            Input parameters used in a streaming video analyzed by a
     *            stream processor. You can use <code>FaceSearch</code> to
     *            recognize faces in a streaming video, or you can use
     *            <code>ConnectedHome</code> to detect labels.
     *            </p>
     */
    public void setSettings(StreamProcessorSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Input parameters used in a streaming video analyzed by a stream
     * processor. You can use <code>FaceSearch</code> to recognize faces in a
     * streaming video, or you can use <code>ConnectedHome</code> to detect
     * labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Input parameters used in a streaming video analyzed by a
     *            stream processor. You can use <code>FaceSearch</code> to
     *            recognize faces in a streaming video, or you can use
     *            <code>ConnectedHome</code> to detect labels.
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
     * The Amazon Resource Number (ARN) of the IAM role that allows access to
     * the stream processor. The IAM role provides Rekognition read permissions
     * for a Kinesis stream. It also provides write permissions to an Amazon S3
     * bucket and Amazon Simple Notification Service topic for a label detection
     * stream processor. This is required for both face search and label
     * detection stream processors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the IAM role that allows
     *         access to the stream processor. The IAM role provides Rekognition
     *         read permissions for a Kinesis stream. It also provides write
     *         permissions to an Amazon S3 bucket and Amazon Simple Notification
     *         Service topic for a label detection stream processor. This is
     *         required for both face search and label detection stream
     *         processors.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role that allows access to
     * the stream processor. The IAM role provides Rekognition read permissions
     * for a Kinesis stream. It also provides write permissions to an Amazon S3
     * bucket and Amazon Simple Notification Service topic for a label detection
     * stream processor. This is required for both face search and label
     * detection stream processors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Number (ARN) of the IAM role that allows
     *            access to the stream processor. The IAM role provides
     *            Rekognition read permissions for a Kinesis stream. It also
     *            provides write permissions to an Amazon S3 bucket and Amazon
     *            Simple Notification Service topic for a label detection stream
     *            processor. This is required for both face search and label
     *            detection stream processors.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role that allows access to
     * the stream processor. The IAM role provides Rekognition read permissions
     * for a Kinesis stream. It also provides write permissions to an Amazon S3
     * bucket and Amazon Simple Notification Service topic for a label detection
     * stream processor. This is required for both face search and label
     * detection stream processors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Number (ARN) of the IAM role that allows
     *            access to the stream processor. The IAM role provides
     *            Rekognition read permissions for a Kinesis stream. It also
     *            provides write permissions to an Amazon S3 bucket and Amazon
     *            Simple Notification Service topic for a label detection stream
     *            processor. This is required for both face search and label
     *            detection stream processors.
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
     * <p>
     * The Amazon Simple Notification Service topic to which Amazon Rekognition
     * publishes the object detection results and completion status of a video
     * analysis operation.
     * </p>
     * <p>
     * Amazon Rekognition publishes a notification the first time an object of
     * interest or a person is detected in the video stream. For example, if
     * Amazon Rekognition detects a person at second 2, a pet at second 4, and a
     * person again at second 5, Amazon Rekognition sends 2 object class
     * detected notifications, one for a person at second 2 and one for a pet at
     * second 4.
     * </p>
     * <p>
     * Amazon Rekognition also publishes an an end-of-session notification with
     * a summary when the stream processing session is complete.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Notification Service topic to which Amazon
     *         Rekognition publishes the object detection results and completion
     *         status of a video analysis operation.
     *         </p>
     *         <p>
     *         Amazon Rekognition publishes a notification the first time an
     *         object of interest or a person is detected in the video stream.
     *         For example, if Amazon Rekognition detects a person at second 2,
     *         a pet at second 4, and a person again at second 5, Amazon
     *         Rekognition sends 2 object class detected notifications, one for
     *         a person at second 2 and one for a pet at second 4.
     *         </p>
     *         <p>
     *         Amazon Rekognition also publishes an an end-of-session
     *         notification with a summary when the stream processing session is
     *         complete.
     *         </p>
     */
    public StreamProcessorNotificationChannel getNotificationChannel() {
        return notificationChannel;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service topic to which Amazon Rekognition
     * publishes the object detection results and completion status of a video
     * analysis operation.
     * </p>
     * <p>
     * Amazon Rekognition publishes a notification the first time an object of
     * interest or a person is detected in the video stream. For example, if
     * Amazon Rekognition detects a person at second 2, a pet at second 4, and a
     * person again at second 5, Amazon Rekognition sends 2 object class
     * detected notifications, one for a person at second 2 and one for a pet at
     * second 4.
     * </p>
     * <p>
     * Amazon Rekognition also publishes an an end-of-session notification with
     * a summary when the stream processing session is complete.
     * </p>
     *
     * @param notificationChannel <p>
     *            The Amazon Simple Notification Service topic to which Amazon
     *            Rekognition publishes the object detection results and
     *            completion status of a video analysis operation.
     *            </p>
     *            <p>
     *            Amazon Rekognition publishes a notification the first time an
     *            object of interest or a person is detected in the video
     *            stream. For example, if Amazon Rekognition detects a person at
     *            second 2, a pet at second 4, and a person again at second 5,
     *            Amazon Rekognition sends 2 object class detected
     *            notifications, one for a person at second 2 and one for a pet
     *            at second 4.
     *            </p>
     *            <p>
     *            Amazon Rekognition also publishes an an end-of-session
     *            notification with a summary when the stream processing session
     *            is complete.
     *            </p>
     */
    public void setNotificationChannel(StreamProcessorNotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service topic to which Amazon Rekognition
     * publishes the object detection results and completion status of a video
     * analysis operation.
     * </p>
     * <p>
     * Amazon Rekognition publishes a notification the first time an object of
     * interest or a person is detected in the video stream. For example, if
     * Amazon Rekognition detects a person at second 2, a pet at second 4, and a
     * person again at second 5, Amazon Rekognition sends 2 object class
     * detected notifications, one for a person at second 2 and one for a pet at
     * second 4.
     * </p>
     * <p>
     * Amazon Rekognition also publishes an an end-of-session notification with
     * a summary when the stream processing session is complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationChannel <p>
     *            The Amazon Simple Notification Service topic to which Amazon
     *            Rekognition publishes the object detection results and
     *            completion status of a video analysis operation.
     *            </p>
     *            <p>
     *            Amazon Rekognition publishes a notification the first time an
     *            object of interest or a person is detected in the video
     *            stream. For example, if Amazon Rekognition detects a person at
     *            second 2, a pet at second 4, and a person again at second 5,
     *            Amazon Rekognition sends 2 object class detected
     *            notifications, one for a person at second 2 and one for a pet
     *            at second 4.
     *            </p>
     *            <p>
     *            Amazon Rekognition also publishes an an end-of-session
     *            notification with a summary when the stream processing session
     *            is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withNotificationChannel(
            StreamProcessorNotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * This is an optional parameter for label detection stream processors and
     * should not be used to create a face search stream processor. You can
     * supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS
     * key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt results and data published to your Amazon S3 bucket, which
     * includes image frames and hero images. Your source images are unaffected.
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The identifier for your AWS Key Management Service key (AWS KMS
     *         key). This is an optional parameter for label detection stream
     *         processors and should not be used to create a face search stream
     *         processor. You can supply the Amazon Resource Name (ARN) of your
     *         KMS key, the ID of your KMS key, an alias for your KMS key, or an
     *         alias ARN. The key is used to encrypt results and data published
     *         to your Amazon S3 bucket, which includes image frames and hero
     *         images. Your source images are unaffected.
     *         </p>
     *         <p>
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * This is an optional parameter for label detection stream processors and
     * should not be used to create a face search stream processor. You can
     * supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS
     * key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt results and data published to your Amazon S3 bucket, which
     * includes image frames and hero images. Your source images are unaffected.
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). This is an optional parameter for label detection
     *            stream processors and should not be used to create a face
     *            search stream processor. You can supply the Amazon Resource
     *            Name (ARN) of your KMS key, the ID of your KMS key, an alias
     *            for your KMS key, or an alias ARN. The key is used to encrypt
     *            results and data published to your Amazon S3 bucket, which
     *            includes image frames and hero images. Your source images are
     *            unaffected.
     *            </p>
     *            <p>
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * This is an optional parameter for label detection stream processors and
     * should not be used to create a face search stream processor. You can
     * supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS
     * key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt results and data published to your Amazon S3 bucket, which
     * includes image frames and hero images. Your source images are unaffected.
     * </p>
     * <p>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). This is an optional parameter for label detection
     *            stream processors and should not be used to create a face
     *            search stream processor. You can supply the Amazon Resource
     *            Name (ARN) of your KMS key, the ID of your KMS key, an alias
     *            for your KMS key, or an alias ARN. The key is used to encrypt
     *            results and data published to your Amazon S3 bucket, which
     *            includes image frames and hero images. Your source images are
     *            unaffected.
     *            </p>
     *            <p>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. You can specify up to 10 regions of interest, and each
     * region has either a polygon or a bounding box. This is an optional
     * parameter for label detection stream processors and should not be used to
     * create a face search stream processor.
     * </p>
     *
     * @return <p>
     *         Specifies locations in the frames where Amazon Rekognition checks
     *         for objects or people. You can specify up to 10 regions of
     *         interest, and each region has either a polygon or a bounding box.
     *         This is an optional parameter for label detection stream
     *         processors and should not be used to create a face search stream
     *         processor.
     *         </p>
     */
    public java.util.List<RegionOfInterest> getRegionsOfInterest() {
        return regionsOfInterest;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. You can specify up to 10 regions of interest, and each
     * region has either a polygon or a bounding box. This is an optional
     * parameter for label detection stream processors and should not be used to
     * create a face search stream processor.
     * </p>
     *
     * @param regionsOfInterest <p>
     *            Specifies locations in the frames where Amazon Rekognition
     *            checks for objects or people. You can specify up to 10 regions
     *            of interest, and each region has either a polygon or a
     *            bounding box. This is an optional parameter for label
     *            detection stream processors and should not be used to create a
     *            face search stream processor.
     *            </p>
     */
    public void setRegionsOfInterest(java.util.Collection<RegionOfInterest> regionsOfInterest) {
        if (regionsOfInterest == null) {
            this.regionsOfInterest = null;
            return;
        }

        this.regionsOfInterest = new java.util.ArrayList<RegionOfInterest>(regionsOfInterest);
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. You can specify up to 10 regions of interest, and each
     * region has either a polygon or a bounding box. This is an optional
     * parameter for label detection stream processors and should not be used to
     * create a face search stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionsOfInterest <p>
     *            Specifies locations in the frames where Amazon Rekognition
     *            checks for objects or people. You can specify up to 10 regions
     *            of interest, and each region has either a polygon or a
     *            bounding box. This is an optional parameter for label
     *            detection stream processors and should not be used to create a
     *            face search stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withRegionsOfInterest(RegionOfInterest... regionsOfInterest) {
        if (getRegionsOfInterest() == null) {
            this.regionsOfInterest = new java.util.ArrayList<RegionOfInterest>(
                    regionsOfInterest.length);
        }
        for (RegionOfInterest value : regionsOfInterest) {
            this.regionsOfInterest.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. You can specify up to 10 regions of interest, and each
     * region has either a polygon or a bounding box. This is an optional
     * parameter for label detection stream processors and should not be used to
     * create a face search stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionsOfInterest <p>
     *            Specifies locations in the frames where Amazon Rekognition
     *            checks for objects or people. You can specify up to 10 regions
     *            of interest, and each region has either a polygon or a
     *            bounding box. This is an optional parameter for label
     *            detection stream processors and should not be used to create a
     *            face search stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withRegionsOfInterest(
            java.util.Collection<RegionOfInterest> regionsOfInterest) {
        setRegionsOfInterest(regionsOfInterest);
        return this;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model
     * performance. You can choose this option at the account level or on a
     * per-stream basis. Note that if you opt out at the account level this
     * setting is ignored on individual streams.
     * </p>
     *
     * @return <p>
     *         Shows whether you are sharing data with Rekognition to improve
     *         model performance. You can choose this option at the account
     *         level or on a per-stream basis. Note that if you opt out at the
     *         account level this setting is ignored on individual streams.
     *         </p>
     */
    public StreamProcessorDataSharingPreference getDataSharingPreference() {
        return dataSharingPreference;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model
     * performance. You can choose this option at the account level or on a
     * per-stream basis. Note that if you opt out at the account level this
     * setting is ignored on individual streams.
     * </p>
     *
     * @param dataSharingPreference <p>
     *            Shows whether you are sharing data with Rekognition to improve
     *            model performance. You can choose this option at the account
     *            level or on a per-stream basis. Note that if you opt out at
     *            the account level this setting is ignored on individual
     *            streams.
     *            </p>
     */
    public void setDataSharingPreference(StreamProcessorDataSharingPreference dataSharingPreference) {
        this.dataSharingPreference = dataSharingPreference;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model
     * performance. You can choose this option at the account level or on a
     * per-stream basis. Note that if you opt out at the account level this
     * setting is ignored on individual streams.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSharingPreference <p>
     *            Shows whether you are sharing data with Rekognition to improve
     *            model performance. You can choose this option at the account
     *            level or on a per-stream basis. Note that if you opt out at
     *            the account level this setting is ignored on individual
     *            streams.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorRequest withDataSharingPreference(
            StreamProcessorDataSharingPreference dataSharingPreference) {
        this.dataSharingPreference = dataSharingPreference;
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
            sb.append("Tags: " + getTags() + ",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: " + getNotificationChannel() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getRegionsOfInterest() != null)
            sb.append("RegionsOfInterest: " + getRegionsOfInterest() + ",");
        if (getDataSharingPreference() != null)
            sb.append("DataSharingPreference: " + getDataSharingPreference());
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
        hashCode = prime * hashCode
                + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getRegionsOfInterest() == null) ? 0 : getRegionsOfInterest().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataSharingPreference() == null) ? 0 : getDataSharingPreference().hashCode());
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
        if (other.getNotificationChannel() == null ^ this.getNotificationChannel() == null)
            return false;
        if (other.getNotificationChannel() != null
                && other.getNotificationChannel().equals(this.getNotificationChannel()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getRegionsOfInterest() == null ^ this.getRegionsOfInterest() == null)
            return false;
        if (other.getRegionsOfInterest() != null
                && other.getRegionsOfInterest().equals(this.getRegionsOfInterest()) == false)
            return false;
        if (other.getDataSharingPreference() == null ^ this.getDataSharingPreference() == null)
            return false;
        if (other.getDataSharingPreference() != null
                && other.getDataSharingPreference().equals(this.getDataSharingPreference()) == false)
            return false;
        return true;
    }
}
