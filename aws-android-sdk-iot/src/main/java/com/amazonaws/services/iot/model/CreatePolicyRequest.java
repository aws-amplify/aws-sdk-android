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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an IoT policy.
 * </p>
 * <p>
 * The created policy is the default version for the policy. This operation
 * creates a policy version with a version identifier of <b>1</b> and sets
 * <b>1</b> as the policy's default version.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreatePolicy</a> action.
 * </p>
 */
public class CreatePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * <p>
     * The JSON document that describes the policy. <b>policyDocument</b> must
     * have a minimum length of 1, with a maximum length of 2048, excluding
     * whitespace.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The policy name.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The policy name.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The policy name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The JSON document that describes the policy. <b>policyDocument</b> must
     * have a minimum length of 1, with a maximum length of 2048, excluding
     * whitespace.
     * </p>
     *
     * @return <p>
     *         The JSON document that describes the policy.
     *         <b>policyDocument</b> must have a minimum length of 1, with a
     *         maximum length of 2048, excluding whitespace.
     *         </p>
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy. <b>policyDocument</b> must
     * have a minimum length of 1, with a maximum length of 2048, excluding
     * whitespace.
     * </p>
     *
     * @param policyDocument <p>
     *            The JSON document that describes the policy.
     *            <b>policyDocument</b> must have a minimum length of 1, with a
     *            maximum length of 2048, excluding whitespace.
     *            </p>
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy. <b>policyDocument</b> must
     * have a minimum length of 1, with a maximum length of 2048, excluding
     * whitespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDocument <p>
     *            The JSON document that describes the policy.
     *            <b>policyDocument</b> must have a minimum length of 1, with a
     *            maximum length of 2048, excluding whitespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @return <p>
     *         Metadata which can be used to manage the policy.
     *         </p>
     *         <note>
     *         <p>
     *         For URI Request parameters use format:
     *         ...key1=value1&amp;key2=value2...
     *         </p>
     *         <p>
     *         For the CLI command-line parameter use format: &amp;&amp;tags
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         <p>
     *         For the cli-input-json file use format: "tags":
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Metadata which can be used to manage the policy.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
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
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the policy.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withTags(Tag... tags) {
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
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the policy.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPolicyName() != null)
            sb.append("policyName: " + getPolicyName() + ",");
        if (getPolicyDocument() != null)
            sb.append("policyDocument: " + getPolicyDocument() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyRequest == false)
            return false;
        CreatePolicyRequest other = (CreatePolicyRequest) obj;

        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
