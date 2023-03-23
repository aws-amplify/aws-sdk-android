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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts the classification and analysis of an input document.
 * <code>StartLendingAnalysis</code> initiates the classification and analysis
 * of a packet of lending documents. <code>StartLendingAnalysis</code> operates
 * on a document file located in an Amazon S3 bucket.
 * </p>
 * <p>
 * <code>StartLendingAnalysis</code> can analyze text in documents that are in
 * one of the following formats: JPEG, PNG, TIFF, PDF. Use
 * <code>DocumentLocation</code> to specify the bucket name and the file name of
 * the document.
 * </p>
 * <p>
 * <code>StartLendingAnalysis</code> returns a job identifier (
 * <code>JobId</code>) that you use to get the results of the operation. When
 * the text analysis is finished, Amazon Textract publishes a completion status
 * to the Amazon Simple Notification Service (Amazon SNS) topic that you specify
 * in <code>NotificationChannel</code>. To get the results of the text analysis
 * operation, first check that the status value published to the Amazon SNS
 * topic is SUCCEEDED. If the status is SUCCEEDED you can call either
 * <code>GetLendingAnalysis</code> or <code>GetLendingAnalysisSummary</code> and
 * provide the <code>JobId</code> to obtain the results of the analysis.
 * </p>
 * <p>
 * If using <code>OutputConfig</code> to specify an Amazon S3 bucket, the output
 * will be contained within the specified prefix in a directory labeled with the
 * job-id. In the directory there are 3 sub-directories:
 * </p>
 * <ul>
 * <li>
 * <p>
 * detailedResponse (contains the GetLendingAnalysis response)
 * </p>
 * </li>
 * <li>
 * <p>
 * summaryResponse (for the GetLendingAnalysisSummary response)
 * </p>
 * </li>
 * <li>
 * <p>
 * splitDocuments (documents split across logical boundaries)
 * </p>
 * </li>
 * </ul>
 */
