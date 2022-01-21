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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about when a transcription job should be executed.
 * </p>
 */
public class JobExecutionSettings implements Serializable {
    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the
     * concurrent execution limit is exceeded. When the
     * <code>AllowDeferredExecution</code> field is true, jobs are queued and
     * executed when the number of executing jobs falls below the concurrent
     * execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for call analytics jobs.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must
     * specify the <code>DataAccessRoleArn</code> field.
     * </p>
     */
    private Boolean allowDeferredExecution;

    /**
     * <p>
     * The Amazon Resource Name (ARN), in the form
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * , of a role that has access to the S3 bucket that contains the input
     * files. Amazon Transcribe assumes this role to read queued media files. If
     * you have specified an output S3 bucket for the transcription results,
     * this role should have access to the output bucket as well.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must
     * specify the <code>DataAccessRoleArn</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the
     * concurrent execution limit is exceeded. When the
     * <code>AllowDeferredExecution</code> field is true, jobs are queued and
     * executed when the number of executing jobs falls below the concurrent
     * execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for call analytics jobs.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must
     * specify the <code>DataAccessRoleArn</code> field.
     * </p>
     *
     * @return <p>
     *         Indicates whether a job should be queued by Amazon Transcribe
     *         when the concurrent execution limit is exceeded. When the
     *         <code>AllowDeferredExecution</code> field is true, jobs are
     *         queued and executed when the number of executing jobs falls below
     *         the concurrent execution limit. If the field is false, Amazon
     *         Transcribe returns a <code>LimitExceededException</code>
     *         exception.
     *         </p>
     *         <p>
     *         Note that job queuing is enabled by default for call analytics
     *         jobs.
     *         </p>
     *         <p>
     *         If you specify the <code>AllowDeferredExecution</code> field, you
     *         must specify the <code>DataAccessRoleArn</code> field.
     *         </p>
     */
    public Boolean isAllowDeferredExecution() {
        return allowDeferredExecution;
    }

    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the
     * concurrent execution limit is exceeded. When the
     * <code>AllowDeferredExecution</code> field is true, jobs are queued and
     * executed when the number of executing jobs falls below the concurrent
     * execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for call analytics jobs.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must
     * specify the <code>DataAccessRoleArn</code> field.
     * </p>
     *
     * @return <p>
     *         Indicates whether a job should be queued by Amazon Transcribe
     *         when the concurrent execution limit is exceeded. When the
     *         <code>AllowDeferredExecution</code> field is true, jobs are
     *         queued and executed when the number of executing jobs falls below
     *         the concurrent execution limit. If the field is false, Amazon
     *         Transcribe returns a <code>LimitExceededException</code>
     *         exception.
     *         </p>
     *         <p>
     *         Note that job queuing is enabled by default for call analytics
     *         jobs.
     *         </p>
     *         <p>
     *         If you specify the <code>AllowDeferredExecution</code> field, you
     *         must specify the <code>DataAccessRoleArn</code> field.
     *         </p>
     */
    public Boolean getAllowDeferredExecution() {
        return allowDeferredExecution;
    }

    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the
     * concurrent execution limit is exceeded. When the
     * <code>AllowDeferredExecution</code> field is true, jobs are queued and
     * executed when the number of executing jobs falls below the concurrent
     * execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for call analytics jobs.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must
     * specify the <code>DataAccessRoleArn</code> field.
     * </p>
     *
     * @param allowDeferredExecution <p>
     *            Indicates whether a job should be queued by Amazon Transcribe
     *            when the concurrent execution limit is exceeded. When the
     *            <code>AllowDeferredExecution</code> field is true, jobs are
     *            queued and executed when the number of executing jobs falls
     *            below the concurrent execution limit. If the field is false,
     *            Amazon Transcribe returns a
     *            <code>LimitExceededException</code> exception.
     *            </p>
     *            <p>
     *            Note that job queuing is enabled by default for call analytics
     *            jobs.
     *            </p>
     *            <p>
     *            If you specify the <code>AllowDeferredExecution</code> field,
     *            you must specify the <code>DataAccessRoleArn</code> field.
     *            </p>
     */
    public void setAllowDeferredExecution(Boolean allowDeferredExecution) {
        this.allowDeferredExecution = allowDeferredExecution;
    }

    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the
     * concurrent execution limit is exceeded. When the
     * <code>AllowDeferredExecution</code> field is true, jobs are queued and
     * executed when the number of executing jobs falls below the concurrent
     * execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for call analytics jobs.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must
     * specify the <code>DataAccessRoleArn</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowDeferredExecution <p>
     *            Indicates whether a job should be queued by Amazon Transcribe
     *            when the concurrent execution limit is exceeded. When the
     *            <code>AllowDeferredExecution</code> field is true, jobs are
     *            queued and executed when the number of executing jobs falls
     *            below the concurrent execution limit. If the field is false,
     *            Amazon Transcribe returns a
     *            <code>LimitExceededException</code> exception.
     *            </p>
     *            <p>
     *            Note that job queuing is enabled by default for call analytics
     *            jobs.
     *            </p>
     *            <p>
     *            If you specify the <code>AllowDeferredExecution</code> field,
     *            you must specify the <code>DataAccessRoleArn</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionSettings withAllowDeferredExecution(Boolean allowDeferredExecution) {
        this.allowDeferredExecution = allowDeferredExecution;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN), in the form
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * , of a role that has access to the S3 bucket that contains the input
     * files. Amazon Transcribe assumes this role to read queued media files. If
     * you have specified an output S3 bucket for the transcription results,
     * this role should have access to the output bucket as well.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must
     * specify the <code>DataAccessRoleArn</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN), in the form
     *         <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *         , of a role that has access to the S3 bucket that contains the
     *         input files. Amazon Transcribe assumes this role to read queued
     *         media files. If you have specified an output S3 bucket for the
     *         transcription results, this role should have access to the output
     *         bucket as well.
     *         </p>
     *         <p>
     *         If you specify the <code>AllowDeferredExecution</code> field, you
     *         must specify the <code>DataAccessRoleArn</code> field.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN), in the form
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * , of a role that has access to the S3 bucket that contains the input
     * files. Amazon Transcribe assumes this role to read queued media files. If
     * you have specified an output S3 bucket for the transcription results,
     * this role should have access to the output bucket as well.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must
     * specify the <code>DataAccessRoleArn</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN), in the form
     *            <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *            , of a role that has access to the S3 bucket that contains the
     *            input files. Amazon Transcribe assumes this role to read
     *            queued media files. If you have specified an output S3 bucket
     *            for the transcription results, this role should have access to
     *            the output bucket as well.
     *            </p>
     *            <p>
     *            If you specify the <code>AllowDeferredExecution</code> field,
     *            you must specify the <code>DataAccessRoleArn</code> field.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN), in the form
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * , of a role that has access to the S3 bucket that contains the input
     * files. Amazon Transcribe assumes this role to read queued media files. If
     * you have specified an output S3 bucket for the transcription results,
     * this role should have access to the output bucket as well.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must
     * specify the <code>DataAccessRoleArn</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN), in the form
     *            <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *            , of a role that has access to the S3 bucket that contains the
     *            input files. Amazon Transcribe assumes this role to read
     *            queued media files. If you have specified an output S3 bucket
     *            for the transcription results, this role should have access to
     *            the output bucket as well.
     *            </p>
     *            <p>
     *            If you specify the <code>AllowDeferredExecution</code> field,
     *            you must specify the <code>DataAccessRoleArn</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionSettings withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
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
        if (getAllowDeferredExecution() != null)
            sb.append("AllowDeferredExecution: " + getAllowDeferredExecution() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAllowDeferredExecution() == null) ? 0 : getAllowDeferredExecution()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecutionSettings == false)
            return false;
        JobExecutionSettings other = (JobExecutionSettings) obj;

        if (other.getAllowDeferredExecution() == null ^ this.getAllowDeferredExecution() == null)
            return false;
        if (other.getAllowDeferredExecution() != null
                && other.getAllowDeferredExecution().equals(this.getAllowDeferredExecution()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }
}
