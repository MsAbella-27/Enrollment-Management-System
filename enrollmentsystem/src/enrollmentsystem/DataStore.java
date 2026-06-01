package enrollmentsystem;

// =====================================================
// DATASTORE CLASS
// TEMPORARY STORAGE BEFORE MYSQL
// =====================================================

public class DataStore {

    // =====================================================
    // ACCOUNT INFORMATION
    // =====================================================

    public static String savedUsername = "";

    public static String savedPassword = "";

    // =====================================================
    // PERSONAL INFORMATION
    // =====================================================

    public static String fullName = "";

    public static String age = "";

    public static String gender = "";

    public static String religion = "";

    public static String address = "";

    public static String contactNumber = "";

    public static String email = "";

    // =====================================================
    // ACADEMIC INFORMATION
    // =====================================================

    public static String schoolName = "";

    public static String strand = "";

    public static String generalAverage = "";

    public static String graduationYear = "";

    public static String honors = "";

    public static String achievements = "";

    // =====================================================
    // PROGRAM SELECTION
    // =====================================================

    public static String firstChoice = "";

    public static String secondChoice = "";

    public static String thirdChoice = "";

    // =====================================================
    // STUDENT STATUS
    // =====================================================

    public static String enrollmentStatus =
            "PENDING";

    // =====================================================
    // AUTO GENERATED INFORMATION
    // =====================================================

    public static String studentID =
            "2026-" + (int)(Math.random() * 9000 + 1000);

    public static String set = "SET A";

    public static String academicYear =
            "2026 - 2027";

    public static String semester =
            "1st Semester";

    // =====================================================
    // INSTITUTE
    // =====================================================

    public static String institute = "";

    // =====================================================
    // SUBJECT INFORMATION
    // =====================================================

    public static String subjectCode = "";

    public static String subjectName = "";

    public static String professor = "";

    public static String schedule = "";

    public static String units = "";
    static Object currentStudent;

}