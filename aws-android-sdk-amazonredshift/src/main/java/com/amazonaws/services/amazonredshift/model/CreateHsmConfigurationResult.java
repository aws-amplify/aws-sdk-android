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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

public class CreateHsmConfigurationResult implements Serializable {
    /**
     * <p>
     * Returns information about an HSM configuration, which is an object that
     * describes to Amazon Redshift clusters the information they require to
     * connect to an HSM where they can store database encryption keys.
     * </p>
     */
    private HsmConfiguration hsmConfiguration;

    /**
     * <p>
     * Returns information about an HSM configuration, which is an object that
     * describes to Amazon Redshift clusters the information they require to
     * connect to an HSM where they can store database encryption keys.
     * </p>
     *
     * @return <p>
     *         Returns information about an HSM configuration, which is an
     *         object that describes to Amazon Redshift clusters the information
     *         they require to connect to an HSM where they can store database
     *         encryption keys.
     *         </p>
     */
    public HsmConfiguration getHsmConfiguration() {
        return hsmConfiguration;
    }

    /**
     * <p>
     * Returns information about an HSM configuration, which is an object that
     * describes to Amazon Redshift clusters the information they require to
     * connect to an HSM where they can store database encryption keys.
     * </p>
     *
     * @param hsmConfiguration <p>
     *            Returns information about an HSM configuration, which is an
     *            object that describes to Amazon Redshift clusters the
     *            information they require to connect to an HSM where they can
     *            store database encryption keys.
     *            </p>
     */
    public void setHsmConfiguration(HsmConfiguration hsmConfiguration) {
        this.hsmConfiguration = hsmConfiguration;
    }

    /**
     * <p>
     * Returns information about an HSM configuration, which is an object that
     * describes to Amazon Redshift clusters the information they require to
     * connect to an HSM where they can store database encryption keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmConfiguration <p>
     *            Returns information about an HSM configuration, which is an
     *            object that describes to Amazon Redshift clusters the
     *            information they require to connect to an HSM where they can
     *            store database encryption keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmConfigurationResult withHsmConfiguration(HsmConfiguration hsmConfiguration) {
        this.hsmConfiguration = hsmConfiguration;
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
        if (getHsmConfiguration() != null)
            sb.append("HsmConfiguration: " + getHsmConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHsmConfiguration() == null) ? 0 : getHsmConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHsmConfigurationResult == false)
            return false;
        CreateHsmConfigurationResult other = (CreateHsmConfigurationResult) obj;

        if (other.getHsmConfiguration() == null ^ this.getHsmConfiguration() == null)
            return false;
        if (other.getHsmConfiguration() != null
                && other.getHsmConfiguration().equals(this.getHsmConfiguration()) == false)
            return false;
        return true;
    }
}
