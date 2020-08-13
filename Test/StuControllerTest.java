import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class StuControllerTest {
    StuController mController;
    StudentDAO mStuDao;
    @Before
    public void setUp(){
        mController = new StuController();
        mStuDao = mock(StudentDAO.class);
        mController.setStudentDAO(mStuDao);
    }
    @Test
    public void testGetStudentInfo() {
        Student returnStudent = new Student();
        returnStudent.id = 123;
        returnStudent.name = "mock-user";
        when(mStuDao.getStudentFromDB(anyInt())).thenReturn(returnStudent);
        Student student = mController.getStudentInfo(123);
        assertEquals(student.id, 123);
        assertEquals(student.name, "mock-user");
    }
}
