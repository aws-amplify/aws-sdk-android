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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts the asynchronous analysis of invoices or receipts for data like
 * contact information, items purchased, and vendor names.
 * </p>
 * <p>
 * <code>StartExpenseAnalysis</code> can analyze text in documents that are in
 * JPEG, PNG, and PDF format. The documents must be stored in an Amazon S3
 * bucket. Use the <a>DocumentLocation</a> parameter to specify the name of your
 * S3 bucket and the name of the document in that bucket.
 * </p>
 * <p>
 * <code>StartExpenseAnalysis</code> returns a job identifier (
 * <code>JobId</code>) that you will provide to <code>GetExpenseAnalysis</code>
 * to retrieve the results of the operation. When the analysis of the input
 * invoices/receipts is finished, Amazon Textract publishes a completion status
 * to the Amazon Simple Notification Service (Amazon SNS) topic that you provide
 * to the <code>NotificationChannel</code>. To obtain the results of the invoice
 * and receipt analysis operation, ensure that the status value published to the
 * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
 * <a>GetExpenseAnalysis</a>, and pass the job identifier (<code>JobId</code>)
 * that was returned by your call to <code>StartExpenseAnalysis</code>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/textract/latest/dg/invoice-receipts.html"
 * >Analyzing Invoices and Receipts</a>.
 * </p>
 */
public class StartExpenseAnalysisRequest extends AmazonWebServiceRequest implements Serializable {
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
     * accidentally started more than once. For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html"
     * >Calling Amazon Textract Asynchronous Operations</a>
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
     * published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document that the completion
     * notification corresponds to (such as a tax form or a receipt).
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
     * Sets if the output will go to a customer defined bucket. By default,
     * Amazon Textract will save the results internally to be accessed by the
     * <code>GetExpenseAnalysis</code> operation.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * The KMS key used to encrypt the inference results. This can be in either
     * Key ID or Key Alias format. When a KMS key is provided, the KMS key will
     * be used for server-side encryption of the objects in the customer bucket.
     * When this parameter is not enabled, the result will be encrypted server
     * side,using SSE-S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kMSKeyId;

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
    public StartExpenseAnalysisRequest withDocumentLocation(DocumentLocation documentLocation) {
        this.documentLocation = documentLocation;
        return this;
    }

    /**
     * <p>
     * The idempotent token that's used to identify the start request. If you
     * use the same token with multiple <code>StartDocumentTextDetection</code>
     * requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being
     * accidentally started more than once. For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html"
     * >Calling Amazon Textract Asynchronous Operations</a>
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
     *         being accidentally started more than once. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/textract/latest/dg/api-async.html"
     *         >Calling Amazon Textract Asynchronous Operations</a>
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
     * accidentally started more than once. For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html"
     * >Calling Amazon Textract Asynchronous Operations</a>
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
     *            being accidentally started more than once. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/textract/latest/dg/api-async.html"
     *            >Calling Amazon Textract Asynchronous Operations</a>
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
     * accidentally started more than once. For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html"
     * >Calling Amazon Textract Asynchronous Operations</a>
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
     *            being accidentally started more than once. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/textract/latest/dg/api-async.html"
     *            >Calling Amazon Textract Asynchronous Operations</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExpenseAnalysisRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * An identifier you specify that's included in the completion notification
     * published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document that the completion
     * notification corresponds to (such as a tax form or a receipt).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         An identifier you specify that's included in the completion
     *         notification published to the Amazon SNS topic. For example, you
     *         can use <code>JobTag</code> to identify the type of document that
     *         the completion notification corresponds to (such as a tax form or
     *         a receipt).
     *         </p>
     */
    public String getJobTag() {
        return jobTag;
    }

