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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create or update an attribute on an Amazon ECS resource. If the attribute
 * does not exist, it is created. If the attribute exists, its value is replaced
 * with the specified value. To delete an attribute, use
 * <a>DeleteAttributes</a>. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
 * >Attributes</a> in the <i>Amazon Elastic Container Service Developer
 * Guide</i>.
 * </p>
 */
public class PutAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * contains the resource to apply attributes. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom
     * attributes per resource. You can specify up to 10 attributes in a single
     * call.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * contains the resource to apply attributes. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that contains the resource to apply attributes. If you do not
     *         specify a cluster, the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * contains the resource to apply attributes. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that contains the resource to apply attributes. If you
     *            do not specify a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * contains the resource to apply attributes. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that contains the resource to apply attributes. If you
     *            do not specify a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAttributesRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom
     * attributes per resource. You can specify up to 10 attributes in a single
     * call.
     * </p>
     *
     * @return <p>
     *         The attributes to apply to your resource. You can specify up to
     *         10 custom attributes per resource. You can specify up to 10
     *         attributes in a single call.
     *         </p>
     */
    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom
     * attributes per resource. You can specify up to 10 attributes in a single
     * call.
     * </p>
     *
     * @param attributes <p>
     *            The attributes to apply to your resource. You can specify up
     *            to 10 custom attributes per resource. You can specify up to 10
     *            attributes in a single call.
     *            </p>
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom
     * attributes per resource. You can specify up to 10 attributes in a single
     * call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes to apply to your resource. You can specify up
     *            to 10 custom attributes per resource. You can specify up to 10
     *            attributes in a single call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAttributesRequest withAttributes(Attribute... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<Attribute>(attributes.length);
        }
        for (Attribute value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom
     * attributes per resource. You can specify up to 10 attributes in a single
     * call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes to apply to your resource. You can specify up
     *            to 10 custom attributes per resource. You can specify up to 10
     *            attributes in a single call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAttributesRequest withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAttributesRequest == false)
            return false;
        PutAttributesRequest other = (PutAttributesRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
