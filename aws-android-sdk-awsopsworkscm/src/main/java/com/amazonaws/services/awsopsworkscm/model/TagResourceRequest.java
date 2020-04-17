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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Applies tags to an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet
 * Enterprise server, or to server backups.
 * </p>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Number (ARN) of a resource to which you want to apply
     * tags. For example,
     * <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws.*:opsworks-cm:.*:[0-9]{12}:.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * A map that contains tag keys and tag values to attach to AWS OpsWorks-CM
     * servers or backups.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for any AWS OpsWorks-CM
     * server or backup.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of a resource to which you want to apply
     * tags. For example,
     * <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws.*:opsworks-cm:.*:[0-9]{12}:.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of a resource to which you want
     *         to apply tags. For example,
     *         <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     *         .
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of a resource to which you want to apply
     * tags. For example,
     * <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws.*:opsworks-cm:.*:[0-9]{12}:.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Number (ARN) of a resource to which you
     *            want to apply tags. For example,
     *            <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     *            .
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of a resource to which you want to apply
     * tags. For example,
     * <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws.*:opsworks-cm:.*:[0-9]{12}:.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Number (ARN) of a resource to which you
     *            want to apply tags. For example,
     *            <code>arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values to attach to AWS OpsWorks-CM
     * servers or backups.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for any AWS OpsWorks-CM
     * server or backup.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A map that contains tag keys and tag values to attach to AWS
     *         OpsWorks-CM servers or backups.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key cannot be empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The key can be a maximum of 127 characters, and can contain only
     *         Unicode letters, numbers, or separators, or the following special
     *         characters: <code>+ - = . _ : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value can be a maximum 255 characters, and contain only
     *         Unicode letters, numbers, or separators, or the following special
     *         characters: <code>+ - = . _ : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Leading and trailing white spaces are trimmed from both the key
     *         and value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A maximum of 50 user-applied tags is allowed for any AWS
     *         OpsWorks-CM server or backup.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values to attach to AWS OpsWorks-CM
     * servers or backups.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for any AWS OpsWorks-CM
     * server or backup.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            A map that contains tag keys and tag values to attach to AWS
     *            OpsWorks-CM servers or backups.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The key cannot be empty.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The key can be a maximum of 127 characters, and can contain
     *            only Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value can be a maximum 255 characters, and contain only
     *            Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Leading and trailing white spaces are trimmed from both the
     *            key and value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A maximum of 50 user-applied tags is allowed for any AWS
     *            OpsWorks-CM server or backup.
     *            </p>
     *            </li>
     *            </ul>
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
     * A map that contains tag keys and tag values to attach to AWS OpsWorks-CM
     * servers or backups.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for any AWS OpsWorks-CM
     * server or backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map that contains tag keys and tag values to attach to AWS
     *            OpsWorks-CM servers or backups.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The key cannot be empty.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The key can be a maximum of 127 characters, and can contain
     *            only Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value can be a maximum 255 characters, and contain only
     *            Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Leading and trailing white spaces are trimmed from both the
     *            key and value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A maximum of 50 user-applied tags is allowed for any AWS
     *            OpsWorks-CM server or backup.
     *            </p>
     *            </li>
     *            </ul>
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
     * A map that contains tag keys and tag values to attach to AWS OpsWorks-CM
     * servers or backups.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode
     * letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for any AWS OpsWorks-CM
     * server or backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map that contains tag keys and tag values to attach to AWS
     *            OpsWorks-CM servers or backups.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The key cannot be empty.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The key can be a maximum of 127 characters, and can contain
     *            only Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The value can be a maximum 255 characters, and contain only
     *            Unicode letters, numbers, or separators, or the following
     *            special characters: <code>+ - = . _ : /</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Leading and trailing white spaces are trimmed from both the
     *            key and value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A maximum of 50 user-applied tags is allowed for any AWS
     *            OpsWorks-CM server or backup.
     *            </p>
     *            </li>
     *            </ul>
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
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

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
