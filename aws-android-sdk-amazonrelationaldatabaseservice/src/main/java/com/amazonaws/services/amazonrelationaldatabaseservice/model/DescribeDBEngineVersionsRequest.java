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
 * Returns a list of the available DB engines.
 * </p>
 */
public class DescribeDBEngineVersionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The database engine to return.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The database engine version to return.
     * </p>
     * <p>
     * Example: <code>5.1.49</code>
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The name of a specific DB parameter group family to return details for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBParameterGroupFamily.
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupFamily;

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token called
     * a marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A value that indicates whether only the default version of the specified
     * engine or engine and major version combination is returned.
     * </p>
     */
    private Boolean defaultOnly;

    /**
     * <p>
     * A value that indicates whether to list the supported character sets for
     * each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>CharacterSetName</code> parameter for <code>CreateDBInstance</code>
     * , the response includes a list of supported character sets for each
     * engine version.
     * </p>
     */
    private Boolean listSupportedCharacterSets;

    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each
     * engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>TimeZone</code> parameter for <code>CreateDBInstance</code>, the
     * response includes a list of supported time zones for each engine version.
     * </p>
     */
    private Boolean listSupportedTimezones;

    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't
     * available in the list. The default is to list only available engine
     * versions.
     * </p>
     */
    private Boolean includeAll;

    /**
     * <p>
     * The database engine to return.
     * </p>
     *
     * @return <p>
     *         The database engine to return.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The database engine to return.
     * </p>
     *
     * @param engine <p>
     *            The database engine to return.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The database engine to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The database engine version to return.
     * </p>
     * <p>
     * Example: <code>5.1.49</code>
     * </p>
     *
     * @return <p>
     *         The database engine version to return.
     *         </p>
     *         <p>
     *         Example: <code>5.1.49</code>
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The database engine version to return.
     * </p>
     * <p>
     * Example: <code>5.1.49</code>
     * </p>
     *
     * @param engineVersion <p>
     *            The database engine version to return.
     *            </p>
     *            <p>
     *            Example: <code>5.1.49</code>
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version to return.
     * </p>
     * <p>
     * Example: <code>5.1.49</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The database engine version to return.
     *            </p>
     *            <p>
     *            Example: <code>5.1.49</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The name of a specific DB parameter group family to return details for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBParameterGroupFamily.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of a specific DB parameter group family to return
     *         details for.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match an existing DBParameterGroupFamily.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of a specific DB parameter group family to return details for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBParameterGroupFamily.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBParameterGroupFamily <p>
     *            The name of a specific DB parameter group family to return
     *            details for.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match an existing DBParameterGroupFamily.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of a specific DB parameter group family to return details for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBParameterGroupFamily.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupFamily <p>
     *            The name of a specific DB parameter group family to return
     *            details for.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match an existing DBParameterGroupFamily.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     *
     * @return <p>
     *         This parameter isn't currently supported.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            This parameter isn't currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token called
     * a marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response. If more
     *         than the <code>MaxRecords</code> value is available, a pagination
     *         token called a marker is included in the response so you can
     *         retrieve the remaining results.
     *         </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token called
     * a marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more than the <code>MaxRecords</code> value is available, a
     *            pagination token called a marker is included in the response
     *            so you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a pagination token called
     * a marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response. If
     *            more than the <code>MaxRecords</code> value is available, a
     *            pagination token called a marker is included in the response
     *            so you can retrieve the remaining results.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: Minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether only the default version of the specified
     * engine or engine and major version combination is returned.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether only the default version of the
     *         specified engine or engine and major version combination is
     *         returned.
     *         </p>
     */
    public Boolean isDefaultOnly() {
        return defaultOnly;
    }

    /**
     * <p>
     * A value that indicates whether only the default version of the specified
     * engine or engine and major version combination is returned.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether only the default version of the
     *         specified engine or engine and major version combination is
     *         returned.
     *         </p>
     */
    public Boolean getDefaultOnly() {
        return defaultOnly;
    }

    /**
     * <p>
     * A value that indicates whether only the default version of the specified
     * engine or engine and major version combination is returned.
     * </p>
     *
     * @param defaultOnly <p>
     *            A value that indicates whether only the default version of the
     *            specified engine or engine and major version combination is
     *            returned.
     *            </p>
     */
    public void setDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
    }

    /**
     * <p>
     * A value that indicates whether only the default version of the specified
     * engine or engine and major version combination is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultOnly <p>
     *            A value that indicates whether only the default version of the
     *            specified engine or engine and major version combination is
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported character sets for
     * each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>CharacterSetName</code> parameter for <code>CreateDBInstance</code>
     * , the response includes a list of supported character sets for each
     * engine version.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to list the supported character
     *         sets for each engine version.
     *         </p>
     *         <p>
     *         If this parameter is enabled and the requested engine supports
     *         the <code>CharacterSetName</code> parameter for
     *         <code>CreateDBInstance</code>, the response includes a list of
     *         supported character sets for each engine version.
     *         </p>
     */
    public Boolean isListSupportedCharacterSets() {
        return listSupportedCharacterSets;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported character sets for
     * each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>CharacterSetName</code> parameter for <code>CreateDBInstance</code>
     * , the response includes a list of supported character sets for each
     * engine version.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to list the supported character
     *         sets for each engine version.
     *         </p>
     *         <p>
     *         If this parameter is enabled and the requested engine supports
     *         the <code>CharacterSetName</code> parameter for
     *         <code>CreateDBInstance</code>, the response includes a list of
     *         supported character sets for each engine version.
     *         </p>
     */
    public Boolean getListSupportedCharacterSets() {
        return listSupportedCharacterSets;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported character sets for
     * each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>CharacterSetName</code> parameter for <code>CreateDBInstance</code>
     * , the response includes a list of supported character sets for each
     * engine version.
     * </p>
     *
     * @param listSupportedCharacterSets <p>
     *            A value that indicates whether to list the supported character
     *            sets for each engine version.
     *            </p>
     *            <p>
     *            If this parameter is enabled and the requested engine supports
     *            the <code>CharacterSetName</code> parameter for
     *            <code>CreateDBInstance</code>, the response includes a list of
     *            supported character sets for each engine version.
     *            </p>
     */
    public void setListSupportedCharacterSets(Boolean listSupportedCharacterSets) {
        this.listSupportedCharacterSets = listSupportedCharacterSets;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported character sets for
     * each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>CharacterSetName</code> parameter for <code>CreateDBInstance</code>
     * , the response includes a list of supported character sets for each
     * engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listSupportedCharacterSets <p>
     *            A value that indicates whether to list the supported character
     *            sets for each engine version.
     *            </p>
     *            <p>
     *            If this parameter is enabled and the requested engine supports
     *            the <code>CharacterSetName</code> parameter for
     *            <code>CreateDBInstance</code>, the response includes a list of
     *            supported character sets for each engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withListSupportedCharacterSets(
            Boolean listSupportedCharacterSets) {
        this.listSupportedCharacterSets = listSupportedCharacterSets;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each
     * engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>TimeZone</code> parameter for <code>CreateDBInstance</code>, the
     * response includes a list of supported time zones for each engine version.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to list the supported time zones
     *         for each engine version.
     *         </p>
     *         <p>
     *         If this parameter is enabled and the requested engine supports
     *         the <code>TimeZone</code> parameter for
     *         <code>CreateDBInstance</code>, the response includes a list of
     *         supported time zones for each engine version.
     *         </p>
     */
    public Boolean isListSupportedTimezones() {
        return listSupportedTimezones;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each
     * engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>TimeZone</code> parameter for <code>CreateDBInstance</code>, the
     * response includes a list of supported time zones for each engine version.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to list the supported time zones
     *         for each engine version.
     *         </p>
     *         <p>
     *         If this parameter is enabled and the requested engine supports
     *         the <code>TimeZone</code> parameter for
     *         <code>CreateDBInstance</code>, the response includes a list of
     *         supported time zones for each engine version.
     *         </p>
     */
    public Boolean getListSupportedTimezones() {
        return listSupportedTimezones;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each
     * engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>TimeZone</code> parameter for <code>CreateDBInstance</code>, the
     * response includes a list of supported time zones for each engine version.
     * </p>
     *
     * @param listSupportedTimezones <p>
     *            A value that indicates whether to list the supported time
     *            zones for each engine version.
     *            </p>
     *            <p>
     *            If this parameter is enabled and the requested engine supports
     *            the <code>TimeZone</code> parameter for
     *            <code>CreateDBInstance</code>, the response includes a list of
     *            supported time zones for each engine version.
     *            </p>
     */
    public void setListSupportedTimezones(Boolean listSupportedTimezones) {
        this.listSupportedTimezones = listSupportedTimezones;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each
     * engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the
     * <code>TimeZone</code> parameter for <code>CreateDBInstance</code>, the
     * response includes a list of supported time zones for each engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listSupportedTimezones <p>
     *            A value that indicates whether to list the supported time
     *            zones for each engine version.
     *            </p>
     *            <p>
     *            If this parameter is enabled and the requested engine supports
     *            the <code>TimeZone</code> parameter for
     *            <code>CreateDBInstance</code>, the response includes a list of
     *            supported time zones for each engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withListSupportedTimezones(Boolean listSupportedTimezones) {
        this.listSupportedTimezones = listSupportedTimezones;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't
     * available in the list. The default is to list only available engine
     * versions.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to include engine versions that
     *         aren't available in the list. The default is to list only
     *         available engine versions.
     *         </p>
     */
    public Boolean isIncludeAll() {
        return includeAll;
    }

    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't
     * available in the list. The default is to list only available engine
     * versions.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to include engine versions that
     *         aren't available in the list. The default is to list only
     *         available engine versions.
     *         </p>
     */
    public Boolean getIncludeAll() {
        return includeAll;
    }

    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't
     * available in the list. The default is to list only available engine
     * versions.
     * </p>
     *
     * @param includeAll <p>
     *            A value that indicates whether to include engine versions that
     *            aren't available in the list. The default is to list only
     *            available engine versions.
     *            </p>
     */
    public void setIncludeAll(Boolean includeAll) {
        this.includeAll = includeAll;
    }

    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't
     * available in the list. The default is to list only available engine
     * versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAll <p>
     *            A value that indicates whether to include engine versions that
     *            aren't available in the list. The default is to list only
     *            available engine versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBEngineVersionsRequest withIncludeAll(Boolean includeAll) {
        this.includeAll = includeAll;
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
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: " + getDBParameterGroupFamily() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getDefaultOnly() != null)
            sb.append("DefaultOnly: " + getDefaultOnly() + ",");
        if (getListSupportedCharacterSets() != null)
            sb.append("ListSupportedCharacterSets: " + getListSupportedCharacterSets() + ",");
        if (getListSupportedTimezones() != null)
            sb.append("ListSupportedTimezones: " + getListSupportedTimezones() + ",");
        if (getIncludeAll() != null)
            sb.append("IncludeAll: " + getIncludeAll());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily()
                        .hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultOnly() == null) ? 0 : getDefaultOnly().hashCode());
        hashCode = prime
                * hashCode
                + ((getListSupportedCharacterSets() == null) ? 0 : getListSupportedCharacterSets()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getListSupportedTimezones() == null) ? 0 : getListSupportedTimezones()
                        .hashCode());
        hashCode = prime * hashCode + ((getIncludeAll() == null) ? 0 : getIncludeAll().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBEngineVersionsRequest == false)
            return false;
        DescribeDBEngineVersionsRequest other = (DescribeDBEngineVersionsRequest) obj;

        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null
                && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDefaultOnly() == null ^ this.getDefaultOnly() == null)
            return false;
        if (other.getDefaultOnly() != null
                && other.getDefaultOnly().equals(this.getDefaultOnly()) == false)
            return false;
        if (other.getListSupportedCharacterSets() == null
                ^ this.getListSupportedCharacterSets() == null)
            return false;
        if (other.getListSupportedCharacterSets() != null
                && other.getListSupportedCharacterSets().equals(
                        this.getListSupportedCharacterSets()) == false)
            return false;
        if (other.getListSupportedTimezones() == null ^ this.getListSupportedTimezones() == null)
            return false;
        if (other.getListSupportedTimezones() != null
                && other.getListSupportedTimezones().equals(this.getListSupportedTimezones()) == false)
            return false;
        if (other.getIncludeAll() == null ^ this.getIncludeAll() == null)
            return false;
        if (other.getIncludeAll() != null
                && other.getIncludeAll().equals(this.getIncludeAll()) == false)
            return false;
        return true;
    }
}
