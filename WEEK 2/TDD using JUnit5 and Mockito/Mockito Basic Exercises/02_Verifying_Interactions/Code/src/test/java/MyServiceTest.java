import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class MyServiceTest {

    @Test
    public void testVerifyInteraction(){
        ExternalAPI mockAPI = mock(ExternalAPI.class);

        MyService service = new MyService(mockAPI);
        service.fetchData();

        verify(mockAPI).getData();
    }
}