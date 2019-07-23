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
 * Starts asynchronous analysis of an input document for relationships between
 * detected items such as key and value pairs, tables, and selection elements.
 * </p>
 * <p>
 * <code>StartDocumentAnalysis</code> can analyze text in documents that are in
 * JPG, PNG, and PDF format. The documents are stored in an Amazon S3 bucket.
 * Use <a>DocumentLocation</a> to specify the bucket name and file name of the
 * document.
 * </p>
 * <p>
 * <code>StartDocumentAnalysis</code> returns a job identifier (
 * <code>JobId</code>) that you use to get the results of the operation. When
 * text analysis is finished, Amazon Textract publishes a completion status to
 * the Amazon Simple Notification Service (Amazon SNS) topic that you specify in
 * <code>NotificationChannel</code>. To get the results of the text analysis
 * operation, first check that the status value published to the Amazon SNS
 * topic is <code>SUCCEEDED</code>. If so, call <a>GetDocumentAnalysis</a>, and
 * pass the job identifier (<code>JobId</code>) from the initial call to
 * <code>StartDocumentAnalysis</code>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
 * >Document Text Analysis</a>.
 * </p>
 */
public class StartDocumentAnalysisRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     */
    private DocumentLocation documentLocation;

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to
     * return information about the tables that are detected in the input
     * document. Add FORMS to return detected fields and the associated text. To
     * perform both types of analysis, add TABLES and FORMS to
     * <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever
     * the value of <code>FeatureTypes</code>.
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you
     * use the same token with multiple <code>StartDocumentAnalysis</code>
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
    public StartDocumentAnalysisRequest withDocumentLocation(DocumentLocation documentLocation) {
        this.documentLocation = documentLocation;
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to
     * return information about the tables that are detected in the input
     * document. Add FORMS to return detected fields and the associated text. To
     * perform both types of analysis, add TABLES and FORMS to
     * <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever
     * the value of <code>FeatureTypes</code>.
     * </p>
     *
     * @return <p>
     *         A list of the types of analysis to perform. Add TABLES to the
     *         list to return information about the tables that are detected in
     *         the input document. Add FORMS to return detected fields and the
     *         associated text. To perform both types of analysis, add TABLES
     *         and FORMS to <code>FeatureTypes</code>. All selectable elements (
     *         <code>SELECTION_ELEMENT</code>) that are detected are returned,
     *         whatever the value of <code>FeatureTypes</code>.
     *         </p>
     */
    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to
     * return information about the tables that are detected in the input
     * document. Add FORMS to return detected fields and the associated text. To
     * perform both types of analysis, add TABLES and FORMS to
     * <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever
     * the value of <code>FeatureTypes</code>.
     * </p>
     *
     * @param featureTypes <p>
     *            A list of the types of analysis to perform. Add TABLES to the
     *            list to return information about the tables that are detected
     *            in the input document. Add FORMS to return detected fields and
     *            the associated text. To perform both types of analysis, add
     *            TABLES and FORMS to <code>FeatureTypes</code>. All selectable
     *            elements (<code>SELECTION_ELEMENT</code>) that are detected
     *            are returned, whatever the value of <code>FeatureTypes</code>.
     *            </p>
     */
    public void setFeatureTypes(java.util.Collection<String> featureTypes) {
        if (featureTypes == null) {
            this.featureTypes = null;
            return;
        }

        this.featureTypes = new java.util.ArrayList<String>(featureTypes);
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to
     * return information about the tables that are detected in the input
     * document. Add FORMS to return detected fields and the associated text. To
     * perform both types of analysis, add TABLES and FORMS to
     * <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever
     * the value of <code>FeatureTypes</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            A list of the types of analysis to perform. Add TABLES to the
     *            list to return information about the tables that are detected
     *            in the input document. Add FORMS to return detected fields and
     *            the associated text. To perform both types of analysis, add
     *            TABLES and FORMS to <code>FeatureTypes</code>. All selectable
     *            elements (<code>SELECTION_ELEMENT</code>) that are detected
     *            are returned, whatever the value of <code>FeatureTypes</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentAnalysisRequest withFeatureTypes(String... featureTypes) {
        if (getFeatureTypes() == null) {
            this.featureTypes = new java.util.ArrayList<String>(featureTypes.length);
        }
        for (String value : featureTypes) {
            this.featureTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to
     * return information about the tables that are detected in the input
     * document. Add FORMS to return detected fields and the associated text. To
     * perform both types of analysis, add TABLES and FORMS to
     * <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever
     * the value of <code>FeatureTypes</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            A list of the types of analysis to perform. Add TABLES to the
     *            list to return information about the tables that are detected
     *            in the input document. Add FORMS to return detected fields and
     *            the associated text. To perform both types of analysis, add
     *            TABLES and FORMS to <code>FeatureTypes</code>. All selectable
     *            elements (<code>SELECTION_ELEMENT</code>) that are detected
     *            are returned, whatever the value of <code>FeatureTypes</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentAnalysisRequest withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you
     * use the same token with multiple <code>StartDocumentAnalysis</code>
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
     *         The idempotent token that you use to identify the start request.
     *         If you use the same token with multiple
     *         <code>StartDocumentAnalysis</code> requests, the same
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
     * The idempotent token that you use to identify the start request. If you
     * use the same token with multiple <code>StartDocumentAnalysis</code>
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
     *            The idempotent token that you use to identify the start
     *            request. If you use the same token with multiple
     *            <code>StartDocumentAnalysis</code> requests, the same
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
     * The idempotent token that you use to identify the start request. If you
     * use the same token with multiple <code>StartDocumentAnalysis</code>
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
     *            The idempotent token that you use to identify the start
     *            request. If you use the same token with multiple
     *            <code>StartDocumentAnalysis</code> requests, the same
     *            <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidentally started more than once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentAnalysisRequest withClientRequestToken(String clientRequestToken) {
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
    public StartDocumentAnalysisRequest withJobTag(String jobTag) {
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
    public StartDocumentAnalysisRequest withNotificationChannel(
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
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: " + getFeatureTypes() + ",");
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
                + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
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

        if (obj instanceof StartDocumentAnalysisRequest == false)
            return false;
        StartDocumentAnalysisRequest other = (StartDocumentAnalysisRequest) obj;

        if (other.getDocumentLocation() == null ^ this.getDocumentLocation() == null)
            return false;
        if (other.getDocumentLocation() != null
                && other.getDocumentLocation().equals(this.getDocumentLocation()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null
                && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
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
