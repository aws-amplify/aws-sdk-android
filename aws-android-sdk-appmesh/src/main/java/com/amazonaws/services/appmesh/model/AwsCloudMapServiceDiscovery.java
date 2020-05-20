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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the AWS Cloud Map service discovery information for
 * your virtual node.
 * </p>
 */
public class AwsCloudMapServiceDiscovery implements Serializable {
    /**
     * <p>
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all of the specified
     * key/value pairs will be returned.
     * </p>
     */
    private java.util.List<AwsCloudMapInstanceAttribute> attributes;

    /**
     * <p>
     * The name of the AWS Cloud Map namespace to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^.$)<br/>
     */
    private String namespaceName;

    /**
     * <p>
     * The name of the AWS Cloud Map service to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^.$)<br/>
     */
    private String serviceName;

    /**
     * <p>
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all of the specified
     * key/value pairs will be returned.
     * </p>
     *
     * @return <p>
     *         A string map that contains attributes with values that you can
     *         use to filter instances by any custom attribute that you
     *         specified when you registered the instance. Only instances that
     *         match all of the specified key/value pairs will be returned.
     *         </p>
     */
    public java.util.List<AwsCloudMapInstanceAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all of the specified
     * key/value pairs will be returned.
     * </p>
     *
     * @param attributes <p>
     *            A string map that contains attributes with values that you can
     *            use to filter instances by any custom attribute that you
     *            specified when you registered the instance. Only instances
     *            that match all of the specified key/value pairs will be
     *            returned.
     *            </p>
     */
    public void setAttributes(java.util.Collection<AwsCloudMapInstanceAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<AwsCloudMapInstanceAttribute>(attributes);
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all of the specified
     * key/value pairs will be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A string map that contains attributes with values that you can
     *            use to filter instances by any custom attribute that you
     *            specified when you registered the instance. Only instances
     *            that match all of the specified key/value pairs will be
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudMapServiceDiscovery withAttributes(AwsCloudMapInstanceAttribute... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<AwsCloudMapInstanceAttribute>(
                    attributes.length);
        }
        for (AwsCloudMapInstanceAttribute value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all of the specified
     * key/value pairs will be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A string map that contains attributes with values that you can
     *            use to filter instances by any custom attribute that you
     *            specified when you registered the instance. Only instances
     *            that match all of the specified key/value pairs will be
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudMapServiceDiscovery withAttributes(
            java.util.Collection<AwsCloudMapInstanceAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map namespace to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^.$)<br/>
     *
     * @return <p>
     *         The name of the AWS Cloud Map namespace to use.
     *         </p>
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map namespace to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^.$)<br/>
     *
     * @param namespaceName <p>
     *            The name of the AWS Cloud Map namespace to use.
     *            </p>
     */
    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map namespace to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^.$)<br/>
     *
     * @param namespaceName <p>
     *            The name of the AWS Cloud Map namespace to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudMapServiceDiscovery withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map service to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^.$)<br/>
     *
     * @return <p>
     *         The name of the AWS Cloud Map service to use.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map service to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^.$)<br/>
     *
     * @param serviceName <p>
     *            The name of the AWS Cloud Map service to use.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map service to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^.$)<br/>
     *
     * @param serviceName <p>
     *            The name of the AWS Cloud Map service to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudMapServiceDiscovery withServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getNamespaceName() != null)
            sb.append("namespaceName: " + getNamespaceName() + ",");
        if (getServiceName() != null)
            sb.append("serviceName: " + getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudMapServiceDiscovery == false)
            return false;
        AwsCloudMapServiceDiscovery other = (AwsCloudMapServiceDiscovery) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null
                && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }
}