public class StartLendingAnalysisRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon S3 bucket that contains the document to be processed. It's
     * used by asynchronous operations.
     * </p>
     * <p>
     * The input document can be an image file in JPEG or PNG format. It can
     * also be a file in PDF format.
     * </p>
     */
    private DocumentLocation documentLocation;

    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you
     * use the same token with multiple <code>StartLendingAnalysis</code>
     * requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being
     * accidentally started more than once. For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/api-sync.html"
     * >Calling Amazon Textract Asynchronous Operations</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * An identifier that you specify to be included in the completion
     * notification published to the Amazon SNS topic. For example, you can use
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
     * The Amazon Simple Notification Service (Amazon SNS) topic to which Amazon
     * Textract publishes the completion status of an asynchronous document
     * operation.
     * </p>
     */
    private NotificationChannel notificationChannel;

    /**
     * <p>
     * Sets whether or not your output will go to a user created bucket. Used to
     * set the name of the bucket, and the prefix on the output file.
     * </p>
     * <p>
     * <code>OutputConfig</code> is an optional parameter which lets you adjust
     * where your output will be placed. By default, Amazon Textract will store
     * the results internally and can only be accessed by the Get API
     * operations. With <code>OutputConfig</code> enabled, you can set the name
     * of the bucket the output will be sent to the file prefix of the results
     * where you can download your results. Additionally, you can set the
     * <code>KMSKeyID</code> parameter to a customer master key (CMK) to encrypt
     * your output. Without this parameter set Amazon Textract will encrypt
     * server-side using the AWS managed CMK for Amazon S3.
     * </p>
     * <p>
     * Decryption of Customer Content is necessary for processing of the
     * documents by Amazon Textract. If your account is opted out under an AI
     * services opt out policy then all unencrypted Customer Content is
     * immediately and permanently deleted after the Customer Content has been
     * processed by the service. No copy of of the output is retained by Amazon
     * Textract. For information about how to opt out, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     * > Managing AI services opt-out policy. </a>
     * </p>
     * <p>
     * For more information on data privacy, see the <a
     * href="https://aws.amazon.com/compliance/data-privacy-faq/">Data Privacy
     * FAQ</a>.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * The KMS key used to encrypt the inference results. This can be in either
     * Key ID or Key Alias format. When a KMS key is provided, the KMS key will
     * be used for server-side encryption of the objects in the customer bucket.
     * When this parameter is not enabled, the result will be encrypted server
     * side, using SSE-S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kMSKeyId;

    /**
     * <p>
     * The Amazon S3 bucket that contains the document to be processed. It's
     * used by asynchronous operations.
     * </p>
     * <p>
     * The input document can be an image file in JPEG or PNG format. It can
     * also be a file in PDF format.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket that contains the document to be processed.
     *         It's used by asynchronous operations.
     *         </p>
     *         <p>
     *         The input document can be an image file in JPEG or PNG format. It
     *         can also be a file in PDF format.
     *         </p>
     */
    public DocumentLocation getDocumentLocation() {
        return documentLocation;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the document to be processed. It's
     * used by asynchronous operations.
     * </p>
     * <p>
     * The input document can be an image file in JPEG or PNG format. It can
     * also be a file in PDF format.
     * </p>
     *
     * @param documentLocation <p>
     *            The Amazon S3 bucket that contains the document to be
     *            processed. It's used by asynchronous operations.
     *            </p>
     *            <p>
     *            The input document can be an image file in JPEG or PNG format.
     *            It can also be a file in PDF format.
     *            </p>
     */
    public void setDocumentLocation(DocumentLocation documentLocation) {
        this.documentLocation = documentLocation;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the document to be processed. It's
     * used by asynchronous operations.
     * </p>
     * <p>
     * The input document can be an image file in JPEG or PNG format. It can
     * also be a file in PDF format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentLocation <p>
     *            The Amazon S3 bucket that contains the document to be
     *            processed. It's used by asynchronous operations.
     *            </p>
     *            <p>
     *            The input document can be an image file in JPEG or PNG format.
     *            It can also be a file in PDF format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartLendingAnalysisRequest withDocumentLocation(DocumentLocation documentLocation) {
        this.documentLocation = documentLocation;
        return this;
    }

    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you
     * use the same token with multiple <code>StartLendingAnalysis</code>
     * requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being
     * accidentally started more than once. For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/api-sync.html"
     * >Calling Amazon Textract Asynchronous Operations</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         The idempotent token that you use to identify the start request.
     *         If you use the same token with multiple
     *         <code>StartLendingAnalysis</code> requests, the same
     *         <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from
     *         being accidentally started more than once. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/textract/latest/dg/api-sync.html"
     *         >Calling Amazon Textract Asynchronous Operations</a>.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you
     * use the same token with multiple <code>StartLendingAnalysis</code>
     * requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being
     * accidentally started more than once. For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/api-sync.html"
     * >Calling Amazon Textract Asynchronous Operations</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            The idempotent token that you use to identify the start
     *            request. If you use the same token with multiple
     *            <code>StartLendingAnalysis</code> requests, the same
     *            <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidentally started more than once. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/textract/latest/dg/api-sync.html"
     *            >Calling Amazon Textract Asynchronous Operations</a>.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you
     * use the same token with multiple <code>StartLendingAnalysis</code>
     * requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being
     * accidentally started more than once. For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/api-sync.html"
     * >Calling Amazon Textract Asynchronous Operations</a>.
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
     *            The idempotent token that you use to identify the start
     *            request. If you use the same token with multiple
     *            <code>StartLendingAnalysis</code> requests, the same
     *            <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidentally started more than once. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/textract/latest/dg/api-sync.html"
     *            >Calling Amazon Textract Asynchronous Operations</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartLendingAnalysisRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * An identifier that you specify to be included in the completion
     * notification published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document that the completion
     * notification corresponds to (such as a tax form or a receipt).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         An identifier that you specify to be included in the completion
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
     * An identifier that you specify to be included in the completion
     * notification published to the Amazon SNS topic. For example, you can use
     * <code>JobTag</code> to identify the type of document that the completion
     * notification corresponds to (such as a tax form or a receipt).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param jobTag <p>
     *            An identifier that you specify to be included in the
     *            completion notification published to the Amazon SNS topic. For
     *            example, you can use <code>JobTag</code> to identify the type
     *            of document that the completion notification corresponds to
     *            (such as a tax form or a receipt).
     *            </p>
     */
    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * An identifier that you specify to be included in the completion
     * notification published to the Amazon SNS topic. For example, you can use
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
     *            An identifier that you specify to be included in the
     *            completion notification published to the Amazon SNS topic. For
     *            example, you can use <code>JobTag</code> to identify the type
     *            of document that the completion notification corresponds to
     *            (such as a tax form or a receipt).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartLendingAnalysisRequest withJobTag(String jobTag) {
        this.jobTag = jobTag;
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic to which Amazon
     * Textract publishes the completion status of an asynchronous document
     * operation.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Notification Service (Amazon SNS) topic to
     *         which Amazon Textract publishes the completion status of an
     *         asynchronous document operation.
     *         </p>
     */
    public NotificationChannel getNotificationChannel() {
        return notificationChannel;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic to which Amazon
     * Textract publishes the completion status of an asynchronous document
     * operation.
     * </p>
     *
     * @param notificationChannel <p>
     *            The Amazon Simple Notification Service (Amazon SNS) topic to
     *            which Amazon Textract publishes the completion status of an
     *            asynchronous document operation.
     *            </p>
     */
    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic to which Amazon
     * Textract publishes the completion status of an asynchronous document
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationChannel <p>
     *            The Amazon Simple Notification Service (Amazon SNS) topic to
     *            which Amazon Textract publishes the completion status of an
     *            asynchronous document operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartLendingAnalysisRequest withNotificationChannel(
            NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    /**
     * <p>
     * Sets whether or not your output will go to a user created bucket. Used to
     * set the name of the bucket, and the prefix on the output file.
     * </p>
     * <p>
     * <code>OutputConfig</code> is an optional parameter which lets you adjust
     * where your output will be placed. By default, Amazon Textract will store
     * the results internally and can only be accessed by the Get API
     * operations. With <code>OutputConfig</code> enabled, you can set the name
     * of the bucket the output will be sent to the file prefix of the results
     * where you can download your results. Additionally, you can set the
     * <code>KMSKeyID</code> parameter to a customer master key (CMK) to encrypt
     * your output. Without this parameter set Amazon Textract will encrypt
     * server-side using the AWS managed CMK for Amazon S3.
     * </p>
     * <p>
     * Decryption of Customer Content is necessary for processing of the
     * documents by Amazon Textract. If your account is opted out under an AI
     * services opt out policy then all unencrypted Customer Content is
     * immediately and permanently deleted after the Customer Content has been
     * processed by the service. No copy of of the output is retained by Amazon
     * Textract. For information about how to opt out, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     * > Managing AI services opt-out policy. </a>
     * </p>
     * <p>
     * For more information on data privacy, see the <a
     * href="https://aws.amazon.com/compliance/data-privacy-faq/">Data Privacy
     * FAQ</a>.
     * </p>
     *
     * @return <p>
     *         Sets whether or not your output will go to a user created bucket.
     *         Used to set the name of the bucket, and the prefix on the output
     *         file.
     *         </p>
     *         <p>
     *         <code>OutputConfig</code> is an optional parameter which lets you
     *         adjust where your output will be placed. By default, Amazon
     *         Textract will store the results internally and can only be
     *         accessed by the Get API operations. With
     *         <code>OutputConfig</code> enabled, you can set the name of the
     *         bucket the output will be sent to the file prefix of the results
     *         where you can download your results. Additionally, you can set
     *         the <code>KMSKeyID</code> parameter to a customer master key
     *         (CMK) to encrypt your output. Without this parameter set Amazon
     *         Textract will encrypt server-side using the AWS managed CMK for
     *         Amazon S3.
     *         </p>
     *         <p>
     *         Decryption of Customer Content is necessary for processing of the
     *         documents by Amazon Textract. If your account is opted out under
     *         an AI services opt out policy then all unencrypted Customer
     *         Content is immediately and permanently deleted after the Customer
     *         Content has been processed by the service. No copy of of the
     *         output is retained by Amazon Textract. For information about how
     *         to opt out, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     *         > Managing AI services opt-out policy. </a>
     *         </p>
     *         <p>
     *         For more information on data privacy, see the <a
     *         href="https://aws.amazon.com/compliance/data-privacy-faq/">Data
     *         Privacy FAQ</a>.
     *         </p>
     */
    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * Sets whether or not your output will go to a user created bucket. Used to
     * set the name of the bucket, and the prefix on the output file.
     * </p>
     * <p>
     * <code>OutputConfig</code> is an optional parameter which lets you adjust
     * where your output will be placed. By default, Amazon Textract will store
     * the results internally and can only be accessed by the Get API
     * operations. With <code>OutputConfig</code> enabled, you can set the name
     * of the bucket the output will be sent to the file prefix of the results
     * where you can download your results. Additionally, you can set the
     * <code>KMSKeyID</code> parameter to a customer master key (CMK) to encrypt
     * your output. Without this parameter set Amazon Textract will encrypt
     * server-side using the AWS managed CMK for Amazon S3.
     * </p>
     * <p>
     * Decryption of Customer Content is necessary for processing of the
     * documents by Amazon Textract. If your account is opted out under an AI
     * services opt out policy then all unencrypted Customer Content is
     * immediately and permanently deleted after the Customer Content has been
     * processed by the service. No copy of of the output is retained by Amazon
     * Textract. For information about how to opt out, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     * > Managing AI services opt-out policy. </a>
     * </p>
     * <p>
     * For more information on data privacy, see the <a
     * href="https://aws.amazon.com/compliance/data-privacy-faq/">Data Privacy
     * FAQ</a>.
     * </p>
     *
     * @param outputConfig <p>
     *            Sets whether or not your output will go to a user created
     *            bucket. Used to set the name of the bucket, and the prefix on
     *            the output file.
     *            </p>
     *            <p>
     *            <code>OutputConfig</code> is an optional parameter which lets
     *            you adjust where your output will be placed. By default,
     *            Amazon Textract will store the results internally and can only
     *            be accessed by the Get API operations. With
     *            <code>OutputConfig</code> enabled, you can set the name of the
     *            bucket the output will be sent to the file prefix of the
     *            results where you can download your results. Additionally, you
     *            can set the <code>KMSKeyID</code> parameter to a customer
     *            master key (CMK) to encrypt your output. Without this
     *            parameter set Amazon Textract will encrypt server-side using
     *            the AWS managed CMK for Amazon S3.
     *            </p>
     *            <p>
     *            Decryption of Customer Content is necessary for processing of
     *            the documents by Amazon Textract. If your account is opted out
     *            under an AI services opt out policy then all unencrypted
     *            Customer Content is immediately and permanently deleted after
     *            the Customer Content has been processed by the service. No
     *            copy of of the output is retained by Amazon Textract. For
     *            information about how to opt out, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     *            > Managing AI services opt-out policy. </a>
     *            </p>
     *            <p>
     *            For more information on data privacy, see the <a
     *            href="https://aws.amazon.com/compliance/data-privacy-faq/"
     *            >Data Privacy FAQ</a>.
     *            </p>
     */
    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Sets whether or not your output will go to a user created bucket. Used to
     * set the name of the bucket, and the prefix on the output file.
     * </p>
     * <p>
     * <code>OutputConfig</code> is an optional parameter which lets you adjust
     * where your output will be placed. By default, Amazon Textract will store
     * the results internally and can only be accessed by the Get API
     * operations. With <code>OutputConfig</code> enabled, you can set the name
     * of the bucket the output will be sent to the file prefix of the results
     * where you can download your results. Additionally, you can set the
     * <code>KMSKeyID</code> parameter to a customer master key (CMK) to encrypt
     * your output. Without this parameter set Amazon Textract will encrypt
     * server-side using the AWS managed CMK for Amazon S3.
     * </p>
     * <p>
     * Decryption of Customer Content is necessary for processing of the
     * documents by Amazon Textract. If your account is opted out under an AI
     * services opt out policy then all unencrypted Customer Content is
     * immediately and permanently deleted after the Customer Content has been
     * processed by the service. No copy of of the output is retained by Amazon
     * Textract. For information about how to opt out, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     * > Managing AI services opt-out policy. </a>
     * </p>
     * <p>
     * For more information on data privacy, see the <a
     * href="https://aws.amazon.com/compliance/data-privacy-faq/">Data Privacy
     * FAQ</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            Sets whether or not your output will go to a user created
     *            bucket. Used to set the name of the bucket, and the prefix on
     *            the output file.
     *            </p>
     *            <p>
     *            <code>OutputConfig</code> is an optional parameter which lets
     *            you adjust where your output will be placed. By default,
     *            Amazon Textract will store the results internally and can only
     *            be accessed by the Get API operations. With
     *            <code>OutputConfig</code> enabled, you can set the name of the
     *            bucket the output will be sent to the file prefix of the
     *            results where you can download your results. Additionally, you
     *            can set the <code>KMSKeyID</code> parameter to a customer
     *            master key (CMK) to encrypt your output. Without this
     *            parameter set Amazon Textract will encrypt server-side using
     *            the AWS managed CMK for Amazon S3.
     *            </p>
     *            <p>
     *            Decryption of Customer Content is necessary for processing of
     *            the documents by Amazon Textract. If your account is opted out
     *            under an AI services opt out policy then all unencrypted
     *            Customer Content is immediately and permanently deleted after
     *            the Customer Content has been processed by the service. No
     *            copy of of the output is retained by Amazon Textract. For
     *            information about how to opt out, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
     *            > Managing AI services opt-out policy. </a>
     *            </p>
     *            <p>
     *            For more information on data privacy, see the <a
     *            href="https://aws.amazon.com/compliance/data-privacy-faq/"
     *            >Data Privacy FAQ</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartLendingAnalysisRequest withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * The KMS key used to encrypt the inference results. This can be in either
     * Key ID or Key Alias format. When a KMS key is provided, the KMS key will
     * be used for server-side encryption of the objects in the customer bucket.
     * When this parameter is not enabled, the result will be encrypted server
     * side, using SSE-S3.
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
     *         enabled, the result will be encrypted server side, using SSE-S3.
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
     * side, using SSE-S3.
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
     *            not enabled, the result will be encrypted server side, using
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
     * side, using SSE-S3.
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
     *            not enabled, the result will be encrypted server side, using
     *            SSE-S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartLendingAnalysisRequest withKMSKeyId(String kMSKeyId) {
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

        if (obj instanceof StartLendingAnalysisRequest == false)
            return false;
        StartLendingAnalysisRequest other = (StartLendingAnalysisRequest) obj;

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
