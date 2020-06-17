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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the codes and full continent, country, and
 * subdivision names for the specified <code>geolocation</code> code.
 * </p>
 */
public class GeoLocationDetails implements Serializable {
    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     */
    private String continentCode;

    /**
     * <p>
     * The full name of the continent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     */
    private String continentName;

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String countryCode;

    /**
     * <p>
     * The name of the country.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String countryName;

    /**
     * <p>
     * The code for the subdivision. Route 53 currently supports only states in
     * the United States.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     */
    private String subdivisionCode;

    /**
     * <p>
     * The full name of the subdivision. Route 53 currently supports only states
     * in the United States.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String subdivisionName;

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @return <p>
     *         The two-letter code for the continent.
     *         </p>
     */
    public String getContinentCode() {
        return continentCode;
    }

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param continentCode <p>
     *            The two-letter code for the continent.
     *            </p>
     */
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param continentCode <p>
     *            The two-letter code for the continent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withContinentCode(String continentCode) {
        this.continentCode = continentCode;
        return this;
    }

    /**
     * <p>
     * The full name of the continent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @return <p>
     *         The full name of the continent.
     *         </p>
     */
    public String getContinentName() {
        return continentName;
    }

    /**
     * <p>
     * The full name of the continent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param continentName <p>
     *            The full name of the continent.
     *            </p>
     */
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    /**
     * <p>
     * The full name of the continent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param continentName <p>
     *            The full name of the continent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withContinentName(String continentName) {
        this.continentName = continentName;
        return this;
    }

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return <p>
     *         The two-letter code for the country.
     *         </p>
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param countryCode <p>
     *            The two-letter code for the country.
     *            </p>
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param countryCode <p>
     *            The two-letter code for the country.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * <p>
     * The name of the country.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the country.
     *         </p>
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * <p>
     * The name of the country.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param countryName <p>
     *            The name of the country.
     *            </p>
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * <p>
     * The name of the country.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param countryName <p>
     *            The name of the country.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * <p>
     * The code for the subdivision. Route 53 currently supports only states in
     * the United States.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @return <p>
     *         The code for the subdivision. Route 53 currently supports only
     *         states in the United States.
     *         </p>
     */
    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision. Route 53 currently supports only states in
     * the United States.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param subdivisionCode <p>
     *            The code for the subdivision. Route 53 currently supports only
     *            states in the United States.
     *            </p>
     */
    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision. Route 53 currently supports only states in
     * the United States.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param subdivisionCode <p>
     *            The code for the subdivision. Route 53 currently supports only
     *            states in the United States.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
        return this;
    }

    /**
     * <p>
     * The full name of the subdivision. Route 53 currently supports only states
     * in the United States.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The full name of the subdivision. Route 53 currently supports
     *         only states in the United States.
     *         </p>
     */
    public String getSubdivisionName() {
        return subdivisionName;
    }

    /**
     * <p>
     * The full name of the subdivision. Route 53 currently supports only states
     * in the United States.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param subdivisionName <p>
     *            The full name of the subdivision. Route 53 currently supports
     *            only states in the United States.
     *            </p>
     */
    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }

    /**
     * <p>
     * The full name of the subdivision. Route 53 currently supports only states
     * in the United States.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param subdivisionName <p>
     *            The full name of the subdivision. Route 53 currently supports
     *            only states in the United States.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
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
        if (getContinentCode() != null)
            sb.append("ContinentCode: " + getContinentCode() + ",");
        if (getContinentName() != null)
            sb.append("ContinentName: " + getContinentName() + ",");
        if (getCountryCode() != null)
            sb.append("CountryCode: " + getCountryCode() + ",");
        if (getCountryName() != null)
            sb.append("CountryName: " + getCountryName() + ",");
        if (getSubdivisionCode() != null)
            sb.append("SubdivisionCode: " + getSubdivisionCode() + ",");
        if (getSubdivisionName() != null)
            sb.append("SubdivisionName: " + getSubdivisionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContinentCode() == null) ? 0 : getContinentCode().hashCode());
        hashCode = prime * hashCode
                + ((getContinentName() == null) ? 0 : getContinentName().hashCode());
        hashCode = prime * hashCode
                + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode
                + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        hashCode = prime * hashCode
                + ((getSubdivisionCode() == null) ? 0 : getSubdivisionCode().hashCode());
        hashCode = prime * hashCode
                + ((getSubdivisionName() == null) ? 0 : getSubdivisionName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoLocationDetails == false)
            return false;
        GeoLocationDetails other = (GeoLocationDetails) obj;

        if (other.getContinentCode() == null ^ this.getContinentCode() == null)
            return false;
        if (other.getContinentCode() != null
                && other.getContinentCode().equals(this.getContinentCode()) == false)
            return false;
        if (other.getContinentName() == null ^ this.getContinentName() == null)
            return false;
        if (other.getContinentName() != null
                && other.getContinentName().equals(this.getContinentName()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null
                && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getCountryName() == null ^ this.getCountryName() == null)
            return false;
        if (other.getCountryName() != null
                && other.getCountryName().equals(this.getCountryName()) == false)
            return false;
        if (other.getSubdivisionCode() == null ^ this.getSubdivisionCode() == null)
            return false;
        if (other.getSubdivisionCode() != null
                && other.getSubdivisionCode().equals(this.getSubdivisionCode()) == false)
            return false;
        if (other.getSubdivisionName() == null ^ this.getSubdivisionName() == null)
            return false;
        if (other.getSubdivisionName() != null
                && other.getSubdivisionName().equals(this.getSubdivisionName()) == false)
            return false;
        return true;
    }
}
