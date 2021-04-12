package org.apache.cxf.attachment;

import java.util.Collections;

import javax.activation.DataHandler;
import javax.activation.DataSource;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AttachmentDataSourceTest {

    private static final String ctParam = "ctParam";
    byte[] data = "123,456,789,123,456,789".getBytes();
    private InputStream inParam1 = new ByteArrayInputStream(data);
  
    @Test
    public void testGetName() {
        try {
            DataSource ds = new AttachmentDataSource(ctParam, inParam1);
            ds.setName("ctParam");
            assertEquals("ctParam",ds.getName());
        } catch (IOException e) {
            String message = e.getMessage();
            assertTrue(message, message.contains(ctParam));
            }
    }
    
    /*@Test
    public void testGetId() {
        String testId = "2t3";
        DataSource ds = new AttachmentDataSource(ctParam, inParam1);
        ds.setId(testId);
        assertEquals("2t3",ds.getId());
    }*/
    }
