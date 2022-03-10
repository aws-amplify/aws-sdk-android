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

public class GetParallelDataResult implements Serializable {
    /**
     * <p>
     * The properties of the parallel data resource that is being retrieved.
     * </p>
     */
    private ParallelDataProperties parallelDataProperties;

    /**
     * <p>
     * The Amazon S3 location of the most recent parallel data input file that
     * was successfully imported into Amazon Translate. The location is returned
     * as a presigned URL that has a 30 minute expiration.
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
    private ParallelDataDataLocation dataLocation;

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a parallel data resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     */
    private ParallelDataDataLocation auxiliaryDataLocation;

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to update a parallel data resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     */
    private ParallelDataDataLocation latestUpdateAttemptAuxiliaryDataLocation;

    /**
     * <p>
     * The properties of the parallel data resource that is being retrieved.
     * </p>
     *
     * @return <p>
     *         The properties of the parallel data resource that is being
     *         retrieved.
     *         </p>
     */
    public ParallelDataProperties getParallelDataProperties() {
        return parallelDataProperties;
    }

    /**
     * <p>
     * The properties of the parallel data resource that is being retrieved.
     * </p>
     *
     * @param parallelDataProperties <p>
     *            The properties of the parallel data resource that is being
     *            retrieved.
     *            </p>
     */
    public void setParallelDataProperties(ParallelDataProperties parallelDataProperties) {
        this.parallelDataProperties = parallelDataProperties;
    }

