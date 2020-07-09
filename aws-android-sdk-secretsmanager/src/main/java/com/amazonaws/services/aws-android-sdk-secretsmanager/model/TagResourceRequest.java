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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Attaches one or more tags, each consisting of a key name and a value, to the specified secret. Tags are part of the secret's overall metadata, and are not associated with any specific version of the secret. This operation only appends tags to the existing list of tags. To remove tags, you must use <a>UntagResource</a>.</p> <p>The following basic restrictions apply to tags:</p> <ul> <li> <p>Maximum number of tags per secret—50</p> </li> <li> <p>Maximum key length—127 Unicode characters in UTF-8</p> </li> <li> <p>Maximum value length—255 Unicode characters in UTF-8</p> </li> <li> <p>Tag keys and values are case sensitive.</p> </li> <li> <p>Do not use the <code>aws:</code> prefix in your tag names or values because AWS reserves it for AWS use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do not count against your tags per secret limit.</p> </li> <li> <p>If you use your tagging schema across multiple services and resources, remember other services might have restrictions on allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the following special characters: + - = . _ : / @.</p> </li> </ul> <important> <p>If you use tags as part of your security strategy, then adding or removing a tag can change permissions. If successfully completing this operation would result in you losing your permissions for this secret, then the operation is blocked and returns an Access Denied error.</p> </important> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:TagResource</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To remove one or more tags from the collection attached to a secret, use <a>UntagResource</a>.</p> </li> <li> <p>To view the list of tags attached to a secret, use <a>DescribeSecret</a>.</p> </li> </ul>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String secretId;

    /**
     * <p>The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a <code>Value</code>.</p> <p>This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax: <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code> </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * <p>The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public TagResourceRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * <p>The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a <code>Value</code>.</p> <p>This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax: <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code> </p>
     *
     * @return <p>The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a <code>Value</code>.</p> <p>This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax: <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code> </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a <code>Value</code>.</p> <p>This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax: <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code> </p>
     *
     * @param tags <p>The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a <code>Value</code>.</p> <p>This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax: <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code> </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a <code>Value</code>.</p> <p>This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax: <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code> </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a <code>Value</code>.</p> <p>This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax: <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code> </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
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
     * <p>The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a <code>Value</code>.</p> <p>This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax: <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code> </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a <code>Value</code>.</p> <p>This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax: <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code> </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSecretId() != null) sb.append("SecretId: " + getSecretId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TagResourceRequest == false) return false;
        TagResourceRequest other = (TagResourceRequest)obj;

        if (other.getSecretId() == null ^ this.getSecretId() == null) return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        return true;
    }
}
