package com.tanuexample;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

import com.tanuexample.ExternalAPI;
import com.tanuexample.MyService;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction(){
        ExternalAPI mockAPI = Mockito.mock(ExternalAPI.class);

        when(mockAPI.getData()).thenReturn("Hello");

        MyService service = new MyService(mockAPI);

        assertEquals("Hello", service.fetchData());
    }
}
