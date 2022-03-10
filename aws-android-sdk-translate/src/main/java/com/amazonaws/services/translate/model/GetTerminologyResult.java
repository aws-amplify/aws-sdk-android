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

public class GetTerminologyResult implements Serializable {
    /**
     * <p>
     * The properties of the custom terminology being retrieved.
     * </p>
     */
    private TerminologyProperties terminologyProperties;

    /**
     * <p>
     * The Amazon S3 location of the most recent custom terminology input file
     * that was successfully imported into Amazon Translate. The location is
     * returned as a presigned URL that has a 30 minute expiration.
     * </p>
     * <important>
     * <p>
     * Amazon Translate doesn't scan all input files for the risk of CSV
     * injection attacks.
     * </p>
     * <p>
     * CSV injection occurs when a .csv or .tsv file is altered so that a record
     * contains malicious code. The record begins with a special character, such
     * as =, +, -, or @. When the file is opened in a spreadsheet program, the
     * program might interpret the record as a formula and run the code within
     * it.
     * </p>
     * <p>
     * Before you download an input file from Amazon S3, ensure that you
     * recognize the file and trust its creator.
     * </p>
     * </important>
     */
    private TerminologyDataLocation terminologyDataLocation;

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a terminology resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     */
    private TerminologyDataLocation auxiliaryDataLocation;