    /**
     * <p>
     * An identifier you specify that's included in the completion notification
     * published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document that the completion
     * notification corresponds to (such as a tax form or a receipt).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param jobTag <p>
     *            An identifier you specify that's included in the completion
     *            notification published to the Amazon SNS topic. For example,
     *            you can use <code>JobTag</code> to identify the type of
     *            document that the completion notification corresponds to (such
     *            as a tax form or a receipt).
     *            </p>
     */
    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * An identifier you specify that's included in the completion notification
     * published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document that the completion
     * notification corresponds to (such as a tax form or a receipt).
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
     *            notification published to the Amazon SNS topic. For example,
     *            you can use <code>JobTag</code> to identify the type of
     *            document that the completion notification corresponds to (such
     *            as a tax form or a receipt).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExpenseAnalysisRequest withJobTag(String jobTag) {
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
    public StartExpenseAnalysisRequest withNotificationChannel(
            NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    /**
     * <p>
     * Sets if the output will go to a customer defined bucket. By default,
     * Amazon Textract will save the results internally to be accessed by the
     * <code>GetExpenseAnalysis</code> operation.
     * </p>
     *
     * @return <p>
     *         Sets if the output will go to a customer defined bucket. By
     *         default, Amazon Textract will save the results internally to be
     *         accessed by the <code>GetExpenseAnalysis</code> operation.
     *         </p>
     */
    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * Sets if the output will go to a customer defined bucket. By default,
     * Amazon Textract will save the results internally to be accessed by the
     * <code>GetExpenseAnalysis</code> operation.
     * </p>
     *
     * @param outputConfig <p>
     *            Sets if the output will go to a customer defined bucket. By
     *            default, Amazon Textract will save the results internally to
     *            be accessed by the <code>GetExpenseAnalysis</code> operation.
     *            </p>
     */
    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Sets if the output will go to a customer defined bucket. By default,
     * Amazon Textract will save the results internally to be accessed by the
     * <code>GetExpenseAnalysis</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            Sets if the output will go to a customer defined bucket. By
     *            default, Amazon Textract will save the results internally to
     *            be accessed by the <code>GetExpenseAnalysis</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExpenseAnalysisRequest withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * The KMS key used to encrypt the inference results. This can be in either
     * Key ID or Key Alias format. When a KMS key is provided, the KMS key will
     * be used for server-side encryption of the objects in the customer bucket.
     * When this parameter is not enabled, the result will be encrypted server
     * side,using SSE-S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The KMS key used to encrypt the inference results. This can be in
     *         either Key ID or Key Alias format. When a KMS key is provided,
     *         the KMS key will be used for server-side encryption of the
     *         objects in the customer bucket. When this parameter is not
     *         enabled, the result will be encrypted server side,using SSE-S3.
     *         </p>
     */
    public String getKMSKeyId() {
        return kMSKeyId;
    }

    /**
     * <p>
     * The KMS key used to encrypt the inference results. This can be in either
     * Key ID or Key Alias format. When a KMS key is provided, the KMS key will
     * be used for server-side encryption of the objects in the customer bucket.
     * When this parameter is not enabled, the result will be encrypted server
     * side,using SSE-S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kMSKeyId <p>
     *            The KMS key used to encrypt the inference results. This can be
     *            in either Key ID or Key Alias format. When a KMS key is
     *            provided, the KMS key will be used for server-side encryption
     *            of the objects in the customer bucket. When this parameter is
     *            not enabled, the result will be encrypted server side,using
     *            SSE-S3.
     *            </p>
     */
    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * The KMS key used to encrypt the inference results. This can be in either
     * Key ID or Key Alias format. When a KMS key is provided, the KMS key will
     * be used for server-side encryption of the objects in the customer bucket.
     * When this parameter is not enabled, the result will be encrypted server
     * side,using SSE-S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kMSKeyId <p>
     *            The KMS key used to encrypt the inference results. This can be
     *            in either Key ID or Key Alias format. When a KMS key is
     *            provided, the KMS key will be used for server-side encryption
     *            of the objects in the customer bucket. When this parameter is
     *            not enabled, the result will be encrypted server side,using
     *            SSE-S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExpenseAnalysisRequest withKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
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
            sb.append("NotificationChannel: " + getNotificationChannel() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: " + getKMSKeyId());
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
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExpenseAnalysisRequest == false)
            return false;
        StartExpenseAnalysisRequest other = (StartExpenseAnalysisRequest) obj;

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
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        return true;
    }
}
