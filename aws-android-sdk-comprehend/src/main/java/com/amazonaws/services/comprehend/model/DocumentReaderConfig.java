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

/**
 * <p>
 * Provides configuration parameters to override the default actions for
 * extracting text from PDF documents and image files.
 * </p>
 * <p>
 * By default, Amazon Comprehend performs the following actions to extract text
 * from files, based on the input file type:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Word files</b> - Amazon Comprehend parser extracts the text.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Digital PDF files</b> - Amazon Comprehend parser extracts the text.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Image files and scanned PDF files</b> - Amazon Comprehend uses the Amazon
 * Textract <code>DetectDocumentText</code> API to extract the text.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <code>DocumentReaderConfig</code> does not apply to plain text files or Word
 * files.
 * </p>
 * <p>
 * For image files and PDF documents, you can override these default actions
 * using the fields listed below. For more information, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-set-textract-options.html"
 * > Setting text extraction options</a> in the Comprehend Developer Guide.
 * </p>
 */
public class DocumentReaderConfig implements Serializable {
    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon
     * Comprehend uses to extract text from PDF files and image files. Enter one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend
     * service uses the <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service
     * uses the <code>AnalyzeDocument</code> API operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_DETECT_DOCUMENT_TEXT,
     * TEXTRACT_ANALYZE_DOCUMENT
     */
    private String documentReadAction;

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults
     * for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the
     * Textract API specified by DocumentReadAction for all PDF files, including
     * digital PDF files.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_DEFAULT, FORCE_DOCUMENT_READ_ACTION
     */
    private String documentReadMode;

