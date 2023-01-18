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
 * Detects named entities in input text when you use the pre-trained model.
 * Detects custom entities if you have a custom entity recognition model.
 * </p>
 * <p>
 * When detecting named entities using the pre-trained model, use plain text as
 * the input. For more information about named entities, see <a
 * href="https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
 * >Entities</a> in the Comprehend Developer Guide.
 * </p>
 * <p>
 * When you use a custom entity recognition model, you can input plain text or
 * you can upload a single-page input document (text, PDF, Word, or image).
 * </p>
 * <p>
 * If the system detects errors while processing a page in the input document,
 * the API response includes an entry in <code>Errors</code> for each error.
 * </p>
 * <p>
 * If the system detects a document-level error in your input document, the API
 * returns an <code>InvalidRequestException</code> error response. For details
 * about this exception, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync-err.html">
 * Errors in semi-structured documents</a> in the Comprehend Developer Guide.
 * </p>
 */
public class DetectEntitiesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A UTF-8 text string. The maximum string size is 100 KB. If you enter text
     * using this parameter, do not use the <code>Bytes</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. If your request includes the
     * endpoint for a custom entity recognition model, Amazon Comprehend uses
     * the language of your custom model, and it ignores any language code that
     * you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     */
    private String languageCode;

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom
     * entity recognition model. Provide an endpoint if you want to detect
     * entities by using your own custom model instead of the default model that
     * is used by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your
     * custom model, and it ignores any language code that you provide in your
     * request.
     * </p>
     * <p>
     * For information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity
     * -recognizer-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointArn;

    /**
     * <p>
     * This field applies only when you use a custom entity recognition model
     * that was trained with PDF annotations. For other cases, enter your text
     * input in the <code>Text</code> field.
     * </p>
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image
     * file. Using a plain-text file in the <code>Bytes</code> parameter is
     * equivelent to using the <code>Text</code> parameter (the
     * <code>Entities</code> field in the response is identical).
     * </p>
     * <p>
     * You can also use the <code>Bytes</code> parameter to input an Amazon
     * Textract <code>DetectDocumentText</code> or <code>AnalyzeDocument</code>
     * output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your
     * code uses an Amazon Web Services SDK to detect entities, the SDK may
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
     * A UTF-8 text string. The maximum string size is 100 KB. If you enter text
     * using this parameter, do not use the <code>Bytes</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A UTF-8 text string. The maximum string size is 100 KB. If you
     *         enter text using this parameter, do not use the
     *         <code>Bytes</code> parameter.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * A UTF-8 text string. The maximum string size is 100 KB. If you enter text
     * using this parameter, do not use the <code>Bytes</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            A UTF-8 text string. The maximum string size is 100 KB. If you
     *            enter text using this parameter, do not use the
     *            <code>Bytes</code> parameter.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A UTF-8 text string. The maximum string size is 100 KB. If you enter text
     * using this parameter, do not use the <code>Bytes</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            A UTF-8 text string. The maximum string size is 100 KB. If you
     *            enter text using this parameter, do not use the
     *            <code>Bytes</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. If your request includes the
     * endpoint for a custom entity recognition model, Amazon Comprehend uses
     * the language of your custom model, and it ignores any language code that
     * you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @return <p>
     *         The language of the input documents. You can specify any of the
     *         primary languages supported by Amazon Comprehend. If your request
     *         includes the endpoint for a custom entity recognition model,
     *         Amazon Comprehend uses the language of your custom model, and it
     *         ignores any language code that you specify here.
     *         </p>
     *         <p>
     *         All input documents must be in the same language.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. If your request includes the
     * endpoint for a custom entity recognition model, Amazon Comprehend uses
     * the language of your custom model, and it ignores any language code that
     * you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. If your
     *            request includes the endpoint for a custom entity recognition
     *            model, Amazon Comprehend uses the language of your custom
     *            model, and it ignores any language code that you specify here.
     *            </p>
     *            <p>
     *            All input documents must be in the same language.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. If your request includes the
     * endpoint for a custom entity recognition model, Amazon Comprehend uses
     * the language of your custom model, and it ignores any language code that
     * you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. If your
     *            request includes the endpoint for a custom entity recognition
     *            model, Amazon Comprehend uses the language of your custom
     *            model, and it ignores any language code that you specify here.
     *            </p>
     *            <p>
     *            All input documents must be in the same language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DetectEntitiesRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. If your request includes the
     * endpoint for a custom entity recognition model, Amazon Comprehend uses
     * the language of your custom model, and it ignores any language code that
     * you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. If your
     *            request includes the endpoint for a custom entity recognition
     *            model, Amazon Comprehend uses the language of your custom
     *            model, and it ignores any language code that you specify here.
     *            </p>
     *            <p>
     *            All input documents must be in the same language.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. If your request includes the
     * endpoint for a custom entity recognition model, Amazon Comprehend uses
     * the language of your custom model, and it ignores any language code that
     * you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. If your
     *            request includes the endpoint for a custom entity recognition
     *            model, Amazon Comprehend uses the language of your custom
     *            model, and it ignores any language code that you specify here.
     *            </p>
     *            <p>
     *            All input documents must be in the same language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DetectEntitiesRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom
     * entity recognition model. Provide an endpoint if you want to detect
     * entities by using your own custom model instead of the default model that
     * is used by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your
     * custom model, and it ignores any language code that you provide in your
     * request.
     * </p>
     * <p>
     * For information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity
     * -recognizer-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name of an endpoint that is associated with a
     *         custom entity recognition model. Provide an endpoint if you want
     *         to detect entities by using your own custom model instead of the
     *         default model that is used by Amazon Comprehend.
     *         </p>
     *         <p>
     *         If you specify an endpoint, Amazon Comprehend uses the language
     *         of your custom model, and it ignores any language code that you
     *         provide in your request.
     *         </p>
     *         <p>
     *         For information about endpoints, see <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     *         >Managing endpoints</a>.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom
     * entity recognition model. Provide an endpoint if you want to detect
     * entities by using your own custom model instead of the default model that
     * is used by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your
     * custom model, and it ignores any language code that you provide in your
     * request.
     * </p>
     * <p>
     * For information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity
     * -recognizer-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name of an endpoint that is associated
     *            with a custom entity recognition model. Provide an endpoint if
     *            you want to detect entities by using your own custom model
     *            instead of the default model that is used by Amazon
     *            Comprehend.
     *            </p>
     *            <p>
     *            If you specify an endpoint, Amazon Comprehend uses the
     *            language of your custom model, and it ignores any language
     *            code that you provide in your request.
     *            </p>
     *            <p>
     *            For information about endpoints, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     *            >Managing endpoints</a>.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom
     * entity recognition model. Provide an endpoint if you want to detect
     * entities by using your own custom model instead of the default model that
     * is used by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your
     * custom model, and it ignores any language code that you provide in your
     * request.
     * </p>
     * <p>
     * For information about endpoints, see <a href=
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
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity
     * -recognizer-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name of an endpoint that is associated
     *            with a custom entity recognition model. Provide an endpoint if
     *            you want to detect entities by using your own custom model
     *            instead of the default model that is used by Amazon
     *            Comprehend.
     *            </p>
     *            <p>
     *            If you specify an endpoint, Amazon Comprehend uses the
     *            language of your custom model, and it ignores any language
     *            code that you provide in your request.
     *            </p>
     *            <p>
     *            For information about endpoints, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     *            >Managing endpoints</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesRequest withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

    /**
     * <p>
     * This field applies only when you use a custom entity recognition model
     * that was trained with PDF annotations. For other cases, enter your text
     * input in the <code>Text</code> field.
     * </p>
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image
     * file. Using a plain-text file in the <code>Bytes</code> parameter is
     * equivelent to using the <code>Text</code> parameter (the
     * <code>Entities</code> field in the response is identical).
     * </p>
     * <p>
     * You can also use the <code>Bytes</code> parameter to input an Amazon
     * Textract <code>DetectDocumentText</code> or <code>AnalyzeDocument</code>
     * output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your
     * code uses an Amazon Web Services SDK to detect entities, the SDK may
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
     *         This field applies only when you use a custom entity recognition
     *         model that was trained with PDF annotations. For other cases,
     *         enter your text input in the <code>Text</code> field.
     *         </p>
     *         <p>
     *         Use the <code>Bytes</code> parameter to input a text, PDF, Word
     *         or image file. Using a plain-text file in the <code>Bytes</code>
     *         parameter is equivelent to using the <code>Text</code> parameter
     *         (the <code>Entities</code> field in the response is identical).
     *         </p>
     *         <p>
     *         You can also use the <code>Bytes</code> parameter to input an
     *         Amazon Textract <code>DetectDocumentText</code> or
     *         <code>AnalyzeDocument</code> output file.
     *         </p>
     *         <p>
     *         Provide the input document as a sequence of base64-encoded bytes.
     *         If your code uses an Amazon Web Services SDK to detect entities,
     *         the SDK may encode the document file bytes for you.
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
     * This field applies only when you use a custom entity recognition model
     * that was trained with PDF annotations. For other cases, enter your text
     * input in the <code>Text</code> field.
     * </p>
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image
     * file. Using a plain-text file in the <code>Bytes</code> parameter is
     * equivelent to using the <code>Text</code> parameter (the
     * <code>Entities</code> field in the response is identical).
     * </p>
     * <p>
     * You can also use the <code>Bytes</code> parameter to input an Amazon
     * Textract <code>DetectDocumentText</code> or <code>AnalyzeDocument</code>
     * output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your
     * code uses an Amazon Web Services SDK to detect entities, the SDK may
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
     *            This field applies only when you use a custom entity
     *            recognition model that was trained with PDF annotations. For
     *            other cases, enter your text input in the <code>Text</code>
     *            field.
     *            </p>
     *            <p>
     *            Use the <code>Bytes</code> parameter to input a text, PDF,
     *            Word or image file. Using a plain-text file in the
     *            <code>Bytes</code> parameter is equivelent to using the
     *            <code>Text</code> parameter (the <code>Entities</code> field
     *            in the response is identical).
     *            </p>
     *            <p>
     *            You can also use the <code>Bytes</code> parameter to input an
     *            Amazon Textract <code>DetectDocumentText</code> or
     *            <code>AnalyzeDocument</code> output file.
     *            </p>
     *            <p>
     *            Provide the input document as a sequence of base64-encoded
     *            bytes. If your code uses an Amazon Web Services SDK to detect
     *            entities, the SDK may encode the document file bytes for you.
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
     * This field applies only when you use a custom entity recognition model
     * that was trained with PDF annotations. For other cases, enter your text
     * input in the <code>Text</code> field.
     * </p>
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image
     * file. Using a plain-text file in the <code>Bytes</code> parameter is
     * equivelent to using the <code>Text</code> parameter (the
     * <code>Entities</code> field in the response is identical).
     * </p>
     * <p>
     * You can also use the <code>Bytes</code> parameter to input an Amazon
     * Textract <code>DetectDocumentText</code> or <code>AnalyzeDocument</code>
     * output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your
     * code uses an Amazon Web Services SDK to detect entities, the SDK may
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
     *            This field applies only when you use a custom entity
     *            recognition model that was trained with PDF annotations. For
     *            other cases, enter your text input in the <code>Text</code>
     *            field.
     *            </p>
     *            <p>
     *            Use the <code>Bytes</code> parameter to input a text, PDF,
     *            Word or image file. Using a plain-text file in the
     *            <code>Bytes</code> parameter is equivelent to using the
     *            <code>Text</code> parameter (the <code>Entities</code> field
     *            in the response is identical).
     *            </p>
     *            <p>
     *            You can also use the <code>Bytes</code> parameter to input an
     *            Amazon Textract <code>DetectDocumentText</code> or
     *            <code>AnalyzeDocument</code> output file.
     *            </p>
     *            <p>
     *            Provide the input document as a sequence of base64-encoded
     *            bytes. If your code uses an Amazon Web Services SDK to detect
     *            entities, the SDK may encode the document file bytes for you.
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
    public DetectEntitiesRequest withBytes(java.nio.ByteBuffer bytes) {
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
    public DetectEntitiesRequest withDocumentReaderConfig(DocumentReaderConfig documentReaderConfig) {
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
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
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
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

        if (obj instanceof DetectEntitiesRequest == false)
            return false;
        DetectEntitiesRequest other = (DetectEntitiesRequest) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
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
