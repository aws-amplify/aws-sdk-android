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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an new set of frequently asked question (FAQ) questions and answers.
 * </p>
 */
public class CreateFaqRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String indexId;

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String description;

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     */
    private S3Path s3Path;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3
     * bucket that contains the FAQs. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roleArn;

    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to
     * identify and organize your resources and to control access to resources.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         The identifier of the index that contains the FAQ.
     *         </p>
     */
    public String getIndexId() {
        return indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that contains the FAQ.
     *            </p>
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that contains the FAQ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaqRequest withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The name that should be associated with the FAQ.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name that should be associated with the FAQ.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name that should be associated with the FAQ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaqRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         A description of the FAQ.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            A description of the FAQ.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            A description of the FAQ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaqRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     *
     * @return <p>
     *         The S3 location of the FAQ input data.
     *         </p>
     */
    public S3Path getS3Path() {
        return s3Path;
    }

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     *
     * @param s3Path <p>
     *            The S3 location of the FAQ input data.
     *            </p>
     */
    public void setS3Path(S3Path s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Path <p>
     *            The S3 location of the FAQ input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaqRequest withS3Path(S3Path s3Path) {
        this.s3Path = s3Path;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3
     * bucket that contains the FAQs. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a role with permission to
     *         access the S3 bucket that contains the FAQs. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     *         Roles for Amazon Kendra</a>.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3
     * bucket that contains the FAQs. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of a role with permission to
     *            access the S3 bucket that contains the FAQs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html"
     *            >IAM Roles for Amazon Kendra</a>.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3
     * bucket that contains the FAQs. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of a role with permission to
     *            access the S3 bucket that contains the FAQs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html"
     *            >IAM Roles for Amazon Kendra</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaqRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to
     * identify and organize your resources and to control access to resources.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that identify the FAQ. You can use the
     *         tags to identify and organize your resources and to control
     *         access to resources.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to
     * identify and organize your resources and to control access to resources.
     * </p>
     *
     * @param tags <p>
     *            A list of key-value pairs that identify the FAQ. You can use
     *            the tags to identify and organize your resources and to
     *            control access to resources.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to
     * identify and organize your resources and to control access to resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs that identify the FAQ. You can use
     *            the tags to identify and organize your resources and to
     *            control access to resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaqRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to
     * identify and organize your resources and to control access to resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs that identify the FAQ. You can use
     *            the tags to identify and organize your resources and to
     *            control access to resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaqRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getIndexId() != null)
            sb.append("IndexId: " + getIndexId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getS3Path() != null)
            sb.append("S3Path: " + getS3Path() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFaqRequest == false)
            return false;
        CreateFaqRequest other = (CreateFaqRequest) obj;

        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
