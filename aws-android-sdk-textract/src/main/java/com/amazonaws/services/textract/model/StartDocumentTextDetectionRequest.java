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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts the asynchronous detection of text in a document. Amazon Textract can
 * detect lines of text and the words that make up a line of text.
 * </p>
 * <p>
 * <code>StartDocumentTextDetection</code> can analyze text in documents that
 * are in JPG, PNG, and PDF format. The documents are stored in an Amazon S3
 * bucket. Use <a>DocumentLocation</a> to specify the bucket name and file name
 * of the document.
 * </p>
 * <p>
 * <code>StartTextDetection</code> returns a job identifier (<code>JobId</code>)
 * that you use to get the results of the operation. When text detection is
 * finished, Amazon Textract publishes a completion status to the Amazon Simple
 * Notification Service (Amazon SNS) topic that you specify in
 * <code>NotificationChannel</code>. To get the results of the text detection
 * operation, first check that the status value published to the Amazon SNS
 * topic is <code>SUCCEEDED</code>. If so, call <a>GetDocumentTextDetection</a>,
 * and pass the job identifier (<code>JobId</code>) from the initial call to
 * <code>StartDocumentTextDetection</code>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
 * >Document Text Detection</a>.
 * </p>
 */
public class StartDocumentTextDetectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     */
    private DocumentLocation documentLocation;

    /**
     * <p>
     * The idempotent token that's used to identify the start request. If you
     * use the same token with multiple <code>StartDocumentTextDetection</code>
     * requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being
     * accidentally started more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * An identifier you specify that's included in the completion notification
     * that's published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document, such as a tax form
     * or a receipt, that the completion notification corresponds to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String jobTag;

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the
     * completion status of the operation to.
     * </p>
     */
    private NotificationChannel notificationChannel;

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     *
     * @return <p>
     *         The location of the document to be processed.
     *         </p>
     */
    public DocumentLocation getDocumentLocation() {
        return documentLocation;
    }

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     *
     * @param documentLocation <p>
     *            The location of the document to be processed.
     *            </p>
     */
    public void setDocumentLocation(DocumentLocation documentLocation) {
        this.documentLocation = documentLocation;
    }

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentLocation <p>
     *            The location of the document to be processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentTextDetectionRequest withDocumentLocation(DocumentLocation documentLocation) {
        this.documentLocation = documentLocation;
        return this;
    }

    /**
     * <p>
     * The idempotent token that's used to identify the start request. If you
     * use the same token with multiple <code>StartDocumentTextDetection</code>
     * requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being
     * accidentally started more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         The idempotent token that's used to identify the start request.
     *         If you use the same token with multiple
     *         <code>StartDocumentTextDetection</code> requests, the same
     *         <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from
     *         being accidentally started more than once.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The idempotent token that's used to identify the start request. If you
     * use the same token with multiple <code>StartDocumentTextDetection</code>
     * requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being
     * accidentally started more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            The idempotent token that's used to identify the start
     *            request. If you use the same token with multiple
     *            <code>StartDocumentTextDetection</code> requests, the same
     *            <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidentally started more than once.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The idempotent token that's used to identify the start request. If you
     * use the same token with multiple <code>StartDocumentTextDetection</code>
     * requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being
     * accidentally started more than once.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            The idempotent token that's used to identify the start
     *            request. If you use the same token with multiple
     *            <code>StartDocumentTextDetection</code> requests, the same
     *            <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidentally started more than once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentTextDetectionRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * An identifier you specify that's included in the completion notification
     * that's published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document, such as a tax form
     * or a receipt, that the completion notification corresponds to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         An identifier you specify that's included in the completion
     *         notification that's published to the Amazon SNS topic. For
     *         example, you can use <code>JobTag</code> to identify the type of
     *         document, such as a tax form or a receipt, that the completion
     *         notification corresponds to.
     *         </p>
     */
    public String getJobTag() {
        return jobTag;
    }

    /**
     * <p>
     * An identifier you specify that's included in the completion notification
     * that's published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document, such as a tax form
     * or a receipt, that the completion notification corresponds to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param jobTag <p>
     *            An identifier you specify that's included in the completion
     *            notification that's published to the Amazon SNS topic. For
     *            example, you can use <code>JobTag</code> to identify the type
     *            of document, such as a tax form or a receipt, that the
     *            completion notification corresponds to.
     *            </p>
     */
    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * An identifier you specify that's included in the completion notification
     * that's published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document, such as a tax form
     * or a receipt, that the completion notification corresponds to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param jobTag <p>
     *            An identifier you specify that's included in the completion
     *            notification that's published to the Amazon SNS topic. For
     *            example, you can use <code>JobTag</code> to identify the type
     *            of document, such as a tax form or a receipt, that the
     *            completion notification corresponds to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentTextDetectionRequest withJobTag(String jobTag) {
        this.jobTag = jobTag;
        return this;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the
     * completion status of the operation to.
     * </p>
     *
     * @return <p>
     *         The Amazon SNS topic ARN that you want Amazon Textract to publish
     *         the completion status of the operation to.
     *         </p>
     */
    public NotificationChannel getNotificationChannel() {
        return notificationChannel;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the
     * completion status of the operation to.
     * </p>
     *
     * @param notificationChannel <p>
     *            The Amazon SNS topic ARN that you want Amazon Textract to
     *            publish the completion status of the operation to.
     *            </p>
     */
    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the
     * completion status of the operation to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationChannel <p>
     *            The Amazon SNS topic ARN that you want Amazon Textract to
     *            publish the completion status of the operation to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentTextDetectionRequest withNotificationChannel(
            NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
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
        if (getDocumentLocation() != null)
            sb.append("DocumentLocation: " + getDocumentLocation() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getJobTag() != null)
            sb.append("JobTag: " + getJobTag() + ",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: " + getNotificationChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentLocation() == null) ? 0 : getDocumentLocation().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDocumentTextDetectionRequest == false)
            return false;
        StartDocumentTextDetectionRequest other = (StartDocumentTextDetectionRequest) obj;

        if (other.getDocumentLocation() == null ^ this.getDocumentLocation() == null)
            return false;
        if (other.getDocumentLocation() != null
                && other.getDocumentLocation().equals(this.getDocumentLocation()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getJobTag() == null ^ this.getJobTag() == null)
            return false;
        if (other.getJobTag() != null && other.getJobTag().equals(this.getJobTag()) == false)
            return false;
        if (other.getNotificationChannel() == null ^ this.getNotificationChannel() == null)
            return false;
        if (other.getNotificationChannel() != null
                && other.getNotificationChannel().equals(this.getNotificationChannel()) == false)
            return false;
        return true;
    }
}
