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

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.services.codeartifact.model.transform.*;

/**
 * Client for accessing CodeArtifact. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
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
 */
public class CodeArtifactClient extends AmazonWebServiceClient implements CodeArtifact {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all CodeArtifact exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on CodeArtifact. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public CodeArtifactClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on CodeArtifact. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to CodeArtifact (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public CodeArtifactClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CodeArtifact using
     * the specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         CodeArtifactClient client = new CodeArtifactClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public CodeArtifactClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on CodeArtifact using
     * the specified AWS account credentials and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         CodeArtifactClient client = new CodeArtifactClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to CodeArtifact (ex: proxy settings,
     *            retry counts, etc.).
     */
    public CodeArtifactClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CodeArtifact using
     * the specified AWS account credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         CodeArtifactClient client = new CodeArtifactClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public CodeArtifactClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on CodeArtifact using
     * the specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         CodeArtifactClient client = new CodeArtifactClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to CodeArtifact (ex: proxy settings,
     *            retry counts, etc.).
     */
    public CodeArtifactClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on CodeArtifact using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to CodeArtifact (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public CodeArtifactClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on CodeArtifact using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         CodeArtifactClient client = new CodeArtifactClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to CodeArtifact (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public CodeArtifactClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceQuotaExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("codeartifact.us-east-1.amazonaws.com");
        this.endpointPrefix = "codeartifact";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/codeartifact/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/codeartifact/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

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
    public AssociateExternalConnectionResult associateExternalConnection(
            AssociateExternalConnectionRequest associateExternalConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateExternalConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateExternalConnectionRequest> request = null;
        Response<AssociateExternalConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateExternalConnectionRequestMarshaller()
                        .marshall(associateExternalConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateExternalConnectionResult, JsonUnmarshallerContext> unmarshaller = new AssociateExternalConnectionResultJsonUnmarshaller();
            JsonResponseHandler<AssociateExternalConnectionResult> responseHandler = new JsonResponseHandler<AssociateExternalConnectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CopyPackageVersionsResult copyPackageVersions(
            CopyPackageVersionsRequest copyPackageVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copyPackageVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyPackageVersionsRequest> request = null;
        Response<CopyPackageVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyPackageVersionsRequestMarshaller()
                        .marshall(copyPackageVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CopyPackageVersionsResult, JsonUnmarshallerContext> unmarshaller = new CopyPackageVersionsResultJsonUnmarshaller();
            JsonResponseHandler<CopyPackageVersionsResult> responseHandler = new JsonResponseHandler<CopyPackageVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CreateDomainResult createDomain(CreateDomainRequest createDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestMarshaller().marshall(createDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDomainResult, JsonUnmarshallerContext> unmarshaller = new CreateDomainResultJsonUnmarshaller();
            JsonResponseHandler<CreateDomainResult> responseHandler = new JsonResponseHandler<CreateDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryRequest> request = null;
        Response<CreateRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryRequestMarshaller().marshall(createRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRepositoryResult, JsonUnmarshallerContext> unmarshaller = new CreateRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<CreateRepositoryResult> responseHandler = new JsonResponseHandler<CreateRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestMarshaller().marshall(deleteDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDomainResult, JsonUnmarshallerContext> unmarshaller = new DeleteDomainResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDomainResult> responseHandler = new JsonResponseHandler<DeleteDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteDomainPermissionsPolicyResult deleteDomainPermissionsPolicy(
            DeleteDomainPermissionsPolicyRequest deleteDomainPermissionsPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDomainPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainPermissionsPolicyRequest> request = null;
        Response<DeleteDomainPermissionsPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainPermissionsPolicyRequestMarshaller()
                        .marshall(deleteDomainPermissionsPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDomainPermissionsPolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteDomainPermissionsPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDomainPermissionsPolicyResult> responseHandler = new JsonResponseHandler<DeleteDomainPermissionsPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeletePackageVersionsResult deletePackageVersions(
            DeletePackageVersionsRequest deletePackageVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePackageVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePackageVersionsRequest> request = null;
        Response<DeletePackageVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePackageVersionsRequestMarshaller()
                        .marshall(deletePackageVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePackageVersionsResult, JsonUnmarshallerContext> unmarshaller = new DeletePackageVersionsResultJsonUnmarshaller();
            JsonResponseHandler<DeletePackageVersionsResult> responseHandler = new JsonResponseHandler<DeletePackageVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryRequest> request = null;
        Response<DeleteRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryRequestMarshaller().marshall(deleteRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRepositoryResult, JsonUnmarshallerContext> unmarshaller = new DeleteRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRepositoryResult> responseHandler = new JsonResponseHandler<DeleteRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteRepositoryPermissionsPolicyResult deleteRepositoryPermissionsPolicy(
            DeleteRepositoryPermissionsPolicyRequest deleteRepositoryPermissionsPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRepositoryPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryPermissionsPolicyRequest> request = null;
        Response<DeleteRepositoryPermissionsPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryPermissionsPolicyRequestMarshaller()
                        .marshall(deleteRepositoryPermissionsPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRepositoryPermissionsPolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteRepositoryPermissionsPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRepositoryPermissionsPolicyResult> responseHandler = new JsonResponseHandler<DeleteRepositoryPermissionsPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DescribeDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestMarshaller().marshall(describeDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDomainResult, JsonUnmarshallerContext> unmarshaller = new DescribeDomainResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDomainResult> responseHandler = new JsonResponseHandler<DescribeDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribePackageVersionResult describePackageVersion(
            DescribePackageVersionRequest describePackageVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePackageVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackageVersionRequest> request = null;
        Response<DescribePackageVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackageVersionRequestMarshaller()
                        .marshall(describePackageVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePackageVersionResult, JsonUnmarshallerContext> unmarshaller = new DescribePackageVersionResultJsonUnmarshaller();
            JsonResponseHandler<DescribePackageVersionResult> responseHandler = new JsonResponseHandler<DescribePackageVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeRepositoryResult describeRepository(
            DescribeRepositoryRequest describeRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRepositoryRequest> request = null;
        Response<DescribeRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRepositoryRequestMarshaller()
                        .marshall(describeRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRepositoryResult, JsonUnmarshallerContext> unmarshaller = new DescribeRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRepositoryResult> responseHandler = new JsonResponseHandler<DescribeRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DisassociateExternalConnectionResult disassociateExternalConnection(
            DisassociateExternalConnectionRequest disassociateExternalConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateExternalConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateExternalConnectionRequest> request = null;
        Response<DisassociateExternalConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateExternalConnectionRequestMarshaller()
                        .marshall(disassociateExternalConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateExternalConnectionResult, JsonUnmarshallerContext> unmarshaller = new DisassociateExternalConnectionResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateExternalConnectionResult> responseHandler = new JsonResponseHandler<DisassociateExternalConnectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DisposePackageVersionsResult disposePackageVersions(
            DisposePackageVersionsRequest disposePackageVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disposePackageVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisposePackageVersionsRequest> request = null;
        Response<DisposePackageVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisposePackageVersionsRequestMarshaller()
                        .marshall(disposePackageVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisposePackageVersionsResult, JsonUnmarshallerContext> unmarshaller = new DisposePackageVersionsResultJsonUnmarshaller();
            JsonResponseHandler<DisposePackageVersionsResult> responseHandler = new JsonResponseHandler<DisposePackageVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public GetAuthorizationTokenResult getAuthorizationToken(
            GetAuthorizationTokenRequest getAuthorizationTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAuthorizationTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthorizationTokenRequest> request = null;
        Response<GetAuthorizationTokenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthorizationTokenRequestMarshaller()
                        .marshall(getAuthorizationTokenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAuthorizationTokenResult, JsonUnmarshallerContext> unmarshaller = new GetAuthorizationTokenResultJsonUnmarshaller();
            JsonResponseHandler<GetAuthorizationTokenResult> responseHandler = new JsonResponseHandler<GetAuthorizationTokenResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public GetDomainPermissionsPolicyResult getDomainPermissionsPolicy(
            GetDomainPermissionsPolicyRequest getDomainPermissionsPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDomainPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainPermissionsPolicyRequest> request = null;
        Response<GetDomainPermissionsPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainPermissionsPolicyRequestMarshaller()
                        .marshall(getDomainPermissionsPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDomainPermissionsPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetDomainPermissionsPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetDomainPermissionsPolicyResult> responseHandler = new JsonResponseHandler<GetDomainPermissionsPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public GetPackageVersionAssetResult getPackageVersionAsset(
            GetPackageVersionAssetRequest getPackageVersionAssetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPackageVersionAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPackageVersionAssetRequest> request = null;
        Response<GetPackageVersionAssetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPackageVersionAssetRequestMarshaller()
                        .marshall(getPackageVersionAssetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPackageVersionAssetResult, JsonUnmarshallerContext> unmarshaller = new GetPackageVersionAssetResultJsonUnmarshaller();
            JsonResponseHandler<GetPackageVersionAssetResult> responseHandler = new JsonResponseHandler<GetPackageVersionAssetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public GetPackageVersionReadmeResult getPackageVersionReadme(
            GetPackageVersionReadmeRequest getPackageVersionReadmeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPackageVersionReadmeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPackageVersionReadmeRequest> request = null;
        Response<GetPackageVersionReadmeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPackageVersionReadmeRequestMarshaller()
                        .marshall(getPackageVersionReadmeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPackageVersionReadmeResult, JsonUnmarshallerContext> unmarshaller = new GetPackageVersionReadmeResultJsonUnmarshaller();
            JsonResponseHandler<GetPackageVersionReadmeResult> responseHandler = new JsonResponseHandler<GetPackageVersionReadmeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public GetRepositoryEndpointResult getRepositoryEndpoint(
            GetRepositoryEndpointRequest getRepositoryEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRepositoryEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryEndpointRequest> request = null;
        Response<GetRepositoryEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryEndpointRequestMarshaller()
                        .marshall(getRepositoryEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRepositoryEndpointResult, JsonUnmarshallerContext> unmarshaller = new GetRepositoryEndpointResultJsonUnmarshaller();
            JsonResponseHandler<GetRepositoryEndpointResult> responseHandler = new JsonResponseHandler<GetRepositoryEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public GetRepositoryPermissionsPolicyResult getRepositoryPermissionsPolicy(
            GetRepositoryPermissionsPolicyRequest getRepositoryPermissionsPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRepositoryPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryPermissionsPolicyRequest> request = null;
        Response<GetRepositoryPermissionsPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryPermissionsPolicyRequestMarshaller()
                        .marshall(getRepositoryPermissionsPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRepositoryPermissionsPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetRepositoryPermissionsPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetRepositoryPermissionsPolicyResult> responseHandler = new JsonResponseHandler<GetRepositoryPermissionsPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestMarshaller().marshall(listDomainsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDomainsResult, JsonUnmarshallerContext> unmarshaller = new ListDomainsResultJsonUnmarshaller();
            JsonResponseHandler<ListDomainsResult> responseHandler = new JsonResponseHandler<ListDomainsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListPackageVersionAssetsResult listPackageVersionAssets(
            ListPackageVersionAssetsRequest listPackageVersionAssetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPackageVersionAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackageVersionAssetsRequest> request = null;
        Response<ListPackageVersionAssetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackageVersionAssetsRequestMarshaller()
                        .marshall(listPackageVersionAssetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPackageVersionAssetsResult, JsonUnmarshallerContext> unmarshaller = new ListPackageVersionAssetsResultJsonUnmarshaller();
            JsonResponseHandler<ListPackageVersionAssetsResult> responseHandler = new JsonResponseHandler<ListPackageVersionAssetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListPackageVersionDependenciesResult listPackageVersionDependencies(
            ListPackageVersionDependenciesRequest listPackageVersionDependenciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPackageVersionDependenciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackageVersionDependenciesRequest> request = null;
        Response<ListPackageVersionDependenciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackageVersionDependenciesRequestMarshaller()
                        .marshall(listPackageVersionDependenciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPackageVersionDependenciesResult, JsonUnmarshallerContext> unmarshaller = new ListPackageVersionDependenciesResultJsonUnmarshaller();
            JsonResponseHandler<ListPackageVersionDependenciesResult> responseHandler = new JsonResponseHandler<ListPackageVersionDependenciesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListPackageVersionsResult listPackageVersions(
            ListPackageVersionsRequest listPackageVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPackageVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackageVersionsRequest> request = null;
        Response<ListPackageVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackageVersionsRequestMarshaller()
                        .marshall(listPackageVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPackageVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListPackageVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListPackageVersionsResult> responseHandler = new JsonResponseHandler<ListPackageVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListPackagesResult listPackages(ListPackagesRequest listPackagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackagesRequest> request = null;
        Response<ListPackagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackagesRequestMarshaller().marshall(listPackagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPackagesResult, JsonUnmarshallerContext> unmarshaller = new ListPackagesResultJsonUnmarshaller();
            JsonResponseHandler<ListPackagesResult> responseHandler = new JsonResponseHandler<ListPackagesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListRepositoriesResult listRepositories(ListRepositoriesRequest listRepositoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoriesRequest> request = null;
        Response<ListRepositoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoriesRequestMarshaller().marshall(listRepositoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRepositoriesResult, JsonUnmarshallerContext> unmarshaller = new ListRepositoriesResultJsonUnmarshaller();
            JsonResponseHandler<ListRepositoriesResult> responseHandler = new JsonResponseHandler<ListRepositoriesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListRepositoriesInDomainResult listRepositoriesInDomain(
            ListRepositoriesInDomainRequest listRepositoriesInDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRepositoriesInDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoriesInDomainRequest> request = null;
        Response<ListRepositoriesInDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoriesInDomainRequestMarshaller()
                        .marshall(listRepositoriesInDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRepositoriesInDomainResult, JsonUnmarshallerContext> unmarshaller = new ListRepositoriesInDomainResultJsonUnmarshaller();
            JsonResponseHandler<ListRepositoriesInDomainResult> responseHandler = new JsonResponseHandler<ListRepositoriesInDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public PutDomainPermissionsPolicyResult putDomainPermissionsPolicy(
            PutDomainPermissionsPolicyRequest putDomainPermissionsPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putDomainPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDomainPermissionsPolicyRequest> request = null;
        Response<PutDomainPermissionsPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDomainPermissionsPolicyRequestMarshaller()
                        .marshall(putDomainPermissionsPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutDomainPermissionsPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutDomainPermissionsPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutDomainPermissionsPolicyResult> responseHandler = new JsonResponseHandler<PutDomainPermissionsPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public PutRepositoryPermissionsPolicyResult putRepositoryPermissionsPolicy(
            PutRepositoryPermissionsPolicyRequest putRepositoryPermissionsPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putRepositoryPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRepositoryPermissionsPolicyRequest> request = null;
        Response<PutRepositoryPermissionsPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRepositoryPermissionsPolicyRequestMarshaller()
                        .marshall(putRepositoryPermissionsPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutRepositoryPermissionsPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutRepositoryPermissionsPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutRepositoryPermissionsPolicyResult> responseHandler = new JsonResponseHandler<PutRepositoryPermissionsPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public UpdatePackageVersionsStatusResult updatePackageVersionsStatus(
            UpdatePackageVersionsStatusRequest updatePackageVersionsStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePackageVersionsStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePackageVersionsStatusRequest> request = null;
        Response<UpdatePackageVersionsStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePackageVersionsStatusRequestMarshaller()
                        .marshall(updatePackageVersionsStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePackageVersionsStatusResult, JsonUnmarshallerContext> unmarshaller = new UpdatePackageVersionsStatusResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePackageVersionsStatusResult> responseHandler = new JsonResponseHandler<UpdatePackageVersionsStatusResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public UpdateRepositoryResult updateRepository(UpdateRepositoryRequest updateRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryRequest> request = null;
        Response<UpdateRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryRequestMarshaller().marshall(updateRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRepositoryResult, JsonUnmarshallerContext> unmarshaller = new UpdateRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRepositoryResult> responseHandler = new JsonResponseHandler<UpdateRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
