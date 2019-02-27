
package com.amazonaws.services.rekognition;

import android.support.test.InstrumentationRegistry;

import com.amazonaws.services.rekognition.model.DetectLabelsRequest;
import com.amazonaws.services.rekognition.model.DetectLabelsResult;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.Label;
import com.amazonaws.testutils.AWSTestBase;
import com.amazonaws.util.IOUtils;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;


public class RekognitionIntegrationTest extends AWSTestBase {

    public static final String SAMPLE_IMAGE = "canyon.jpg";

    private static AmazonRekognition rekognition;

    @BeforeClass
    public static void setUp() {
        setUpCredentials();
        rekognition = new AmazonRekognitionClient(credentials);
    }

    @Test
    public void testCanyonImage() throws IOException {
        InputStream imageInputStream = InstrumentationRegistry.getContext().getResources().getAssets().open(SAMPLE_IMAGE);
        final byte[] imageArray = IOUtils.toByteArray(imageInputStream);

        final DetectLabelsRequest detectLabelsRequest = new DetectLabelsRequest()
                .withImage(new Image().withBytes(ByteBuffer.wrap(imageArray)));

        final DetectLabelsResult result = rekognition.detectLabels(detectLabelsRequest);
        final List<Label> labels = result.getLabels();
        for (final Label label : labels) {
            System.out.println(label.getName() + " " + label.getConfidence());
        }
    }

}
