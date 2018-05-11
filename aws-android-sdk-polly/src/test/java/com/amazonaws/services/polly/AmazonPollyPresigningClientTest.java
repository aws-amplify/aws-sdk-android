/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.polly.internal.AmazonPollyCustomPresigner;
import com.amazonaws.services.polly.internal.AmazonPollyCustomRequest;
import com.amazonaws.services.polly.model.OutputFormat;
import com.amazonaws.services.polly.model.SynthesizeSpeechPresignRequest;
import com.amazonaws.services.polly.model.TextType;
import com.amazonaws.services.polly.model.VoiceId;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AmazonPollyPresigningClientTest {

    private static final String HOST = "localhost";
    private static final String SCHEME = "http";
    private static final String RESOURCE_PATH = "/v1/speech";
    private static final int PORT = 9080;
    private static final String SERVICE_NAME = "polly";

    private static final String ACCESS_KEY = "access-key";
    private static final String SECRET_KEY = "secret-key";

    private static final String INPUT_TEXT = "<speak>Mary has a little lamb</speak>";
    private static final String SSML_TEXT_TYPE = TextType.Ssml.toString();
    private static final String SALLI_VOICE_ID = VoiceId.Salli.toString();
    private static final String MP3_OUTPUT_FORMAT = OutputFormat.Mp3.toString();
    private static final String LEXICON_NAME_1 = "lexiconName1";
    private static final String LEXICON_NAME_2 = "lexiconName2";

    private static final String TEXT_KEY = "Text";
    private static final String TEXT_TYPE_KEY = "TextType";
    private static final String VOICE_ID_KEY = "VoiceId";
    private static final String OUTPUT_FORMAT_KEY = "OutputFormat";
    private static final String LEXICON_NAME_KEY = "LexiconNames";
    private static final String X_AMZN_ALGORITHM_KEY = "X-Amz-Algorithm";
    private static final String X_AMZN_DATE_KEY = "X-Amz-Date";
    private static final String X_AMZN_SIGNED_HEADERS_KEY = "X-Amz-SignedHeaders";
    private static final String X_AMZN_EXPIRES_KEY = "X-Amz-Expires";
    private static final String X_AMZN_CREDENTIAL_KEY = "X-Amz-Credential";
    private static final String X_AMZN_SIGNATURE_KEY = "X-Amz-Signature";

    private Set<String> expectedQueryParameterKeys;
    private Map<String, String> expectedQueryParameterPairs;

    private AmazonPollyPresigningClient client;
    private SynthesizeSpeechPresignRequest request;
    private AWSCredentials credentials;
    private AWSCredentialsProvider credentialsProvider;

    @Before
    public void setup() {
        expectedQueryParameterKeys = new HashSet<String>(Arrays.asList(
                TEXT_KEY, TEXT_TYPE_KEY, VOICE_ID_KEY, OUTPUT_FORMAT_KEY, X_AMZN_ALGORITHM_KEY, X_AMZN_DATE_KEY,
                X_AMZN_SIGNED_HEADERS_KEY, X_AMZN_EXPIRES_KEY, X_AMZN_CREDENTIAL_KEY, X_AMZN_SIGNATURE_KEY
        ));

        expectedQueryParameterPairs = Collections.unmodifiableMap(new HashMap<String, String>() {
            {
                put(TEXT_KEY, INPUT_TEXT);
                put(TEXT_TYPE_KEY, SSML_TEXT_TYPE);
                put(VOICE_ID_KEY, SALLI_VOICE_ID);
                put(OUTPUT_FORMAT_KEY, MP3_OUTPUT_FORMAT);
            }
        });
        credentials = mock(AWSCredentials.class);
        when(credentials.getAWSAccessKeyId()).thenReturn(ACCESS_KEY);
        when(credentials.getAWSSecretKey()).thenReturn(SECRET_KEY);

        credentialsProvider = mock(AWSCredentialsProvider.class);
        when(credentialsProvider.getCredentials()).thenReturn(credentials);

        client = new AmazonPollyPresigningClient(credentialsProvider);
        client.setServiceNameIntern(SERVICE_NAME);
        client.setRegion(Region.getRegion(Regions.US_EAST_1));
        client.setEndpoint(String.format("%s://%s:%d", SCHEME, HOST, PORT));

        request = new SynthesizeSpeechPresignRequest()
                .withText(INPUT_TEXT)
                .withTextType(SSML_TEXT_TYPE)
                .withOutputFormat(MP3_OUTPUT_FORMAT)
                .withVoiceId(SALLI_VOICE_ID);
    }

    @Test
    public void testGetPresignedUrl() throws URISyntaxException {
        URI uri = client.getPresignedSynthesizeSpeechUrl(request).toURI();

        verifyCredentialsMocks();
        assertBasicUriValues(uri);
        List<NameValuePair> params = URLEncodedUtils.parse(uri, "UTF-8");
        for (NameValuePair pair : params) {
            Assert.assertTrue("Unexpected query parameter: " + pair.getName(),
                    expectedQueryParameterKeys.contains(pair.getName()));
            expectedQueryParameterKeys.remove(pair.getName());
            if (expectedQueryParameterPairs.containsKey(pair.getName())) {
                Assert.assertEquals(expectedQueryParameterPairs.get(pair.getName()), pair.getValue());
            }
        }
        Assert.assertTrue("Missing expected parameters: " + expectedQueryParameterKeys.toString(),
                expectedQueryParameterKeys.isEmpty());
    }
    
    @Test
    public void testGetPresignedUrlEncodedParameters() throws URISyntaxException {
        AmazonPollyCustomRequest<SynthesizeSpeechPresignRequest> req = new AmazonPollyCustomRequest("polly");
        req.addParameter("test-key", "test-value");        
        Assert.assertNotNull(AmazonPollyCustomPresigner.encodeParameters(req));
    }

    @Test
    public void testGetPresignedUrlWithOneLexicon() throws URISyntaxException {
        List<String> lexiconsNamesExpected = new ArrayList<String>(Arrays.asList(LEXICON_NAME_1));
        request.setLexiconNames(lexiconsNamesExpected);
        expectedQueryParameterKeys.add(LEXICON_NAME_KEY);
        URI uri = client.getPresignedSynthesizeSpeechUrl(request).toURI();

        verifyCredentialsMocks();
        assertBasicUriValues(uri);
        List<NameValuePair> params = URLEncodedUtils.parse(uri, "UTF-8");
        for (NameValuePair pair : params) {
            Assert.assertTrue("Unexpected query parameter: " + pair.getName(),
                    expectedQueryParameterKeys.contains(pair.getName()));
            if (LEXICON_NAME_KEY.equals(pair.getName())) {
                Assert.assertTrue("Unexpected lexicon name: " + pair.getValue(),
                        lexiconsNamesExpected.contains(pair.getValue()));
                lexiconsNamesExpected.remove(pair.getValue());
            }
        }
        Assert.assertTrue("Not all lexicons names were included " + lexiconsNamesExpected.toString(),
                lexiconsNamesExpected.isEmpty());
    }

    @Test
    public void testGetPresignedUrlWithMultipleLexicons() throws URISyntaxException {
        List<String> lexiconsNamesExpected = new ArrayList<String>(
                Arrays.asList(LEXICON_NAME_1, LEXICON_NAME_2));
        request.setLexiconNames(lexiconsNamesExpected);
    }

    @Test
    public void testGetPresignedUrlWithoutTextType() throws URISyntaxException {
        request.setTextType((String) null);
        expectedQueryParameterKeys.remove(TEXT_TYPE_KEY);
        URI uri = client.getPresignedSynthesizeSpeechUrl(request).toURI();

        verifyCredentialsMocks();
        assertBasicUriValues(uri);
        List<NameValuePair> params = URLEncodedUtils.parse(uri, "UTF-8");
        for (NameValuePair pair : params) {
            Assert.assertTrue("Unexpected query parameter: " + pair.getName(),
                    expectedQueryParameterKeys.contains(pair.getName()));
            expectedQueryParameterKeys.remove(pair.getName());
        }
        Assert.assertTrue("Missing expected parameters: " + expectedQueryParameterKeys.toString(),
                expectedQueryParameterKeys.isEmpty());
    }

    @Test
    public void testGetPresignedUrlWithRequestCredentialsProvider() throws URISyntaxException {
        AWSCredentialsProvider requestCredentialsProvider = mock(AWSCredentialsProvider.class);
        when(requestCredentialsProvider.getCredentials()).thenReturn(credentials);
        request.setRequestCredentials(requestCredentialsProvider.getCredentials());
        URI uri = client.getPresignedSynthesizeSpeechUrl(request).toURI();

        verify(requestCredentialsProvider).getCredentials();
        assertBasicUriValues(uri);
    }

    private void verifyCredentialsMocks() {
        verify(credentialsProvider).getCredentials();
        verify(credentials).getAWSAccessKeyId();
        verify(credentials).getAWSSecretKey();
    }

    private void assertBasicUriValues(URI uri) {
        Assert.assertEquals(SCHEME, uri.getScheme());
        Assert.assertEquals(HOST, uri.getHost());
        Assert.assertEquals(PORT, uri.getPort());
        Assert.assertEquals(RESOURCE_PATH, uri.getPath());
    }
}
