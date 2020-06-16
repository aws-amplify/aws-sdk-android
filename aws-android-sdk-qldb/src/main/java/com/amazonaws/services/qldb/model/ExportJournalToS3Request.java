/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Exports journal contents within a date and time range from a ledger into a
 * specified Amazon Simple Storage Service (Amazon S3) bucket. The data is
 * written as files in Amazon Ion format.
 * </p>
 * <p>
 * If the ledger with the given <code>Name</code> doesn't exist, then throws
 * <code>ResourceNotFoundException</code>.
 * </p>
 * <p>
 * If the ledger with the given <code>Name</code> is in <code>CREATING</code>
 * status, then throws <code>ResourcePreconditionNotMetException</code>.
 * </p>
 * <p>
 * You can initiate up to two concurrent journal export requests for each
 * ledger. Beyond this limit, journal export requests throw
 * <code>LimitExceededException</code>.
 * </p>
 */
public class ExportJournalToS3Request extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that
     * you want to export.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be before
     * <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the
     * ledger's <code>CreationDateTime</code>, Amazon QLDB defaults it to the
     * ledger's <code>CreationDateTime</code>.
     * </p>
     */
    private java.util.Date inclusiveStartTime;

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that
     * you want to export.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be less than or equal to the
     * current UTC date and time.
     * </p>
     */
    private java.util.Date exclusiveEndTime;

    /**
     * <p>
     * The configuration settings of the Amazon S3 bucket destination for your
     * export request.
     * </p>
     */
    private S3ExportConfiguration s3ExportConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal export job to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management
     * Service (AWS KMS) for server-side encryption of your exported data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The name of the ledger.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param name <p>
     *            The name of the ledger.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param name <p>
     *            The name of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJournalToS3Request withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that
     * you want to export.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be before
     * <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the
     * ledger's <code>CreationDateTime</code>, Amazon QLDB defaults it to the
     * ledger's <code>CreationDateTime</code>.
     * </p>
     *
     * @return <p>
     *         The inclusive start date and time for the range of journal
     *         contents that you want to export.
     *         </p>
     *         <p>
     *         The <code>InclusiveStartTime</code> must be in
     *         <code>ISO 8601</code> date and time format and in Universal
     *         Coordinated Time (UTC). For example:
     *         <code>2019-06-13T21:36:34Z</code>
     *         </p>
     *         <p>
     *         The <code>InclusiveStartTime</code> must be before
     *         <code>ExclusiveEndTime</code>.
     *         </p>
     *         <p>
     *         If you provide an <code>InclusiveStartTime</code> that is before
     *         the ledger's <code>CreationDateTime</code>, Amazon QLDB defaults
     *         it to the ledger's <code>CreationDateTime</code>.
     *         </p>
     */
    public java.util.Date getInclusiveStartTime() {
        return inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that
     * you want to export.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be before
     * <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the
     * ledger's <code>CreationDateTime</code>, Amazon QLDB defaults it to the
     * ledger's <code>CreationDateTime</code>.
     * </p>
     *
     * @param inclusiveStartTime <p>
     *            The inclusive start date and time for the range of journal
     *            contents that you want to export.
     *            </p>
     *            <p>
     *            The <code>InclusiveStartTime</code> must be in
     *            <code>ISO 8601</code> date and time format and in Universal
     *            Coordinated Time (UTC). For example:
     *            <code>2019-06-13T21:36:34Z</code>
     *            </p>
     *            <p>
     *            The <code>InclusiveStartTime</code> must be before
     *            <code>ExclusiveEndTime</code>.
     *            </p>
     *            <p>
     *            If you provide an <code>InclusiveStartTime</code> that is
     *            before the ledger's <code>CreationDateTime</code>, Amazon QLDB
     *            defaults it to the ledger's <code>CreationDateTime</code>.
     *            </p>
     */
    public void setInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that
     * you want to export.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be before
     * <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the
     * ledger's <code>CreationDateTime</code>, Amazon QLDB defaults it to the
     * ledger's <code>CreationDateTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusiveStartTime <p>
     *            The inclusive start date and time for the range of journal
     *            contents that you want to export.
     *            </p>
     *            <p>
     *            The <code>InclusiveStartTime</code> must be in
     *            <code>ISO 8601</code> date and time format and in Universal
     *            Coordinated Time (UTC). For example:
     *            <code>2019-06-13T21:36:34Z</code>
     *            </p>
     *            <p>
     *            The <code>InclusiveStartTime</code> must be before
     *            <code>ExclusiveEndTime</code>.
     *            </p>
     *            <p>
     *            If you provide an <code>InclusiveStartTime</code> that is
     *            before the ledger's <code>CreationDateTime</code>, Amazon QLDB
     *            defaults it to the ledger's <code>CreationDateTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJournalToS3Request withInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
        return this;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that
     * you want to export.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be less than or equal to the
     * current UTC date and time.
     * </p>
     *
     * @return <p>
     *         The exclusive end date and time for the range of journal contents
     *         that you want to export.
     *         </p>
     *         <p>
     *         The <code>ExclusiveEndTime</code> must be in
     *         <code>ISO 8601</code> date and time format and in Universal
     *         Coordinated Time (UTC). For example:
     *         <code>2019-06-13T21:36:34Z</code>
     *         </p>
     *         <p>
     *         The <code>ExclusiveEndTime</code> must be less than or equal to
     *         the current UTC date and time.
     *         </p>
     */
    public java.util.Date getExclusiveEndTime() {
        return exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that
     * you want to export.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be less than or equal to the
     * current UTC date and time.
     * </p>
     *
     * @param exclusiveEndTime <p>
     *            The exclusive end date and time for the range of journal
     *            contents that you want to export.
     *            </p>
     *            <p>
     *            The <code>ExclusiveEndTime</code> must be in
     *            <code>ISO 8601</code> date and time format and in Universal
     *            Coordinated Time (UTC). For example:
     *            <code>2019-06-13T21:36:34Z</code>
     *            </p>
     *            <p>
     *            The <code>ExclusiveEndTime</code> must be less than or equal
     *            to the current UTC date and time.
     *            </p>
     */
    public void setExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that
     * you want to export.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be less than or equal to the
     * current UTC date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusiveEndTime <p>
     *            The exclusive end date and time for the range of journal
     *            contents that you want to export.
     *            </p>
     *            <p>
     *            The <code>ExclusiveEndTime</code> must be in
     *            <code>ISO 8601</code> date and time format and in Universal
     *            Coordinated Time (UTC). For example:
     *            <code>2019-06-13T21:36:34Z</code>
     *            </p>
     *            <p>
     *            The <code>ExclusiveEndTime</code> must be less than or equal
     *            to the current UTC date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJournalToS3Request withExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
        return this;
    }

    /**
     * <p>
     * The configuration settings of the Amazon S3 bucket destination for your
     * export request.
     * </p>
     *
     * @return <p>
     *         The configuration settings of the Amazon S3 bucket destination
     *         for your export request.
     *         </p>
     */
    public S3ExportConfiguration getS3ExportConfiguration() {
        return s3ExportConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Amazon S3 bucket destination for your
     * export request.
     * </p>
     *
     * @param s3ExportConfiguration <p>
     *            The configuration settings of the Amazon S3 bucket destination
     *            for your export request.
     *            </p>
     */
    public void setS3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
        this.s3ExportConfiguration = s3ExportConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Amazon S3 bucket destination for your
     * export request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3ExportConfiguration <p>
     *            The configuration settings of the Amazon S3 bucket destination
     *            for your export request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJournalToS3Request withS3ExportConfiguration(
            S3ExportConfiguration s3ExportConfiguration) {
        this.s3ExportConfiguration = s3ExportConfiguration;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal export job to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management
     * Service (AWS KMS) for server-side encryption of your exported data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     *         permissions for a journal export job to do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Write objects into your Amazon Simple Storage Service (Amazon S3)
     *         bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (Optional) Use your customer master key (CMK) in AWS Key
     *         Management Service (AWS KMS) for server-side encryption of your
     *         exported data.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal export job to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management
     * Service (AWS KMS) for server-side encryption of your exported data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            QLDB permissions for a journal export job to do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Write objects into your Amazon Simple Storage Service (Amazon
     *            S3) bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            (Optional) Use your customer master key (CMK) in AWS Key
     *            Management Service (AWS KMS) for server-side encryption of
     *            your exported data.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal export job to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management
     * Service (AWS KMS) for server-side encryption of your exported data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            QLDB permissions for a journal export job to do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Write objects into your Amazon Simple Storage Service (Amazon
     *            S3) bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            (Optional) Use your customer master key (CMK) in AWS Key
     *            Management Service (AWS KMS) for server-side encryption of
     *            your exported data.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJournalToS3Request withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getInclusiveStartTime() != null)
            sb.append("InclusiveStartTime: " + getInclusiveStartTime() + ",");
        if (getExclusiveEndTime() != null)
            sb.append("ExclusiveEndTime: " + getExclusiveEndTime() + ",");
        if (getS3ExportConfiguration() != null)
            sb.append("S3ExportConfiguration: " + getS3ExportConfiguration() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getInclusiveStartTime() == null) ? 0 : getInclusiveStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getExclusiveEndTime() == null) ? 0 : getExclusiveEndTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getS3ExportConfiguration() == null) ? 0 : getS3ExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportJournalToS3Request == false)
            return false;
        ExportJournalToS3Request other = (ExportJournalToS3Request) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInclusiveStartTime() == null ^ this.getInclusiveStartTime() == null)
            return false;
        if (other.getInclusiveStartTime() != null
                && other.getInclusiveStartTime().equals(this.getInclusiveStartTime()) == false)
            return false;
        if (other.getExclusiveEndTime() == null ^ this.getExclusiveEndTime() == null)
            return false;
        if (other.getExclusiveEndTime() != null
                && other.getExclusiveEndTime().equals(this.getExclusiveEndTime()) == false)
            return false;
        if (other.getS3ExportConfiguration() == null ^ this.getS3ExportConfiguration() == null)
            return false;
        if (other.getS3ExportConfiguration() != null
                && other.getS3ExportConfiguration().equals(this.getS3ExportConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
