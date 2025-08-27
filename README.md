# Westminster Skin Consultation Manager

**Westminster Skin Consultation Manager** is a Java Swing-based desktop application designed to manage patient consultations in a skin clinic setting. This project provides a comprehensive and user-friendly graphical interface for scheduling consultations, viewing doctor profiles, maintaining patient records, managing secure attachments, and more.

> **Note:** This project is developed as part of the coursework for the undergraduate Software Engineering program.

***

## Key Features

- **Doctor Information Management:**  
  View detailed lists and profiles of available doctors, including their specialties, contact details, and licensing info[1][2][3].

- **Consultation Booking:**  
  Easily schedule new consultations by selecting the doctor, time slot, and entering patient details.

- **Secure Data Storage:**  
  Patient and consultation data are serialized and securely saved to local files for persistence between sessions[4][5][6].

- **Attachment Encryption:**  
  Patient notes and uploaded images are encrypted for privacy during storage and retrieval[7][5][4].

- **Interactive GUI:**  
  Modern, user-friendly interface using Java Swing, with visual cues and icons to enhance usability[8][4][1][9].

- **Validation and Error Handling:**  
  Comprehensive input validation, duplicate check, and real-time feedback for user actions.

- **Coursework Quality:**  
  Developed with academic rigor and code readability as part of a university software engineering module.

***

## Screenshots

> Add screenshots of home page, booking window, doctor list table, etc. here for extra appeal.

***

## Getting Started

### Prerequisites

- Java SE 8 or higher
- (Optional) Java IDE such as IntelliJ IDEA, Eclipse, or NetBeans

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/westminster-skin-consultation-manager.git
   cd westminster-skin-consultation-manager
   ```

2. **Add project images**
   - Place required images (`.jpeg`, `.png`, `.jpg` as named in code) in the project root or a relevant subdirectory.

3. **Compile the source code**
   ```bash
   javac *.java
   ```

4. **Run the application**
   ```bash
   java homePageGUI
   ```

***

## Project Structure

| File/Class                   | Purpose                                                      |
|------------------------------|--------------------------------------------------------------|
| `homePageGUI.java`           | Main entry GUI; navigation dashboard                         |
| `ConsultationGUI.java`       | Consultation booking interface                               |
| `AppointmentsGUI.java`       | Lists and manages consultation appointments                  |
| `DoctorListGUI.java`         | Displays a sortable table of all doctors                     |
| `AppointmentTableModel.java` | Data model for appointments table                            |
| `ListTableModel.java`        | Data model for doctors table                                 |
| `Doctor.java`, `Patient.java`, `Consultation.java` | Entity classes for core data             |
| `Encryption.java`            | Handles simple encryption/decryption of notes and files      |
| `datePicker.java`            | Custom date picker component                                 |

***

## Coursework Statement

> This application was developed as part of the **Undergraduate Software Engineering coursework** for [Your University Name]. The aim was to demonstrate practical object-oriented design, GUI development, and secure data management in a real-world healthcare scenario.

***

## Credits

- Developed by Banula Perera (2025)
- Special thanks to [Your University Name] and the Software Engineering Faculty

***

## License

This project is for educational purposes. See [LICENSE](LICENSE) for more information if provided.

***

**Feel free to fork, star, or contribute to enhancements as a learning exercise!**

***

This README template should provide clarity, professionalism, and appeal for academic and open-source readers alike, and is tailored for a coursework submission context[8][6][5][4][10][3][1][7][9][2].

Sources
[1] DoctorListGUI.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/763cfbf0-e657-48e9-b48d-1b4f5ac2601d/DoctorListGUI.java
[2] ListTableModel.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/a44db398-a272-42a1-aab3-6d918e18dd25/ListTableModel.java
[3] Doctor.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/d89842e1-d463-4a05-8671-e8dcb1394ad4/Doctor.java
[4] ConsultationGUI.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/1148a73c-b04e-473c-89b0-242c612eb514/ConsultationGUI.java
[5] Consultation.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/d4983f12-93fe-4aa8-b28b-aa66fa6a022c/Consultation.java
[6] AppointmentTableModel.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/3b40f29e-3795-4f96-8a19-cec678c20576/AppointmentTableModel.java
[7] Encryption.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/24f1323d-e883-4839-a427-32d330d6dba2/Encryption.java
[8] AppointmentsGUI.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/ba9e23fb-46c5-41ca-844b-bd2a16b0a975/AppointmentsGUI.java
[9] homePageGUI.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/a09fc3dd-ace2-4e25-9fe8-cb966015dbdb/homePageGUI.java
[10] datePicker.java https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/74757090/d33a73ac-4181-4b3e-9fa6-bd17758ee2d5/datePicker.java
