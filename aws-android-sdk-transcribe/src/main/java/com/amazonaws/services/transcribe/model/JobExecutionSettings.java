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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Makes it possible to control how your transcription job is processed.
 * Currently, the only <code>JobExecutionSettings</code> modification you can
 * choose is enabling job queueing using the <code>AllowDeferredExecution</code>
 * sub-parameter.
 * </p>
 * <p>
 * If you include <code>JobExecutionSettings</code> in your request, you must
 * also include the sub-parameters: <code>AllowDeferredExecution</code> and
 * <code>DataAccessRoleArn</code>.
 * </p>
 */
public class JobExecutionSettings implements Serializable {
    /**
     * <p>
     * Makes it possible to enable job queuing when your concurrent request
     * limit is exceeded. When <code>AllowDeferredExecution</code> is set to
     * <code>true</code>, transcription job requests are placed in a queue until
     * the number of jobs falls below the concurrent request limit. If
     * <code>AllowDeferredExecution</code> is set to <code>false</code> and the
     * number of transcription job requests exceed the concurrent request limit,
     * you get a <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you
     * must also include <code>DataAccessRoleArn</code>.
     * </p>
     */
    private Boolean allowDeferredExecution;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files. If the role
     * that you specify doesn’t have the appropriate permissions to access the
     * specified Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * Note that if you include <code>DataAccessRoleArn</code> in your request,
     * you must also include <code>AllowDeferredExecution</code>.
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
     * Makes it possible to enable job queuing when your concurrent request
     * limit is exceeded. When <code>AllowDeferredExecution</code> is set to
     * <code>true</code>, transcription job requests are placed in a queue until
     * the number of jobs falls below the concurrent request limit. If
     * <code>AllowDeferredExecution</code> is set to <code>false</code> and the
     * number of transcription job requests exceed the concurrent request limit,
     * you get a <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you
     * must also include <code>DataAccessRoleArn</code>.
     * </p>
     *
     * @return <p>
     *         Makes it possible to enable job queuing when your concurrent
     *         request limit is exceeded. When
     *         <code>AllowDeferredExecution</code> is set to <code>true</code>,
     *         transcription job requests are placed in a queue until the number
     *         of jobs falls below the concurrent request limit. If
     *         <code>AllowDeferredExecution</code> is set to <code>false</code>
     *         and the number of transcription job requests exceed the
     *         concurrent request limit, you get a
     *         <code>LimitExceededException</code> error.
     *         </p>
     *         <p>
     *         If you include <code>AllowDeferredExecution</code> in your
     *         request, you must also include <code>DataAccessRoleArn</code>.
     *         </p>
     */
    public Boolean isAllowDeferredExecution() {
        return allowDeferredExecution;
    }

    /**
     * <p>
     * Makes it possible to enable job queuing when your concurrent request
     * limit is exceeded. When <code>AllowDeferredExecution</code> is set to
     * <code>true</code>, transcription job requests are placed in a queue until
     * the number of jobs falls below the concurrent request limit. If
     * <code>AllowDeferredExecution</code> is set to <code>false</code> and the
     * number of transcription job requests exceed the concurrent request limit,
     * you get a <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you
     * must also include <code>DataAccessRoleArn</code>.
     * </p>
     *
     * @return <p>
     *         Makes it possible to enable job queuing when your concurrent
     *         request limit is exceeded. When
     *         <code>AllowDeferredExecution</code> is set to <code>true</code>,
     *         transcription job requests are placed in a queue until the number
     *         of jobs falls below the concurrent request limit. If
     *         <code>AllowDeferredExecution</code> is set to <code>false</code>
     *         and the number of transcription job requests exceed the
     *         concurrent request limit, you get a
     *         <code>LimitExceededException</code> error.
     *         </p>
     *         <p>
     *         If you include <code>AllowDeferredExecution</code> in your
     *         request, you must also include <code>DataAccessRoleArn</code>.
     *         </p>
     */
    public Boolean getAllowDeferredExecution() {
        return allowDeferredExecution;
    }

