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
 * Analyzes an input document for relationships between detected items.
 * </p>
 * <p>
 * The types of information returned are as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Form data (key-value pairs). The related information is returned in two
 * <a>Block</a> objects, each of type <code>KEY_VALUE_SET</code>: a KEY
 * <code>Block</code> object and a VALUE <code>Block</code> object. For example,
 * <i>Name: Ana Silva Carolina</i> contains a key and value. <i>Name:</i> is the
 * key. <i>Ana Silva Carolina</i> is the value.
 * </p>
 * </li>
 * <li>
 * <p>
 * Table and table cell data. A TABLE <code>Block</code> object contains
 * information about a detected table. A CELL <code>Block</code> object is
 * returned for each cell in a table.
 * </p>
 * </li>
 * <li>
 * <p>
 * Lines and words of text. A LINE <code>Block</code> object contains one or
 * more WORD <code>Block</code> objects. All lines and words that are detected
 * in the document are returned (including text that doesn't have a relationship
 * with the value of <code>FeatureTypes</code>).
 * </p>
 * </li>
 * </ul>
 * <p>
 * Selection elements such as check boxes and option buttons (radio buttons) can
 * be detected in form data and in tables. A SELECTION_ELEMENT
 * <code>Block</code> object contains information about a selection element,
 * including the selection status.
 * </p>
 * <p>
 * You can choose which type of analysis to perform by specifying the
 * <code>FeatureTypes</code> list.
 * </p>
 * <p>
 * The output is returned in a list of <code>Block</code> objects.
 * </p>
 * <p>
 * <code>AnalyzeDocument</code> is a synchronous operation. To analyze documents
 * asynchronously, use <a>StartDocumentAnalysis</a>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
 * >Document Text Analysis</a>.
 * </p>
 */
public class AnalyzeDocumentRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A list of the types of analysis to perform. Add TABLES to the list to
     * return information about the tables that are detected in the input
     * document. Add FORMS to return detected form data. To perform both types
     * of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All lines
     * and words detected in the document are included in the response
     * (including text that isn't related to the value of
     * <code>FeatureTypes</code>).
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * Sets the configuration for the human in the loop workflow for analyzing
     * documents.
     * </p>
     */
    private HumanLoopConfig humanLoopConfig;

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
    public AnalyzeDocumentRequest withDocument(Document document) {
        this.document = document;
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to
     * return information about the tables that are detected in the input
     * document. Add FORMS to return detected form data. To perform both types
     * of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All lines
     * and words detected in the document are included in the response
     * (including text that isn't related to the value of
     * <code>FeatureTypes</code>).
     * </p>
     *
     * @return <p>
     *         A list of the types of analysis to perform. Add TABLES to the
     *         list to return information about the tables that are detected in
     *         the input document. Add FORMS to return detected form data. To
     *         perform both types of analysis, add TABLES and FORMS to
     *         <code>FeatureTypes</code>. All lines and words detected in the
     *         document are included in the response (including text that isn't
     *         related to the value of <code>FeatureTypes</code>).
     *         </p>
     */
    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to
     * return information about the tables that are detected in the input
     * document. Add FORMS to return detected form data. To perform both types
     * of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All lines
     * and words detected in the document are included in the response
     * (including text that isn't related to the value of
     * <code>FeatureTypes</code>).
     * </p>
     *
     * @param featureTypes <p>
     *            A list of the types of analysis to perform. Add TABLES to the
     *            list to return information about the tables that are detected
     *            in the input document. Add FORMS to return detected form data.
     *            To perform both types of analysis, add TABLES and FORMS to
     *            <code>FeatureTypes</code>. All lines and words detected in the
     *            document are included in the response (including text that
     *            isn't related to the value of <code>FeatureTypes</code>).
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
     * document. Add FORMS to return detected form data. To perform both types
     * of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All lines
     * and words detected in the document are included in the response
     * (including text that isn't related to the value of
     * <code>FeatureTypes</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            A list of the types of analysis to perform. Add TABLES to the
     *            list to return information about the tables that are detected
     *            in the input document. Add FORMS to return detected form data.
     *            To perform both types of analysis, add TABLES and FORMS to
     *            <code>FeatureTypes</code>. All lines and words detected in the
     *            document are included in the response (including text that
     *            isn't related to the value of <code>FeatureTypes</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeDocumentRequest withFeatureTypes(String... featureTypes) {
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
     * document. Add FORMS to return detected form data. To perform both types
     * of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All lines
     * and words detected in the document are included in the response
     * (including text that isn't related to the value of
     * <code>FeatureTypes</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            A list of the types of analysis to perform. Add TABLES to the
     *            list to return information about the tables that are detected
     *            in the input document. Add FORMS to return detected form data.
     *            To perform both types of analysis, add TABLES and FORMS to
     *            <code>FeatureTypes</code>. All lines and words detected in the
     *            document are included in the response (including text that
     *            isn't related to the value of <code>FeatureTypes</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeDocumentRequest withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * Sets the configuration for the human in the loop workflow for analyzing
     * documents.
     * </p>
     *
     * @return <p>
     *         Sets the configuration for the human in the loop workflow for
     *         analyzing documents.
     *         </p>
     */
    public HumanLoopConfig getHumanLoopConfig() {
        return humanLoopConfig;
    }

    /**
     * <p>
     * Sets the configuration for the human in the loop workflow for analyzing
     * documents.
     * </p>
     *
     * @param humanLoopConfig <p>
     *            Sets the configuration for the human in the loop workflow for
     *            analyzing documents.
     *            </p>
     */
    public void setHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
    }

    /**
     * <p>
     * Sets the configuration for the human in the loop workflow for analyzing
     * documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopConfig <p>
     *            Sets the configuration for the human in the loop workflow for
     *            analyzing documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeDocumentRequest withHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
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
            sb.append("Document: " + getDocument() + ",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: " + getFeatureTypes() + ",");
        if (getHumanLoopConfig() != null)
            sb.append("HumanLoopConfig: " + getHumanLoopConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode
                + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopConfig() == null) ? 0 : getHumanLoopConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeDocumentRequest == false)
            return false;
        AnalyzeDocumentRequest other = (AnalyzeDocumentRequest) obj;

        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null
                && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        if (other.getHumanLoopConfig() == null ^ this.getHumanLoopConfig() == null)
            return false;
        if (other.getHumanLoopConfig() != null
                && other.getHumanLoopConfig().equals(this.getHumanLoopConfig()) == false)
            return false;
        return true;
    }
}
