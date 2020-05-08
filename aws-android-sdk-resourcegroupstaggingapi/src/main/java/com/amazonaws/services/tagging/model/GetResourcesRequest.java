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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns all the tagged or previously tagged resources that are located in the
 * specified Region for the AWS account.
 * </p>
 * <p>
 * Depending on what information you want returned, you can also specify the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Filters</i> that specify what tags and resource types you want returned.
 * The response includes all tags that are associated with the requested
 * resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * Information about compliance with the account's effective tag policy. For
 * more information on tag policies, see <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
 * >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * You can check the <code>PaginationToken</code> response parameter to
 * determine if a query is complete. Queries occasionally return fewer results
 * on a page than allowed. The <code>PaginationToken</code> response parameter
 * value is <code>null</code> <i>only</i> when there are no more results to
 * display.
 * </p>
 * </note>
 */
public class GetResourcesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * A list of TagFilters (keys and values). Each TagFilter specified must
     * contain a key with values as optional. A request can include up to 50
     * keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>do</i> specify a TagFilter, the response returns only those
     * resources that are currently associated with the specified tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you <i>don't</i> specify a TagFilter, the response includes all
     * resources that were ever associated with tags. Resources that currently
     * don't have associated tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response
     * returns only those resources that satisfy all specified filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the
     * response returns resources that match any of the specified values for
     * that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources
     * that are tagged with that key irrespective of the value.
     * </p>
     * <p>
     * For example, for filters: filter1 = {key1, {value1}}, filter2 = {key2,
     * {value2,value3,value4}} , filter3 = {key3}:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetResources( {filter1} ) returns resources tagged with key1=value1
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter2} ) returns resources tagged with key2=value2 or
     * key2=value3 or key2=value4
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter3} ) returns resources tagged with any tag
     * containing key3 as its tag key, irrespective of its value
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter1,filter2,filter3} ) returns resources tagged with (
     * key1=value1) and ( key2=value2 or key2=value3 or key2=value4) and (key3,
     * irrespective of the value)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<TagFilter> tagFilters;

    /**
     * <p>
     * A limit that restricts the number of resources returned by GetResources
     * in paginated output. You can set ResourcesPerPage to a minimum of 1 item
     * and the maximum of 100 items.
     * </p>
     */
    private Integer resourcesPerPage;

    /**
     * <p>
     * AWS recommends using <code>ResourcesPerPage</code> instead of this
     * parameter.
     * </p>
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned
     * by GetResources in paginated output. A resource with no tags is counted
     * as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated
     * tags across pages. If the specified <code>TagsPerPage</code> would cause
     * such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get
     * the remaining data. For example, if you specify a
     * <code>TagsPerPage</code> of <code>100</code> and the account has 22
     * resources with 10 tags each (meaning that each resource has 10 key and
     * value pairs), the output will consist of three pages. The first page
     * displays the first 10 resources, each with its 10 tags. The second page
     * displays the next 10 resources, each with its 10 tags. The third page
     * displays the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items and the
     * maximum of 500 items.
     * </p>
     */
    private Integer tagsPerPage;

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     */
    private java.util.List<String> resourceTypeFilters;

    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the
     * effective tag policy. Set this to <code>true</code> to determine whether
     * resources are compliant with the tag policy and to get details.
     * </p>
     */
    private Boolean includeComplianceDetails;

    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag
     * policy. Set this to <code>true</code> if you are interested in retrieving
     * information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the
     * <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     */
    private Boolean excludeCompliantResources;

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         A string that indicates that additional data is available. Leave
     *         this value empty for your initial request. If the response
     *         includes a <code>PaginationToken</code>, use that string for this
     *         value to request an additional page of data.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that additional data is available.
     *            Leave this value empty for your initial request. If the
     *            response includes a <code>PaginationToken</code>, use that
     *            string for this value to request an additional page of data.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that additional data is available.
     *            Leave this value empty for your initial request. If the
     *            response includes a <code>PaginationToken</code>, use that
     *            string for this value to request an additional page of data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesRequest withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }

    /**
     * <p>
     * A list of TagFilters (keys and values). Each TagFilter specified must
     * contain a key with values as optional. A request can include up to 50
     * keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>do</i> specify a TagFilter, the response returns only those
     * resources that are currently associated with the specified tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you <i>don't</i> specify a TagFilter, the response includes all
     * resources that were ever associated with tags. Resources that currently
     * don't have associated tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response
     * returns only those resources that satisfy all specified filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the
     * response returns resources that match any of the specified values for
     * that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources
     * that are tagged with that key irrespective of the value.
     * </p>
     * <p>
     * For example, for filters: filter1 = {key1, {value1}}, filter2 = {key2,
     * {value2,value3,value4}} , filter3 = {key3}:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetResources( {filter1} ) returns resources tagged with key1=value1
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter2} ) returns resources tagged with key2=value2 or
     * key2=value3 or key2=value4
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter3} ) returns resources tagged with any tag
     * containing key3 as its tag key, irrespective of its value
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter1,filter2,filter3} ) returns resources tagged with (
     * key1=value1) and ( key2=value2 or key2=value3 or key2=value4) and (key3,
     * irrespective of the value)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of TagFilters (keys and values). Each TagFilter specified
     *         must contain a key with values as optional. A request can include
     *         up to 50 keys, and each key can include up to 20 values.
     *         </p>
     *         <p>
     *         Note the following when deciding how to use TagFilters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you <i>do</i> specify a TagFilter, the response returns only
     *         those resources that are currently associated with the specified
     *         tag.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you <i>don't</i> specify a TagFilter, the response includes
     *         all resources that were ever associated with tags. Resources that
     *         currently don't have associated tags are shown with an empty tag
     *         set, like this: <code>"Tags": []</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify more than one filter in a single request, the
     *         response returns only those resources that satisfy all specified
     *         filters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a filter that contains more than one value for a
     *         key, the response returns resources that match any of the
     *         specified values for that key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't specify any values for a key, the response returns
     *         resources that are tagged with that key irrespective of the
     *         value.
     *         </p>
     *         <p>
     *         For example, for filters: filter1 = {key1, {value1}}, filter2 =
     *         {key2, {value2,value3,value4}} , filter3 = {key3}:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         GetResources( {filter1} ) returns resources tagged with
     *         key1=value1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GetResources( {filter2} ) returns resources tagged with
     *         key2=value2 or key2=value3 or key2=value4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GetResources( {filter3} ) returns resources tagged with any tag
     *         containing key3 as its tag key, irrespective of its value
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GetResources( {filter1,filter2,filter3} ) returns resources
     *         tagged with ( key1=value1) and ( key2=value2 or key2=value3 or
     *         key2=value4) and (key3, irrespective of the value)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public java.util.List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * <p>
     * A list of TagFilters (keys and values). Each TagFilter specified must
     * contain a key with values as optional. A request can include up to 50
     * keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>do</i> specify a TagFilter, the response returns only those
     * resources that are currently associated with the specified tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you <i>don't</i> specify a TagFilter, the response includes all
     * resources that were ever associated with tags. Resources that currently
     * don't have associated tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response
     * returns only those resources that satisfy all specified filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the
     * response returns resources that match any of the specified values for
     * that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources
     * that are tagged with that key irrespective of the value.
     * </p>
     * <p>
     * For example, for filters: filter1 = {key1, {value1}}, filter2 = {key2,
     * {value2,value3,value4}} , filter3 = {key3}:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetResources( {filter1} ) returns resources tagged with key1=value1
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter2} ) returns resources tagged with key2=value2 or
     * key2=value3 or key2=value4
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter3} ) returns resources tagged with any tag
     * containing key3 as its tag key, irrespective of its value
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter1,filter2,filter3} ) returns resources tagged with (
     * key1=value1) and ( key2=value2 or key2=value3 or key2=value4) and (key3,
     * irrespective of the value)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param tagFilters <p>
     *            A list of TagFilters (keys and values). Each TagFilter
     *            specified must contain a key with values as optional. A
     *            request can include up to 50 keys, and each key can include up
     *            to 20 values.
     *            </p>
     *            <p>
     *            Note the following when deciding how to use TagFilters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you <i>do</i> specify a TagFilter, the response returns
     *            only those resources that are currently associated with the
     *            specified tag.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you <i>don't</i> specify a TagFilter, the response includes
     *            all resources that were ever associated with tags. Resources
     *            that currently don't have associated tags are shown with an
     *            empty tag set, like this: <code>"Tags": []</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify more than one filter in a single request, the
     *            response returns only those resources that satisfy all
     *            specified filters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify a filter that contains more than one value for
     *            a key, the response returns resources that match any of the
     *            specified values for that key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't specify any values for a key, the response
     *            returns resources that are tagged with that key irrespective
     *            of the value.
     *            </p>
     *            <p>
     *            For example, for filters: filter1 = {key1, {value1}}, filter2
     *            = {key2, {value2,value3,value4}} , filter3 = {key3}:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            GetResources( {filter1} ) returns resources tagged with
     *            key1=value1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetResources( {filter2} ) returns resources tagged with
     *            key2=value2 or key2=value3 or key2=value4
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetResources( {filter3} ) returns resources tagged with any
     *            tag containing key3 as its tag key, irrespective of its value
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetResources( {filter1,filter2,filter3} ) returns resources
     *            tagged with ( key1=value1) and ( key2=value2 or key2=value3 or
     *            key2=value4) and (key3, irrespective of the value)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public void setTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters);
    }

    /**
     * <p>
     * A list of TagFilters (keys and values). Each TagFilter specified must
     * contain a key with values as optional. A request can include up to 50
     * keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>do</i> specify a TagFilter, the response returns only those
     * resources that are currently associated with the specified tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you <i>don't</i> specify a TagFilter, the response includes all
     * resources that were ever associated with tags. Resources that currently
     * don't have associated tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response
     * returns only those resources that satisfy all specified filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the
     * response returns resources that match any of the specified values for
     * that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources
     * that are tagged with that key irrespective of the value.
     * </p>
     * <p>
     * For example, for filters: filter1 = {key1, {value1}}, filter2 = {key2,
     * {value2,value3,value4}} , filter3 = {key3}:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetResources( {filter1} ) returns resources tagged with key1=value1
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter2} ) returns resources tagged with key2=value2 or
     * key2=value3 or key2=value4
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter3} ) returns resources tagged with any tag
     * containing key3 as its tag key, irrespective of its value
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter1,filter2,filter3} ) returns resources tagged with (
     * key1=value1) and ( key2=value2 or key2=value3 or key2=value4) and (key3,
     * irrespective of the value)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagFilters <p>
     *            A list of TagFilters (keys and values). Each TagFilter
     *            specified must contain a key with values as optional. A
     *            request can include up to 50 keys, and each key can include up
     *            to 20 values.
     *            </p>
     *            <p>
     *            Note the following when deciding how to use TagFilters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you <i>do</i> specify a TagFilter, the response returns
     *            only those resources that are currently associated with the
     *            specified tag.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you <i>don't</i> specify a TagFilter, the response includes
     *            all resources that were ever associated with tags. Resources
     *            that currently don't have associated tags are shown with an
     *            empty tag set, like this: <code>"Tags": []</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify more than one filter in a single request, the
     *            response returns only those resources that satisfy all
     *            specified filters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify a filter that contains more than one value for
     *            a key, the response returns resources that match any of the
     *            specified values for that key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't specify any values for a key, the response
     *            returns resources that are tagged with that key irrespective
     *            of the value.
     *            </p>
     *            <p>
     *            For example, for filters: filter1 = {key1, {value1}}, filter2
     *            = {key2, {value2,value3,value4}} , filter3 = {key3}:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            GetResources( {filter1} ) returns resources tagged with
     *            key1=value1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetResources( {filter2} ) returns resources tagged with
     *            key2=value2 or key2=value3 or key2=value4
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetResources( {filter3} ) returns resources tagged with any
     *            tag containing key3 as its tag key, irrespective of its value
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetResources( {filter1,filter2,filter3} ) returns resources
     *            tagged with ( key1=value1) and ( key2=value2 or key2=value3 or
     *            key2=value4) and (key3, irrespective of the value)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesRequest withTagFilters(TagFilter... tagFilters) {
        if (getTagFilters() == null) {
            this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters.length);
        }
        for (TagFilter value : tagFilters) {
            this.tagFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of TagFilters (keys and values). Each TagFilter specified must
     * contain a key with values as optional. A request can include up to 50
     * keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>do</i> specify a TagFilter, the response returns only those
     * resources that are currently associated with the specified tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you <i>don't</i> specify a TagFilter, the response includes all
     * resources that were ever associated with tags. Resources that currently
     * don't have associated tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response
     * returns only those resources that satisfy all specified filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the
     * response returns resources that match any of the specified values for
     * that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources
     * that are tagged with that key irrespective of the value.
     * </p>
     * <p>
     * For example, for filters: filter1 = {key1, {value1}}, filter2 = {key2,
     * {value2,value3,value4}} , filter3 = {key3}:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetResources( {filter1} ) returns resources tagged with key1=value1
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter2} ) returns resources tagged with key2=value2 or
     * key2=value3 or key2=value4
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter3} ) returns resources tagged with any tag
     * containing key3 as its tag key, irrespective of its value
     * </p>
     * </li>
     * <li>
     * <p>
     * GetResources( {filter1,filter2,filter3} ) returns resources tagged with (
     * key1=value1) and ( key2=value2 or key2=value3 or key2=value4) and (key3,
     * irrespective of the value)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagFilters <p>
     *            A list of TagFilters (keys and values). Each TagFilter
     *            specified must contain a key with values as optional. A
     *            request can include up to 50 keys, and each key can include up
     *            to 20 values.
     *            </p>
     *            <p>
     *            Note the following when deciding how to use TagFilters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you <i>do</i> specify a TagFilter, the response returns
     *            only those resources that are currently associated with the
     *            specified tag.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you <i>don't</i> specify a TagFilter, the response includes
     *            all resources that were ever associated with tags. Resources
     *            that currently don't have associated tags are shown with an
     *            empty tag set, like this: <code>"Tags": []</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify more than one filter in a single request, the
     *            response returns only those resources that satisfy all
     *            specified filters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify a filter that contains more than one value for
     *            a key, the response returns resources that match any of the
     *            specified values for that key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't specify any values for a key, the response
     *            returns resources that are tagged with that key irrespective
     *            of the value.
     *            </p>
     *            <p>
     *            For example, for filters: filter1 = {key1, {value1}}, filter2
     *            = {key2, {value2,value3,value4}} , filter3 = {key3}:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            GetResources( {filter1} ) returns resources tagged with
     *            key1=value1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetResources( {filter2} ) returns resources tagged with
     *            key2=value2 or key2=value3 or key2=value4
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetResources( {filter3} ) returns resources tagged with any
     *            tag containing key3 as its tag key, irrespective of its value
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GetResources( {filter1,filter2,filter3} ) returns resources
     *            tagged with ( key1=value1) and ( key2=value2 or key2=value3 or
     *            key2=value4) and (key3, irrespective of the value)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesRequest withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        setTagFilters(tagFilters);
        return this;
    }

    /**
     * <p>
     * A limit that restricts the number of resources returned by GetResources
     * in paginated output. You can set ResourcesPerPage to a minimum of 1 item
     * and the maximum of 100 items.
     * </p>
     *
     * @return <p>
     *         A limit that restricts the number of resources returned by
     *         GetResources in paginated output. You can set ResourcesPerPage to
     *         a minimum of 1 item and the maximum of 100 items.
     *         </p>
     */
    public Integer getResourcesPerPage() {
        return resourcesPerPage;
    }

    /**
     * <p>
     * A limit that restricts the number of resources returned by GetResources
     * in paginated output. You can set ResourcesPerPage to a minimum of 1 item
     * and the maximum of 100 items.
     * </p>
     *
     * @param resourcesPerPage <p>
     *            A limit that restricts the number of resources returned by
     *            GetResources in paginated output. You can set ResourcesPerPage
     *            to a minimum of 1 item and the maximum of 100 items.
     *            </p>
     */
    public void setResourcesPerPage(Integer resourcesPerPage) {
        this.resourcesPerPage = resourcesPerPage;
    }

    /**
     * <p>
     * A limit that restricts the number of resources returned by GetResources
     * in paginated output. You can set ResourcesPerPage to a minimum of 1 item
     * and the maximum of 100 items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesPerPage <p>
     *            A limit that restricts the number of resources returned by
     *            GetResources in paginated output. You can set ResourcesPerPage
     *            to a minimum of 1 item and the maximum of 100 items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesRequest withResourcesPerPage(Integer resourcesPerPage) {
        this.resourcesPerPage = resourcesPerPage;
        return this;
    }

    /**
     * <p>
     * AWS recommends using <code>ResourcesPerPage</code> instead of this
     * parameter.
     * </p>
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned
     * by GetResources in paginated output. A resource with no tags is counted
     * as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated
     * tags across pages. If the specified <code>TagsPerPage</code> would cause
     * such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get
     * the remaining data. For example, if you specify a
     * <code>TagsPerPage</code> of <code>100</code> and the account has 22
     * resources with 10 tags each (meaning that each resource has 10 key and
     * value pairs), the output will consist of three pages. The first page
     * displays the first 10 resources, each with its 10 tags. The second page
     * displays the next 10 resources, each with its 10 tags. The third page
     * displays the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items and the
     * maximum of 500 items.
     * </p>
     *
     * @return <p>
     *         AWS recommends using <code>ResourcesPerPage</code> instead of
     *         this parameter.
     *         </p>
     *         <p>
     *         A limit that restricts the number of tags (key and value pairs)
     *         returned by GetResources in paginated output. A resource with no
     *         tags is counted as having one tag (one key and value pair).
     *         </p>
     *         <p>
     *         <code>GetResources</code> does not split a resource and its
     *         associated tags across pages. If the specified
     *         <code>TagsPerPage</code> would cause such a break, a
     *         <code>PaginationToken</code> is returned in place of the affected
     *         resource and its tags. Use that token in another request to get
     *         the remaining data. For example, if you specify a
     *         <code>TagsPerPage</code> of <code>100</code> and the account has
     *         22 resources with 10 tags each (meaning that each resource has 10
     *         key and value pairs), the output will consist of three pages. The
     *         first page displays the first 10 resources, each with its 10
     *         tags. The second page displays the next 10 resources, each with
     *         its 10 tags. The third page displays the remaining 2 resources,
     *         each with its 10 tags.
     *         </p>
     *         <p>
     *         You can set <code>TagsPerPage</code> to a minimum of 100 items
     *         and the maximum of 500 items.
     *         </p>
     */
    public Integer getTagsPerPage() {
        return tagsPerPage;
    }

    /**
     * <p>
     * AWS recommends using <code>ResourcesPerPage</code> instead of this
     * parameter.
     * </p>
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned
     * by GetResources in paginated output. A resource with no tags is counted
     * as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated
     * tags across pages. If the specified <code>TagsPerPage</code> would cause
     * such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get
     * the remaining data. For example, if you specify a
     * <code>TagsPerPage</code> of <code>100</code> and the account has 22
     * resources with 10 tags each (meaning that each resource has 10 key and
     * value pairs), the output will consist of three pages. The first page
     * displays the first 10 resources, each with its 10 tags. The second page
     * displays the next 10 resources, each with its 10 tags. The third page
     * displays the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items and the
     * maximum of 500 items.
     * </p>
     *
     * @param tagsPerPage <p>
     *            AWS recommends using <code>ResourcesPerPage</code> instead of
     *            this parameter.
     *            </p>
     *            <p>
     *            A limit that restricts the number of tags (key and value
     *            pairs) returned by GetResources in paginated output. A
     *            resource with no tags is counted as having one tag (one key
     *            and value pair).
     *            </p>
     *            <p>
     *            <code>GetResources</code> does not split a resource and its
     *            associated tags across pages. If the specified
     *            <code>TagsPerPage</code> would cause such a break, a
     *            <code>PaginationToken</code> is returned in place of the
     *            affected resource and its tags. Use that token in another
     *            request to get the remaining data. For example, if you specify
     *            a <code>TagsPerPage</code> of <code>100</code> and the account
     *            has 22 resources with 10 tags each (meaning that each resource
     *            has 10 key and value pairs), the output will consist of three
     *            pages. The first page displays the first 10 resources, each
     *            with its 10 tags. The second page displays the next 10
     *            resources, each with its 10 tags. The third page displays the
     *            remaining 2 resources, each with its 10 tags.
     *            </p>
     *            <p>
     *            You can set <code>TagsPerPage</code> to a minimum of 100 items
     *            and the maximum of 500 items.
     *            </p>
     */
    public void setTagsPerPage(Integer tagsPerPage) {
        this.tagsPerPage = tagsPerPage;
    }

    /**
     * <p>
     * AWS recommends using <code>ResourcesPerPage</code> instead of this
     * parameter.
     * </p>
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned
     * by GetResources in paginated output. A resource with no tags is counted
     * as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated
     * tags across pages. If the specified <code>TagsPerPage</code> would cause
     * such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get
     * the remaining data. For example, if you specify a
     * <code>TagsPerPage</code> of <code>100</code> and the account has 22
     * resources with 10 tags each (meaning that each resource has 10 key and
     * value pairs), the output will consist of three pages. The first page
     * displays the first 10 resources, each with its 10 tags. The second page
     * displays the next 10 resources, each with its 10 tags. The third page
     * displays the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items and the
     * maximum of 500 items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsPerPage <p>
     *            AWS recommends using <code>ResourcesPerPage</code> instead of
     *            this parameter.
     *            </p>
     *            <p>
     *            A limit that restricts the number of tags (key and value
     *            pairs) returned by GetResources in paginated output. A
     *            resource with no tags is counted as having one tag (one key
     *            and value pair).
     *            </p>
     *            <p>
     *            <code>GetResources</code> does not split a resource and its
     *            associated tags across pages. If the specified
     *            <code>TagsPerPage</code> would cause such a break, a
     *            <code>PaginationToken</code> is returned in place of the
     *            affected resource and its tags. Use that token in another
     *            request to get the remaining data. For example, if you specify
     *            a <code>TagsPerPage</code> of <code>100</code> and the account
     *            has 22 resources with 10 tags each (meaning that each resource
     *            has 10 key and value pairs), the output will consist of three
     *            pages. The first page displays the first 10 resources, each
     *            with its 10 tags. The second page displays the next 10
     *            resources, each with its 10 tags. The third page displays the
     *            remaining 2 resources, each with its 10 tags.
     *            </p>
     *            <p>
     *            You can set <code>TagsPerPage</code> to a minimum of 100 items
     *            and the maximum of 500 items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesRequest withTagsPerPage(Integer tagsPerPage) {
        this.tagsPerPage = tagsPerPage;
        return this;
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     *
     * @return <p>
     *         The constraints on the resources that you want returned. The
     *         format of each resource type is
     *         <code>service[:resourceType]</code>. For example, specifying a
     *         resource type of <code>ec2</code> returns all Amazon EC2
     *         resources (which includes EC2 instances). Specifying a resource
     *         type of <code>ec2:instance</code> returns only EC2 instances.
     *         </p>
     *         <p>
     *         The string for each service name and resource type is the same as
     *         that embedded in a resource's Amazon Resource Name (ARN). Consult
     *         the <i>AWS General Reference</i> for the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For a list of service name strings, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For resource type strings, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     *         >Example ARNs</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can specify multiple resource types by using an array. The
     *         array can include up to 100 items. Note that the length
     *         constraint requirement applies to each resource type filter.
     *         </p>
     */
    public java.util.List<String> getResourceTypeFilters() {
        return resourceTypeFilters;
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     *
     * @param resourceTypeFilters <p>
     *            The constraints on the resources that you want returned. The
     *            format of each resource type is
     *            <code>service[:resourceType]</code>. For example, specifying a
     *            resource type of <code>ec2</code> returns all Amazon EC2
     *            resources (which includes EC2 instances). Specifying a
     *            resource type of <code>ec2:instance</code> returns only EC2
     *            instances.
     *            </p>
     *            <p>
     *            The string for each service name and resource type is the same
     *            as that embedded in a resource's Amazon Resource Name (ARN).
     *            Consult the <i>AWS General Reference</i> for the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For a list of service name strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For resource type strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     *            >Example ARNs</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify multiple resource types by using an array. The
     *            array can include up to 100 items. Note that the length
     *            constraint requirement applies to each resource type filter.
     *            </p>
     */
    public void setResourceTypeFilters(java.util.Collection<String> resourceTypeFilters) {
        if (resourceTypeFilters == null) {
            this.resourceTypeFilters = null;
            return;
        }

        this.resourceTypeFilters = new java.util.ArrayList<String>(resourceTypeFilters);
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypeFilters <p>
     *            The constraints on the resources that you want returned. The
     *            format of each resource type is
     *            <code>service[:resourceType]</code>. For example, specifying a
     *            resource type of <code>ec2</code> returns all Amazon EC2
     *            resources (which includes EC2 instances). Specifying a
     *            resource type of <code>ec2:instance</code> returns only EC2
     *            instances.
     *            </p>
     *            <p>
     *            The string for each service name and resource type is the same
     *            as that embedded in a resource's Amazon Resource Name (ARN).
     *            Consult the <i>AWS General Reference</i> for the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For a list of service name strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For resource type strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     *            >Example ARNs</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify multiple resource types by using an array. The
     *            array can include up to 100 items. Note that the length
     *            constraint requirement applies to each resource type filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesRequest withResourceTypeFilters(String... resourceTypeFilters) {
        if (getResourceTypeFilters() == null) {
            this.resourceTypeFilters = new java.util.ArrayList<String>(resourceTypeFilters.length);
        }
        for (String value : resourceTypeFilters) {
            this.resourceTypeFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypeFilters <p>
     *            The constraints on the resources that you want returned. The
     *            format of each resource type is
     *            <code>service[:resourceType]</code>. For example, specifying a
     *            resource type of <code>ec2</code> returns all Amazon EC2
     *            resources (which includes EC2 instances). Specifying a
     *            resource type of <code>ec2:instance</code> returns only EC2
     *            instances.
     *            </p>
     *            <p>
     *            The string for each service name and resource type is the same
     *            as that embedded in a resource's Amazon Resource Name (ARN).
     *            Consult the <i>AWS General Reference</i> for the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For a list of service name strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For resource type strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     *            >Example ARNs</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify multiple resource types by using an array. The
     *            array can include up to 100 items. Note that the length
     *            constraint requirement applies to each resource type filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesRequest withResourceTypeFilters(
            java.util.Collection<String> resourceTypeFilters) {
        setResourceTypeFilters(resourceTypeFilters);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the
     * effective tag policy. Set this to <code>true</code> to determine whether
     * resources are compliant with the tag policy and to get details.
     * </p>
     *
     * @return <p>
     *         Specifies whether to include details regarding the compliance
     *         with the effective tag policy. Set this to <code>true</code> to
     *         determine whether resources are compliant with the tag policy and
     *         to get details.
     *         </p>
     */
    public Boolean isIncludeComplianceDetails() {
        return includeComplianceDetails;
    }

    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the
     * effective tag policy. Set this to <code>true</code> to determine whether
     * resources are compliant with the tag policy and to get details.
     * </p>
     *
     * @return <p>
     *         Specifies whether to include details regarding the compliance
     *         with the effective tag policy. Set this to <code>true</code> to
     *         determine whether resources are compliant with the tag policy and
     *         to get details.
     *         </p>
     */
    public Boolean getIncludeComplianceDetails() {
        return includeComplianceDetails;
    }

    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the
     * effective tag policy. Set this to <code>true</code> to determine whether
     * resources are compliant with the tag policy and to get details.
     * </p>
     *
     * @param includeComplianceDetails <p>
     *            Specifies whether to include details regarding the compliance
     *            with the effective tag policy. Set this to <code>true</code>
     *            to determine whether resources are compliant with the tag
     *            policy and to get details.
     *            </p>
     */
    public void setIncludeComplianceDetails(Boolean includeComplianceDetails) {
        this.includeComplianceDetails = includeComplianceDetails;
    }

    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the
     * effective tag policy. Set this to <code>true</code> to determine whether
     * resources are compliant with the tag policy and to get details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeComplianceDetails <p>
     *            Specifies whether to include details regarding the compliance
     *            with the effective tag policy. Set this to <code>true</code>
     *            to determine whether resources are compliant with the tag
     *            policy and to get details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesRequest withIncludeComplianceDetails(Boolean includeComplianceDetails) {
        this.includeComplianceDetails = includeComplianceDetails;
        return this;
    }

    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag
     * policy. Set this to <code>true</code> if you are interested in retrieving
     * information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the
     * <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to exclude resources that are compliant with
     *         the tag policy. Set this to <code>true</code> if you are
     *         interested in retrieving information on noncompliant resources
     *         only.
     *         </p>
     *         <p>
     *         You can use this parameter only if the
     *         <code>IncludeComplianceDetails</code> parameter is also set to
     *         <code>true</code>.
     *         </p>
     */
    public Boolean isExcludeCompliantResources() {
        return excludeCompliantResources;
    }

    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag
     * policy. Set this to <code>true</code> if you are interested in retrieving
     * information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the
     * <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to exclude resources that are compliant with
     *         the tag policy. Set this to <code>true</code> if you are
     *         interested in retrieving information on noncompliant resources
     *         only.
     *         </p>
     *         <p>
     *         You can use this parameter only if the
     *         <code>IncludeComplianceDetails</code> parameter is also set to
     *         <code>true</code>.
     *         </p>
     */
    public Boolean getExcludeCompliantResources() {
        return excludeCompliantResources;
    }

    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag
     * policy. Set this to <code>true</code> if you are interested in retrieving
     * information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the
     * <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     *
     * @param excludeCompliantResources <p>
     *            Specifies whether to exclude resources that are compliant with
     *            the tag policy. Set this to <code>true</code> if you are
     *            interested in retrieving information on noncompliant resources
     *            only.
     *            </p>
     *            <p>
     *            You can use this parameter only if the
     *            <code>IncludeComplianceDetails</code> parameter is also set to
     *            <code>true</code>.
     *            </p>
     */
    public void setExcludeCompliantResources(Boolean excludeCompliantResources) {
        this.excludeCompliantResources = excludeCompliantResources;
    }

    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag
     * policy. Set this to <code>true</code> if you are interested in retrieving
     * information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the
     * <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeCompliantResources <p>
     *            Specifies whether to exclude resources that are compliant with
     *            the tag policy. Set this to <code>true</code> if you are
     *            interested in retrieving information on noncompliant resources
     *            only.
     *            </p>
     *            <p>
     *            You can use this parameter only if the
     *            <code>IncludeComplianceDetails</code> parameter is also set to
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesRequest withExcludeCompliantResources(Boolean excludeCompliantResources) {
        this.excludeCompliantResources = excludeCompliantResources;
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
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken() + ",");
        if (getTagFilters() != null)
            sb.append("TagFilters: " + getTagFilters() + ",");
        if (getResourcesPerPage() != null)
            sb.append("ResourcesPerPage: " + getResourcesPerPage() + ",");
        if (getTagsPerPage() != null)
            sb.append("TagsPerPage: " + getTagsPerPage() + ",");
        if (getResourceTypeFilters() != null)
            sb.append("ResourceTypeFilters: " + getResourceTypeFilters() + ",");
        if (getIncludeComplianceDetails() != null)
            sb.append("IncludeComplianceDetails: " + getIncludeComplianceDetails() + ",");
        if (getExcludeCompliantResources() != null)
            sb.append("ExcludeCompliantResources: " + getExcludeCompliantResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
        hashCode = prime * hashCode
                + ((getResourcesPerPage() == null) ? 0 : getResourcesPerPage().hashCode());
        hashCode = prime * hashCode
                + ((getTagsPerPage() == null) ? 0 : getTagsPerPage().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTypeFilters() == null) ? 0 : getResourceTypeFilters().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeComplianceDetails() == null) ? 0 : getIncludeComplianceDetails()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExcludeCompliantResources() == null) ? 0 : getExcludeCompliantResources()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcesRequest == false)
            return false;
        GetResourcesRequest other = (GetResourcesRequest) obj;

        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null
                && other.getTagFilters().equals(this.getTagFilters()) == false)
            return false;
        if (other.getResourcesPerPage() == null ^ this.getResourcesPerPage() == null)
            return false;
        if (other.getResourcesPerPage() != null
                && other.getResourcesPerPage().equals(this.getResourcesPerPage()) == false)
            return false;
        if (other.getTagsPerPage() == null ^ this.getTagsPerPage() == null)
            return false;
        if (other.getTagsPerPage() != null
                && other.getTagsPerPage().equals(this.getTagsPerPage()) == false)
            return false;
        if (other.getResourceTypeFilters() == null ^ this.getResourceTypeFilters() == null)
            return false;
        if (other.getResourceTypeFilters() != null
                && other.getResourceTypeFilters().equals(this.getResourceTypeFilters()) == false)
            return false;
        if (other.getIncludeComplianceDetails() == null
                ^ this.getIncludeComplianceDetails() == null)
            return false;
        if (other.getIncludeComplianceDetails() != null
                && other.getIncludeComplianceDetails().equals(this.getIncludeComplianceDetails()) == false)
            return false;
        if (other.getExcludeCompliantResources() == null
                ^ this.getExcludeCompliantResources() == null)
            return false;
        if (other.getExcludeCompliantResources() != null
                && other.getExcludeCompliantResources().equals(this.getExcludeCompliantResources()) == false)
            return false;
        return true;
    }
}
