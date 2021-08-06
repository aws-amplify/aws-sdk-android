/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Analyzes an input document for financially related relationships between
 * text.
 * </p>
 * <p>
 * Information is returned as <code>ExpenseDocuments</code> and seperated as
 * follows.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>LineItemGroups</code>- A data set containing <code>LineItems</code>
 * which store information about the lines of text, such as an item purchased
 * and its price on a receipt.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SummaryFields</code>- Contains all other information a receipt, such as
 * header information or the vendors name.
 * </p>
 * </li>
 * </ul>
 */
public class AnalyzeExpenseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The input document, either as bytes or as an S3 object.
     * </p>
     * <p>
     * You pass image bytes to an Amazon Textract API operation by using the
     * <code>Bytes</code> property. For example, you would use the
     * <code>Bytes</code> property to pass a document loaded from a local file
     * system. Image bytes passed by using the <code>Bytes</code> property must
     * be base64 encoded. Your code might not need to encode document file bytes
     * if you're using an AWS SDK to call Amazon Textract API operations.
     * </p>
     * <p>
     * You pass images stored in an S3 bucket to an Amazon Textract API
     * operation by using the <code>S3Object</code> property. Documents stored
     * in an S3 bucket don't need to be base64 encoded.
     * </p>
     * <p>
     * The AWS Region for the S3 bucket that contains the S3 object must match
     * the AWS Region that you use for Amazon Textract operations.
     * </p>
     * <p>
     * If you use the AWS CLI to call Amazon Textract operations, passing image
     * bytes using the Bytes property isn't supported. You must first upload the
     * document to an Amazon S3 bucket, and then call the operation using the
     * S3Object property.
     * </p>
     * <p>
     * For Amazon Textract to process an S3 object, the user must have
     * permission to access the S3 object.
     * </p>
     */
    private Document document;

    /**
     * <p>
     * The input document, either as bytes or as an S3 object.
     * </p>
     * <p>
     * You pass image bytes to an Amazon Textract API operation by using the
     * <code>Bytes</code> property. For example, you would use the
     * <code>Bytes</code> property to pass a document loaded from a local file
     * system. Image bytes passed by using the <code>Bytes</code> property must
     * be base64 encoded. Your code might not need to encode document file bytes
     * if you're using an AWS SDK to call Amazon Textract API operations.
     * </p>
     * <p>
     * You pass images stored in an S3 bucket to an Amazon Textract API
     * operation by using the <code>S3Object</code> property. Documents stored
     * in an S3 bucket don't need to be base64 encoded.
     * </p>
     * <p>
     * The AWS Region for the S3 bucket that contains the S3 object must match
     * the AWS Region that you use for Amazon Textract operations.
     * </p>
     * <p>
     * If you use the AWS CLI to call Amazon Textract operations, passing image
     * bytes using the Bytes property isn't supported. You must first upload the
     * document to an Amazon S3 bucket, and then call the operation using the
     * S3Object property.
     * </p>
     * <p>
     * For Amazon Textract to process an S3 object, the user must have
     * permission to access the S3 object.
     * </p>
     *
     * @return <p>
     *         The input document, either as bytes or as an S3 object.
     *         </p>
     *         <p>
     *         You pass image bytes to an Amazon Textract API operation by using
     *         the <code>Bytes</code> property. For example, you would use the
     *         <code>Bytes</code> property to pass a document loaded from a
     *         local file system. Image bytes passed by using the
     *         <code>Bytes</code> property must be base64 encoded. Your code
     *         might not need to encode document file bytes if you're using an
     *         AWS SDK to call Amazon Textract API operations.
     *         </p>
     *         <p>
     *         You pass images stored in an S3 bucket to an Amazon Textract API
     *         operation by using the <code>S3Object</code> property. Documents
     *         stored in an S3 bucket don't need to be base64 encoded.
     *         </p>
     *         <p>
     *         The AWS Region for the S3 bucket that contains the S3 object must
     *         match the AWS Region that you use for Amazon Textract operations.
     *         </p>
     *         <p>
     *         If you use the AWS CLI to call Amazon Textract operations,
     *         passing image bytes using the Bytes property isn't supported. You
     *         must first upload the document to an Amazon S3 bucket, and then
     *         call the operation using the S3Object property.
     *         </p>
     *         <p>
     *         For Amazon Textract to process an S3 object, the user must have
     *         permission to access the S3 object.
     *         </p>
     */
    public Document getDocument() {
        return document;
    }

    /**
     * <p>
     * The input document, either as bytes or as an S3 object.
     * </p>
     * <p>
     * You pass image bytes to an Amazon Textract API operation by using the
     * <code>Bytes</code> property. For example, you would use the
     * <code>Bytes</code> property to pass a document loaded from a local file
     * system. Image bytes passed by using the <code>Bytes</code> property must
     * be base64 encoded. Your code might not need to encode document file bytes
     * if you're using an AWS SDK to call Amazon Textract API operations.
     * </p>
     * <p>
     * You pass images stored in an S3 bucket to an Amazon Textract API
     * operation by using the <code>S3Object</code> property. Documents stored
     * in an S3 bucket don't need to be base64 encoded.
     * </p>
     * <p>
     * The AWS Region for the S3 bucket that contains the S3 object must match
     * the AWS Region that you use for Amazon Textract operations.
     * </p>
     * <p>
     * If you use the AWS CLI to call Amazon Textract operations, passing image
     * bytes using the Bytes property isn't supported. You must first upload the
     * document to an Amazon S3 bucket, and then call the operation using the
     * S3Object property.
     * </p>
     * <p>
     * For Amazon Textract to process an S3 object, the user must have
     * permission to access the S3 object.
     * </p>
     *
     * @param document <p>
     *            The input document, either as bytes or as an S3 object.
     *            </p>
     *            <p>
     *            You pass image bytes to an Amazon Textract API operation by
     *            using the <code>Bytes</code> property. For example, you would
     *            use the <code>Bytes</code> property to pass a document loaded
     *            from a local file system. Image bytes passed by using the
     *            <code>Bytes</code> property must be base64 encoded. Your code
     *            might not need to encode document file bytes if you're using
     *            an AWS SDK to call Amazon Textract API operations.
     *            </p>
     *            <p>
     *            You pass images stored in an S3 bucket to an Amazon Textract
     *            API operation by using the <code>S3Object</code> property.
     *            Documents stored in an S3 bucket don't need to be base64
     *            encoded.
     *            </p>
     *            <p>
     *            The AWS Region for the S3 bucket that contains the S3 object
     *            must match the AWS Region that you use for Amazon Textract
     *            operations.
     *            </p>
     *            <p>
     *            If you use the AWS CLI to call Amazon Textract operations,
     *            passing image bytes using the Bytes property isn't supported.
     *            You must first upload the document to an Amazon S3 bucket, and
     *            then call the operation using the S3Object property.
     *            </p>
     *            <p>
     *            For Amazon Textract to process an S3 object, the user must
     *            have permission to access the S3 object.
     *            </p>
     */
    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * <p>
     * The input document, either as bytes or as an S3 object.
     * </p>
     * <p>
     * You pass image bytes to an Amazon Textract API operation by using the
     * <code>Bytes</code> property. For example, you would use the
     * <code>Bytes</code> property to pass a document loaded from a local file
     * system. Image bytes passed by using the <code>Bytes</code> property must
     * be base64 encoded. Your code might not need to encode document file bytes
     * if you're using an AWS SDK to call Amazon Textract API operations.
     * </p>
     * <p>
     * You pass images stored in an S3 bucket to an Amazon Textract API
     * operation by using the <code>S3Object</code> property. Documents stored
     * in an S3 bucket don't need to be base64 encoded.
     * </p>
     * <p>
     * The AWS Region for the S3 bucket that contains the S3 object must match
     * the AWS Region that you use for Amazon Textract operations.
     * </p>
     * <p>
     * If you use the AWS CLI to call Amazon Textract operations, passing image
     * bytes using the Bytes property isn't supported. You must first upload the
     * document to an Amazon S3 bucket, and then call the operation using the
     * S3Object property.
     * </p>
     * <p>
     * For Amazon Textract to process an S3 object, the user must have
     * permission to access the S3 object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param document <p>
     *            The input document, either as bytes or as an S3 object.
     *            </p>
     *            <p>
     *            You pass image bytes to an Amazon Textract API operation by
     *            using the <code>Bytes</code> property. For example, you would
     *            use the <code>Bytes</code> property to pass a document loaded
     *            from a local file system. Image bytes passed by using the
     *            <code>Bytes</code> property must be base64 encoded. Your code
     *            might not need to encode document file bytes if you're using
     *            an AWS SDK to call Amazon Textract API operations.
     *            </p>
     *            <p>
     *            You pass images stored in an S3 bucket to an Amazon Textract
     *            API operation by using the <code>S3Object</code> property.
     *            Documents stored in an S3 bucket don't need to be base64
     *            encoded.
     *            </p>
     *            <p>
     *            The AWS Region for the S3 bucket that contains the S3 object
     *            must match the AWS Region that you use for Amazon Textract
     *            operations.
     *            </p>
     *            <p>
     *            If you use the AWS CLI to call Amazon Textract operations,
     *            passing image bytes using the Bytes property isn't supported.
     *            You must first upload the document to an Amazon S3 bucket, and
     *            then call the operation using the S3Object property.
     *            </p>
     *            <p>
     *            For Amazon Textract to process an S3 object, the user must
     *            have permission to access the S3 object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeExpenseRequest withDocument(Document document) {
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

        if (obj instanceof AnalyzeExpenseRequest == false)
            return false;
        AnalyzeExpenseRequest other = (AnalyzeExpenseRequest) obj;

        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }
}
