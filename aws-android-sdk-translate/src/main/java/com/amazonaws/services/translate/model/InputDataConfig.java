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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The input configuration properties for requesting a batch translation job.
 * </p>
 */
public class InputDataConfig implements Serializable {
    /**
     * <p>
     * The URI of the AWS S3 folder that contains the input file. The folder
     * must be in the same Region as the API endpoint you are calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * Describes the format of the data that you submit to Amazon Translate as
     * input. You can specify one of the following multipurpose internet mail
     * extension (MIME) types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/html</code>: The input data consists of one or more HTML
     * files. Amazon Translate translates only the text that resides in the
     * <code>html</code> element in each file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain</code>: The input data consists of one or more
     * unformatted text files. Amazon Translate translates every character in
     * this type of input.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>
     * : The input data consists of one or more Word documents (.docx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.presentationml.presentation</code>
     * : The input data consists of one or more PowerPoint Presentation files
     * (.pptx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>
     * : The input data consists of one or more Excel Workbook files (.xlsx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/x-xliff+xml</code>: The input data consists of one or
     * more XML Localization Interchange File Format (XLIFF) files (.xlf).
     * Amazon Translate supports only XLIFF version 1.2.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you structure your input data as HTML, ensure that you set this
     * parameter to <code>text/html</code>. By doing so, you cut costs by
     * limiting the translation to the contents of the <code>html</code> element
     * in each file. Otherwise, if you set this parameter to
     * <code>text/plain</code>, your costs will cover the translation of every
     * character.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     */
    private String contentType;

