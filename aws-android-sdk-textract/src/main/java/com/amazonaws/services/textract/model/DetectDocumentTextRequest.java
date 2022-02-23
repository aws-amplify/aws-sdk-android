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
 * Detects text in the input document. Amazon Textract can detect lines of text
 * and the words that make up a line of text. The input document must be an
 * image in JPEG or PNG format. <code>DetectDocumentText</code> returns the
 * detected text in an array of <a>Block</a> objects.
 * </p>
 * <p>
 * Each document page has as an associated <code>Block</code> of type PAGE. Each
 * PAGE <code>Block</code> object is the parent of LINE <code>Block</code>
 * objects that represent the lines of detected text on a page. A LINE
 * <code>Block</code> object is a parent for each word that makes up the line.
 * Words are represented by <code>Block</code> objects of type WORD.
 * </p>
 * <p>
 * <code>DetectDocumentText</code> is a synchronous operation. To analyze
 * documents asynchronously, use <a>StartDocumentTextDetection</a>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
 * >Document Text Detection</a>.
 * </p>
 */
public class DetectDocumentTextRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The input document as base64-encoded bytes or an Amazon S3 object. If you
     * use the AWS CLI to call Amazon Textract operations, you can't pass image
     * bytes. The document must be an image in JPEG or PNG format.
     * </p>
     * <p>
     * If you're using an AWS SDK to call Amazon Textract, you might not need to
     * base64-encode image bytes that are passed using the <code>Bytes</code>
     * field.
     * </p>
     */
    private Document document;

    /**
     * <p>
     * The input document as base64-encoded bytes or an Amazon S3 object. If you
     * use the AWS CLI to call Amazon Textract operations, you can't pass image
     * bytes. The document must be an image in JPEG or PNG format.
     * </p>
     * <p>
     * If you're using an AWS SDK to call Amazon Textract, you might not need to
     * base64-encode image bytes that are passed using the <code>Bytes</code>
     * field.
     * </p>
     *
     * @return <p>
     *         The input document as base64-encoded bytes or an Amazon S3
     *         object. If you use the AWS CLI to call Amazon Textract
     *         operations, you can't pass image bytes. The document must be an
     *         image in JPEG or PNG format.
     *         </p>
     *         <p>
     *         If you're using an AWS SDK to call Amazon Textract, you might not
     *         need to base64-encode image bytes that are passed using the
     *         <code>Bytes</code> field.
     *         </p>
     */
    public Document getDocument() {
        return document;
    }

    /**
     * <p>
     * The input document as base64-encoded bytes or an Amazon S3 object. If you
     * use the AWS CLI to call Amazon Textract operations, you can't pass image
     * bytes. The document must be an image in JPEG or PNG format.
     * </p>
     * <p>
     * If you're using an AWS SDK to call Amazon Textract, you might not need to
     * base64-encode image bytes that are passed using the <code>Bytes</code>
     * field.
     * </p>
     *
     * @param document <p>
     *            The input document as base64-encoded bytes or an Amazon S3
     *            object. If you use the AWS CLI to call Amazon Textract
     *            operations, you can't pass image bytes. The document must be
     *            an image in JPEG or PNG format.
     *            </p>
     *            <p>
     *            If you're using an AWS SDK to call Amazon Textract, you might
     *            not need to base64-encode image bytes that are passed using
     *            the <code>Bytes</code> field.
     *            </p>
     */
    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * <p>
     * The input document as base64-encoded bytes or an Amazon S3 object. If you
     * use the AWS CLI to call Amazon Textract operations, you can't pass image
     * bytes. The document must be an image in JPEG or PNG format.
     * </p>
     * <p>
     * If you're using an AWS SDK to call Amazon Textract, you might not need to
     * base64-encode image bytes that are passed using the <code>Bytes</code>
     * field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param document <p>
     *            The input document as base64-encoded bytes or an Amazon S3
     *            object. If you use the AWS CLI to call Amazon Textract
     *            operations, you can't pass image bytes. The document must be
     *            an image in JPEG or PNG format.
     *            </p>
     *            <p>
     *            If you're using an AWS SDK to call Amazon Textract, you might
     *            not need to base64-encode image bytes that are passed using
     *            the <code>Bytes</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectDocumentTextRequest withDocument(Document document) {
        this.document = document;
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
        if (getDocument() != null)
            sb.append("Document: " + getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectDocumentTextRequest == false)
            return false;
        DetectDocumentTextRequest other = (DetectDocumentTextRequest) obj;

        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }
}