    /**
     * <p>
     * Specifies the type of Amazon Textract features to apply. If you chose
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must
     * specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are
     * detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that
     * are detected in the input document.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon
     * Comprehend uses to extract text from PDF files and image files. Enter one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend
     * service uses the <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service
     * uses the <code>AnalyzeDocument</code> API operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_DETECT_DOCUMENT_TEXT,
     * TEXTRACT_ANALYZE_DOCUMENT
     *
     * @return <p>
     *         This field defines the Amazon Textract API operation that Amazon
     *         Comprehend uses to extract text from PDF files and image files.
     *         Enter one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon
     *         Comprehend service uses the <code>DetectDocumentText</code> API
     *         operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend
     *         service uses the <code>AnalyzeDocument</code> API operation.
     *         </p>
     *         </li>
     *         </ul>
     * @see DocumentReadAction
     */
    public String getDocumentReadAction() {
        return documentReadAction;
    }

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon
     * Comprehend uses to extract text from PDF files and image files. Enter one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend
     * service uses the <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service
     * uses the <code>AnalyzeDocument</code> API operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_DETECT_DOCUMENT_TEXT,
     * TEXTRACT_ANALYZE_DOCUMENT
     *
     * @param documentReadAction <p>
     *            This field defines the Amazon Textract API operation that
     *            Amazon Comprehend uses to extract text from PDF files and
     *            image files. Enter one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon
     *            Comprehend service uses the <code>DetectDocumentText</code>
     *            API operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend
     *            service uses the <code>AnalyzeDocument</code> API operation.
     *            </p>
     *            </li>
     *            </ul>
     * @see DocumentReadAction
     */
    public void setDocumentReadAction(String documentReadAction) {
        this.documentReadAction = documentReadAction;
    }

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon
     * Comprehend uses to extract text from PDF files and image files. Enter one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend
     * service uses the <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service
     * uses the <code>AnalyzeDocument</code> API operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_DETECT_DOCUMENT_TEXT,
     * TEXTRACT_ANALYZE_DOCUMENT
     *
     * @param documentReadAction <p>
     *            This field defines the Amazon Textract API operation that
     *            Amazon Comprehend uses to extract text from PDF files and
     *            image files. Enter one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon
     *            Comprehend service uses the <code>DetectDocumentText</code>
     *            API operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend
     *            service uses the <code>AnalyzeDocument</code> API operation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentReadAction
     */
    public DocumentReaderConfig withDocumentReadAction(String documentReadAction) {
        this.documentReadAction = documentReadAction;
        return this;
    }

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon
     * Comprehend uses to extract text from PDF files and image files. Enter one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend
     * service uses the <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service
     * uses the <code>AnalyzeDocument</code> API operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_DETECT_DOCUMENT_TEXT,
     * TEXTRACT_ANALYZE_DOCUMENT
     *
     * @param documentReadAction <p>
     *            This field defines the Amazon Textract API operation that
     *            Amazon Comprehend uses to extract text from PDF files and
     *            image files. Enter one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon
     *            Comprehend service uses the <code>DetectDocumentText</code>
     *            API operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend
     *            service uses the <code>AnalyzeDocument</code> API operation.
     *            </p>
     *            </li>
     *            </ul>
     * @see DocumentReadAction
     */
    public void setDocumentReadAction(DocumentReadAction documentReadAction) {
        this.documentReadAction = documentReadAction.toString();
    }

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon
     * Comprehend uses to extract text from PDF files and image files. Enter one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend
     * service uses the <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service
     * uses the <code>AnalyzeDocument</code> API operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXTRACT_DETECT_DOCUMENT_TEXT,
     * TEXTRACT_ANALYZE_DOCUMENT
     *
     * @param documentReadAction <p>
     *            This field defines the Amazon Textract API operation that
     *            Amazon Comprehend uses to extract text from PDF files and
     *            image files. Enter one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon
     *            Comprehend service uses the <code>DetectDocumentText</code>
     *            API operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend
     *            service uses the <code>AnalyzeDocument</code> API operation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentReadAction
     */
    public DocumentReaderConfig withDocumentReadAction(DocumentReadAction documentReadAction) {
        this.documentReadAction = documentReadAction.toString();
        return this;
    }

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults
     * for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the
     * Textract API specified by DocumentReadAction for all PDF files, including
     * digital PDF files.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_DEFAULT, FORCE_DOCUMENT_READ_ACTION
     *
     * @return <p>
     *         Determines the text extraction actions for PDF files. Enter one
     *         of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service
     *         defaults for PDF files.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses
     *         the Textract API specified by DocumentReadAction for all PDF
     *         files, including digital PDF files.
     *         </p>
     *         </li>
     *         </ul>
     * @see DocumentReadMode
     */
    public String getDocumentReadMode() {
        return documentReadMode;
    }

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults
     * for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the
     * Textract API specified by DocumentReadAction for all PDF files, including
     * digital PDF files.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_DEFAULT, FORCE_DOCUMENT_READ_ACTION
     *
     * @param documentReadMode <p>
     *            Determines the text extraction actions for PDF files. Enter
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend
     *            service defaults for PDF files.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend
     *            uses the Textract API specified by DocumentReadAction for all
     *            PDF files, including digital PDF files.
     *            </p>
     *            </li>
     *            </ul>
     * @see DocumentReadMode
     */
    public void setDocumentReadMode(String documentReadMode) {
        this.documentReadMode = documentReadMode;
    }

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults
     * for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the
     * Textract API specified by DocumentReadAction for all PDF files, including
     * digital PDF files.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_DEFAULT, FORCE_DOCUMENT_READ_ACTION
     *
     * @param documentReadMode <p>
     *            Determines the text extraction actions for PDF files. Enter
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend
     *            service defaults for PDF files.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend
     *            uses the Textract API specified by DocumentReadAction for all
     *            PDF files, including digital PDF files.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentReadMode
     */
    public DocumentReaderConfig withDocumentReadMode(String documentReadMode) {
        this.documentReadMode = documentReadMode;
        return this;
    }

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults
     * for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the
     * Textract API specified by DocumentReadAction for all PDF files, including
     * digital PDF files.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_DEFAULT, FORCE_DOCUMENT_READ_ACTION
     *
     * @param documentReadMode <p>
     *            Determines the text extraction actions for PDF files. Enter
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend
     *            service defaults for PDF files.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend
     *            uses the Textract API specified by DocumentReadAction for all
     *            PDF files, including digital PDF files.
     *            </p>
     *            </li>
     *            </ul>
     * @see DocumentReadMode
     */
    public void setDocumentReadMode(DocumentReadMode documentReadMode) {
        this.documentReadMode = documentReadMode.toString();
    }

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults
     * for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the
     * Textract API specified by DocumentReadAction for all PDF files, including
     * digital PDF files.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_DEFAULT, FORCE_DOCUMENT_READ_ACTION
     *
     * @param documentReadMode <p>
     *            Determines the text extraction actions for PDF files. Enter
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend
     *            service defaults for PDF files.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend
     *            uses the Textract API specified by DocumentReadAction for all
     *            PDF files, including digital PDF files.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentReadMode
     */
    public DocumentReaderConfig withDocumentReadMode(DocumentReadMode documentReadMode) {
        this.documentReadMode = documentReadMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of Amazon Textract features to apply. If you chose
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must
     * specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are
     * detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that
     * are detected in the input document.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies the type of Amazon Textract features to apply. If you
     *         chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action,
     *         you must specify one or both of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TABLES</code> - Returns information about any tables that
     *         are detected in the input document.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FORMS</code> - Returns information and the data from any
     *         forms that are detected in the input document.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * Specifies the type of Amazon Textract features to apply. If you chose
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must
     * specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are
     * detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that
     * are detected in the input document.
     * </p>
     * </li>
     * </ul>
     *
     * @param featureTypes <p>
     *            Specifies the type of Amazon Textract features to apply. If
     *            you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read
     *            action, you must specify one or both of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TABLES</code> - Returns information about any tables
     *            that are detected in the input document.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FORMS</code> - Returns information and the data from any
     *            forms that are detected in the input document.
     *            </p>
     *            </li>
     *            </ul>
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
     * Specifies the type of Amazon Textract features to apply. If you chose
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must
     * specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are
     * detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that
     * are detected in the input document.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            Specifies the type of Amazon Textract features to apply. If
     *            you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read
     *            action, you must specify one or both of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TABLES</code> - Returns information about any tables
     *            that are detected in the input document.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FORMS</code> - Returns information and the data from any
     *            forms that are detected in the input document.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentReaderConfig withFeatureTypes(String... featureTypes) {
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
     * Specifies the type of Amazon Textract features to apply. If you chose
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must
     * specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are
     * detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that
     * are detected in the input document.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTypes <p>
     *            Specifies the type of Amazon Textract features to apply. If
     *            you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read
     *            action, you must specify one or both of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TABLES</code> - Returns information about any tables
     *            that are detected in the input document.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FORMS</code> - Returns information and the data from any
     *            forms that are detected in the input document.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentReaderConfig withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
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
        if (getDocumentReadAction() != null)
            sb.append("DocumentReadAction: " + getDocumentReadAction() + ",");
        if (getDocumentReadMode() != null)
            sb.append("DocumentReadMode: " + getDocumentReadMode() + ",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: " + getFeatureTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentReadAction() == null) ? 0 : getDocumentReadAction().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentReadMode() == null) ? 0 : getDocumentReadMode().hashCode());
        hashCode = prime * hashCode
                + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentReaderConfig == false)
            return false;
        DocumentReaderConfig other = (DocumentReaderConfig) obj;

        if (other.getDocumentReadAction() == null ^ this.getDocumentReadAction() == null)
            return false;
        if (other.getDocumentReadAction() != null
                && other.getDocumentReadAction().equals(this.getDocumentReadAction()) == false)
            return false;
        if (other.getDocumentReadMode() == null ^ this.getDocumentReadMode() == null)
            return false;
        if (other.getDocumentReadMode() != null
                && other.getDocumentReadMode().equals(this.getDocumentReadMode()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null
                && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        return true;
    }
}
