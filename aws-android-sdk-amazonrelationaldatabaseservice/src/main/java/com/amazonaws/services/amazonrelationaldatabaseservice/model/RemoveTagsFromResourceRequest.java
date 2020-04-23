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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes metadata tags from an Amazon RDS resource.
 * </p>
 * <p>
 * For an overview on tagging an Amazon RDS resource, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"
 * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
 * </p>
 */
public class RemoveTagsFromResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon RDS resource that the tags are removed from. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The Amazon RDS resource that the tags are removed from. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     *
     * @return <p>
     *         The Amazon RDS resource that the tags are removed from. This
     *         value is an Amazon Resource Name (ARN). For information about
     *         creating an ARN, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS
     *         User Guide.</i>
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The Amazon RDS resource that the tags are removed from. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     *
     * @param resourceName <p>
     *            The Amazon RDS resource that the tags are removed from. This
     *            value is an Amazon Resource Name (ARN). For information about
     *            creating an ARN, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *            > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS
     *            User Guide.</i>
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon RDS resource that the tags are removed from. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceName <p>
     *            The Amazon RDS resource that the tags are removed from. This
     *            value is an Amazon Resource Name (ARN). For information about
     *            creating an ARN, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *            > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS
     *            User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     *
     * @return <p>
     *         The tag key (name) of the tag to be removed.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     *
     * @param tagKeys <p>
     *            The tag key (name) of the tag to be removed.
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
     * The tag key (name) of the tag to be removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The tag key (name) of the tag to be removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
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
     * The tag key (name) of the tag to be removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The tag key (name) of the tag to be removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
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
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false)
            return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest) obj;

        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
