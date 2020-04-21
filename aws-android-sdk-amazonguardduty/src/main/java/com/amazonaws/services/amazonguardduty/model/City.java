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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the city associated with the IP address.
 * </p>
 */
public class City implements Serializable {
    /**
     * <p>
     * The city name of the remote IP address.
     * </p>
     */
    private String cityName;

    /**
     * <p>
     * The city name of the remote IP address.
     * </p>
     *
     * @return <p>
     *         The city name of the remote IP address.
     *         </p>
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * <p>
     * The city name of the remote IP address.
     * </p>
     *
     * @param cityName <p>
     *            The city name of the remote IP address.
     *            </p>
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * <p>
     * The city name of the remote IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cityName <p>
     *            The city name of the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public City withCityName(String cityName) {
        this.cityName = cityName;
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
        if (getCityName() != null)
            sb.append("CityName: " + getCityName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCityName() == null) ? 0 : getCityName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof City == false)
            return false;
        City other = (City) obj;

        if (other.getCityName() == null ^ this.getCityName() == null)
            return false;
        if (other.getCityName() != null && other.getCityName().equals(this.getCityName()) == false)
            return false;
        return true;
    }
}
