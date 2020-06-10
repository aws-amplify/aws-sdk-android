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

package com.amazonaws.services.codeartifact;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.codeartifact.model.*;

/**
 * Interface for accessing CodeArtifact
 * <p>
 * AWS CodeArtifact is a fully managed artifact repository compatible with
 * language-native package managers and build tools such as npm, Apache Maven,
 * and pip. You can use CodeArtifact to share packages with development teams
 * and pull packages. Packages can be pulled from both public and CodeArtifact
 * repositories. You can also create an upstream relationship between a
 * CodeArtifact repository and another repository, which effectively merges
 * their contents from the point of view of a package manager client.
 * </p>
 * <p>
 * <b>AWS CodeArtifact Components</b>
 * </p>
 * <p>
 * Use the information in this guide to help you work with the following
 * CodeArtifact components:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Repository</b>: A CodeArtifact repository contains a set of <a href=
 * "https://docs.aws.amazon.com/codeartifact/latest/ug/welcome.html#welcome-concepts-package-version"
 * >package versions</a>, each of which maps to a set of assets, or files.
 * Repositories are polyglot, so a single repository can contain packages of any
 * supported type. Each repository exposes endpoints for fetching and publishing
 * packages using tools like the <b> <code>npm</code> </b> CLI, the Maven CLI
 * (<b> <code>mvn</code> </b>), and <b> <code>pip</code> </b>. You can create up
 * to 100 repositories per AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Domain</b>: Repositories are aggregated into a higher-level entity known
 * as a <i>domain</i>. All package assets and metadata are stored in the domain,
 * but are consumed through repositories. A given package asset, such as a Maven
 * JAR file, is stored once per domain, no matter how many repositories it's
 * present in. All of the assets and metadata in a domain are encrypted with the
 * same customer master key (CMK) stored in AWS Key Management Service (AWS
 * KMS).
 * </p>
 * <p>
 * Each repository is a member of a single domain and can't be moved to a
 * different domain.
 * </p>
 * <p>
 * The domain allows organizational policy to be applied across multiple
 * repositories, such as which accounts can access repositories in the domain,
 * and which public repositories can be used as sources of packages.
 * </p>
 * <p>
 * Although an organization can have multiple domains, we recommend a single
 * production domain that contains all published artifacts so that teams can
 * find and share packages across their organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Package</b>: A <i>package</i> is a bundle of software and the metadata
 * required to resolve dependencies and install the software. CodeArtifact
 * supports <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-npm.html"
 * >npm</a>, <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-python.html"
 * >PyPI</a>, and <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-maven"
 * >Maven</a> package formats.
 * </p>
 * <p>
 * In CodeArtifact, a package consists of:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <i>name</i> (for example, <code>webpack</code> is the name of a popular npm
 * package)
 * </p>
 * </li>
 * <li>
 * <p>
 * An optional namespace (for example, <code>@types</code> in
 * <code>@types/node</code>)
 * </p>
 * </li>
 * <li>
 * <p>
 * A set of versions (for example, <code>1.0.0</code>, <code>1.0.1</code>,
 * <code>1.0.2</code>, etc.)
 * </p>
 * </li>
 * <li>
 * <p>
 * Package-level metadata (for example, npm tags)
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Package version</b>: A version of a package, such as
 * <code>@types/node 12.6.9</code>. The version number format and semantics vary
 * for different package formats. For example, npm package versions must conform
 * to the <a href="https://semver.org/">Semantic Versioning specification</a>.
 * In CodeArtifact, a package version consists of the version identifier,
 * metadata at the package version level, and a set of assets.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Upstream repository</b>: One repository is <i>upstream</i> of another when
 * the package versions in it can be accessed from the repository endpoint of
 * the downstream repository, effectively merging the contents of the two
 * repositories from the point of view of a client. CodeArtifact allows creating
 * an upstream relationship between two repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Asset</b>: An individual file stored in CodeArtifact associated with a
 * package version, such as an npm <code>.tgz</code> file or Maven POM and JAR
 * files.
 * </p>
 * </li>
 * </ul>
 * <p>
 * CodeArtifact supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AssociateExternalConnection</code>: Adds an existing external
 * connection to a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CopyPackageVersions</code>: Copies package versions from one repository
 * to another repository in the same domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateDomain</code>: Creates a domain
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateRepository</code>: Creates a CodeArtifact repository in a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteDomain</code>: Deletes a domain. You cannot delete a domain that
 * contains repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteDomainPermissionsPolicy</code>: Deletes the resource policy that
 * is set on a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeletePackageVersions</code>: Deletes versions of a package. After a
 * package has been deleted, it can be republished, but its assets and metadata
 * cannot be restored because they have been permanently removed from storage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteRepository</code>: Deletes a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteRepositoryPermissionsPolicy</code>: Deletes the resource policy
 * that is set on a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeDomain</code>: Returns a <code>DomainDescription</code> object
 * that contains information about the requested domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribePackageVersion</code>: Returns a
 * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">PackageVersionDescription</a> </code>
 * object that contains details about a package version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeRepository</code>: Returns a <code>RepositoryDescription</code>
 * object that contains detailed information about the requested repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DisposePackageVersions</code>: Disposes versions of a package. A
 * package version with the status <code>Disposed</code> cannot be restored
 * because they have been permanently removed from storage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DisassociateExternalConnection</code>: Removes an existing external
 * connection from a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetAuthorizationToken</code>: Generates a temporary authorization token
 * for accessing repositories in the domain. The token expires the authorization
 * period has passed. The default authorization period is 12 hours and can be
 * customized to any length with a maximum of 12 hours.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetDomainPermissionsPolicy</code>: Returns the policy of a resource
 * that is attached to the specified domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetPackageVersionAsset</code>: Returns the contents of an asset that is
 * in a package version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetPackageVersionReadme</code>: Gets the readme file or descriptive
 * text for a package version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetRepositoryEndpoint</code>: Returns the endpoint of a repository for
 * a specific package format. A repository has one endpoint for each package
 * format:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>npm</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>pypi</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>maven</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <code>GetRepositoryPermissionsPolicy</code>: Returns the resource policy that
 * is set on a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListDomains</code>: Returns a list of <code>DomainSummary</code>
 * objects. Each returned <code>DomainSummary</code> object contains information
 * about a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListPackages</code>: Lists the packages in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListPackageVersionAssets</code>: Lists the assets for a given package
 * version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListPackageVersionDependencies</code>: Returns a list of the direct
 * dependencies for a package version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListPackageVersions</code>: Returns a list of package versions for a
 * specified package in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListRepositories</code>: Returns a list of repositories owned by the
 * AWS account that called this method.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListRepositoriesInDomain</code>: Returns a list of the repositories in
 * a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PutDomainPermissionsPolicy</code>: Attaches a resource policy to a
 * domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PutRepositoryPermissionsPolicy</code>: Sets the resource policy on a
 * repository that specifies permissions to access it.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdatePackageVersionsStatus</code>: Updates the status of one or more
 * versions of a package.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateRepository</code>: Updates the properties of a repository.
 * </p>
 * </li>
 * </ul>
 **/
