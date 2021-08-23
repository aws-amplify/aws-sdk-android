/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Sets whether or not your output will go to a user created bucket. Used to set
 * the name of the bucket, and the prefix on the output file.
 * </p>
 * <p>
 * <code>OutputConfig</code> is an optional parameter which lets you adjust
 * where your output will be placed. By default, Amazon Textract will store the
 * results internally and can only be accessed by the Get API operations. With
 * OutputConfig enabled, you can set the name of the bucket the output will be
 * sent to and the file prefix of the results where you can download your
 * results. Additionally, you can set the <code>KMSKeyID</code> parameter to a
 * customer master key (CMK) to encrypt your output. Without this parameter set
 * Amazon Textract will encrypt server-side using the AWS managed CMK for Amazon
 * S3.
 * </p>
 * <p>
 * Decryption of Customer Content is necessary for processing of the documents
 * by Amazon Textract. If your account is opted out under an AI services opt out
 * policy then all unencrypted Customer Content is immediately and permanently
 * deleted after the Customer Content has been processed by the service. No copy
 * of of the output is retained by Amazon Textract. For information about how to
 * opt out, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html"
 * > Managing AI services opt-out policy. </a>
 * </p>
 * <p>
 * For more information on data privacy, see the <a
 * href="https://aws.amazon.com/compliance/data-privacy-faq/">Data Privacy
 * FAQ</a>.
 * </p>
 */
public class OutputConfig implements Serializable {
    /**
     * <p>
     * The name of the bucket your output will go to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     */
    private String s3Bucket;

    /**
     * <p>
     * The prefix of the object key that the output will be saved to. When not
     * enabled, the prefix will be “textract_output".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String s3Prefix;

    /**
     * <p>
     * The name of the bucket your output will go to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     *
     * @return <p>
     *         The name of the bucket your output will go to.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * The name of the bucket your output will go to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     *
     * @param s3Bucket <p>
     *            The name of the bucket your output will go to.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the bucket your output will go to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     *
     * @param s3Bucket <p>
     *            The name of the bucket your output will go to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputConfig withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * The prefix of the object key that the output will be saved to. When not
     * enabled, the prefix will be “textract_output".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The prefix of the object key that the output will be saved to.
     *         When not enabled, the prefix will be “textract_output".
     *         </p>
     */
    public String getS3Prefix() {
        return s3Prefix;
    }

    /**
     * <p>
     * The prefix of the object key that the output will be saved to. When not
     * enabled, the prefix will be “textract_output".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param s3Prefix <p>
     *            The prefix of the object key that the output will be saved to.
     *            When not enabled, the prefix will be “textract_output".
     *            </p>
     */
    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The prefix of the object key that the output will be saved to. When not
     * enabled, the prefix will be “textract_output".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param s3Prefix <p>
     *            The prefix of the object key that the output will be saved to.
     *            When not enabled, the prefix will be “textract_output".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputConfig withS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: " + getS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputConfig == false)
            return false;
        OutputConfig other = (OutputConfig) obj;

        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        return true;
    }
}
