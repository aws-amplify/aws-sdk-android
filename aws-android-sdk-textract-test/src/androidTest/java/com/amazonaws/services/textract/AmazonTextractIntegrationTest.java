/*
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.amazonaws.services.textract.model.AnalyzeDocumentRequest;
import com.amazonaws.services.textract.model.AnalyzeDocumentResult;
import com.amazonaws.services.textract.model.Block;
import com.amazonaws.services.textract.model.Document;
import com.amazonaws.testutils.AWSTestBase;
import com.amazonaws.util.IOUtils;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AmazonTextractIntegrationTest extends AWSTestBase {

    private AmazonTextractClient textractClient;

    /**
     * Package name in testconfiguration.json
     */
    protected static final String PACKAGE_NAME = InstrumentationRegistry.getTargetContext().
            getResources().getString(R.string.package_name);

    public static JSONObject getPackageConfigure() {
        return getPackageConfigure(PACKAGE_NAME);
    }

    @Before
    public void setUp() {
        setUpCredentials();
        textractClient = new AmazonTextractClient(credentials);
    }

    @Test
    /**
     * Test that a document can be analyzed through Textract from bytes.
     *
     * @throws IOException in the event the test document cannot be accessed from disk
     */
    public void testAnalyzeDocument() throws IOException {
        final String fileName = "document.png";
        final Context context = InstrumentationRegistry.getInstrumentation().getContext();
        final InputStream inputStream = context.getAssets().open(fileName);
        final ByteBuffer imageBytes = ByteBuffer.wrap(IOUtils.toByteArray(inputStream));
        final Document document = new Document().withBytes(imageBytes);

        AnalyzeDocumentRequest request = new AnalyzeDocumentRequest()
                .withFeatureTypes("TABLES", "FORMS")
                .withDocument(document);

        AnalyzeDocumentResult result = textractClient.analyzeDocument(request);
        List<Block> blocks = result.getBlocks();

        assertEquals(new Integer(1), result.getDocumentMetadata().getPages());
        assert blocks.size() > 0;
    }
}