    /**
     * <p>
     * The properties of the parallel data resource that is being retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parallelDataProperties <p>
     *            The properties of the parallel data resource that is being
     *            retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParallelDataResult withParallelDataProperties(
            ParallelDataProperties parallelDataProperties) {
        this.parallelDataProperties = parallelDataProperties;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the most recent parallel data input file that
     * was successfully imported into Amazon Translate. The location is returned
     * as a presigned URL that has a 30 minute expiration.
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
     *         The Amazon S3 location of the most recent parallel data input
     *         file that was successfully imported into Amazon Translate. The
     *         location is returned as a presigned URL that has a 30 minute
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
    public ParallelDataDataLocation getDataLocation() {
        return dataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of the most recent parallel data input file that
     * was successfully imported into Amazon Translate. The location is returned
     * as a presigned URL that has a 30 minute expiration.
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
     * @param dataLocation <p>
     *            The Amazon S3 location of the most recent parallel data input
     *            file that was successfully imported into Amazon Translate. The
     *            location is returned as a presigned URL that has a 30 minute
     *            expiration.
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
    public void setDataLocation(ParallelDataDataLocation dataLocation) {
        this.dataLocation = dataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of the most recent parallel data input file that
     * was successfully imported into Amazon Translate. The location is returned
     * as a presigned URL that has a 30 minute expiration.
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
     * @param dataLocation <p>
     *            The Amazon S3 location of the most recent parallel data input
     *            file that was successfully imported into Amazon Translate. The
     *            location is returned as a presigned URL that has a 30 minute
     *            expiration.
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
    public GetParallelDataResult withDataLocation(ParallelDataDataLocation dataLocation) {
        this.dataLocation = dataLocation;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a parallel data resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 location of a file that provides any errors or
     *         warnings that were produced by your input file. This file was
     *         created when Amazon Translate attempted to create a parallel data
     *         resource. The location is returned as a presigned URL to that has
     *         a 30 minute expiration.
     *         </p>
     */
    public ParallelDataDataLocation getAuxiliaryDataLocation() {
        return auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a parallel data resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     *
     * @param auxiliaryDataLocation <p>
     *            The Amazon S3 location of a file that provides any errors or
     *            warnings that were produced by your input file. This file was
     *            created when Amazon Translate attempted to create a parallel
     *            data resource. The location is returned as a presigned URL to
     *            that has a 30 minute expiration.
     *            </p>
     */
    public void setAuxiliaryDataLocation(ParallelDataDataLocation auxiliaryDataLocation) {
        this.auxiliaryDataLocation = auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a parallel data resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auxiliaryDataLocation <p>
     *            The Amazon S3 location of a file that provides any errors or
     *            warnings that were produced by your input file. This file was
     *            created when Amazon Translate attempted to create a parallel
     *            data resource. The location is returned as a presigned URL to
     *            that has a 30 minute expiration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParallelDataResult withAuxiliaryDataLocation(
            ParallelDataDataLocation auxiliaryDataLocation) {
        this.auxiliaryDataLocation = auxiliaryDataLocation;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to update a parallel data resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 location of a file that provides any errors or
     *         warnings that were produced by your input file. This file was
     *         created when Amazon Translate attempted to update a parallel data
     *         resource. The location is returned as a presigned URL to that has
     *         a 30 minute expiration.
     *         </p>
     */
    public ParallelDataDataLocation getLatestUpdateAttemptAuxiliaryDataLocation() {
        return latestUpdateAttemptAuxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to update a parallel data resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     *
     * @param latestUpdateAttemptAuxiliaryDataLocation <p>
     *            The Amazon S3 location of a file that provides any errors or
     *            warnings that were produced by your input file. This file was
     *            created when Amazon Translate attempted to update a parallel
     *            data resource. The location is returned as a presigned URL to
     *            that has a 30 minute expiration.
     *            </p>
     */
    public void setLatestUpdateAttemptAuxiliaryDataLocation(
            ParallelDataDataLocation latestUpdateAttemptAuxiliaryDataLocation) {
        this.latestUpdateAttemptAuxiliaryDataLocation = latestUpdateAttemptAuxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to update a parallel data resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestUpdateAttemptAuxiliaryDataLocation <p>
     *            The Amazon S3 location of a file that provides any errors or
     *            warnings that were produced by your input file. This file was
     *            created when Amazon Translate attempted to update a parallel
     *            data resource. The location is returned as a presigned URL to
     *            that has a 30 minute expiration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParallelDataResult withLatestUpdateAttemptAuxiliaryDataLocation(
            ParallelDataDataLocation latestUpdateAttemptAuxiliaryDataLocation) {
        this.latestUpdateAttemptAuxiliaryDataLocation = latestUpdateAttemptAuxiliaryDataLocation;
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
        if (getParallelDataProperties() != null)
            sb.append("ParallelDataProperties: " + getParallelDataProperties() + ",");
        if (getDataLocation() != null)
            sb.append("DataLocation: " + getDataLocation() + ",");
        if (getAuxiliaryDataLocation() != null)
            sb.append("AuxiliaryDataLocation: " + getAuxiliaryDataLocation() + ",");
        if (getLatestUpdateAttemptAuxiliaryDataLocation() != null)
            sb.append("LatestUpdateAttemptAuxiliaryDataLocation: "
                    + getLatestUpdateAttemptAuxiliaryDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getParallelDataProperties() == null) ? 0 : getParallelDataProperties()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDataLocation() == null) ? 0 : getDataLocation().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuxiliaryDataLocation() == null) ? 0 : getAuxiliaryDataLocation().hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestUpdateAttemptAuxiliaryDataLocation() == null) ? 0
                        : getLatestUpdateAttemptAuxiliaryDataLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParallelDataResult == false)
            return false;
        GetParallelDataResult other = (GetParallelDataResult) obj;

        if (other.getParallelDataProperties() == null ^ this.getParallelDataProperties() == null)
            return false;
        if (other.getParallelDataProperties() != null
                && other.getParallelDataProperties().equals(this.getParallelDataProperties()) == false)
            return false;
        if (other.getDataLocation() == null ^ this.getDataLocation() == null)
            return false;
        if (other.getDataLocation() != null
                && other.getDataLocation().equals(this.getDataLocation()) == false)
            return false;
        if (other.getAuxiliaryDataLocation() == null ^ this.getAuxiliaryDataLocation() == null)
            return false;
        if (other.getAuxiliaryDataLocation() != null
                && other.getAuxiliaryDataLocation().equals(this.getAuxiliaryDataLocation()) == false)
            return false;
        if (other.getLatestUpdateAttemptAuxiliaryDataLocation() == null
                ^ this.getLatestUpdateAttemptAuxiliaryDataLocation() == null)
            return false;
        if (other.getLatestUpdateAttemptAuxiliaryDataLocation() != null
                && other.getLatestUpdateAttemptAuxiliaryDataLocation().equals(
                        this.getLatestUpdateAttemptAuxiliaryDataLocation()) == false)
            return false;
        return true;
    }
}
