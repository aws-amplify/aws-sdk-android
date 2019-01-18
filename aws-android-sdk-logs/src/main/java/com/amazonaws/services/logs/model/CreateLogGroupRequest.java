/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a log group with the specified name.
 * </p>
 * <p>
 * You can create up to 5000 log groups per account.
 * </p>
 * <p>
 * You must use the following guidelines when naming a log group:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Log group names must be unique within a region for an AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Log group names can be between 1 and 512 characters long.
 * </p>
 * </li>
 * <li>
 * <p>
 * Log group names consist of the following characters: a-z, A-Z, 0-9, '_'
 * (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you associate a AWS Key Management Service (AWS KMS) customer master key
 * (CMK) with the log group, ingested data is encrypted using the CMK. This
 * association is stored as long as the data encrypted with the CMK is still
 * within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt
 * this data whenever it is requested.
 * </p>
 * <p>
 * If you attempt to associate a CMK with the log group but the CMK does not
 * exist or the CMK is disabled, you will receive an
 * <code>InvalidParameterException</code> error.
 * </p>
 */
public class CreateLogGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log
     * data. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >Amazon Resource Names - AWS Key Management Service (AWS KMS)</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The key-value pairs to use for the tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * Default constructor for CreateLogGroupRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public CreateLogGroupRequest() {
    }

    /**
     * Constructs a new CreateLogGroupRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     */
    public CreateLogGroupRequest(String logGroupName) {
        setLogGroupName(logGroupName);
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The name of the log group.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLogGroupRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log
     * data. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >Amazon Resource Names - AWS Key Management Service (AWS KMS)</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the CMK to use when encrypting
     *         log data. For more information, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     *         >Amazon Resource Names - AWS Key Management Service (AWS
     *         KMS)</a>.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log
     * data. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >Amazon Resource Names - AWS Key Management Service (AWS KMS)</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of the CMK to use when
     *            encrypting log data. For more information, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     *            >Amazon Resource Names - AWS Key Management Service (AWS
     *            KMS)</a>.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log
     * data. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >Amazon Resource Names - AWS Key Management Service (AWS KMS)</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of the CMK to use when
     *            encrypting log data. For more information, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     *            >Amazon Resource Names - AWS Key Management Service (AWS
     *            KMS)</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLogGroupRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The key-value pairs to use for the tags.
     * </p>
     *
     * @return <p>
     *         The key-value pairs to use for the tags.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to use for the tags.
     * </p>
     *
     * @param tags <p>
     *            The key-value pairs to use for the tags.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value pairs to use for the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value pairs to use for the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLogGroupRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The key-value pairs to use for the tags.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLogGroupRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateLogGroupRequest cleartagsEntries() {
        this.tags = null;
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
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName() + ",");
        if (getKmsKeyId() != null)
            sb.append("kmsKeyId: " + getKmsKeyId() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLogGroupRequest == false)
            return false;
        CreateLogGroupRequest other = (CreateLogGroupRequest) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