    /**
     * <p>
     * Makes it possible to enable job queuing when your concurrent request
     * limit is exceeded. When <code>AllowDeferredExecution</code> is set to
     * <code>true</code>, transcription job requests are placed in a queue until
     * the number of jobs falls below the concurrent request limit. If
     * <code>AllowDeferredExecution</code> is set to <code>false</code> and the
     * number of transcription job requests exceed the concurrent request limit,
     * you get a <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you
     * must also include <code>DataAccessRoleArn</code>.
     * </p>
     *
     * @param allowDeferredExecution <p>
     *            Makes it possible to enable job queuing when your concurrent
     *            request limit is exceeded. When
     *            <code>AllowDeferredExecution</code> is set to
     *            <code>true</code>, transcription job requests are placed in a
     *            queue until the number of jobs falls below the concurrent
     *            request limit. If <code>AllowDeferredExecution</code> is set
     *            to <code>false</code> and the number of transcription job
     *            requests exceed the concurrent request limit, you get a
     *            <code>LimitExceededException</code> error.
     *            </p>
     *            <p>
     *            If you include <code>AllowDeferredExecution</code> in your
     *            request, you must also include <code>DataAccessRoleArn</code>.
     *            </p>
     */
    public void setAllowDeferredExecution(Boolean allowDeferredExecution) {
        this.allowDeferredExecution = allowDeferredExecution;
    }

    /**
     * <p>
     * Makes it possible to enable job queuing when your concurrent request
     * limit is exceeded. When <code>AllowDeferredExecution</code> is set to
     * <code>true</code>, transcription job requests are placed in a queue until
     * the number of jobs falls below the concurrent request limit. If
     * <code>AllowDeferredExecution</code> is set to <code>false</code> and the
     * number of transcription job requests exceed the concurrent request limit,
     * you get a <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you
     * must also include <code>DataAccessRoleArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowDeferredExecution <p>
     *            Makes it possible to enable job queuing when your concurrent
     *            request limit is exceeded. When
     *            <code>AllowDeferredExecution</code> is set to
     *            <code>true</code>, transcription job requests are placed in a
     *            queue until the number of jobs falls below the concurrent
     *            request limit. If <code>AllowDeferredExecution</code> is set
     *            to <code>false</code> and the number of transcription job
     *            requests exceed the concurrent request limit, you get a
     *            <code>LimitExceededException</code> error.
     *            </p>
     *            <p>
     *            If you include <code>AllowDeferredExecution</code> in your
     *            request, you must also include <code>DataAccessRoleArn</code>.
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
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files. If the role
     * that you specify doesn’t have the appropriate permissions to access the
     * specified Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * Note that if you include <code>DataAccessRoleArn</code> in your request,
     * you must also include <code>AllowDeferredExecution</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an IAM role that has
     *         permissions to access the Amazon S3 bucket that contains your
     *         input files. If the role that you specify doesn’t have the
     *         appropriate permissions to access the specified Amazon S3
     *         location, your request fails.
     *         </p>
     *         <p>
     *         IAM role ARNs have the format
     *         <code>arn:partition:iam::account:role/role-name-with-path</code>.
     *         For example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *         >IAM ARNs</a>.
     *         </p>
     *         <p>
     *         Note that if you include <code>DataAccessRoleArn</code> in your
     *         request, you must also include
     *         <code>AllowDeferredExecution</code>.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files. If the role
     * that you specify doesn’t have the appropriate permissions to access the
     * specified Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * Note that if you include <code>DataAccessRoleArn</code> in your request,
     * you must also include <code>AllowDeferredExecution</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that has
     *            permissions to access the Amazon S3 bucket that contains your
     *            input files. If the role that you specify doesn’t have the
     *            appropriate permissions to access the specified Amazon S3
     *            location, your request fails.
     *            </p>
     *            <p>
     *            IAM role ARNs have the format
     *            <code>arn:partition:iam::account:role/role-name-with-path</code>
     *            . For example:
     *            <code>arn:aws:iam::111122223333:role/Admin</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
     *            </p>
     *            <p>
     *            Note that if you include <code>DataAccessRoleArn</code> in
     *            your request, you must also include
     *            <code>AllowDeferredExecution</code>.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files. If the role
     * that you specify doesn’t have the appropriate permissions to access the
     * specified Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * Note that if you include <code>DataAccessRoleArn</code> in your request,
     * you must also include <code>AllowDeferredExecution</code>.
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
     *            The Amazon Resource Name (ARN) of an IAM role that has
     *            permissions to access the Amazon S3 bucket that contains your
     *            input files. If the role that you specify doesn’t have the
     *            appropriate permissions to access the specified Amazon S3
     *            location, your request fails.
     *            </p>
     *            <p>
     *            IAM role ARNs have the format
     *            <code>arn:partition:iam::account:role/role-name-with-path</code>
     *            . For example:
     *            <code>arn:aws:iam::111122223333:role/Admin</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
     *            </p>
     *            <p>
     *            Note that if you include <code>DataAccessRoleArn</code> in
     *            your request, you must also include
     *            <code>AllowDeferredExecution</code>.
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
