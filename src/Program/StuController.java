public class StuController {
    private StudentDAO mStudentDAO;
    
    public Student getStudentInfo(int sid) {
        Student student = null;
        if (mStudentDAO != null) {
            student = mStudentDAO.getStudentFromDB(sid);
        }
        return student;
    }
    public void setStudentDAO(StudentDAO dao) {
        this.mStudentDAO = dao;
    }
}
