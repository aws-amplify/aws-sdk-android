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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Allows the update of one or more parameters of a database in Amazon
 * Lightsail.
 * </p>
 * <p>
 * Parameter updates don't cause outages; therefore, their application is not
 * subject to the preferred maintenance window. However, there are two ways in
 * which parameter updates are applied: <code>dynamic</code> or
 * <code>pending-reboot</code>. Parameters marked with a <code>dynamic</code>
 * apply type are applied immediately. Parameters marked with a
 * <code>pending-reboot</code> apply type are applied only after the database is
 * rebooted using the <code>reboot relational database</code> operation.
 * </p>
 * <p>
 * The <code>update relational database parameters</code> operation supports
 * tag-based access control via resource tags applied to the resource identified
 * by relationalDatabaseName. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class UpdateRelationalDatabaseParametersRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of your database for which to update parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String relationalDatabaseName;

    /**
     * <p>
     * The database parameters to update.
     * </p>
     */
    private java.util.List<RelationalDatabaseParameter> parameters;

    /**
     * <p>
     * The name of your database for which to update parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of your database for which to update parameters.
     *         </p>
     */
    public String getRelationalDatabaseName() {
        return relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to update parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to update parameters.
     *            </p>
     */
    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to update parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to update parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRelationalDatabaseParametersRequest withRelationalDatabaseName(
            String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
        return this;
    }

    /**
     * <p>
     * The database parameters to update.
     * </p>
     *
     * @return <p>
     *         The database parameters to update.
     *         </p>
     */
    public java.util.List<RelationalDatabaseParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The database parameters to update.
     * </p>
     *
     * @param parameters <p>
     *            The database parameters to update.
     *            </p>
     */
    public void setParameters(java.util.Collection<RelationalDatabaseParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<RelationalDatabaseParameter>(parameters);
    }

    /**
     * <p>
     * The database parameters to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The database parameters to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRelationalDatabaseParametersRequest withParameters(
            RelationalDatabaseParameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<RelationalDatabaseParameter>(
                    parameters.length);
        }
        for (RelationalDatabaseParameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The database parameters to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The database parameters to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRelationalDatabaseParametersRequest withParameters(
            java.util.Collection<RelationalDatabaseParameter> parameters) {
        setParameters(parameters);
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
        if (getRelationalDatabaseName() != null)
            sb.append("relationalDatabaseName: " + getRelationalDatabaseName() + ",");
        if (getParameters() != null)
            sb.append("parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName()
                        .hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRelationalDatabaseParametersRequest == false)
            return false;
        UpdateRelationalDatabaseParametersRequest other = (UpdateRelationalDatabaseParametersRequest) obj;

        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null
                && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
