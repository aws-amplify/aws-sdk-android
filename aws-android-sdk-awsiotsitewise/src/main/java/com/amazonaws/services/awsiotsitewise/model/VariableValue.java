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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Identifies a property value used in an expression.
 * </p>
 */
public class VariableValue implements Serializable {
    /**
     * <p>
     * The ID of the property to use as the variable. You can use the property
     * <code>name</code> if it's from the same asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String propertyId;

    /**
     * <p>
     * The ID of the hierarchy to query for the property ID. You can use the
     * hierarchy's name instead of the hierarchy's ID.
     * </p>
     * <p>
     * You use a hierarchy ID instead of a model ID because you can have several
     * hierarchies using the same model and therefore the same
     * <code>propertyId</code>. For example, you might have separately grouped
     * assets that come from the same asset model. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     * >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String hierarchyId;

    /**
     * <p>
     * The ID of the property to use as the variable. You can use the property
     * <code>name</code> if it's from the same asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The ID of the property to use as the variable. You can use the
     *         property <code>name</code> if it's from the same asset model.
     *         </p>
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * <p>
     * The ID of the property to use as the variable. You can use the property
     * <code>name</code> if it's from the same asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyId <p>
     *            The ID of the property to use as the variable. You can use the
     *            property <code>name</code> if it's from the same asset model.
     *            </p>
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the property to use as the variable. You can use the property
     * <code>name</code> if it's from the same asset model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyId <p>
     *            The ID of the property to use as the variable. You can use the
     *            property <code>name</code> if it's from the same asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VariableValue withPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /**
     * <p>
     * The ID of the hierarchy to query for the property ID. You can use the
     * hierarchy's name instead of the hierarchy's ID.
     * </p>
     * <p>
     * You use a hierarchy ID instead of a model ID because you can have several
     * hierarchies using the same model and therefore the same
     * <code>propertyId</code>. For example, you might have separately grouped
     * assets that come from the same asset model. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     * >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The ID of the hierarchy to query for the property ID. You can use
     *         the hierarchy's name instead of the hierarchy's ID.
     *         </p>
     *         <p>
     *         You use a hierarchy ID instead of a model ID because you can have
     *         several hierarchies using the same model and therefore the same
     *         <code>propertyId</code>. For example, you might have separately
     *         grouped assets that come from the same asset model. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     *         >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     */
    public String getHierarchyId() {
        return hierarchyId;
    }

    /**
     * <p>
     * The ID of the hierarchy to query for the property ID. You can use the
     * hierarchy's name instead of the hierarchy's ID.
     * </p>
     * <p>
     * You use a hierarchy ID instead of a model ID because you can have several
     * hierarchies using the same model and therefore the same
     * <code>propertyId</code>. For example, you might have separately grouped
     * assets that come from the same asset model. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     * >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param hierarchyId <p>
     *            The ID of the hierarchy to query for the property ID. You can
     *            use the hierarchy's name instead of the hierarchy's ID.
     *            </p>
     *            <p>
     *            You use a hierarchy ID instead of a model ID because you can
     *            have several hierarchies using the same model and therefore
     *            the same <code>propertyId</code>. For example, you might have
     *            separately grouped assets that come from the same asset model.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     *            >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     */
    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /**
     * <p>
     * The ID of the hierarchy to query for the property ID. You can use the
     * hierarchy's name instead of the hierarchy's ID.
     * </p>
     * <p>
     * You use a hierarchy ID instead of a model ID because you can have several
     * hierarchies using the same model and therefore the same
     * <code>propertyId</code>. For example, you might have separately grouped
     * assets that come from the same asset model. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     * >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param hierarchyId <p>
     *            The ID of the hierarchy to query for the property ID. You can
     *            use the hierarchy's name instead of the hierarchy's ID.
     *            </p>
     *            <p>
     *            You use a hierarchy ID instead of a model ID because you can
     *            have several hierarchies using the same model and therefore
     *            the same <code>propertyId</code>. For example, you might have
     *            separately grouped assets that come from the same asset model.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     *            >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VariableValue withHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
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
        if (getPropertyId() != null)
            sb.append("propertyId: " + getPropertyId() + ",");
        if (getHierarchyId() != null)
            sb.append("hierarchyId: " + getHierarchyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode
                + ((getHierarchyId() == null) ? 0 : getHierarchyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VariableValue == false)
            return false;
        VariableValue other = (VariableValue) obj;

        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null
                && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getHierarchyId() == null ^ this.getHierarchyId() == null)
            return false;
        if (other.getHierarchyId() != null
                && other.getHierarchyId().equals(this.getHierarchyId()) == false)
            return false;
        return true;
    }
}