    /**
     * <p>
     * The URI of the AWS S3 folder that contains the input file. The folder
     * must be in the same Region as the API endpoint you are calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The URI of the AWS S3 folder that contains the input file. The
     *         folder must be in the same Region as the API endpoint you are
     *         calling.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The URI of the AWS S3 folder that contains the input file. The folder
     * must be in the same Region as the API endpoint you are calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The URI of the AWS S3 folder that contains the input file. The
     *            folder must be in the same Region as the API endpoint you are
     *            calling.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URI of the AWS S3 folder that contains the input file. The folder
     * must be in the same Region as the API endpoint you are calling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The URI of the AWS S3 folder that contains the input file. The
     *            folder must be in the same Region as the API endpoint you are
     *            calling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDataConfig withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * Describes the format of the data that you submit to Amazon Translate as
     * input. You can specify one of the following multipurpose internet mail
     * extension (MIME) types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/html</code>: The input data consists of one or more HTML
     * files. Amazon Translate translates only the text that resides in the
     * <code>html</code> element in each file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain</code>: The input data consists of one or more
     * unformatted text files. Amazon Translate translates every character in
     * this type of input.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>
     * : The input data consists of one or more Word documents (.docx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.presentationml.presentation</code>
     * : The input data consists of one or more PowerPoint Presentation files
     * (.pptx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>
     * : The input data consists of one or more Excel Workbook files (.xlsx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/x-xliff+xml</code>: The input data consists of one or
     * more XML Localization Interchange File Format (XLIFF) files (.xlf).
     * Amazon Translate supports only XLIFF version 1.2.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you structure your input data as HTML, ensure that you set this
     * parameter to <code>text/html</code>. By doing so, you cut costs by
     * limiting the translation to the contents of the <code>html</code> element
     * in each file. Otherwise, if you set this parameter to
     * <code>text/plain</code>, your costs will cover the translation of every
     * character.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     *
     * @return <p>
     *         Describes the format of the data that you submit to Amazon
     *         Translate as input. You can specify one of the following
     *         multipurpose internet mail extension (MIME) types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>text/html</code>: The input data consists of one or more
     *         HTML files. Amazon Translate translates only the text that
     *         resides in the <code>html</code> element in each file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>text/plain</code>: The input data consists of one or more
     *         unformatted text files. Amazon Translate translates every
     *         character in this type of input.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>
     *         : The input data consists of one or more Word documents (.docx).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>application/vnd.openxmlformats-officedocument.presentationml.presentation</code>
     *         : The input data consists of one or more PowerPoint Presentation
     *         files (.pptx).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>
     *         : The input data consists of one or more Excel Workbook files
     *         (.xlsx).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>application/x-xliff+xml</code>: The input data consists of
     *         one or more XML Localization Interchange File Format (XLIFF)
     *         files (.xlf). Amazon Translate supports only XLIFF version 1.2.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         If you structure your input data as HTML, ensure that you set
     *         this parameter to <code>text/html</code>. By doing so, you cut
     *         costs by limiting the translation to the contents of the
     *         <code>html</code> element in each file. Otherwise, if you set
     *         this parameter to <code>text/plain</code>, your costs will cover
     *         the translation of every character.
     *         </p>
     *         </important>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * Describes the format of the data that you submit to Amazon Translate as
     * input. You can specify one of the following multipurpose internet mail
     * extension (MIME) types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/html</code>: The input data consists of one or more HTML
     * files. Amazon Translate translates only the text that resides in the
     * <code>html</code> element in each file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain</code>: The input data consists of one or more
     * unformatted text files. Amazon Translate translates every character in
     * this type of input.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>
     * : The input data consists of one or more Word documents (.docx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.presentationml.presentation</code>
     * : The input data consists of one or more PowerPoint Presentation files
     * (.pptx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>
     * : The input data consists of one or more Excel Workbook files (.xlsx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/x-xliff+xml</code>: The input data consists of one or
     * more XML Localization Interchange File Format (XLIFF) files (.xlf).
     * Amazon Translate supports only XLIFF version 1.2.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you structure your input data as HTML, ensure that you set this
     * parameter to <code>text/html</code>. By doing so, you cut costs by
     * limiting the translation to the contents of the <code>html</code> element
     * in each file. Otherwise, if you set this parameter to
     * <code>text/plain</code>, your costs will cover the translation of every
     * character.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     *
     * @param contentType <p>
     *            Describes the format of the data that you submit to Amazon
     *            Translate as input. You can specify one of the following
     *            multipurpose internet mail extension (MIME) types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>text/html</code>: The input data consists of one or more
     *            HTML files. Amazon Translate translates only the text that
     *            resides in the <code>html</code> element in each file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>text/plain</code>: The input data consists of one or
     *            more unformatted text files. Amazon Translate translates every
     *            character in this type of input.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>
     *            : The input data consists of one or more Word documents
     *            (.docx).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application/vnd.openxmlformats-officedocument.presentationml.presentation</code>
     *            : The input data consists of one or more PowerPoint
     *            Presentation files (.pptx).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>
     *            : The input data consists of one or more Excel Workbook files
     *            (.xlsx).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application/x-xliff+xml</code>: The input data consists
     *            of one or more XML Localization Interchange File Format
     *            (XLIFF) files (.xlf). Amazon Translate supports only XLIFF
     *            version 1.2.
     *            </p>
     *            </li>
     *            </ul>
     *            <important>
     *            <p>
     *            If you structure your input data as HTML, ensure that you set
     *            this parameter to <code>text/html</code>. By doing so, you cut
     *            costs by limiting the translation to the contents of the
     *            <code>html</code> element in each file. Otherwise, if you set
     *            this parameter to <code>text/plain</code>, your costs will
     *            cover the translation of every character.
     *            </p>
     *            </important>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Describes the format of the data that you submit to Amazon Translate as
     * input. You can specify one of the following multipurpose internet mail
     * extension (MIME) types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/html</code>: The input data consists of one or more HTML
     * files. Amazon Translate translates only the text that resides in the
     * <code>html</code> element in each file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain</code>: The input data consists of one or more
     * unformatted text files. Amazon Translate translates every character in
     * this type of input.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>
     * : The input data consists of one or more Word documents (.docx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.presentationml.presentation</code>
     * : The input data consists of one or more PowerPoint Presentation files
     * (.pptx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>
     * : The input data consists of one or more Excel Workbook files (.xlsx).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/x-xliff+xml</code>: The input data consists of one or
     * more XML Localization Interchange File Format (XLIFF) files (.xlf).
     * Amazon Translate supports only XLIFF version 1.2.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you structure your input data as HTML, ensure that you set this
     * parameter to <code>text/html</code>. By doing so, you cut costs by
     * limiting the translation to the contents of the <code>html</code> element
     * in each file. Otherwise, if you set this parameter to
     * <code>text/plain</code>, your costs will cover the translation of every
     * character.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     *
     * @param contentType <p>
     *            Describes the format of the data that you submit to Amazon
     *            Translate as input. You can specify one of the following
     *            multipurpose internet mail extension (MIME) types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>text/html</code>: The input data consists of one or more
     *            HTML files. Amazon Translate translates only the text that
     *            resides in the <code>html</code> element in each file.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>text/plain</code>: The input data consists of one or
     *            more unformatted text files. Amazon Translate translates every
     *            character in this type of input.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>
     *            : The input data consists of one or more Word documents
     *            (.docx).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application/vnd.openxmlformats-officedocument.presentationml.presentation</code>
     *            : The input data consists of one or more PowerPoint
     *            Presentation files (.pptx).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>
     *            : The input data consists of one or more Excel Workbook files
     *            (.xlsx).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application/x-xliff+xml</code>: The input data consists
     *            of one or more XML Localization Interchange File Format
     *            (XLIFF) files (.xlf). Amazon Translate supports only XLIFF
     *            version 1.2.
     *            </p>
     *            </li>
     *            </ul>
     *            <important>
     *            <p>
     *            If you structure your input data as HTML, ensure that you set
     *            this parameter to <code>text/html</code>. By doing so, you cut
     *            costs by limiting the translation to the contents of the
     *            <code>html</code> element in each file. Otherwise, if you set
     *            this parameter to <code>text/plain</code>, your costs will
     *            cover the translation of every character.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDataConfig withContentType(String contentType) {
        this.contentType = contentType;
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
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDataConfig == false)
            return false;
        InputDataConfig other = (InputDataConfig) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }
}