public interface CodeArtifact {

    /**
     * Overrides the default endpoint for this client
     * ("https://codeartifact.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "codeartifact.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://codeartifact.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "codeartifact.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://codeartifact.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link CodeArtifact#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>
     * Adds an existing external connection to a repository. One external
     * connection is allowed per repository.
     * </p>
     * <note>
     * <p>
     * A repository can have one or more upstream repositories, or an external
     * connection.
     * </p>
     * </note>
     * 
     * @param associateExternalConnectionRequest
     * @return associateExternalConnectionResult The response from the
     *         AssociateExternalConnection service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateExternalConnectionResult associateExternalConnection(
            AssociateExternalConnectionRequest associateExternalConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies package versions from one repository to another repository in the
     * same domain.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>.
     * You cannot specify both.
     * </p>
     * </note>
     * 
     * @param copyPackageVersionsRequest
     * @return copyPackageVersionsResult The response from the
     *         CopyPackageVersions service method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CopyPackageVersionsResult copyPackageVersions(
            CopyPackageVersionsRequest copyPackageVersionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a domain. CodeArtifact <i>domains</i> make it easier to manage
     * multiple repositories across an organization. You can use a domain to
     * apply permissions across many repositories owned by different AWS
     * accounts. An asset is stored only once in a domain, even if it's in
     * multiple repositories.
     * </p>
     * <p>
     * Although you can have multiple domains, we recommend a single production
     * domain that contains all published artifacts so that your development
     * teams can find and share packages. You can use a second pre-production
     * domain to test changes to the production domain configuration.
     * </p>
     * 
     * @param createDomainRequest
     * @return createDomainResult The response from the CreateDomain service
     *         method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a repository.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return createRepositoryResult The response from the CreateRepository
     *         service method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a domain. You cannot delete a domain that contains repositories.
     * If you want to delete a domain with repositories, first delete its
     * repositories.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return deleteDomainResult The response from the DeleteDomain service
     *         method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the resource policy set on a domain.
     * </p>
     * 
     * @param deleteDomainPermissionsPolicyRequest
     * @return deleteDomainPermissionsPolicyResult The response from the
     *         DeleteDomainPermissionsPolicy service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDomainPermissionsPolicyResult deleteDomainPermissionsPolicy(
            DeleteDomainPermissionsPolicyRequest deleteDomainPermissionsPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes one or more versions of a package. A deleted package version
     * cannot be restored in your repository. If you want to remove a package
     * version from your repository and be able to restore it later, set its
     * status to <code>Archived</code>. Archived packages cannot be downloaded
     * from a repository and don't show up with list package APIs (for example,
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html">ListackageVersions</a> </code>
     * ), but you can restore them using
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_UpdatePackageVersionsStatus.html">UpdatePackageVersionsStatus</a> </code>
     * .
     * </p>
     * 
     * @param deletePackageVersionsRequest
     * @return deletePackageVersionsResult The response from the
     *         DeletePackageVersions service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeletePackageVersionsResult deletePackageVersions(
            DeletePackageVersionsRequest deletePackageVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return deleteRepositoryResult The response from the DeleteRepository
     *         service method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the resource policy that is set on a repository. After a resource
     * policy is deleted, the permissions allowed and denied by the deleted
     * policy are removed. The effect of deleting a resource policy might not be
     * immediate.
     * </p>
     * <important>
     * <p>
     * Use <code>DeleteRepositoryPermissionsPolicy</code> with caution. After a
     * policy is deleted, AWS users, roles, and accounts lose permissions to
     * perform the repository actions granted by the deleted policy.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryPermissionsPolicyRequest
     * @return deleteRepositoryPermissionsPolicyResult The response from the
     *         DeleteRepositoryPermissionsPolicy service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteRepositoryPermissionsPolicyResult deleteRepositoryPermissionsPolicy(
            DeleteRepositoryPermissionsPolicyRequest deleteRepositoryPermissionsPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainDescription.html"
     * > <code>DomainDescription</code> </a> object that contains information
     * about the requested domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return describeDomainResult The response from the DescribeDomain service
     *         method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     * > <code>PackageVersionDescription</code> </a> object that contains
     * information about the requested package version.
     * </p>
     * 
     * @param describePackageVersionRequest
     * @return describePackageVersionResult The response from the
     *         DescribePackageVersion service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribePackageVersionResult describePackageVersion(
            DescribePackageVersionRequest describePackageVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a <code>RepositoryDescription</code> object that contains
     * detailed information about the requested repository.
     * </p>
     * 
     * @param describeRepositoryRequest
     * @return describeRepositoryResult The response from the DescribeRepository
     *         service method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeRepositoryResult describeRepository(DescribeRepositoryRequest describeRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes an existing external connection from a repository.
     * </p>
     * 
     * @param disassociateExternalConnectionRequest
     * @return disassociateExternalConnectionResult The response from the
     *         DisassociateExternalConnection service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateExternalConnectionResult disassociateExternalConnection(
            DisassociateExternalConnectionRequest disassociateExternalConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the assets in package versions and sets the package versions'
     * status to <code>Disposed</code>. A disposed package version cannot be
     * restored in your repository because its assets are deleted.
     * </p>
     * <p>
     * To view all disposed package versions in a repository, use
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html">ListackageVersions</a> </code>
     * and set the
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html#API_ListPackageVersions_RequestSyntax">status</a> </code>
     * parameter to <code>Disposed</code>.
     * </p>
     * <p>
     * To view information about a disposed package version, use
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html">ListPackageVersions</a> </code>
     * and set the
     * <code> <a href="https://docs.aws.amazon.com/API_ListPackageVersions.html#codeartifact-ListPackageVersions-response-status">status</a> </code>
     * parameter to <code>Disposed</code>.
     * </p>
     * 
     * @param disposePackageVersionsRequest
     * @return disposePackageVersionsResult The response from the
     *         DisposePackageVersions service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisposePackageVersionsResult disposePackageVersions(
            DisposePackageVersionsRequest disposePackageVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates a temporary authentication token for accessing repositories in
     * the domain. This API requires the
     * <code>codeartifact:GetAuthorizationToken</code> and
     * <code>sts:GetServiceBearerToken</code> permissions.
     * </p>
     * <note>
     * <p>
     * CodeArtifact authorization tokens are valid for a period of 12 hours when
     * created with the <code>login</code> command. You can call
     * <code>login</code> periodically to refresh the token. When you create an
     * authorization token with the <code>GetAuthorizationToken</code> API, you
     * can set a custom authorization period, up to a maximum of 12 hours, with
     * the <code>durationSeconds</code> parameter.
     * </p>
     * <p>
     * The authorization period begins after <code>login</code> or
     * <code>GetAuthorizationToken</code> is called. If <code>login</code> or
     * <code>GetAuthorizationToken</code> is called while assuming a role, the
     * token lifetime is independent of the maximum session duration of the
     * role. For example, if you call <code>sts assume-role</code> and specify a
     * session duration of 15 minutes, then generate a CodeArtifact
     * authorization token, the token will be valid for the full authorization
     * period even though this is longer than the 15-minute session duration.
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
     * >Using IAM Roles</a> for more information on controlling session
     * duration.
     * </p>
     * </note>
     * 
     * @param getAuthorizationTokenRequest
     * @return getAuthorizationTokenResult The response from the
     *         GetAuthorizationToken service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAuthorizationTokenResult getAuthorizationToken(
            GetAuthorizationTokenRequest getAuthorizationTokenRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the resource policy attached to the specified domain.
     * </p>
     * <note>
     * <p>
     * The policy is a resource-based policy, not an identity-based policy. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html"
     * >Identity-based policies and resource-based policies </a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getDomainPermissionsPolicyRequest
     * @return getDomainPermissionsPolicyResult The response from the
     *         GetDomainPermissionsPolicy service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDomainPermissionsPolicyResult getDomainPermissionsPolicy(
            GetDomainPermissionsPolicyRequest getDomainPermissionsPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an asset (or file) that is in a package. For example, for a Maven
     * package version, use <code>GetPackageVersionAsset</code> to download a
     * <code>JAR</code> file, a <code>POM</code> file, or any other assets in
     * the package version.
     * </p>
     * 
     * @param getPackageVersionAssetRequest
     * @return getPackageVersionAssetResult The response from the
     *         GetPackageVersionAsset service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetPackageVersionAssetResult getPackageVersionAsset(
            GetPackageVersionAssetRequest getPackageVersionAssetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the readme file or descriptive text for a package version. For
     * packages that do not contain a readme file, CodeArtifact extracts a
     * description from a metadata file. For example, from the
     * <code>&lt;description&gt;</code> element in the <code>pom.xml</code> file
     * of a Maven package.
     * </p>
     * <p>
     * The returned text might contain formatting. For example, it might contain
     * formatting for Markdown or reStructuredText.
     * </p>
     * 
     * @param getPackageVersionReadmeRequest
     * @return getPackageVersionReadmeResult The response from the
     *         GetPackageVersionReadme service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetPackageVersionReadmeResult getPackageVersionReadme(
            GetPackageVersionReadmeRequest getPackageVersionReadmeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the endpoint of a repository for a specific package format. A
     * repository has one endpoint for each package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getRepositoryEndpointRequest
     * @return getRepositoryEndpointResult The response from the
     *         GetRepositoryEndpoint service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRepositoryEndpointResult getRepositoryEndpoint(
            GetRepositoryEndpointRequest getRepositoryEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the resource policy that is set on a repository.
     * </p>
     * 
     * @param getRepositoryPermissionsPolicyRequest
     * @return getRepositoryPermissionsPolicyResult The response from the
     *         GetRepositoryPermissionsPolicy service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRepositoryPermissionsPolicyResult getRepositoryPermissionsPolicy(
            GetRepositoryPermissionsPolicyRequest getRepositoryPermissionsPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">DomainSummary</a> </code>
     * objects for all domains owned by the AWS account that makes this call.
     * Each returned <code>DomainSummary</code> object contains information
     * about a domain.
     * </p>
     * 
     * @param listDomainsRequest
     * @return listDomainsResult The response from the ListDomains service
     *         method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html"
     * > <code>AssetSummary</code> </a> objects for assets in a package version.
     * </p>
     * 
     * @param listPackageVersionAssetsRequest
     * @return listPackageVersionAssetsResult The response from the
     *         ListPackageVersionAssets service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListPackageVersionAssetsResult listPackageVersionAssets(
            ListPackageVersionAssetsRequest listPackageVersionAssetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the direct dependencies for a package version. The dependencies
     * are returned as <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html"
     * > <code>PackageDependency</code> </a> objects. CodeArtifact extracts the
     * dependencies for a package version from the metadata file for the package
     * format (for example, the <code>package.json</code> file for npm packages
     * and the <code>pom.xml</code> file for Maven). Any package version
     * dependencies that are not listed in the configuration file are not
     * returned.
     * </p>
     * 
     * @param listPackageVersionDependenciesRequest
     * @return listPackageVersionDependenciesResult The response from the
     *         ListPackageVersionDependencies service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListPackageVersionDependenciesResult listPackageVersionDependencies(
            ListPackageVersionDependenciesRequest listPackageVersionDependenciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * > <code>PackageVersionSummary</code> </a> objects for package versions in
     * a repository that match the request parameters.
     * </p>
     * 
     * @param listPackageVersionsRequest
     * @return listPackageVersionsResult The response from the
     *         ListPackageVersions service method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListPackageVersionsResult listPackageVersions(
            ListPackageVersionsRequest listPackageVersionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html"
     * > <code>PackageSummary</code> </a> objects for packages in a repository
     * that match the request parameters.
     * </p>
     * 
     * @param listPackagesRequest
     * @return listPackagesResult The response from the ListPackages service
     *         method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListPackagesResult listPackages(ListPackagesRequest listPackagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * > <code>RepositorySummary</code> </a> objects. Each
     * <code>RepositorySummary</code> contains information about a repository in
     * the specified AWS account and that matches the input parameters.
     * </p>
     * 
     * @param listRepositoriesRequest
     * @return listRepositoriesResult The response from the ListRepositories
     *         service method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRepositoriesResult listRepositories(ListRepositoriesRequest listRepositoriesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * > <code>RepositorySummary</code> </a> objects. Each
     * <code>RepositorySummary</code> contains information about a repository in
     * the specified domain and that matches the input parameters.
     * </p>
     * 
     * @param listRepositoriesInDomainRequest
     * @return listRepositoriesInDomainResult The response from the
     *         ListRepositoriesInDomain service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRepositoriesInDomainResult listRepositoriesInDomain(
            ListRepositoriesInDomainRequest listRepositoriesInDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets a resource policy on a domain that specifies permissions to access
     * it.
     * </p>
     * 
     * @param putDomainPermissionsPolicyRequest
     * @return putDomainPermissionsPolicyResult The response from the
     *         PutDomainPermissionsPolicy service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutDomainPermissionsPolicyResult putDomainPermissionsPolicy(
            PutDomainPermissionsPolicyRequest putDomainPermissionsPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the resource policy on a repository that specifies permissions to
     * access it.
     * </p>
     * 
     * @param putRepositoryPermissionsPolicyRequest
     * @return putRepositoryPermissionsPolicyResult The response from the
     *         PutRepositoryPermissionsPolicy service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutRepositoryPermissionsPolicyResult putRepositoryPermissionsPolicy(
            PutRepositoryPermissionsPolicyRequest putRepositoryPermissionsPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the status of one or more versions of a package.
     * </p>
     * 
     * @param updatePackageVersionsStatusRequest
     * @return updatePackageVersionsStatusResult The response from the
     *         UpdatePackageVersionsStatus service method, as returned by
     *         CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdatePackageVersionsStatusResult updatePackageVersionsStatus(
            UpdatePackageVersionsStatusRequest updatePackageVersionsStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Update the properties of a repository.
     * </p>
     * 
     * @param updateRepositoryRequest
     * @return updateRepositoryResult The response from the UpdateRepository
     *         service method, as returned by CodeArtifact.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             CodeArtifact indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRepositoryResult updateRepository(UpdateRepositoryRequest updateRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
