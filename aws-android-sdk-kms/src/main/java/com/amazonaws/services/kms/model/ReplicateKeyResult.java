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

public class ReplicateKeyResult implements Serializable {
    /**
     * <p>
     * Displays details about the new replica key, including its Amazon Resource
     * Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >key state</a>. It also includes the ARN and Amazon Web Services Region
     * of its primary key and other replica keys.
     * </p>
     */
    private KeyMetadata replicaKeyMetadata;

    /**
     * <p>
     * The key policy of the new replica key. The value is a key policy document
     * in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String replicaPolicy;

    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag
     * value pairs.
     * </p>
     */
    private java.util.List<Tag> replicaTags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * Displays details about the new replica key, including its Amazon Resource
     * Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >key state</a>. It also includes the ARN and Amazon Web Services Region
     * of its primary key and other replica keys.
     * </p>
     *
     * @return <p>
     *         Displays details about the new replica key, including its Amazon
     *         Resource Name (<a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *         >key ARN</a>) and <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >key state</a>. It also includes the ARN and Amazon Web Services
     *         Region of its primary key and other replica keys.
     *         </p>
     */
    public KeyMetadata getReplicaKeyMetadata() {
        return replicaKeyMetadata;
    }

    /**
     * <p>
     * Displays details about the new replica key, including its Amazon Resource
     * Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >key state</a>. It also includes the ARN and Amazon Web Services Region
     * of its primary key and other replica keys.
     * </p>
     *
     * @param replicaKeyMetadata <p>
     *            Displays details about the new replica key, including its
     *            Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >key state</a>. It also includes the ARN and Amazon Web
     *            Services Region of its primary key and other replica keys.
     *            </p>
     */
    public void setReplicaKeyMetadata(KeyMetadata replicaKeyMetadata) {
        this.replicaKeyMetadata = replicaKeyMetadata;
    }

    /**
     * <p>
     * Displays details about the new replica key, including its Amazon Resource
     * Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >key state</a>. It also includes the ARN and Amazon Web Services Region
     * of its primary key and other replica keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaKeyMetadata <p>
     *            Displays details about the new replica key, including its
     *            Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >key state</a>. It also includes the ARN and Amazon Web
     *            Services Region of its primary key and other replica keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyResult withReplicaKeyMetadata(KeyMetadata replicaKeyMetadata) {
        this.replicaKeyMetadata = replicaKeyMetadata;
        return this;
    }

    /**
     * <p>
     * The key policy of the new replica key. The value is a key policy document
     * in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The key policy of the new replica key. The value is a key policy
     *         document in JSON format.
     *         </p>
     */
    public String getReplicaPolicy() {
        return replicaPolicy;
    }

    /**
     * <p>
     * The key policy of the new replica key. The value is a key policy document
     * in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param replicaPolicy <p>
     *            The key policy of the new replica key. The value is a key
     *            policy document in JSON format.
     *            </p>
     */
    public void setReplicaPolicy(String replicaPolicy) {
        this.replicaPolicy = replicaPolicy;
    }

    /**
     * <p>
     * The key policy of the new replica key. The value is a key policy document
     * in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param replicaPolicy <p>
     *            The key policy of the new replica key. The value is a key
     *            policy document in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyResult withReplicaPolicy(String replicaPolicy) {
        this.replicaPolicy = replicaPolicy;
        return this;
    }

    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag
     * value pairs.
     * </p>
     *
     * @return <p>
     *         The tags on the new replica key. The value is a list of tag key
     *         and tag value pairs.
     *         </p>
     */
    public java.util.List<Tag> getReplicaTags() {
        return replicaTags;
    }

    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag
     * value pairs.
     * </p>
     *
     * @param replicaTags <p>
     *            The tags on the new replica key. The value is a list of tag
     *            key and tag value pairs.
     *            </p>
     */
    public void setReplicaTags(java.util.Collection<Tag> replicaTags) {
        if (replicaTags == null) {
            this.replicaTags = null;
            return;
        }

        this.replicaTags = new java.util.ArrayList<Tag>(replicaTags);
    }

    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag
     * value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaTags <p>
     *            The tags on the new replica key. The value is a list of tag
     *            key and tag value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyResult withReplicaTags(Tag... replicaTags) {
        if (getReplicaTags() == null) {
            this.replicaTags = new java.util.ArrayList<Tag>(replicaTags.length);
        }
        for (Tag value : replicaTags) {
            this.replicaTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag
     * value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaTags <p>
     *            The tags on the new replica key. The value is a list of tag
     *            key and tag value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyResult withReplicaTags(java.util.Collection<Tag> replicaTags) {
        setReplicaTags(replicaTags);
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
        if (getReplicaKeyMetadata() != null)
            sb.append("ReplicaKeyMetadata: " + getReplicaKeyMetadata() + ",");
        if (getReplicaPolicy() != null)
            sb.append("ReplicaPolicy: " + getReplicaPolicy() + ",");
        if (getReplicaTags() != null)
            sb.append("ReplicaTags: " + getReplicaTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicaKeyMetadata() == null) ? 0 : getReplicaKeyMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaPolicy() == null) ? 0 : getReplicaPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaTags() == null) ? 0 : getReplicaTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicateKeyResult == false)
            return false;
        ReplicateKeyResult other = (ReplicateKeyResult) obj;

        if (other.getReplicaKeyMetadata() == null ^ this.getReplicaKeyMetadata() == null)
            return false;
        if (other.getReplicaKeyMetadata() != null
                && other.getReplicaKeyMetadata().equals(this.getReplicaKeyMetadata()) == false)
            return false;
        if (other.getReplicaPolicy() == null ^ this.getReplicaPolicy() == null)
            return false;
        if (other.getReplicaPolicy() != null
                && other.getReplicaPolicy().equals(this.getReplicaPolicy()) == false)
            return false;
        if (other.getReplicaTags() == null ^ this.getReplicaTags() == null)
            return false;
        if (other.getReplicaTags() != null
                && other.getReplicaTags().equals(this.getReplicaTags()) == false)
            return false;
        return true;
    }
}
