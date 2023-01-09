import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class WestminsterSkinConsultationManagerTest {
    private PrintStream printStream = System.out;
    private ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    WestminsterSkinConsultationManager westminsterSkinConsultationManager = new WestminsterSkinConsultationManager();
    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(printStream);
    }

    @Test
    @Order(1)
    void loadFromFile_01(){
        Assertions.assertFalse(WestminsterSkinConsultationManager.list.size() > 0);
        westminsterSkinConsultationManager.loadFromFile();
        Assertions.assertTrue(WestminsterSkinConsultationManager.list.size() > 0);
    }

    @Test
    @Order(2)
    void addDoctor_01() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("John\nWalker\n0710467608\n1\n14/02/1978\n002\n1".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        westminsterSkinConsultationManager.addNewDoc(scanner);
        Assertions.assertTrue(byteArrayOutputStream.toString().trim().contains("Doctor added successfully!"));
    }

    @Test
    @Order(3)
    void addDoctor_02(){
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("John\nWalker\n0710467608\n3".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        westminsterSkinConsultationManager.addNewDoc(scanner);
        Assertions.assertTrue(byteArrayOutputStream.toString().trim().contains("You entered the wrong selection\nReturning to the main menu......."));
    }

    @Test
    @Order(4)
    void addDoctor_03(){
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("John\nWalker\n0710467608\n1\n14".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        westminsterSkinConsultationManager.addNewDoc(scanner);
        Assertions.assertTrue(byteArrayOutputStream.toString().trim().contains("Format of your entered value is invalid!\nReturning to the main menu......."));
    }

    @Test
    @Order(5)
    void saveInFile() {
        westminsterSkinConsultationManager.saveInFile();
        Assertions.assertEquals("Saved to file!", byteArrayOutputStream.toString().trim());
    }
}