    /**
     * <p>
     * The properties of the custom terminology being retrieved.
     * </p>
     *
     * @return <p>
     *         The properties of the custom terminology being retrieved.
     *         </p>
     */
    public TerminologyProperties getTerminologyProperties() {
        return terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being retrieved.
     * </p>
     *
     * @param terminologyProperties <p>
     *            The properties of the custom terminology being retrieved.
     *            </p>
     */
    public void setTerminologyProperties(TerminologyProperties terminologyProperties) {
        this.terminologyProperties = terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyProperties <p>
     *            The properties of the custom terminology being retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTerminologyResult withTerminologyProperties(
            TerminologyProperties terminologyProperties) {
        this.terminologyProperties = terminologyProperties;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the most recent custom terminology input file
     * that was successfully imported into Amazon Translate. The location is
     * returned as a presigned URL that has a 30 minute expiration.
     * </p>
     * <important>
     * <p>
     * Amazon Translate doesn't scan all input files for the risk of CSV
     * injection attacks.
     * </p>
     * <p>
     * CSV injection occurs when a .csv or .tsv file is altered so that a record
     * contains malicious code. The record begins with a special character, such
     * as =, +, -, or @. When the file is opened in a spreadsheet program, the
     * program might interpret the record as a formula and run the code within
     * it.
     * </p>
     * <p>
     * Before you download an input file from Amazon S3, ensure that you
     * recognize the file and trust its creator.
     * </p>
     * </important>
     *
     * @return <p>
     *         The Amazon S3 location of the most recent custom terminology
     *         input file that was successfully imported into Amazon Translate.
     *         The location is returned as a presigned URL that has a 30 minute
     *         expiration.
     *         </p>
     *         <important>
     *         <p>
     *         Amazon Translate doesn't scan all input files for the risk of CSV
     *         injection attacks.
     *         </p>
     *         <p>
     *         CSV injection occurs when a .csv or .tsv file is altered so that
     *         a record contains malicious code. The record begins with a
     *         special character, such as =, +, -, or @. When the file is opened
     *         in a spreadsheet program, the program might interpret the record
     *         as a formula and run the code within it.
     *         </p>
     *         <p>
     *         Before you download an input file from Amazon S3, ensure that you
     *         recognize the file and trust its creator.
     *         </p>
     *         </important>
     */
    public TerminologyDataLocation getTerminologyDataLocation() {
        return terminologyDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of the most recent custom terminology input file
     * that was successfully imported into Amazon Translate. The location is
     * returned as a presigned URL that has a 30 minute expiration.
     * </p>
     * <important>
     * <p>
     * Amazon Translate doesn't scan all input files for the risk of CSV
     * injection attacks.
     * </p>
     * <p>
     * CSV injection occurs when a .csv or .tsv file is altered so that a record
     * contains malicious code. The record begins with a special character, such
     * as =, +, -, or @. When the file is opened in a spreadsheet program, the
     * program might interpret the record as a formula and run the code within
     * it.
     * </p>
     * <p>
     * Before you download an input file from Amazon S3, ensure that you
     * recognize the file and trust its creator.
     * </p>
     * </important>
     *
     * @param terminologyDataLocation <p>
     *            The Amazon S3 location of the most recent custom terminology
     *            input file that was successfully imported into Amazon
     *            Translate. The location is returned as a presigned URL that
     *            has a 30 minute expiration.
     *            </p>
     *            <important>
     *            <p>
     *            Amazon Translate doesn't scan all input files for the risk of
     *            CSV injection attacks.
     *            </p>
     *            <p>
     *            CSV injection occurs when a .csv or .tsv file is altered so
     *            that a record contains malicious code. The record begins with
     *            a special character, such as =, +, -, or @. When the file is
     *            opened in a spreadsheet program, the program might interpret
     *            the record as a formula and run the code within it.
     *            </p>
     *            <p>
     *            Before you download an input file from Amazon S3, ensure that
     *            you recognize the file and trust its creator.
     *            </p>
     *            </important>
     */
    public void setTerminologyDataLocation(TerminologyDataLocation terminologyDataLocation) {
        this.terminologyDataLocation = terminologyDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of the most recent custom terminology input file
     * that was successfully imported into Amazon Translate. The location is
     * returned as a presigned URL that has a 30 minute expiration.
     * </p>
     * <important>
     * <p>
     * Amazon Translate doesn't scan all input files for the risk of CSV
     * injection attacks.
     * </p>
     * <p>
     * CSV injection occurs when a .csv or .tsv file is altered so that a record
     * contains malicious code. The record begins with a special character, such
     * as =, +, -, or @. When the file is opened in a spreadsheet program, the
     * program might interpret the record as a formula and run the code within
     * it.
     * </p>
     * <p>
     * Before you download an input file from Amazon S3, ensure that you
     * recognize the file and trust its creator.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyDataLocation <p>
     *            The Amazon S3 location of the most recent custom terminology
     *            input file that was successfully imported into Amazon
     *            Translate. The location is returned as a presigned URL that
     *            has a 30 minute expiration.
     *            </p>
     *            <important>
     *            <p>
     *            Amazon Translate doesn't scan all input files for the risk of
     *            CSV injection attacks.
     *            </p>
     *            <p>
     *            CSV injection occurs when a .csv or .tsv file is altered so
     *            that a record contains malicious code. The record begins with
     *            a special character, such as =, +, -, or @. When the file is
     *            opened in a spreadsheet program, the program might interpret
     *            the record as a formula and run the code within it.
     *            </p>
     *            <p>
     *            Before you download an input file from Amazon S3, ensure that
     *            you recognize the file and trust its creator.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTerminologyResult withTerminologyDataLocation(
            TerminologyDataLocation terminologyDataLocation) {
        this.terminologyDataLocation = terminologyDataLocation;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a terminology resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 location of a file that provides any errors or
     *         warnings that were produced by your input file. This file was
     *         created when Amazon Translate attempted to create a terminology
     *         resource. The location is returned as a presigned URL to that has
     *         a 30 minute expiration.
     *         </p>
     */
    public TerminologyDataLocation getAuxiliaryDataLocation() {
        return auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a terminology resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     *
     * @param auxiliaryDataLocation <p>
     *            The Amazon S3 location of a file that provides any errors or
     *            warnings that were produced by your input file. This file was
     *            created when Amazon Translate attempted to create a
     *            terminology resource. The location is returned as a presigned
     *            URL to that has a 30 minute expiration.
     *            </p>
     */
    public void setAuxiliaryDataLocation(TerminologyDataLocation auxiliaryDataLocation) {
        this.auxiliaryDataLocation = auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a terminology resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auxiliaryDataLocation <p>
     *            The Amazon S3 location of a file that provides any errors or
     *            warnings that were produced by your input file. This file was
     *            created when Amazon Translate attempted to create a
     *            terminology resource. The location is returned as a presigned
     *            URL to that has a 30 minute expiration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTerminologyResult withAuxiliaryDataLocation(
            TerminologyDataLocation auxiliaryDataLocation) {
        this.auxiliaryDataLocation = auxiliaryDataLocation;
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
        if (getTerminologyProperties() != null)
            sb.append("TerminologyProperties: " + getTerminologyProperties() + ",");
        if (getTerminologyDataLocation() != null)
            sb.append("TerminologyDataLocation: " + getTerminologyDataLocation() + ",");
        if (getAuxiliaryDataLocation() != null)
            sb.append("AuxiliaryDataLocation: " + getAuxiliaryDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTerminologyProperties() == null) ? 0 : getTerminologyProperties().hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminologyDataLocation() == null) ? 0 : getTerminologyDataLocation()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAuxiliaryDataLocation() == null) ? 0 : getAuxiliaryDataLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTerminologyResult == false)
            return false;
        GetTerminologyResult other = (GetTerminologyResult) obj;

        if (other.getTerminologyProperties() == null ^ this.getTerminologyProperties() == null)
            return false;
        if (other.getTerminologyProperties() != null
                && other.getTerminologyProperties().equals(this.getTerminologyProperties()) == false)
            return false;
        if (other.getTerminologyDataLocation() == null ^ this.getTerminologyDataLocation() == null)
            return false;
        if (other.getTerminologyDataLocation() != null
                && other.getTerminologyDataLocation().equals(this.getTerminologyDataLocation()) == false)
            return false;
        if (other.getAuxiliaryDataLocation() == null ^ this.getAuxiliaryDataLocation() == null)
            return false;
        if (other.getAuxiliaryDataLocation() != null
                && other.getAuxiliaryDataLocation().equals(this.getAuxiliaryDataLocation()) == false)
            return false;
        return true;
    }
}
