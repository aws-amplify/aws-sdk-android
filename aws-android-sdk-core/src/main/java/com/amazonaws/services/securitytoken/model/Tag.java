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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/**
 * <p>
 * You can pass custom key-value pair attributes when you assume a role or
 * federate a user. These are called session tags. You can then use the session
 * tags to control access to resources. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
 * >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class Tag implements Serializable {
    /**
     * <p>
     * The key for a session tag.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag keys can’t
     * exceed 128 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]+<br/>
     */
    private String key;

    /**
     * <p>
     * The value for a session tag.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]*<br/>
     */
    private String value;

    /**
     * <p>
     * The key for a session tag.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag keys can’t
     * exceed 128 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]+<br/>
     *
     * @return <p>
     *         The key for a session tag.
     *         </p>
     *         <p>
     *         You can pass up to 50 session tags. The plain text session tag
     *         keys can’t exceed 128 characters. For these and additional
     *         limits, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *         >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key for a session tag.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag keys can’t
     * exceed 128 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]+<br/>
     *
     * @param key <p>
     *            The key for a session tag.
     *            </p>
     *            <p>
     *            You can pass up to 50 session tags. The plain text session tag
     *            keys can’t exceed 128 characters. For these and additional
     *            limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for a session tag.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag keys can’t
     * exceed 128 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]+<br/>
     *
     * @param key <p>
     *            The key for a session tag.
     *            </p>
     *            <p>
     *            You can pass up to 50 session tags. The plain text session tag
     *            keys can’t exceed 128 characters. For these and additional
     *            limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The value for a session tag.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]*<br/>
     *
     * @return <p>
     *         The value for a session tag.
     *         </p>
     *         <p>
     *         You can pass up to 50 session tags. The plain text session tag
     *         values can’t exceed 256 characters. For these and additional
     *         limits, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *         >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value for a session tag.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]*<br/>
     *
     * @param value <p>
     *            The value for a session tag.
     *            </p>
     *            <p>
     *            You can pass up to 50 session tags. The plain text session tag
     *            values can’t exceed 256 characters. For these and additional
     *            limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for a session tag.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{Z}\p{N}_.:/=+\-@]*<br/>
     *
     * @param value <p>
     *            The value for a session tag.
     *            </p>
     *            <p>
     *            You can pass up to 50 session tags. The plain text session tag
     *            values can’t exceed 256 characters. For these and additional
     *            limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tag withValue(String value) {
        this.value = value;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
