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
 * Deletes tags from a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
 * >customer managed key</a>. To delete a tag, specify the tag key and the KMS
 * key.
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
 * When it succeeds, the <code>UntagResource</code> operation doesn't return any
 * output. Also, if the specified tag key isn't found on the KMS key, it doesn't
 * throw an exception or return a response. To confirm that the operation
 * worked, use the <a>ListResourceTags</a> operation.
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
 * >kms:UntagResource</a> (key policy)
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
 * <a>TagResource</a>
 * </p>
 * </li>
 * </ul>
 */
public class UntagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the KMS key from which you are removing tags.
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
     * One or more tag keys. Specify only the tag keys, not the tag values.
     * </p>
     */
    private java.util.List<String> tagKeys = new java.util.ArrayList<String>();

    /**
     * <p>
     * Identifies the KMS key from which you are removing tags.
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
     *         Identifies the KMS key from which you are removing tags.
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
     * Identifies the KMS key from which you are removing tags.
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
     *            Identifies the KMS key from which you are removing tags.
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
     * Identifies the KMS key from which you are removing tags.
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
     *            Identifies the KMS key from which you are removing tags.
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
    public UntagResourceRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * One or more tag keys. Specify only the tag keys, not the tag values.
     * </p>
     *
     * @return <p>
     *         One or more tag keys. Specify only the tag keys, not the tag
     *         values.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * One or more tag keys. Specify only the tag keys, not the tag values.
     * </p>
     *
     * @param tagKeys <p>
     *            One or more tag keys. Specify only the tag keys, not the tag
     *            values.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * One or more tag keys. Specify only the tag keys, not the tag values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            One or more tag keys. Specify only the tag keys, not the tag
     *            values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more tag keys. Specify only the tag keys, not the tag values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            One or more tag keys. Specify only the tag keys, not the tag
     *            values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
