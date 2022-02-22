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
 * The data associated with the custom terminology.
 * </p>
 */
public class TerminologyData implements Serializable {
    /**
     * <p>
     * The file containing the custom terminology data. Your version of the AWS
     * SDK performs a Base64-encoding on this field before sending a request to
     * the AWS service. Users of the SDK should not perform Base64-encoding
     * themselves.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10485760<br/>
     */
    private java.nio.ByteBuffer file;

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX, TSV
     */
    private String format;

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has
     * one source language (uni-directional) or multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first
     * column in a CSV file), and all of its other languages are target
     * languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a
     * target language. A single multi-directional terminology resource can be
     * used for jobs that translate different language pairs. For example, if
     * the terminology contains terms in English and Spanish, then it can be
     * used for jobs that translate English to Spanish and jobs that translate
     * Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the
     * directionality, it behaves as uni-directional terminology, although this
     * parameter will have a null value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNI, MULTI
     */
    private String directionality;

    /**
     * <p>
     * The file containing the custom terminology data. Your version of the AWS
     * SDK performs a Base64-encoding on this field before sending a request to
     * the AWS service. Users of the SDK should not perform Base64-encoding
     * themselves.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10485760<br/>
     *
     * @return <p>
     *         The file containing the custom terminology data. Your version of
     *         the AWS SDK performs a Base64-encoding on this field before
     *         sending a request to the AWS service. Users of the SDK should not
     *         perform Base64-encoding themselves.
     *         </p>
     */
    public java.nio.ByteBuffer getFile() {
        return file;
    }

    /**
     * <p>
     * The file containing the custom terminology data. Your version of the AWS
     * SDK performs a Base64-encoding on this field before sending a request to
     * the AWS service. Users of the SDK should not perform Base64-encoding
     * themselves.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10485760<br/>
     *
     * @param file <p>
     *            The file containing the custom terminology data. Your version
     *            of the AWS SDK performs a Base64-encoding on this field before
     *            sending a request to the AWS service. Users of the SDK should
     *            not perform Base64-encoding themselves.
     *            </p>
     */
    public void setFile(java.nio.ByteBuffer file) {
        this.file = file;
    }

    /**
     * <p>
     * The file containing the custom terminology data. Your version of the AWS
     * SDK performs a Base64-encoding on this field before sending a request to
     * the AWS service. Users of the SDK should not perform Base64-encoding
     * themselves.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10485760<br/>
     *
     * @param file <p>
     *            The file containing the custom terminology data. Your version
     *            of the AWS SDK performs a Base64-encoding on this field before
     *            sending a request to the AWS service. Users of the SDK should
     *            not perform Base64-encoding themselves.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyData withFile(java.nio.ByteBuffer file) {
        this.file = file;
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX, TSV
     *
     * @return <p>
     *         The data format of the custom terminology.
     *         </p>
     * @see TerminologyDataFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX, TSV
     *
     * @param format <p>
     *            The data format of the custom terminology.
     *            </p>
     * @see TerminologyDataFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX, TSV
     *
     * @param format <p>
     *            The data format of the custom terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TerminologyDataFormat
     */
    public TerminologyData withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX, TSV
     *
     * @param format <p>
     *            The data format of the custom terminology.
     *            </p>
     * @see TerminologyDataFormat
     */
    public void setFormat(TerminologyDataFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX, TSV
     *
     * @param format <p>
     *            The data format of the custom terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TerminologyDataFormat
     */
    public TerminologyData withFormat(TerminologyDataFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has
     * one source language (uni-directional) or multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first
     * column in a CSV file), and all of its other languages are target
     * languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a
     * target language. A single multi-directional terminology resource can be
     * used for jobs that translate different language pairs. For example, if
     * the terminology contains terms in English and Spanish, then it can be
     * used for jobs that translate English to Spanish and jobs that translate
     * Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the
     * directionality, it behaves as uni-directional terminology, although this
     * parameter will have a null value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNI, MULTI
     *
     * @return <p>
     *         The directionality of your terminology resource indicates whether
     *         it has one source language (uni-directional) or multiple
     *         (multi-directional).
     *         </p>
     *         <dl>
     *         <dt>UNI</dt>
     *         <dd>
     *         <p>
     *         The terminology resource has one source language (for example,
     *         the first column in a CSV file), and all of its other languages
     *         are target languages.
     *         </p>
     *         </dd>
     *         <dt>MULTI</dt>
     *         <dd>
     *         <p>
     *         Any language in the terminology resource can be the source
     *         language or a target language. A single multi-directional
     *         terminology resource can be used for jobs that translate
     *         different language pairs. For example, if the terminology
     *         contains terms in English and Spanish, then it can be used for
     *         jobs that translate English to Spanish and jobs that translate
     *         Spanish to English.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         When you create a custom terminology resource without specifying
     *         the directionality, it behaves as uni-directional terminology,
     *         although this parameter will have a null value.
     *         </p>
     * @see Directionality
     */
    public String getDirectionality() {
        return directionality;
    }

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has
     * one source language (uni-directional) or multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first
     * column in a CSV file), and all of its other languages are target
     * languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a
     * target language. A single multi-directional terminology resource can be
     * used for jobs that translate different language pairs. For example, if
     * the terminology contains terms in English and Spanish, then it can be
     * used for jobs that translate English to Spanish and jobs that translate
     * Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the
     * directionality, it behaves as uni-directional terminology, although this
     * parameter will have a null value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNI, MULTI
     *
     * @param directionality <p>
     *            The directionality of your terminology resource indicates
     *            whether it has one source language (uni-directional) or
     *            multiple (multi-directional).
     *            </p>
     *            <dl>
     *            <dt>UNI</dt>
     *            <dd>
     *            <p>
     *            The terminology resource has one source language (for example,
     *            the first column in a CSV file), and all of its other
     *            languages are target languages.
     *            </p>
     *            </dd>
     *            <dt>MULTI</dt>
     *            <dd>
     *            <p>
     *            Any language in the terminology resource can be the source
     *            language or a target language. A single multi-directional
     *            terminology resource can be used for jobs that translate
     *            different language pairs. For example, if the terminology
     *            contains terms in English and Spanish, then it can be used for
     *            jobs that translate English to Spanish and jobs that translate
     *            Spanish to English.
     *            </p>
     *            </dd>
     *            </dl>
     *            <p>
     *            When you create a custom terminology resource without
     *            specifying the directionality, it behaves as uni-directional
     *            terminology, although this parameter will have a null value.
     *            </p>
     * @see Directionality
     */
    public void setDirectionality(String directionality) {
        this.directionality = directionality;
    }

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has
     * one source language (uni-directional) or multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first
     * column in a CSV file), and all of its other languages are target
     * languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a
     * target language. A single multi-directional terminology resource can be
     * used for jobs that translate different language pairs. For example, if
     * the terminology contains terms in English and Spanish, then it can be
     * used for jobs that translate English to Spanish and jobs that translate
     * Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the
     * directionality, it behaves as uni-directional terminology, although this
     * parameter will have a null value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNI, MULTI
     *
     * @param directionality <p>
     *            The directionality of your terminology resource indicates
     *            whether it has one source language (uni-directional) or
     *            multiple (multi-directional).
     *            </p>
     *            <dl>
     *            <dt>UNI</dt>
     *            <dd>
     *            <p>
     *            The terminology resource has one source language (for example,
     *            the first column in a CSV file), and all of its other
     *            languages are target languages.
     *            </p>
     *            </dd>
     *            <dt>MULTI</dt>
     *            <dd>
     *            <p>
     *            Any language in the terminology resource can be the source
     *            language or a target language. A single multi-directional
     *            terminology resource can be used for jobs that translate
     *            different language pairs. For example, if the terminology
     *            contains terms in English and Spanish, then it can be used for
     *            jobs that translate English to Spanish and jobs that translate
     *            Spanish to English.
     *            </p>
     *            </dd>
     *            </dl>
     *            <p>
     *            When you create a custom terminology resource without
     *            specifying the directionality, it behaves as uni-directional
     *            terminology, although this parameter will have a null value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Directionality
     */
    public TerminologyData withDirectionality(String directionality) {
        this.directionality = directionality;
        return this;
    }

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has
     * one source language (uni-directional) or multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first
     * column in a CSV file), and all of its other languages are target
     * languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a
     * target language. A single multi-directional terminology resource can be
     * used for jobs that translate different language pairs. For example, if
     * the terminology contains terms in English and Spanish, then it can be
     * used for jobs that translate English to Spanish and jobs that translate
     * Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the
     * directionality, it behaves as uni-directional terminology, although this
     * parameter will have a null value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNI, MULTI
     *
     * @param directionality <p>
     *            The directionality of your terminology resource indicates
     *            whether it has one source language (uni-directional) or
     *            multiple (multi-directional).
     *            </p>
     *            <dl>
     *            <dt>UNI</dt>
     *            <dd>
     *            <p>
     *            The terminology resource has one source language (for example,
     *            the first column in a CSV file), and all of its other
     *            languages are target languages.
     *            </p>
     *            </dd>
     *            <dt>MULTI</dt>
     *            <dd>
     *            <p>
     *            Any language in the terminology resource can be the source
     *            language or a target language. A single multi-directional
     *            terminology resource can be used for jobs that translate
     *            different language pairs. For example, if the terminology
     *            contains terms in English and Spanish, then it can be used for
     *            jobs that translate English to Spanish and jobs that translate
     *            Spanish to English.
     *            </p>
     *            </dd>
     *            </dl>
     *            <p>
     *            When you create a custom terminology resource without
     *            specifying the directionality, it behaves as uni-directional
     *            terminology, although this parameter will have a null value.
     *            </p>
     * @see Directionality
     */
    public void setDirectionality(Directionality directionality) {
        this.directionality = directionality.toString();
    }

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has
     * one source language (uni-directional) or multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first
     * column in a CSV file), and all of its other languages are target
     * languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a
     * target language. A single multi-directional terminology resource can be
     * used for jobs that translate different language pairs. For example, if
     * the terminology contains terms in English and Spanish, then it can be
     * used for jobs that translate English to Spanish and jobs that translate
     * Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the
     * directionality, it behaves as uni-directional terminology, although this
     * parameter will have a null value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNI, MULTI
     *
     * @param directionality <p>
     *            The directionality of your terminology resource indicates
     *            whether it has one source language (uni-directional) or
     *            multiple (multi-directional).
     *            </p>
     *            <dl>
     *            <dt>UNI</dt>
     *            <dd>
     *            <p>
     *            The terminology resource has one source language (for example,
     *            the first column in a CSV file), and all of its other
     *            languages are target languages.
     *            </p>
     *            </dd>
     *            <dt>MULTI</dt>
     *            <dd>
     *            <p>
     *            Any language in the terminology resource can be the source
     *            language or a target language. A single multi-directional
     *            terminology resource can be used for jobs that translate
     *            different language pairs. For example, if the terminology
     *            contains terms in English and Spanish, then it can be used for
     *            jobs that translate English to Spanish and jobs that translate
     *            Spanish to English.
     *            </p>
     *            </dd>
     *            </dl>
     *            <p>
     *            When you create a custom terminology resource without
     *            specifying the directionality, it behaves as uni-directional
     *            terminology, although this parameter will have a null value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Directionality
     */
    public TerminologyData withDirectionality(Directionality directionality) {
        this.directionality = directionality.toString();
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
        if (getFile() != null)
            sb.append("File: " + getFile() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getDirectionality() != null)
            sb.append("Directionality: " + getDirectionality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getDirectionality() == null) ? 0 : getDirectionality().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminologyData == false)
            return false;
        TerminologyData other = (TerminologyData) obj;

        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getDirectionality() == null ^ this.getDirectionality() == null)
            return false;
        if (other.getDirectionality() != null
                && other.getDirectionality().equals(this.getDirectionality()) == false)
            return false;
        return true;
    }
}
