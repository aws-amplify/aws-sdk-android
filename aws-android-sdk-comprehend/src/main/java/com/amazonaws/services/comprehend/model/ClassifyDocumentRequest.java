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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new document classification request to analyze a single document in
 * real-time, using a previously created and trained custom model and an
 * endpoint.
 * </p>
 * <p>
 * You can input plain text or you can upload a single-page input document
 * (text, PDF, Word, or image).
 * </p>
 * <p>
 * If the system detects errors while processing a page in the input document,
 * the API response includes an entry in <code>Errors</code> that describes the
 * errors.
 * </p>
 * <p>
 * If the system detects a document-level error in your input document, the API
 * returns an <code>InvalidRequestException</code> error response. For details
 * about this exception, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync-err.html">
 * Errors in semi-structured documents</a> in the Comprehend Developer Guide.
 * </p>
 */
public class ClassifyDocumentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The document text to be analyzed. If you enter text using this parameter,
     * do not use the <code>Bytes</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint. For information about
     * endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointArn;

    /**
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image
     * file. You can also use the <code>Bytes</code> parameter to input an
     * Amazon Textract <code>DetectDocumentText</code> or
     * <code>AnalyzeDocument</code> output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your
     * code uses an Amazon Web Services SDK to classify documents, the SDK may
     * encode the document file bytes for you.
     * </p>
     * <p>
     * The maximum length of this field depends on the input document type. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html">
     * Inputs for real-time custom analysis</a> in the Comprehend Developer
     * Guide.
     * </p>
     * <p>
     * If you use the <code>Bytes</code> parameter, do not use the
     * <code>Text</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.nio.ByteBuffer bytes;

    /**
     * <p>
     * Provides configuration parameters to override the default actions for
     * extracting text from PDF documents and image files.
     * </p>
     */
    private DocumentReaderConfig documentReaderConfig;

    /**
     * <p>
     * The document text to be analyzed. If you enter text using this parameter,
     * do not use the <code>Bytes</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The document text to be analyzed. If you enter text using this
     *         parameter, do not use the <code>Bytes</code> parameter.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The document text to be analyzed. If you enter text using this parameter,
     * do not use the <code>Bytes</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The document text to be analyzed. If you enter text using this
     *            parameter, do not use the <code>Bytes</code> parameter.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The document text to be analyzed. If you enter text using this parameter,
     * do not use the <code>Bytes</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The document text to be analyzed. If you enter text using this
     *            parameter, do not use the <code>Bytes</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint. For information about
     * endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the endpoint. For information
     *         about endpoints, see <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     *         >Managing endpoints</a>.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint. For information about
     * endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Number (ARN) of the endpoint. For
     *            information about endpoints, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     *            >Managing endpoints</a>.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint. For information about
     * endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Number (ARN) of the endpoint. For
     *            information about endpoints, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     *            >Managing endpoints</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentRequest withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

    /**
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image
     * file. You can also use the <code>Bytes</code> parameter to input an
     * Amazon Textract <code>DetectDocumentText</code> or
     * <code>AnalyzeDocument</code> output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your
     * code uses an Amazon Web Services SDK to classify documents, the SDK may
     * encode the document file bytes for you.
     * </p>
     * <p>
     * The maximum length of this field depends on the input document type. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html">
     * Inputs for real-time custom analysis</a> in the Comprehend Developer
     * Guide.
     * </p>
     * <p>
     * If you use the <code>Bytes</code> parameter, do not use the
     * <code>Text</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Use the <code>Bytes</code> parameter to input a text, PDF, Word
     *         or image file. You can also use the <code>Bytes</code> parameter
     *         to input an Amazon Textract <code>DetectDocumentText</code> or
     *         <code>AnalyzeDocument</code> output file.
     *         </p>
     *         <p>
     *         Provide the input document as a sequence of base64-encoded bytes.
     *         If your code uses an Amazon Web Services SDK to classify
     *         documents, the SDK may encode the document file bytes for you.
     *         </p>
     *         <p>
     *         The maximum length of this field depends on the input document
     *         type. For details, see <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"
     *         > Inputs for real-time custom analysis</a> in the Comprehend
     *         Developer Guide.
     *         </p>
     *         <p>
     *         If you use the <code>Bytes</code> parameter, do not use the
     *         <code>Text</code> parameter.
     *         </p>
     */
    public java.nio.ByteBuffer getBytes() {
        return bytes;
    }

    /**
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image
     * file. You can also use the <code>Bytes</code> parameter to input an
     * Amazon Textract <code>DetectDocumentText</code> or
     * <code>AnalyzeDocument</code> output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your
     * code uses an Amazon Web Services SDK to classify documents, the SDK may
     * encode the document file bytes for you.
     * </p>
     * <p>
     * The maximum length of this field depends on the input document type. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html">
     * Inputs for real-time custom analysis</a> in the Comprehend Developer
     * Guide.
     * </p>
     * <p>
     * If you use the <code>Bytes</code> parameter, do not use the
     * <code>Text</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param bytes <p>
     *            Use the <code>Bytes</code> parameter to input a text, PDF,
     *            Word or image file. You can also use the <code>Bytes</code>
     *            parameter to input an Amazon Textract
     *            <code>DetectDocumentText</code> or
     *            <code>AnalyzeDocument</code> output file.
     *            </p>
     *            <p>
     *            Provide the input document as a sequence of base64-encoded
     *            bytes. If your code uses an Amazon Web Services SDK to
     *            classify documents, the SDK may encode the document file bytes
     *            for you.
     *            </p>
     *            <p>
     *            The maximum length of this field depends on the input document
     *            type. For details, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"
     *            > Inputs for real-time custom analysis</a> in the Comprehend
     *            Developer Guide.
     *            </p>
     *            <p>
     *            If you use the <code>Bytes</code> parameter, do not use the
     *            <code>Text</code> parameter.
     *            </p>
     */
    public void setBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image
     * file. You can also use the <code>Bytes</code> parameter to input an
     * Amazon Textract <code>DetectDocumentText</code> or
     * <code>AnalyzeDocument</code> output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your
     * code uses an Amazon Web Services SDK to classify documents, the SDK may
     * encode the document file bytes for you.
     * </p>
     * <p>
     * The maximum length of this field depends on the input document type. For
     * details, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html">
     * Inputs for real-time custom analysis</a> in the Comprehend Developer
     * Guide.
     * </p>
     * <p>
     * If you use the <code>Bytes</code> parameter, do not use the
     * <code>Text</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param bytes <p>
     *            Use the <code>Bytes</code> parameter to input a text, PDF,
     *            Word or image file. You can also use the <code>Bytes</code>
     *            parameter to input an Amazon Textract
     *            <code>DetectDocumentText</code> or
     *            <code>AnalyzeDocument</code> output file.
     *            </p>
     *            <p>
     *            Provide the input document as a sequence of base64-encoded
     *            bytes. If your code uses an Amazon Web Services SDK to
     *            classify documents, the SDK may encode the document file bytes
     *            for you.
     *            </p>
     *            <p>
     *            The maximum length of this field depends on the input document
     *            type. For details, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"
     *            > Inputs for real-time custom analysis</a> in the Comprehend
     *            Developer Guide.
     *            </p>
     *            <p>
     *            If you use the <code>Bytes</code> parameter, do not use the
     *            <code>Text</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentRequest withBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * <p>
     * Provides configuration parameters to override the default actions for
     * extracting text from PDF documents and image files.
     * </p>
     *
     * @return <p>
     *         Provides configuration parameters to override the default actions
     *         for extracting text from PDF documents and image files.
     *         </p>
     */
    public DocumentReaderConfig getDocumentReaderConfig() {
        return documentReaderConfig;
    }

    /**
     * <p>
     * Provides configuration parameters to override the default actions for
     * extracting text from PDF documents and image files.
     * </p>
     *
     * @param documentReaderConfig <p>
     *            Provides configuration parameters to override the default
     *            actions for extracting text from PDF documents and image
     *            files.
     *            </p>
     */
    public void setDocumentReaderConfig(DocumentReaderConfig documentReaderConfig) {
        this.documentReaderConfig = documentReaderConfig;
    }

    /**
     * <p>
     * Provides configuration parameters to override the default actions for
     * extracting text from PDF documents and image files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentReaderConfig <p>
     *            Provides configuration parameters to override the default
     *            actions for extracting text from PDF documents and image
     *            files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentRequest withDocumentReaderConfig(
            DocumentReaderConfig documentReaderConfig) {
        this.documentReaderConfig = documentReaderConfig;
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
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getBytes() != null)
            sb.append("Bytes: " + getBytes() + ",");
        if (getDocumentReaderConfig() != null)
            sb.append("DocumentReaderConfig: " + getDocumentReaderConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getBytes() == null) ? 0 : getBytes().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentReaderConfig() == null) ? 0 : getDocumentReaderConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassifyDocumentRequest == false)
            return false;
        ClassifyDocumentRequest other = (ClassifyDocumentRequest) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getBytes() == null ^ this.getBytes() == null)
            return false;
        if (other.getBytes() != null && other.getBytes().equals(this.getBytes()) == false)
            return false;
        if (other.getDocumentReaderConfig() == null ^ this.getDocumentReaderConfig() == null)
            return false;
        if (other.getDocumentReaderConfig() != null
                && other.getDocumentReaderConfig().equals(this.getDocumentReaderConfig()) == false)
            return false;
        return true;
    }
}
