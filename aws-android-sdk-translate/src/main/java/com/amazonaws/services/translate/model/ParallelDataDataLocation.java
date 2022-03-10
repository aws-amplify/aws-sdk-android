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
 * The location of the most recent parallel data input file that was
 * successfully imported into Amazon Translate.
 * </p>
 */
public class ParallelDataDataLocation implements Serializable {
    /**
     * <p>
     * Describes the repository that contains the parallel data input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     */
    private String repositoryType;

    /**
     * <p>
     * The Amazon S3 location of the parallel data input file. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     */
    private String location;

    /**
     * <p>
     * Describes the repository that contains the parallel data input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @return <p>
     *         Describes the repository that contains the parallel data input
     *         file.
     *         </p>
     */
    public String getRepositoryType() {
        return repositoryType;
    }

    /**
     * <p>
     * Describes the repository that contains the parallel data input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param repositoryType <p>
     *            Describes the repository that contains the parallel data input
     *            file.
     *            </p>
     */
    public void setRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
    }

    /**
     * <p>
     * Describes the repository that contains the parallel data input file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param repositoryType <p>
     *            Describes the repository that contains the parallel data input
     *            file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataDataLocation withRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the parallel data input file. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @return <p>
     *         The Amazon S3 location of the parallel data input file. The
     *         location is returned as a presigned URL to that has a 30 minute
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
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The Amazon S3 location of the parallel data input file. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param location <p>
     *            The Amazon S3 location of the parallel data input file. The
     *            location is returned as a presigned URL to that has a 30
     *            minute expiration.
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
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The Amazon S3 location of the parallel data input file. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param location <p>
     *            The Amazon S3 location of the parallel data input file. The
     *            location is returned as a presigned URL to that has a 30
     *            minute expiration.
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
    public ParallelDataDataLocation withLocation(String location) {
        this.location = location;
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
        if (getRepositoryType() != null)
            sb.append("RepositoryType: " + getRepositoryType() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryType() == null) ? 0 : getRepositoryType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParallelDataDataLocation == false)
            return false;
        ParallelDataDataLocation other = (ParallelDataDataLocation) obj;

        if (other.getRepositoryType() == null ^ this.getRepositoryType() == null)
            return false;
        if (other.getRepositoryType() != null
                && other.getRepositoryType().equals(this.getRepositoryType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }
}
