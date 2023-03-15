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
 * Contains the Amazon S3 location of the training data you want to use to
 * create a new custom language model, and permissions to access this location.
 * </p>
 * <p>
 * When using <code>InputDataConfig</code>, you must include these
 * sub-parameters: <code>S3Uri</code> and <code>DataAccessRoleArn</code>. You
 * can optionally include <code>TuningDataS3Uri</code>.
 * </p>
 */
public class InputDataConfig implements Serializable {
    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to train
     * your custom language model.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to tune
     * your custom language model.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String tuningDataS3Uri;

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
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
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
     * The Amazon S3 location (URI) of the text files you want to use to train
     * your custom language model.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location (URI) of the text files you want to use to
     *         train your custom language model.
     *         </p>
     *         <p>
     *         Here's an example URI path:
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to train
     * your custom language model.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param s3Uri <p>
     *            The Amazon S3 location (URI) of the text files you want to use
     *            to train your custom language model.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to train
     * your custom language model.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param s3Uri <p>
     *            The Amazon S3 location (URI) of the text files you want to use
     *            to train your custom language model.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
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
     * The Amazon S3 location (URI) of the text files you want to use to tune
     * your custom language model.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location (URI) of the text files you want to use to
     *         tune your custom language model.
     *         </p>
     *         <p>
     *         Here's an example URI path:
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     *         </p>
     */
    public String getTuningDataS3Uri() {
        return tuningDataS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to tune
     * your custom language model.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param tuningDataS3Uri <p>
     *            The Amazon S3 location (URI) of the text files you want to use
     *            to tune your custom language model.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     *            </p>
     */
    public void setTuningDataS3Uri(String tuningDataS3Uri) {
        this.tuningDataS3Uri = tuningDataS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to tune
     * your custom language model.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param tuningDataS3Uri <p>
     *            The Amazon S3 location (URI) of the text files you want to use
     *            to tune your custom language model.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDataConfig withTuningDataS3Uri(String tuningDataS3Uri) {
        this.tuningDataS3Uri = tuningDataS3Uri;
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
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
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
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *         >IAM ARNs</a>.
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
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
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
     *            <code>arn:aws:iam::111122223333:role/Admin</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
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
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
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
     *            <code>arn:aws:iam::111122223333:role/Admin</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDataConfig withDataAccessRoleArn(String dataAccessRoleArn) {
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
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getTuningDataS3Uri() != null)
            sb.append("TuningDataS3Uri: " + getTuningDataS3Uri() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getTuningDataS3Uri() == null) ? 0 : getTuningDataS3Uri().hashCode());
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

        if (obj instanceof InputDataConfig == false)
            return false;
        InputDataConfig other = (InputDataConfig) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getTuningDataS3Uri() == null ^ this.getTuningDataS3Uri() == null)
            return false;
        if (other.getTuningDataS3Uri() != null
                && other.getTuningDataS3Uri().equals(this.getTuningDataS3Uri()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }
}
