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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds or edits tags on a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
 * >customer managed key</a>.
 * </p>
 * <note>
 * <p>
 * Tagging or untagging a KMS key can allow or deny permission to the KMS key.
 * For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using
 * ABAC in KMS</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * </note>
 * <p>
 * Each tag consists of a tag key and a tag value, both of which are
 * case-sensitive strings. The tag value can be an empty (null) string. To add a
 * tag, specify a new tag key and a tag value. To edit a tag, specify an
 * existing tag key and a new tag value.
 * </p>
 * <p>
 * You can use this operation to tag a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
 * >customer managed key</a>, but you cannot tag an <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
 * >Amazon Web Services managed key</a>, an <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk"
 * >Amazon Web Services owned key</a>, a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#keystore-concept"
 * >custom key store</a>, or an <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#alias-concept"
 * >alias</a>.
 * </p>
 * <p>
 * You can also add tags to a KMS key while creating it (<a>CreateKey</a>) or
 * replicating it (<a>ReplicateKey</a>).
 * </p>
 * <p>
 * For information about using tags in KMS, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
 * >Tagging keys</a>. For general information about tags, including the format
 * and syntax, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging
 * Amazon Web Services resources</a> in the <i>Amazon Web Services General
 * Reference</i>.
 * </p>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key
 * in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:TagResource</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListResourceTags</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ReplicateKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>
 * </p>
 * </li>
 * </ul>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies a customer managed key in the account and Region.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. The tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * Identifies a customer managed key in the account and Region.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Identifies a customer managed key in the account and Region.
     *         </p>
     *         <p>
     *         Specify the key ID or key ARN of the KMS key.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a>
     *         or <a>DescribeKey</a>.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * Identifies a customer managed key in the account and Region.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Identifies a customer managed key in the account and Region.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies a customer managed key in the account and Region.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Identifies a customer managed key in the account and Region.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. The tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     *         <p>
     *         Each tag consists of a tag key and a tag value. The tag value can
     *         be an empty (null) string.
     *         </p>
     *         <p>
     *         You cannot have more than one tag on a KMS key with the same tag
     *         key. If you specify an existing tag key with a different tag
     *         value, KMS replaces the current tag value with the specified one.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. The tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     *            <p>
     *            Each tag consists of a tag key and a tag value. The tag value
     *            can be an empty (null) string.
     *            </p>
     *            <p>
     *            You cannot have more than one tag on a KMS key with the same
     *            tag key. If you specify an existing tag key with a different
     *            tag value, KMS replaces the current tag value with the
     *            specified one.
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
     * One or more tags.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. The tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     *            <p>
     *            Each tag consists of a tag key and a tag value. The tag value
     *            can be an empty (null) string.
     *            </p>
     *            <p>
     *            You cannot have more than one tag on a KMS key with the same
     *            tag key. If you specify an existing tag key with a different
     *            tag value, KMS replaces the current tag value with the
     *            specified one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(Tag... tags) {
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
     * One or more tags.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. The tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     *            <p>
     *            Each tag consists of a tag key and a tag value. The tag value
     *            can be an empty (null) string.
     *            </p>
     *            <p>
     *            You cannot have more than one tag on a KMS key with the same
     *            tag key. If you specify an existing tag key with a different
     *            tag value, KMS replaces the current tag value with the
     *            specified one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
